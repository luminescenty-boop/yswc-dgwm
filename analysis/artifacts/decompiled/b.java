/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

public final class b {
    public static InputStream a;

    public static final InputStream a(String string) {
        a = ((Object)((Object)GameMidlet.a)).getClass().getResourceAsStream(string);
        return a;
    }
}

