package de.manu.springtest.modules.player;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Player {

    private final String id;
    private final String name;
    private final LocalDateTime createdAt;

}
