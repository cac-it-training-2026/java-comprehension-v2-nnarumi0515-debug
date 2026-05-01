package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");

		try {
			// 会員ID入力
			System.out.print("会員IDを入力してください：");
			inputId = cr.inputNumber();

			// パスワード入力
			System.out.print("パスワードを入力してください：");
			inputPassword = cr.inputString();

			Member member = new Member(inputId, inputPassword, name, age, rank);

			// ユーザー情報出力
			member.showMember();

		} catch (IOException e) {
			e.printStackTrace();
			return;

		} catch (NumberFormatException e) {
			System.out.println("error");
			e.printStackTrace();
			return;
		}

	}

}
