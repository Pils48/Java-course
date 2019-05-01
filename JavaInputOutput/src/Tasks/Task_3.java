package Tasks;

import java.io.*;
import java.util.ArrayList;


public class Task_3 {

	public static void main(String[] args) {
		File file = new File("d:/soft");
		for(File elem :print(file)) {
			System.out.println(elem);
		}
	}

	private static ArrayList<File> list = new ArrayList<>();

	public static ArrayList<File> print(File root) {
		File[] arrayOfFiles = root.listFiles(new FileFilter() {
			@Override
			public boolean accept(File f) {
				return f.isFile() && (f.getName().endsWith(".jpg") || f.getName().endsWith(".bmp")
						|| f.getName().endsWith(".png") || f.getName().endsWith(".gf"));
			}
		});
		for (File elem : arrayOfFiles) {
			list.add(elem);
		}
		// System.out.println(Arrays.toString(arrayOfFiles));
		File[] AllDirectories = root.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isDirectory();
			}

		});
		for (File directory : AllDirectories) {
			print(directory);
		}
		return list;
	}
}
