public class Country extends City  {

    private double population;
    private String language;

    public Country(String name, double square,double population, String language){
        super(name, square);
        this.population = population;
        this.language = language;
    }


    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void countryMethod(){
        System.out.println("Country's method ");
    }


}
