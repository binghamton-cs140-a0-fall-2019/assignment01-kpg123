package assignment01;
import java.io.*;
public class PersonTester {
	public static void main(String[] args){
		Person Man = new Person("James","Charles","145335679",
		new DateAndPlaceOfBirth(1994,12,1,"Chicago","Illinois"),
		new StreetUSAddress("30 Main Street", "2 Maple Street","Chicago", "Illinois","60007")
		);
		System.out.println(Man);
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR PersonTester.java:");
		Person Man2 = new Person("James","Charles","145335679",
		new DateAndPlaceOfBirth(1994,12,1,"Chicago","Illinois"),
		new StreetUSAddress("30 Main Street", "2 Maple Street","Chicago", "Illinois","60007")
		);
		output.println(Man2);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}