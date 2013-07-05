class NestedLoops 
{
	static void printA(int iSize)
	{
		for (int iCol = 1; iCol <= iSize; iCol++)
		{
			for (int iRow = 1; iRow <= iSize-iCol+1;iRow++)
				System.out.print(iRow);
			System.out.println();
		}
	}

	static void printB(int iSize)
	{
		for (int iRow = 1; iRow <= iSize; iRow++)
		{
			for (int iCol = iSize; iCol >= 1;iCol--)
				if(iCol<=iRow)
					System.out.print(iCol);
				else
					System.out.print(" ");
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		printB(6);
	}

}
