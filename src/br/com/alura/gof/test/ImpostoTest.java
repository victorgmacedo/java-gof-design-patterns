package br.com.alura.gof.test;

import br.com.alura.gof.imposto.CalculadoraDeImpostos;
import br.com.alura.gof.imposto.ICMS;
import br.com.alura.gof.imposto.ISS;
import br.com.alura.gof.model.Orcamento;

import java.math.BigDecimal;

public class ImpostoTest {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        System.out.println(new CalculadoraDeImpostos().calcular(orcamento, new ICMS(null)));
        System.out.println(new CalculadoraDeImpostos().calcular(orcamento, new ISS(null)));
    }

}
