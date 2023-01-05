
import Service.ContaEspecialService;
import org.example.ContaEspecial;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ContaBancariaEspecialServiceTest {
    @Test
    public void deveriaSacarAteValorMaximoDoLimite() {
        ContaEspecialService contaEspecialService = new ContaEspecialService();
        Double retorno = contaEspecialService.sacar( new ContaEspecial("Natalia", 001, "abc", "19/04", 1000.00),300.00);
        assertEquals(   Double.valueOf(700.00), retorno);
    }
}
