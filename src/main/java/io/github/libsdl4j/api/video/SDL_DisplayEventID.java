package io.github.libsdl4j.api.video;

import io.github.libsdl4j.jna.JnaEnum;

/**
 * Event subtype for display events
 */
public final class SDL_DisplayEventID implements JnaEnum {

    /** Never used */
    public static final int SDL_DISPLAYEVENT_NONE = 0;

    /** Display orientation has changed to data1 */
    public static final int SDL_DISPLAYEVENT_ORIENTATION = 1;

    /** Display has been added to the system */
    public static final int SDL_DISPLAYEVENT_CONNECTED = 2;

    /** Display has been removed from the system */
    public static final int SDL_DISPLAYEVENT_DISCONNECTED = 3;

    // TODO: Generate public static String toString(int value)

    private SDL_DisplayEventID() {
    }
}
