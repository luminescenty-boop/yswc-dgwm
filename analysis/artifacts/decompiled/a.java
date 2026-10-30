/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class a {
    private byte R;
    private byte S;
    i[] a;
    i[] b;
    i[] c;
    i d;
    i e;
    Image f;
    Image[] g = new Image[2];
    Image[] h = new Image[2];
    int i;
    int j;
    int k;
    static final int[] l = new int[]{20, 20, 20, 20, 20, 33, 33, 33, 100, 100, 20};
    static int m = 240;
    static int n = 90;
    static int o = 240;
    static final int[][] p = new int[][]{{m / 3}, {m / 4, m / 4}, {m * 2 / 6, m / 6, m * 2 / 6}, {m / 8, m * 3 / 8, m / 8, m * 3 / 8}, {m * 3 / 9, m / 9, m * 2 / 9, m * 3 / 9, m / 9}};
    static final int[][] q = new int[][]{{n / 2}, {n / 3, n * 2 / 3}, {n / 3, n / 2, n * 2 / 3}, {n / 3, n / 3, n * 2 / 3, n * 2 / 3}, {n / 3, n / 3, n / 2, n * 2 / 3, n * 2 / 3}};
    e r;
    m s;
    m t;
    Image u;
    Image v;
    Image w;
    boolean x;
    int y = 18;
    int z = 0;
    Image A;
    int B = m;
    int C = 0;
    int D = 0;
    int E = 36;
    boolean F;
    int G = 0;
    int H = -m;
    int I = 0;
    int J = m;
    int K = 15;
    int L;
    int M = 4;
    int N = 8;
    boolean O;
    int P;
    int Q = 8;

    public a(e e2) {
        this.r = e2;
        this.c = new i[2];
        this.c[0] = new i("/fight/num.sprite", "/fight/num.png");
        this.c[1] = new i("/fight/num.sprite", "/fight/num.png");
        try {
            this.u = Image.createImage((String)"/fight/frame.png");
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public final void a(e e2, m m2) {
        IOException iOException;
        this.s = m2;
        int n2 = this.a(m2);
        this.a = new i[n2];
        if (m2.l != 9) {
            try {
                this.v = Image.createImage((String)("/fight/h" + m2.l + ".png"));
            }
            catch (IOException iOException2) {
                iOException = iOException2;
                iOException2.printStackTrace();
            }
        } else {
            try {
                this.v = Image.createImage((String)("/fight/h" + m2.l + "" + (m2.M - 1) + ".png"));
            }
            catch (IOException iOException3) {
                iOException = iOException3;
                iOException3.printStackTrace();
            }
        }
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            try {
                this.a[i2] = m2.l != 9 ? new i("/fight/b" + m2.l + ".sprite", "/fight/b" + m2.l + ".png") : new i("/fight/b" + m2.l + "" + (m2.M - 1) + ".sprite", "/fight/b" + m2.l + "" + (m2.M - 1) + ".png");
                this.a[i2].a(this.z + p[n2 - 1][i2], this.y + 120 + q[n2 - 1][i2]);
                continue;
            }
            catch (Exception exception) {
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
            }
        }
        this.d = this.a(m2.l);
        this.d.a(true);
        this.C = this.f(m2.l);
        this.R = e2.h(m2.n, m2.o);
        this.b(this.R);
    }

    public final void b(e e2, m m2) {
        IOException iOException;
        this.t = m2;
        int n2 = this.a(m2);
        this.b = new i[n2];
        if (m2.l != 9) {
            try {
                this.w = Image.createImage((String)("/fight/h" + m2.l + ".png"));
            }
            catch (IOException iOException2) {
                iOException = iOException2;
                iOException2.printStackTrace();
            }
        } else {
            try {
                this.w = Image.createImage((String)("/fight/h" + m2.l + "" + (m2.M - 1) + ".png"));
            }
            catch (IOException iOException3) {
                iOException = iOException3;
                iOException3.printStackTrace();
            }
        }
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2] = m2.l != 9 ? new i("/fight/b" + m2.l + ".sprite", "/fight/b" + m2.l + ".png") : new i("/fight/b" + m2.l + "" + (m2.M - 1) + ".sprite", "/fight/b" + m2.l + "" + (m2.M - 1) + ".png");
            this.b[i2].a(this.z + m - p[n2 - 1][i2], this.y + 120 + q[n2 - 1][i2]);
        }
        this.e = this.a(m2.l);
        this.e.a(true);
        this.D = this.f(m2.l);
        this.S = e2.h(m2.n, m2.o);
        this.c(this.S);
    }

    public final i a(int n2) {
        i i2 = null;
        switch (n2) {
            case 0: {
                i2 = new i("/fight/spark.sprite", "/fight/spark.png");
                break;
            }
            case 1: {
                i2 = new i("/fight/spark.sprite", "/fight/spark.png");
                break;
            }
            case 2: {
                i2 = new i("/fight/spark.sprite", "/fight/spark.png");
                break;
            }
            case 3: {
                i2 = new i("/fight/spark.sprite", "/fight/spark.png");
                break;
            }
            case 4: {
                i2 = new i("/fight/spark.sprite", "/fight/spark.png");
                break;
            }
            case 5: {
                i2 = new i("/fight/spark.sprite", "/fight/spark.png");
                break;
            }
            case 6: {
                i2 = new i("/fight/spark.sprite", "/fight/spark.png");
                break;
            }
            case 7: {
                i2 = new i("/fight/spark.sprite", "/fight/spark.png");
                break;
            }
            case 8: {
                i2 = new i("/fight/spark.sprite", "/fight/spark.png");
                break;
            }
            case 9: {
                i2 = new i("/fight/spark.sprite", "/fight/spark.png");
                break;
            }
            case 10: {
                i2 = new i("/fight/spark.sprite", "/fight/spark.png");
            }
        }
        return i2;
    }

    private int f(int n2) {
        switch (n2) {
            case 0: {
                return 0;
            }
            case 1: {
                return 1;
            }
            case 2: {
                return 1;
            }
            case 3: {
                return 1;
            }
            case 4: {
                return 0;
            }
            case 5: {
                return 0;
            }
            case 6: {
                return 0;
            }
            case 7: {
                return 1;
            }
            case 8: {
                return 0;
            }
            case 9: {
                return 0;
            }
            case 10: {
                return 0;
            }
        }
        return 0;
    }

    public final void b(int n2) {
        int n3 = 0;
        switch (n2) {
            case 0: 
            case 1: 
            case 2: {
                n3 = 0;
                break;
            }
            case 3: 
            case 4: {
                n3 = 1;
                break;
            }
            case 5: 
            case 6: {
                n3 = 2;
                break;
            }
            case 7: 
            case 8: 
            case 9: {
                n3 = 3;
            }
        }
        try {
            if (this.f == null) {
                this.f = Image.createImage((String)"/fight/bf_0.png");
            }
            this.g[0] = Image.createImage((String)("/fight/bf_" + n3 + "_0.png"));
            this.g[1] = Image.createImage((String)("/fight/bf_" + n3 + "_1.png"));
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public final void c(int n2) {
        int n3 = 0;
        switch (n2) {
            case 0: 
            case 1: 
            case 2: {
                n3 = 0;
                break;
            }
            case 3: 
            case 4: {
                n3 = 1;
                break;
            }
            case 5: 
            case 6: {
                n3 = 2;
                break;
            }
            case 7: 
            case 8: 
            case 9: {
                n3 = 3;
            }
        }
        try {
            if (this.f == null) {
                this.f = Image.createImage((String)"/fight/bf_0.png");
            }
            this.h[0] = Image.createImage((String)("/fight/bf_" + n3 + "_0.png"));
            this.h[1] = Image.createImage((String)("/fight/bf_" + n3 + "_1.png"));
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public final int a(m m2) {
        int n2 = m2.u / l[m2.l];
        if (m2.u != 100 && m2.u % l[m2.l] > 0) {
            ++n2;
        }
        System.out.println("num=" + n2);
        return n2;
    }

    public final void a(Graphics graphics) throws Exception {
        this.e(graphics);
        this.c(graphics);
        graphics.drawImage(this.u, p.m, p.n, 40);
        graphics.drawImage(this.v, 0, p.n, 36);
        graphics.drawRegion(this.w, 0, 0, this.w.getWidth(), this.w.getHeight(), 2, p.m, p.n, 40);
        this.v.getWidth();
        this.u.getHeight();
        this.w.getWidth();
        this.u.getHeight();
        this.r.a(graphics, this.s, this.t, 0);
    }

    private void c(Graphics graphics) {
        switch (this.k) {
            case 0: {
                for (int i2 = 0; i2 < this.a.length; ++i2) {
                    this.a[i2].a(graphics);
                    this.a[i2].j();
                }
                if (!this.a[0].y) break;
                this.d(1);
                return;
            }
            case 1: {
                for (int i3 = 0; i3 < this.a.length; ++i3) {
                    this.a[i3].a(graphics);
                    this.a[i3].j();
                }
                if (!this.a[0].y) break;
                this.d(2);
                return;
            }
            case 2: {
                for (int i4 = 0; i4 < this.a.length; ++i4) {
                    this.a[i4].a(graphics);
                    this.a[i4].j();
                    if (this.C == 0) {
                        this.a[i4].b(8, 0);
                        continue;
                    }
                    if (this.C != 1) continue;
                    this.a[i4].b(-8, 0);
                }
                if (this.a[0].c() <= m && this.a[0].c() >= 0) break;
                this.d(3);
                return;
            }
            case 3: {
                this.b(graphics);
                if (this.B + this.A.getWidth() >= 0) break;
                this.d(4);
                return;
            }
            case 4: {
                int n2;
                for (n2 = 0; n2 < this.a.length; ++n2) {
                    if (this.C != 0) continue;
                    this.a[n2].a(graphics);
                    this.a[n2].j();
                    this.a[n2].b(8, 0);
                }
                for (n2 = 0; n2 < this.b.length; ++n2) {
                    this.b[n2].b(2);
                    this.b[n2].a(graphics);
                    this.b[n2].j();
                }
                if (this.C == 0 && this.a[0].c() >= m / 2) {
                    this.d(5);
                    return;
                }
                if (this.C != 1) break;
                this.d(5);
                return;
            }
            case 5: {
                int n3;
                for (n3 = 0; n3 < this.a.length; ++n3) {
                    if (this.C != 0) continue;
                    this.a[n3].a(graphics);
                    this.a[n3].j();
                }
                for (n3 = 0; n3 < this.b.length; ++n3) {
                    this.b[n3].b(2);
                    this.b[n3].a(graphics);
                    this.b[n3].j();
                    this.d.a(this.b[n3].c() + this.b[n3].s() / 2 - this.d.s() / 2, this.b[n3].d() + this.b[n3].t() / 2 - this.d.t() / 2);
                    this.d.a(graphics);
                    this.d.j();
                }
                if (this.C == 0 && this.a[0].y) {
                    this.d(6);
                    return;
                }
                if (this.C != 1 || !this.d.y) break;
                this.d(6);
                return;
            }
            case 6: {
                int n4;
                for (n4 = 0; n4 < this.a.length; ++n4) {
                    if (this.C != 0) continue;
                    this.a[n4].a(graphics);
                    this.a[n4].j();
                }
                for (n4 = 0; n4 < this.b.length; ++n4) {
                    this.b[n4].b(2);
                    this.b[n4].a(graphics);
                }
                if (!this.d(graphics)) break;
                if (this.x && !this.F) {
                    this.d(7);
                    return;
                }
                this.d(13);
                return;
            }
            case 7: {
                for (int i5 = 0; i5 < this.b.length; ++i5) {
                    this.b[i5].b(2);
                    this.b[i5].a(graphics);
                    this.b[i5].j();
                }
                if (!this.b[0].y) break;
                this.d(8);
                return;
            }
            case 8: {
                for (int i6 = 0; i6 < this.b.length; ++i6) {
                    this.b[i6].b(2);
                    this.b[i6].a(graphics);
                    this.b[i6].j();
                    if (this.D == 0) {
                        this.b[i6].b(-8, 0);
                        continue;
                    }
                    this.b[i6].b(8, 0);
                }
                if (this.D == 0 && this.b[0].c() < 0) {
                    this.d(9);
                    return;
                }
                this.d(9);
                return;
            }
            case 9: {
                this.b(graphics);
                if (this.B + this.A.getWidth() >= 0) break;
                this.d(10);
                return;
            }
            case 10: {
                int n5;
                for (n5 = 0; n5 < this.a.length; ++n5) {
                    this.a[n5].a(graphics);
                    this.a[n5].j();
                }
                if (this.D == 0) {
                    for (n5 = 0; n5 < this.b.length; ++n5) {
                        this.b[n5].b(2);
                        this.b[n5].a(graphics);
                        this.b[n5].j();
                        this.b[n5].b(-8, 0);
                    }
                }
                if (this.D == 0 && this.b[0].c() <= m / 2 + this.b[0].s()) {
                    this.d(11);
                    return;
                }
                if (this.D != 1) break;
                this.d(11);
                return;
            }
            case 11: {
                int n6;
                for (n6 = 0; n6 < this.a.length; ++n6) {
                    this.a[n6].a(graphics);
                    this.a[n6].j();
                    this.e.a(this.a[n6].c() + this.a[n6].s() / 2 - this.e.s() / 2, this.a[n6].d() + this.a[n6].t() / 2 - this.e.t() / 2);
                    this.e.a(graphics);
                    this.e.j();
                }
                if (this.D == 0) {
                    for (n6 = 0; n6 < this.b.length; ++n6) {
                        this.b[n6].b(2);
                        this.b[n6].a(graphics);
                        this.b[n6].j();
                    }
                }
                if (this.D == 0 && this.b[0].y) {
                    this.d(12);
                    return;
                }
                if (this.D != 1 || !this.e.y) break;
                this.d(12);
                return;
            }
            case 12: {
                int n7;
                for (n7 = 0; n7 < this.a.length; ++n7) {
                    this.a[n7].a(graphics);
                }
                if (this.D == 0) {
                    for (n7 = 0; n7 < this.b.length; ++n7) {
                        this.b[n7].b(2);
                        this.b[n7].a(graphics);
                        this.b[n7].j();
                    }
                }
                if (!this.d(graphics)) break;
                this.d(13);
            }
        }
    }

    private void a(int n2, int n3, int n4) {
        this.c[0].a((byte)(n2 % 10));
        this.c[1].a((byte)(n2 / 10));
        this.c[0].a(n3, n4);
        this.c[1].a(n3 - this.c[1].s(), n4);
    }

    private boolean d(Graphics graphics) {
        boolean bl = false;
        boolean bl2 = false;
        if (this.c[0].d() < this.y + 240 - n * 2) {
            return true;
        }
        this.c[0].a(graphics);
        this.c[1].a(graphics);
        this.c[0].j();
        this.c[1].j();
        this.c[0].b(0, -8);
        this.c[1].b(0, -8);
        return false;
    }

    final void b(Graphics graphics) {
        this.B -= this.E;
        graphics.drawImage(this.A, this.B, this.y, 0);
        graphics.setColor(0);
        graphics.fillRect(this.B + this.A.getWidth(), this.y, m - this.B, this.A.getHeight());
    }

    final void d(int n2) {
        switch (n2) {
            case 0: {
                this.k = 0;
                return;
            }
            case 1: {
                this.k = 1;
                for (int i2 = 0; i2 < this.a.length; ++i2) {
                    this.a[i2].a(1, false);
                }
                break;
            }
            case 2: {
                this.k = 2;
                for (int i3 = 0; i3 < this.a.length; ++i3) {
                    this.a[i3].a(2);
                }
                break;
            }
            case 3: {
                this.k = 3;
                try {
                    this.A = Image.createImage((String)"/fight/pass.png");
                    return;
                }
                catch (IOException iOException) {
                    IOException iOException2 = iOException;
                    iOException.printStackTrace();
                    return;
                }
            }
            case 4: {
                int n3;
                this.k = 4;
                this.A = null;
                for (n3 = 0; n3 < this.a.length; ++n3) {
                    if (!this.a[n3].e()) continue;
                    this.a[n3].a(2);
                    this.a[n3].a(this.z - m + p[this.a.length - 1][n3], this.y + 120 + q[this.a.length - 1][n3]);
                }
                for (n3 = 0; n3 < this.b.length; ++n3) {
                    if (!this.b[n3].e()) continue;
                    this.b[n3].a(0);
                    this.b[n3].a(this.z + m - p[this.b.length - 1][n3], this.y + 120 + q[this.b.length - 1][n3]);
                }
                break;
            }
            case 5: {
                int n4;
                this.k = 5;
                this.a();
                for (n4 = 0; n4 < this.a.length; ++n4) {
                    this.a[n4].a(3, false);
                }
                for (n4 = 0; n4 < this.b.length; ++n4) {
                    this.b[n4].a(4, false);
                }
                this.d.a(this.z + this.b[0].c() + m - 1 - this.b[0].c() - 1, this.y + this.b[0].d());
                if (this.C != 1) break;
                this.d.a(false);
                return;
            }
            case 6: {
                int n5;
                this.k = 6;
                this.b();
                for (n5 = 0; n5 < this.a.length; ++n5) {
                    this.a[n5].a(0);
                }
                n5 = this.a(this.t);
                if (n5 <= 0) {
                    this.F = true;
                }
                for (int i4 = 0; i4 < this.b.length; ++i4) {
                    this.b[i4].a(4);
                    if (i4 <= n5 - 1) continue;
                    System.out.println("knum=" + n5 + ":die_id=" + i4);
                    this.b[i4].a(5);
                }
                this.a(this.i, this.b[0].c() + m / 2 - this.b[0].c() / 2, this.b[0].d());
                return;
            }
            case 7: {
                this.k = 7;
                for (int i5 = 0; i5 < this.b.length; ++i5) {
                    if (this.b[i5].e()) {
                        this.b[i5].a(1, false);
                        this.b[i5].a(this.z + m - p[this.b.length - 1][i5], this.y + 120 + q[this.b.length - 1][i5]);
                    }
                    if (i5 <= this.a(this.t) - 1) continue;
                    this.b[i5].a(5);
                    this.b[i5].b(false);
                }
                break;
            }
            case 8: {
                this.k = 8;
                for (int i6 = 0; i6 < this.b.length; ++i6) {
                    if (!this.b[i6].e()) continue;
                    this.b[i6].a(2);
                }
                break;
            }
            case 9: {
                this.k = 9;
                try {
                    this.A = Image.createImage((String)"/fight/pass.png");
                }
                catch (IOException iOException) {
                    IOException iOException3 = iOException;
                    iOException.printStackTrace();
                }
                this.B = m;
                return;
            }
            case 10: {
                int n6;
                this.k = 10;
                this.A = null;
                for (n6 = 0; n6 < this.a.length; ++n6) {
                    if (!this.a[n6].e()) continue;
                    this.a[n6].a(0);
                    this.a[n6].a(this.z + p[this.a.length - 1][n6], this.y + 120 + q[this.a.length - 1][n6]);
                }
                for (n6 = 0; n6 < this.b.length; ++n6) {
                    if (!this.b[n6].e()) continue;
                    this.b[n6].a(2);
                    this.b[n6].a(this.z + m + p[this.b.length - 1][n6], this.y + 120 + q[this.b.length - 1][n6]);
                }
                break;
            }
            case 11: {
                int n7;
                this.k = 11;
                this.a();
                for (n7 = 0; n7 < this.a.length; ++n7) {
                    this.a[n7].a(4, false);
                }
                for (n7 = 0; n7 < this.b.length; ++n7) {
                    this.b[n7].a(3, false);
                }
                this.e.a(this.z + this.a[0].c() - this.a[0].c() / 2, this.y + this.a[0].d());
                if (this.D != 1) break;
                this.e.a(false);
                return;
            }
            case 12: {
                int n8;
                this.k = 12;
                this.b();
                for (n8 = 0; n8 < this.b.length; ++n8) {
                    this.b[n8].a(0);
                }
                n8 = this.a(this.s);
                if (n8 <= 0) {
                    this.F = true;
                }
                for (int i7 = 0; i7 < this.a.length; ++i7) {
                    this.a[i7].a(4);
                    if (i7 <= n8 - 1) continue;
                    System.out.println("knum=" + n8 + ":die_id=" + i7);
                    this.a[i7].a(5);
                }
                this.a(this.j, this.a[0].c() - this.a[0].c() / 2, this.a[0].d());
                return;
            }
            default: {
                this.r.ey = true;
                this.r.ex = this.r.ao;
                this.k = 13;
                this.c();
            }
        }
    }

    private void e(Graphics graphics) {
        graphics.drawImage(this.f, this.z, this.y, 0);
        switch (this.k) {
            case 2: 
            case 3: {
                this.G += this.M;
                this.H += this.M;
                this.I -= this.N;
                this.J -= this.N;
                if (this.G >= m) {
                    this.G = -m;
                }
                if (this.H >= m) {
                    this.H = -m;
                }
                if (this.I <= -m) {
                    this.I = m;
                }
                if (this.J > -m) break;
                this.J = m;
                break;
            }
            case 8: 
            case 9: {
                this.G -= this.M;
                this.H -= this.M;
                this.I += this.N;
                this.J += this.N;
                if (this.I >= m) {
                    this.I = -m;
                }
                if (this.J >= m) {
                    this.J = -m;
                }
                if (this.G <= -m) {
                    this.G = m;
                }
                if (this.H > -m) break;
                this.H = m;
            }
        }
        if (this.k < 4) {
            graphics.drawImage(this.g[0], this.z + this.G, this.y + o - n - this.g[0].getHeight() + this.K, 0);
            graphics.drawImage(this.g[0], this.z + this.H, this.y + o - n - this.g[0].getHeight() + this.K, 0);
            if (this.O) {
                this.e(this.P % 16);
                ++this.P;
                if (this.P % 2 == 0) {
                    graphics.setColor(0xFF0000);
                } else {
                    graphics.setColor(0);
                }
                graphics.fillRect(0, 0, m, 320);
            }
            graphics.drawImage(this.g[1], this.z + this.I, this.y + o - this.g[1].getHeight() + this.L, 0);
            graphics.drawImage(this.g[1], this.z + this.J, this.y + o - this.g[1].getHeight() + this.L, 0);
            return;
        }
        graphics.drawImage(this.h[0], this.z + this.G, this.y + o - n - this.h[0].getHeight() + this.K, 0);
        graphics.drawImage(this.h[0], this.z + this.H, this.y + o - n - this.h[0].getHeight() + this.K, 0);
        if (this.O) {
            this.e(this.P % 16);
            ++this.P;
            if (this.P % 2 == 0) {
                graphics.setColor(0xFF0000);
            } else {
                graphics.setColor(0);
            }
            graphics.fillRect(0, 0, m, 320);
        }
        graphics.drawImage(this.h[1], this.z + this.I, this.y + o - this.h[1].getHeight() + this.L, 0);
        graphics.drawImage(this.h[1], this.z + this.J, this.y + o - this.h[1].getHeight() + this.L, 0);
    }

    final void a() {
        this.O = true;
        this.P = 0;
    }

    final void b() {
        this.O = false;
        this.P = 0;
        this.y = 18;
        this.z = 0;
    }

    final void e(int n2) {
        if (n2 < 8) {
            if (n2 == 0) {
                this.z -= this.Q;
            } else if (n2 == 2) {
                this.z += this.Q;
            }
            if (n2 == 4) {
                this.y += this.Q;
                return;
            }
            if (n2 == 6) {
                this.y -= this.Q;
                return;
            }
            this.y = 18;
            this.z = 0;
            return;
        }
        if (n2 % 8 == 0) {
            this.z -= this.Q;
            this.y -= this.Q;
            return;
        }
        if (n2 % 8 == 2) {
            this.z += this.Q;
            this.y += this.Q;
            return;
        }
        if (n2 % 8 == 4) {
            this.z -= this.Q;
            this.y += this.Q;
            return;
        }
        if (n2 % 8 == 6) {
            this.z += this.Q;
            this.y -= this.Q;
            return;
        }
        this.y = 18;
        this.z = 0;
    }

    final void c() {
        int n2;
        for (n2 = 0; n2 < this.a.length; ++n2) {
            i.a();
        }
        this.a = null;
        for (n2 = 0; n2 < this.b.length; ++n2) {
            i.a();
        }
        this.b = null;
        for (n2 = 0; n2 < this.c.length; ++n2) {
            i.a();
        }
        this.c = null;
        i.a();
        i.a();
        this.f = null;
        this.g = null;
        this.h = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
    }
}

