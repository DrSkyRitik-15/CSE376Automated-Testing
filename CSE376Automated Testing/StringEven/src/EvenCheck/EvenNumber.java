//package EvenCheck;
//
//public class EvenNumber {
//	String Even(int num)
//	{
//		if(num%2==0 )
//		{
//			return "Even";
//		}
//		else {
//			return "Odd";
//	}
//	
//
//}   
//}
package EvenCheck;

public class EvenNumber {
	String Even(int num)
	{
		if(num>=1&& num<=60) {
		if(num%2==0 ){
			
				return "Even";				
			}
			else {
				return "Odd";
		}
		}
		else {
			return "No";
	}
	

}   
}