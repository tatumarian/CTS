
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalendarulUtil cu=new CalendarulUtil();
		try {
			System.out.println(cu.weekDay(3));
			System.out.println(cu.weekDay2(3));
			System.out.println(cu.weekDay3(3));
		} catch (IEDay e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
