
public class Test {
	public static void main(String[] args) throws IllegalArgumentException {
		Landline jack = new Landline("Jack", 6312028899L);
		Landline john = new Landline("John", 3028113434L);
		OldLandline julie = new OldLandline("Julie", 9018772324L);
		// further constructor details hidden in this sample
		SmartPhone paul = new SmartPhone("Paul", 2024449019);
		jack.call(john);
		julie.call(john);
		john.end();
		julie.call(john);
		john.call(jack);
		julie.end();
		paul.installGame("fortnite");
		paul.installGame("angry birds");
		paul.installGame("fortnite");
		paul.playGame("minecraft");
		paul.playGame("fortnite");
	}
}
/**
 * Do OldLandlines accept calls?
 * Does the OldLandline implement Phone?
 * Does Smartphone extend Landline which extends Oldlandline?
 * Would MSG_STATUS be an ArrayList of Strings?
 * Do we have to reimplement the interface of Phone in Landline?
 * READ and UNREAD enumerable types
 * BRAND NAMES enumerable types
 * OLDLANDLINES CANNOT GET VOICEMAILS BUT LANDLINES CAN
 * COMPARATOR FOR ORDERING collections.sort()
 * 
 */

