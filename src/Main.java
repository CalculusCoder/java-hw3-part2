
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Rat", 10, "Eco");
        Bird bird1 = new Bird("talk", 15, "ss", true);
        Canary canary1 = new Canary("Yo", 23, "hab", false, "Red");

        animal1.displayInfo();
        bird1.displayInfo();
        canary1.displayInfo();


    }
}