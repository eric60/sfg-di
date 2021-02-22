package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.controllers.DIControllers.PropertyInjectedController;
import guru.springframework.sfgdi.services.GreetingServices.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
            propertyInjectedController = new PropertyInjectedController();
            propertyInjectedController.greetingService = new ConstructorGreetingService();
    }

    @Test
    void Test_GetGreeting() {
        System.out.println(propertyInjectedController.getGreeting());;
    }
}