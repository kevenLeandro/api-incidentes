package br.com.uol.dates;

import java.util.*;

public class BuildListDate {

    private DateTimeUtils data;
    private List<Day> listDays;
    final int initialDay = -1;
    final int currentDay = 9;

    public BuildListDate(){
        this.data = new DateTimeUtils();
        this.listDays = new ArrayList<>();
    }

    public  List<Day> buildDayRange(){
        String name;
        int dayNumber;
        int mouth;

        for (int x = initialDay;x < currentDay+1;x++){

            name = data.getDayName(x);
            dayNumber = data.getDayMonth(x);
            mouth = data.getMonthNumber(x);
            listDays.add(new Day(name,dayNumber,mouth));
        }

        return listDays;

    }
}
