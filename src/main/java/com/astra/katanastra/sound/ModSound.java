package com.astra.katanastra.sound;

import com.astra.katanastra.katanastraMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;



public class ModSound {
    public static SoundEvent ULTIMATE_SOUND = registerSoundEvent("ultimate_sound");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(katanastraMod.MODID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
