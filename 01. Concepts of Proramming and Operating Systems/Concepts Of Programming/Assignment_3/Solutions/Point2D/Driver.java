import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many points do you wish to plot: ");
        int num = in.nextInt();

        Point2D [] point = new Point2D[num];
        int index=0;

        for (int i=0 ; i<num ; i++){
            System.out.println("\nEnter the X and Y coordinates of your Points: ");
            point[i] = new Point2D(in.nextInt(),in.nextInt());
            index++;
        }

        for (Point2D p: point) {
            if (p!=null) {
                System.out.println("\nX and Y co-ordinates are: \n" + p.show());
            }
        }


        System.out.println("\nEnter 2 more Indices: ");
        System.out.println("X and Y coordinates of 1st Index");
        Point2D a = new Point2D(in.nextInt(),in.nextInt());

        System.out.println("X and Y coordinates of 1st Index");
        Point2D b = new Point2D(in.nextInt(),in.nextInt());

        boolean ans = a.isEqual(b);
        if(ans == true){
            System.out.println("Your Indices are same");
        }
        else {
            System.out.println("Your Indices are different");
                double distance = Math.round(a.calculateDistance(b));
                System.out.println("Distance between your points is: " + distance + " Units");

        }
    }
}
