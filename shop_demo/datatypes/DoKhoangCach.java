package bu3_training.shop_demo.datatypes;

public class DoKhoangCach {
    public static void main(String[] args) {
        double distance = 2500;
        int hour = 5;
        int minutes = 56;
        int seconds = 23;

        double giay = hour*3600 + minutes*60 + seconds;

        double tocDoMS = distance/giay;
        System.out.println(" Tốc độ = "+ String.format("%.8f",tocDoMS) +"m/s");
        double tocDoKM= tocDoMS * 3.6;
        System.out.println(" Tốc độ = "+ String.format("%.8f",tocDoKM) +"k/s");

    }
}
