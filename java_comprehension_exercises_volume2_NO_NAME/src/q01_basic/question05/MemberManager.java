package q01_basic.question05;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {

	}

	//拡張for文
	public static void showAllMembers(AbstMember[] members) {
		for (AbstMember mem : members) {//拡張for文（型　変数名：配列変数名）
			mem.showMember();//memの

		}

	}

}
