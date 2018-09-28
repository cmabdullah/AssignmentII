package Abdullah;

public class CreateDirectory extends Storage{
	
	public CreateDirectory() {
	
	}
	
	public CreateDirectory(String directoryPath) {
		super(directoryPath);
	}
	
	public void addDirectory(String path) {
		
		String head = directoryPath.last();
		head = head.concat("/").concat(path);
		directoryPath.add(head);

	}
	

}
