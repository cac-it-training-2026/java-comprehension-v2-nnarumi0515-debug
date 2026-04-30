package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];

		members[0] = new NonMember("Sato Kensuke");//オブジェクト生成、代入
		members[1] = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);//オブジェクト生成、代入

		MemberManager.showAllMembers(members);//

		System.out.println("---BUY ITEM---");
		for (AbstMember m : members) {
			m.buyItem();
		}

	}

}
