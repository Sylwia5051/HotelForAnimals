package service;

import dto.InputDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InputService {
    private final Scanner scanner;

    public InputService() {
        scanner = new Scanner(System.in);
    }

    InputDto inputDto = new InputDto();
    String whatAnimal = inputDto.getWhatAnimal();
    List<InputDto> listOfAnimal = new ArrayList<>();

    public void writeWhatKindOfAnimal() {
        //String whatAnimal = inputDto.getWhatAnimal();
        if (whatAnimal == null) {
            System.out.println("Write what kind of animal you have.");
            inputDto.setWhatAnimal(scanner.nextLine());
            System.out.println("You have a " + inputDto.getWhatAnimal());
        } else {
            System.out.println("You have a " + inputDto.getWhatAnimal());
        }
    }

    public void writeAnimalName() {
        String animalName = inputDto.getAnimalName();
        if (animalName == null) {
            System.out.println("Write animal name.");
            inputDto.setAnimalName(scanner.nextLine());
            System.out.println("Animal name is " + inputDto.getAnimalName());
        } else {
            System.out.println("Animal name is " + inputDto.getAnimalName());
        }
    }

    public void writeOwnerName() {
        String ownerName = inputDto.getOwnerName();
        if (ownerName == null) {
            System.out.println("Write owner name of animal.");
            inputDto.setOwnerName(scanner.nextLine());
            System.out.println("Animal owner is " + inputDto.getOwnerName());
        } else {
            System.out.println("Animal owner is " + inputDto.getOwnerName());
        }
    }

    public void writeDateOfBirth() {
        String dateOfBirth = inputDto.getDateOfBirth();
        if (dateOfBirth == null) {
            System.out.println("Write date of birth animal.");
            inputDto.setDateOfBirth(scanner.nextLine());
            System.out.println("Animal birthday is " + inputDto.getDateOfBirth());
        } else {
            System.out.println("Animal birthday is " + inputDto.getDateOfBirth());
        }
    }

    public void writeWeight() {
        Float animalWeight = inputDto.getAnimalWeight();
        if (animalWeight == null) {
            System.out.println("Write weight of animal.");
            do {
                Pattern patternWeight = Pattern.compile("[0-9]+(\\.[0-9]+)?");
                String weightInput;
                weightInput = getUserInput();
                if (patternWeight.matcher(weightInput).matches()) {
                    try {
                        inputDto.setAnimalWeight(Float.valueOf(weightInput));
                        System.out.println("Animal weight is " + inputDto.getAnimalWeight());
                    } catch (NumberFormatException nfe) {
                        System.out.println("Something is wrong with weight");
                    }
                }
            } while (inputDto.getAnimalWeight() == null);

        } else {
            System.out.println("Animal weight is " + inputDto.getAnimalWeight());
        }
    }

    private String getUserInput() {
        return scanner.nextLine();
    }

    public void addToList() {
        if (inputDto.getWhatAnimal() != null
                && inputDto.getAnimalName() != null
                && inputDto.getOwnerName() != null
                && inputDto.getDateOfBirth() != null
                && inputDto.getAnimalWeight() != null) {
            listOfAnimal.add(inputDto);
            inputDto = null;
            System.out.println("This animal is added to the list");
        } else {
            System.out.println("I can't add animal to the list, you must complete information");
        }

    }

    @Override
    public String toString() {
        return "List of our animals: " + listOfAnimal;
    }

//    public String toString() {
//        return inputDto.getOwnerCat()
//                + " cat is " + inputDto.getCatName()
//                + ", his birthday is: " + inputDto.getDateOfBirth()
//                + ", his weight is:  " + inputDto.getCatWeight();
//    }
}
