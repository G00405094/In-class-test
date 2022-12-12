package ie.atu.test;

public class Ship {
    private String name;
    private String year;
    private int crew;

    public Ship() {
    }

    public Ship(String name, String year, int crew) {
        this.name = name;
        this.year = year;
        this.crew = crew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public String vesselDetails() {
        return "name = "+name+"Year = "+year + "Minimum Number of crew = " + crew;
    }
}
