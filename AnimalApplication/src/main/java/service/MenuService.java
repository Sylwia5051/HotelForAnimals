package service;

import java.util.Scanner;

import static dto.MenuDto.ESC;

public class MenuService {
    private final Scanner scanner;

    public MenuService() {
        scanner = new Scanner(System.in);
    }

    InputService inputService = new InputService();

    public void scan() {
        Integer menuNumber;
        String endProgram;

        System.out.println("Choose number 1-5 and write information about your animal. Write 5 if you're done");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                menuNumber = scanner.nextInt();
                if (menuNumber == 1) {
                    inputService.writeWhatKindOfAnimal();
                } else if (menuNumber == 2) {
                    inputService.writeAnimalName();
                } else if (menuNumber == 3) {
                    inputService.writeOwnerName();
                } else if (menuNumber == 4) {
                    inputService.writeDateOfBirth();
                } else if (menuNumber == 5) {
                    inputService.writeWeight();
                } else if (menuNumber == 6) {
                    inputService.addToList();
                } else if(menuNumber == 7){
                    System.out.println(inputService.toString());
                } else {
                    System.out.println("Try again. Write number 1-5.");
                    menuNumber = null;
                }
            } else {
                endProgram = scanner.next();
                if (ESC.equalsIgnoreCase(endProgram)) {
                    return;
                } else {
                    System.out.println("I can't read. Try again");
                    endProgram = "";
                }
            }
        }
    }
}
