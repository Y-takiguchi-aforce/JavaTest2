package jp.co.aforce.test;

public class MinMax {

	public int getMaxValue(int a, int b, int c) {
		int max;
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
		if (c > max) {
			return c;
		}else {
		return max;
		}
	}

	public int getMinValue(int a, int b, int c) {
		int min;
		if(a < b) {
			min = a;
		}else {
			min = b;
		}
		if (c < min) {
			return c;
		}else {
		return min;
		}
	}

}
