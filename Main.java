import java.io.*;
import java.util.*;

public class Main {

	public static void main (String[] args) throws IOException {
		try (FileInputStream in = new FileInputStream("/Users/dev/Desktop/sample.png");FileOutputStream out = new FileOutputStream("/Users/dev/Desktop/sample2.png")) {
			int data;
			while ((data = in.read()) != -1) {
				out.write((byte) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

// 次回、ストリームから
// http://java-code.jp/category/stream
// スッキリ P253 9.3.1 バイナリファイルの読み込みから
