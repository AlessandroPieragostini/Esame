package it.univpm.Progetto.Stats;

import java.util.ArrayList;

import com.google.common.io.Files;

import it.univpm.Progetto.Modelli.Folder;

public class StatisticsType {	
	
	private static ArrayList<String> Statistics=new ArrayList<String>();
	private static ArrayList<String> StatisticsDel=new ArrayList<String>();
	
	public static String getExtensionByGuava(String filename) {
	    return Files.getFileExtension(filename);
	}
   
	public static ArrayList<String> getFileTypes(ArrayList<Folder> db, String field,String par) {
	
	
		String[] Stamp=new String[5] ;
		String tmp=null;
		String tmp2=null;
		int pdfFiles=0; 
		int wordFiles=0;
		int excelFiles=0;
		int powerpointFiles=0;
		int PhotoFiles=0;	
		
		if(par.equals("D")) {
	    
			for(int i=0;i<db.size(); i++) {
	        	
	        
	        	if( (db.get(i).getTag()).equals(("deleted"))) {
	            		try 
	        	 		{	
	    	        		tmp=getExtensionByGuava(db.get(i).getName());
	    	        	}catch (Exception e) {
	    				
	    	        	}
	    	        		
	    	    if (tmp.equals("docx") || tmp.equals("doc"))
	    	    	wordFiles++;
	    	    if (tmp.equals("xls") || tmp.equals("xlsx"))
	    	    	excelFiles++;
	    	    if (tmp.equals("pptx") || tmp.equals("ppt"))
	    	    	powerpointFiles++;
	    	    if (tmp.equals("jpg") || tmp.equals("bmp") || tmp.equals("png") || tmp.equals("gif"))
	    	    	PhotoFiles++;
	    	    if (tmp.equals("pdf"))
	    	    	pdfFiles++;	
	    		
	    	    
	        	}

	        } 
	        Stamp[0]="Number of Word files:"+wordFiles;
	        Stamp[1]="Number of PDF files:"+pdfFiles;
	        Stamp[2]="Number of Excel files:"+excelFiles;
	        Stamp[3]="Number of Photos:"+PhotoFiles;
	        Stamp[4]="Number of Power Point files:"+powerpointFiles;
	        
	        StatisticsDel.clear();
	        
	        for(int j=0; j<Stamp.length; j++)    
    	    StatisticsDel.add(Stamp[j]);
		
		}
	    
	    if((par.equals("ND"))) {
	    
	    	for(int i=0;i<db.size(); i++) {
	       
	        	try{	
	        		tmp2=getExtensionByGuava(db.get(i).getName());
	        	}catch (Exception e) {

				}
	        
	        if (tmp2.equals("docx") || tmp2.equals("doc"))
    	    	wordFiles++;
    	    if (tmp2.equals("xls") || tmp2.equals("xlsx"))
    	    	excelFiles++;
    	    if (tmp2.equals("pptx") || tmp2.equals("ppt"))
    	    	powerpointFiles++;
    	    if (tmp2.equals("jpg") || tmp2.equals("bmp") || tmp2.equals("png") || tmp2.equals("gif"))
    	    	PhotoFiles++;
    	    if (tmp2.equals("pdf"))
    	    	pdfFiles++;		

		}
	    
	    Stamp[0]="Number of Word files:"+wordFiles;
	    Stamp[1]="Number of PDF files:"+pdfFiles;
	    Stamp[2]="Number of Excel files:"+excelFiles;
	    Stamp[3]="Number of Photos:"+PhotoFiles;
	    Stamp[4]="Number of Power Point files:"+powerpointFiles;
	    
	    Statistics.clear();
	    
	    for(int j=0; j<Stamp.length; j++)    
		    Statistics.add(Stamp[j]);
	    
	    }
	    
	    if (par.equals("D")) {
	    	Statistics.clear();
	    	return StatisticsDel;
		}
	    else {
	    	StatisticsDel.clear();
	    	return Statistics;
	    }
		
		
	}
	
	/**
	 * @return the statistics
	 */
	public ArrayList<String> getStatistics() {
		return Statistics;
	}

	/**
	 * @param statistics the statistics to set
	 */
	public void setStatistics(ArrayList<String> statistics) {
		Statistics = statistics;
	}

	/**
	 * @return the statisticsDel
	 */
	public ArrayList<String> getStatisticsDel() {
		return StatisticsDel;
	}

	/**
	 * @param statisticsDel the statisticsDel to set
	 */
	public void setStatisticsDel(ArrayList<String> statisticsDel) {
		StatisticsDel = statisticsDel;
	}
	
}


