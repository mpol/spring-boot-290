package demo;

import org.springframework.boot.builder.SpringApplicationBuilder;

import demo.child.Child;
import demo.parent.Parent;

public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Parent.class).child(Child.class).run(args);
    }
}
