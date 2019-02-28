package plalindrome;
/**
 * 
 * To determine that a string is palindrome or not
 * There are two method:
 * one is by using string
 * another is by using StringBuilder
 * @author Jeffrey Wei
 *
 */
public class IsPalindrome {

	public static void main(String[] args) {

		
		String str  = "12345aabbaa54321";
		System.out.println("Method 1: " + isPalin(str));
		System.out.println("Method 2: " + isPalin2(str));
		
		
		
	
		
		
		
	}
	
	public static boolean isPalin(String str) {
		
		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		
		return builder.toString().equals(str);
		
	}
	
	public static boolean isPalin2(String str) {
		
		boolean flag = true;
		for(int i = 0 ; i < str.length()/2 ; i++) {
			
			char a = str.charAt(i);
			char b = str.charAt(str.length() - 1 - i);
			
			if(a != b) {
				flag = false;
				break;
			}
			
		}
		return flag;
	}
	
	

}
