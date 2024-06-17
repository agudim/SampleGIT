import java.util.Scanner;

public class CountcharofString {
	public void strcount() {
		  String str = "Aswini"; 
		  
		  int count[] = new int[256];
		  int i;
		  for (i = 0; i < str.length(); i++) 
		  { 
			  count[(int) str.charAt(i)]++;
	      }
		  char[] letter = new char[str.length()];
		  for(i=0;i<str.length();i++)
		  { 
			  int count1 = 0; 
		    letter[i] = str.charAt(i);
		    System.out.println(letter[i] +" is diplayed - "+count[str.charAt(i)]);
			/*
			 * System.out.println(letter[i]); for (int n=0;n<str.length();n++) { if
			 * (letter[n] == str.charAt(i)) { count1++; } if (count1 == 1) { //prints
			 * occurrence of the character System.out.println("The occurrence of "+
			 * str.charAt(i)+ " is: " + count[str.charAt(i)]); } }
			 */
		 }
		
		  }
		 
		  
		public void CountOccuranceOfChar1()
		{  
		String str;  
		int i, len;  
		int counter[] = new int[256];  
		Scanner scanner = new Scanner(System.in);  
		System.out.print("Please enter a string: ");  
		//reading a string from the user  
		str = scanner.nextLine();  
		//finds the length of the string  
		len = str.length();  
		// loop through the string and count frequency of every character and store it in counter array  
		for (i = 0; i < len; i++)   
		{  
		counter[(int) str.charAt(i)]++;  
		}  
		//print Frequency of characters  
		for (i = 0; i < 256; i++)   
		{  
		if (counter[i] != 0)   
		{  
		//prints frequency of characters      
		System.out.println((char) i + " --> " + counter[i]);  
		}  
		}  
		}  
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountcharofString s = new CountcharofString();
		s.strcount();
		System.out.println("*************");
		s.CountOccuranceOfChar1();
	}

}
