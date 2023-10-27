package de.manu.springtest.modules.processor;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAdapter implements JsonSerializer<LocalDateTime> {

    private final String pattern;
    private DateTimeFormatter formatter;

    public DateTimeAdapter(String pattern) {
        this.pattern = pattern;
    }

    public JsonElement serialize(LocalDateTime src, Type typeOfSrc, JsonSerializationContext context) {
        if (formatter == null)
            formatter = DateTimeFormatter.ofPattern(pattern);

        return new JsonPrimitive(formatter.format(src));
    }

}
