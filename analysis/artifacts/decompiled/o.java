/*
 * Decompiled with CFR 0.152.
 */
import java.util.TimerTask;

final class o
extends TimerTask {
    p a;

    public o(p p2) {
        this.a = p2;
    }

    public final void run() {
        if (this.a.a == 0) {
            this.a.repaint();
            this.a.serviceRepaints();
        }
        if (this.a.a == 5) {
            this.a.b = true;
            this.a.repaint();
            this.a.serviceRepaints();
            this.cancel();
            ++this.a.a;
        }
        if (this.a.a > 5) {
            this.cancel();
        }
    }
}

