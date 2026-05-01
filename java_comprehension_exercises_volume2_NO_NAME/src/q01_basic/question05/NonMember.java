package q01_basic.question05;

public class NonMember extends AbstMember {

	public NonMember(String name) {//コンストラクタ定義引数name
		this.name = name;

	}

	@Override //オーバーライド（再定義）
	public void buyItem() {
		System.out.println(name + "purchased the item at a fixed price");

	}

	@Override //オーバーライド（再定義）
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println(name + "is a non-member");
		System.out.println("*****************");

	}

}
