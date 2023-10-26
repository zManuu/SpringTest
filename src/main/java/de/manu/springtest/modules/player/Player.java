package de.manu.springtest.modules.player;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Player {

    private final String id;
    private final String name;
    private final String displayName;

}
