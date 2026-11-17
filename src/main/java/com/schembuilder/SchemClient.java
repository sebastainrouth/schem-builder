package com.schembuilder;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class SchemClient implements ClientModInitializer {
    public static final SchematicBuilder BUILDER = new SchematicBuilder();

    @Override
    public void onInitializeClient() {
        ClientTickEvents.END_CLIENT_TICK.register(BUILDER::tick);
        SchemCommands.register(BUILDER);
    }
}
