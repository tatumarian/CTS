
public class CalendarulUtil {
	   public String weekDay(int day) throws IEDay{
	        if (day == 1)
	            return "Sunday";
	        else if (day == 2)
	            return "Monday";
	        else if (day == 3)
	            return "Tuesday";
	        else if (day == 4)
	            return "Wednesday";
	        else if (day == 5)
	            return "Thursday";
	        else if (day == 6)
	            return "Friday";
	        else if (day == 7)
	            return "Saturday";
	        throw new IEDay("only 7 days in a week");
	    }

	    public String weekDay2(int day) throws IEDay {
	        switch (day) {
	            case 1:
	                return "Sunday";
	            case 2:
	                return "Monday";
	            case 3:
	                return "Tuesday";
	            case 4:
	                return "Wednesday";
	            case 5:
	                return "Thursday";
	            case 6:
	                return "Friday";
	            case 7:
	                return "Saturday";
	            default:
	            	throw new IEDay("only 7 days in a week");
	        }
	    }
	
	
	public String weekDay3(int day) throws IEDay {
		String [] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		if(day<=0||day>7)
			throw new IEDay("only 7 days in a week");
		return days[day-1];
	}

}
