package myClasses;

public class Session implements SessionInterface {

	private int size;
	private double[] arr;
	private int choice;
	private String result;
	
	public Session() {
		
	}
	
	@Override
	public String compute() {
		double sum = 0, ave, min, max, var, std;
		min = 999999;
		max = 0;
		for (double a: arr) {
			sum += a;
			if (a < min)
				min = a;
			if (a > max)
				max = a;
		}
		ave = sum/size;
		double temp = 0;
		for (double a: arr) {
			temp = temp + Math.pow((ave - a), 2);
		}
		var = temp/size;
		std = Math.pow(var, 0.5);
		
		switch (choice) {
		case 1:
			result = "The sum is " + sum;
			break;
		case 2:
			result = "The average is " + ave;
			break;
		case 3:
			result = "The minimum is " + min;
			break;
		case 4:
			result = "The maximum is " + max;
			break;
		case 5:
			result = "The variance is " + var;
			break;
		case 6:
			result = "The standard deviation is " + std;
			break;
		default:
			result = "";
			break;
		}
		
		return result;
	}

	@Override
	public void setSize( int size) {
		this.size = size;
		arr = new double[size];
	}

	@Override
	public void setChoice( int choice ) {
		this.choice = choice;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void setArrayElement(double value, int index) {
		arr[index] = value;
	}

}
