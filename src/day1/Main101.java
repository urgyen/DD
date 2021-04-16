package day1;

public class Main101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//Variabless???
//		
//		int age = 35; 
//		
//		String name ="Banana" ;
//		
//		//Naming Convention???
//		
//		//variables with small letter
//		
////		
////		int first_name;
////		
////		int $age 
//		
//		//CAmelCAsing
//		
//		//String name Of My Favourite Teacher = "k";
//		
//		
//		//Datatypes??
//			//Primitive
//		
//				//byte 
//		
//				//short
//				//int
//				char letter = 'a';
//				//float
//				double valueOfPi = 3.1416;
//				boolean isActive =false;
//				//long
//				
//		
//		
//			//Non Primitive
//				String name1 = "Ok";
//				//char 'O' +char  'k';
//		
//				//int Array ==  int, int,int
//		
//		
//		//Operators?
//				
//				//1. Arithmentic Operators?
//				//+-/*-
//				// %
//				
//			//	System.out.println(5%2);
//				//oddEven , primeNumber?
//				
//				//2. relational Operators???
//				//Ouptot: boolean??
//				
////				if(6>8) {
////					System.out.println("ok");
////				}
//				
//				
//			//	3.Logical Operators?
//				
//				//And  ra Or
//				
//				//And Gate
//				//T and t -- t
//				//t and f -- f
//				//f and t --f
//				 //f and f -- f
//		
//		
//				//OR Gate
//				//T or T  -- t
//				//t or f -- t
//				//f or t -- t
//				//f or f -- f	
//		
//				//4. Unary Operators???
//				
//				int index= 5;
//				
//				index++;
//				//index =index+1;
//				index--;
//				
//				System.out.println(index);
//				
//				
//				//5. Ternary Operators
//					//If else condition
//				
//				
//				
//				int a = 15;
//				int b = 9;
//				
//				
//									//Condition check ? if True   : if False; 
//									
//				int minimumNumber =  a > b ? b : a ;
//				
//				System.out.println(minimumNumber);
//		
//				//6. Assignment Operators?
//					// =
//				
//				int number = 10;
//				
//				//number= number+2;
//				
//				number+=5;
//				
//				number-=10;
//				
//				//number=number-10;
//				
//				//number=number+5;
//				
//				System.out.println(number);

		// Control Statements??

		// age ==0 -9 Child
		// 10-19 == Teen
		// 20-35 ==Adult
		// 35+ old

//		int age = 250;
//
//		
//		
//		if (age < 10) {
//			System.out.println("Child ");
//		} 
//		else if (age < 20) {
//			System.out.println("Teen");
//		} 
//		else if (age < 36) {
//			System.out.println("Adult");
//		} 
//		else {
//			System.out.println("Old");
//		}

		
		//switch case:
		
		//weekDay  = 6 ;  //Friday 
		
		char weekDay = 'a';
		
		switch(weekDay) {
		
		case 'a':
			System.out.println("Sunday");
			break;
		
		case 'b':
			System.out.println("Monday");
			break;

			
		case 'c':
			System.out.println("Tuesday");
			break;

		
		case 4:
			System.out.println("Wed");
			break;

			
		case 5:
			System.out.println("Thurs");
			break;

		
		case 6:
			System.out.println("Friday");
			break;

			
		case 7:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("Grow UP");
			
		
		}
		
		
		
		
		
		
		
	}

}
