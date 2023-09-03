public class MyDate {
    //Create datafields for MyDate class
    int year;
    //month is 0 based, Jan starts at 0. Dec is 11
    int month;
    int day;
    //no-arg constructor
    public MyDate(){

    }
    //constructor using elapsed time in milliseconds
    public MyDate(long elapsedTime){

    }
    //constructor using specified year, month, and day inputted
    public MyDate(int year, int month, int day){

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
