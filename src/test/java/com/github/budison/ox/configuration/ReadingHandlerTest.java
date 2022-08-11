package com.github.budison.ox.configuration;

import com.github.budison.ox.Language;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;

public class ReadingHandlerTest {

    @Test
    void testReadingInputAndCorrectlySettingUpLanguage() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        System.setIn(new ByteArrayInputStream("1\n2".getBytes()));
        ReadingHandler readingHandler = new ReadingHandler();

        // Then
        softAssert.assertEquals(readingHandler.readLanguage(), Language.EN);
        softAssert.assertEquals(readingHandler.readLanguage(), Language.DE);
        softAssert.assertAll();
    }

    @Test(expectedExceptions = NoSuchElementException.class)
    void testReadingInvalidInputAndThrowingException() {
        // Given
        System.setIn(new ByteArrayInputStream("3".getBytes()));
        ReadingHandler readingHandler = new ReadingHandler();

        // Then throws exception
        readingHandler.readLanguage();
    }
}
