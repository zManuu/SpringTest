package de.manu.springtest.modules.processor;

import de.manu.springtest.modules.processor.format.FormatConfig;
import de.manu.springtest.modules.processor.time.DateEditor;
import de.manu.springtest.modules.processor.time.DateTimeEditor;
import de.manu.springtest.modules.processor.time.TimeEditor;
import de.manu.springtest.modules.processor.uuid.UUIDEditor;
import lombok.AllArgsConstructor;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

@AllArgsConstructor
public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {

    private final FormatConfig formatConfig;

    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(LocalDateTime.class, new DateTimeEditor(formatConfig.getDateTime()));
        registry.registerCustomEditor(LocalDate.class, new DateEditor(formatConfig.getDate()));
        registry.registerCustomEditor(LocalTime.class, new TimeEditor(formatConfig.getTime()));
        registry.registerCustomEditor(UUID.class, new UUIDEditor());
    }
}
