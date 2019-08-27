package assignment01;
import java.io.*;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different 
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
		Computer Dell = new Computer("Dell", "i7", 8, 1000, true, 750);
		Computer HP = new Computer("HP", "i5", 16, 500, false, 500);
		Computer Mac = new Computer("Mac", "Apple Cpu", 12, 1250,true, 1000);
		Computer Chromebook = new Computer("Chromebook", "Potato", 4, 250, false, 200);
		System.out.println(Dell);
		System.out.println(HP);
		System.out.println(Mac);
		System.out.println(Chromebook);
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");
			Computer Dell2 = new Computer("Dell", "i7", 8, 1000, true, 750);
			Computer HP2 = new Computer("HP", "i5", 16, 500, false, 500);
			Computer Mac2 = new Computer("Mac", "Apple Cpu", 12, 1250,true, 1000);
			Computer Chromebook2 = new Computer("Chromebook", "Potato", 4, 250, false, 200);
			output.println(Dell2);
			output.println(HP2);
			output.println(Mac2);
			output.println(Chromebook2);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}