import java.io.IOException;


public class myDriver {
	

	public static void main (String[] args) throws IOException{ 
		
		PhoneDirectory directory = new PhoneDirectory();
		directory.addEntry("Preksha", "5622936397");
		//directory.addEntry("Preha", "56229");
		directory.addEntry("P", "56229");
		directory.addEntry("Pr", "56229");
		directory.addEntry("Pre", "56229");
		String getting = directory.getNumber("Preksha");
		String gett = directory.getNumber("Pr");
		System.out.println(getting);
		System.out.println(gett);
		directory.deleteEntry("Preksha");
		directory.changeEntry("P", "hello");
		
		
		
	}
}
