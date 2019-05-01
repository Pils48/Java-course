package Examples;

import java.io.*;
import java.nio.channels.FileChannel;

public class Example_3 {

	public static void copyByChannels (File fileSrc, File fileDst) throws IOException { 
		try(FileInputStream in = new FileInputStream(fileSrc);
				FileOutputStream out = new FileOutputStream(fileDst, false)){
			FileChannel inChannel = in.getChannel();
			FileChannel outChannel  = out.getChannel();
			long count = 0;
			long size = inChannel.size();
			while(count < size) {
				long currentPosition = count;
				long byteleft = size - count;
				count += outChannel.transferFrom(inChannel, currentPosition, byteleft);
			}
		}catch(IOException e) {
			throw new IOException("Exception was thrown during coping from " + fileSrc + " to file " + fileDst);
		}
				
	}
}
