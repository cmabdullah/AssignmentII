package Abdullah;

public class NewFile extends Storage{
	String CurrentPath = directoryPath.last();
	public NewFile() {
		//System.out.println("New FIle : "+CurrentPath);
	}
	
	
	
	public void addFile(String filename) {
		filePath.put(filename, CurrentPath);
	}
}
