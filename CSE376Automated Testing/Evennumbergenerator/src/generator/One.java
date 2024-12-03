
package generator;

public class One {
	int array[]=new int[5];
	int aa=0;
	
	int[] Check(int a)
	{
		
		for(int i=1;i<=a;i++)
		{
			if(a%2==0)
			{
				array[aa]=a;
				aa++;
			}
			
		}
		return array;
	}

}

