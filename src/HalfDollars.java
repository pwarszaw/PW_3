public class HalfDollars {
    public static void main(String[] args) {

        int[] denver = {1_700_000, 4_600_000, 2_100_000};
        int[] philadelphia = {1_800_000, 5_000_000, 2_500_000};
        int[] total = new int[denver.length];
        int sum = 0;

        for (int i = 0; i < denver.length ; i++) {
        total[i] = denver[i] + philadelphia[i];
            System.out.println("Produkcja w " + (2012 + i) + " roku: ");
            System.out.format("%,d%n", total[i]);
            sum = total[i];
        }

        System.out.println(sum / denver.length);
/*
        for (int i = 0; i <= 2; i++) {
            average = total[i] + average;
        }
*/

      /*  total[0] = denver[0] + philadelphia[0];
        total[1] = denver[1] + philadelphia[1];
        total[2] = denver[2] + philadelphia[2];*/
/*

        average = (total[0] + total[1] + total[2])/3;

        for (int i = 0; i <=2 ; i++) {
            System.out.print("Produkcja w 201" + (i+2) + ": ");
            System.out.format("%,d%n", total[i]);
        }

        System.out.print("ś".toUpperCase() + "rednia produkcja: ");
        System.out.format("%,d%n", average);


        int[][][] arr3D = new int [4][][];
        arr3D[0] = new int[10][];
*/


    }

}
