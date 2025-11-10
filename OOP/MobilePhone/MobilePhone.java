public class MobilePhone {

	private String brand;
	private String model;
	private int storageGB;
	private int batteryLevel;
	private boolean isPoweredOn;

	//конструкторы

	public MobilePhone() {
		this("brand", "model", 0, 0, true);
	}

	public MobilePhone(String brand, String model, int storageGB) {
		this(brand, model, storageGB, 0, true);
	}

	public MobilePhone(String brand, String model, int storageGB, int batteryLevel, boolean isPoweredOn) {
		this.brand = brand;
		this.model = model;
		this.storageGB = storageGB;
		this.batteryLevel = batteryLevel;
		this.isPoweredOn = isPoweredOn;
	}

	//методы

	public String displayInf() {
		return brand + "\n" + model + "\n" + storageGB + "\n" + batteryLevel + "\n" + isPoweredOn;
	}

	public boolean powerOn() {
		if (!isPoweredOn) {
			isPoweredOn = true;
		}
		return isPoweredOn;
	}

	public boolean powerOff() {
		if (isPoweredOn) {
			isPoweredOn = false;
		}
		return isPoweredOn;
	}

	public int chargeBattery(int percent) {
		if (batteryLevel <= 15) {
			batteryLevel = batteryLevel + percent;
		}
		return batteryLevel;
	}

	public int useBattery(int percent) {
		batteryLevel = batteryLevel - percent;
		return batteryLevel;
	}

}