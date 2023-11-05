package jUnit5Tests;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstTestClass {

    @BeforeAll
    void beforeAll(){
        System.out.println("-- This is the Before All Method --");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("-- This is the Before Each Method --");
    }
    @AfterAll
    void afterAll(){
        System.out.println("-- This is the After All Method --");
    }
    @AfterEach
    void afterEach(){
        System.out.println("-- This is the After Each Method --");
    }

    @Test
    void firstMethod(){
        System.out.println("This is the 1st Test Method");
    }
    @Test
    @DisplayName("Ticket Nr X - Test Case 2 - this method is the 2nd one")
    void secondMethod(){
        System.out.println("This is the 2nd Test Method");
    }
}
