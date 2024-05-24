import java.io.*;
import Arith.*;
import Arith.Calc.*;
class PackageEx1
{
	public static void main(String a[])
	{
		// Accessing Math Class from Package Arith //
		// Here there is no need create an object for Class Maths because all Methods in Math class are Static Members"
		System.out.print("\nThe biggest Value among 10,25 is" + Maths.Max(10,25));
		System.out.print("\nThe smallest Value among 10,25 is" + Maths.Min(10,25));
		System.out.println("\nThe Average Values of 15,25 is" + Maths.Avrg(15,25));

				if (Maths.isOdd(10))
					System.out.print("\n10 is an Odd Number");
				else
					System.out.print("\n10 is not an Odd Number");
				

				if (Maths.isEven(10))
					System.out.print("\n10 is a Even Number");
				else
					System.out.print("\n10 is not a Even Number");
		// Accessing MathSeries Class from Package Arith //
		// Here we need create an object for Class MathsSeries because all Methods in MathSeries class are Dynamic Members"

		MathSeries ms=new MathSeries();
		ms.Odd(10);
		ms.Even(15);
		ms.Fifo(25);

		// Accessing Sum Class from Sub Package Arith.Calc //
		// Here there is no need create an object for Class Sum because all Methods in Sum class are Static Members"

		System.out.print("\nFactorial Value of 5 is "+ Sum.Fact(5));


	}
}
