/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class d {
    int a = 0;
    Image b;
    Image c;
    Image d = null;
    Image e = null;
    Image f = null;
    Image[] g;
    int h;
    int i;
    public static int j = 40;
    public static int k = 0;
    int[] l = new int[]{35, 88, 140};
    int[] m = new int[]{16, 14, 5, 1, -3, -2, 2};
    int[] n;
    int[][] o;
    public int p;
    public boolean q;
    h r;

    public d(int n2, int n3) {
        int[] nArray = new int[]{16, 12, 2, -8, -12};
        this.n = new int[]{18, 15, -2, 0};
        this.o = new int[][]{{2, this.m[6], 0, this.m[6], 1, this.m[6], 1000}, {2, this.m[2], 0, this.m[2], 1, this.m[2], j}, {2, this.m[1], 0, this.m[1], 1, this.m[1], j}, {2, this.m[0], 0, this.m[0], 1, this.m[0], j, 2}, {-1, this.n[0], -1, this.n[0], -1, this.n[0], j}, {-1, this.n[0], 5, this.n[0], -1, this.n[0], j}, {-1, this.n[0], 5, this.n[1], -1, this.n[0], j}, {-1, this.n[0], 5, this.n[2], -1, this.n[0], j}, {-1, this.n[0], 5, this.n[3], -1, this.n[0], j}, {-1, this.n[0], 5, this.n[0], -1, this.n[0], j}, {-1, this.n[0], 5, this.n[1], 5, this.n[0], j, 1}, {-1, this.n[0], 5, this.n[2], 5, this.n[1], j}, {5, this.n[0], 5, this.n[3], 5, this.n[2], j}, {5, this.n[1], 5, this.n[0], 5, this.n[3], j}, {5, this.n[2], 5, this.n[1], 5, this.n[0], j}, {5, this.n[3], 5, this.n[2], 5, this.n[1], j}, {5, this.n[0], 5, this.n[3], 5, this.n[2], j}, {5, this.n[1], 5, this.n[0], 5, this.n[3], j}, {5, this.n[2], 2, this.m[0], 5, this.n[0], j}, {5, this.n[3], 2, this.m[1], 5, this.n[1], j}, {5, this.n[0], 2, this.m[2], 5, this.n[2], j}, {5, this.n[1], 2, this.m[3], 5, this.n[3], j}, {5, this.n[2], 2, this.m[4], 5, this.n[0], j}, {5, this.n[3], 2, this.m[5], 5, this.n[1], j}, {3, this.m[0], 2, this.m[6], 5, this.n[2], j}, {3, this.m[1], 2, this.m[6], 5, this.n[3], j}, {3, this.m[2], 2, this.m[6], 5, this.n[0], j}, {3, this.m[3], 2, this.m[6], 5, this.n[1], j}, {3, this.m[4], 2, this.m[6], 5, this.n[2], j}, {3, this.m[5], 2, this.m[6], 5, this.n[3], j}, {4, this.m[0], 2, this.m[6], 3, this.m[6], j}, {4, this.m[1], 2, this.m[6], 3, this.m[6], j}, {4, this.m[2], 2, this.m[6], 3, this.m[6], j}, {4, this.m[6], 2, this.m[6], 3, this.m[6], 1000}};
        this.q = false;
        this.a(n2, n3);
    }

    public final void a(int n2, int n3) {
        this.h = n2;
        this.i = n3;
        try {
            this.b = Image.createImage((String)"/logo/gameLogo.png");
            this.c = Image.createImage((String)"/logo/soundAsk.png");
            this.f = Image.createImage((String)"/logo/bg.png");
            this.g = new Image[6];
            for (int i2 = 0; i2 < 6; ++i2) {
                this.g[i2] = Image.createImage((String)("/logo/logo" + i2 + ".png"));
            }
            this.d = Image.createImage((String)"/logo/logo51.png");
            this.e = Image.createImage((String)"/logo/logo52.png");
            return;
        }
        catch (Exception exception) {
            System.out.println("there is a error when init");
            return;
        }
    }

    public final void a() {
        this.b = null;
        this.c = null;
        this.f = null;
        this.g = null;
        this.d = null;
        this.e = null;
        this.d();
    }

    public final void a(Graphics graphics) {
        switch (this.a) {
            case 0: {
                this.b(graphics);
                return;
            }
            case 1: {
                this.c(graphics);
            }
        }
    }

    public final void b(Graphics graphics) {
        if (this.p <= 20) {
            if (this.b != null) {
                graphics.setColor(0);
                graphics.fillRect(0, 0, this.h, this.i);
                graphics.drawImage(this.b, this.h >> 1, this.i >> 1, 3);
            }
        } else if (this.p >= 30) {
            graphics.drawImage(this.c, 0, this.i - this.c.getHeight(), 0);
        }
        ++this.p;
    }

    public final void c(Graphics graphics) {
        graphics.setClip(0, 0, graphics.getClipWidth(), graphics.getClipHeight());
        graphics.setColor(0);
        graphics.fillRect(0, 0, graphics.getClipWidth(), graphics.getClipHeight());
        graphics.drawImage(this.f, this.h >> 1, this.i >> 1, 3);
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.o[k][i2 * 2] == -1) continue;
            int n2 = this.l[i2] + 32;
            if (this.o[k][i2 * 2] == 3) {
                n2 = this.l[0] + 32;
            } else if (this.o[k][i2 * 2] == 4) {
                n2 = this.l[2] + 32;
            }
            if (this.o[k][i2 * 2] == 5) {
                int[] nArray = new int[]{0, -1, -1};
                if (this.o[k][i2 * 2 + 1] == this.n[0]) {
                    graphics.drawImage(this.d, n2 + nArray[i2], 129, 17);
                    continue;
                }
                if (this.o[k][i2 * 2 + 1] == this.n[1]) {
                    graphics.drawImage(this.g[this.o[k][i2 * 2]], n2, 156, 3);
                    continue;
                }
                if (this.o[k][i2 * 2 + 1] != this.n[2]) continue;
                graphics.drawImage(this.e, n2 + nArray[i2], 128, 17);
                continue;
            }
            graphics.drawImage(this.g[this.o[k][i2 * 2]], n2, this.o[k][i2 * 2 + 1] + 100 + 56, 3);
        }
        if (++k >= 33) {
            k = 33;
            this.e();
        }
    }

    private void e() {
        this.q = true;
    }

    public final void b() {
        this.a = 1;
    }

    public final void c() {
        this.r = new h("/logo/sound.mid", "audio/midi");
        this.r.a(1);
    }

    public final void d() {
        if (this.r != null) {
            this.r.a();
        }
        this.r = null;
    }
}

