package conditional;

public class SImpleIf {

    public static void main(String[] args) {

        // Example one

        int age = 16;
        if (age >= 18) {
            System.out.println("You are allowed to vote.");
        } else {
            System.out.println("You are too young to vote.");
        }


        String food = "pizza";
        if (food.equals("pizza")) {
            System.out.println("I love pizza too!");
        } else {
            System.out.println("I haven't tried that food before.");
        }

        int hour = 10;
        if (hour < 12) {
            System.out.println("Good morning!");
        } else {
            System.out.println("Good afternoon!");
        }

        int grade = 85;
        if (grade >= 60) {
            System.out.println("You passed the exam!");
        } else {
            System.out.println("You need to retake the exam.");
        }

        int number = -5;
        if (number >= 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

        double temperature = 5.0;
        if (temperature >= 0.0) {
            System.out.println("The temperature is above freezing point.");
        } else {
            System.out.println("The temperature is below freezing point.");
        }

        boolean isOnline = true;
        if (isOnline == true) {
            System.out.println("The user is online.");
        } else {
            System.out.println("The user is offline.");
        }


    }
}
