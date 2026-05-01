package q02_advanced.question02;

import java.util.List;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {

	}

	//拡張for文
	public static void showAllMembers(List<Member> members) {
		for (Member m : members) {//拡張for文（型　変数名：配列変数名）
			m.showMember();//オブジェクトmのshowMember呼び出し

		}

	}

	public static void updatePassword(List<Member> members, int targetId, String newPassword) {

		boolean found = false;

		for (Member m : members) {

			if (m.getId() == targetId) {
				m.setPassword(newPassword);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("該当者はいませんでした。");
		}
	}

}
