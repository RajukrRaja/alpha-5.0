package String;

import java.util.*;

public class CreationOfString {
    public static void main(String[] args) {
        // char arr[] = {'a' , 'b' , 'c' , 'd'};
        // String str = "abcd";
        // String str1 = new String("xyz");

        // // String are IMMUTABLE

        // Scanner sc = new Scanner(System.in);
        // String name ;
        // name = sc.nextLine();
        // System.out.println(name);

        // Lenght of String
        // String Fullname = "Raju kumar Raja";
        // System.out.println(Fullname.length());

        // concatenation
        // String Firstname = "Raju kumar ";
        // String lastname = "Raja";
        // String Fullname = Firstname + lastname;
        // System.out.println(Fullname );

        // CharAt Method (Find character in string )
        String Firstname1 = "Raju kumar ";
        String lastname1 = "Raja";
        String Fullname1 = Firstname1 + lastname1;
        // System.out.println(Fullname1.charAt(0));

        // printing all character using CharAt method or loop
        PrintAllCharacter(Fullname1);

    }

    public static void PrintAllCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + "");
        }
        System.out.println();
    }
}
