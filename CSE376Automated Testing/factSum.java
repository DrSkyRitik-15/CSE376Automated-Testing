package FabonaciiSer;

public class factSum {

	int SumCheck(int num)
	{
		int sum=0;
		int a=0;
		int b=1;
		for(int i=0;i<num;i++)
		{
			sum+=a;
			int c=a+b;
			a=b;
			b=c;
		}
		
		
		
		
		
		return sum;
	}
	
	
}
