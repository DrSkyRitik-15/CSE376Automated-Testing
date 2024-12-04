package generator;

import java.util.ArrayList;

public class makeListevenNumber {

 public   ArrayList<Integer> abc(int a)
{
	 ArrayList<Integer>aaaaa =new ArrayList<>();
	 
	 for(int i=1;i<=a;i++)
		{
			if(i%2==0)
			{
				aaaaa.add(i);
			}
		}
 
	return aaaaa;
}
}
