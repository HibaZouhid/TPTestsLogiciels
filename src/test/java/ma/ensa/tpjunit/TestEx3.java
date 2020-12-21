package ma.ensa.tpjunit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.IfProfileValue;

import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class TestEx3 {
    @Mock
    IFacture iFacture;


    @Test
    public void testFraisInclu(){
        when(iFacture.getFrais(500.0)).thenReturn(45.0);
        Assert.assertEquals(45.0,iFacture.getFrais(500),0);
    }

    @Test
    public void testFraisExclu(){
        when(iFacture.getFrais(700.0)).thenReturn(0.0);
        Assert.assertEquals(0.0,iFacture.getFrais(700),0);
    }

   @Test
    public void negatifMontant(){
        when(iFacture.getFrais(-2)).thenThrow(new IllegalArgumentException());
       try {
           iFacture.getFrais(-2);
           Assert.fail("IllegalArgumentException non levée avec négatif montant");
       } catch (IllegalArgumentException iae) {}
   }
}
