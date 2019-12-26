package com.serial.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializedDemo implements Serializable{
	int id;
	String name;
	
	public SerializedDemo(int id,String name) {
		
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		SerializedDemo s1=new SerializedDemo(10, "ABC");
		 
		String myFile="file.txt";
		
		FileOutputStream f_out=new FileOutputStream(myFile);
		ObjectOutputStream o_out=new ObjectOutputStream(f_out);
		o_out.writeObject(s1);
		
		System.out.println("Object Serialized...........");
		
		
		FileInputStream f_in=new FileInputStream(myFile);
		ObjectInputStream o_in=new ObjectInputStream(f_in);
		SerializedDemo s2=(SerializedDemo) o_in.readObject();
		
		System.out.println("Desirailized Object.........");
		System.out.println("Id: "+s2.id);
		System.out.println("Name: "+s2.name);
		
		

	}

}
