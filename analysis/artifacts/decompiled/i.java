/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class i {
    public static final int[][] a = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7}, {1, 0, 3, 2, 5, 4, 7, 6}, {2, 3, 0, 1, 6, 7, 4, 5}, {3, 2, 1, 0, 7, 6, 5, 4}, {4, 6, 5, 7, 0, 2, 1, 3}, {5, 7, 4, 6, 1, 3, 0, 2}, {6, 4, 7, 5, 2, 0, 3, 1}, {7, 5, 6, 4, 3, 1, 2, 0}};
    String b;
    short[][] c;
    int d;
    short[][] e;
    int f;
    short[][] g;
    int h;
    int i;
    int j;
    Image k;
    Image[] l;
    int[] m;
    boolean n;
    String o;
    String p;
    int q;
    int r;
    int s;
    boolean t = true;
    long u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    int z;
    int A;
    private static Vector B;

    public final void a(boolean bl) {
        this.x = bl;
        this.y = false;
    }

    public static final void a() {
        B.removeAllElements();
    }

    public static final void a(i i2) {
        B.addElement(i2);
    }

    public i(String string, String string2) {
        int n2;
        this.b = string2;
        boolean bl = false;
        boolean bl2 = false;
        for (n2 = 0; n2 < B.size(); ++n2) {
            i i2 = (i)B.elementAt(n2);
            if (bl2 || !i2.b.equals(string2)) continue;
            bl2 = true;
            if (this.n) {
                this.o = i2.o;
                this.p = i2.p;
                this.l = i2.l;
                this.m = i2.m;
                continue;
            }
            this.k = i2.k;
        }
        if (!bl2) {
            i.a(this);
        }
        if (!bl2) {
            if (this.n) {
                int n3 = string2.length();
                for (int i3 = n3 - 1; i3 >= 0; --i3) {
                    char c2 = string2.charAt(i3);
                    n2 = c2;
                    if (c2 != '.') continue;
                    this.p = string2.substring(i3);
                    this.o = string2.substring(0, i3);
                    break;
                }
                if (this.p == null) {
                    this.o = string2;
                    this.p = "";
                }
                this.l = new Image[this.h];
                this.m = new int[this.h];
                return;
            }
            Image image = null;
            try {
                image = Image.createImage((String)string2);
            }
            catch (IOException iOException) {
                System.out.println("can't load spx image\n" + string2);
            }
            this.a(string, image);
            return;
        }
        this.a(string, null);
    }

    public final void a(String string, Image image) {
        try {
            int n2;
            int n3;
            int n4;
            int n5;
            InputStream inputStream = string.getClass().getResourceAsStream(string);
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            int n6 = dataInputStream.readInt();
            if (n6 != 1397772888) {
                throw new Exception("invalid SpriteX format\n");
            }
            byte by = dataInputStream.readByte();
            if (by != 34) {
                throw new Exception("version no matching\n");
            }
            byte by2 = dataInputStream.readByte();
            if ((by2 & 1) != 1) {
                throw new Exception("byte sequence error\n");
            }
            if ((by2 & 2) != 0) {
                this.n = true;
            }
            this.h = dataInputStream.readInt();
            if (!this.n) {
                this.g = new short[this.h][4];
                for (n5 = 0; n5 < this.h; ++n5) {
                    this.g[n5][0] = dataInputStream.readShort();
                    this.g[n5][1] = dataInputStream.readShort();
                    this.g[n5][2] = dataInputStream.readShort();
                    this.g[n5][3] = dataInputStream.readShort();
                }
            }
            this.f = dataInputStream.readInt();
            this.e = new short[this.f][];
            for (n5 = 0; n5 < this.f; ++n5) {
                int n7 = dataInputStream.readInt();
                int n8 = dataInputStream.readInt();
                int n9 = dataInputStream.readInt();
                n4 = 8 + n7 * 4 + n8 * 4 + n9 * 2;
                this.e[n5] = new short[n4];
                this.e[n5][0] = (short)n4;
                this.e[n5][1] = (short)n7;
                this.e[n5][2] = (short)n8;
                this.e[n5][3] = (short)n9;
                this.e[n5][4] = dataInputStream.readShort();
                this.e[n5][5] = dataInputStream.readShort();
                this.e[n5][6] = dataInputStream.readShort();
                this.e[n5][7] = dataInputStream.readShort();
                n3 = 8;
                for (n2 = 0; n2 < n7; ++n2) {
                    this.e[n5][0 + n3] = dataInputStream.readShort();
                    this.e[n5][1 + n3] = dataInputStream.readShort();
                    this.e[n5][2 + n3] = dataInputStream.readShort();
                    this.e[n5][3 + n3] = dataInputStream.readShort();
                    n3 += 4;
                }
                for (n2 = 0; n2 < n8; ++n2) {
                    this.e[n5][0 + n3] = dataInputStream.readShort();
                    this.e[n5][1 + n3] = dataInputStream.readShort();
                    this.e[n5][2 + n3] = dataInputStream.readShort();
                    this.e[n5][3 + n3] = dataInputStream.readShort();
                    n3 += 4;
                }
                for (n2 = 0; n2 < n9; ++n2) {
                    this.e[n5][0 + n3] = dataInputStream.readShort();
                    this.e[n5][1 + n3] = dataInputStream.readShort();
                    n3 += 2;
                }
            }
            this.d = dataInputStream.readInt();
            this.c = new short[this.d][];
            for (n5 = 0; n5 < this.d; ++n5) {
                int n10 = dataInputStream.readInt();
                byte by3 = dataInputStream.readByte();
                n4 = by3 == 1 ? 4 + n10 * 2 : 4 + n10;
                this.c[n5] = new short[n4];
                this.c[n5][0] = (short)n4;
                this.c[n5][1] = (short)n10;
                this.c[n5][2] = by3;
                this.c[n5][3] = (short)dataInputStream.readInt();
                n3 = 4;
                if (by3 == 1) {
                    for (n2 = 0; n2 < n10; ++n2) {
                        this.c[n5][n3] = dataInputStream.readShort();
                        this.c[n5][n3 + 1] = dataInputStream.readShort();
                        n3 += 2;
                    }
                    continue;
                }
                for (n2 = 0; n2 < n10; ++n2) {
                    this.c[n5][n3] = dataInputStream.readShort();
                    ++n3;
                }
            }
            this.a(image);
            this.t = true;
            inputStream.close();
            return;
        }
        catch (Exception exception) {
            System.out.println("\u6ca1\u6709\u8bfb\u53d6\u5230\u8d44\u6e90" + string);
            exception.printStackTrace();
            return;
        }
    }

    public final boolean b() {
        return !this.w;
    }

    public final void a(Image image) {
        if (image == null) {
            return;
        }
        this.k = image;
    }

    public final void a(int n2, int n3) {
        this.r = n2;
        this.s = n3;
    }

    public final void b(int n2, int n3) {
        this.r += n2;
        this.s += n3;
    }

    public final int c() {
        return this.r;
    }

    public final int d() {
        return this.s;
    }

    public final void b(boolean bl) {
        this.t = bl;
    }

    public final boolean e() {
        return this.t;
    }

    public final void a(int n2) {
        if (n2 == this.i) {
            this.a(true);
            return;
        }
        if (n2 < 0 || n2 >= this.d) {
            throw new IndexOutOfBoundsException();
        }
        this.i = n2;
        this.j = 0;
        this.v = false;
        this.a(true);
    }

    public final void a(int n2, boolean bl) {
        this.a(n2);
        this.a(bl);
    }

    public final int f() {
        return this.i;
    }

    public final int g() {
        return this.j;
    }

    public final void b(int n2) {
        if (n2 < 0 || n2 > 7) {
            throw new IllegalArgumentException();
        }
        this.c[this.i][3] = (short)n2;
    }

    public final int h() {
        return this.c[this.i][3];
    }

    public final void i() {
        if (this.x) {
            this.j = (this.j + 1) % this.l();
            this.v = false;
            this.y = false;
            return;
        }
        if (this.j < this.l() - 1) {
            ++this.j;
            this.y = false;
            return;
        }
        this.y = true;
    }

    public final void a(long l2) {
        if (!this.b()) {
            return;
        }
        if (this.m()) {
            int n2;
            if (!this.v) {
                this.v = true;
                this.u = l2;
            }
            if (l2 - this.u >= (long)(n2 = this.n())) {
                this.i();
                this.u = l2;
                return;
            }
        } else {
            int n3;
            if (!this.v) {
                this.v = true;
                this.u = l2;
            }
            if (l2 - this.u >= (long)(n3 = this.q)) {
                this.i();
                this.u = l2;
            }
        }
    }

    public final void j() {
        if (!this.b()) {
            return;
        }
        this.a(System.currentTimeMillis());
    }

    public final int k() {
        if (this.m()) {
            return this.c[this.i][4 + this.j * 2];
        }
        return this.c[this.i][4 + this.j];
    }

    public final int l() {
        return this.c[this.i][1];
    }

    public final boolean m() {
        return this.c[this.i][2] == 1;
    }

    public final int n() {
        return this.c[this.i][4 + this.j * 2 + 1];
    }

    public static final boolean a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        return n7 + n9 >= n3 && n7 <= n3 + n5 && n6 + n8 >= n2 && n6 <= n2 + n4;
    }

    public final int o() {
        return this.e[this.k()][4] + this.s;
    }

    public final int p() {
        return this.e[this.k()][5] + this.s;
    }

    public final int q() {
        return this.e[this.k()][6] + this.r;
    }

    public final int r() {
        return this.e[this.k()][7] + this.r;
    }

    public final int s() {
        return this.r() - this.q();
    }

    public final int t() {
        return this.p() - this.o();
    }

    public final void a(Graphics graphics, int n2, int n3) {
        block44: {
            if (graphics == null) {
                throw new NullPointerException();
            }
            if (!this.t) break block44;
            n2 -= this.z;
            n3 -= this.A;
            int n4 = graphics.getClipX();
            int n5 = graphics.getClipY();
            int n6 = graphics.getClipWidth();
            int n7 = graphics.getClipHeight();
            int n8 = this.h();
            if (n8 == 0) {
                int n9 = this.k();
                int n10 = this.e[n9][1];
                int n11 = 8;
                for (int i2 = 0; i2 < n10; ++i2) {
                    int n12;
                    int n13;
                    int n14;
                    int n15;
                    short s;
                    short s2;
                    short s3;
                    int n16;
                    int n17;
                    short s4;
                    if (this.n) {
                        s4 = this.e[n9][0 + n11];
                        n17 = this.e[n9][1 + n11] + n2;
                        n16 = this.e[n9][2 + n11] + n3;
                        s3 = this.e[n9][3 + n11];
                        s2 = 0;
                        s = 0;
                        n15 = this.l[s4].getWidth();
                        n14 = this.l[s4].getHeight();
                        if ((s3 & 4) != 0) {
                            n13 = n14;
                            n12 = n15;
                        } else {
                            n13 = n15;
                            n12 = n14;
                        }
                        if (i.a(n17, n16, n13, n12, n4, n5, n6, n7)) {
                            i.a(graphics, this.l[s4], 0, 0, n15, n14, s3, n17, n16, 20);
                        }
                    } else {
                        s4 = this.e[n9][0 + n11];
                        n17 = this.e[n9][1 + n11] + n2;
                        n16 = this.e[n9][2 + n11] + n3;
                        s3 = this.e[n9][3 + n11];
                        s2 = this.g[s4][0];
                        s = this.g[s4][1];
                        n15 = this.g[s4][2];
                        n14 = this.g[s4][3];
                        if ((s3 & 4) != 0) {
                            n13 = n14;
                            n12 = n15;
                        } else {
                            n13 = n15;
                            n12 = n14;
                        }
                        if (i.a(n17, n16, n13, n12, n4, n5, n6, n7)) {
                            i.a(graphics, this.k, s2, s, n15, n14, s3, n17, n16, 20);
                        }
                    }
                    n11 += 4;
                }
            } else {
                int n18 = this.k();
                int n19 = this.e[n18][1];
                int n20 = 8;
                for (int i3 = 0; i3 < n19; ++i3) {
                    int n21;
                    int n22;
                    int n23;
                    int n24;
                    int n25;
                    int n26;
                    short s;
                    short s5;
                    int n27;
                    int n28;
                    int n29;
                    short s6;
                    if (this.n) {
                        s6 = this.e[n18][0 + n20];
                        n29 = this.e[n18][1 + n20] + n2;
                        n28 = this.e[n18][2 + n20] + n3;
                        n27 = this.e[n18][3 + n20];
                        s5 = 0;
                        s = 0;
                        n26 = this.l[s6].getWidth();
                        n25 = this.l[s6].getHeight();
                        if ((n27 & 4) != 0) {
                            n24 = n25;
                            n23 = n26;
                        } else {
                            n24 = n26;
                            n23 = n25;
                        }
                        n22 = n2 - n29;
                        n21 = n3 - n28;
                        n27 = a[n27][n8];
                        switch (n8) {
                            case 0: {
                                break;
                            }
                            case 5: {
                                n29 = n2 - (n23 - n21);
                                n28 = n3 - n22;
                                break;
                            }
                            case 3: {
                                n29 = n2 - (n24 - n22);
                                n28 = n3 - (n23 - n21);
                                break;
                            }
                            case 6: {
                                n29 = n2 - n21;
                                n28 = n3 - (n24 - n22);
                                break;
                            }
                            case 2: {
                                n29 = n2 - (n24 - n22);
                                break;
                            }
                            case 7: {
                                n29 = n2 - (n23 - n21);
                                n28 = n3 - (n24 - n22);
                                break;
                            }
                            case 1: {
                                n28 = n3 - (n23 - n21);
                                break;
                            }
                            case 4: {
                                n29 = n2 - n21;
                                n28 = n3 - n22;
                            }
                        }
                        if ((n27 & 4) != 0) {
                            n24 = n25;
                            n23 = n26;
                        } else {
                            n24 = n26;
                            n23 = n25;
                        }
                        if (i.a(n29, n28, n24, n23, n4, n5, n6, n7)) {
                            i.a(graphics, this.l[s6], 0, 0, n26, n25, n27, n29, n28, 20);
                        }
                        n20 += 4;
                        continue;
                    }
                    s6 = this.e[n18][0 + n20];
                    n29 = this.e[n18][1 + n20] + n2;
                    n28 = this.e[n18][2 + n20] + n3;
                    n27 = this.e[n18][3 + n20];
                    s5 = this.g[s6][0];
                    s = this.g[s6][1];
                    n26 = this.g[s6][2];
                    n25 = this.g[s6][3];
                    if ((n27 & 4) != 0) {
                        n24 = n25;
                        n23 = n26;
                    } else {
                        n24 = n26;
                        n23 = n25;
                    }
                    n22 = n2 - n29;
                    n21 = n3 - n28;
                    n27 = a[n27][n8];
                    switch (n8) {
                        case 0: {
                            break;
                        }
                        case 5: {
                            n29 = n2 - (n23 - n21);
                            n28 = n3 - n22;
                            break;
                        }
                        case 3: {
                            n29 = n2 - (n24 - n22);
                            n28 = n3 - (n23 - n21);
                            break;
                        }
                        case 6: {
                            n29 = n2 - n21;
                            n28 = n3 - (n24 - n22);
                            break;
                        }
                        case 2: {
                            n29 = n2 - (n24 - n22);
                            break;
                        }
                        case 7: {
                            n29 = n2 - (n23 - n21);
                            n28 = n3 - (n24 - n22);
                            break;
                        }
                        case 1: {
                            n28 = n3 - (n23 - n21);
                            break;
                        }
                        case 4: {
                            n29 = n2 - n21;
                            n28 = n3 - n22;
                        }
                    }
                    if ((n27 & 4) != 0) {
                        n24 = n25;
                        n23 = n26;
                    } else {
                        n24 = n26;
                        n23 = n25;
                    }
                    if (i.a(n29, n28, n24, n23, n4, n5, n6, n7)) {
                        i.a(graphics, this.k, s5, s, n26, n25, n27, n29, n28, 20);
                    }
                    n20 += 4;
                }
            }
        }
    }

    public final void a(Graphics graphics) {
        this.a(graphics, this.r, this.s);
    }

    public static final void a(Graphics graphics, Image image, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        graphics.drawRegion(image, n2, n3, n4, n5, n6, n7, n8, n9);
    }

    static {
        int[][] nArrayArray = new int[][]{{6, 5, 2, 1}, {7, 4, 3, 0}, {4, 7, 0, 3}, {5, 6, 1, 2}, {1, 2, 5, 6}, {0, 3, 4, 7}, {3, 0, 7, 4}, {2, 1, 6, 5}};
        B = new Vector();
    }
}

