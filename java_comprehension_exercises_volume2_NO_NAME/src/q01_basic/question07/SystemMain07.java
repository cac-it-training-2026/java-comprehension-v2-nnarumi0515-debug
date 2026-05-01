package q01_basic.question07;

import java.util.List;

public class SystemMain07 {

	public static void main(String[] args) {

		NumberList numberList = new NumberList();
		System.out.println("1-任意の整数をListに代入します");
		System.out.print("input number>>");

		ConsoleReader consoleReader = new ConsoleReader();//オブジェクト生成
		int inputNumber = 0;

		try {
			// 6.2.1 inputNumber メソッド呼び出し
			inputNumber = consoleReader.inputNumber();
		} catch (Exception e) {
			// 6.2.2 スタックトレース出力
			e.printStackTrace();
			return; // 異常時は終了
		}

		System.out.println("****************");
		System.out.println("Listの合計を計算します");

		// 6.3 1〜入力値までのリスト作成
		numberList.addFromOneTo(inputNumber);
		// 6.4 numbers 取得して出力
		List<Integer> numbers = numberList.getNumbers();
		System.out.println("numbers: " + numbers);

		// 6.5 合計値計算・出力
		int sum = numberList.calcSumOfList();
		System.out.println("合計: " + sum);

		System.out.println("1から" + inputNumber + "までの合計は" + sum + "です。");

		System.out.println("****************");
		System.out.println("Listの各要素を2倍します");
		// 6.6 各要素を2倍
		numberList.doubleListEachValue();

		// 6.7 2倍後の出力
		System.out.println(numberList.getNumbers());

		System.out.println("****************");
		System.out.println("Listの前半分のインデックスの要素を削除します");
		// 6.8 前半削除
		numberList.removeIndexOfFirstHalf();

		// 6.9 前半削除後の出力
		System.out.println(numberList.getNumbers());

	}

}
