package model;



public class SignalTools {

	
	static double mean(Signal sig) {
		double sum, mean=0;
	
		for (int i=0;i<sig.sizeData();i++) {
			sum=+(double)sig.getY(i);
			mean=sum/sig.sizeData();
		}
		return mean;
	}
	
	static double variance(Signal sig) {
		double var=0;
		double sum=0;
		
		double mean=mean(sig);
		for(int i=0;i<sig.sizeData();i++) {
			sum=+Math.pow((sig.getY(i)-mean),2);
		}
		var=sum/sig.sizeData();
		return var;
	}
	
	
	
	
	/*
	 ArrayList ftt(ArrayList list) {
		 double sum =0;
		 for(int i=0;i<list.size();i++) {
			 
		 }
	}*/
	
	
	
}
