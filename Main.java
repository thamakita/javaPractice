import java.io.*;
import java.util.*;

public class Main {

	public static void main (String[] args) throws IOException {
		FileReader fr = new FileReader("/Users/dev/Desktop/dataPractice.dat");
		System.out.println("表示するよ。");
		int i = fr.read(); // int型に入れる
		while(i != -1) {
			char c = (char) i; // キャストする
			System.out.print(c);
			i = fr.read();
		}
		System.out.println("最後やで。");
		fr.close();
	}
}

// 次回、ストリームから
// http://java-code.jp/category/stream
// スッキリ P253 9.3.1 バイナリファイルの読み込みから
