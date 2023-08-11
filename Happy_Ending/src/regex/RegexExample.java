package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile(".s");// . -> single character
		Matcher m = p.matcher("as");
		
		boolean b = m.matches();
		System.out.println("b: " + b);
		
		boolean b2 = Pattern.compile(".a").matcher("asusual").matches();
		System.out.println("b2: " + b2);
		
		boolean b3 = Pattern.matches(".s", "as");
		System.out.println("b3: " + b3);
	}

}

/*
Tasks:

1. **Email Validation:** Write a program to validate email addresses using regular expressions. Use the "." quantifier to match any character, ensuring that the email format is correct with a username, "@" symbol, domain name, and valid top-level domain (TLD).

2. **Sentence Extraction:** Create a program that extracts sentences from a given text using regular expressions. Use the "." quantifier to capture sentences based on periods or other punctuation marks.

3. **URL Extraction:** Develop a tool to extract URLs from a webpage's source code. Utilize the "." quantifier to capture different parts of the URL, such as the protocol, domain, and path.

4. **Code Comment Removal:** Design a program to remove comments from source code files, including both single-line and multi-line comments. The "." quantifier can be useful for matching characters within comments.

5. **Data Scrubbing:** Build a data scrubbing script that processes a dataset to remove sensitive information like phone numbers. Use the "." quantifier to redact or replace digits in phone number patterns while preserving the rest of the text.



*/