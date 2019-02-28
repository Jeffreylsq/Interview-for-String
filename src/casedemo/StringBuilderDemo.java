package casedemo;
/**
 * To test several method of StringBuilder 
 * 
 * attend()
 * insert(int x ,String str)
 * repalce(int x, int y, String str)
 * delete(int x, int y);
 * reverse()
 * 
 * @author Jeffrey Wei
 *
 */
public class StringBuilderDemo {

	public static void main(String[] args) {

		String str = "Thinking in java";
		StringBuilder builder = new StringBuilder(str);
		builder.append(" is a book");
		System.out.println(builder.toString());
		builder.insert(22, "very great ");
		System.out.println(builder.toString());
		builder.replace(22, 32, "very excellent");
		System.out.println(builder.toString());
		
		builder.delete(21, 36);
		System.out.println(builder.toString());
		
		builder.reverse();
		System.out.println(builder.toString());
		
	}

}
