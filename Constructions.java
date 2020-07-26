package logger;

public class Constructions{
    
    int standard;
    double sqr_feet;
	Constructions(int std,double sq_feet){
		standard = std;
		sqr_feet = sq_feet;
	}
	String calculateCost(){

		if(standard == 1)
			return("Construction Cost: "+sqr_feet*12000);
		else if(standard == 2)
			return("Construction Cost: "+sqr_feet*15000);
		else if(standard == 3)
			return("Construction Cost:"+sqr_feet*18000);
		else if(standard == 4)
			return("Construction Cost:"+sqr_feet*25000);
		else
			return("invalid");
	}
}