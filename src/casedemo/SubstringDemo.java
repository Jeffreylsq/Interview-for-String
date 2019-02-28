package casedemo;
/**
 * Take Host name out of website.
 * To go over knowledge of substring 
 * @author pc
 *
 */

public class SubstringDemo {

	public static void main(String[] args) {
		
		
     String str = getHostName("www.Amazon.com");
		
		System.out.println(str);
		
		str = getHostName("http://www.apple.com");
		
		System.out.println(str);
		
		str = getHostName("www.Ebay.com.cn");
		
		System.out.println(str);

	}
	
	public static String getHostName(String str) {
		
		int a = str.indexOf(".");
		int b = str.indexOf(".", a+1);
		String s = str.substring(a+1, b);
		return s;
	}
	
	
	

}
