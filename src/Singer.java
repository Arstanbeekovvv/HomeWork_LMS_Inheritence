public class Singer extends Person {
    private String groupName;
    public Singer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void singing(){
        System.out.println("Singing: Kechki Bishkek, Seni menen");
    }
    public void playGuitar(){
        System.out.println("Play Guitar? Yes, He is playing guitar!");
    }
    @Override
    public String toString() {
        return "🎤Singer:\n" +
                "groupName = " + groupName  +
                "\n" + super.toString();
    }
}
