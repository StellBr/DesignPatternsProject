package workshopsanta;

import java.util.Date;
import java.util.Scanner;

public class WorkshopProcess {

	public static void main(String[] args) throws InterruptedException {
				
		Date dt = new Date();
		int hours = dt.getHours();
		int minutes = dt.getMinutes();
		int sec = dt.getSeconds();
		
		
		SantaClaus sc = SantaClaus.getInstance();		
		 
		WorkshopFactory toyFactory = new ToyFactory();
		
		System.out.println("Лапландия: "+hours + ":" + minutes + ":" + sec );
		System.out.println("__________________________❄________________________");
		Thread.sleep(2000);
		sc.callingDwarf();
		Thread.sleep(2000); 
		System.out.println("Дядо Коледа, какво ти трябва?");
		Thread.sleep(2000); 
		sc.wantedToy("колело");
		Thread.sleep(2000); 
		System.out.print("🎁"); 
	    toyFactory.produceProduct("колело");    
		
		Thread.sleep(2000); 
		System.out.println();
		System.out.println("Лапландия: "+ (++hours) + ":" + (++minutes) + ":" + sec );
		System.out.println("__________________________❄________________________");
		Thread.sleep(2000);
		sc.callingDwarf();
		Thread.sleep(2000); 
		System.out.println("Дядо Коледа, какво ти трябва?");
		Thread.sleep(2000); 
		sc.wantedToy("кукла");
		Thread.sleep(2000); 
		System.out.print("🎁"); 
	    toyFactory.produceProduct("кукла");	
	    
	
	}
}
