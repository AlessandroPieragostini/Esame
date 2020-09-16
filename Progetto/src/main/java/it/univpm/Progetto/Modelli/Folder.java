package it.univpm.Progetto.Modelli;

public class Folder {
	private long size;
	private String name;
	private String tag;
	
	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}
	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}
	/**
	 * @return the size
	 */
	public long getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(long size) {
		this.size = size;
	}
	/**
	 * @return the nome
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
