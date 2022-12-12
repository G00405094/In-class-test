package ie.atu.test;

public class Ferry extends Ship{
    private int passengers;

    public Ferry(String name, String year, int crew, int passengers) {
        super(name, year, crew);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return super.toString() + " maximum number of passengers = " + passengers;
    }
}
