package generator;

public class EvenNumberGen {

//	int array[] = new int[5];
	
	int[] okk(int a)
	{
		int array[] = new int[a/2];
		int g=0;
		for(int i=1;i<=a;i++)
		{
			if(i%2==0)
			{
				array[g]=i;
				g++;
			}
		}
		return array;
	}
}
