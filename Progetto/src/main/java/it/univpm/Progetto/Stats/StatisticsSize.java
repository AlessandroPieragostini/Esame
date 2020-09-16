package it.univpm.Progetto.Stats;

import java.util.ArrayList;

import it.univpm.Progetto.Modelli.Folder;

public class StatisticsSize {
	private static String info;
	
	public static String getSizeStat(ArrayList<Folder> db,long param) {
		int counter=0;
		for(int i=0; i<db.size();i++){
		if( db.get(i).getSize()>param )
		counter++;
		}
		info="There are "+counter+" files bigger then "+param+" byte ";
		return info;
	}

	/**
	 * @return the tmp
	 */
	public String getTmp() {
		return info;
	}

	/**
	 * @param tmp the tmp to set
	 */
	public void setTmp(String tmp) {
		this.info = tmp;
	}
	
}
