package Model;

public class Software {
	
	private int softwareId;
	private String name;
	private String iconPath;
	private String version;
	private String releaseDate;//змінити тип дати і додати гетер і сетер!!!!!
	private int producerId;
	
	public int getSoftwareId() {
		return softwareId;
	}
	public void setSoftwareId(int softwareId) {
		this.softwareId = softwareId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIconPath() {
		return iconPath;
	}
	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

}
