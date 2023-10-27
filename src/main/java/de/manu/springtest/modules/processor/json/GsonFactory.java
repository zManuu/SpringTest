package de.manu.springtest.modules.processor.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import de.manu.springtest.modules.processor.format.FormatConfig;
import de.manu.springtest.modules.processor.time.DateTimeSerializer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class GsonFactory {

    public static Gson build(FormatConfig formatConfig) {
        return new GsonBuilder()
                .registerTypeAdapter(LocalDateTime.class, new DateTimeSerializer(formatConfig.getDateTime()))
                .registerTypeAdapter(LocalDate.class, new DateTimeSerializer(formatConfig.getDate()))
                .registerTypeAdapter(LocalTime.class, new DateTimeSerializer(formatConfig.getTime()))
                .create();
    }

}
