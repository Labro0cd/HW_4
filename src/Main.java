public class Main {
    public static void main(String[] args) {
        // Задание 1
        int age = 24;
        if (age>=18){
            System.out.println("Вам больше 18 лет");
        }else {
            System.out.println("Возраст совершенолетия еще не наступил");
        }
        // задание 2
        int temperature = 5;
        if(temperature>=5){
            System.out.println("На улице: "+temperature+" градусов. Можно идти без шапки.");
        }else if (temperature<=-5) {
            System.out.println("На улице: "+temperature+" градусов. Нужно надеть шапку.");
        }else{
            System.out.println("На улицу: "+temperature+" градусов.");
        }
        // задание 3
        int speed = 150;
        System.out.print("Если скорость "+speed+", ");
        if (speed>60){
            System.out.println("придеться заплатить штраф.");
        }else if(speed<60){
            System.out.println("можно ездить спокойно.");
        }
        // Задание 4

        int ageHuman = 24;
        if (ageHuman>=2&&ageHuman<=6){
            System.out.println("Если человеку "+ageHuman+",то ему нужно ходит в детский сад.");
        }else if (ageHuman>=7&&ageHuman<=17){
            System.out.println("Если человеку "+ageHuman+",то ему нужно ходит в школу.");
        }else if (ageHuman>=18&&ageHuman<=24){
            System.out.println("Если человеку "+ageHuman+",то ему нужно ходит в университет.");
        }else if (ageHuman>24){
            System.out.println("Если человеку "+ageHuman+",то ему нужно ходит на работу.");
        }
        // Задние 5

        int ageKid = 14;
        if (ageKid<5){
            System.out.println("Если вoзраст ребенка равен "+ageKid+", то ему нельзя кататься на аракционе.");
        }else if (ageKid>=5&&ageKid<14){
            System.out.println("Если вoзраст ребенка равен "+ageKid+", то ему можно кататься в сопровождении.");
        }else if (ageKid>=14){
            System.out.println("Если вoзраст ребенка равен "+ageKid+", то ему можно кататься на атракционе.");
        }
        // задание 6
        int totalSeats = 102;
        int totalSitingPlace = 60;
        int totalStandingPlace = totalSeats-totalSitingPlace;

        int passengers = 100;
        if (passengers<totalSeats){
            if (passengers>totalSitingPlace){
                System.out.println("Вагоне все сидячие места заняты, но есть "+(totalStandingPlace-(passengers-totalSitingPlace))+" стоячих мест.");
            } else if (passengers<totalSitingPlace){
                System.out.println(" Вагоне есть "+(totalSitingPlace-passengers)+" сидячих места и "+totalStandingPlace+" стоячих мест.");
            }
        }else{
            System.out.println("В вагоне нет мест.");
        }
        // Задание 7
        int one=4;
        int two=3;
        int three=5;

        if (one>two&&one>three){
            System.out.println("Число "+one+" самое большое.");
        } else if (two>three&&two>one){
            System.out.println("Число "+two+" самое большое.");
        }else if (three>one&&three>two){
            System.out.println("Число "+three+" самое большое.");
        }
    }
}