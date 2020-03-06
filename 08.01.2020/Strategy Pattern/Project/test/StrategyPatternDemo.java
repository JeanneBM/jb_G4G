package test;

import strategyPattern.ftocSpanishWelcomeTemplateMethod;
import strategyPattern.ftocDeutschWelcomeTemplateMethod;
import strategyPattern.ftocPolishWelcomeTemplateMethod;
import strategyPattern.strategyRunner;

public class StrategyPatternDemo {

    public static void main (String[] args){
        strategyRunner execute = new strategyRunner();

        execute.setStrategy(new ftocDeutschWelcomeTemplateMethod());
        execute.setStrategy(new ftocPolishWelcomeTemplateMethod());
        execute.setStrategy(new ftocSpanishWelcomeTemplateMethod());

}

}
