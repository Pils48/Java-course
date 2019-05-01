package Tasks;

import java.io.*;

public class Task_4 {

	public static void main(String[] args) throws IOException {
		File src = new File("d:/Soft");
		File dst = new File("d:Soft2");
		copy(src, dst);

	}

	public static void copy(File src, File dst) throws IOException {
		if (src.isDirectory()) {
			if (!dst.exists()) {
				dst.mkdir();
			}
			for (File srcSubDir : src.listFiles()) {
				String subDirName = srcSubDir.getName();
				copy(srcSubDir, new File(dst, subDirName));
			}
		} else if (src.isFile()) {
			if (!dst.exists()) {
				if (!dst.createNewFile()) {
					throw new IOException("Exception was thrown during coping files");
				}
			}
		}
	}

}
