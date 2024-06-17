import java.util.ArrayList;
import java.util.Scanner;
public class javabasicspractice {

	int num;
	String str;
	
	public int sum() {
		int a =10;
		int b = 20;
		num = a+b;
		System.out.println(num);
		return num;
	}
	public String[] arr() {
		String[] a= new String[3];
		a[0]="Aswini";
		a[1]="Yuvan";
		a[2]="Chennaiah";
		System.out.println(a[2]);
		return a;
	}
	public void arraylist() {
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		for(int i=0;i<al.size();i++) {
			
		System.out.println(al.get(i++));
		}
	}
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		javabasicspractice a = new javabasicspractice();
		a.sum();
		a.arr();
		a.arraylist();
		
	
	}
	

}
