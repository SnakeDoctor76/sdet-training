package loops;

public class Loops {

	public static void main(String[] args) {
		
		String str = "We have a large inventory of things in our warehouse falling in the category:apperal and the slighty " 
		+ "more in demand category:makeup along with the category:furniture and. category:mata gerf  wld lwd wld lqwd category:tactu.. ";
		
		printCategories(str);
		
	}
	
	public static void printCategories(String string) {
		
		String category = "category:";
		
		
		while(string.indexOf(category) != -1) {
		
			int firstIndex = string.indexOf(category) + category.length();
			int lastIndex = string.indexOf(" ", firstIndex);
			String finalString = string.substring(firstIndex, lastIndex);
			string = string.substring(lastIndex);
		
			
			System.out.println(finalString);
			
		}
		
			
			
			
			
		
	}

}
