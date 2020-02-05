import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Count2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		String line = console.nextLine();
		System.out.println();
		System.out.println("Please enter a sequence of strings separated");
		System.out.println("by spaces. The end of the sequence must be signified using");
		System.out.println("the sentinel value lastString, followed by a return.");
		System.out.println();
		//System.out.println();
		line = line.replace("lastString", "");
		//String lineToPrint = line;
		
		//lineToPrint = lineToPrint.trim().toLowerCase();
		//String[] linesplitToPrint = lineToPrint.split(" ");
		//System.out.println("Your original list: "+Arrays.toString(linesplitToPrint));
		line = line.toLowerCase();
		//System.out.println(line);
		line = line.trim();
		
		String[] linesplit = {};
		
		if(line.length() > 0) linesplit = line.split(" ");
		//System.out.println("line:"+line+"end"+line.length());
		
		//Arrays. sort(linesplit);
		
		
		String lineVal = "";
		List<String> myCountList = new ArrayList<String>();
		List<String> processed = new ArrayList<String>();
		for(int i = 0; i<linesplit.length; i++) {
			int count = 0;
			lineVal = linesplit[i];
			boolean isProcessed = CheckIfProcessed(lineVal, processed);
			if(isProcessed == false) {
				for(int j = 0; j<linesplit.length; j++) {
					
					if(linesplit[i].toLowerCase().equals(linesplit[j].toLowerCase())) {
						count++;
						//System.out.println("test:"+lineVal+" "+count);
					}
				}
				processed.add(lineVal);
				myCountList.add(lineVal +" " +count);
				
			}
		}
		
		
		//Arrays.sort(myCountList.toArray(), Collections.reverseOrder());
		//System.out.println("Count: "+myCountList);
		for(int i = 0; i<myCountList.size(); i++) {
			System.out.println(myCountList.get(i));
		}
		
	}//main
	
	public static boolean CheckIfProcessed(String word, List<String> processed ) {
		for(int i = 0; i<processed.size(); i++) {
			if(processed.get(i).toLowerCase().equals(word.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

}
