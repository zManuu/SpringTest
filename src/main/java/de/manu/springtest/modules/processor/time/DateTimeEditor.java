package de.manu.springtest.modules.processor.time;

import java.beans.PropertyEditorSupport;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeEditor extends PropertyEditorSupport {

    private final DateTimeFormatter formatter;

    public DateTimeEditor(String pattern) {
        this.formatter = DateTimeFormatter.ofPattern(pattern);
    }

    @Override
    public String getAsText() {
        return formatter.format((LocalDateTime) getValue());
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(
                LocalDateTime.from(
                        formatter.parse(text)
                )
        );
    }
}
