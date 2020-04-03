package it.corso.java.files;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		
		String dir = "D:\\DEV\\Udemy\\CorsoJava\\test-dir";
		String file = dir + "\\test-file.txt";
		
		m.creaDirectory(dir);
		m.creaFile(file);
		
		File d = new File(dir);
		File f = new File(file);
		System.out.println("CHECK CARTELLA" +
							"\nesiste la cartella? -> " + d.isDirectory() +
							"\nesiste il file? -> " + d.isFile() +
							"\nCHECK FILE" +
							"\nesiste la cartella? -> " + f.isDirectory() +
							"\nesiste il file? -> " + f.isFile());
		
		File[] files = d.listFiles();
		for (File file2 : files) {
			System.out.println(file2.getName() + " | " + file2.getPath());
			file2.delete();
		}
	}
	
	public void creaFile(String path) {
		File f = new File(path);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void creaDirectory(String path) {
		File d = new File(path);
		if (!d.exists()) {
			d.mkdir();
		}
	}
}