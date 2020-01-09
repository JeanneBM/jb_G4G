package test.ut;

import strategyPattern.ftocDeutschWelcomeTemplateMethod;
import strategyPattern.interfejs;

import org.junit.Assert;
import org.junit.Test;

public class ftocDeutschWelcomeTemplateMethodTest {

        @Test
        public void createHead_ShouldReturn_DeutschWelcome() {
            interfejs mns = new ftocDeutschWelcomeTemplateMethod();
            Assert.assertEquals("Guten Tag! ", mns.createHead());
        }
        @Test
        public void createBody_ShouldReturn_DeutschWelcome() {
            interfejs mns = new ftocDeutschWelcomeTemplateMethod();
            Assert.assertEquals("Ich heiße Asia. ", mns.createBody());
        }

        @Test
        public void createFooter_ShouldReturn_DeutschWelcome() {
            interfejs mns = new ftocDeutschWelcomeTemplateMethod();
            Assert.assertEquals("Auf Wiedersehen!", mns.createFooter());
        }



}
