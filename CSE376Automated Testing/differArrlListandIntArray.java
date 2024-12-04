package generator;

import java.util.ArrayList;

public class differArrlListandIntArray {
	
	public int [] Zoom(int a) {
		
		ArrayList<Integer>arr = new ArrayList<>();
		
		for(int i=0;i<=a;i++)
		{
			if(i%2==0)
			{
				arr.add(i);
			}
		}
		
		
		
		
		
		
		
		
		int omom[]=new int[arr.size()];
		for(int i=0;i<arr.size();i++)
		{
			omom[i]=arr.get(i);
		}
		
		return omom;
	}

}
