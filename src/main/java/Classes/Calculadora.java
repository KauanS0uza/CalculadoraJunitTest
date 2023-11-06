package Classes;

/**
 * Esta classe representa uma calculadora simples que realiza operações matemáticas básicas.
 */
public class Calculadora {
    /**
     * Realiza a operação de soma entre dois números inteiros.
     *
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return A soma dos dois números.
     */
    public float Soma(int a, int b){
        return a + b;
    }

    /**
     * Realiza a operação de subtração entre dois números inteiros.
     *
     * @param a O número do qual será subtraído.
     * @param b O número a ser subtraído.
     * @return A diferença entre os dois números.
     */
    public float Substracao(int a, int b){
        return a - b;
    }

    /**
     * Realiza a operação de multiplicação entre dois números inteiros.
     *
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return O resultado da multiplicação dos dois números.
     */
    public float Multiplicacao(int a, int b){
        return a * b;
    }

    /**
     * Realiza a operação de divisão entre dois números inteiros.
     *
     * @param a O número a ser dividido (dividendo).
     * @param b O número pelo qual será dividido (divisor).
     * @return O resultado da divisão.
     * @throws ArithmeticException Se ocorrer uma tentativa de divisão por zero.
     */
    public float Divisao(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return (float) a / b;
    }
}
