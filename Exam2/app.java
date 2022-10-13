import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)
        System.out.println("1. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();
        int num = 0;
        if (num % 2 == 0) {
            System.out.println("ODD");
        }
        else {
            System.out.println("EVEN");
        }
        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // nor a composite number.
        // (10 pts)

        System.out.println("2. PRIME or COMPOSITE number");
        System.out.print("Enter the last digit of your student number: ");
        int lastDigit = scan.nextInt();
        int no = 0;
        if( lastDigit == 0|| lastDigit == 1) {
            System.out.println("NEITHER");
         }
        else if ( lastDigit % 2 == 1){
            System.out.println("PRIME");
        }
        else {
            System.out.println("COMPOSITE");
        }

        // ==============================================================================

        // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        System.out.print("Enter your surname: ");
        String surName = scan.next();
        String firstNamesString = "";
        String surNameString = "";
        int len1 = firstName.length(); 
        int len2 = surName.length();
        int totallength = len1 + len2; 
        System.out.println(totallength);
        
        

        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest
        // number.

        System.out.println("4. Largest Number");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scan.nextInt();
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber);
        }
        else if (secondNumber > thirdNumber) {
            System.out.println(secondNumber);
        }
        else {
            System.out.println(thirdNumber);
        }


        // ==============================================================================

        // 5. Create a method and think of a formula to get the last 6 digits of your
        // student number. (10 pts)
        System.out.println("5. Last six digits");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();
        int x = 2022104033; 
        int lastsix = x % 200000;
        System.out.println(lastsix);
        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        studentNumber = scan.nextInt();
        if (studentNumber == 2022104033) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        String FirstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        String SurName = scan.next();

        if (firstName.toUpperCase().equals("DAWSON") || surName.toLowerCase().equals("david")) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

        System.out.println("8. Nested conditions");
        System.out.print("Enter your enrolled course (BSIT or BSCS): ");
        String course = scan.next();

        if (course == "BSCS") {
        System.out.print("Enter your specialization (MWAA or MAA): ");
        String specialization1 = scan.next();
        switch (specialization1) {
            case "MWAA":
            System.out.println("Invalid");
            break;
            case "MAA":
            System.out.println("Invalid");
            break;
        }
        }
        
        else {
        System.out.print("Enter your specialization (DF or ML): ");
        String specialization2 = scan.next();
        switch (specialization2) {
            case "DF":
            System.out.println("Valid");
            break;
            case "ML":
            System.out.println("Invalid");
            break;
        }
        }

        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

        System.out.println("9. Selection");
        System.out.print("Enter your SHS strand: ");
        String strand = scan.next();
        switch (strand) {
            case "STEM":
            System.out.println("Valid");
            break;
            case "ICT":
            System.out.println("Valid");
            break;
            case "HUMSS":
            System.out.println("Valid");
            break;
            case "HOME ECONOMICS":
            System.out.println("Valid");
            break;
            case "ARTS AND DESIGN":
            System.out.println("Valid");
            break;
            case "TVL MARITIME":
            System.out.println("Valid");
            break;
        }


        // ==============================================================================

        // 10. Create a condition to check if your student email address contains the
        // following pattern:
        // - Your surname
        // - The string "@students.national-u.edu.ph"
        // (10 pts)
        System.out.println("10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();
        String studentEmailAdd = "daviddm@students.national-u.edu.ph";

        switch (studentEmailAddress) {
            case "daviddm@students.national-u.edu.ph":
            System.out.println("Valid ");
            break;
            default:
            System.out.println("Invalid ");
            break;
    }
}
}
