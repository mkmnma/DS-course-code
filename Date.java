/*
 */
package Week2;

/**
 * @author mk_no
 */
public class Date {
    int day;
    int month;
    int year;
    public Date(int d, int m , int y){
        this.day=d;
        this.month=m;
        this.year=y;
    }// Date
    public void setDay(int d){
        if(d > 0 && d <= 31){
            day =d;
        }// if
        else{
            System.out.println("Wrong inputp");
        }
    }// setDay
    public int getDay(){
        return day;
    }//getDay

    public String toString(){
    return day+"-"+month+"-"+year;
    }// toString
    public void addDays(int d){
        day = day + d;
    }
    
    
    
}//class Date

    
    
    
    

