package org.libsdl.api.event.events;

import com.sun.jna.Structure;
import org.intellij.lang.annotations.MagicConstant;
import org.libsdl.jna.JnaStructure;

import static org.libsdl.api.event.SDL_EventType.SDL_JOYDEVICEADDED;
import static org.libsdl.api.event.SDL_EventType.SDL_JOYDEVICEREMOVED;

@Structure.FieldOrder({
        "type",
        "timestamp",
        "which"
})
public final class SDL_JoyDeviceEvent extends JnaStructure {

    @MagicConstant(intValues = {SDL_JOYDEVICEADDED, SDL_JOYDEVICEREMOVED})
    public int type;
    public int timestamp;
    public int which;           // TODO: Shouldn't it be SDL_JoystickID?
}