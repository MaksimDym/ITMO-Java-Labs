package Lab3;
import java.time.LocalDate;

public class House {
    private int numberOfFloors;
    private int yearBuilt;
    private String name;

    public void setValues(int numberOfFloors, int yearBuilt, String name) {
        this.numberOfFloors = numberOfFloors;
        this.yearBuilt = yearBuilt;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Характеристика: " + name);
        System.out.println("Этажей в доме: " + numberOfFloors);
        System.out.println("Год постройки: " + yearBuilt);
        System.out.println("Лет с момента постройки: " + getYearsSinceBuilt());
        System.out.println();
    }

    public int getYearsSinceBuilt() {
        return LocalDate.now().getYear() - yearBuilt;
    }
}
