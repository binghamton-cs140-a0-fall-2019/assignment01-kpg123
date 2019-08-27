package assignment01;
import java.io.*;
public class ComputerOwnerTester {
	public static void main(String[] args){
		Person Man = new Person("James","Charles","145335679",
			new DateAndPlaceOfBirth(1994,12,1,"Chicago","Illinois"),
			new StreetUSAddress("30 Main Street", "2 Maple Street","Chicago", "Illinois","60007")
		);
		Computer Dell = new Computer("Dell", "i7", 8, 1000, true, 750);
		Computer HP = new Computer("HP", "i5", 16, 500, false, 500);
		Computer Mac = new Computer("Mac", "Apple Cpu", 12, 1250,true, 1000);
		Computer Chromebook = new Computer("Chromebook", "Potato", 4, 250, false, 200);
		ComputerOwner Chad = new ComputerOwner(Man);
		Chad.addComputer(Dell);
		Chad.addComputer(HP);
		Chad.addComputer(Mac);
		Chad.addComputer(Chromebook);
		System.out.println(Chad);
		Chad.removeComputer(3);
		Chad.removeComputer(2);
		System.out.println(Chad);
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwnerTester.java:");
		Person Man2 = new Person("James","Charles","145335679",
			new DateAndPlaceOfBirth(1994,12,1,"Chicago","Illinois"),
			new StreetUSAddress("30 Main Street", "2 Maple Street","Chicago", "Illinois","60007")
		);
		Computer Dell2 = new Computer("Dell", "i7", 8, 1000, true, 750);
		Computer HP2 = new Computer("HP", "i5", 16, 500, false, 500);
		Computer Mac2 = new Computer("Mac", "Apple Cpu", 12, 1250,true, 1000);
		Computer Chromebook2 = new Computer("Chromebook", "Potato", 4, 250, false, 200);
		ComputerOwner Chad2 = new ComputerOwner(Man2);
		Chad2.addComputer(Dell2);
		Chad2.addComputer(HP2);
		Chad2.addComputer(Mac2);
		Chad2.addComputer(Chromebook2);
		output.println(Chad2);
		Chad2.removeComputer(3);
		Chad2.removeComputer(2);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}