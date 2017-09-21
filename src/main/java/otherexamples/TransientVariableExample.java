package otherexamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientVariableExample implements Serializable {

	private static final long serialVersionUID = -7808612253087066037L;

	// normal variables
	int i = 10, j = 20;

	// transient
	// when we don't want to save the original value of a variable in a file we
	// use
	// 'transient'
	// this means that it just ignores its initialized value and sets it to the
	// default value of the variable
	// ****'TRANSIENT' JUST DOES NOT ALLOW SERIALIZATION*****
	transient int k = 30;
	transient String text = "sample";

	// transient keyword has no effect here
	transient static int l = 40;
	transient final int m = 50;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		TransientVariableExample obWrite = new TransientVariableExample();

		// serialization - write to file
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obWrite);
		oos.close();

		// serialization - write to file
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		TransientVariableExample obRead = (TransientVariableExample) ois.readObject();
		ois.close();

		System.out.println("i = " + obRead.i);
		System.out.println("j = " + obRead.j);
		// sets to 0
		System.out.println("k = " + obRead.k);
		// sets to null
		System.out.println("text = " + obRead.text);
		System.out.println("l = " + l);
		System.out.println("m = " + obRead.m);
	}
}
