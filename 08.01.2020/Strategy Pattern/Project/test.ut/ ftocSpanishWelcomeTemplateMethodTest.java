package test.ut;

import strategyPattern.ftocSpanishWelcomeTemplateMethod;
import strategyPattern.interfejs;

import org.junit.Assert;
import org.junit.Test;

public class ftocSpanishWelcomeTemplateMethodTest {

    @Test
    public void createHead_ShouldReturn_DeutschWelcome() {
        interfejs mns = new ftocSpanishWelcomeTemplateMethod();
        Assert.assertEquals("Hola! ", mns.createHead());
    }
    @Test
    public void createBody_ShouldReturn_DeutschWelcome() {
        interfejs mns = new ftocSpanishWelcomeTemplateMethod();
        Assert.assertEquals("Mi nombre es Asia. ", mns.createBody());
    }

    @Test
    public void createFooter_ShouldReturn_DeutschWelcome() {
        interfejs mns = new ftocSpanishWelcomeTemplateMethod();
        Assert.assertEquals("Hasta La Vista!", mns.createFooter());
    }

}
