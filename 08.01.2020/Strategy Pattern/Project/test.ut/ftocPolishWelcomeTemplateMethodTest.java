package test.ut;

import strategyPattern.ftocPolishWelcomeTemplateMethod;
import strategyPattern.interfejs;

import org.junit.Assert;
import org.junit.Test;

    public class ftocPolishWelcomeTemplateMethodTest {

        @Test
        public void createHead_ShouldReturn_DeutschWelcome() {
            interfejs mns = new ftocPolishWelcomeTemplateMethod();
            Assert.assertEquals("Czesc! ", mns.createHead());
        }
        @Test
        public void createBody_ShouldReturn_DeutschWelcome() {
            interfejs mns = new ftocPolishWelcomeTemplateMethod();
            Assert.assertEquals("Mam na imie Asia. ", mns.createBody());
        }

        @Test
        public void createFooter_ShouldReturn_DeutschWelcome() {
            interfejs mns = new ftocPolishWelcomeTemplateMethod();
            Assert.assertEquals("Do zobaczenia!", mns.createFooter());
        }

    }
