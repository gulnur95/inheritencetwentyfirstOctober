
public class Main {
    public static void main(String[] args) {

        /*   LMS  Task    Inheritance
        БУЛ ТАПШЫРМАДА PERSON ДЕГЕН КЛАСС ТУЗОСУЗДОР. ПОЛЕЛЕРИН ЖАНА МЕТОДТОРУН СУРОТТО КОРСОТУЛГОНДОЙ
   КЫЛЫП  ТУЗОСУЗДОР.  АЛ КЛАССТЫ 3 БАШКА КЛАСС МУРАСТАШЫ  КЕРЕК. АЛ 3 КЛАССТЫН ОЗДОРУНУН УНИКАЛДУУ ПОЛЕЛЕРИ ЖАНА
   МЕТОДТОРУ БАР СУРОТТОГУДОЙ. КОНСТРУКТОР ТУЗОСУЗДОР ЖАНА ОЗДОРУНУН УНИКАЛДУУ МЕТОДТОРУН ДА ТУЗОСУЗДОР.
  МЕЙН МЕТОДКО 3 КЛАССТЫН ОБЪЕКТИЛЕРИН ТУЗОСУЗДОР, ПОЛЕЛЕРИНЕ КОНСТРУКТОР МЕНЕН МААНИ БЕРИП,
   КОНСОЛГО TO STRING() МЕТОДУН КОЛДОНУП МААЛЫМАТТАРЫН  ЧЫГАРЫНЫЗДАР.   */


        Programmer programmer = new Programmer("Tommy", "Programmer", "Google");

        System.out.println(programmer.toString());
        programmer.learnMethod();
        programmer.walkMethod();
        programmer.eatMethod();
        programmer.coding();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Dancer dancer = new Dancer("Polly", "Dancer", "Spicy girls");

        System.out.println( dancer.toString());
        dancer.learnMethod();
        dancer.walkMethod();
        dancer.eatMethod();
        dancer.dancing();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Singer singer = new Singer("Enrique", "Singer", "Musicians");
        System.out.println( singer.toString());
        singer.learnMethod();
        singer.walkMethod();
        singer.eatMethod();
        singer.singingMethod();







        /*   Task 1      Inheritance
        Бир парент класс жана анын эки саб классын тузунуз. Парент класска 2 поле 1 метод тузунуз.
Ар бир саб класска экиден уникальный поле бериниз. Main класстан эки саб класстын объектисин тузуп, бардык
маанилерин жана методдорун консольго чыгарыныз.  */

//
//        Country country = new Country("New YORK", 100, 7, "English");
//
//        System.out.println("Country name:  "+country.getName()+"\nSquare:  "+ country.getSquare()+
//                "\nPopulation:  "+country.getPopulation()+ "\nLanguage:  "+country.getLanguage());
//        country.countryMethod();
//
//
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//
//        Continent continent = new Continent("The North America", 1000, "American", "Tropical");
//
//        System.out.println("Continent name: " + continent.getName()+ "\nSquare: "+ continent.getSquare()+
//                "\nNationality: "+ continent.getNationality() + "\nWeather:  " + continent.getWeather());
//
//        continent.continentMethod();









    }
}