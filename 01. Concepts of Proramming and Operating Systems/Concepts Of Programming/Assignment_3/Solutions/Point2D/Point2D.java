package ConceptsOfProgramming.Assignment_3.com.cdac.geometry;

import ConceptsOfProgramming.Assignment_2.Point.Point;

public class Point2D {
    protected int x;
    protected int y;

    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String show(){
        return "X coordinate:" + x + "\nY coordinate: " + y;
    }

    public boolean isEqual(Point2D a){
        if (this.x == a.x && this.y == a.y){
            return true;
        }
        else{
            return false;
        }
    }

    public double calculateDistance(Point2D a){
        double distance= Math.sqrt((this.x- a.x) * (this.x- a.x) + (this.y - a.y) * (this.y - a.y));
        return distance;
    }

}
