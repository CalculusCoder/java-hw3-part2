public class Canary extends Bird{  //inheriting properties and methods from Bird Class
    protected String color;

    //Constructor with super method. Inheriting fields from Bird Class
    public Canary(String species, int age, String habitat, boolean canFly, String color) {
        super(species, age, habitat, canFly);
        this.color = color;
    }

    //Setters
    public void setColor(String color) {
        this.color = color;
    }

    //Getters
    public String getColor() {
        return this.color;
    }

    //Overriding display info method. Using super to use the display info method from Bird class
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color = " + color);
    }
}
