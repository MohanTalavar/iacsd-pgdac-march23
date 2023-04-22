package ConceptsOfProgramming.Assignment_2.Point;

public class Point {
    private int x;
    private int y;

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY(){
        return y;
    }

    public void displayData(){
        System.out.println("Value of X: " + x);
        System.out.println("Value of Y: " + y);
    }

}
