package com.springexample.SpringCore.POJOs.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CalculatorTest {

    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("aopBeans.xml");
        ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) context.getBean("arithmeticCalculator");
        arithmeticCalculator.add(1, 2);
        arithmeticCalculator.sub(5, 2);
        arithmeticCalculator.mul(3, 5);
        arithmeticCalculator.div(8, 2);

        UnitCalculator unitCalculator = (UnitCalculator) context.getBean("unitCalculator");
        unitCalculator.kilogramToPound(10);
        unitCalculator.kilometerToMile(5);
    }

}
