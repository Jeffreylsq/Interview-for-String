package exercise;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a string");
		String str = kb.next();
		
		char[] array = str.toCharArray();
		int upper = 0 , lower = 0, other = 0;
		for(int i = 0 ; i < array.length ; i++) {
			
			if(Character.isUpperCase(array[i])) {
				upper++;
			}
			else if( Character.isLowerCase(array[i])) {
				lower++;
			}else {
				other++;
			}
			
		}
		System.out.println("Upper Case: " + upper);
		System.out.println("Lower Case: " + lower);
		System.out.println("Other Case: " + other);
		
	}

}
