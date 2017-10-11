package gproscraping;

public class Track {
	
	private String trackName;
	private String location;
	private String date;
	private String raceDistance;
	private String laps;
	private String lapDistance;
	private String avgSpeed;
	private String GPHeld;
	private String numOfCorners;
	private String pitTime;
	private String power;
	private String handling;
	private String acceleration;
	private String downforce;
	private String overtaking;
	private String suspRigidity;
	private String fuelConsumption;
	private String tyreWear;
	private String gripLevel;
	private String category;
	
	public void printTrack(){
		System.out.println(trackName);
		System.out.println(location);
		System.out.println(date);
		System.out.println(raceDistance);
		System.out.println(laps);
		System.out.println(lapDistance);
		System.out.println(avgSpeed);
		System.out.println(GPHeld);
		System.out.println(numOfCorners);
		System.out.println(pitTime);
		System.out.println(power);
		System.out.println(handling);
		System.out.println(acceleration);
		System.out.println(downforce);
		System.out.println(overtaking);
		System.out.println(suspRigidity);
		System.out.println(fuelConsumption);
		System.out.println(tyreWear);
		System.out.println(gripLevel);
		System.out.println(category + "\n\n");
	}
	
	public String getTrackName() {
		return trackName;
	}
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getRaceDistance() {
		return raceDistance;
	}
	public void setRaceDistance(String raceDistance) {
		this.raceDistance = raceDistance;
	}
	public String getLaps() {
		return laps;
	}
	public void setLaps(String laps) {
		this.laps = laps;
	}
	public String getLapDistance() {
		return lapDistance;
	}
	public void setLapDistance(String lapDistance) {
		this.lapDistance = lapDistance;
	}
	public String getAvgSpeed() {
		return avgSpeed;
	}
	public void setAvgSpeed(String avgSpeed) {
		this.avgSpeed = avgSpeed;
	}
	public String getGPHeld() {
		return GPHeld;
	}
	public void setGPHeld(String gPHeld) {
		GPHeld = gPHeld;
	}
	public String getNumOfCorners() {
		return numOfCorners;
	}
	public void setNumOfCorners(String numOfCorners) {
		this.numOfCorners = numOfCorners;
	}
	public String getPitTime() {
		return pitTime;
	}
	public void setPitTime(String pitTime) {
		this.pitTime = pitTime;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getHandling() {
		return handling;
	}
	public void setHandling(String handling) {
		this.handling = handling;
	}
	public String getAcceleration() {
		return acceleration;
	}
	public void setAcceleration(String acceleration) {
		this.acceleration = acceleration;
	}
	public String getDownforce() {
		return downforce;
	}
	public void setDownforce(String downforce) {
		this.downforce = downforce;
	}
	public String getOvertaking() {
		return overtaking;
	}
	public void setOvertaking(String overtaking) {
		this.overtaking = overtaking;
	}
	public String getSuspRigidity() {
		return suspRigidity;
	}
	public void setSuspRigidity(String suspRigidity) {
		this.suspRigidity = suspRigidity;
	}
	public String getFuelConsumption() {
		return fuelConsumption;
	}
	public void setFuelConsumption(String fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	public String getTyreWear() {
		return tyreWear;
	}
	public void setTyreWear(String tyreWear) {
		this.tyreWear = tyreWear;
	}
	public String getGripLevel() {
		return gripLevel;
	}
	public void setGripLevel(String gripLevel) {
		this.gripLevel = gripLevel;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}	
	
}