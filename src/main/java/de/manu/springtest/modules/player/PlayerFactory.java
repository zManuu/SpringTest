package de.manu.springtest.modules.player;

public class PlayerFactory {

    public static Player buildPlayer(String id, String name) {
        return Player.builder()
                .id(id)
                .displayName(name)
                .name(name)
                .build();
    }

}
