package IntroducaoMetodos.test;

import IntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNum(20,2); // variavel precisa iniciar com o mesmo tipo que o metodo esta
        System.out.println(result);
    }

}
