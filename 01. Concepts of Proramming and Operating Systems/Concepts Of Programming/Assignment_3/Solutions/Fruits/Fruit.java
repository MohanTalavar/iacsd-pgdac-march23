public class Fruit {

    protected String colour;
    protected double weight;
    protected String name;
    protected boolean fresh;

    public Fruit(String name, double weight, String colour, boolean fresh){
        this.name = name;
        this.weight = weight;
        this.colour = colour;
        this.fresh = fresh;
    }

    @Override
    public String toString(){
        return "\nName: "+ this.name + "\nColour: " + this.colour + "\nWeight: " + this.weight;
    }

    public String taste(){
        System.out.println("\nCan you identify the taste?");
        return "No specific taste";
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public String getColour(){
        return colour;
    }

    public void setFresh(boolean fresh){
        this.fresh = fresh;
    }

    public boolean getFresh(){
        return fresh;
    }

}
