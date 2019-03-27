/**
 * 
 * The <code>Laptop</code> class 
 * 
 * @author Vivian Yee
 * 		e-mail: vivian.yee@stonybrook.edu
 * 		Stonybrook ID: 112145534
 * 		CSE 216 - R10
 */
public class Laptop implements Computer{
	private String brand;
	private String hostname;
	
	public Laptop(String brand, String hostname) {
		this.setBrand(brand);
		this.setHostname(hostname);
	}
	
	public void setState(String to) {
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	@Override
	public int getScreenSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRAM() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getProcessorSpeeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public State getState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void installGame(String gameName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasGame(String gameName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void playGame(String gameName) {
		// TODO Auto-generated method stub
		
	}
}
