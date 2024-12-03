package PrimeNumber;
import java.util.*;
public class ok {
	
	public int[]check(int s)
	{
		List<Integer> aaa=new ArrayList<>();
		
		for(int i=2;i<=s;i++)
		{
			if(isPrime(i))
			{
				aaa.add(i);
			}
		}
		int aa[]=new int[aaa.size()];
		for(int i=0;i<aaa.size();i++)
		{
			aa[i]=aaa.get(i);
		}
		return aa;
	}
	public boolean isPrime(int a)
	{
		if(a<=1)
		return false;
		for(int i=2;i<=Math.sqrt(a);i++)
		{
			if(a%i==0)
			return false;
		}
		return true;
		
	}
}
