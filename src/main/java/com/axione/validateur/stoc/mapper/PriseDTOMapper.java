package com.axione.validateur.stoc.mapper;

import com.axione.validateur.stoc.dto.PriseDto;
import com.axione.validateur.stoc.model.TAdresseAdr;
import com.axione.validateur.stoc.model.TBatimentBat;
import com.axione.validateur.stoc.model.TEscalierEsc;
import com.axione.validateur.stoc.model.TEtageEta;
import com.axione.validateur.stoc.model.TLocalLoc;
import com.axione.validateur.stoc.model.TPrisePri;

public class PriseDTOMapper {
	
	public PriseDto fromPrise(TPrisePri prise){
		PriseDto dto = new PriseDto();
		dto.setReferencePrise(prise.getRef());
		if(prise.getTLocalLocs() !=null && prise.getTLocalLocs().size() >0){
			TLocalLoc locale = prise.getTLocalLocs().get(0);
			TEtageEta etage = locale.getTEtageEta();
				if(etage != null){
					dto.setEtage(etage.getRef());
					TEscalierEsc esc = etage.getTEscalierEsc();
					if(esc != null){
						dto.setEscalier(esc.getRef());
						TBatimentBat bat = esc.getTBatimentBat();
						if(bat!=null){
							dto.setBatiment(bat.getRef());
							TAdresseAdr adr = bat.getTAdresseAdr();
							if(adr != null){
								dto.setCommuneImmeuble(adr.getCommune());
								dto.setCodeInseeImmeuble(adr.getCodeInsee());
								dto.setCodeVoieRivoliImmeuble(adr.getCodeRivoli());
								dto.setNumeroVoieImmeuble(adr.getNumVoie());
								dto.setComplementNumeroVoieImmeuble(adr.getComplVoie());
								dto.setTypeVoieImmeuble(adr.getTypeVoie());
								// LibelleVoieImmeuble c'est le nom de voie
								dto.setLibelleVoieImmeuble(adr.getNomVoie());
								dto.setCodeAdresseImmeuble(adr.getCodeHexacleVoie());
							}
						}
					}
				}
		}	
	
		return dto;
		
	}

}
