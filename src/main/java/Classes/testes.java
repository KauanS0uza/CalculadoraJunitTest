package Classes;

public class testes {

      public static void main(String[] args) {
          Calculadora calculo = new Calculadora();
          float s1;
    // testes de soma
    
    // SomaPositivoPositivo
        s1 = calculo.Soma(10, 10);
          System.out.println(s1);
          
    // SomaPositivoNegativo   
        s1 = calculo.Soma(10, -10);
          System.out.println(s1);
    
    // SomaPositivoNegativo
        s1 = calculo.Soma(10, -10);
         System.out.println(s1);

// SomaPositivoZero
        s1 = calculo.Soma(10, 0);
        System.out.println(s1);

// SomaNegativoPositivo
        s1 = calculo.Soma(-10, 10);
        System.out.println(s1);

// SomaNegativoNegativo
        s1 = calculo.Soma(-10, -10);
        System.out.println(s1);

// SomaNegativoZero
      s1 =  calculo.Soma(-10, 0);
      System.out.println(s1);

// SomaZeroPositivo
        s1 = calculo.Soma(0, 10);
        System.out.println(s1);

 // SomaZeroNegativo
        s1 = calculo.Soma(0, -10);
        System.out.println(s1);

// SomaZeroZero
        s1 = calculo.Soma(0, 0);
        System.out.println(s1);

    // testes de subtração

// SubPositivoPositivo
        s1 = calculo.Substracao(10, 10);
        System.out.println(s1);

// SubPositivoNegativo
        s1 = calculo.Substracao(10, -10);
        System.out.println(s1);

// SubPositivoZero
        s1 = calculo.Substracao(10, 0);
        System.out.println(s1);

// SubNegativoPositivo
        s1 = calculo.Substracao(-10, 10);
        System.out.println(s1);

// SubNegativoNegativo
        s1 = calculo.Substracao(-10, -10);
        System.out.println(s1);

// SubNegativoZero
        s1 = calculo.Substracao(-10, 0);
        System.out.println(s1);

// SubZeroPositivo
        s1 = calculo.Substracao(0, 10);
        System.out.println(s1);

//  SubZeroNegativo
        s1 = calculo.Substracao(0, -10);
        System.out.println(s1);

// SubZeroZero
        s1 = calculo.Substracao(0, 0);
        System.out.println(s1);
// testes de multiplicação

// VezesPositivoPositivo
        s1 = calculo.Multiplicacao(10, 10);
        System.out.println(s1);

// VezesPositivoNegativo
        s1 = calculo.Multiplicacao(10, -10);
        System.out.println(s1);

// VezesPositivoZero
        s1 = calculo.Multiplicacao(10, 0);
        System.out.println(s1);

// VezesNegativoPositivo
        s1 = calculo.Multiplicacao(-10, 10);
        System.out.println(s1);

// VezesNegativoNegativo
        s1 = calculo.Multiplicacao(-10, -10);
        System.out.println(s1);

// VezesNegativoZero
        s1 = calculo.Multiplicacao(-10, 0);
        System.out.println(s1);

// VezesZeroPositivo
        s1 = calculo.Multiplicacao(0, 10);
        System.out.println(s1);

//  VezesZeroNegativo
        s1 = calculo.Multiplicacao(0, -10);
        System.out.println(s1);

// VezesZeroZero
        s1 = calculo.Multiplicacao(0, 0);
        System.out.println(s1);

    // testes de divisão

// DivPositivoPositivo
        s1 = calculo.Divisao(10, 10);
        System.out.println(s1);

// DivPositivoNegativo
        s1 = calculo.Divisao(10, -10);
        System.out.println(s1);

// DivPositivoZero
        s1 = calculo.Divisao(10, 0);
        System.out.println(s1);

// DivNegativoPositivo
        s1 = calculo.Divisao(-10, 10);
        System.out.println(s1);

// DivNegativoNegativo
        s1 = calculo.Divisao(-10, -10);
        System.out.println(s1);

// DivNegativoZero
        s1 = calculo.Divisao(-10, 0);
        System.out.println(s1);

// DivZeroPositivo
        s1 = calculo.Divisao(0, 10);
        System.out.println(s1);

//  DivZeroNegativo
        s1 = calculo.Divisao(0, -10);
        System.out.println(s1);

// DivZeroZero
        s1 = calculo.Divisao(0, 0);
        System.out.println(s1);
    }

}
