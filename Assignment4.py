
dis = int(input("Enter your distance: "))
total=0
charge=0
if dis<2:
   charge=50
   total=total+charge
elif dis>=2 and dis<5:
   charge=20;	
   total=total+charge*dis
elif dis>=5 and dis<15:
   charge=18;	
   total=total+charge*dis
else:
   charge=15;	
   total=total+charge*dis
    
print ("Total charge:",total)
