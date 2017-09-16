package decorator.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * FilterInputStream 是 FileInputStream 的 装饰者
 * 
 * @author ywd
 *
 */
public class UpperInputStream extends FilterInputStream {

	protected UpperInputStream(InputStream in) {
		super(in);
	}

	@Override
	public int read() throws IOException {
		int i = super.read();
		return (i==-1? i : Character.toUpperCase((char)i));
	}
	
	public int read(byte[] b, int off, int len) throws IOException {
		int result = super.read(b, off, len);
		for (int i = off; i< off+result; i++) {
			b[i] = (byte) Character.toUpperCase((char)b[i]);
		}
		return result;
	}

	public static void main(String[] args) throws Exception {
		String path = System.getProperty("user.dir");
		File f = new File(path+"/src/decorator/beverage/Beverage.java");
		
		// 到底谁有readline()
		BufferedReader is = new BufferedReader(new FileReader(f));
		String s = "";
		while ((s=is.readLine()) != null) {
			System.out.println(s);
		}
		is.close();
		
		// 
		InputStream in = new UpperInputStream(new BufferedInputStream(new FileInputStream(f)));
		
		int i= 0;
		while((i = in.read()) >= 0) {
			System.out.print((char) i);
		}
		
		in.close();
		
		
	}
}
