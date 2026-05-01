package q01_basic.question07;

import java.util.ArrayList;
import java.util.List;

/**
 * 整数リストを制御するクラス
 * 
 */
class NumberList {

	/**
	 * 整数のList
	 * 
	 */
	private List<Integer> numbers = new ArrayList<>();//

	/**
	 * 1から引数までの整数をListに代入する
	 * 
	 * @param limit（Listの最終要素）
	 */
	public void addFromOneTo(Integer limit) {

		for (int i = 1; i <= limit; i++) {
			numbers.add(i);
		}

	}

	/**
	 * Listの各要素整数を合計する
	 * 
	 * @return Listの要素の合計値
	 */
	public Integer calcSumOfList() {
		Integer sum = 0;
		for (Integer num : numbers) {//拡張for文
			sum += num;
		}

		return sum;
	}

	/**
	 * Listの各要素を2倍にする
	 * 
	 */
	public void doubleListEachValue() {
		for (int i = 0; i < numbers.size(); i++) {
			numbers.set(i, numbers.get(i) * 2);//setでi番目の要素をnumbers.get(i)*2に置き換える
		}

	}

	/**
	 * Listの要素の前半部分を削除する
	 * 要素数が奇数の場合、中央値は残す
	 */
	public void removeIndexOfFirstHalf() {
		int half = numbers.size() / 2;//中央値残す場合でも小数点切り捨てのところまで取り除く

		for (int i = 0; i < half; i++) {//中央値
			numbers.remove(0);//remove(0)で0番目の要素を削除繰り返す
		}

	}

	/**
	 * @return numbers
	 */
	public List<Integer> getNumbers() {
		return numbers;
	}

	/**
	 * @param numbers セットする numbers
	 */
	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

}
