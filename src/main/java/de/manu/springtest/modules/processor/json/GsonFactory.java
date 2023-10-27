package de.manu.springtest.modules.processor.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import de.manu.springtest.modules.Configuration;
import de.manu.springtest.modules.processor.time.DateTimeSerializer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class GsonFactory {

    public static Gson build(Configuration.Format formatConfig) {
        return new GsonBuilder()
                .registerTypeAdapter(LocalDateTime.class, new DateTimeSerializer(formatConfig.dateTime()))
                .registerTypeAdapter(LocalDate.class, new DateTimeSerializer(formatConfig.date()))
                .registerTypeAdapter(LocalTime.class, new DateTimeSerializer(formatConfig.time()))
                .create();
    }

}
