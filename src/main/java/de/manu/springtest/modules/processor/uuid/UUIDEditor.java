package de.manu.springtest.modules.processor.uuid;

import java.beans.PropertyEditorSupport;
import java.util.UUID;

public class UUIDEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        return ((UUID) getValue()).toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(UUID.fromString(text));
    }
}
