package de.manu.springtest.modules.processor.time;

import java.beans.PropertyEditorSupport;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeEditor extends PropertyEditorSupport {

    private final DateTimeFormatter formatter;

    public TimeEditor(String pattern) {
        this.formatter = DateTimeFormatter.ofPattern(pattern);
    }

    @Override
    public String getAsText() {
        return formatter.format((LocalTime) getValue());
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(
                LocalTime.from(
                        formatter.parse(text)
                )
        );
    }

}
