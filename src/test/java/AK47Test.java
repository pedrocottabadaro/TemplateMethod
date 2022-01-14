import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AK47Test {
        @Test
        void deveRetonarRegistrada() {
            AK47 arma = new AK47();
            arma.setNome("KLASHNIKOV Curta");
            arma.setId(5);
            assertEquals("Arma registrada", arma.verificaID());
        }

        @Test
        void deveRetonarNaoRegistrada() {
            AK47 arma = new AK47();
            arma.setNome("KLASHNIKOV Extendida");
            arma.setId(20);
            assertEquals("Arma nao registrada", arma.verificaID());
        }

        @Test
        void deveRetornarInfo() {
            AK47 arma = new AK47();
            arma.setId(3);
            arma.setBala("7.62");
            arma.setNome("AK47-u");
            arma.setPente(30);
            assertEquals("{Nome=AK47-u, Bala='7.62', Pente=30, id=3}", arma.getInfoArma());
        }
}