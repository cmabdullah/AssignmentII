package Abdullah;

public abstract class Type {
	public String name;
	public int size;
	public String currentDirectoryPath;

	// directory
	public abstract String getPath();

	public Type() {
		
	}

	public Type(String currentDirectoryPath) {

		this.currentDirectoryPath = currentDirectoryPath;
	}
	


}
