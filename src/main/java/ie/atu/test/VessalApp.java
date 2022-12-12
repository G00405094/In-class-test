package ie.atu.test;

public class VessalApp {
    public static void main(String[] args) {
        Ship boat1 = new Ship("Titanic ","1912 ",600);
        System.out.println(boat1.vesselDetails());

        Ferry boat2 = new Ferry("Atlantic ","2009 ",300,10000);
        System.out.println(boat2.vesselDetails());

        Trawler boat3 = new Trawler("Trawler ","2022 ",50,500);
        System.out.println(boat3.vesselDetails());
    }
}
