
public class Date {

	public static void main(String[] args) {
		
		printAmerican("Monday", "July", "14th", 2022);
		printEuropean("Thrusday", "February", "22nd", 2050);
		
		

	
		
	}
	
	public static void printAmerican(String day, String month, String date, int year) {
		System.out.println("American Format:");
		System.out.println(day + ", " + month + " " + date + ", " + year);
	}
	
	public static void printEuropean(String day, String date, String month, int year) {
		System.out.println("European Format:");
		System.out.println(day + ", " + month + " " + date + ", " + year);
	}

}
