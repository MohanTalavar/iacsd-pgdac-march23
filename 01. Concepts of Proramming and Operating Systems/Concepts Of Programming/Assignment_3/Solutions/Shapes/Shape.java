package ConceptsOfProgramming.Assignment_3.abstractMethod;

public abstract class Shape {
    protected String x;
    protected String y;
    public abstract double area();

    public String toString(){
        return x + y;
    }
}
