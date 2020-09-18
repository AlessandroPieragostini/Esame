package it.univpm.Progetto.Exceptions;

/**
 * @author Alessandro Pieragostini
 *
 */
public class MinSizeException extends Exception {
	
	/**
	 * The Exception that is thrown if the number of size filter is negative
	 * @param message
	 */
	public MinSizeException (String message) {
        super(message);
	}
}


