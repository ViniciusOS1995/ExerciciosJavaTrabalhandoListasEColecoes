import java.util.ArrayList;

public class PrincipalStringLista {
    public static void main(String[] args) {
        var listaString = new ArrayList<String>();

        listaString.add("Carro");
        listaString.add("Faca");
        listaString.add("zoo");
        listaString.add("Zabumba");
        listaString.add("Adedonha");

        for (String item : listaString){
            System.out.println(item);
        }
    }
}
