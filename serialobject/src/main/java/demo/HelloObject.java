package demo;

import java.io.Serializable;

public class HelloObject implements Hello, Serializable {

    private String greeting;

    public HelloObject(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public void hello() {
        System.out.printf(this.greeting);
    }
}
