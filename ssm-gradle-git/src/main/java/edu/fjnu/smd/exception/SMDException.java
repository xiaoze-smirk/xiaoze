/**
 * 
 */
package edu.fjnu.smd.exception;

/**
 *
 * SMD根异常
 * @author xiaoze
 *
 */
public class SMDException extends RuntimeException {

	/**
	 * 
	 */
	public SMDException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public SMDException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public SMDException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public SMDException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public SMDException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
