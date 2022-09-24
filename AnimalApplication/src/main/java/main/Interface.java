package main;

import service.MenuService;

public class Interface {

    public static void main(String[] args) {

        MenuService menuService = new MenuService();

        System.out.println("Hello in animal world. Tell me about your animal");
        menuService.scan();
    }
}
