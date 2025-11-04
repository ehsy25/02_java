package com.chaewookim.hw3.run;

import com.chaewookim.hw3.controller.ProductController;

public class Application {
    public static void main(String[] args) {

        ProductController controller = new ProductController();

        controller.mainMenu();
    }
}
