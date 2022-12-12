package ie.atu.test;

public class VessalApp {
    public static void main(String[] args) {
        Ship boat1 = new Ship("Titanic ","1927 ",6000);
        System.out.println(boat1.toString());

        Ferry boat2 = new Ferry("Atlantic ","2009 ",300,10000);
        System.out.println(boat2.toString());
    }
}
