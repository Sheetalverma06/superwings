<?php
/*A taxi operator $charges its customer as per the following $charge schedule.
$distance                $charge

Under 2 kms.       Fixed Rs.50

2-5 kms.                  Rs.20 per km.

5-15 kms.               Rs.18 per km.

Over 15 kms.        Rs.15 per km.
Write a program that computes the $total $charge for a journey when the $total $distance travelled during the journey has been specified.*/

//$dis = (int)readline('Enter an integer: '); 
$dis=(int)readline('Enter an integer: ');
$charge=0;
$total=0;  
		
             
             if($dis<2){
	                $charge=50;	
	             $total=$total+$charge;
	       }
              else if($dis>=2 && $dis<5){
			$charge=20;	
	           $total=$total+$charge*$dis;
		}
              else if($dis>=5 && $dis<15){
			$charge=18;	
	           $total=$total+$charge*$dis;
		}
             else if($dis>=15){
		$charge=15;	
	           $total=$total+$charge*$dis;	
		}



echo $total . "\n";
 
?>