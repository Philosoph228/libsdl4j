package org.libsdl.api.event.events;

import com.sun.jna.Structure;
import org.intellij.lang.annotations.MagicConstant;
import org.libsdl.api.touch.SDL_TouchID;
import org.libsdl.jna.JnaStructure;

import static org.libsdl.api.event.SDL_EventType.SDL_MULTIGESTURE;

@Structure.FieldOrder({
        "type",
        "timestamp",
        "touchId",
        "dTheta",
        "dDist",
        "x",
        "y",
        "numFingers",
        "padding"
})
public final class SDL_MultiGestureEvent extends JnaStructure {

    @MagicConstant(intValues = SDL_MULTIGESTURE)
    public int type;
    public int timestamp;
    public SDL_TouchID touchId;
    public float dTheta;
    public float dDist;
    public float x;
    public float y;
    public short numFingers;
    public short padding;
}