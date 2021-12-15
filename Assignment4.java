/*A taxi operator charges its customer as per the following charge schedule.



Distance                Charge

Under 2 kms.       Fixed Rs.50

2-5 kms.                  Rs.20 per km.

5-15 kms.               Rs.18 per km.

Over 15 kms.        Rs.15 per km.



Write a program that computes the total charge for a journey when the total distance travelled during the journey has been specified.*/
import java.util.*;  
    public class Assignment4{
    public static void main(String []args){
     Scanner sc= new Scanner(System.in);    
     int dis= sc.nextInt();  
      int charge=0,total=0;  
		
             if(dis<2){
	                charge=50;	
	             total=total+charge;
	       }
              else if(dis>=2 && dis<5){
			charge=20;	
	           total=total+charge*dis;
		}
              else if(dis>=5 && dis<15){
			charge=18;	
	           total=total+charge*dis;
		}
             else if(dis>=15){
		charge=15;	
	           total=total+charge*dis;	
		}
     System.out.println("Total charge:"+total);
	}
}