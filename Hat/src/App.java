import java.util.ArrayList;

import java.util.List;

import org.omg.CORBA.Current;

public class App {

	public static void main(String[] args) {

		write("time taken :");
		;

	}

	public static void write(String type) {
		Hat<Integer> peaple = new Hat<>();

		

		for (int i = 0; i < 1E6; i++) {
			peaple.add(i);
		}
		long start = System.currentTimeMillis();

		    peaple.add(112111);
		long end = System.currentTimeMillis();

		System.out.println("time taken: " + (end - start));
		
		long start1 = System.currentTimeMillis();
		
			peaple.draw();
		
		long end1 = System.currentTimeMillis();
		
		System.out.println("time :" + (end1-start1) );

		/*
		 * System.out.println(peaple);
		 * 
		 * System.out.println(peaple.size()); System.out.println("cleaner"
		 * +peaple.draw()); System.out.println("disch washer" +peaple.draw());
		 * System.out.println(peaple); System.out.println(peaple.size());
		 * System.out.println(peaple.remove(peaple.draw()));
		 * System.out.println(peaple);
		 */

	}

}
