package FabonaciiSer;

public class OkMan {

	public int[] Check(int size){
		
	int ok[]=new int[size];
	int a=0;
	int b=1;
//	ok[0]=0;
	for(int i=0;i<size;i++)
	{
		ok[i]=a;
		int c=a+b;
		a=b;
		b=c;
		
	}
	return ok;
		
		
	}
}
