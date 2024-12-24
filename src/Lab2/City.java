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

