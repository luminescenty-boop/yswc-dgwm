/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.midlet.MIDlet;

public class GameMidlet
extends MIDlet {
    public static GameMidlet a;
    public static p b;

    protected final void startApp() {
        if (a == null) {
            this.a();
        }
    }

    public final void a() {
        a = this;
        b = new p(this);
    }

    protected final void destroyApp(boolean bl) {
        if (b != null) {
            b.e();
        }
        b = null;
        a = null;
        this.notifyDestroyed();
    }

    protected final void pauseApp() {
    }
}

