public class Sample_2 {
    public static void main(String[] args) {

        int[] arr = {3,7,6,3,6,4,5};

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 5){
                continue;
            }
            System.out.println(i + ":" + arr[i]);

        }

    }
}

/*
for (int i =1;i<11 ;i++){
    System.out.println(i + ":\t test");
        }
*/

/*
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }*/
/*
        boolean isOK = true;

        do {
            System.out.println("Jest OK!");

        } while (isOK);

        System.out.println("Nie jest dobrze!");*/

/*
int[] arr = new int[1000];

        for (int i = 0; i < 1000; i++) {
        arr[i] = 4;
        if (i==100){
            arr[i] = 5;
        }
        }

        for (int i : arr) {
            if (i == 5){
                System.out.println("zatrzymane: " + i);
                break;
            }

            System.out.println(i);

        }
    }
*/

