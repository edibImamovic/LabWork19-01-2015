package ba.bitcamp.streams.readers.writers;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.CharBuffer;

public class Streams {

	public static void main(String[] args) {

		InputStream dis = new DataInputStream(System.in);
		Reader read = new InputStreamReader(System.in);
		CharBuffer javaCharBuffer = CharBuffer.allocate(4);

		byte[] buffer = new byte[4];

		int numBytesRead = 0;

		try {
			while ((numBytesRead = dis.read(buffer)) >= 0) {
				System.out.println("Procitali :" + numBytesRead + "bytea\n"
						+ new String(buffer));
				for (int i = 0; i < buffer.length; i++) {
					buffer[i] = 0;
				}
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	
		try {
			while (read.read(javaCharBuffer)>=0){
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
