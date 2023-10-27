package de.manu.springtest.modules.processor;

import lombok.AllArgsConstructor;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import java.time.LocalDateTime;

@AllArgsConstructor
public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {

    private final FormatConfig formatConfig;

    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(LocalDateTime.class, new DateTimeEditor(formatConfig.getDateTime()));
    }
}
