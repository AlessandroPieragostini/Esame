package it.univpm.Progetto.Stats;

import java.util.ArrayList;

import it.univpm.Progetto.Modelli.Element;

/**
 * The class that calls the Statistics date and Source classes to build the arrayList
 * that are used to store the Stats information
 * @author Alessandro Pieragostini
 *
 */
public class StatisticsImpl{
	
	
	private StatisticsSize sizeStat=new StatisticsSize();
	private StatisticsType TypeStat=new StatisticsType();
	
	public ArrayList<String> getSizeStat(ArrayList<Element> db,String attr,long param){
		
		ArrayList<String> Statistics=new ArrayList<>();
		
		if(attr.equals("size"))
			Statistics.add(StatisticsSize.getSizeStat(db,param));
		
		return Statistics;
		
	}
	
public ArrayList<String> getTypeStat(ArrayList<Element> db,String attr,String del){
		
		ArrayList<String> Statistics=new ArrayList<>();
		
		if(attr.equals("name"))
			Statistics.addAll(StatisticsType.getFileTypes(db, attr, del));
			
		return Statistics;
		
	}

/**
 * @return the sizeStat
 */
public StatisticsSize getSizeStat() {
	return sizeStat;
}

/**
 * @param sizeStat the sizeStat to set
 */
public void setSizeStat(StatisticsSize sizeStat) {
	this.sizeStat = sizeStat;
}

/**
 * @return the typeStat
 */
public StatisticsType getTypeStat() {
	return TypeStat;
}

/**
 * @param typeStat the typeStat to set
 */
public void setTypeStat(StatisticsType typeStat) {
	TypeStat = typeStat;
}


}
