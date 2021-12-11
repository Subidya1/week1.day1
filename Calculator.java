package week3.day1;

public class Calculator {

		public void add(int num1, int num2) {
			System.out.println(num1+num2);
		}

		public void add(int num1, int num2, int num3) {
			System.out.println(num1+num2+num3);
		}
		public void mul(int num1, int num2) {
			System.out.println(num1*num2);
		}
		public void mul(int num1, double num2) {
			System.out.println(num1*num2);
		}
		public void sub(int num1, int num2) {
			System.out.println(num1-num2);
		}
		public void sub(double num1, double num2) {
			System.out.println(num1-num2);
		}
		public void div(int num1, int num2) {
			System.out.println(num1/num2);
		}
		public void div(double num1, int num2) {
			System.out.println(num1/num2);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.add(10,20);
		calc.add(10,20,30);
		calc.mul(15,20);
		calc.mul(15,1.5);
		calc.sub(15,5);
		calc.sub(20.25,15.05);
		calc.div(20,5);
		calc.div(20.25,5);
		
	}

}
