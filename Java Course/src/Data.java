import java.util.Scanner;

public class Data {
    int day;
    int month;
    int year;

    Data(int initialDay, int initialMonth, int initialYear){
        this.day = initialDay;
        this.month = initialMonth;
        this.year = initialYear;
    }

    String formattedData(){
        return String.format("%d/%d/%d", day, month, year);
    }
}
