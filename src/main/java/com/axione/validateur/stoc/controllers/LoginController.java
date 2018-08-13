package com.axione.validateur.stoc.controllers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import com.axione.validateur.stoc.dto.PriseDto;

import com.axione.validateur.stoc.model.TPrisePri;
import com.axione.validateur.stoc.services.StocDataService;

@Controller
@SessionAttributes( value="cmdFileName", types={String.class} )
public class LoginController {

	@Value("${config.username}")
	private String username;
	@Value("${config.password}")
	private String password;
	
	@Autowired
	private StocDataService stocDataService;

   @RequestMapping("/")
   public String index() {
	   
	   TPrisePri p = stocDataService.getPriseParId(514957);
	      if(p != null){
	    	  System.out.println("*******************" + p.getRef());
	      }

      return "login";
   }

   @RequestMapping(value="search", method = RequestMethod.POST)
   public String login(@RequestParam("username") String username,@RequestParam("password") String password,Model model) {

      return "commande";
   }
   
   @RequestMapping(value="commande", method = RequestMethod.POST)
   public String login(@RequestParam("priseOn") String priseOn,@RequestParam("referencePto") String referencePto,@RequestParam("TypeCmdRetenu") String TypeCmdRetenu,
		   @RequestParam("oc") String oc,@RequestParam("oi") String oi,@RequestParam("nbrCmd") String nbrCmd,@RequestParam("format") String format,
		   Model model) {
	   List<PriseDto> prises = stocDataService.generateCommand( priseOn,  referencePto, TypeCmdRetenu,nbrCmd);
	      if(prises != null){
	    	  model.addAttribute("prises", prises);
	    	  model.addAttribute("cmdFileName",stocDataService.createCmdFile(oc, oi, format,prises));	    	  
	      }else{
	    	  model.addAttribute("prises", new ArrayList());
	      }
	   
      return "commande";
   }
   
   @RequestMapping(value = "files/download", method = RequestMethod.POST )
   public void getFile(Model model, HttpServletResponse response) {
	  String path = (String)model.asMap().get("cmdFileName");
	  
	  try {
		File file = new File(path);
		   String headerKey = "Content-Disposition";
	        String headerValue = String.format("attachment; filename=\"%s\"",
	                file.getName());
	        response.setContentType("text/csv");
	        response.setHeader(headerKey, headerValue);
	        response.setContentLength((int)file.length());
	        InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
	        //Copy bytes from source to destination(outputstream in this example), closes both streams.
	        FileCopyUtils.copy(inputStream, response.getOutputStream());
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   
   
   
   
   
}
