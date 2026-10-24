package animal.proccess;

public class Animal {
    private String name;
    private String specie;

    public Animal(String name, String specie) {
        this.name = name;
        this.specie = specie;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecie() {
        return this.specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

}
