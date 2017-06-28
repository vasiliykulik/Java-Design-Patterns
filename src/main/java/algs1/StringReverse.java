package algs1;

/**
 * Created by Vasiliy Kylik on 27.06.2017.
 */
public class StringReverse {

  public static String reverseChar(String input){
    char[] in = input.toCharArray();
    int begin=0;
    int end=in.length-1;
    char temp;
    while(end>begin){
      temp = in[begin];
      in[begin]=in[end];
      in[end] = temp;
      end--;
      begin++;
    }
    return new String(in);
  }

  public static String reverseIt(String source) {
    int i, len = source.length();
    StringBuilder dest = new StringBuilder(len);

    for (i = (len - 1); i >= 0; i--){
      dest.append(source.charAt(i));
    }

    return dest.toString();
  }
  public static String reverseStringBuffer(String input){
    return new StringBuffer(input).reverse().toString();
  }


  public static void main(String[] args) {
    System.out.println(reverseChar("hello, how are you"));
    System.out.println(reverseIt("hello, how are you"));
    System.out.println(reverseStringBuffer("hello, how are you"));
  }
}
