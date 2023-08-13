import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      System.out.println(getDiff(
        new Date(13,8,2023),
        new Date(26,11,2023)
        ));
    }
    
    public static int getDiff(Date first, Date second){
      int minYear = first.year < second.year ? first.year : second.year;
      minYear = minYear-1;
      int diff1 = getDiffWithRef(first, minYear);
      int diff2 = getDiffWithRef(second, minYear);
      
      return (diff1 > diff2) ? (diff1-diff2) : (diff2 - diff1);
      
    }
    
    private static int getDiffWithRef(Date date, int refYear){
      int years = date.year - refYear;
      int monthDiff = date.month;
      int dayDiff = date.day;
      return years*365+ getNumberOfDays(monthDiff-1)+dayDiff;
    }
    
    private static int getNumberOfDays(int month){
      int days = 0;
      for(int i = 0; i< month; i++ ){
        days += Constants.days[i];
      }
      return days;
    }
  
}

class Date{
  int day;
  int month;
  int year;
  
  Date(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }
}

class Constants{
  public static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  public static String[] month = {"JAN","FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
  
}
