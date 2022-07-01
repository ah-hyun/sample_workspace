package co.edu;

public class Example03 {
	public static void main(String[] args) {
		
		System.out.println(10 + 20);
		System.out.println("10" + "20");
		
		System.out.println("내 이름은 \"홍길동\" 입니다.");

		System.out.println("{\"name\" : \"홍길동\", \"age\" : 20}");
		
		int num1 = Integer.parseInt("100");
		double num2 = Double.parseDouble("127.99");
		double num3 = Double.parseDouble("122.01");
		
		System.out.println(num1 + num2);
		
		
		
		
		
		double result = sum(num1, num2);
		result = minus (num2, num3);
		System.out.println("메소드 minus 결과: " + result);
		
		System.out.println("합결과: " +  + result);
		System.out.printf("차이는 %.2f 입니다." , result);
		
		
		
		System.out.printf("저의 이름은 %s이고 나이는 %d 입니다.", "홍길동" , 14);
		
		//이름 나이 몸무게 나의 이름은 ~ 이고 나이는 ~ 이고 몸무게는 ~ 입니다.

		String name = "김아현";
		int age = 27;
		double weight = 50.454648;
		
		System.out.printf("\n나의 이름은 %s이고 나이는 %d이고 몸무게는 %.2f입니다.", name, age, weight);
		
		
	}		
		
		public static int sum(int num1, int num2) {
			int sum = num1 + num2;
			return sum;
			
	}
		
		public static double sum(int n1, double n2) {
			double sum = n1 + n2;
			return sum;
		}
		
		public static double minus(double n1, double n2) {
				double minus = n1 - n2;
				return minus;
		

		}
		}

