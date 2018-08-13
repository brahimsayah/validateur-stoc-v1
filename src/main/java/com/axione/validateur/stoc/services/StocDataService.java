package com.axione.validateur.stoc.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import com.axione.validateur.stoc.controllers.export.ExportCmdService;
import com.axione.validateur.stoc.dto.PriseDto;
import com.axione.validateur.stoc.mapper.PriseDTOMapper;
import com.axione.validateur.stoc.model.TAdresseAdr;
import com.axione.validateur.stoc.model.TPrisePri;
import com.axione.validateur.stoc.repositories.AdresseRepository;
import com.axione.validateur.stoc.repositories.PriseRepository;

@Service
public class StocDataService {
	private SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMDD");

	@Value("${config.temp.cmd.file.path}")
	private String tempFolderPath;

	@Value("${config.enable.prise.status.update}")
	private String enablePriseStatusUpdate ;
	
	@Value("${config.headers.export.p12.csv}")
	private String headersExportP12 ;
	
	@Value("${config.headers.export.p13.csv}")
	private String headersExportP13 ;
	
	@Value("${config.offreAccesCommandee.default}")
    private String offreAccesCommandee;
	
	@Autowired
	private AdresseRepository adresseRepository;
	
	@Autowired
	private PriseRepository priseRepository;
	
	public TAdresseAdr getAdressParId(Integer id){
		return adresseRepository.findOne(id);
		
	}
	
	public TPrisePri getPriseParId(Integer id){
		return priseRepository.findOne(id);
		
	}

	
	public List<TPrisePri> findByStatutNetDesigner(String statutNetDesigner){//"en conception"	
		return priseRepository.findByStatutNetDesigner(statutNetDesigner);
	}

	public List<PriseDto> generateCommand(String priseOn, String referencePto,String TypeCmdRetenu, String nbrCmd) {
		List<PriseDto> priseDtos=new ArrayList<PriseDto>();
		List<TPrisePri> prises =findByStatutNetDesigner("en conception");
		if(prises != null){
			PriseDTOMapper mapper = new PriseDTOMapper();
			for(TPrisePri p : prises){
				PriseDto dto=mapper.fromPrise(p);
				dto.setReferenceCommandePriseInterneOC("TEST"+generateRefCmdPriseIntOc());
				dto.setPriseExistante(priseOn);
				dto.setTypeCommandeDemande(TypeCmdRetenu);
				dto.setOffreAccesCommandee(this.offreAccesCommandee);
				priseDtos.add(dto);
				p.setStatutNetDesigner("en exploitation");
			}
			if("oui".equals(enablePriseStatusUpdate))
				priseRepository.save(prises);
			
		}
		return priseDtos;
	}
	
	private String generateRefCmdPriseIntOc(){
		return sdf.format(new Date())+"_"+(new Date()).getTime();
	}
	
	public String getCmdFileName(String oc, String oi, String format){
		return oi+"_"+oc+"-CMD_ACCESS_"+format+"_"+ sdf.format(new Date())+"_"+(new Date()).getTime();
	}
	
	public String createCmdFile(String oc, String oi, String format, List<PriseDto> prises) {

  	  
        String cmdFileName = getCmdFileName(oc, oi, format)+".csv";
        String filePath =tempFolderPath + cmdFileName;
		try {

			File directory = new File(tempFolderPath);
			if (!directory.exists()) {
				directory.mkdirs();
			}
			
			String[] headers=null;
			
			if ("V1.2".equals(format)) {
				 headers = headersExportP12.split(";");
			}else if("V1.3".equals(format)){
				 headers = headersExportP13.split(";");
			}
			
			ExportCmdService<PriseDto> export = new ExportCmdService<PriseDto>(headers,prises);
			export.export(filePath);
			
		} catch (Exception e) {
			filePath="";
			e.printStackTrace();
		}finally {

        }
		return filePath;
	}
}
