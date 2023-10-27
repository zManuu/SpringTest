package de.manu.springtest.modules.processor.time;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;

public class DateTimeSerializer implements JsonSerializer<Temporal> {

    private final DateTimeFormatter formatter;

    public DateTimeSerializer(String pattern) {
        this.formatter = DateTimeFormatter.ofPattern(pattern);
    }

    @Override
    public JsonElement serialize(Temporal src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(formatter.format(src));
    }

}
