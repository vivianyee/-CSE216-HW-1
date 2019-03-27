/**
 * 
 * The <code>PhoneNumber</code> class 
 * 
 * @author Vivian Yee
 * 		e-mail: vivian.yee@stonybrook.edu
 * 		Stonybrook ID: 112145534
 * 		CSE 216 - R10
 */
public class PhoneNumber {
	final long number;
	
	public PhoneNumber(long number) throws IllegalArgumentException{
		long x = 100000000L;
		if(number/x != 0) {
			this.number = number;
		}else {
			throw new IllegalArgumentException("Enter a real phone number");
		}
	}
}
