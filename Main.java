/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{
    DACArecipient person1 = new DACArecipient();
    System.out.println(person1);
    DACArecipient person2 = new DACArecipient("Mendez", "Javier", "56-3-445", "El Salvador", 2451564, 3956753, 3956840, 'M');
    System.out.println(person2);
  }
}
