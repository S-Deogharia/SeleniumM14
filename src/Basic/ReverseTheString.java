package Basic;

public class ReverseTheString {

	public static void main(String[] args) {
		String string="Sneha";
		String reversedStr="";
		for(int i=string.length()-1;i>=0;i--) {
			reversedStr=reversedStr + string.charAt(i);
			
		}
		System.out.println("original string:" +string);
		System.out.println("Reverse of string:" +reversedStr);

	}

}
