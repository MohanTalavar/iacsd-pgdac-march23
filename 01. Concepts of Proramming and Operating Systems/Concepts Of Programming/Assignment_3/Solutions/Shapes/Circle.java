package ConceptsOfProgramming.Assignment_3.abstractMethod;

public class Circle extends Shape{
    private int radius;

    public double area(){
        double area = 3.14 * radius * radius;
        return area;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }
}
