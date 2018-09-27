package Abdullah;

public class temp {

	public static void main(String[] args) {
		String s = "/root/Media/Songs"; //11
		int index = 0;

		for (int i = s.length()-1; i>0 ; i--) {
			if(s.charAt(i) == '/') {
				System.out.println(i);
				index = i;
				break;
			}
		}
		
		s = s.substring(0, index);
		System.out.println(s);

	}

}
