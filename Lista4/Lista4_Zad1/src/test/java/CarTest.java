import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    Car car;
    @BeforeEach
    public void somestupidname() {
        System.out.println("Zaczynamy test jednostkowy");
        car=new Car(Brand.BMW, 306, LocalDate.of(2017, 12, 17), LocalDate.of(2019, 3, 19));
    }
    @Test
    public void horsePowerToWattsConversionTest(){
        assertEquals((car.getHorsePower()*745.699872), car.horsePowerToWats(car.getHorsePower()));
        System.out.println("Test 1 passed");
    }
    @Test
    public void ageOfCarTest(){
        assertEquals((LocalDate.now().getYear()-car.getDateOfProduction().getYear()), car.ageOfCar(car.getDateOfProduction()));
        System.out.println("Test 2 passed");
    }
    @Test
    public void inspectionIsEffectualTest(){
        assertTrue(car.inspectionIsEffectual(car.getDateOfLastInspection()));
        System.out.println("Test 3 passed");
    }
}
