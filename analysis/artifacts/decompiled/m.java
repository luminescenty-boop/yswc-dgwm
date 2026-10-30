/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class m
extends j {
    public static byte a = (byte)20;
    public static byte b;
    public static byte c;
    public static e d;
    public String e;
    public short f;
    public int g;
    public byte[][] h;
    public Vector i;
    public short j;
    public long k;
    public byte l;
    public byte m;
    public short n;
    public short o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public byte v;
    public byte w;
    public short x;
    public short y;
    public short z;
    public boolean A;
    public boolean B;
    public int C;
    public long D;
    public byte E;
    public byte F;
    public int G;
    public m H;
    public byte I;
    public int J;
    public int K;
    public int L;
    byte M;
    Image N;
    i O;
    public static byte[] P;
    public static byte[][] Q;
    public static byte[] R;
    public static byte[] S;
    public static byte[] T;
    public static byte[][][] U;
    public static short[] V;
    public static final short[] W;

    private m(byte by, byte by2, int n2, int n3, boolean bl) {
        super(d.a(by2, by));
        new b();
        this.B = true;
        this.I = 0;
        this.M = by2;
        if (by < 12) {
            if (by != 9) {
                this.O = new i("/action/r" + by + ".sprite", "/action/r" + by + ".png");
                this.O.a(true);
            } else {
                this.O = new i("/action/r" + by + "" + (by2 - 1) + ".sprite", "/action/r" + by + "" + (by2 - 1) + ".png");
                this.O.a(true);
            }
            try {
                this.N = Image.createImage((String)("/pic/icon" + (by2 - 1) + ".png"));
            }
            catch (IOException iOException) {
                IOException iOException2 = iOException;
                iOException.printStackTrace();
            }
        }
        this.l = by;
        this.v = 0;
        this.n = (short)n2;
        this.o = (short)n3;
        this.b(n2 * 40, n3 * 40);
        this.a((byte)0);
        if (bl) {
            m.d.aA.addElement(this);
        }
    }

    public final void a(byte by) {
        this.f = by;
        int n2 = by * 2;
        this.r = Q[this.l][0] + n2;
        this.s = Q[this.l][1] + n2;
        this.t = R[this.l] + n2;
        if (this.l != 9) {
            int n3 = this.f / 2;
            if (n3 > 3) {
                n3 = 3;
            }
            this.e = k.l(139 + this.l * 4 + n3);
        }
    }

    public final void a(int n2) {
        this.A = true;
        this.D = m.d.ao;
        this.C = n2;
    }

    public static final m a(byte by, byte by2, int n2, int n3) {
        return m.a(by, by2, n2, n3, true);
    }

    public static final m a(byte by, byte by2, int n2, int n3, boolean bl) {
        m m2 = new m(by, m.d.aH[by2], n2, n3, bl);
        new m(by, m.d.aH[by2], n2, n3, bl).l = by;
        m2.m = by2;
        m2.u = 100;
        m2.h = U[by];
        m2.K = V[by];
        if (by == 9) {
            m2.b(m.d.aH[by2] - 1);
            m2.J = m.d.aN[by2];
            m.d.aM[by2][m2.J] = m2;
            byte by3 = by2;
            m.d.aN[by3] = m.d.aN[by3] + 1;
        }
        return m2;
    }

    public final void a() {
        m.d.aA.removeElement(this);
    }

    public final void b(int n2) {
        this.I = (byte)n2;
        this.e = k.l(n2 + 93);
    }

    public final int a(m m2) {
        return this.a(m2, (int)this.n, (int)this.o);
    }

    public final int a(m m2, int n2, int n3) {
        int n4 = this.y;
        if (m2 != null) {
            if (this.a((short)64) && m2.a((short)1)) {
                n4 += 15;
            }
            if (this.l == 4 && m2.l == 10) {
                n4 += 15;
            }
        }
        if (this.a((short)2) && d.h(n2, n3) == 5) {
            n4 += 10;
        }
        if (m.d.al[n2][n3] == 34) {
            n4 += 25;
        }
        return n4;
    }

    public final int b(m m2) {
        return this.b(m2, (int)this.n, (int)this.o);
    }

    public final int b(m m2, int n2, int n3) {
        byte by = d.h(n2, n3);
        int n4 = this.z + e.K[by];
        if (this.a((short)2) && by == 5) {
            n4 += 15;
        }
        if (m.d.al[n2][n3] == 34) {
            n4 += 15;
        }
        return n4;
    }

    public final int c(m m2) {
        int n2;
        int n3 = p.a(this.r, this.s) + this.a(m2);
        int n4 = (n3 - (n2 = m2.t + m2.b(this))) * this.u / 100;
        if (n4 < 0) {
            n4 = 0;
        } else if (n4 > m2.u) {
            n4 = m2.u;
        }
        m2.u -= n4;
        this.g += m2.b() * n4;
        return n4;
    }

    public final int b() {
        return this.r + this.s + this.t;
    }

    public final int c() {
        return this.b() * 100 * 2 / 3;
    }

    public final boolean d() {
        int n2;
        if (this.f < 9 && this.g >= (n2 = this.c())) {
            this.g -= n2;
            this.a((byte)(this.f + 1));
            return true;
        }
        return false;
    }

    public final boolean c(m m2, int n2, int n3) {
        return this.v != 4 && this.u > 0 && Math.abs(this.n - n2) + Math.abs(this.o - n3) == 1 && T[this.l] == 1;
    }

    public final void b(byte by) {
        this.w = (byte)(this.w | by);
        this.e();
        if (by == 1) {
            this.F = m.d.aJ;
        }
    }

    public final void c(byte by) {
        this.w = (byte)(this.w & ~by);
        this.e();
    }

    public final void e() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        if ((this.w & 1) != 0) {
            this.y = (short)(this.y - 10);
            this.z = (short)(this.z - 10);
        }
        if ((this.w & 2) != 0) {
            this.y = (short)(this.y + 10);
        }
    }

    public final void a(int n2, int n3) {
        this.n = (short)n2;
        this.o = (short)n3;
        this.Y = (short)(n2 * 40);
        this.Z = (short)(n3 * 40);
    }

    public final int a(int n2, int n3, m m2) {
        return (this.r + this.s + this.t + this.a(m2, n2, n3) + this.b(m2, n2, n3)) * this.u / 100;
    }

    public final void a(byte[][] byArray, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        byte by = T[this.l];
        byte by2 = S[this.l];
        int n7 = n2 - by2;
        if (n7 < 0) {
            n7 = 0;
        }
        if ((n6 = n3 - by2) < 0) {
            n6 = 0;
        }
        if ((n5 = n2 + by2) >= m.d.T) {
            n5 = m.d.T - 1;
        }
        if ((n4 = n3 + by2) >= m.d.U) {
            n4 = m.d.U - 1;
        }
        for (int i2 = n7; i2 <= n5; ++i2) {
            for (int i3 = n6; i3 <= n4; ++i3) {
                int n8 = Math.abs(i2 - n2) + Math.abs(i3 - n3);
                if (n8 < by || n8 > by2 || byArray[i2][i3] > 0) continue;
                byArray[i2][i3] = 127;
            }
        }
    }

    public final void a(byte[][] byArray) {
        if (this.a((short)512)) {
            this.a(byArray, (int)this.n, (int)this.o);
            return;
        }
        this.b(byArray);
        for (int i2 = 0; i2 < m.d.T; ++i2) {
            for (int i3 = 0; i3 < m.d.U; ++i3) {
                if (byArray[i2][i3] <= 0 || byArray[i2][i3] == 127) continue;
                this.a(byArray, i2, i3);
            }
        }
    }

    public final m[] a(int n2, int n3, byte by) {
        return this.a(n2, n3, (int)T[this.l], (int)S[this.l], by);
    }

    public final m[] a(int n2, int n3, int n4, int n5, byte by) {
        int n6;
        int n7;
        int n8;
        Vector<m> vector = new Vector<m>();
        int n9 = n2 - n5;
        if (n9 < 0) {
            n9 = 0;
        }
        if ((n8 = n3 - n5) < 0) {
            n8 = 0;
        }
        if ((n7 = n2 + n5) >= m.d.T) {
            n7 = m.d.T - 1;
        }
        if ((n6 = n3 + n5) >= m.d.U) {
            n6 = m.d.U - 1;
        }
        for (int i2 = n9; i2 <= n7; ++i2) {
            for (int i3 = n8; i3 <= n6; ++i3) {
                m m2;
                int n10 = Math.abs(i2 - n2) + Math.abs(i3 - n3);
                if (n10 < n4 || n10 > n5) continue;
                if (by == 0) {
                    m2 = d.a(i2, i3, (byte)0);
                    if (m2 != null) {
                        if (m.d.aI[m2.m] == m.d.aI[this.m]) continue;
                        vector.addElement(m2);
                        continue;
                    }
                    if (this.l != 7 || d.h(i2, i3) != 8 || m.d.al[i2][i3] < m.d.M || d.d(i2, i3, m.d.aI[this.m])) continue;
                    m m3 = m.a((byte)0, (byte)0, i2, i3, false);
                    m.a((byte)0, (byte)0, i2, i3, false).l = (byte)-1;
                    m3.v = (byte)4;
                    vector.addElement(m3);
                    continue;
                }
                if (by == 1) {
                    m2 = d.a(i2, i3, (byte)1);
                    if (m2 == null) continue;
                    vector.addElement(m2);
                    continue;
                }
                if (by != 2 || (m2 = d.a(i2, i3, (byte)0)) == null || m.d.aI[m2.m] != m.d.aI[this.m]) continue;
                vector.addElement(m2);
            }
        }
        Object[] objectArray = new m[vector.size()];
        vector.copyInto(objectArray);
        return objectArray;
    }

    public final void a(int n2, int n3, boolean bl) {
        this.a(n2, n3, bl, false);
    }

    public final void a(int n2, int n3, boolean bl, boolean bl2) {
        if (bl) {
            this.i = this.a((int)this.n, (int)this.o, n2, n3);
        } else {
            int n4;
            short s;
            int n5;
            short s2;
            if (bl2 && d.a(n2, n3, (byte)0) != null) {
                boolean bl3 = false;
                for (s2 = n2 - 1; s2 <= n2 + 1; ++s2) {
                    for (n5 = n3 - 1; n5 <= n3 + 1; ++n5) {
                        if ((s2 == n2 && n5 == n3 || s2 != n2) && n5 != n3 || d.a((int)s2, n5, (byte)0) != null) continue;
                        n2 = s2;
                        n3 = n5;
                        bl3 = true;
                        break;
                    }
                    if (bl3) break;
                }
            }
            this.i = new Vector();
            short[] sArray = new short[]{this.n, this.o};
            this.i.addElement(sArray);
            s2 = this.n;
            n5 = Math.abs(n2 - this.n);
            if (n5 > 0) {
                s = (n2 - this.n) / n5;
                for (n4 = 0; n4 < n5; ++n4) {
                    s2 = (short)(s2 + s);
                    short[] sArray2 = new short[]{s2, this.o};
                    this.i.addElement(sArray2);
                }
            }
            s = this.o;
            n5 = Math.abs(n3 - this.o);
            if (n5 > 0) {
                n4 = (n3 - this.o) / n5;
                for (int i2 = 0; i2 < n5; ++i2) {
                    s = (short)(s + n4);
                    short[] sArray3 = new short[]{s2, s};
                    this.i.addElement(sArray3);
                }
            }
        }
        this.p = n2;
        this.q = n3;
        this.j = 1;
        this.v = 1;
        this.O.a(1);
    }

    public final Vector a(int n2, int n3, int n4, int n5) {
        int n6;
        Vector vector = null;
        short[] sArray = new short[]{(short)n4, (short)n5};
        if (n2 == n4 && n3 == n5) {
            vector = new Vector();
            vector.addElement(sArray);
            return vector;
        }
        byte by = 0;
        byte by2 = 0;
        byte by3 = 0;
        int n7 = 0;
        if (n5 > 0) {
            by = m.d.aw[n4][n5 - 1];
        }
        if (n5 < m.d.U - 1) {
            by2 = m.d.aw[n4][n5 + 1];
        }
        if (n4 > 0) {
            by3 = m.d.aw[n4 - 1][n5];
        }
        if (n4 < m.d.T - 1) {
            n7 = m.d.aw[n4 + 1][n5];
        }
        if ((n6 = Math.max(Math.max(by, by2), Math.max(by3, n7))) == by) {
            vector = this.a(n2, n3, n4, n5 - 1);
        } else if (n6 == by2) {
            vector = this.a(n2, n3, n4, n5 + 1);
        } else if (n6 == by3) {
            vector = this.a(n2, n3, n4 - 1, n5);
        } else if (n6 == n7) {
            vector = this.a(n2, n3, n4 + 1, n5);
        }
        vector.addElement(sArray);
        return vector;
    }

    public final void b(byte[][] byArray) {
        m.a(byArray, this.n, this.o, P[this.l] + this.x, -1, this.l, this.m, false);
    }

    public static final boolean a(byte[][] byArray, int n2, int n3, int n4, int n5, byte by, byte by2, boolean bl) {
        int n6;
        if (n4 > byArray[n2][n3]) {
            byArray[n2][n3] = (byte)n4;
            if (bl && d.a(n2, n3, (byte)0) == null) {
                return true;
            }
        } else {
            return false;
        }
        if (n5 != 1 && (n6 = n4 - m.a(n2, n3 - 1, by, by2)) >= 0 && m.a(byArray, n2, n3 - 1, n6, 2, by, by2, bl) && bl) {
            return true;
        }
        if (n5 != 2 && (n6 = n4 - m.a(n2, n3 + 1, by, by2)) >= 0 && m.a(byArray, n2, n3 + 1, n6, 1, by, by2, bl) && bl) {
            return true;
        }
        if (n5 != 4 && (n6 = n4 - m.a(n2 - 1, n3, by, by2)) >= 0 && m.a(byArray, n2 - 1, n3, n6, 8, by, by2, bl) && bl) {
            return true;
        }
        return n5 != 8 && (n6 = n4 - m.a(n2 + 1, n3, by, by2)) >= 0 && m.a(byArray, n2 + 1, n3, n6, 4, by, by2, bl) && bl;
    }

    public static final int a(int n2, int n3, byte by, byte by2) {
        if (n2 >= 0 && n3 >= 0 && n2 < m.d.T && n3 < m.d.U) {
            m m2 = d.a(n2, n3, (byte)0);
            if (m2 != null && m.d.aI[m2.m] != m.d.aI[by2]) {
                return 1000;
            }
            byte by3 = d.h(n2, n3);
            if (by == 11) {
                if (by3 == 4) {
                    return 1000;
                }
            } else {
                if (m.a(by, (short)1)) {
                    return 1;
                }
                if (m.a(by, (short)2) && by3 == 5) {
                    return 1;
                }
            }
            return e.L[by3];
        }
        return 10000;
    }

    public final void f() {
        if (this.A) {
            if (m.d.ao - this.D >= (long)this.C) {
                this.A = false;
            } else {
                boolean bl = this.B = !this.B;
            }
        }
        if (this.v == 1) {
            if (this.j >= this.i.size()) {
                this.v = 0;
                this.n = (short)(this.Y / 40);
                this.o = (short)(this.Z / 40);
                this.i = null;
                this.j = 0;
            } else {
                if (this.H != null && this.Y % 40 == 0 && this.Z % 40 == 0) {
                    this.H.a((int)this.n, (int)this.o, false);
                }
                short[] sArray = (short[])this.i.elementAt(this.j);
                int n2 = sArray[0] * 40;
                int n3 = sArray[1] * 40;
                j j2 = null;
                if (this.H == null && ++this.G >= 40 / c / 2) {
                    j2 = d.a(m.d.bV, this.Y, this.Z, 0, 0, 1, p.a(1, 4) * 50);
                    this.G = 0;
                }
                if (n2 < this.Y) {
                    this.Y -= c;
                    if (j2 != null) {
                        j2.b(this.Y + this.aa, this.Z + this.ab - j2.ab);
                    }
                } else if (n2 > this.Y) {
                    this.Y += c;
                    if (j2 != null) {
                        j2.b(this.Y - j2.aa, this.Z + this.ab - j2.ab);
                    }
                } else if (n3 < this.Z) {
                    this.Z -= c;
                    if (j2 != null) {
                        j2.b(this.Y + (this.aa - j2.aa) / 2, this.Z + this.ab);
                    }
                } else if (n3 > this.Z) {
                    this.Z += c;
                    if (j2 != null) {
                        j2.b(this.Y + (this.aa - j2.aa) / 2, this.Z - j2.ab);
                    }
                }
                if (this.Y == n2 && this.Z == n3) {
                    this.n = sArray[0];
                    this.o = sArray[1];
                    this.j = (short)(this.j + 1);
                }
            }
            super.b(this.Y, this.Z);
            this.O.j();
            this.k();
            return;
        }
        if (this.v == 0 && m.d.ao - this.k >= 200L) {
            this.k();
            this.k = m.d.ao;
        }
    }

    public static final boolean a(byte by, short s) {
        return (W[by] & s) != 0;
    }

    public final boolean a(short s) {
        return m.a(this.l, s);
    }

    public final void g() {
        this.v = (byte)2;
        m m2 = d.a((int)this.n, (int)this.o, (byte)1);
        if (m2 != null) {
            m2.a();
        }
        if (this.a((short)256)) {
            m[] mArray = this.a(this.n, (int)this.o, 1, 2, (byte)2);
            for (int i2 = 0; i2 < mArray.length; ++i2) {
                mArray[i2].b((byte)2);
                d.a(m.d.ae, mArray[i2].Y, mArray[i2].Z, 0, 0, 1, 50);
            }
        }
        m.d.eo = this;
    }

    public static final m[] d(byte by) {
        m[] mArray = new m[m.d.aN[by]];
        int n2 = 0;
        for (int i2 = 0; i2 < mArray.length; ++i2) {
            if (m.d.aM[m.d.aJ][i2] == null || m.d.aM[m.d.aJ][i2].v != 3) continue;
            mArray[n2++] = m.d.aM[m.d.aJ][i2];
        }
        m[] mArray2 = new m[m.d.bB + 1 + n2];
        for (int n3 = 0; n3 < mArray2.length; n3 = (int)((byte)(n3 + 1))) {
            mArray2[n3] = n3 < n2 ? mArray[n3] : m.a((byte)(n3 - n2), by, 0, 0, false);
        }
        return mArray2;
    }

    public final void a(Graphics graphics, int n2, int n3) {
        this.a(graphics, n2, n3, false);
    }

    public final void a(Graphics graphics, int n2, int n3, boolean bl) {
        if (this.v != 4) {
            if (this.A) {
                int n4 = this.B ? -2 : 2;
                int n5 = p.b() % 1;
                super.a(graphics, n2 + n4, n3 + n5);
            } else if (bl || this.v == 2) {
                this.O.a(0);
                this.O.a(graphics, this.Y + n2 + 20, this.Z + n3 + 26);
            } else if (this.l < 12) {
                this.O.j();
                this.O.a(graphics, this.Y + n2 + 20, this.Z + n3 + 26);
            } else {
                try {
                    super.a(graphics, n2, n3);
                }
                catch (Exception exception) {
                    System.out.println("\u8fd9\u91cc\u51fa\u95ee\u9898\u4e86 GameUnit 996");
                }
            }
            graphics.drawImage(this.N, this.Y + n2 + 40 - this.N.getWidth(), this.Z + n3 + 40 - this.N.getHeight(), 0);
        }
    }

    public final void b(Graphics graphics, int n2, int n3) {
        int n4 = this.Y + n2;
        int n5 = this.Z + n3;
        if (this.v != 3 && this.u < 100) {
            p.a(graphics, "" + this.u, n4, n5 + this.ab - 7, 0);
        }
    }

    public static final void a(e e2) throws Exception {
        d = e2;
        DataInputStream dataInputStream = new DataInputStream(b.a("/pic/units.bin"));
        for (int i2 = 0; i2 < 12; ++i2) {
            int n2;
            m.P[i2] = dataInputStream.readByte();
            m.Q[i2][0] = dataInputStream.readByte();
            m.Q[i2][1] = dataInputStream.readByte();
            m.R[i2] = dataInputStream.readByte();
            m.S[i2] = dataInputStream.readByte();
            m.T[i2] = dataInputStream.readByte();
            m.V[i2] = dataInputStream.readShort();
            int n3 = dataInputStream.readByte();
            m.U[i2] = new byte[n3][2];
            for (n2 = 0; n2 < n3; ++n2) {
                m.U[i2][n2][0] = dataInputStream.readByte();
                m.U[i2][n2][1] = dataInputStream.readByte();
            }
            n2 = dataInputStream.readByte();
            for (int i3 = 0; i3 < n2; ++i3) {
                int n4 = i2;
                W[n4] = (short)(W[n4] | 1 << dataInputStream.readByte());
            }
        }
        dataInputStream.close();
    }

    static {
        c = b = (byte)10;
        P = new byte[12];
        Q = new byte[12][2];
        R = new byte[12];
        S = new byte[12];
        T = new byte[12];
        U = new byte[12][][];
        V = new short[12];
        W = new short[12];
    }
}

