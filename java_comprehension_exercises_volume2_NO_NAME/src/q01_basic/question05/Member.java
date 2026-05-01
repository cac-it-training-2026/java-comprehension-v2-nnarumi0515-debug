package q01_basic.question05;

class Member extends AbstMember {
	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return name
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	//引数なしコンストラクタ
	public Member() {

	}

	//引数ありコンストラクタ
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;//このフィールドのIDに引数で受け取ったidを代入する
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;

	}

	@Override //AbustMemberクラスのbuyItemをオーバーライド（再定義）
	public void buyItem() {
		System.out.println(name + "purchased the item at 50% off");//メンバーは50％offで購入

	}

	@Override //AbustMemberクラスのbuyItemをオーバーライド（再定義）
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("password:" + id);
		System.out.println("name:" + password);
		System.out.println("age:" + name);
		System.out.println("rank:" + rank);
		System.out.println("*****************");
	}

}
