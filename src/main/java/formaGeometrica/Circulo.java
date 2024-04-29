package formaGeometrica;

public class Circulo implements Forma{
    double raio = 5;


    @Override
    public double calcularArea() {
        return Math.PI*(raio*raio);
    }
}
