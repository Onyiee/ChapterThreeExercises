package numberthreepointonefour;

public class Date {
    private  int month;
    private int day;
    private int year;

    public Date (int myMonth, int myDay,int myYear){
        if(myMonth> 0 && myMonth < 13){
            month = myMonth;
        }
        if(myYear> 1899 && myYear < 2031) {
            year = myYear;
        }
        if(myMonth==4 || myMonth==9 || myMonth ==6 || myMonth== 11 ){
            if (myDay > 0 && myDay < 31){
                day = myDay;
            }
        } else if( myMonth ==2) {
            if (myYear%4==0){
                if(myDay >0 && myDay < 30) {
                    day = myDay;
                }
            } else {
                if(myDay >0 && myDay < 29) {
                    day = myDay;
                }
            }
        } else {
            if(myDay >0 && myDay < 32){
                day=myDay;
            }
        }
    }

    public void setMonth(int myMonth){
        if(myMonth> 0 && myMonth < 13){
            month = myMonth;
        }
    }
    public int getMonth(){
        return month;
    }

    public void setDay(int myDay){
        if(month==4 || month==9 || month ==6 || month== 11 ){
            if (myDay > 0 && myDay < 31){
                day = myDay;
            }
        } else if( month ==2) {
            if (year%4==0){
                if(myDay >0 && myDay < 30) {
                    day = myDay;
                }
            } else {
                if(myDay >0 && myDay < 29) {
                    day = myDay;
                }
            }
        } else {
            if(myDay >0 && myDay < 32){
                day=myDay;
            }
        }
    }
    public int getDay(){
        return day;
    }

    public void setYear(int myYear){
        boolean yearIsValid = myYear> 1899 && myYear < 2031;
        if(yearIsValid) {
            year = myYear;
        }
    }
    public int getYear(){
        return year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
}
