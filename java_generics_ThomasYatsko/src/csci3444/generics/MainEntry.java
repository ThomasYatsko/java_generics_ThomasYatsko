/**
 * 
 */
package csci3444.generics;
import csci3444.generics.MyGenClass;
import csci3444.generics.MyRegularClass;
import csci3444.generics.MyGenInterface;

/**
 * @author thoma
 *
 */
public class MainEntry 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		MyGenInterface<Integer,String> mgi1;
		MyGenInterface<Integer,Integer> mgi2;
		
		mgi1 = new MyGenClass<Integer, String>(1,"Thomas");
		mgi2 = new MyGenClass<Integer, Integer>(1, 2020);
		
		
		Integer i1;
		Float f1;
		
		i1 = MyRegularClass.getSum(10,20);
		f1 = MyRegularClass.getSum(100f, 200f);
		
		
		System.out.println("Mgi1 Info: " + mgi1.getKey() + " " + mgi1.getValue());
		System.out.println("Mgi2 Info: " + mgi2.getKey() + " " + mgi2.getValue());
		
		System.out.println("I1 is: " + i1);
		System.out.println("F1 is: " + f1);
	}
}
