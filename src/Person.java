public class Person {
    private String name;
    private String designation;

    public Person(){}
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

    public void learn(String learn){
        System.out.print(learn);
    }
    public void walk(String walk){
        System.out.print(walk);
    }
    public void eat(String eat){
        System.out.println(eat);
    }
    @Override
    public String toString() {
        return "name: " + name +
                "\ndesignation: " + designation;
    }
}
