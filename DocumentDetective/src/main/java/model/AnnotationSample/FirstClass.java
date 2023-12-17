package model.AnnotationSample;

import model.annotations.ClassAnnotation;
import model.annotations.MethodAnnotation;

@ClassAnnotation("Hello World")
public class FirstClass {
    @MethodAnnotation("This is display")
    public void display()
    {
        System.out.println("Inside first display");
    }
    @MethodAnnotation("This is printing Hello WOrld")
    public void helloWorld()
    {
        System.out.println("Hello World!");
    }
    @MethodAnnotation("This is adding numbers")
    public void addNum()
    {
        int a=10, b=10;
        System.out.println(a+b);
    }
    @MethodAnnotation("This is subtracting numbers")
    public void subNum()
    {
        int a=10;
        int b=5;
        System.out.println(a-b);
    }
}
