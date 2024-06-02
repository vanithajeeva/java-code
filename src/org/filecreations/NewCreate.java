package org.filecreations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class NewCreate {
public static void main(String[] args) throws IOException {
	File f = new File("c:\\Java\\Project\\File");
	
//	boolean mkdir = f.mkdir();
//	System.out.println(mkdir);
	
//	boolean mkdirs = f.mkdirs();
//	System.out.println(mkdirs);
	
	
//	boolean file = f.createNewFile();
//	System.out.println(file);

	
	boolean write = f.canWrite();
	System.out.println(write);
	
//	boolean read = f.canRead();
//	System.out.println(read);
	
//	boolean execute = f.canExecute();
//	System.out.println(execute);
	
//	boolean exists = f.exists();
//	System.out.println(exists);
	
//	FileUtils.write(f, "jeeva");
//	System.out.println("done");
//	
//	String read = FileUtils.readFileToString(f);
//	System.out.println(read.contains("jeeva"));
//	
//	FileUtils.write(f, " rejivani", true);
//	System.out.println("done");
//	
//	File f2 = new File("c:\\java\\task\\bharath2.txt");
	
//	boolean newFile = f2.createNewFile();
//	System.out.println(newFile);
//	
//	FileUtils.copyFile(f, f2);
//	System.out.println("done");

	
	
	
}
}
