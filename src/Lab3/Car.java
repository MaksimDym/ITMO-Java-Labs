package Lab3;

public class Car {

    private String color;
    private String name;
    private double weight;

    public Car() {

    }

    public Car(String color) {
        this.color = color;
        displayInfo();
    }

    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
        displayInfo();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        displayInfo();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        displayInfo();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        displayInfo();
    }


    private void displayInfo() {
        System.out.println("Цвет: " + color);
        System.out.println("Название: " + name);
        System.out.println("Вес: " + weight + " кг");
        System.out.println();
    }


}
