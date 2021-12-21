import java.util.Scanner;
import java.util.Random;

public class Locker {
	 public static void main(String [] args)
     { 
		 boolean full = false;
		 int lockerbox[] = new int[50]; // set there are 50 lockers
		 int uselock;
		 Scanner input = new Scanner(System.in);
		 
		  for(int i= 0; i < 50; i++)
		 {
			 lockerbox[i] = 1;// let all the locker element equal 1;
		 
		 } 
		 System.out.print("Do you want to use the lock;(Intput: 1 if yes)");
		 uselock = input.nextInt();
		 
		 if( uselock == 1)
		 {
		
		 int index = 0;
		 do
		 { 
	     int count = 0;
	     
	     
		 index  = getLocker();
		 lockerbox[index] = 0;
		 
		 for(int j = 0; j < 49; j ++) // check whether lockerbox is full
		 {
		 if(lockerbox[j] == 0) 
		 {
			 count++;
			 if(count == 50)
			 {
				 full = true;
				 break;
			 }
		 }
		}
		 }while(lockerbox[index] != 1);
		 
		 
		 if(full == true) {
		 
		 System.out.println("The locker is full, please wait...." );
		                  
		 			      }
		 if(full == false)
		 {
			 System.out.println("The locker " + index +1 +" is free to use");
		 }
		 }
		 }
	 
	 
	
	 public static int getLocker() 
	 {
		 
		 int a = 0;
		 a = (int) (Math.random()*50);
		 
		 return a;
	 }
}