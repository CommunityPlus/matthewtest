public class Prime{
	
	static boolean isPrime(int iNumber){
		
		for(int x = 2; x < iNumber; x++){
			if (iNumber%x == 0)
				return false;
		}
		return true;
	}
	
	static void listPrimeNumbers(int iLimit){
		
		int x = 2;
		int iCount = 0;
		
		while(iCount<iLimit){
			if (isPrime(x)){
				System.out.print(x + " ");
				iCount++;
			}
			x++;
		}
	}
	
	public static void main(String[] args){
		
		
		listPrimeNumbers(50);
		
		
		
	}
	
}