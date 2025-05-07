package org.example;

public class Sender {
    private String url;
    private String path;
    private String body;

    // Конструктор с параметрами
    public Sender(String url, String path, String body) {
        this.url = url;
        this.path = path;
        this.body = body;
    }

    // Метод send с параметрами
    public String send(String url, String path, String body) {
        // Используем переданные параметры или значения по умолчанию из полей класса
        String actualUrl = (url != null && !url.isEmpty()) ? url : this.url;
        String actualPath = (path != null && !path.isEmpty()) ? path : this.path;
        String actualBody = (body != null && !body.isEmpty()) ? body : this.body;

        // Формируем результирующую строку
        return String.format("По данному пути: %s%s , отправлен запрос с телом: %s",
                actualUrl,
                actualPath,
                actualBody);
    }
}
