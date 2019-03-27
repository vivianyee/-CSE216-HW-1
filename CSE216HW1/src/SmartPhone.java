/**
 * 
 * The <code>SmartPhone</code> class 
 * 
 * @author Vivian Yee
 * 		e-mail: vivian.yee@stonybrook.edu
 * 		Stonybrook ID: 112145534
 * 		CSE 216 - R10
 */
public class SmartPhone extends Landline implements Computer{

	public SmartPhone(String name, long number) throws IllegalArgumentException {
		super(name, number);
	}
	
	public void setState(String to){
		if((to.equalsIgnoreCase("on"))||(to.equalsIgnoreCase("off"))){
			
		}else {
			System.out.println("Turn on or off.");
		}
	}
	
	public void installGame(String gameName) {
		
	}

	public void playGame(String gameName) {
		
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
	public boolean hasGame(String gameName) {
		// TODO Auto-generated method stub
		return false;
	}
}
