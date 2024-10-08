/**
 * 
 */
package reflection;

/**
 * @author MyronWeng
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;

import circle.ColoredCircle;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * 
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * 
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
		System.out.println("Inheritance chain:");
		String output = "";
		Class curr = o.getClass();
		output += o.getClass().getName();
		while (curr.getSuperclass() != null) {
			output += " inherits from " + curr.getSuperclass().getName();
			curr = curr.getSuperclass();
		}
		System.out.println(output + "\n");

	}

	/**
	 * Print the list of methods of the object
	 * 
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Methods from class " + o.getClass().getName() + ":");
		Method[] m = o.getClass().getMethods();

		// List of methods
		// TODO To complete
		// Print each method on one line
		// Use this EXACT format
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i].getName() + "\n");
		}
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println();

		Reflection r = new Reflection();

		BullDog d = new BullDog();
		r.inheritanceChain(d);

		// Demonstration of the methods on an objet of type String
		// TODO To complete
		String s = new String();
		r.listMethods(s);

		// Demonstration of the methods on an objet of type ColoredCircle
		// TODO To complete
		ColoredCircle colcirc = new ColoredCircle();
		r.listMethods(colcirc);

		System.out.println();
	}

}

class Living {

}

class Animal extends Living {

}

class Dog extends Animal {

}

class BullDog extends Dog {

}
