public class Animal {
    protected String species;
    protected int age;
    protected String habitat;

    //constructor
    public Animal (String species, int age, String habitat) {
        this.species = species;
        this.age = age;
        this.habitat = habitat;
    }

    //setters
    public void setSpecies(String species) {
        this.species = species;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    //getters
    public String getSpecies() {
        return this.species;
    }
    public int getAge() {
        return this.age;
    }
    public String getHabitat() {
        return this.habitat;
    }


    public void displayInfo() {
        System.out.println("Species = " + species + ", Age = " + age + ", Habitat = " + habitat);
    }
}
