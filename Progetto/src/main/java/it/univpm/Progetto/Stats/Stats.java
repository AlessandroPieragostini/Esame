package it.univpm.Progetto.Stats;

import java.util.ArrayList;

import it.univpm.Progetto.Modelli.Element;

/**
 * * The class used to create all the stats
 * @author Alessandro Pieragostini
 *
 */

public class Stats {
	
	StatisticsImpl stat=new StatisticsImpl();
	/**
	 * The constructor that create statistics of size
	 * sizeparam passed by the user is used to recive the number
	 * of the files that have a greater size
	 * @param dB
	 * @param field
	 * @param Sizeparam
	 */
	public Stats(ArrayList<Element> dB, String field, Long Sizeparam) {
		
		stat.getSizeStat(dB, field, Sizeparam);

	}
	/**
	 * * The constructor that create statistics of type
	 * d passed by the user is used to decide if the user want statistics of 
	 * deleted or not deleted files
	 * @param dB
	 * @param field
	 * @param d
	 */
	public Stats(ArrayList<Element> dB, String field,String d) {
		
		stat.getTypeStat(dB, field, d);
	}
	/**
	 * @return the stat
	 */
	public StatisticsImpl getStat() {
		return stat;
	}
	/**
	 * @param stat the stat to set
	 */
	public void setStat(StatisticsImpl stat) {
		this.stat = stat;
	}


}
