/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;

public class j {
    public l[] X;
    private byte[] av;
    private int aw = 0;
    public int Y = 0;
    public int Z = 0;
    private boolean ax = true;
    public int aa;
    public int ab;
    public byte[][] ac;
    public int ad;
    public byte ae = 0;
    public int af = -1;
    public int ag;
    public int ah;
    public int ai;
    public int aj;
    public int ak;
    public boolean al = true;
    public boolean am;
    public int an = -1;
    public String ao;
    public int ap;
    public int[][] aq;
    public short[][] ar;
    public int as = 0xFFE000;
    public byte[] at;
    public boolean[] au;

    public j(String string) throws Exception {
        this.ae = (byte)99;
        this.a(string, 1);
    }

    public j(String string, byte by) throws Exception {
        this.a(string, by);
    }

    private void a(String string, int n2) throws Exception {
        int n3;
        int n4;
        byte by;
        int n5;
        int n6;
        InputStream inputStream = b.a("/pic/" + string + ".sprite");
        int n7 = inputStream.read();
        this.aa = (byte)inputStream.read();
        this.ab = (byte)inputStream.read();
        this.X = new l[n7];
        l[] lArray = new l[n7];
        try {
            l l2 = null;
            l2 = new l(string, n2);
            n6 = l2.a() / this.aa;
            n5 = l2.b() / this.ab;
            by = 0;
            for (n4 = 0; n4 < n5; ++n4) {
                for (int i2 = 0; i2 < n6; ++i2) {
                    lArray[by] = new l(l2, i2, n4, this.aa, this.ab);
                    by = (byte)(by + 1);
                }
            }
        }
        catch (Exception exception) {
            try {
                for (n6 = 0; n6 < n7; ++n6) {
                    StringBuffer stringBuffer = new StringBuffer(string);
                    stringBuffer.append('_');
                    if (n6 < 10) {
                        stringBuffer.append('0');
                    }
                    stringBuffer.append(n6);
                    lArray[n6] = n2 == 1 ? new l(stringBuffer.toString()) : new l(stringBuffer.toString(), n2);
                }
            }
            catch (Exception exception2) {}
        }
        for (n3 = 0; n3 < n7; ++n3) {
            n6 = inputStream.read();
            n5 = inputStream.read();
            this.X[n3] = new l(lArray[n6], n5);
        }
        n3 = inputStream.read();
        if (n3 > 0) {
            for (n6 = 0; n6 < n7; ++n6) {
                this.X[n6].a(n3, this.aa, this.ab);
            }
        }
        if ((n6 = inputStream.read()) > 0) {
            this.ac = new byte[n6][];
            this.ah = inputStream.read() * 50;
            for (n5 = 0; n5 < n6; ++n5) {
                by = (byte)inputStream.read();
                this.ac[n5] = new byte[by];
                for (n4 = 0; n4 < by; ++n4) {
                    this.ac[n5][n4] = (byte)inputStream.read();
                }
            }
        }
        for (n5 = 0; n5 < n7; ++n5) {
            by = (byte)inputStream.read();
            n4 = (byte)inputStream.read();
            if (by == -1 || n4 == -1) break;
            this.X[n5].a(by, n4);
        }
        inputStream.close();
        if (this.ac != null) {
            this.av = this.ac[0];
            return;
        }
        this.av = new byte[n7];
        for (n5 = 0; n5 < n7; n5 = (int)((byte)(n5 + 1))) {
            this.av[n5] = n5;
        }
    }

    public j(j j2) {
        this.X = j2.X;
        this.av = j2.av;
        this.aw = j2.aw;
        this.Y = j2.Y;
        this.Z = j2.Z;
        this.ad = j2.ad;
        this.ax = j2.ax;
        this.aa = j2.aa;
        this.ab = j2.ab;
        this.ah = j2.ah;
        this.ac = j2.ac;
    }

    public j(int n2, int n3) {
        this.aa = n2;
        this.ab = n3;
    }

    public j() {
    }

    public final int h() {
        return this.aw;
    }

    public final int i() {
        return this.av.length;
    }

    public final int j() {
        return this.X.length;
    }

    public final void c(int n2) {
        if (n2 < this.av.length) {
            this.aw = (byte)n2;
        }
    }

    public final void a(boolean bl) {
        this.ax = bl;
    }

    public final void b(int n2, int n3) {
        this.Y = (short)n2;
        this.Z = (short)n3;
    }

    public final void k() {
        ++this.aw;
        if (this.av != null && this.aw >= this.av.length) {
            this.aw = 0;
        }
    }

    public final void a(byte[] byArray) {
        this.av = byArray;
        this.aw = 0;
        this.ag = 0;
    }

    public final void a(Graphics graphics, int n2, int n3, int n4, int n5) {
        if (this.ae == 2 || this.ae == 4 || this.ae == 3) {
            this.a(graphics, n3, n4);
            return;
        }
        if (this.ax) {
            int n6 = this.Y + n3;
            int n7 = this.Z + n4;
            this.X[n2].a(graphics, n6, n7, n5);
        }
    }

    public final void a(Graphics graphics, int n2, int n3, int n4) {
        this.a(graphics, this.av[this.aw], n2, n3, n4);
    }

    public void a(Graphics graphics, int n2, int n3) {
        if (this.ae == 2 || this.ae == 4) {
            if (p.u[2]) {
                graphics.setColor(this.as);
                for (int i2 = 0; i2 < 5; ++i2) {
                    if (!this.au[i2]) continue;
                    int n4 = (this.aq[i2][0] >> 10) + n2 + this.Y;
                    int n5 = (this.aq[i2][1] >> 10) + n3 + this.Z;
                    graphics.fillRect(n4, n5, (int)this.at[i2], (int)this.at[i2]);
                }
            }
        } else {
            if (this.ae == 6) {
                boolean bl = false;
                if (this.aw == 0) {
                    graphics.setColor(15718144);
                } else {
                    graphics.setColor(0xFFFFFF);
                }
                if (this.ai > 0) {
                    int n6 = this.Y + 15;
                    graphics.fillArc(this.Y, this.Z - 15, 30, 30, 0, 360);
                    graphics.fillRect(n6, this.Z - 15, p.m - n6, 30);
                    return;
                }
                graphics.fillArc(this.Y - 30, this.Z - 15, 30, 30, 0, 360);
                graphics.fillRect(0, this.Z - 15, this.Y - 15, 30);
                return;
            }
            if (this.ae == 3) {
                graphics.setColor(0);
                if (this.ai > 0) {
                    graphics.drawLine(this.Y, this.Z, this.Y + 4, this.Z - 2);
                    return;
                }
                graphics.drawLine(this.Y - 4, this.Z - 2, this.Y, this.Z);
                return;
            }
            if (this.ax) {
                int n7 = this.Y + n2;
                int n8 = this.Z + n3;
                if (this.ao != null) {
                    p.a(graphics, this.ao, n7, n8, this.ap, 33);
                    return;
                }
                if (this.an > 0) {
                    n7 += p.a(-4, 5);
                    n8 += p.a(-1, 2);
                }
                byte by = 0;
                if (this.av != null) {
                    by = this.av[this.aw];
                }
                if (this.X != null && this.X[by] != null) {
                    this.X[by].a(graphics, n7, n8);
                }
            }
        }
    }

    public static final j a(String string, int n2, int n3, byte by) {
        int n4 = p.a(by, string);
        int n5 = p.a(by);
        j j2 = new j(n4, n5);
        new j(n4, n5).ap = by;
        j2.ao = string;
        j2.ai = n2;
        j2.ak = n3;
        j2.ae = (byte)5;
        return j2;
    }

    public static final j a(j j2, int n2, int n3, int n4, int n5, int n6, byte by) {
        j j3 = null;
        if (j2 != null) {
            j3 = new j(j2);
        } else if (p.u[2]) {
            j3 = new j(0, 0);
            if (by == 2 || by == 4) {
                if (by == 4) {
                    j3.as = 0xEEEEFF;
                }
                j3.aq = new int[5][2];
                j3.ar = new short[5][2];
                j3.at = new byte[5];
                j3.au = new boolean[5];
                boolean bl = false;
                boolean bl2 = false;
                for (int i2 = 0; i2 < 5; ++i2) {
                    j3.au[i2] = true;
                    if (by == 4) {
                        j3.ar[i2][0] = (short)(p.t.nextInt() % 4 << 10);
                        j3.ar[i2][1] = (short)(p.t.nextInt() % 4 << 10);
                    } else {
                        j3.ar[i2][0] = (short)(Math.abs(p.t.nextInt()) % 8192 + -4096);
                        j3.ar[i2][1] = (short)(Math.abs(p.t.nextInt()) % 4096 + -2048);
                    }
                    j3.at[i2] = (byte)(Math.abs(p.t.nextInt()) % 2 + 1);
                }
            }
        }
        if (j3 != null) {
            j3.ae = by;
            j3.af = n5;
            j3.ah = n6;
            j3.ai = n2;
            j3.aj = n3;
            j3.ak = n4;
            j3.am = true;
        }
        return j3;
    }

    public void f() {
        if (this.al) {
            this.ag += 50;
            if (this.an >= 0) {
                --this.an;
            }
            switch (this.ae) {
                case 2: 
                case 4: {
                    if (!p.u[2]) break;
                    this.l();
                    return;
                }
                case 3: {
                    this.b(this.Y + this.ai, this.Z + this.aj);
                    return;
                }
                case 6: {
                    this.aw = (this.aw + 1) % 2;
                    if (this.ag < this.ah) break;
                    this.al = false;
                    return;
                }
                case 5: {
                    if (this.af == -1) {
                        this.b(this.Y + this.ai, this.Z);
                        this.ad += this.ak;
                        if (this.ad >= 0) {
                            this.ad = 0;
                            this.ak = -this.ak / 2;
                            if (this.ak != 0) break;
                            this.af = 1;
                            this.ag = 0;
                            return;
                        }
                        ++this.ak;
                        return;
                    }
                    if (this.ag < 400) break;
                    this.al = false;
                    return;
                }
                default: {
                    this.b(this.Y + this.ai, this.Z + this.aj);
                    this.ad += this.ak;
                    if (this.af == 0 || this.ag < this.ah) break;
                    this.k();
                    if (this.ae == 0 && this.h() == 0 && this.af > 0) {
                        --this.af;
                        if (this.af <= 0) {
                            this.c(this.i() - 1);
                            if (this.am) {
                                this.al = false;
                            }
                        }
                    }
                    this.ag = 0;
                }
            }
        }
    }

    public final void l() {
        if (this.ae != 4) {
            this.as += -263168;
        }
        for (int i2 = 0; i2 < 5; ++i2) {
            if (!this.au[i2]) continue;
            if (this.ae == 4) {
                int[] nArray = this.aq[i2];
                nArray[0] = nArray[0] + this.ar[i2][0];
                int[] nArray2 = this.aq[i2];
                nArray2[1] = nArray2[1] + this.ar[i2][1];
                if (this.ar[i2][0] < 0) {
                    short[] sArray = this.ar[i2];
                    sArray[0] = (short)(sArray[0] + 256);
                } else if (this.ar[i2][0] > 0) {
                    short[] sArray = this.ar[i2];
                    sArray[0] = (short)(sArray[0] - 256);
                }
                if (this.ar[i2][1] < 0) {
                    short[] sArray = this.ar[i2];
                    sArray[1] = (short)(sArray[1] + 256);
                    continue;
                }
                if (this.ar[i2][1] <= 0) continue;
                short[] sArray = this.ar[i2];
                sArray[1] = (short)(sArray[1] - 256);
                continue;
            }
            int[] nArray = this.aq[i2];
            nArray[0] = nArray[0] + this.ar[i2][0];
            int[] nArray3 = this.aq[i2];
            nArray3[1] = nArray3[1] + this.ar[i2][1];
            short[] sArray = this.ar[i2];
            sArray[1] = (short)(sArray[1] + 256);
        }
        if (this.ag >= this.ah) {
            this.al = false;
        }
    }
}

