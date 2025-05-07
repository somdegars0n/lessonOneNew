package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SenderTest {
    private static final String DEFAULT_URL = "default.com";
    private static final String DEFAULT_PATH = "/api";
    private static final String DEFAULT_BODY = "default body";

    private Sender sender;

    @BeforeEach
    void setUp() {
        sender = new Sender(DEFAULT_URL, DEFAULT_PATH, DEFAULT_BODY);
    }

    @Nested
    @DisplayName("Тесты конструктора")
    class ConstructorTests {
        @Test
        @DisplayName("Конструктор должен корректно инициализировать поля")
        void constructorShouldInitializeFields() {
            // Проверяем через метод send без параметров
            String result = sender.send(null, null, null);

            assertTrue(result.contains(DEFAULT_URL), "URL должен быть инициализирован");
            assertTrue(result.contains(DEFAULT_PATH), "Path должен быть инициализирован");
            assertTrue(result.contains(DEFAULT_BODY), "Body должен быть инициализирован");
        }
    }
}
