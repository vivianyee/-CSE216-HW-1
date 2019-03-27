/**
 * 
 * The <code>IllegalArgumentException</code> class 
 * 
 * @author Vivian Yee
 * 		e-mail: vivian.yee@stonybrook.edu
 * 		Stonybrook ID: 112145534
 * 		CSE 216 - R10
 */
public class IllegalArgumentException extends Exception {
	public IllegalArgumentException()
    {  //Default message
        super("Invalid element used as method parameter.");
    }

    public IllegalArgumentException(String message)
    {   //Passed message
        super(message);
    }	
}