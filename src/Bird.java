public class Bird extends Animal { //inheriting properties and methods from Animal Class
    protected boolean canFly;

    //Constructor with super method. Inheriting fields from Animal Class
    public Bird(String species, int age, String habitat, boolean canFly) {
        super(species, age, habitat);
        this.canFly = canFly;
    }

    //Setters
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    //Getters
    public boolean getCanFly() {
        return this.canFly;
    }

    //Overriding display info method. Using super to use the display info method from animal class
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Can it fly = " + canFly);
    }
}
