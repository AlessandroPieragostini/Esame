package it.univpm.Progetto.Modelli;

import java.util.ArrayList;

public class MetaData {
	private String nametag;
	private String info;
	private String type;
	
	private ArrayList<MetaData>	metadata= new ArrayList<>();

	public MetaData(String nametag, String info, String type) {
		super();
		this.nametag = nametag;
		this.info = info;
		this.type = type;
	}

	public MetaData() {
		super();
	}

/*
	public ArrayList<MetaData> ShowMetadata() {
		 
		 metadata.add(new MetaData("name", "The name of the file", "String"));
		 metadata.add(new MetaData(".tag", "If the element is a file, a folder or a deleted element", "String"));
		 metadata.add(new MetaData("size", "The size of the file", "long"));
		return metadata;
	}
*/
	/**
	 * @return the nametag
	 */
	public String getNametag() {
		return nametag;
	}

	/**
	 * @param nametag the nametag to set
	 */
	public void setNametag(String nametag) {
		this.nametag = nametag;
	}

	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the metadata
	 */
	public ArrayList<MetaData> getMetadata() {
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(ArrayList<MetaData> metadata) {
		this.metadata = metadata;
	}
	

	
}
