package Examples;

import java.io.*;

public class Example_6 {
	/* Method that realize deep coping by serialization */
	@SuppressWarnings("unchecked")
	public static <T extends Serializable> T copyBySer(T obj) throws IOException, ClassNotFoundException {
		ByteArrayOutputStream buff = new ByteArrayOutputStream();
		ObjectOutput objectoutput = new ObjectOutputStream(buff);
		objectoutput.writeObject(obj);
		objectoutput.flush();
		objectoutput.close();
		byte[] rawData = buff.toByteArray();
		ObjectInput objectinput = new ObjectInputStream(new ByteArrayInputStream(rawData));
		return (T) objectinput.readObject();
	}

}
