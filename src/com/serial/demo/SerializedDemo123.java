package com.serial.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializedDemo123 implements Serializable {
	private static final long serialVersionUID = 10123654L;
	int id;
	String name;

	SerializedDemo123(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public static void main(String[] args) {

		SerializedDemo123 serial = new SerializedDemo123(45, "Arti");

		String myfile1 = "File1.txt";

		try {
			FileOutputStream fout = new FileOutputStream(myfile1);
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			oout.writeObject(serial);
			System.out.println("Object Serialized.........");
		} catch (IOException e) {
			e.printStackTrace();
		}

	
		try {
			FileInputStream fin=new FileInputStream(myfile1);
			ObjectInputStream oin =new ObjectInputStream(fin);
			SerializedDemo123 serial1=(SerializedDemo123) oin.readObject();
			System.out.println("Desialized Object.........");
			System.out.println("Id: "+serial1.id);
			System.out.println("Name: "+serial1.name);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
