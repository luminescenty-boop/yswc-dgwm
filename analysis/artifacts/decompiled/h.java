/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.media.Manager
 *  javax.microedition.media.MediaException
 *  javax.microedition.media.Player
 */
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;

public final class h {
    static Player a;

    public h(String string, String string2) {
        InputStream inputStream = this.getClass().getResourceAsStream(string);
        try {
            a = Manager.createPlayer((InputStream)inputStream, (String)string2);
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
        catch (MediaException mediaException) {
            MediaException mediaException2 = mediaException;
            mediaException.printStackTrace();
            return;
        }
    }

    public final void a() {
        try {
            a.stop();
            return;
        }
        catch (MediaException mediaException) {
            MediaException mediaException2 = mediaException;
            mediaException.printStackTrace();
            return;
        }
    }

    public final void a(int n2) {
        try {
            a.realize();
            a.setLoopCount(n2);
            a.prefetch();
            a.start();
            return;
        }
        catch (MediaException mediaException) {
            MediaException mediaException2 = mediaException;
            mediaException.printStackTrace();
            return;
        }
    }
}

