package ConceptsOfProgramming.Assignment_3.abstractMethod;

public class Square extends Shape{

    private int side;

    public double area(){
        double area = side * side;
        return area;
    }

    public void setSide(int side){
        this.side = side;
    }
}
