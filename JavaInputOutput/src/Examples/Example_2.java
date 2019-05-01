package Examples;

import java.io.*;

public class Example_2 {
	/*
	 * This program copy file from fileNameFrom to fileNameTo example of using
	 * outputStream
	 */
	public static void main(String[] args) throws IOException {
		String fileNameFrom = "d:/soft/text.txt";
		String fileNameTo = "d:/soft/text1.txt";

		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(fileNameFrom);
			out = new FileOutputStream(fileNameTo);
			copy(in, out);
		} catch (IOException e) {
			throw new IOException("Exception was thrown during coping from " + fileNameFrom + " to " + fileNameTo, e);
		} finally {
			Example_1.closeQuietly(in);
			flushAndCloseQuietly(out);
		}
	}

	public static void flushAndCloseQuietly(OutputStream out) {
		if (out != null) {
			try {
				out.flush();
			} catch (IOException e) {
				/* NOP */}

			try {
				out.close();
			} catch (IOException e) {
				/* NOP */}
		}
	}

	private static void copy(InputStream in, OutputStream out) throws IOException {
		byte[] buff = new byte[64 * 1024];
		int count;
		while ((count = in.read(buff)) != -1) {
			out.write(buff, 0, count);
		}

	}

}
