package formaGeometrica;

public class Quadrado implements Forma{
    double lado = 5;


    @Override
    public double calcularArea() {
        return lado *lado;
    }
}
