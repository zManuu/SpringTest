package de.manu.springtest.modules.processor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.LocalDateTime;

public class GsonFactory {

    public static Gson build(FormatConfig formatConfig) {
        return new GsonBuilder()
                .registerTypeAdapter(LocalDateTime.class, new DateTimeAdapter(formatConfig.getDateTime()))
                .create();
    }

}
