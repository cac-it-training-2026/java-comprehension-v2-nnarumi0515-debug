package q02_advanced.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// ① 文字列入力
	public static String inputString() throws IOException {
		return br.readLine();
	}

	// ② 数値入力
	public static int inputNumber() throws IOException {
		return Integer.parseInt(br.readLine());
	}
}
