package MainPackage;

public class MyInteger {
	private int value;
	
	public MyInteger(int value)
	{
		this.value = value;
	}
	
	public int GetValue()
	{
		return this.value;
	}
	
	public boolean IsEven()
	{
		return (this.value % 2 == 0);
	}
	
	public boolean IsOdd()
	{
		return (this.value % 2 != 0);
	}
	
	
	public boolean IsPrime()
	{
		return(CheckPrime(this.value));
	}
	
	public static boolean IsEven(int value)
	{
		return(value % 2 == 0);
	}
	
	public static boolean IsOdd(int value)
	{
		return(value % 2 != 0);
	}
	
	public static boolean IsPrime(int value)
	{
		return(CheckPrime(value));
	}
	
	
	public static boolean IsEven(MyInteger MyInt)
	{
		return(MyInt.value % 2 == 0);
	}
	
	public static boolean IsOdd(MyInteger MyInt)
	{
		return(MyInt.value % 2 != 0);
	}
	
	public static boolean IsPrime(MyInteger MyInt)
	{
		return CheckPrime(MyInt.value);
	}
	
	private static boolean CheckPrime(int value)
	{
		for(int i=2;2*i<value;i++) {
			if(value%i==0)
				return false;
		    }
		return true;
	}
	
	public boolean equals(int value)
	{
		return this.value == value;
	}
	
	public boolean equals (MyInteger MyInt)
	{
		return equals(MyInt.GetValue());
	}
	
	public static int parseInt(char[])
	{
		return parseInt(new String());
	}
	
	public static int parseInt(String)
	{
		return Integer.parseInt();
	}

}
