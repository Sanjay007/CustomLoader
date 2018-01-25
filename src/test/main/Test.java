package test.main;

import java.lang.reflect.InvocationTargetException;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, Exception {

		MyClassLoader loader = new MyClassLoader(
	            Test.class.getClassLoader());
		
		System.out.println("loader name---- " +loader.getParent().getClass().getName());
		
		//This Loads the Class we must always
		//provide binary name of the class
		Class<?> clazz =
	            loader.loadClass("test.frugalis.Frugalis");
		
        System.out.println("Loaded class name: " + clazz.getName());

        //Create instance Of the Class and invoke the particular method
        Object instance = clazz.newInstance();
        
        clazz.getMethod("printMyName").invoke(instance);

	}

}
