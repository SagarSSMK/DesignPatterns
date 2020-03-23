package lazyinitialization;

public class CaptainRunner {

    public static void main(String[] args) {

        Captain captain= Captain.getCaptain();

        Long roundUpTime=Math.round( (double)( (double)System.currentTimeMillis()/(double)(900000) ) ) * (900000)/1000;

        System.out.println(roundUpTime);
    }
}
