package ConceptsOfProgramming.Assignment_2.ComplexNumber;

import java.util.Scanner;

public class TesterComplexNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ComplexNumber num1 = new ComplexNumber();
        int real = num1.getReal();
        int imaginary = num1.getImaginary();

        System.out.println("Your Complex number is: " + real + " + " + imaginary + "i");

        ComplexNumber num2 = new ComplexNumber();
        num2.setReal(32);
        num2.setImaginary(56);

        num2.displayNumber();
    }

}
