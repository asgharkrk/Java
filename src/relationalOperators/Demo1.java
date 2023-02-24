package relationalOperators;

public class Demo1 {

    public static void main(String[] args) {
        // demo1
        int x = 5;
        int y = 10;
        System.out.println("Is x greater than y? " + (x > y));

// demo2

        String str1 = "hello";
        String str2 = "world";

        System.out.println("Are str1 and str2 equal? " + (str1.equals(str2)));

    // Demo3
        int a = 5;
        int b = 10;

        System.out.print("x is ");
        System.out.print(a > b ? "not " : "");
        System.out.println("greater than y");

        // Demo 4
        int age = 25;

        System.out.print("You are ");
        System.out.print(age < 18 ? "under 18" : (age < 30 ? "between 18 and 30" : "over 30"));


        // Demo5
        String str3 = "hello";
        String str4 = "world";

        System.out.print("str1 and str2 are ");
        System.out.print(str3.equals(str4) ? "" : "not ");
        System.out.println("equal");



    }


}
