package regexpractice;
 import java.util.regex.*;
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "Derek Banas CA AK CO  12345  1-(412)555-1234  412-555-1234 412 555-1234 Johnsmith@hotmail.com ";
		String StrangeString = "G1 X10.1 Y20 Z0.28 F5000.0 **** *** {{{ {{ {  ;Move to start position";
		
		/*[0-9]- any character you want
		[A-Za]- any character you want
		[^A-G]- any character not A-G
		[\\s]- any white space
		[\\S]- not white space
		{n,m}  example number of occurences n being min and m being max
		{5,} min but not max
		//+ what ever proceeds
		// . ^ # + ? {} [] \ | () always needs backslash
		Two characters that start with a C or a A
		A[ KLRZ]|C[AOT] // states that start with letter A and preceed with klRZ or(|) C
		regexchecker("(.{3})",StrangeString);// find anything  as long as there is n amount  .{n}  will count spaces
		regexchecker("[A-Za-z0-9._%-]+@[A-Za-z0-9._-]+\\.[A-Za-z]{2,4})",x);// find email
		*/
		// find anything  as long as there is n amount  .{n} 
		// d digit
		//D not a digit
		//{5}
		// \\w [ A=Za-z0-9_] look for any words
		// \\W anything that does look like that
		// * results that occur zero or more times
		//Looking for a word that is 2-20 characters in length
		//regexchecker("(\\{{1,})",StrangeString);// looking for brackets 1 or more
		// [A-Za-z]{2,20}  \\w{2,20}
		// regexchecker("(\\;{1,})",StrangeString); find semicolon
		//regexchecker("(\\{+)",StrangeString);// looking for brackets 1 or more with a + sign
		// Johnsmith@hotmail.com
		//regexchecker("[A-Za-z0-9._%-]+@[A-Za-z0-9._-]+\\.[A-Za-z]{2,4}",x);// find email
		//1-(412)555-1234  412-555-1234
		// ? doesn't need to exist ( |-)?
		//regexchecker("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?[0-9]{4}|[a-zA-Z0-9]{7})",x);// phone number
		regexReplace( x);
	}
public static void regexchecker(String theRegex, String str2Check){
	Pattern checkRegex = Pattern.compile(theRegex);
	Matcher regexMatcher = checkRegex.matcher(str2Check);
	
	while(regexMatcher.find()) {
			if(regexMatcher.group().length()!=0)
			{
			System.out.println(regexMatcher.group().trim());// trim removes white space
			}
			System.out.println("start index:"+regexMatcher.start() );
			System.out.println("End index:"+regexMatcher.end() ); 
								}

	
								}
public static void regexReplace(String str2Replace) {
	 Pattern replace = Pattern.compile("\\s+");
	 Matcher RegexMatcher = replace.matcher(str2Replace.trim());
	 System.out.println(RegexMatcher.replaceAll(", "));
	}
}
