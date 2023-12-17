package model.AnnotationSample;

import model.annotations.ClassAnnotation;
import model.annotations.MethodAnnotation;

/**
 * This is properly documented class
 */
@ClassAnnotation("This is Second Class with proper Documentation")
public class SecondClass {
    /**
     * This multipleNum() method is used to multiply
     * Numbers and printing it
     */
    @MethodAnnotation("This is multiplying numbers")
    public void multiplyNum()
    {
        int a=10;
        int b=10;
        System.out.println(a*b);
    }

    /**
     * This is divideNum() method
     * It is used to divide num
     */
    @MethodAnnotation("This is dividing numbers")
    public void divideNum()
    {
        int a=100;
        int b=20;
        System.out.print(a/b);
    }

}
