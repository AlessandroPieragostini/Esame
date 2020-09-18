package it.univpm.Progetto.Connect_and_Service;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.tomcat.util.json.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.univpm.Progetto.Exceptions.MinSizeException;
import it.univpm.Progetto.Exceptions.StatFormatException;
import it.univpm.Progetto.Modelli.Element;
import it.univpm.Progetto.Modelli.MetaData;
import it.univpm.Progetto.Stats.StatisticsImpl;
import it.univpm.Progetto.Stats.StatisticsSize;
import it.univpm.Progetto.Stats.Stats;

/**
 * The class that provides the functions of the application
 * @author Alessandro Pieragostini
 *
 */

@Service
public class Dataservice {

	/**
	 * The application datapool
	 */
	private ArrayList<Element> DataBase = new ArrayList<>();

	/**
	 * An array that contains metadata information
	 */
	private MetaData metadata[];
 
	/**
	 * Used to create database
	 */
	private Connect InfoContainer = new Connect();
	
	/**
	 * The stats of datapool
	 */
	private Stats statistics[] = new Stats[2];

	/**
	 * Data visualization method
	 * @return
	 * @throws ParseException
	 * @throws IOException
	 */
	public ArrayList<Element> Display_Data() throws ParseException, IOException {
		return InfoContainer.Display_Folders_JSON();
	}

	/**
	 * Constructor
	 * @throws ParseException
	 * @throws IOException
	 */
	public Dataservice() throws ParseException, IOException {
		DataBase = InfoContainer.Display_Folders_JSON();
	}

	/**
	 * Size statistics method
	 * @param param
	 * @return
	 * @throws MinSizeException
	 */
	public Stats[] createStatSize(Long param) throws MinSizeException{
		if(param<0)
			throw (new MinSizeException("Negative number can't be a size!"));
		statistics[0] = new Stats(DataBase, "size", param);
		return this.statistics;
	}

	/**
	 * Type statistics method
	 * @param d
	 * @return
	 * @throws StatFormatException
	 */
	public Stats[] createStatType(String d) throws StatFormatException {
	   if(!d.equals("D") && !d.equals("ND"))
			throw (new StatFormatException("You can digit only D or ND!"));
		statistics[1] = new Stats(DataBase, "name", d);
		return this.statistics;
	}

	/**
	 * Return metadata
	 * @return
	 */
	public MetaData[] Display_Metadata() {
		metadata = new MetaData[3];
		metadata[0] = new MetaData("name", "The name of the file", "String");
		metadata[1] = new MetaData(".tag", "If the element is a file, a folder or a deleted element", "String");
		metadata[2] = new MetaData("size", "The size of the file", "long");

		return metadata;
	}

}
