package ma.ensa.tpjunit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(Suite.class)
@Suite.SuiteClasses(value = {TestEx3.class, TestFacture.class,TestPPCM.class})
public class SuiteTest {
}
