package Abdullah;

public class CreateDirectory extends Storage{
	
	public void addDirectory(String path) {
		
		String head = directoryPath.last();
		head = head.concat("/").concat(path);
		directoryPath.add(head);
		//System.out.println(directoryPath);
	}
}
