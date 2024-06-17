
public class JavaStringsPractice {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		String str = "laugh";
		String str2 ="Laugh out Loud ";
		int str3 = str2.compareTo(str);
		String str4 = str.concat(str2);
		Boolean str5 = str.contains("c");
		Boolean str6 = str.contentEquals("laugh");
		Boolean str7 = str.endsWith("k");
		Boolean str8 = str.equalsIgnoreCase(str4);
		String str9  = str.repeat(2);
		String str10 = str.replace('g','m');
		int str11 = str.compareToIgnoreCase(str2);
		Boolean str12 = str2.startsWith(str);
		String str13 = str2.substring(6,10);
		String str14 = str2.toLowerCase();
		String[] str15 = str2.split("L");
		String str16 = str2.trim();
		
		System.out.println(str3 +" "+ str4 +" "+ str5 +" "+ str6 +" "+ str7+" "+ str8 +" "+str9+" "+str10+" "+str11);
		System.out.println(str12+" "+str13+" "+str14+" "+str15[1]+" "+str16);
	}
//output -( -76 laugh  Laugh out Loud  false true false false laughlaugh laumh 76
	//false h ou   laugh out loud  augh out  Laugh out Loud
}
