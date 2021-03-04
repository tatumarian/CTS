
public class CalendarulUtil {
	public String weekDay3(int day) {
		String [] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		if(day<=0||day>7)
			return null;
		return days[day-1];
	}

}
