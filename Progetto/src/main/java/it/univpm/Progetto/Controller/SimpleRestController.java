package it.univpm.Progetto.Controller;

import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.net.MediaType;

import it.univpm.Progetto.Connect_and_Service.Dataservice;
import it.univpm.Progetto.Exceptions.MinSizeException;
import it.univpm.Progetto.Exceptions.StatFormatException;
import it.univpm.Progetto.Modelli.Folder;
import it.univpm.Progetto.Modelli.MetaData;
import it.univpm.Progetto.Stats.Stats;

@RestController
public class SimpleRestController {
	
	@Autowired
	private Dataservice dataservice;
	
	   @GetMapping("/GetFiles")
	    public     ArrayList<Folder> GetFiles() throws org.json.simple.parser.ParseException, ParseException, IOException, org.apache.tomcat.util.json.ParseException{
	        return new ArrayList<Folder>(dataservice.Display_Data());
	    }
	   @PostMapping("/StatsSize")
	   public Stats[] Display_stats(@RequestBody Long p) throws MinSizeException {
		   return dataservice.createStatSize(p);
	   }
	   @PostMapping("/StatsType")
	   public Stats[] Display_stats_type(@RequestBody String d) throws StatFormatException {
		   return dataservice.createStatType(d);
	   }
	   @PostMapping("/Metadata")
	   public MetaData[] DisplayMeta() {
		   return dataservice.Display_Metadata();
	   }   
	
}
