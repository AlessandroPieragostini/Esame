package it.univpm.Progetto.Modelli;

import java.util.ArrayList;

/**
 * The class that creates a metadata element
 * @author Alessandro PIeragostini
 *
 */
public class MetaData {
	
	/**
	 * Name of the tag
	 */
	private String nametag;
	/**
	 * An explanation of nametag
	 */
	private String info;
	/**
	 * Type of nametag
	 */
	private String type;
	
	private ArrayList<MetaData>	metadata= new ArrayList<>();

	/**
	 * Constructor
	 * @param nametag
	 * @param info
	 * @param type
	 */
	public MetaData(String nametag, String info, String type) {
		super();
		this.nametag = nametag;
		this.info = info;
		this.type = type;
	}

	/**
	 * Constructor
	 */
	public MetaData() {
		super();
	}

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
