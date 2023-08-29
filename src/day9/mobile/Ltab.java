package day9.mobile;

public class Ltab extends Mobile {
	public Ltab() {}
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	//time*10
	public void operate(int time) {
		super.setBatterySize(super.getBatterySize()-(time*10));
    }
	public void charge(int time) {
		super.setBatterySize(super.getBatterySize()+(time*10));		
	}
}

