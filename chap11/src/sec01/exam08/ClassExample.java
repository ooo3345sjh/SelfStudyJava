package sec01.exam08;

public class ClassExample {

	public static void main(String[] args) throws Exception {
		//ù ��° ���
		 Class clazz1 = Car.class;
		 
		 //�� ��° ���
		 Class clazz2 = Class.forName("sec01.exam08.Car");
		 
		 //�� ��° ���
		 Car car = new Car();
		 Class clazz3 = car.getClass();
		 
		 System.out.println(clazz1.getName());
		 System.out.println(clazz1.getSimpleName());
		 System.out.println(clazz1.getPackage().getName());
		 
		 System.out.println();
		 
		 System.out.println(clazz2.getName());
		 System.out.println(clazz2.getSimpleName());
		 System.out.println(clazz2.getPackage().getName());
		 
		 System.out.println();
		 
		 System.out.println(clazz3.getName());
		 System.out.println(clazz3.getSimpleName());
		 System.out.println(clazz3.getPackage().getName());
		 
	}

}
