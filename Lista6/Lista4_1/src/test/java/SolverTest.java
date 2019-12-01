import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class SolverTest {
    @Test
    @DisplayName("Bisection")
    void test(){
        Bisection bisection = new Bisection(new TestFunction());
        bisection.solver(0.5, 0.9, 0.01, 50);
        assertEquals(Math.PI/2,bisection.getLastValue());
    }

    @Test
    void test2(){
        RegulaFalsi regulaFalsi = new RegulaFalsi(new TestFunction());
        regulaFalsi.solver(0.5, 1.2, 0.01, 50);
        assertEquals(Math.PI/2,regulaFalsi.getLastValue());
    }

    @Test
    void test3(){
        FixedPiont fixedPiont = new FixedPiont(new TestFunction());
        fixedPiont.solver(0.3,  0.01, 50);
        assertEquals(Math.PI/2,fixedPiont.getLastValue());
    }

    @Test
    void test4(){
        Newton newton = new Newton(new TestFunction());
        newton.solver(0.3, 0.01, 50);
        assertEquals(Math.PI/2,newton.getLastValue());
    }

    @Test
    void test5(){
        Sieczne sieczne = new Sieczne(new TestFunction());
        sieczne.solver(0.9, 0.6, 0.01, 50);
        assertEquals(Math.PI/2,sieczne.getLastValue());
    }

}
