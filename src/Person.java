public class Person {

    private String name;
    private String designation;

    public Person() {
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void learnMethod() {
        System.out.println(name + " is learning.");
    }

    public void walkMethod() {
        System.out.println(name + " is walking.");
    }

    public void eatMethod() {
        System.out.println(name + " is eating.");
    }


    @Override
    public String toString() {
        return "\nPerson {" +
                "  name:  '" + name + '\'' +
                ",   designation:  '" + designation + '\'' +
                '}';
    }
}
