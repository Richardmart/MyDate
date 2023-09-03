/*
 * Richard Martinez
 * 9/03/2023
 * Exercise 10.14 MyDate class
 * Create a MyDate class that can accept a year, month, day in int to make an object
 * Use current time in milliseconds to make an object,
 * Use set time in miliseconds to make an object
 * Has getter methods to return year, month, or day
 * setDate method to set date using milliseconds
 */
public class TestMyDate {
    public static void main(String[] args){
        //Create first MyDate object using current date
        MyDate myDate1 = new MyDate();
        //Create second MyDate object using time in milliseconds
        MyDate myDate2 = new MyDate(34355555133101L);
    }

}

class MyDate {
    //Create datafields for MyDate class
    int year;
    //month is 0 based, Jan starts at 0. Dec is 11
    int month;
    int day;
    //no-arg constructor creates with current date
    public MyDate(){

    }
    //constructor using elapsed time in milliseconds
    public MyDate(long elapsedTime){

    }
    //constructor using specified year, month, and day inputted
    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //get year
    public int getYear(){
        return year;
    }
    //get month
    public int getMont(){
        return month;
    }
    //get day
    public int getDay(){
        return day;
    }
    //set date using long in miliseconds
    public void setDate(long elapsedTime){
         
    }
}