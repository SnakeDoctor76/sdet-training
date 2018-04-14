
public class Time {

	public static void main(String[] args) {
		
		int hour = 13;
		int minute = 38;
		int seconds = 14;
		
		System.out.println("Seconds passed from midnight: " + (hour * 3600 + minute * 60 + seconds));
		System.out.println("Seconds left to midnight: " + ((24-13) * 3600 + (60-38) * 60 + (60-14)));
		
		
		
		double percentageOfDay = (double) 13 / 24 *100;
		
		System.out.println(percentageOfDay);
		
		int hour2 = 13;
		int minute2 = 51;
		int seconds2 = 13;
		
		System.out.println("Time elapsed from beginning of exerices: " + (hour2-hour) + " hours "+ (minute2-minute) + " minutes and "
		                   + (seconds2-seconds) + " seconds");
		
		
		

	}

}
