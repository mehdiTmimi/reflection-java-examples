import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Scanner;

public class MainClient extends Student{

	private int x;
	private String name;
	public MainClient() {
		super(1,2,454);
		try {
		Object o=new Object();
		Class c = o.getClass();//object
		Class c2=String.class;//class
		Class c3=Class.forName("MainClient");// full name string

		Field[] fields= c3.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i].getName()+" "+ fields[i].getType());
		}
		System.out.println("--------");
		Class classMere = c3.getSuperclass();
		fields= classMere.getDeclaredFields();
	
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i].getName()+" "+ fields[i].getType());
		}
		System.out.println("------_");
		Method[] methods= c3.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i].getReturnType());
		}
		
		
		System.out.println("------_");
		Constructor[] constructors= c3.getDeclaredConstructors();
		for (int i = 0; i < constructors.length; i++) {
			System.out.println(constructors[i]);
		}
		Class class1= Class.forName("Student");
	
		Constructor construct=class1.getConstructor(int.class,int.class,int.class);
		Object object =  construct.newInstance(1,2,3);
		
		Method method1= class1.getDeclaredMethod("hello",String.class);
		
		System.out.println(object);
		
		method1.invoke(object,"mehdi");
		
		Field field=class1.getDeclaredField("publ");
		field.set(object, 1000);
		System.out.println(object);
		
		
		Field field2=class1.getDeclaredField("prive");
		field2.setAccessible(true);
		field2.set(object, 1000);
		field2.setAccessible(false);
		System.out.println(object);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	
	}

	public static void main(String[] args) {
		new MainClient();
	}
	public int somme(int x,int y) {
		return x+y;
	}
}
