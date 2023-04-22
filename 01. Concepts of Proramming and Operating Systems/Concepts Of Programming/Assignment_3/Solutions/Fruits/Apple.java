public class Apple extends Fruit{

    public Apple(String name, double weight, String colour, boolean fresh){
        super(name, weight, colour, fresh);
        this.name = name;
        this.weight = weight;
        this.colour = colour;
        this.fresh = fresh;
    }
    @Override
    public String taste() {
        System.out.println("\nCan you identify the taste?");
        return "Sweet and Sour";
    }

    public void jam(){
        System.out.println("Name of Fruit: " + this.name + "\n---Making Jam---");
    }

}
