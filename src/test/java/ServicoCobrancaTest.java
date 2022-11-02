import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoCobrancaTest {
    @Test
    void deveExecutarCobranca() {
        IServico servico = ServicoFactory.obterServico("Cobranca");
        assertEquals("Cobrança efetivada", servico.executar());
    }

    @Test
    void deveCancelarCobranca() {
        IServico servico = ServicoFactory.obterServico("Cobranca");
        assertEquals("Cobrança cancelada", servico.cancelar());
    }

}