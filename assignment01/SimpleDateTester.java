package assignment01;
import java.io.*;
public class SimpleDateTester {
	public static void main(String[] args){
		SimpleDate Date0 = SimpleDate.of(1990, 1, 20);
		SimpleDate Date1 = SimpleDate.of(1990, 1, 20);
		SimpleDate Date2 = SimpleDate.of(2001, 3, 30);
		SimpleDate Date3 = SimpleDate.of(1990, 1, 21);
		SimpleDate Date4 = SimpleDate.of(1990, 2, 20);
		System.out.println(Date0.before(Date1)); //all same
		System.out.println(Date0.before(Date2)); //all before
		System.out.println(Date2.before(Date1)); //all after
		System.out.println(Date1.before(Date3)); //day before
		System.out.println(Date1.before(Date3)); //day before
		System.out.println(Date1.before(Date4)); //month before
		System.out.println(Date3.before(Date1)); //day after
		System.out.println(Date4.before(Date1)); //month after
	}
}