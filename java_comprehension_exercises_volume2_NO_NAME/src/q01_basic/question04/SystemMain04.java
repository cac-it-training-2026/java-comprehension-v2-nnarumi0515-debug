package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		Member[] members = new Member[2];

		members[0] = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);
		members[1] = new Member(2, "aaaAAA", "Sato Kwnsuke", 43, 1);

		MemberManager.showAllMembers(members);

	}

}
