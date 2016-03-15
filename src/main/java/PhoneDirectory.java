
import java.io.*;
import java.util.*;

public class PhoneDirectory {
	String getting;
	String path;
	String previous_path = "src/main/resources/phone.properties";
	String separator;
	HashMap<String,String> mHashMap = new HashMap<String,String>();
	
	public PhoneDirectory(String path, String separator){
		this.path = path + "phone.txt";
		System.out.println(path + "phone.txtfile");
		this.separator = separator;
	
	}
	
	
	
	public void addEntry(String name, String number) throws IOException{
		mHashMap.put(name,number);
		System.out.println(mHashMap.get(name));
		write();

	}
	
	public void write() throws IOException{
		
		File fileName= new File(path);
		Iterator iterator = mHashMap.entrySet().iterator();
		
		FileWriter fileWriter  = new FileWriter(fileName);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		while (iterator.hasNext()) {
			HashMap.Entry pair = (HashMap.Entry)iterator.next();
			bufferedWriter.write(pair.getKey()+ separator+pair.getValue());
			bufferedWriter.newLine();
		}
		bufferedWriter.close();
		
	     
	}

	
	public void changeEntry(String name, String number) throws IOException{

		mHashMap.put(name, number);
		write();
		
	}
	
	
	public void deleteEntry(String name) throws IOException{
		mHashMap.remove(name);
		write();
		
	}
	
	public String getNumber(String name) throws IOException{

		getting=mHashMap.get(name);
		return getting;
		
	}
}
