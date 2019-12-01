import java.time.LocalDate;
import java.time.Period;

public class Car {

    private Brand brand;
    private int horsePower;
    private LocalDate dateOfProduction;
    private LocalDate dateOfLastInspection;


    public Car(Brand brand, int horsePower, LocalDate dateOfProduction, LocalDate dateOfLastInspection) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.dateOfProduction = dateOfProduction;
        this.dateOfLastInspection = dateOfLastInspection;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(LocalDate dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public LocalDate getDateOfLastInspection() {
        return dateOfLastInspection;
    }

    public void setDateOfLastInspection(LocalDate dateOfLastInspection) {
        this.dateOfLastInspection = dateOfLastInspection;
    }


     double horsePowerToWats(int horsePower) {
        return  (horsePower * 745.699872);
    }

     int ageOfCar(LocalDate dateOfProduction) {
        return (LocalDate.now().getYear() - dateOfProduction.getYear());
    }

    public boolean inspectionIsEffectual(LocalDate dateOfLastInspection) {
        Period period = Period.between(LocalDate.now(), dateOfLastInspection);
        if(period.getDays()>365)
            return false;
        else
            return true;
    }
}

