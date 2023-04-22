package ConceptsOfProgramming.Assignment_3.abstractMethod;

import java.util.Random;

public class ShapeFactory {
    public static int generateShape(){
        Random random = new Random();
        int upper_bound = 4;
        int num = random.nextInt(upper_bound);

        return num;
    }

}
