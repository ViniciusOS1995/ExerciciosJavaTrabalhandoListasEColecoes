import animais.Animal;
import animais.Cachorro;

import java.util.ArrayList;

public class PrincipalAnimal {
    public static void main(String[] args) {
        var dog = new Cachorro("Cão","Caramelo","Vira Lata");
        var cachorio = new Cachorro("Cão", "Rajado", "Fila Brasileiro");
        var cobra = new Animal("Serpente");
        var cavalo = new Animal("Equino");

        var listaAnimal = new ArrayList<Animal>();
        listaAnimal.add(dog);
        listaAnimal.add(cobra);
        listaAnimal.add(cavalo);
        listaAnimal.add(cachorio);

        for(Animal anima : listaAnimal){
            if (anima instanceof Cachorro){
                System.out.println("É um cachorro ele "+ ((Cachorro) anima).getSom());
            }
            System.out.println(anima.toString());
        }

    }
}
