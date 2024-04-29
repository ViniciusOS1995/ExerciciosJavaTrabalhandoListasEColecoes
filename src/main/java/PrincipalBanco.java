import banco.ContaBancaria;

import java.util.ArrayList;

public class PrincipalBanco {
    public static void main(String[] args) {
        var c1 = new ContaBancaria(1, 50.50);
        var c2 = new ContaBancaria(2, 100);
        var c3 = new ContaBancaria(3, 1.65);

        ArrayList<ContaBancaria> listaConta = new ArrayList<ContaBancaria>();
        listaConta.add(c1);
        listaConta.add(c2);
        listaConta.add(c3);
        double maiorSaldo = 0;
        int numeroConta = 0;

        for(ContaBancaria conta : listaConta){
            if (conta.getSaldo() > maiorSaldo ){
                maiorSaldo = conta.getSaldo();
                numeroConta = conta.getnConta();
            }
        }
        System.out.println("Maior Saldo é a conta: " + numeroConta + " com o saldo: "+ maiorSaldo);
    }
}
