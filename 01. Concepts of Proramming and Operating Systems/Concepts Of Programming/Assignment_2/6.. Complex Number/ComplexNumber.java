package ConceptsOfProgramming.Assignment_2.ComplexNumber;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public void setReal(int real) {
        this.real = real;
    }

    public int getReal(){
        return real;
    }

    public void setImaginary(int imaginary){
        this.imaginary = imaginary;
    }

    public int getImaginary(){
        return imaginary;
    }

    public void displayNumber(){
        System.out.println("Your Complex number is: " + real + " + " + imaginary + "i");
    }

}
