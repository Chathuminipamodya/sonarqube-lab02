package com.example;

import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        int result = calc.calculate(10, 5, "add");
        logger.info(() -> "Result: " + result);
        
        UserService service = new UserService();
        service.findUser("admin");
        service.deleteUser("admin");
    }
}