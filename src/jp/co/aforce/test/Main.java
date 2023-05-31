package jp.co.aforce.test;

//11
public class Main {

	public static void main(String[] args) {
		PracticeTest8 pt = new PracticeTest8();
		
		//1
		pt.printHello();
		//2
		pt.printRandomMessage();
		//3
		pt.printMessage("Hello");
		//4
		pt.printMessage("Hello", 5);
		//5
		pt.printRectangleArea(2, 4);
		//6
		System.out.println(pt.getWeatherForecast());
		//7
		System.out.println(pt.isEvenNumber(9));
		//8
		System.out.println(pt.getMessage("nanashi", false));
		//9
		String[] array2 = {"JavaScript", "HTML", "CSS"};
		System.out.println(pt.getLongestString(array2));
		//10
		Person person = new Person("まゆこ",18);
		System.out.println(pt.isAdult(person));
	}

}
