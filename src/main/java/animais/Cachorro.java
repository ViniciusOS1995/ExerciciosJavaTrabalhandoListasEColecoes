package animais;

public class Cachorro extends Animal{
    public Cachorro(String especie, String cor, String raca) {
        super(especie);
        this.cor = cor;
        this.raca = raca;
    }

    String cor;
    String raca;
    String som = "Late";

    public String getSom() {
        return som;
    }

    @Override
    public String toString() {
        return "Especie: " + especie +" Raça: "+ raca+ " Cor: " + cor ;
    }
}
