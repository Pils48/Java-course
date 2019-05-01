package Examples;

import java.io.*;
import java.net.URL;
//import java.util.Arrays;

public class Example_1 {
	/*
	 * Just for understanding how to read by byte and array of bytes and closing
	 * quietly
	 */
	public static void main(String[] args) throws IOException {
		InputStream inFile = new FileInputStream("d:/soft/text.txt");
		readFullyByArray(inFile);
		System.out.print("\n\n\n");
		closeQuietly(inFile);

		InputStream inURL = new URL("http://google.com").openStream();
		readFullyByByte(inURL);
		System.out.print("\n\n\n");
		closeQuietly(inURL);

		InputStream inArray = new ByteArrayInputStream(new byte[] { 65, 32, 66, 67, 68 });
		readFullyByByte(inArray);
		System.out.print("\n\n\n");
		closeQuietly(inArray);

	}

	public static void closeQuietly(InputStream in) throws IOException {
		if (in != null) {

			try {
				in.close();
			} catch (IOException e) {
				throw new IOException("Exception was thrown during reading the array", e);
			} finally {
				/* NOP */
			}

		}

	}

	private static void readFullyByByte(InputStream in) throws IOException {
		int oneByte;
		// Short conditional statement and expression at the same time
		while ((oneByte = in.read()) != -1) {
			System.out.print((char) oneByte);
		}

	}

	private static void readFullyByArray(InputStream in) throws IOException {
		byte[] buff = new byte[64 * 1024];
		int count;
		while ((count = in.read(buff)) != -1) {
			// System.out.print(Arrays.toString(buff));
			System.out.print("\n");
			System.out.print(new String(buff, 0, count, "UTF-8"));
		}
	}
}
