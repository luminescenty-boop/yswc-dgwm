/*
 * Decompiled with CFR 0.152.
 */
public final class g {
    GameMidlet a;
    String b = "http://gamepie.g188.net/gamecms/go/jpgd";

    public g(GameMidlet gameMidlet) {
        this.a = gameMidlet;
    }

    final void a() {
        try {
            this.a.platformRequest(this.b);
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        if (GameMidlet.a != null) {
            GameMidlet.b.e();
            GameMidlet.a.notifyDestroyed();
            GameMidlet.a.destroyApp(true);
        }
    }
}

