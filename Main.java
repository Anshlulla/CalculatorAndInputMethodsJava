package Part2;

import java.lang.*;
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Square Root");
            System.out.println("7. Mean");
            System.out.println("8. Variance");
            System.out.println("9: Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();

            switch(choice) {
                case 1:
                    double add = calc.addition();
                    System.out.println("The Sum is: " + add + "\n\n");
                    break;

                case 2:
                    double subtract = calc.subtraction();
                    System.out.println("The Difference is: " + subtract + "\n\n");
                    break;

                case 3:
                    double multiply = calc.multiplication();
                    System.out.println("The Product is: " + multiply + "\n\n");
                    break;

                case 4:
                    double divide = calc.division();
                    System.out.println("The Quotient is: " + divide + "\n\n");
                    break;

                case 5:
                    double pow = calc.power();
                    System.out.println("The Result is: " + pow + "\n\n");
                    break;

                case 6:
                    double sqRoot = calc.sqrt();
                    System.out.println("The Square Root is: " + sqRoot + "\n\n");
                    break;

                case 7:
                    double avg = calc.mean();
                    System.out.println("The Mean is: " + avg + "\n\n");
                    break;

                case 8:
                    double var = calc.variance();
                    System.out.println("The Variance is: " + var + "\n\n");
                    break;

                case 9:
                    System.out.println("Exiting..");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Part2.Input! Try Again..\n\n");

            }
        }while(true);
    }
}