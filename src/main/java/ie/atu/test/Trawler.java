package ie.atu.test;

public class Trawler extends Ship{
    private int cargo;

    public Trawler(String name, String year, int crew, int cargo) {
        super(name, year, crew);
        this.cargo = cargo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    @Override
    public String vesselDetails() {
        return super.vesselDetails() + " Cargo in tonnage = " + cargo;
    }
}
