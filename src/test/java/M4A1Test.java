import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class M4A1Test {
    @Test
    void deveRetonarRegistrada() {
        M4A1 arma = new M4A1();
        arma.setNome("M4A1 Extendida");
        arma.setId(40);
        assertEquals("Arma registrada", arma.verificaID());
    }

    @Test
    void deveRetonarNaoRegistrada() {
        M4A1 arma = new M4A1();
        arma.setNome("M4A1-S");
        arma.setId(2);
        assertEquals("Arma nao registrada", arma.verificaID());
    }

    @Test
    void deveRetornarInfo() {
        M4A1 arma = new M4A1();
        arma.setId(56);
        arma.setBala("5.56");
        arma.setNome("M4A1 T");
        arma.setPente(30);
        assertEquals("{Nome=M4A1 T, Bala='5.56', Pente=30, id=56}", arma.getInfoArma());
    }
}