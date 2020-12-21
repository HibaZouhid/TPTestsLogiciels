package ma.ensa.tpjunit;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestPPCM {
    PPCM ex2=new PPCM();

    @Test
    public void sup(){
        Assert.assertEquals(6,ex2.ppcm(3,2));
    }

    @Test
    public void inf(){
        Assert.assertEquals(4,ex2.ppcm(2,4));
    }

    @Test
    public void egal(){
        Assert.assertEquals(23,ex2.ppcm(23,23));
    }


}
