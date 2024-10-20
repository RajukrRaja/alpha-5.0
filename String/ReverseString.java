
public class ReverseString{

   public static String reverse(String s){

   char [] chars = s.toCharArray();


   int left =  0;
   int right = s.length()-1;

   while(left<right){

    char temp = chars[left];
    chars[left] = chars[right];
    chars[right] = temp;

    left++;
    right--;



   }

   return new String(chars);


   }

   public static void main(String[] args) {

    String input = "HelloWorld";

    ReverseString R1 = new ReverseString();
    R1.reverse(input);


System.out.println(" Original String ->" +input);
System.out.println("reversed String-> " +reverse(input));
    
    
   }


}
