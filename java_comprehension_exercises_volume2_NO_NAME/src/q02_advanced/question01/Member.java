package q02_advanced.question01;

import java.util.ArrayList;
import java.util.List;

class Member {
	private int id;
	private List<Coupon> coupons = new ArrayList<>();

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

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

	public Member() {//引数なしのコンストラクタ

	}

	public Member(int id, String passString, String name, int age, int rank) {//引数ありのコンストラクタ
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
		coupons = new ArrayList<>();

		Coupon coupon1 = new Coupon(1, 0.5, "最初の特典");//Couponオブジェクト生成
		Coupon coupon2 = new Coupon(2, 0.25, "今月の特典");
		coupons.add(coupon1);//Listに追加
		coupons.add(coupon2);

	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", coupons=" + coupons + ", password=" + password + ", name=" + name + ", age="
				+ age + ", rank=" + rank + "]";
	}

	public void showMember() {//メソッドtoString出力
		System.out.println(toString());
		System.out.println("******************");

	}

}
