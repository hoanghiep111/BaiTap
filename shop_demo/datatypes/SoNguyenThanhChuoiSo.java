package bu3_training.shop_demo.datatypes;

import java.util.Arrays;

public class SoNguyenThanhChuoiSo {
    public static void main(String[] args) {
        long so = 8445631262L;

        String s = String.valueOf(so);

        char[] chu = s.toCharArray();

        Arrays.sort(chu);

        for(int i =0; i<chu.length; i++){
            if(i!=0){
                System.out.print(",");
            }
            System.out.print(chu[i]);
        }






    }
}
