// Rule 00. Input Validation and Data Sanitization
// IDS11-J. Perform Any String Modifications Before Validation

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
  
public class TagFilter {
  public static String filterString(String str) {
    String s = Normalizer.normalize(str, Form.NFKC);
 
    // Validate input
    Pattern pattern = Pattern.compile("<script>");
    Matcher matcher = pattern.matcher(s);
    if (matcher.find()) {
      throw new IllegalArgumentException("Invalid input");
    }
 
    // Deletes noncharacter code points
    s = s.replaceAll("[\\p{Cn}]", "");
    return s;
  }
 
  public static void main(String[] args) {
    // "\uFDEF" is a noncharacter code point
    String maliciousInput = "<scr" + "\uFDEF" + "ipt>";
    String sb = filterString(maliciousInput);
    // sb = "<script>"
  }
}
