public abstract class LaboratoryItem {

	private String serialNumber; //серийный номер
	private int biohazardLevel; //уровень биологической опасности
	private Integer sessionID;

	public LaboratoryItem () {
		this("000", 0, 0);
	}

	public LaboratoryItem (String serialNumber, int biohazardLevel, Integer sessionID) {
		this.serialNumber = serialNumber;
		this.biohazardLevel = biohazardLevel;
		this.sessionID = sessionID;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setBiohazardLevel(int biohazardLevel) {
		if ((biohazardLevel > -1) && (biohazardLevel < 11)) {
			this.biohazardLevel = biohazardLevel;
		}
	}

	public int getBiohazardLevel() {
		return biohazardLevel;
	}

	public void setSessionID(Integer sessionID) {
		this.sessionID = sessionID;
	}

	public Integer getSessionID() {
		return sessionID;
	}

}