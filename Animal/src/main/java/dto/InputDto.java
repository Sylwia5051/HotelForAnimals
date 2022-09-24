package dto;

public class InputDto {
    private String whatAnimal;
    private String animalName;
    private String ownerName;
    private String dateOfBirth;
    private Float animalWeight;


    public InputDto() {
    }

    public String getWhatAnimal() {
        return whatAnimal;
    }

    public void setWhatAnimal(String whatAnimal) {
        this.whatAnimal = whatAnimal;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Float getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(Float animalWeight) {
        this.animalWeight = animalWeight;
    }

    @Override
    public String toString() {
        return "Animal: " + whatAnimal +
                ", name of animal='" + animalName + '\'' +
                ", name of owner='" + ownerName + '\'' +
                ", date of birth='" + dateOfBirth + '\'' +
                ", animal weight=" + animalWeight +
                '}';
    }
}
