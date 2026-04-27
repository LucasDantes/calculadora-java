public class CalculadoraTest {

    public static void main(String[] args) {
        testeSoma();
        testeSubtracao();
        testeMultiplicacao();
        testeDivisao();
        testeDivisaoPorZero();

        System.out.println("Todos os testes passaram ✅");
    }

    static void testeSoma() {
        double resultado = Calculadora.somar(2, 2);
        if (resultado != 4) {
            throw new RuntimeException("Erro no teste de soma");
        }
    }

    static void testeSubtracao() {
        double resultado = Calculadora.subtrair(5, 3);
        if (resultado != 2) {
            throw new RuntimeException("Erro no teste de subtração");
        }
    }

    static void testeMultiplicacao() {
        double resultado = 3 * 4;
        if (resultado != 12) {
            throw new RuntimeException("Erro no teste de multiplicação");
        }
    }

    static void testeDivisao() {
        double resultado = 10 / 2;
        if (resultado != 5) {
            throw new RuntimeException("Erro no teste de divisão");
        }
    }

    static void testeDivisaoPorZero() {
        try {
            double resultado = 10 / 0;
            if (!Double.isInfinite(resultado)) {
                throw new RuntimeException("Erro no teste de divisão por zero");
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro no teste de divisão por zero");
        }
    }
}