package WrapperClasses;

import org.testng.annotations.Test;

/* This is possible to convert primitive number data type to any Object number Data type
 */
public class PrimitiveToObjectDataType {

	@Test
	public void convertPrimitiveToObject() {
		// TODO Auto-generated method stub
		int pIntNum = 10;
		long pLongNum = 1078700000;
		char pChar = 'A';
				
		Integer wInterger = new Integer(pIntNum);
		System.out.println("int number converted to Wrapper Integer Object: "+ wInterger);
		
		Float wFloat = new Float(pIntNum);
		System.out.println("int number converted to Wrapper Float Object: "+ wFloat);
		
		Long wLong = new Long(pLongNum);
		System.out.println("long number converted to Wrapper Long Object: "+ wLong);
				
		//String wString = new String(pIntNum); //this is not possible directly. First we have to convert number to String
		String wString = new String(Integer.toString(pIntNum));
		//String wString = new String(pIntNum.toString());  //This is also not possible bcz Cannot invoke toString() on the primitive type
		System.out.println("int number converted to Wrapper String Object using Integer.toString : "+ wString);
		
		Character wCharacter = new Character(pChar);	//Convert char to Character only
		System.out.println("char converted to Character: "+wCharacter);
		
		String wString1 = new String(Character.toString(pChar));
		System.out.println("char converted to String: "+wString1);
		
		Integer wInterger2 = new Integer(pChar);
		System.out.println("char converted to Wrapper Integer Object: "+ wInterger2);
	}
}
