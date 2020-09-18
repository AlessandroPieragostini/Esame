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
import it.univpm.Progetto.Modelli.Element;
import it.univpm.Progetto.Modelli.MetaData;
import it.univpm.Progetto.Stats.Stats;

/**
 * The class used to download and parse all the data from the API
 * @author Alessandro Pieragostini
 *
 */

@RestController
public class SimpleRestController {
	/**
	 * The dataservices that provides all the request
	 */
	@Autowired
	private Dataservice dataservice;

	/**
	 * The root that shows all files
	 * 
	 * @return
	 * @throws org.json.simple.parser.ParseException
	 * @throws ParseException
	 * @throws IOException
	 * @throws org.apache.tomcat.util.json.ParseException
	 */
	@GetMapping("/GetFiles")
	public ArrayList<Element> GetFiles() throws org.json.simple.parser.ParseException, ParseException, IOException,
			org.apache.tomcat.util.json.ParseException {
		return new ArrayList<Element>(dataservice.Display_Data());
	}

	/**
	 * The root that shows size statistics
	 * @param p
	 * @return
	 * @throws MinSizeException
	 */
	@PostMapping("/StatsSize")
	public Stats[] Display_stats(@RequestBody Long p) throws MinSizeException {
		return dataservice.createStatSize(p);
	}
	
	/**
	 * The root that shows type statistics
	 * @param d
	 * @return
	 * @throws StatFormatException
	 */
	@PostMapping("/StatsType")
	public Stats[] Display_stats_type(@RequestBody String d) throws StatFormatException {
		return dataservice.createStatType(d);
	}

	/**
	 * The root that shows metadata
	 * @return
	 */
	@PostMapping("/Metadata")
	public MetaData[] DisplayMeta() {
		return dataservice.Display_Metadata();
	}

}
