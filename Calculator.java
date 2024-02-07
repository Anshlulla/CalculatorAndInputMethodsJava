package Part2;

import java.lang.*;
import java.util.Scanner;

public class Calculator
{
    Input input = new Input();
    public double addition() {
        double[] nos = input.input2Numbers();
        double result = nos[0] +  nos[1];
        return result;
    }

    public double subtraction() {
        double[] nos = input.input2Numbers();
        double result = nos[0] -  nos[1];
        return result;
    }

    public double multiplication() {
        double[] nos = input.input2Numbers();
        double result = nos[0] * nos[1];
        return result;
    }

    public double division() {
        double[] nos = input.input2Numbers();
        double result = nos[0] / nos[1];
        return result;
    }

    public double power() {
        double[] nos = input.input2Numbers();
        double result = Math.pow(nos[0], nos[1]);
        return result;
    }

    public double sqrt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double a = s.nextDouble();
        double result = Math.sqrt(a);
        return result;
    }

    public double mean() {
        Scanner s = new Scanner(System.in);
        double sum=0, n=0;
        do {
            System.out.println("Enter data: ");
            String str = s.next();
            if(str.equals("end")) {
                break;
            }
            else {
                double no = Double.parseDouble(str);
                sum += no;
                n++;
            }
        }while(true);
        double result = sum / n;
        return result;
    }

    public double variance() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many numbers do you want: ");
        double n = s.nextDouble();
        double sum = 0;
        double sumOfSquares = 0;
        for (int i = 1; i<=n; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = s.nextDouble();
            sum += num;
            sumOfSquares += num * num;
        }
        double mean = sum / n;
        double result = sumOfSquares / n - mean * mean;
        return result;
    }
}
