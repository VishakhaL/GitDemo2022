package testprogram;

public class StringRev {

	public static void main(String[] args) {
		String revStr = "testing";
		char ch;
		/*int len = revStr.length();
		System.out.println(len);
		char temp;
		for(int i =len-1;i>=0;i--) {
			 temp=revStr.charAt(i);
		    System.out.print(temp);*/
		
		String temp="";
		for(int i=0;i<=revStr.length()-1;i++) {
			ch=revStr.charAt(i);
			temp=ch+temp;			
		}
		System.out.println(temp);
		
	}
}
