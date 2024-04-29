import formaGeometrica.Circulo;
import formaGeometrica.Forma;
import formaGeometrica.Quadrado;

import java.util.ArrayList;

public class PrincipalCalculaArea {
    public static void main(String[] args) {
        var quadrado = new Quadrado();
        var circulo = new Circulo();
        ArrayList<Forma> fomas = new ArrayList<>();
        fomas.add(quadrado);
        fomas.add(circulo);

        for(Forma forma : fomas){
            System.out.println("Calculo da area: " + forma.calcularArea());
        }
    }
}
