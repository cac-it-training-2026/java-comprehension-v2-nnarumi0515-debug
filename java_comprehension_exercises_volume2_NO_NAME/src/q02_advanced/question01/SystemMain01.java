package q02_advanced.question01;

public class SystemMain01 {

	public static void main(String[] args) {

		System.out.println("===会員情報を表示します===");
		//オブジェクト生成
		Member m1 = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member m2 = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1);

		m1.showMember();//m1オブジェクトのshowMember呼び出し
		m2.showMember();
	}

}
