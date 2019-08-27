package assignment01;
import java.io.*;
public class USAddressTester {
	public static void main(String[] args){
		StreetUSAddress addy1 = new StreetUSAddress("30 Main Street", "2 Maple Street","Chicago", "Illinois","60007");
		StreetUSAddress addy2 = new StreetUSAddress("39 Tudor Lane","","Eastchester","New York", "10583");
		System.out.println(addy1);
		System.out.println(addy2);
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");
		StreetUSAddress addy12 = new StreetUSAddress("30 Main Street", "2 Maple Street","Chicago", "Illinois","60007");
		StreetUSAddress addy22 = new StreetUSAddress("39 Tudor Lane","","Eastchester","New York", "10583");
		output.println(addy12);
		output.println(addy22);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}