public class Dancer extends Person {
    private String bandName;

    public Dancer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public void dancing(){
        System.out.println("Dancing: in America");
    }
    @Override
    public String toString() {
        return "🕺Dancer: \n" +
                "bandName = " + bandName +
                "\n" + super.toString();
    }
}
