package my_package;
import other_package.Other_calculator;;

public class My_calculator extends Other_calculator {
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public static void main(String[] args) {
		Other_calculator calc = new My_calculator();
		System.out.println(calc.add(1, 2));
		System.out.println(calc.sub(1, 2));
	}

}
