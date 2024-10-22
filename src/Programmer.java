public class Programmer extends Person {

    private String companyName;

    public Programmer() {
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void coding(){
        System.out.println("Programmer's method " );
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
        return "Programmer{" +
                "  companyName: '" + companyName + '\'' +
                '}'+ super.toString();
    }
}

