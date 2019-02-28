package casedemo;
/**
 * To switch lower case to upper case and switch lower case to upper case
 * @author Jeffrey Wei
 *
 */
public class UpperCaseDemo {

	public static void main(String []args) {
		
		String str = "ThinKingINJaVa";
	//	System.out.println("Method 1: " + exchange(str));
		System.out.println("Method 2: " + exchange2(str));
		
		
		
		char[] aa = {'a','b','c'};
		String h = String.valueOf(aa);
		System.out.println(h);
	}
	
	public static String exchange(String str) {
		
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0 ; i < str.length(); i++) {
			
			char c = str.charAt(i);
			if(Character.isUpperCase(c)) {
				builder.append(Character.toLowerCase(c));
			}
			else if(Character.isLowerCase(c)) {
				builder.append(Character.toUpperCase(c));
			}
		}
		return builder.toString();
		
	}
	
	public static String exchange2(String str) {
		
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0 ; i < str.length() ; i++) {
			
			char a = str.charAt(i);
			if(Character.isUpperCase(a)) {
				
				builder.append(Character.toLowerCase(a));
			}else if(Character.isLowerCase(a)) {
				builder.append(Character.toUpperCase(a));
			}
		}
		return builder.toString();
		
		
			
	}
	
	
	
}
