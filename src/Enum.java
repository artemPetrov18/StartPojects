import java.util.ArrayList;
import java.util.List;

public class Enum {
    public static void main(String[] args) {
        Today td=new Today(Days.MONDAY);
        td.dayInfo();

        Today td1=new Today(Days.THURSTDAY);
        td1.dayInfo();

        System.out.println(Days.THURSTDAY);

        Days d1=Days.valueOf("MONDAY");
        System.out.println(d1);

        List<Days> arr=List.of(Days.values());
        System.out.println(arr);


    }
}


class Today{
   private Days day;

    public Today(Days day) {
        this.day = day;
    }

    void dayInfo(){
        switch(day){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSTDAY:
            case FRIDAY:
                System.out.println("Work time");
                break;
            case SUNDAY:
            case SATURDAY:
                System.out.println("relex time");
                break;
        }
        System.out.println("День по счету "+day.getDayCount());

    }

}



enum Days{
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSTDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int DayCount;
   Days (int DayCount){
      this.DayCount=DayCount;


  }
  public int getDayCount(){
      return DayCount;
  }

}