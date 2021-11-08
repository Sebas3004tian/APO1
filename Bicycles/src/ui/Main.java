package ui;
import model.ACMEBicycle;
import model.BMTBicycle;
import model.BicycleAPO;

public class Main {
	ACMEBicycle bike;
	BMTBicycle bike2;

	public static void main(String[] args) {
		Main main= new Main();
		main.show();
	}
	
	public void show() {
		bike= new ACMEBicycle();
		bike.printStates();

		bike2= new BMTBicycle();
	}

}
