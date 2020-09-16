package it.univpm.Progetto.Connect_and_Service;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.tomcat.util.json.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.univpm.Progetto.Exceptions.MinSizeException;
import it.univpm.Progetto.Exceptions.StatFormatException;
import it.univpm.Progetto.Modelli.Folder;
import it.univpm.Progetto.Modelli.MetaData;
import it.univpm.Progetto.Stats.StatisticsImpl;
import it.univpm.Progetto.Stats.StatisticsSize;
import it.univpm.Progetto.Stats.Stats;

@Service
public class Dataservice {

	private ArrayList<Folder> DataBase = new ArrayList<>();

	private MetaData metadata[];

	private Connect InfoContainer = new Connect();

	private Stats statistics[] = new Stats[2];

	public ArrayList<Folder> Display_Data() throws ParseException, IOException {
		return InfoContainer.Display_Folders_JSON();
	}

	public Dataservice() throws ParseException, IOException {
		DataBase = InfoContainer.Display_Folders_JSON();
	}

	public Stats[] createStatSize(Long param) throws MinSizeException{
		if(param<0)
			throw (new MinSizeException("Negative number can't be a size!"));
		statistics[0] = new Stats(DataBase, "size", param);
		return this.statistics;
	}

	public Stats[] createStatType(String d) throws StatFormatException {
	   if(!d.equals("D") && !d.equals("ND"))
			throw (new StatFormatException("You can digit only D or ND!"));
		statistics[1] = new Stats(DataBase, "name", d);
		return this.statistics;
	}

	public MetaData[] Display_Metadata() {
		metadata = new MetaData[3];
		metadata[0] = new MetaData("name", "The name of the file", "String");
		metadata[1] = new MetaData(".tag", "If the element is a file, a folder or a deleted element", "String");
		metadata[2] = new MetaData("size", "The size of the file", "long");

		return metadata;
	}

}
