public class Singer extends Person {

    String bandName;

    public Singer() {
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void singingMethod(){
        System.out.println("Singer's method ");
    }

    public void playGuitarMethod(){
        System.out.println("playGuitar method ");
    }

    @Override
    public void learnMethod() {
        super.learnMethod();
    }

    @Override
    public void walkMethod() {
        super.walkMethod();
    }

    @Override
    public void eatMethod() {
        super.eatMethod();
    }

    @Override
    public String toString() {
        return "Singer {" +
                " bandName: '" + bandName + '\'' +
                '}'+super.toString();
    }
}
