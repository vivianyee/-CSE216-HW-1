/**
 * 
 * The <code>OldLandline</code> class 
 * 
 * @author Vivian Yee
 * 		e-mail: vivian.yee@stonybrook.edu
 * 		Stonybrook ID: 112145534
 * 		CSE 216 - R10
 */
public class OldLandline implements Phone{
	private String name;
	private PhoneNumber number;
	Phone curCall;
	boolean busy;
	
	public OldLandline(String name, long number) throws IllegalArgumentException {
		this.name = name;
		this.number = new PhoneNumber(number);
		busy = false;
	}
	
	public String getOwner() {
		return name;
	}
	
	public void call(Phone phone) {
		busy = true;
		curCall = phone;
		phone.receive(this);
	}
	
	public void end() {
		busy = false;
	}

	public void receive(Phone from) {
		if(isBusy()) {
			System.out.println("Line is currently busy.");
		}else {
			System.out.println(name + " is currently on the phone with " + from.getOwner());
		}
	}

	public boolean isBusy() {
		return busy;
	}

	public void receiveEndSignal(Phone from) {
		busy = false;
		System.out.println(name + " currently ended the call with " + from.getOwner());
	}

	public PhoneNumber number() {
		return number;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public PhoneNumber getNumber() {
		return number;
	}
	
	public void setNumber(PhoneNumber number) {
		this.number = number;
	}

}
