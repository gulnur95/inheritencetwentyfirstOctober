public class Dancer extends Person  {

    String groupName;

    public Dancer() {
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void dancing(){
        System.out.println("Dancer's method " );
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
        return "Dancer{" +
                "  groupName: '" + groupName + '\'' +
                '}'+ super.toString();
    }
}
