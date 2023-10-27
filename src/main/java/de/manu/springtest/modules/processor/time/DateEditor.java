package de.manu.springtest.modules.processor.time;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateEditor extends PropertyEditorSupport {

    private final DateTimeFormatter formatter;

    public DateEditor(String pattern) {
        this.formatter = DateTimeFormatter.ofPattern(pattern);
    }

    @Override
    public String getAsText() {
        return formatter.format((LocalDate) getValue());
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(
                LocalDate.from(
                        formatter.parse(text)
                )
        );
    }
}
