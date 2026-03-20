public class MedicalDevice extends LaboratoryItem {

	private String deviceName; //название прибора
	private double precision; //погрешность измерения

	public MedicalDevice(String serialNumber, int biohazardLevel, Integer sessionID, String deviceName, double precision) {
		super(serialNumber, biohazardLevel, sessionID);
		this.deviceName = deviceName;
		this.precision = precision;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setPrecision(double precision) {
		this.precision = precision;
	}

	public double getPrecision() {
		return precision;
	}

}