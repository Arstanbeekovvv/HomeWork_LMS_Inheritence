public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Mirlan", "Backend", "Peaksoft");
        Singer singer = new Singer("Mirbek", "Kyrgyz Singer", "Single");
        Dancer dancer = new Dancer("Bilal", "Rock", "Bilal Group");

        System.out.println("\n"+programmer);
        programmer.learn(programmer.getName() + ": learning");       programmer.walk(", walking");       programmer.eat(", eating");
        programmer.coding();

        System.out.println("\n" + singer);
        singer.learn(singer.getName()+": learning");        singer.walk(", walking");     singer.eat(", eating");
        singer.singing();   singer.playGuitar();

        System.out.println("\n"+dancer);
        dancer.learn(dancer.getName() + ": learning");     dancer.walk(", walking");    dancer.eat(", eating");
        dancer.dancing();
    }
}