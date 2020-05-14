package day2;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		String text = "asdf1qwer9as8d7";
		int sum = 0;
		int k = 0;
		
		for (int i = 0; i < text.length(); i++) {
			
			if (Character.isDigit(text.charAt(i))){
				k = Character.getNumericValue(text.charAt(i));
				sum = sum + k;
				
			}
			
		} 
		System.out.println("Output:1+9+8+7 =" + sum);
	}
	



}
