package ma.ensa.tpjunit;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class TestFacture {
    Facture facture=new Facture();
    @Test
    public void transportInclu(){
        assertEquals(45,facture.getFraisTransport(400),0);
    }

    @Test
    public void transportExclu(){
        assertEquals(0,facture.getFraisTransport(800),0);
    }

    @Test
    public void montantNegatif(){
        try {
            facture.getFraisTransport(-1);
            Assert.fail("IllegalArgumentException non levée avec négatif montant");
        } catch (IllegalArgumentException iae) {}
    }


}
