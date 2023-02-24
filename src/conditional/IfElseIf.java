package conditional;

public class IfElseIf {
    public static void main(String[] args) {

        // example one
        int marks = 80;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }



// example 2
        double purchaseAmount = 100.0;
        if (purchaseAmount >= 500.0) {
            System.out.println("You get a 20% discount!");
        } else if (purchaseAmount >= 300.0) {
            System.out.println("You get a 10% discount!");
        } else if (purchaseAmount >= 100.0) {
            System.out.println("You get a 5% discount!");
        } else {
            System.out.println("Sorry, you are not eligible for a discount.");
        }

        // example 3
        int age = 25;
        if (age >= 60) {
            System.out.println("The ticket price is $7.");
        } else if (age >= 18) {
            System.out.println("The ticket price is $12.");
        } else {
            System.out.println("The ticket price is $5.");
        }

        // a little complex

        double income = 50000.0;
        double taxAmount;

        if (income >= 100000) {
            taxAmount = income * 0.3;
        } else if (income >= 50000) {
            taxAmount = income * 0.2;
        } else if (income >= 25000) {
            taxAmount = income * 0.1;
        } else {
            taxAmount = 0.0;
        }

        System.out.println("Your income is " + income + ", and your tax amount is " + taxAmount);



        int creditScore = 700;

        if (creditScore >= 800) {
            System.out.println("You are eligible for a loan with a low-interest rate.");
        } else if (creditScore >= 700) {
            System.out.println("You are eligible for a loan with a moderate-interest rate.");
        } else if (creditScore >= 600) {
            System.out.println("You are eligible for a loan with a high-interest rate.");
        } else {
            System.out.println("Sorry, you are not eligible for a loan at this time.");
        }



        double weight = 70.0;
        double height = 1.8;
        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("Your BMI is " + bmi + ", and you are underweight.");
        } else if (bmi < 25) {
            System.out.println("Your BMI is " + bmi + ", and you have a healthy weight.");
        } else if (bmi < 30) {
            System.out.println("Your BMI is " + bmi + ", and you are overweight.");
        } else {
            System.out.println("Your BMI is " + bmi + ", and you are obese.");
        }



    }
}
