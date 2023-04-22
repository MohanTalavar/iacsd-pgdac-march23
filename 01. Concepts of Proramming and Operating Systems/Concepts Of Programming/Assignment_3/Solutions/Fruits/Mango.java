public class Mango extends Fruit{
    public Mango(String name, double weight, String colour, boolean fresh){
        super(name, weight, colour, fresh);
        this.name = name;
        this.weight = weight;
        this.colour = colour;
        this.fresh = fresh;
    }

    @Override
    public String taste() {
        System.out.println("\nCan you identify the taste?");
        return "Sweet";
    }

    public void pulp(){
        System.out.println("\nName of Fruit: " + name + "Colour: " + colour + "\n---Extracting Pulp---");
    }

}
