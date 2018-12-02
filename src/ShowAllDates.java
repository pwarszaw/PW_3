public class ShowAllDates {
    public static void main(String[] args) {

        String[] arr = new String[365];
        int year = 2018;
        int month;
        int day;
        int count;

        for (month = 1; month < 13; month++) {
        count = DayCounter.countDays(month,year);
            for (int i = 1; i <= count ; i++) {
            arr[i] = (i + "/" + month + "/" + year);
                System.out.println(arr[i]);
            }
        }


    }

}
