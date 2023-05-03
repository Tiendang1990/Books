
public class LongestString {
	public static void main (String[] args) {
		String[] Str = {"flower", "flour", "flan"};
		System.out.println(longestStringPrefix(Str));
		
		String[] Str1 = {"Tien", "Tam","Toniee"};
		System.out.println(longestStringPrefix(Str1));
	}
	public static String longestStringPrefix(String[] str) {
		if (str.length ==0) 
			return " There is no common prefix";
			String prefix = str[0];
			for (int i =1; i<str.length; i++) {
				while (str[i].indexOf(prefix) !=0) {
					prefix = prefix.substring(0,prefix.length()-1);
				}
			}
			return prefix;
	}
}