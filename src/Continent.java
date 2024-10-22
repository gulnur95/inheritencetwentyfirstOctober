public class Continent extends City {
    private String nationality;
    private String weather;

    public Continent(String name, double square, String nationality, String weather){
        super(name, square);
        this.nationality = nationality;
        this.weather = weather;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String name) {
        this.nationality = name;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void continentMethod(){
        System.out.println("Continent's method ");
    }




}
