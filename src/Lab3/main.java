package Lab3;

public class main {
    public static void main(String[] args) {

        //ex1
        Study myStudy = new Study("Изучение Java - это просто!");
        System.out.println(myStudy.printCourse());

         //ex2
        Car car1 = new Car("Красный");
        car1.setName("Спорткар");

        Car car2 = new Car("Синий", 2000);
        car2.setName("Седан");


        car1.setColor("Зеленый");
        car2.setWeight(1600);

        //ex3
        House house1 = new House();
        house1.setValues(3, 2000, "Дом у моря");

        House house2 = new House();
        house2.setValues(5, 2015, "Горный дом");


        house1.displayInfo();
        house2.displayInfo();

        //Ex4

        Tree tree1 = new Tree(5, "Дуб");
        Tree tree2 = new Tree(10, false, "Сосна");
        Tree tree3 = new Tree();

        tree1.displayInfo();
        tree2.displayInfo();
        tree3.displayInfo();

    }






}
