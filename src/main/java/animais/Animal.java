package animais;

public class Animal {
    public Animal(String especie) {
        this.especie = especie;
    }

    String especie;

    @Override
    public String toString() {
        return "especie: " + especie;
    }
}
