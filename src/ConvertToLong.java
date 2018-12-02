public class ConvertToLong {
    public static void main(String[] args) {

        String input;
        long number = 0;

        if (args.length > 0) {
            input = args[0];

            switch (input) {

                case "Jeden":
                    number = 1;
                    break;
                case "Dwa":
                    number = 2;
                    break;
                case "Trzy":
                    number = 3;
                    break;
                case "Cztery":
                    number = 4;
                    break;
                case "Pięć":
                    number = 5;
                    break;
                case "Sześć":
                    number = 6;
                    break;
                case "Siedem":
                    number = 7;
                    break;
                case "Osiem":
                    number = 8;
                    break;
                case "Dziewięć":
                    number = 9;
                    break;
                case "Dziesięć":
                    number = 10;
                    break;
            }

            System.out.println(number);

        }
    }
}