package it.univpm.Progetto.Stats;

import java.util.ArrayList;

import it.univpm.Progetto.Modelli.Element;

/**
 * The class used to create the Stat on the size
 * @author Alessandro Pieragostini
 *
 */
public class StatisticsSize {
	private static String info;
	
	public static String getSizeStat(ArrayList<Element> db,long param) {
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
	public String getInfo() {
		return info;
	}

	/**
	 * @param tmp the tmp to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}
	
}
