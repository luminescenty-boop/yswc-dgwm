/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class f
extends k {
    public boolean[] a = new boolean[]{false, false};
    public int b = 0xCECECE;
    public static final int c = p.n <= 143 ? 1 : 2;
    public static final int d = c * 2 + 1;
    public byte e = (byte)2;
    public short f = (short)3;
    public static e g;
    public String[] h;
    public l[] i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public Font o = p.d;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public byte v;
    public int w;
    public boolean x = false;
    public boolean y = false;
    public m[] z;
    public int A;
    public int B;
    public byte C = (byte)-1;
    public int D;
    public int E;
    public int F;
    public int G;
    public String[] H;
    public int I = -1;
    public boolean J = true;
    public int K;
    public m L;
    public boolean M = true;
    public k N;
    public int O;
    public j[] P;
    public int Q;
    public boolean R = false;
    public Vector S;
    public int T = -1;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public byte[][] aa;
    public Vector ab;
    public int ac;
    public int ad;
    public int ae = 2370117;
    public int af = 2370117;
    public l ag;
    public f ah;
    public int ai;
    public int aj;
    public int[] ak;
    public int al;
    int am = 60;
    public int an = -1;
    public short[] ao;
    public int ap;
    public int aq;
    public int ar;
    public int as;
    public int at;
    public int au;
    public int av;
    public j aw;
    Image[] ax;
    Image ay;
    public boolean az;

    public final void d() {
        this.au = 0;
        if (this.P != null) {
            this.a();
        }
        this.Q = 4;
        this.x = true;
        this.y = true;
        if (g != null) {
            g.d();
        }
        if (this.ah != null) {
            this.ah.x = true;
        }
        if (this.v == 15) {
            for (int i2 = 0; i2 < this.S.size(); ++i2) {
                f f2 = (f)this.S.elementAt(i2);
                f2.d();
                f2.y = false;
            }
        }
    }

    public final void a(byte by, boolean bl) {
        this.a[by] = bl;
    }

    public final void a(k k2) {
        this.N = k2;
        this.a[1] = k2 != null;
    }

    public f(byte by, int n2) {
        this.v = by;
        this.w = n2;
        if (by == 15) {
            this.al = f.g.d - f.g.ab.ab;
            this.J = true;
        } else if (by == 0 || by == 11) {
            this.a[0] = true;
            this.a[1] = true;
        } else if (by == 3) {
            this.aw = f.g.bJ;
            this.c();
            this.J = false;
            this.U = true;
            this.A = p.f - p.e;
            this.l = f.g.c;
            this.m = 80;
            if ((n2 & 2) == 0) {
                this.m += 5;
            }
            this.z = m.d(f.g.aJ);
            this.q = this.z.length;
            boolean bl = false;
            int n3 = this.l - f.g.Z.aa * 2;
            if ((n2 & 4) == 0) {
                n3 -= 8;
            }
            if ((n2 & 8) == 0) {
                n3 -= 8;
            }
            this.E = n3 / (f.g.bJ.aa + 33);
            if (this.E > this.q) {
                this.E = this.q;
            }
            this.n = n3 / this.E;
            this.O = (n3 - this.n * this.E) / 2;
            this.e = (byte)2;
        } else if (by == 2 || by == 5) {
            this.J = false;
            this.m = 5 + c + 40 + d + f.g.bK.ab * 2 + c + c + 1;
            if (by == 5) {
                this.m += d + p.e;
                this.L = g.a(f.g.aj, f.g.ak, (byte)0);
                this.p = this.L.l;
                this.l = f.g.c;
            } else {
                this.l = f.g.c;
            }
        } else if (by != 7 && by == 8) {
            this.f = (short)8;
            this.a[0] = true;
        }
        this.x = true;
    }

    public final f a(String string) {
        this.ah = new f(10, 0);
        this.ah.a(null, string, f.g.c, -1);
        return this.ah;
    }

    public final void a(f f2, int n2, int n3, int n4) {
        int n5;
        if (this.S == null) {
            this.S = new Vector();
        }
        if (this.ak == null) {
            this.ak = new int[5];
            for (n5 = 0; n5 < 5; ++n5) {
                this.ak[n5] = this.al;
                if (n5 <= 0) continue;
                int n6 = n5;
                this.ak[n6] = this.ak[n6] - f.g.ab.ab;
            }
        }
        f2.a(n2, n3, n4);
        n5 = f2.k;
        for (int i2 = 0; i2 < 5; ++i2) {
            if (n5 < this.ak[i2]) {
                if (n5 + f2.m <= this.ak[i2]) break;
                this.ak[i2] = n5;
                if (i2 + 1 <= this.aj) break;
                this.aj = i2 + 1;
                break;
            }
            n5 -= this.ak[i2];
        }
        f2.a((byte)0, false);
        f2.a((byte)1, false);
        this.S.addElement(f2);
    }

    public final void a(int n2, int n3, byte[][] byArray, Vector vector) {
        int n4;
        this.w = 15;
        this.aa = byArray;
        this.ab = vector;
        this.f = (short)8;
        this.a[0] = true;
        this.J = true;
        this.ac = byArray.length;
        this.ad = byArray[0].length;
        boolean bl = false;
        this.l = this.ac * f.g.N[0].a() + 8;
        this.m = this.ad * f.g.N[0].b() + 8;
        if (this.l > n2) {
            n4 = f.g.N[0].a();
            this.Y = (n2 - 8) / n4;
            this.l = n4 * this.Y + 8;
        } else {
            this.Y = this.ac;
        }
        if (this.m > n3) {
            n4 = f.g.N[0].b();
            this.Z = (n3 - 8) / n4;
            this.m = n4 * this.Z + 8;
        } else {
            this.Z = this.ad;
        }
        this.v = (byte)8;
    }

    public final void a(int n2, int n3, int n4) {
        this.j = n2;
        this.k = n3;
        if ((n4 & 1) != 0) {
            this.j -= this.l >> 1;
        } else if ((n4 & 8) != 0) {
            this.j -= this.l;
        }
        if ((n4 & 2) != 0) {
            this.k -= this.m >> 1;
        } else if ((n4 & 0x20) != 0) {
            this.k -= this.m;
        }
        this.t = this.j;
        this.u = this.k;
    }

    public final void a(String string, int n2, int n3, byte by, byte by2) {
        this.C = by;
        if (by == -1) {
            this.w = 14;
        } else {
            this.F = this.am - 8;
        }
        int n4 = n2 - this.F - 16;
        this.h = e.a(string, n4, p.d);
        this.a(null, this.h, n2, n3);
        this.R = false;
        this.v = (byte)7;
    }

    public final void a(String string, String[] stringArray, int n2, int n3) {
        this.J = false;
        this.l = n2;
        this.m = n3;
        this.q = stringArray.length;
        this.p = 0;
        this.D = 0;
        this.G = 0;
        this.R = false;
        int n4 = n2 - this.F - 16;
        if (string != null) {
            this.H = e.a(string, n4, p.d);
        }
        this.h = stringArray;
        this.n = p.f;
        this.A = p.f - p.e;
        this.B = this.A / 2;
        int n5 = n3 <= 0 ? this.eH : n3;
        if ((this.w & 1) == 0) {
            n5 -= 5;
        }
        if ((this.w & 2) == 0) {
            n5 -= 5;
        }
        if (string != null) {
            n5 -= this.H.length * this.n;
        }
        this.E = (n5 - 2) / this.n;
        if (this.E > this.h.length) {
            this.E = this.h.length;
        } else if (this.E < this.h.length) {
            this.R = true;
        }
        if (n3 < 0) {
            if (this.H != null) {
                this.m = this.H.length * this.n;
            }
            this.m += this.E * this.n;
            if ((this.w & 1) == 0) {
                this.m += 5;
            }
            if ((this.w & 2) == 0) {
                this.m += 5;
            }
            this.m += 2;
            this.O = 1;
        } else {
            this.O = (n5 - this.E * this.n) / 2;
        }
        this.v = (byte)10;
        this.e = (byte)2;
    }

    public final void a(String string, String string2, int n2, int n3) {
        int n4 = n2 - this.F;
        if ((this.w & 4) == 0) {
            n4 -= 8;
        }
        if ((this.w & 8) == 0) {
            n4 -= 8;
        }
        this.h = e.a(string2, n4, p.d);
        this.a(string, this.h, n2, n3);
        if (this.R) {
            this.h = e.a(string2, n4 -= f.g.aa.aa, p.d);
            this.a(string, this.h, n2, n3);
        }
    }

    private void c() {
        this.P = new j[3];
        for (int i2 = 0; i2 < this.P.length; ++i2) {
            this.P[i2] = new j(f.g.ah);
        }
        this.a();
    }

    public final void a() {
        for (int i2 = 0; i2 < this.P.length; ++i2) {
            this.P[i2].a(true);
            this.P[i2].b(p.a(this.aw.aa), p.a(this.aw.ab));
            this.P[i2].c(p.a(this.P[i2].j()));
        }
    }

    public final void a(String[] stringArray, l[] lArray, int n2, int n3, int n4) {
        this.w = 15;
        this.h = stringArray;
        this.i = lArray;
        this.q = this.h.length;
        this.l = 0;
        for (int i2 = 0; i2 < this.q; ++i2) {
            int n5 = p.d.stringWidth(this.h[i2]);
            if (n5 <= this.l) continue;
            this.l = n5;
        }
        this.A = p.f - p.e;
        this.B = this.A / 2;
        this.av = f.g.bK.aa;
        this.n = this.av + this.A;
        this.l += this.q * this.n;
        this.l += 32;
        if (this.l > this.eG) {
            this.l = this.eG;
        }
        this.m = this.av;
        this.a(n2, n3, n4);
        this.v = (byte)13;
        this.e = (byte)2;
    }

    public final void a(String[] stringArray, int n2, int n3) {
        this.h = stringArray;
        this.q = this.h.length;
        this.U = true;
        this.J = false;
        this.m = n3;
        int n4 = 0;
        for (int i2 = 0; i2 < this.h.length; ++i2) {
            int n5 = p.d.stringWidth(this.h[i2]);
            if (n5 <= n4) continue;
            n4 = n5;
        }
        this.l = n4 + 16 + f.g.Z.aa * 2;
        if (this.l < n2) {
            this.l = n2;
        }
        if (this.m < 0) {
            this.m = p.f;
            if (f.g.Z.ab > this.m) {
                this.m = f.g.Z.ab;
            }
            if ((this.w & 1) == 0) {
                this.m += 5;
            }
            if ((this.w & 2) == 0) {
                this.m += 5;
            }
        }
        this.v = (byte)14;
        this.e = (byte)2;
    }

    public final void a(String[] stringArray, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.h = stringArray;
        this.q = this.h.length;
        this.A = p.f - p.e;
        this.n = p.f;
        int n8 = 0;
        for (int i2 = 0; i2 < this.h.length; ++i2) {
            int n9 = p.d.stringWidth(this.h[i2]);
            if (n9 <= n8) continue;
            n8 = n9;
        }
        this.l = n8 + 4 + 16;
        if (this.l > this.eG) {
            this.l = this.eG;
        } else if (this.l < n4) {
            if (n7 == 4) {
                this.an = (n4 - this.l) / 2;
            }
            this.l = n4;
        }
        this.m = this.n * this.h.length + this.A + 16;
        if (this.m > n5) {
            this.m = n5;
        }
        this.a(null, this.h, this.l, this.m);
        if (this.l < this.eG && this.R) {
            this.l += f.g.aa.aa;
        }
        this.v = (byte)11;
        this.a(n2, n3, n6);
    }

    public final void a(String[] stringArray, l[] lArray, Image[] imageArray, int n2, int n3, int n4, int n5, byte by) {
        this.h = stringArray;
        this.i = lArray;
        this.ax = imageArray;
        this.q = this.h.length;
        if (by == 1) {
            this.aw = f.g.bJ;
        } else if (by == 2) {
            this.aw = f.g.bK;
            if (this.q < 4) {
                String[] stringArray2 = new String[4];
                System.arraycopy(this.h, 0, stringArray2, 0, this.q);
                this.h = stringArray2;
                this.q = 4;
            }
        }
        this.A = p.f - p.e;
        this.w = 15;
        this.av = this.aw.aa;
        this.c();
        try {
            int n6;
            this.ao = new short[this.q];
            this.as = 360 / this.q;
            this.ar = this.as / 2;
            for (n6 = 0; n6 < this.q; ++n6) {
                this.ao[n6] = (short)(this.as * n6);
            }
            if (this.q == 1) {
                this.ap = 0;
            } else if (n4 <= 0) {
                this.ap = (this.aw.aa << 10) / (2 * f.m(45));
                this.aq = this.ap + this.aw.aa / 2;
                n4 = this.aq * 2 + p.f + 2;
            } else {
                n6 = (this.aw.aa << 10) / f.m(this.as / 2) + this.aw.ab / 2;
                this.aq = (n4 - p.f) / 2 - 2;
                if (this.aq > n6) {
                    this.aq = n6;
                }
                this.ap = this.aq - this.aw.ab / 2;
            }
        }
        catch (Exception exception) {
            System.out.println("error!!!!");
        }
        this.l = this.aq * 2;
        this.m = n4;
        this.e = 0;
        this.a(n2, n3, n5);
    }

    public final int a(int n2) {
        int n3;
        int n4 = n3 = this.T;
        int n5 = this.S.size();
        do {
            if ((n3 += n2) < 0) {
                n3 = n5 - 1;
                continue;
            }
            if (n3 < this.S.size()) continue;
            if (n4 < 0) {
                return -1;
            }
            n3 = 0;
        } while (!((f)this.S.elementAt((int)n3)).U);
        return n3;
    }

    public final void l() throws Exception {
        this.a(true);
    }

    public final void a(boolean bl) throws Exception {
        int n2;
        if (this.e == 3) {
            return;
        }
        if (this.v == 10 && this.I > 0 && this.I <= 250) {
            ++this.Q;
            this.x = true;
        } else if (this.Q > 0) {
            --this.Q;
            this.x = true;
        }
        if (bl && this.e == 2) {
            int n3;
            n2 = 0;
            if (this.a[0] && (eF.c(e.p) || eF.c(16))) {
                n2 = 1;
                eF.g(e.p);
                eF.g(16);
            }
            if (this.v == 0 || this.v == 3) {
                for (n3 = 0; n3 < this.P.length; ++n3) {
                    if (this.P[n3].h() == this.P[n3].j() - 1) {
                        if (this.au == 0) {
                            this.P[n3].b(p.a(this.aw.aa - this.P[n3].aa), p.a(this.aw.ab - this.P[n3].ab));
                        } else {
                            this.P[n3].a(false);
                        }
                    }
                    this.P[n3].k();
                }
                this.x = true;
            }
            if (this.v == 15) {
                if (!this.V && this.T >= 0) {
                    int n4;
                    int n5;
                    if (eF.c(1)) {
                        ((f)this.S.elementAt((int)this.T)).x = true;
                        this.T = this.a(-1);
                        f f2 = (f)this.S.elementAt(this.T);
                        ((f)this.S.elementAt(this.T)).x = true;
                        n5 = f2.k;
                        for (n4 = 0; n4 < 5; ++n4) {
                            if (n5 < this.ak[n4]) {
                                if (this.ai == n4) break;
                                this.d();
                                this.ai = n4;
                                break;
                            }
                            n5 -= this.ak[n4];
                        }
                    } else if (eF.c(2)) {
                        ((f)this.S.elementAt((int)this.T)).x = true;
                        this.T = this.a(1);
                        f f3 = (f)this.S.elementAt(this.T);
                        ((f)this.S.elementAt(this.T)).x = true;
                        n5 = f3.k;
                        for (n4 = 0; n4 < 5; ++n4) {
                            if (n5 < this.ak[n4]) {
                                if (this.ai == n4) break;
                                this.d();
                                this.ai = n4;
                                break;
                            }
                            n5 -= this.ak[n4];
                        }
                    }
                }
                if (n2 != 0) {
                    g.a(this, this.T, "", (byte)0);
                    return;
                }
                for (n3 = 0; n3 < this.S.size(); ++n3) {
                    f f4 = (f)this.S.elementAt(n3);
                    if (this.V) {
                        f4.a(true);
                        continue;
                    }
                    f4.a(n3 == this.T);
                }
                this.x = true;
            } else if (this.v == 0) {
                if (this.e == 2) {
                    this.x = true;
                    if (e.eF.c(1)) {
                        this.au -= this.as;
                        this.at += this.as;
                        --this.p;
                        if (this.p < 0) {
                            this.p = this.q - 1;
                        }
                    } else if (e.eF.c(2)) {
                        this.au += this.as;
                        this.at -= this.as;
                        if (this.at < 0) {
                            this.at += 360;
                        }
                        ++this.p;
                        if (this.p >= this.q) {
                            this.p = 0;
                        }
                    }
                    if (e.eF.c(4)) {
                        this.au -= this.as;
                        this.at += this.as;
                        --this.p;
                        if (this.p < 0) {
                            this.p = this.q - 1;
                        }
                        System.out.println("turn left");
                        e.cU.a(0);
                        e.cU.a(false);
                    } else if (e.eF.c(8)) {
                        this.au += this.as;
                        this.at -= this.as;
                        if (this.at < 0) {
                            this.at += 360;
                        }
                        ++this.p;
                        if (this.p >= this.q) {
                            this.p = 0;
                        }
                        System.out.println("turn right");
                        e.cU.a(1);
                        e.cU.a(false);
                    }
                    if (this.au != 0) {
                        n3 = -this.au / 2;
                        this.au = n3 == 0 ? 0 : (this.au += n3);
                        if (this.au == 0) {
                            this.a();
                        }
                    } else if (e.eF.e(4)) {
                        this.au -= this.as;
                        this.at += this.as;
                        --this.p;
                        if (this.p < 0) {
                            this.p = this.q - 1;
                        }
                    } else if (e.eF.e(8)) {
                        this.au += this.as;
                        this.at -= this.as;
                        if (this.at < 0) {
                            this.at += 360;
                        }
                        ++this.p;
                        if (this.p >= this.q) {
                            this.p = 0;
                        }
                    }
                    if (n2 != 0) {
                        g.a(this, this.p, this.h[this.p], (byte)0);
                        return;
                    }
                }
            } else if (this.v == 13 || this.v == 14) {
                if (eF.c(4)) {
                    --this.p;
                    if (this.p < 0) {
                        this.p = this.q - 1;
                    }
                    if (this.v == 14) {
                        g.a(this, this.p, null, (byte)2);
                    }
                    this.x = true;
                } else if (eF.c(8)) {
                    ++this.p;
                    if (this.p >= this.q) {
                        this.p = 0;
                    }
                    if (this.v == 14) {
                        g.a(this, this.p, null, (byte)2);
                    }
                    this.x = true;
                } else if (n2 != 0) {
                    g.a(this, this.p, this.h[this.p], (byte)0);
                    return;
                }
            } else if (this.v == 3) {
                if (this.G != 0) {
                    this.G = Math.abs(this.G) < 2 ? 0 : (this.G -= this.G / 2);
                    this.x = true;
                }
                if (n2 != 0) {
                    g.a(this, this.p, this.h[this.p], (byte)0);
                    return;
                }
                if (eF.c(4)) {
                    if (this.p < this.D) {
                        this.p += this.q;
                    }
                    --this.p;
                    if (this.p < this.D) {
                        if (this.p < 0) {
                            this.p += this.q;
                        }
                        this.D = this.p;
                        this.G = -this.n;
                    }
                    this.p %= this.q;
                    g.a(this, this.p, null, (byte)2);
                    this.a();
                    this.x = true;
                } else if (eF.c(8)) {
                    if (this.p < this.D) {
                        this.p += this.q;
                    }
                    ++this.p;
                    if (this.p >= this.D + this.E) {
                        this.G = this.n;
                        this.D = (this.D + 1) % this.q;
                    }
                    this.p %= this.q;
                    g.a(this, this.p, null, (byte)3);
                    this.a();
                    this.x = true;
                }
            } else if (this.v == 10 || this.v == 7 || this.v == 11) {
                if (this.I != -1) {
                    if (this.I > 0) {
                        this.I -= 50;
                    } else {
                        eF.a(this.N);
                    }
                }
                if (this.G > 0) {
                    this.G -= this.n / 3 + 1;
                    if (this.G < 0) {
                        this.G = 0;
                    }
                    this.x = true;
                } else if (this.G < 0) {
                    this.G += this.n / 3 + 1;
                    if (this.G > 0) {
                        this.G = 0;
                    }
                    this.x = true;
                }
                if (this.G == 0) {
                    if ((this.v == 11 || this.v == 10) && n2 != 0) {
                        g.a(this, this.p, this.h[this.p], (byte)0);
                        return;
                    }
                    if (this.v != 7 && eF.c(1)) {
                        if (this.v == 11) {
                            --this.p;
                            if (this.p < 0) {
                                this.p = this.q - 1;
                                this.D = this.q - this.E;
                                if (this.v == 3) {
                                    this.D = this.p;
                                }
                            } else if (this.p < this.D) {
                                this.G = -this.n;
                                --this.D;
                            }
                            g.a(this, this.p, null, (byte)2);
                            this.x = true;
                        } else if (this.D > 0) {
                            this.G = -this.n;
                            --this.D;
                            this.x = true;
                        }
                        eF.d();
                    }
                    if (eF.c(2) || this.v == 7 && eF.c(2048)) {
                        if (this.v == 11) {
                            ++this.p;
                            if (this.p >= this.q) {
                                this.p = 0;
                                this.D = 0;
                            } else if (this.p >= this.D + this.E) {
                                this.G = this.n;
                                ++this.D;
                            }
                            g.a(this, this.p, null, (byte)3);
                            this.x = true;
                        } else if (this.D + this.E < this.h.length) {
                            this.G = this.n;
                            ++this.D;
                            this.x = true;
                        } else if (this.v == 7) {
                            g.a(this, 0, null, (byte)0);
                            return;
                        }
                        eF.d();
                    }
                }
            } else if (this.v == 8) {
                if (eF.c(1)) {
                    if (this.X > 0) {
                        --this.X;
                        this.x = true;
                    }
                } else if (eF.c(2) && this.X + this.Z < this.ad) {
                    ++this.X;
                    this.x = true;
                }
                if (eF.c(4)) {
                    if (this.W > 0) {
                        --this.W;
                        this.x = true;
                    }
                } else if (eF.c(8) && this.W + this.Y < this.ac) {
                    ++this.W;
                    this.x = true;
                }
            }
            if (this.e == 2 && this.a[1] && e.eF.c(e.q)) {
                e.eF.g(e.q);
                eF.d();
                if (this.N != null) {
                    eF.a(this.N);
                }
                if (this.h != null) {
                    g.a(this, this.p, this.h[this.p], (byte)1);
                    return;
                }
                g.a(this, -1, null, (byte)1);
                return;
            }
        }
        if (this.J && ++this.s >= this.f) {
            this.r = this.r == 0 ? 2 : 0;
            this.s = 0;
            this.x = true;
        }
        switch (this.e) {
            case 0: {
                if (this.v == 0) {
                    this.e = (byte)2;
                    if (this.M) {
                        e.eF.d();
                    }
                } else if (this.v == 13) {
                    this.t += (this.j - this.t) / 2;
                    ++this.K;
                    if (this.K == 2) {
                        this.e = (byte)2;
                        this.t = this.j;
                    }
                } else {
                    n2 = (this.j - this.t) / 4;
                    if (n2 <= 0) {
                        n2 = 1;
                    }
                    this.t += n2;
                    if (this.t == this.j) {
                        this.e = (byte)2;
                    }
                }
                this.x = true;
                return;
            }
            case 1: {
                this.e = (byte)3;
            }
        }
    }

    public static final void a(Graphics graphics, int n2, int n3, int n4, int n5) {
        if (n5 <= 2) {
            graphics.fillRect(n2, n3, n4, n5);
            return;
        }
        graphics.fillRect(n2, n3 + 1, n4, n5 - 2);
        graphics.fillRect(n2 + 1, n3, n4 - 2, n5);
    }

    public final void f(Graphics graphics) {
        this.a(graphics, 0, 0, false);
    }

    public final void a(Graphics graphics, int n2, int n3, boolean bl) {
        if (this.e == 3) {
            return;
        }
        if (!this.x) {
            return;
        }
        this.x = false;
        if (f.eF.l == this && this.y || this.v == 0) {
            g.f(graphics);
        }
        this.y = false;
        graphics.setClip(0, 0, this.eG, this.eH);
        if (this.ah != null) {
            this.ah.f(graphics);
        }
        int n4 = this.t + n2;
        int n5 = this.u + n3;
        int n6 = 0;
        int n7 = 0;
        if (this.v != 0 && this.v != 13 && !this.az) {
            f.a(graphics, n4, n5, this.l, this.m, this.w, this.af, this.ae, this.Q, 5);
            graphics.setClip(0, 0, this.eG, this.eH);
        }
        if (this.az) {
            if (this.ay == null) {
                try {
                    this.ay = Image.createImage((String)"/logo/last.png");
                }
                catch (Exception exception) {}
            }
            graphics.setColor(0);
            graphics.fillRect(0, 0, 360, 640);
            graphics.drawImage(this.ay, this.eG / 2, this.eH / 2, 3);
        }
        n6 = this.l;
        n7 = this.m;
        if ((this.w & 1) == 0) {
            n7 -= 5;
            n5 += 5;
        }
        if ((this.w & 2) == 0) {
            n7 -= 5;
        }
        if ((this.w & 4) == 0) {
            n4 += 8;
            n6 -= 8;
        }
        if ((this.w & 8) == 0) {
            n6 -= 8;
        }
        graphics.translate(n4, n5);
        graphics.setFont(this.o);
        if (this.ag != null && (this.h == null || this.o.stringWidth(this.h[0]) < n6 - this.ag.a() * 2)) {
            this.ag.a(graphics, 0, n7 / 2, 6);
        }
        if (bl) {
            graphics.setColor(5594742);
            f.a(graphics, 0, 0, n6, n7);
        }
        switch (this.v) {
            case 15: {
                int n8;
                int n9 = 0;
                int n10 = 0;
                int n11 = this.ak[0];
                for (n8 = 1; n8 <= this.ai; ++n8) {
                    n9 = n11;
                    n11 += this.ak[n8];
                }
                if (this.ai > 0) {
                    n10 = -n9 + f.g.ab.ab;
                }
                for (n8 = 0; n8 < this.S.size(); ++n8) {
                    f f2 = (f)this.S.elementAt(n8);
                    if (f2.k < n9 || f2.k >= n11) continue;
                    f2.a(graphics, 0, n10, n8 == this.T);
                }
                graphics.setClip(0, 0, f.g.c, f.g.d);
                if (this.ai > 0) {
                    graphics.setColor(2370117);
                    graphics.fillRect(0, 0, this.eG, f.g.ab.ab);
                    f.g.aa.a(graphics, 0, f.g.c / 2, -this.r, 17);
                }
                if (this.ai >= this.aj) break;
                graphics.setColor(2370117);
                n8 = this.ak[this.ai];
                if (this.ai > 0) {
                    n8 += f.g.ab.ab;
                }
                graphics.fillRect(0, n8, this.eG, f.g.d - n8);
                f.g.aa.a(graphics, 1, f.g.c / 2, f.g.d + this.r, 33);
                break;
            }
            case 0: {
                if (e.cU != null) {
                    e.cU.a(graphics, -n4, -n5);
                    e.cU.j();
                    if (e.cU.y) {
                        System.out.println("istrue!!!!!!!!!!!!");
                        e.cU.a(2);
                        e.cU.a(true);
                    }
                }
                if (this.ax != null && e.cU.f() == 2) {
                    graphics.drawImage(this.ax[this.p], -n4 + p.m / 2, -n5 + p.n - 50, 3);
                }
                ++f.g.cX;
                if (f.g.cX > e.cW.length - 1) {
                    f.g.cX = 0;
                }
                if (e.cW[f.g.cX] != null) {
                    graphics.drawImage(e.cW[f.g.cX], -n4, -n5 + p.n + 12, 36);
                }
                if (e.cV == null) break;
                graphics.drawImage(e.cV, -n4 + p.m / 2, -n5, 17);
                break;
            }
            case 3: {
                graphics.setClip(0, 0, n6, n7);
                int n12 = c;
                graphics.setColor(11515819);
                graphics.drawLine(c, n12, n6 - c * 2, n12);
                n12 += 1 + c;
                n12 += f.g.bJ.ab / 2;
                int n13 = f.g.Z.aa + this.G + this.O;
                int n14 = this.D;
                int n15 = this.D + this.E;
                if (this.G > 0) {
                    --n14;
                    n13 -= this.n;
                } else if (this.G < 0) {
                    ++n15;
                }
                for (int i2 = n14; i2 < n15; ++i2) {
                    int n16 = i2 % this.q;
                    if (n16 < 0) {
                        n16 += this.q;
                    }
                    int n17 = n13 + this.n / 2;
                    m m2 = this.z[n16];
                    int n18 = n17 - m2.Y - m2.O.s() / 2;
                    int n19 = n12 - m2.Z + m2.O.t() / 2;
                    m2.a(graphics, n18, n19, m2.K > f.g.aO[f.g.aJ]);
                    if (n16 == this.p) {
                        int n20 = n17 - this.aw.aa / 2;
                        int n21 = n12 - this.aw.aa / 2 + m2.O.t() / 2;
                        for (int i3 = 0; i3 < this.P.length; ++i3) {
                            this.P[i3].a(graphics, n20, n21, 20);
                        }
                    }
                    n13 += this.n;
                }
                f.g.Z.a(graphics, 0, 0, n12, 6);
                f.g.Z.a(graphics, 1, n6, n12, 10);
                break;
            }
            case 2: 
            case 5: {
                int n22;
                int n23;
                int n24;
                int n25;
                graphics.setClip(0, 0, n6, n7);
                int n26 = c;
                int n27 = p.s[0].aa;
                int n28 = 0;
                int n29 = this.v == 2 ? n26 + 40 : n26;
                int n30 = n29 + this.L.ab / 2;
                String string = null;
                graphics.setFont(p.d);
                graphics.setColor(this.b);
                p.b(graphics, this.L.e, n26 + this.L.aa + n26, n30 - p.e / 2, 68);
                if (this.v == 2) {
                    string = "" + this.L.K;
                    f.g.bN.a(graphics, 1, n6 - n26 - p.a((byte)1, string), n30, 40);
                } else {
                    string = "" + this.L.u;
                }
                p.a(graphics, string, n6 - n26, n30, 1, 40);
                this.A = p.f - p.e;
                graphics.setColor(this.b);
                graphics.drawLine(n26, n29 += this.L.ab + c, n6 - n26 - n26, n29);
                n29 += 1 + c;
                if (this.v == 5) {
                    n25 = p.e;
                    n30 = n29 + n25 / 2;
                    n28 = n26;
                    p.b(graphics, f.l(97), n28, n29, 20);
                    n24 = p.d.stringWidth(f.l(97));
                    n23 = n6 - (n28 += n24 + n26) - n26 - f.g.bM.aa - n27 - n26;
                    graphics.setColor(this.b);
                    f.a(graphics, n28, n29, n23, n25);
                    graphics.setColor(2370117);
                    n22 = n23 * this.L.g / this.L.c();
                    if (n22 <= 0) {
                        n22 = 1;
                    }
                    graphics.fillRect(n28 + 1, n29 + 1, n22, n25 - 2);
                    n28 = n6 - n26 - n27;
                    f.g.bM.a(graphics, 2, n28, n30, 10);
                    p.a(graphics, "" + this.L.f, n28, n30, 0, 6);
                    graphics.setColor(this.b);
                    graphics.drawLine(n26, n29 += n25 + c, n6 - n26 - n26, n29);
                    n29 += 1 + c;
                }
                n25 = (n6 - n26 * 3) / 2;
                n24 = f.g.bM.ab;
                n23 = f.g.bK.ab;
                n22 = n23 / 2;
                for (int i4 = 0; i4 < 2; ++i4) {
                    int n31 = n29 + n22 - n24 / 2;
                    n28 = n26;
                    for (int i5 = 0; i5 < 2; ++i5) {
                        if (i4 != 0 && i5 != 0) continue;
                        int n32 = n28 + n22;
                        f.a(graphics, n32, n31, n25 - n22, n24);
                        f.g.bK.a(graphics, n28, n29);
                        int n33 = i4 * 2 + i5;
                        if (n33 == 0 || n33 == 1) {
                            f.g.bM.a(graphics, n33, n32, n29 + n22, 3);
                        }
                        int n34 = 0;
                        if (n33 == 0) {
                            if (this.v == 5) {
                                n34 = this.L.a((m)null);
                            }
                            string = this.L.r + n34 + "-" + (this.L.s + n34);
                        } else if (n33 == 1) {
                            if (this.v == 5) {
                                n34 = this.L.b((m)null);
                            }
                            string = "" + (this.L.t + n34);
                        } else if (n33 == 2) {
                            f.g.t[5].a(graphics, n32, n29 + n22, 3);
                            string = "" + m.P[this.L.l];
                        }
                        p.a(graphics, string, n28 + n23 + 1, n29 + n22, 0, 6);
                        if (n34 > 0) {
                            f.g.cr.a(graphics, 1, n32 + n25 - n22 - 1, n29 + n22, 10);
                        } else if (n34 < 0) {
                            f.g.cr.a(graphics, 2, n32 + n25 - n22 - 1, n29 + n22, 10);
                        }
                        n28 += n25 + c;
                    }
                    n29 += n23;
                }
                graphics.setColor(this.b);
                graphics.drawLine(n26, n29 += c, n6 - n26 - n26, n29);
                break;
            }
            case 8: {
                int n35;
                int n36;
                int n37;
                int n38;
                g.a(graphics, 0, 0, this.l, this.m);
                int n39 = f.g.N[0].a();
                int n40 = f.g.N[0].b();
                int n41 = this.Z + this.X;
                int n42 = this.Y + this.W;
                int n43 = 4;
                for (n38 = this.X; n38 < n41; ++n38) {
                    int n44 = 4;
                    for (n37 = this.W; n37 < n42; ++n37) {
                        n36 = f.g.O[this.aa[n37][n38]];
                        if (this.aa[n37][n38] >= f.g.M) {
                            n35 = (this.aa[n37][n38] - f.g.M) / 2;
                            n36 = 2 * n35 + 8 + n36 - 8;
                        }
                        f.g.N[n36].a(graphics, n44, n43);
                        n44 += n39;
                    }
                    n43 += n40;
                }
                if (this.ab != null && this.r == 0) {
                    n38 = -this.W * n39 + 4;
                    n37 = -this.X * n40 + 4;
                    n35 = f.g.aA.size();
                    for (n36 = 0; n36 < n35; ++n36) {
                        m m3 = (m)f.g.aA.elementAt(n36);
                        if (m3.n < this.W || m3.n >= n42 || m3.o < this.X || m3.o >= n41) continue;
                        f.g.bT.a(graphics, f.g.aH[m3.m] - 1, m3.n * n39 + n38, m3.o * n40 + n37, 0);
                    }
                }
                if (this.r != 0) break;
                if (this.X > 0) {
                    f.g.aa.a(graphics, 0, n6 / 2, 0, 17);
                }
                if (this.X + this.Z < this.ad) {
                    f.g.aa.a(graphics, 1, n6 / 2, n7, 33);
                }
                if (this.W > 0) {
                    f.g.Z.a(graphics, 0, 0, n7 / 2, 6);
                }
                if (this.W + this.Y >= this.ac) break;
                f.g.Z.a(graphics, 1, n6, n7 / 2, 10);
                break;
            }
            case 14: {
                graphics.setFont(p.d);
                graphics.setColor(e.a(0xFFFFFF, 1645370, this.Q, 5));
                int n45 = n7 / 2;
                p.b(graphics, this.h[this.p], n6 / 2, (n7 - p.e) / 2, 17);
                f.g.Z.a(graphics, 0, 0, n45, 6);
                f.g.Z.a(graphics, 1, n6, n45, 10);
                break;
            }
            case 13: {
                int n46 = p.f;
                int n47 = (this.m - n46) / 2;
                graphics.setColor(e.a(1645370, 0xFFFFFF, this.Q, 5));
                f.a(graphics, 0, n47, this.l, n46);
                graphics.setFont(p.d);
                graphics.setColor(0xFFFFFF);
                p.b(graphics, this.h[this.p], 16, n47 + this.B, 20);
                int n48 = this.l - this.n;
                for (int i6 = this.q - 1; i6 >= 0; --i6) {
                    if (i6 == this.p) {
                        f.g.bK.a(graphics, 1, n48, 0, 20);
                    } else {
                        f.g.bK.a(graphics, 0, n48, 0, 20);
                    }
                    this.i[i6].a(graphics, n48 + f.g.bK.aa / 2, this.m / 2, 3);
                    n48 -= this.n;
                }
                break;
            }
            case 7: 
            case 10: 
            case 11: {
                int n49;
                int n50;
                int n51;
                int n52;
                graphics.setFont(p.d);
                if (this.C != -1) {
                    graphics.drawImage(f.g.ai[this.C], -8, n7, 36);
                }
                graphics.setClip(0, 0, n6 -= this.F, this.m - 10);
                int n53 = 0;
                int n54 = 0;
                if (this.H != null) {
                    graphics.setColor(e.a(0xFFFFFF, this.af, this.Q, 5));
                    for (n52 = 0; n52 < this.H.length; ++n52) {
                        p.b(graphics, this.H[n52], this.F + n6 / 2, n54 + this.B, 17);
                        n54 += this.n;
                    }
                    graphics.setColor(10463131);
                    graphics.drawLine(0, n54, n6 - 1, n54);
                    n53 = n54;
                }
                n52 = n54 + this.O;
                graphics.setColor(this.b);
                int n55 = this.D;
                int n56 = this.D + this.E;
                if (this.G > 0) {
                    --n55;
                    n54 -= this.n;
                } else if (this.G < 0) {
                    ++n56;
                }
                n54 += this.G + this.O;
                graphics.setClip(this.F, n53, n6, n7 - n53);
                int n57 = n6;
                if (this.R) {
                    n57 -= f.g.aa.aa;
                }
                int n58 = this.F + n57 / 2;
                for (n51 = n55; n51 < n56; ++n51) {
                    n50 = 0;
                    if (n54 < n52) {
                        n50 = n52 - n54;
                    } else if (n54 + this.n > n7 - this.O) {
                        n50 = n54 + this.n - n7 + this.O;
                    }
                    if (this.v == 11 && n51 == this.p) {
                        graphics.setColor(5594742);
                        f.a(graphics, 0, n54, n57, this.n);
                        n49 = e.a(this.af, 0xFFFFFF, this.n - n50, this.n);
                    } else {
                        n49 = e.a(this.af, this.b, this.n - n50, this.n);
                    }
                    n49 = e.a(n49, this.af, this.Q, 5);
                    graphics.setColor(n49);
                    if (this.an >= 0) {
                        p.b(graphics, this.h[n51], this.an, n54 + this.B, 20);
                    } else {
                        p.b(graphics, this.h[n51], n58, n54 + this.B, 17);
                    }
                    n54 += this.n;
                }
                if (this.R) {
                    n51 = f.g.aa.ab;
                    n50 = f.g.aa.aa;
                    n49 = f.g.aa.aa / 2;
                    int n59 = n7 - n51 * 2 - 2;
                    int n60 = n6 - (n50 + n49) / 2;
                    if (n59 > 2) {
                        graphics.setColor(this.b);
                        f.a(graphics, n60, n51 + 1, n49, n59);
                        int n61 = (n59 - 2) * this.E / this.q;
                        if (n61 < 1) {
                            n61 = 1;
                        }
                        graphics.setColor(2370117);
                        f.a(graphics, n60 + 1, n51 + (n59 - 2) * this.D / this.q + 2, n49 - 2, n61);
                        f.g.aa.a(graphics, 0, n6 - n50, 0, 20);
                        f.g.aa.a(graphics, 1, n6 - n50, n7, 36);
                    } else {
                        if (this.D > 0) {
                            f.g.aa.a(graphics, 0, n6 - n50, 0, 20);
                        }
                        if (this.D + this.E < this.q) {
                            f.g.aa.a(graphics, 1, n6 - n50, n7, 36);
                        }
                    }
                }
                if (this.v != 7) break;
                graphics.setClip(0, 0, this.eG, this.eH);
                n51 = n7;
                if ((this.w & 2) == 0) {
                    n51 += 5;
                }
                f.g.aa.a(graphics, 1, n6 + this.F, n51, 40);
            }
        }
        graphics.translate(-n4, -n5);
        graphics.setClip(0, 0, this.eG, this.eH);
        if (f.eF.l == this && this.e == 2) {
            if (this.a[0]) {
                g.a(graphics, e.p, 0, f.g.d);
            }
            if (this.a[1]) {
                g.a(graphics, e.q, 1, f.g.d);
            }
        }
    }

    public static final void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6) {
        f.a(graphics, n2, n3, n4, n5, n6, 2370117, 2370117, 0, 0);
    }

    public static final void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        int n11;
        int n12;
        int n13;
        int n14;
        j j2 = f.g.ac;
        graphics.clipRect(n2, n3, n4, n5);
        graphics.setColor(n7);
        graphics.fillRect(n2, n3, n4, n5);
        if (n8 != n7) {
            n14 = n5 / 4;
            n13 = n3 + 5;
            for (n12 = 0; n12 < n14; ++n12) {
                n11 = e.a(n8, n7, n12, n14);
                graphics.setColor(e.a(n11, n7, n9, n10));
                graphics.fillRect(n2, n13, n4, 1);
                ++n13;
            }
        }
        if (n6 != 15) {
            int n15;
            n14 = (n6 & 4) == 0 ? 1 : 0;
            n13 = (n6 & 8) == 0 ? 1 : 0;
            n11 = (n6 & 1) == 0 ? 1 : 0;
            n12 = (n6 & 2) == 0 ? 1 : 0;
            int n16 = n4 / j2.aa - 2;
            if (n4 % j2.aa != 0) {
                ++n16;
            }
            if (n14 == 0) {
                ++n16;
            }
            if (n13 == 0) {
                ++n16;
            }
            int n17 = n5 / j2.ab - 2;
            if (n5 % j2.ab != 0) {
                ++n17;
            }
            if (n11 == 0) {
                ++n17;
            }
            if (n12 == 0) {
                ++n17;
            }
            int n18 = n2;
            if (n14 != 0) {
                n18 += j2.aa;
            }
            int n19 = n3 + n5 - j2.ab;
            for (n15 = 0; n15 < n16; ++n15) {
                if (n11 != 0) {
                    j2.a(graphics, 1, n18, n3, 0);
                }
                if (n12 != 0) {
                    j2.a(graphics, 6, n18, n19, 0);
                }
                n18 += j2.aa;
            }
            n15 = n3;
            if (n11 != 0) {
                n15 += j2.ab;
            }
            int n20 = n2 + n4 - j2.aa;
            for (int i2 = 0; i2 < n17; ++i2) {
                if (n14 != 0) {
                    j2.a(graphics, 3, n2, n15, 0);
                }
                if (n13 != 0) {
                    j2.a(graphics, 4, n20, n15, 0);
                }
                n15 += j2.ab;
            }
            if (n14 != 0 && n11 != 0) {
                j2.a(graphics, 0, n2, n3, 0);
            }
            if (n13 != 0 && n11 != 0) {
                j2.a(graphics, 2, n20, n3, 0);
            }
            if (n14 != 0 && n12 != 0) {
                j2.a(graphics, 5, n2, n19, 0);
            }
            if (n13 != 0 && n12 != 0) {
                j2.a(graphics, 7, n20, n19, 0);
            }
        }
    }

    public static final void b() {
        i.a();
        e.cU = null;
        e.cY = null;
        e.cW = null;
        e.cV = null;
    }
}

