import java.text.ListFormat.Style;
import java.util.Scanner;

public class U2_Operator {
    public static void main(String[] args) {
        

    // 1. WAP to to print the sum of two numbers enter by user.

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the two numbers: ");

    // int num1 = sc.nextInt();
    // int num2 = sc.nextInt();

    // int sum = num1 + num2;
    // System.out.println("Sum = " + sum);


    // 2. WAP to calculate the square of a number entered by user.

    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter a number: ");
    // int num = sc.nextInt();
    // int square = num * num;
    // System.out.println("Square = " + square);



    // 3. WAP to calculate the area of a rectangle using user input. 

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the length of rectangle: ");
    // float length = sc.nextFloat();

    // System.out.print("Enter the width of rectangle: ");
    // float width = sc.nextFloat();

    // float area = length * width;
    // System.out.println("The area of rectangle: " + area);



    // 4. WAP to calculate the area of a circle. Take radius from the user and display in format: "Area of circle is A having the radius R" 

    // Scanner sc = new Scanner(System.in);

    // float pi = 3.14f, radius;
    // System.out.print("Enter the radius of circle: ");
    // radius = sc.nextFloat();
    
    // float area = pi * (radius * radius);
    // System.out.println("Area of circle is " + area + " having the radius " + radius);



    // 5. WAP to calculate the average of three integers. 

    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter the three numbers: ");
    // float num1 = sc.nextFloat(), num2 = sc.nextFloat(), num3 = sc.nextFloat();

    // float average = (num1 + num2 + num3 ) / 3;
    // System.out.println("The average of number are: " + average);



    // 6. WAP to calculate the circumference of a circle. 

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the radius: ");

    // float radius = sc.nextFloat();

    // float pi = 3.14f, circumference = 2*pi*radius;
    // System.out.println("The circumference of circle is: " + circumference);



    // 7. WAP to calculate the simple interest

    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter the amount: ");
    // float principle = sc.nextFloat();

    // System.out.print("Enter the rate: ");
    // float rate = sc.nextFloat();

    // System.out.print("Enter the time: ");
    // float time = sc.nextFloat();

    // float SimpleInterest = (principle * rate * time ) / 100;

    // System.out.println("Simple Interest of " + principle + " where rate is " + rate + "% and time is " + time + " years, SI = " + SimpleInterest);



    // 8. WAP to calculate the volume of a cuboid. 

    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter the length, width and height: ");
    // float length = sc.nextFloat(), width = sc.nextFloat(), height = sc.nextFloat();

    // float volume = length * width * height;
    // System.out.println("The volume of cuboid is: " + volume);



    // 9. WAP to input a character from the user and print its ASCII code.
    
    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter a character: ");
    // char letter = sc.next().charAt(0);
    // // char letter = sc.next().toCharArray()[0];  //  convert to char array and pick first

    // System.out.println("Your given character " + "\"" + letter + "\"" + ", there ASCI code: " + (int)letter);



    // 10. WAP to input an ASCII code from the user and print its corresponding character.
    
    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter the ASCII code: ");
    // int ASCIICode = sc.nextInt();

    // System.out.println("Your given ASCII code " + "\"" + ASCIICode + "\"" + ", and there character is: " + "\"" + (char) ASCIICode + "\"");



    // 11. WAP to input three characters from the user and display them with their ASCII codes.

    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter the three character: ");

    // char Fcharacter1 = sc.next().charAt(0);
    // char Fcharacter2 = sc.next().charAt(0);
    // char Fcharacter3 = sc.next().charAt(0);

    // System.out.println("First Character: " + Fcharacter1 + "\t\t\tASCII Code: " + (int) Fcharacter1);
    // System.out.println("Second Character: " + Fcharacter2 + "\t\t\tASCII Code: " + (int) Fcharacter2);
    // System.out.println("Third Character: " + Fcharacter3 + "\t\t\tASCII Code: " + (int) Fcharacter3);



    // 12. WAP to take a date as input in "DD/MM/YYYY" format and display it as: "Day - DD, Month - MM, Year - YYYY" 

    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter the date in this format DD/MM/YYYY: ");
    // String date = sc.next();

    // String[] parts = date.split("/");

    // System.out.println("Day: " + parts[0] + "\nMonth: " + parts[1] + "\nYear: " + parts[2]);




    // 13. WAP to  take time as input in "HH:MM" format and display it as: "HH hour and MM minutes" 

    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter the time in HH:MM format: ");

    // String date = sc.next();
    // String[] parts = date.split(":");

    // System.out.println("Hours: " + parts[0] + "\nMinutes: " + parts[1]);



    // 14. WAP to input a floating-point number and print it with 2, 4, and 6 decimal places. 

    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter the number: ");
    // double number = sc.nextDouble();

    // System.out.printf("Number with 2 decimal places: %.2f%n", number);
    // System.out.printf("Number with 4 decimal places: %.4f%n", number);
    // System.out.printf("Number with 6 decimal places: %.6f%n", number);

    // sc.close();    



    // 15. WAP to input time in seconds and convert to HH:MM:SS format.

    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter the time in this format: HH:MM:SS = ");

    // String time = sc.next();

    // String[] timeTrim = time.split(":");

    // System.out.println("Hour: " + timeTrim[0]);
    // System.out.println("Minute: " + timeTrim[1]);
    // System.out.println("Second: " + timeTrim[2]);



    
    // 16. WAP to take a number and print it in binary, octal, and hexadecimal.

        // Scanner sc= new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();

        // String binary = Integer.toBinaryString(num);
        // String octal = Integer.toOctalString(num);
        // String hexadecimal = Integer.toHexString(num);

        // System.out.println("Decimal: " + num);
        // System.out.println("Binary: " + binary);
        // System.out.println("Octal: " + octal);
        // System.out.println("Hexadecimal: " + hexadecimal.toUpperCase());


    
    }
}
