import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Veiculo;
import org.junit.jupiter.api.Test;

public class VeiculoTest {

    @Test
    void calcularCustoSemDesconto() {
        Veiculo veiculo = new Veiculo("Fiat-Uno", 10.0);
        double custo = veiculo.calcularCusto(3); // 3 dias, sem desconto
        assertEquals(30.0, custo); // 10 * 3
    }

    @Test
    void calcularCustoComDesconto() {
        Veiculo veiculo = new Veiculo("Fiat-Uno", 10.0);
        double custo = veiculo.calcularCusto(7); // 7 dias, com 10% de desconto
        // valor original: 10 * 7 = 70 → desconto de 7.0 → total = 63.0
        assertEquals(63.0, custo);
    }

    @Test
    void descontoComMenosDe7Dias() {
        Veiculo veiculo = new Veiculo("Fiat-Uno", 10.0);
        double desconto = veiculo.desconto(3); // Sem desconto
        assertEquals(0.0, desconto);
    }

    @Test
    void descontoCom7Dias() {
        Veiculo veiculo = new Veiculo("Fiat-Uno", 10.0);
        double desconto = veiculo.desconto(7); // 10 * 7 = 70 → 10% = 7.0
        assertEquals(7.0, desconto);
    }

    @Test
    void calcularMultaComAtraso() {
        Veiculo veiculo = new Veiculo("Fiat-Uno", 10.0);
        double multa = veiculo.calcularMulta(2); // 2 dias de atraso → 2 * 50 = 100
        assertEquals(100.0, multa);
    }

    @Test
    void calcularMultaSemAtraso() {
        Veiculo veiculo = new Veiculo("Fiat-Uno", 10.0);
        double multa = veiculo.calcularMulta(0); // 0 dias → sem multa
        assertEquals(0.0, multa);
    }
}
