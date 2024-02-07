package Part2;

import java.lang.*;
import java.util.Scanner;

public class Input
{
    Scanner s = new Scanner(System.in);
    public double[] input2Numbers() {
        System.out.println("Enter first number: ");
        double a = s.nextDouble();
        System.out.println("Enter second number: ");
        double b = s.nextDouble();
        double[] nos = new double[2];
        nos[0] = a;
        nos[1] = b;
        return nos;
    }
}