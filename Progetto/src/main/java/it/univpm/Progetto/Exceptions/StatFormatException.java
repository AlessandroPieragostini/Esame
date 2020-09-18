package it.univpm.Progetto.Exceptions;
/**
 * @author Alessandro Pieragostini
 *
 */
public class StatFormatException extends Exception {
	
	/**
	 * The Exception that is thrown if the parameter isn't "N" or "ND"
	 * @param message
	 */
	public StatFormatException (String message) {
        super(message);
	}
}
