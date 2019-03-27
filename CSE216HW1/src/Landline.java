import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * The <code>Landline</code> class 
 * 
 * @author Vivian Yee
 * 		e-mail: vivian.yee@stonybrook.edu
 * 		Stonybrook ID: 112145534
 * 		CSE 216 - R10
 */
public class Landline extends OldLandline{
	boolean busy;
	ArrayList<String> mes = new ArrayList<String>();
	
	enum MSG_STATUS{
		READ(1),
		UNREAD(0);
		
		private final int x;
		
		MSG_STATUS(int x){
			this.x=x;
		}
//		private final String msg;
//		
//		MSG_STATUS(String msg){
//			this.msg = msg;
//		}
	}
	
	public Landline(String name, long number) throws IllegalArgumentException {
		super(name, number);
		busy = false;
	}
	
	public void receive(Phone from) {
		if(busy) {
			Scanner scan = new Scanner(System.in);
			System.out.println(from.getOwner()+" has called. "+getOwner() + " is busy right now, leave a message: ");
//			String msg = scan.nextLine();
//			mes.add(msg);
		}else {
			busy = true;
			System.out.println(from.getOwner() + " has called "+getOwner());
		}
	}
	
	public void readMessages(Enum MSG_STATUS) {
		
	}
}
