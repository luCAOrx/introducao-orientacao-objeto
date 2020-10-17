package br.senac.rn.introducaooo.teste;

import br.senac.rn.introducaooo.Conta;
import br.senac.rn.introducaooo.ContaCorrente;
import br.senac.rn.introducaooo.Pessoa;
import br.senac.rn.introducaooo.Sexo;

public class TesteContaCorrente {

    public static void main(String[] args) {

        ContaCorrente contaFlavio = new ContaCorrente();

        Pessoa flavio = new Pessoa();

        flavio.setNome("Flavio Araujo");
        flavio.setSexo(Sexo.MASCULINO);

        contaFlavio.setTitular(flavio);
        contaFlavio.setAgencia("1234-8");

        contaFlavio.deposita(800.0);

        System.out.println(contaFlavio);

        ContaCorrente contaCaio = new ContaCorrente();

        Pessoa caio = new Pessoa();

        caio.setNome("Caio Cesar");
        caio.setSexo(Sexo.MASCULINO);

        contaCaio.setTitular(caio);
        contaCaio.setAgencia("1478-3");
        contaCaio.setLimite(500.0);

        contaCaio.deposita(1000.0);

        System.out.println(contaCaio);

        contaCaio.transfere(contaFlavio, 1200.0);

        System.out.println(contaFlavio);
        System.out.println(contaCaio);

    }

}
