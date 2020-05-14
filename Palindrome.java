package day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "malayalam";
		String rev = "";
        
		for (int i = text.length()-1; i>=0 ; i--) {
			rev += text.charAt(i);
		}
		System.out.println(text.equals(rev)?"Yes, Palindrome": "No, Palindrome");
		
		/*if (rev == text) {
			System.out.println(text + " : Yes, Palindrome");
		}*/

		/*String text1 = "test leaf";	
		String rev1 = "";
	    
		for (int j = text1.length()-1; j <= 0 ; j--) {
				rev1 += text1.charAt(j);
		}
	    if(rev1 == text1) {
		System.out.println(text1 + " : No, Palindrome");
	} */ 

}


}
