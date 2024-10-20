package String;

public class SubString {
public static String subString(String str , int si, int ei){
    String SubStr = "";
    for(int i = si; i<ei; i++){
        SubStr += str.charAt(i);
    }
    return SubStr;
}


  public static void main(String[] args) {
      String str = "HelloWorld";

      System.out.println(str.substring(0, 9));
    //   System.out.println(subString(str, 0, 5));
  }

    
}
