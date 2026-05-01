package q02_advanced.question02;

import java.io.IOException;

public class SystemMain02 {

	public static void main(String[] args) {
		try {
			//ConsoleReaderオブジェクト生成
			ConsoleReader cr = new ConsoleReader();

			//Member生成（2件）
			Member m1 = Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2);
			Member m2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

			// リスト作成
			java.util.List<Member> members = new java.util.ArrayList<>();
			members.add(m1);
			members.add(m2);

			//現在の会員情報表示
			System.out.println("===会員情報を表示します===");
			MemberManager.showAllMembers(members);

			//入力処理
			System.out.print("会員IDを入力してください：");
			int id = cr.inputNumber();

			System.out.print("新しいパスワードを入力してください：");
			String newPassword = cr.inputString();

			//例外処理（要件通り）
		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
			return;
		}

		// 
		try {
			ConsoleReader cr = new ConsoleReader();

			int id = cr.inputNumber();
			String newPassword = cr.inputString();

			//パスワード更新
			java.util.List<Member> members = new java.util.ArrayList<>();
			MemberManager.updatePassword(members, id, newPassword);

			//更新後表示
			MemberManager.showAllMembers(members);

		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
			return;
		}
	}

}
