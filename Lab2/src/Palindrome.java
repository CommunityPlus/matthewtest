public class Palindrome{
	
	static boolean isPalindrome(String sWord){
		
		int x = 1;
		while(x++ < sWord.length() -1){
			if (sWord.charAt(x-1)!=sWord.charAt(sWord.length()-x))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		

		String sWord = "dsacecasd";
		
		System.out.println(isPalindrome(sWord));
		
	}
	
}