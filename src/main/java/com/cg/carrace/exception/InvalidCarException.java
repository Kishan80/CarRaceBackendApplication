/**
 * 
 */
package com.cg.carrace.exception;

/**
 * @author kneware
 *
 */
public class InvalidCarException extends Exception {

	/**
	 * 
	 */
	public InvalidCarException() {
		
		super("No such Car Available");
	}

	/**
	 * @param message
	 */
	public InvalidCarException(String message) {
		super(message);
		
	}

	
}
