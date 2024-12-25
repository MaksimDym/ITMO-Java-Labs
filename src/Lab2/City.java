package Lab2;

public class City {
   String name ;
   int population ;
   double area ;
   String country ;

    public City(){

    }

    public City(String name , int population , double area , String country){
        this.name=name;
        this.population=population;
        this.area=area;
        this.country=country;
    }


    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    public String getCountry() {
        return country;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public  String toString(){
        return "City{" +
                "name='" + name + '\'' +
        ", population=" + population +
                ", area=" + area +
                ", country='" + country + '\'' +
        '}';
    }






}

