package sample.jna.graalvm;

import com.sun.jna.Native;

public class HelloJNA {
	
	public static void main(String args[]) {
		
		System.out.println("Hello there!");
		System.out.println("JNA Version::" + Native.VERSION);
	}

}
