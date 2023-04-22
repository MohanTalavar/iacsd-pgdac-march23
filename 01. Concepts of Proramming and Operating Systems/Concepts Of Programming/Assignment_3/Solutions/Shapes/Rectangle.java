package ConceptsOfProgramming.Assignment_3.abstractMethod;

public class Rectangle extends Shape{
    private int w;
    private int h;

    public double area(){
        double area = w * h;
        return area;
    }

    public void setW(int w){
        this.w = w;
    }

    public void setH(int h){
        this.h = h;
    }
}
