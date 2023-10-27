package de.manu.springtest.modules.processor.time;

import de.manu.springtest.Main;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

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
