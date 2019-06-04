package br.com.uol.dates;

public class Day {

    private String name;
    private int dayNumber;
    private int mouth;

    public Day(String name,int dayNumber,int mouth){
        this.name = name;
        this.dayNumber = dayNumber;
        this.mouth = mouth;
    }
    
    public String getName() {
		return name;
	}

    public int getDayNumber() {
		return dayNumber;
	}

    public int getMouth() {
		return mouth;
	}

    @Override
    public String toString() {
        return  name + " (" + dayNumber + "/" + mouth + ")";
    }
}