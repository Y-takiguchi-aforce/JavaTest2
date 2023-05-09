package jp.co.aforce.test;

public class PracticeTest8 {


	//1
	void printHello() {
		System.out.println("Hello");
	}

	//2
	void printRandomMessage() {
		String[] aisatsu = { "こんばんは", "こんにちは", "おはよう" };
		int n = (int) (3 * Math.random());
		System.out.println(aisatsu[n]);
	}

	//3
	void printMessage(String message) {
		System.out.println(message);
	}

	//4
	void printMessage(String message, int count) {
		for(int i = 0; i <= count; i++) {
		System.out.print(message);
		}
		System.out.println();
	}

	//5
	void printRectangleArea(double height, double width) {
		System.out.println(height * width);
	}

	//6
	public String getWeatherForecast() {
		String[] day = {"今日","明日","明後日"};
		String[] weather = {"晴れ","曇り","雨","雪"};
		int x = (int) (3 * Math.random());
		int y = (int) (4 * Math.random());
		return day[x] +"の天気は" + weather[y] + "でしょう。";
	}
	
	//7
	boolean isEvenNumber(int value) {
		if(value % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//8
	void getMessage(String name, boolean isKid) {
		if(isKid == true) {
			System.out.println("こんにちは。" + name + "ちゃん。");
		}else {
			System.out.println("こんにちは。" + name + "さん。");
		}
	}
	
	//9
	public String getLongestString(String[] array) {
		int a = array[0].length();
		int mojiMax = 0;
		for(int i = 1; i < array.length; i++) {
			if(a < array[i].length()) {
				a = array[i].length();
				mojiMax = a;
			}
		}
		return array[mojiMax];
	}
	
	//10
	boolean isAdult(int getAge) {
		if( getAge >= 20 ) {
			return true;
		}else {
			return false;
		}
	}

}
