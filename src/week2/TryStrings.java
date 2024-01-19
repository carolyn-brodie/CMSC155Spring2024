package week2;

public class TryStrings {
    public static void main(String[] args) {
        String s1 = "Hi There";
        String s2 = new String("Hi There");
        String s3 = s1;

//        //Equality Test
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

//        //Compare Strings
        //System.out.println("a" < "b");  // error
        System.out.println("b".compareTo("b"));

        if ("a".compareTo("b") < 0) {
            System.out.println("a comes first");
        } else if ("a".compareTo("b") > 0){
            System.out.println("b comes first");
        } else {
            System.out.println("the same");
        }

        //Length of a String
//        System.out.println("Length of s1 is " + s1.length());
//        //other functions
//        String title = "Harry Potter";
//        char oneLetter = title.charAt(6);
//        System.out.println(oneLetter);
//
//
//        String substring = title.substring(6, 9);
//        System.out.println(substring);
//// makes substring = ”Pot" - from positions 6 to 8
////Character at position 9 is NOT included.


    }
}
