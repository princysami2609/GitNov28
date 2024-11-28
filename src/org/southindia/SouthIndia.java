package org.southindia;
import org.andhrapradesh.*;
import org.tamilnadu.*;
import org.kerala.*;
import org.india.*;

public class SouthIndia {

	public static void main(String[] args) {
		
		// to access other classes we have to import their respective packages - done
		//need to create object for class instance 
		// Hierarchy inheritance -  One parent class which is India followed by 3 child class TN, KR, AP
		
		// parent class 
		India ind = new India();
		ind.india();
		
		// hierarchal inheritance
		TamilNadu tn = new TamilNadu();
		tn.tamillanguage();
		tn.india();
		
				
		Kerala kr = new Kerala();
		kr.malayalam();
		kr.india();
		
		AndhraPradesh ap = new AndhraPradesh();
		ap.telugu();
		ap.india();
	
	}

}
