package java_with_dsa;

public class ReverseString {

	public static void main(String[] args) {
		String OrginalString="jithu";
		String ReverseString=new StringBuilder(OrginalString).reverse().toString();
		System.out.println("Original:" + OrginalString);
		System.out.println("Reverse:" + ReverseString);
	}
}
	
