package it.univpm.Progetto.Stats;

import java.util.ArrayList;

import it.univpm.Progetto.Modelli.Folder;

public class Stats {
	
	

	StatisticsImpl stat=new StatisticsImpl();
	
	
	
	public Stats(ArrayList<Folder> dB, String field, Long Sizeparam) {
		
		stat.getSizeStat(dB, field, Sizeparam);

	}
	public Stats(ArrayList<Folder> dB, String field,String d) {
		
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
