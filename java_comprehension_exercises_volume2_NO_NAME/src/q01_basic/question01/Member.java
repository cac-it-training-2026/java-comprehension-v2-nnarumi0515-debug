package q01_basic.question01;

/**
 * Member 会員クラス
 */
class Member {
	/**名前*/
	String name;
	/**年齢*/
	int age;
	/**ランク*/
	int rank;

	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");

	}

}
