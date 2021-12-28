package Assignment5;

public class TaxiFare {
    public double CalculateTaxiFare(int dis){
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
        return total;
    }
}
