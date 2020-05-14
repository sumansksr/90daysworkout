package day1;

public class findtheoccurofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String text = "You have no choice other than followin me";
      int count = 0;
     for (int i = 0; i < text.length(); i++) {
    	 if (text.charAt(i) == 'o' ) {
    		count ++;
    		 
    	 }
    	 
    	 
	}
     System.out.println("Occurance of o is :" + count);
	}

}
