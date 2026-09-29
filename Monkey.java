
public class Monkey extends RescueAnimal {

	private String species;
	private double tailLength;
	private double height;
	private double bodyLength;
	
	public Monkey(String name, String species, double tailLength, double height,
					double bodyLength, String gender, String age, String weight,
					String acquisitionDate, String acquisitionCountry,
					String trainingStatus, boolean reserved, String inServiceCountry) {
			setSpecies(species);
			getTailLength(tailLength);
			setHeight(height);
			setBodyLength(bodyLength);
			setName(name);
			setGender(gender);
			setAcquisitionDate(acquisitionDate);
	        setAcquisitionLocation(acquisitionCountry);
	        setTrainingStatus(trainingStatus);
	        setReserved(reserved);
	        setInServiceCountry(inServiceCountry);
	        setAnimalType("monkey");
	}
	
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public double getTailLength() {
		return tailLength;
	}
	public void getTailLength(double tailLength) {
		this.tailLength = tailLength;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBodyLength() {
		return bodyLength;
	}
	public void setBodyLength(double bodyLength) {
		this.bodyLength = bodyLength;
	}
	
	

}
