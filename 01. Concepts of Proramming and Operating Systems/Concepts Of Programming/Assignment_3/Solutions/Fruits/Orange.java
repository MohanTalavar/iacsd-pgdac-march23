public class Orange extends Fruit{

    public Orange(String name, double weight, String colour, boolean fresh){
        super(name, weight, colour, fresh);
        this.name = name;
        this.weight = weight;
        this.colour = colour;
        this.fresh = fresh;
    }
    @Override
    public String taste() {
        System.out.println("\nCan you identify the taste?");
        return "No specific taste";
    }

    public void juice(){
        System.out.println("\nFruit name: " + name + "Weight" + weight + "\n---Extracting juice---");
    }

}
