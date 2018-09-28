package Abdullah;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeSet;

public class Storage extends Type{
	protected static HashMap<String,String> filePath = new HashMap<String,String>();
	protected static TreeSet<String> directoryPath = new TreeSet<String>();

	public Storage() {
		directoryPath.add("/root");
	
	}
	
	public Storage(String path) {

		directoryPath.add(path);
		
		
		
	}
	
	@Override
	public String getPath() {
		String head = directoryPath.last();
		return head;
	}

}
