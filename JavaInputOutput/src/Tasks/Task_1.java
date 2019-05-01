package Tasks;

import java.io.*;
import java.net.URL;

import Examples.Example_1;
import Examples.Example_2;

public class Task_1 {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.google.com");
		InputStream in = url.openStream();

		OutputStream toFile1 = new BufferedOutputStream(new FileOutputStream("d:/soft/tmp0.html"));
		OutputStream toFile2 = new BufferedOutputStream(new FileOutputStream("d:/soft/tmp1.html"));
		int count;
		byte[] buff = new byte[256];
		try {
			while ((count = in.read(buff)) != -1) {
				toFile1.write(buff, 0, count);
				toFile2.write(buff, 0, count);
			}
		} catch (IOException e) {
			File tmp = new File("d:/soft/tmp0.html");
			tmp.delete();
			File tmp1 = new File("d:/soft/tmp1.html");
			tmp1.delete();
		}finally { 
			Example_1.closeQuietly(in);
			Example_2.flushAndCloseQuietly(toFile1);
			Example_2.flushAndCloseQuietly(toFile2);
		}
	}

}
