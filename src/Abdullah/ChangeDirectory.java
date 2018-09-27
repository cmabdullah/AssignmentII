package Abdullah;

public class ChangeDirectory extends Storage {
	ChangeDirectory() {

	}

	@Override
	public String getPath() {
		String head = directoryPath.last();

		int index = 0;
		for (int i = head.length() - 1; i > 0; i--) {
			if (head.charAt(i) == '/') {
				//System.out.println(i);
				index = i;
				break;
			}
		}

		head = head.substring(0, index);
		//System.out.println(head);

		return head;
	}

}
