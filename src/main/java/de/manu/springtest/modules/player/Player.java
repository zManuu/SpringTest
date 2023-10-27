package de.manu.springtest.modules.player;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class Player {

    private final UUID uuid;
    private final String name;
    private final LocalDateTime createdAt;

}
