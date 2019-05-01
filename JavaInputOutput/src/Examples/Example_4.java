package Examples;

import java.io.*;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Example_4 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		writeToFile();
		readFromFile();
	}

	private static void writeToFile() throws FileNotFoundException, IOException {
		byte age = 45;
		String name = "Mike";
		int[] salaryArr = new int[] { 100, 200, 500, 490 };

		OutputStream outputstream = new GZIPOutputStream(
				new BufferedOutputStream(new FileOutputStream(new File("d:/Soft/text.txt"))));
		
		DataOutput dataoutput = new DataOutputStream(outputstream);
		dataoutput.writeByte(age);
		dataoutput.writeUTF(name);
		dataoutput.writeInt(salaryArr.length);
		for(int salaryelem : salaryArr) {
			dataoutput.writeInt(salaryelem);
		}
		outputstream.flush();
		outputstream.close();
	}

	private static void readFromFile() throws IOException {
		InputStream inputstream = new GZIPInputStream(
				new BufferedInputStream(new FileInputStream(new File("d:/Soft/text.txt"))));
		DataInput datainput = new DataInputStream(inputstream);
		byte age = datainput.readByte();
		String name = datainput.readUTF();
		int[] salaryArr = new int[datainput.readInt()];
		for (int i = 0; i < salaryArr.length; i++) {
			salaryArr[i] = datainput.readInt();
		}
		inputstream.close();
		System.out.println("age = " + age);
		System.out.println("name = " + name);
		System.out.println("SalaryArr = " + Arrays.toString(salaryArr));
	}

}
