import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		//int a=sc.nextInt();
//		int b=sc.nextInt();
//		int choice=sc.nextInt();
//		switch (choice){
//			case 1: System.out.println(a+b);
//		break;
//			case 2: System.out.println(a-b);
//		break;
//			case 3: System.out.println(a*b);
//		break;
//			case 4: System.out.println(a/b);
//		break;
//			case 5: System.out.println(a%b);
//		break;
//			default: System.out.println("Invalid");
//		}
//		
//	}
//}
    System.out.println("Enter Month Number (1-12)");
    int month=sc.nextInt();
    switch(month){
    	case 1: System.out.println("January ");
    	break;
    		case 2: System.out.println("February");
    	break;
    		case 3: System.out.println("March");
    	break;
    		case 4: System.out.println("April");
    	break;
    		case 5: System.out.println("May");
    	break;
    		case 6: System.out.println("June");
    	break;
    		case 7: System.out.println("July");
    	break;
    		case 8: System.out.println("August");
    	break;
    		case 9: System.out.println("September");
    	break;
    		case 10: System.out.println("October ");
    	break;
    		case 11: System.out.println("November ");
    	break;
    		case 12: System.out.println("December ");
    	break;
	}
}
}