public class ResearchSample <T extends Number> extends LaboratoryItem {

	private String materialName; //название биоматериала
	private T purity; //показатель чистоты, любой тип, наследующийся от Number

	public ResearchSample (String serialNumber, int biohazardLevel, Integer sessionID, String materialName, T purity) {
		super(serialNumber, biohazardLevel, sessionID);
		this.materialName = materialName;
		this.purity = purity;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setPurity(T purity) {
		this.purity = purity;
	}

	public T getPurity() {
		return purity;
	}



}