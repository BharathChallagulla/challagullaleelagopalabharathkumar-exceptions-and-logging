package logger;

import java.util.*;
import java.util.logging.Logger; 

public class calConstructionCost {
	static{
		Logger logger = Logger.getLogger(Constructions.class.getName());
		Scanner sc = new Scanner(System.in);
		int std;
		double sqr_feet;
		String msg;
		logger.info("Enter Material Standard\n1.Standard\n2.Above standard\n3.High standard\n4.High standard and Fully automated home\n");
		std = sc.nextInt();
		if(std == 1||std == 2||std == 3||std == 4){
			logger.info("Enter total area of the house in sq.ft");
			sqr_feet = sc.nextDouble();
			Constructions ob1 = new Constructions(std,sqr_feet);
			msg = ob1.calculateCost();
			logger.info(msg);
		}
		else{
			logger.info("invalid selection");
			java.lang.System.exit(0); 
		}
	}

	public static void main(String[] args) {
		

	}

}