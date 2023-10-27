package de.manu.springtest.modules.processor.format;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class FormatConfig {

    private final String dateTime;
    private final String date;
    private final String time;

}
