/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e
extends k
implements Runnable {
    public String a = "1.01\u7248";
    public static byte b = (byte)32;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g = 7;
    public static String[] h = new String[12];
    public static int[] i = new int[]{4, 5, 6, 7, 8, 9, 10, 11};
    public boolean[] j;
    public static final short[] k = new short[]{500, 1000, 2000};
    public static final short[] l = new short[]{10, 20, 25};
    public int m;
    public int n;
    public byte o;
    public static int p = 1024;
    public static int q = 2048;
    public String[] r = new String[]{k.l(66), k.l(70), k.l(71), k.l(4), k.l(9), k.l(8), k.l(60)};
    public String[] s = new String[]{k.l(63), k.l(67), k.l(68), k.l(62), k.l(69), k.l(61), k.l(64)};
    public l[] t = new l[this.s.length];
    public String[] u = new String[]{k.l(1), k.l(2), k.l(5), k.l(3), k.l(6), k.l(8), k.l(7), k.l(9), k.l(10), k.l(11), k.l(4), k.l(7)};
    public l[] v = new l[this.u.length];
    public String[] w = new String[]{k.l(35), k.l(36), k.l(37)};
    public String[] x = new String[]{k.l(29), k.l(30)};
    public byte[] y = new byte[]{0, 5, 7, 8, 11, 9};
    public byte[] z = new byte[]{0, 5, 7, 8, 11, 9};
    public byte[] A = new byte[]{1, 2, 3, 4, 5};
    public static final byte[][] B = new byte[][]{{0, 1}, {2, 3, 4}, {0, 1}, {5}};
    public static final byte[] C = new byte[]{0};
    public long D = 0L;
    public long E;
    public static final int[] F;
    public static final int[] G;
    public static final int[] H;
    public j[][] I;
    public static final byte[] J;
    public static final byte[] K;
    public static final byte[] L;
    public int M;
    public l[] N;
    public byte[] O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public l V;
    public l[] W;
    public j X;
    public j Y;
    public j Z;
    public j aa;
    public j ab;
    public j ac;
    public j ad;
    public j ae;
    public j af;
    public j ag;
    public j ah;
    Image[] ai;
    public int aj;
    public int ak;
    public byte[][] al;
    public byte am;
    public byte an;
    public long ao;
    public int ap;
    public int aq;
    public int ar;
    public m[] as;
    public m at;
    public int au;
    public int av;
    public byte[][] aw;
    public boolean ax = false;
    public boolean ay = false;
    public boolean az = true;
    public Vector aA = new Vector();
    public Vector aB;
    public int aC;
    public int aD;
    public long aE;
    public byte aF = (byte)2;
    public byte[] aG = new byte[5];
    public byte[] aH = new byte[4];
    public byte[] aI = new byte[4];
    public byte aJ = 0;
    public short aK;
    public m[] aL;
    public m[][] aM;
    public int[] aN;
    public int[] aO = new int[4];
    public byte[][] aP = new byte[4][2];
    public byte[] aQ = new byte[4];
    public f aR;
    public Vector aS = new Vector();
    public Vector aT = new Vector();
    public m aU;
    public m aV;
    public long aW;
    public m aX;
    public byte aY;
    public long aZ;
    public int ba;
    public boolean bb = false;
    public boolean bc = false;
    public byte bd;
    public l be;
    public int bf;
    public boolean bg = false;
    public int bh;
    public int bi;
    public int bj;
    public long bk;
    public m bl;
    public m bm;
    public boolean bn = true;
    public long bo;
    public boolean bp = false;
    public long bq;
    public int br;
    public int bs;
    public l[] bt;
    public boolean bu = false;
    public static int[] bv;
    public int bw = -1;
    public f bx;
    public f by;
    public f bz;
    public f bA;
    public int bB = 8;
    public f bC;
    public f bD;
    public f bE;
    public boolean bF = false;
    public int bG;
    public byte[][] bH;
    public byte[][] bI;
    public j bJ;
    public j bK;
    public m bL;
    public j bM;
    public j bN;
    public int bO;
    public int bP;
    public boolean bQ = true;
    public int bR;
    public boolean bS;
    public j bT;
    public j[] bU = new j[0];
    public j bV;
    public f bW;
    public f bX;
    public f bY;
    public f bZ;
    public f[] ca;
    public f[] cb;
    public f cc;
    public f[] cd;
    public j ce;
    public int cf;
    public boolean cg;
    public boolean ch;
    public boolean ci;
    public Vector cj = new Vector(2);
    public j ck;
    public int cl;
    public j[] cm;
    public f cn;
    public f co;
    public f cp;
    public f cq;
    public j cr;
    public j cs;
    public m ct;
    public int cu = 0;
    public boolean cv = true;
    public boolean cw;
    public String cx;
    String[] cy;
    byte[] cz;
    int[] cA;
    public f cB;
    public f cC;
    public f cD;
    public f cE;
    public f cF;
    public f cG;
    public f cH;
    public f cI;
    public f cJ;
    public byte cK;
    public byte[] cL;
    public int cM;
    public String[] cN;
    public int[] cO;
    public boolean cP;
    public boolean cQ;
    public l cR;
    public static final String[] cS;
    StringBuffer cT;
    static i cU;
    static Image cV;
    static Image[] cW;
    int cX;
    static Image[] cY;
    Image[] cZ;
    i da;
    int db;
    int dc;
    int dd;
    int de;
    int df;
    int dg;
    int dh;
    boolean di;
    int dj;
    public m dk;
    public int dl;
    public int dm;
    public boolean dn;
    public int do;
    int dp;
    int dq;
    public int dr;
    public int ds;
    public int dt;
    public int du;
    public l dv;
    public String[] dw;
    public boolean dx;
    public byte dy;
    public int dz;
    public int dA;
    public int dB;
    i dC;
    int dD;
    public int dE;
    public int dF;
    public int dG;
    public int dH;
    public int dI;
    public int dJ;
    public static final byte[] dK;
    public byte dL;
    public int dM;
    public int dN;
    public m dO;
    public m dP;
    public m dQ;
    public int dR;
    public long dS;
    public m[] dT;
    public m[] dU;
    public byte[] dV;
    public int[][] dW;
    public int[] dX;
    public int dY;
    public byte[][] dZ;
    public int ea;
    public int eb;
    public int ec;
    public int ed;
    public int ee;
    public Vector ef;
    public boolean eg;
    public int eh;
    public f ei;
    public m ej;
    public m ek;
    public m el;
    public m em;
    public m en;
    public m eo;
    public int ep;
    public long eq;
    public int er;
    public boolean es;
    public boolean et;
    public int eu;
    public int ev;
    public int ew;
    public long ex;
    public boolean ey;
    public Vector ez;
    public boolean eA;
    public long eB;
    public long eC;
    public boolean eD;
    public a eE;

    public e() {
        String[] stringArray = new String[]{k.l(46), k.l(47)};
        String[] stringArray2 = new String[]{k.l(48), k.l(49)};
        this.cP = true;
        this.cQ = true;
        this.cT = new StringBuffer();
        this.db = 80;
        this.dc = 0;
        this.dd = this.db;
        this.de = p.n - this.db * 2;
        this.df = 0;
        this.dg = 0;
        this.dk = null;
        this.dl = 20;
        this.dm = 1;
        this.dp = 0;
        this.dq = 0xFFFFFF;
        this.dE = 0;
        this.dG = 24;
        this.dH = 8;
        this.dI = this.dH >> 1;
        this.dL = 0;
        this.eg = false;
        this.en = null;
        this.eo = null;
        this.es = false;
        this.et = false;
        this.eu = -1;
        this.ev = -1;
        this.ew = 0;
        this.ez = new Vector();
        this.eA = false;
        this.bd = (byte)4;
    }

    public final void a() throws Exception {
        Object object;
        int n2;
        this.a(0);
        p.i();
        this.a(18);
        p.g();
        for (int i2 = 0; i2 < p.F.length; ++i2) {
            this.a(19 + i2);
        }
        this.a(28);
        f.g = this;
        this.a(29);
        k.y();
        this.a(30);
        p.f();
        this.a(32);
        this.t = new j((String)"action_icons").X;
        this.a(34);
        this.v = new j((String)"menu_icons").X;
        this.a(36);
        this.bM = new j("hud_icons");
        this.a(38);
        this.bN = new j("hud_icons_2");
        this.a(40);
        this.aa = new j("arrow");
        this.a(42);
        this.Z = new j("side_arrow");
        this.a(44);
        this.ab = new j("buttons");
        this.a(46);
        this.ac = new j("menu");
        this.a(48);
        this.bJ = new j("big_circle");
        this.a(50);
        this.bK = new j("small_circle");
        this.a(52);
        this.ah = new j("small_spark");
        this.a(54);
        this.ce = new j("alpha");
        this.a(56);
        try {
            this.cR = new l("gameover");
        }
        catch (Exception exception) {}
        this.a(58);
        this.a(62);
        DataInputStream dataInputStream = new DataInputStream(b.a("/pic/tiles0.prop"));
        int n3 = dataInputStream.readShort();
        dataInputStream.readShort();
        this.O = new byte[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            this.O[i3] = dataInputStream.readByte();
        }
        dataInputStream.close();
        this.a(64);
        j j2 = new j("stiles0");
        this.N = j2.X;
        this.a(70);
        this.bT = new j("mini_icons");
        this.a(72);
        this.M = 37;
        this.c = this.eG;
        this.d = this.eH;
        this.e = this.c >> 1;
        this.f = this.d >> 1;
        this.bf = 0;
        this.z();
        for (n2 = 0; n2 < 12; ++n2) {
            e.h[n2] = k.l(101 + n2);
        }
        e.f();
        this.a(74);
        try {
            this.g = 8;
        }
        catch (Exception exception) {}
        this.a(76);
        this.cN = new String[0];
        this.cO = new int[0];
        p.a("download");
        this.a(84);
        this.cy = new String[3];
        this.cz = new byte[3];
        this.cA = new int[3];
        for (n2 = 0; n2 < 3; ++n2) {
            this.cz[n2] = -1;
            this.cA[n2] = -1;
            object = null;
            try {
                object = p.a("save", n2);
            }
            catch (Exception exception) {}
            if (object == null || ((Object)object).length == 0) {
                this.cy[n2] = "\n" + k.l(79) + "\n ";
                continue;
            }
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])object));
            byte by = dataInputStream.readByte();
            byte by2 = dataInputStream.readByte();
            dataInputStream.readByte();
            dataInputStream.readByte();
            byte by3 = dataInputStream.readByte();
            short s = dataInputStream.readShort();
            dataInputStream.close();
            this.cz[n2] = by3;
            this.cy[n2] = this.a((int)by, (int)by2, (int)s);
            this.cA[n2] = by2;
        }
        this.a(90);
        n2 = 0;
        object = GameMidlet.a.getAppProperty("ProvisionX-Highscore-gameCode");
        if (object != null) {
            ((String)object).trim();
        }
        if ((object = GameMidlet.a.getAppProperty("ProvisionX-Highscore-portalCode")) != null) {
            ((String)object).trim();
        }
        if ((object = GameMidlet.a.getAppProperty("ProvisionX-Highscore-Url")) != null) {
            ((String)object).trim();
        }
        if ((object = GameMidlet.a.getAppProperty("ms-highscoreUpload")) != null) {
            Integer.parseInt(((String)object).trim());
        }
        if ((object = GameMidlet.a.getAppProperty("ms-skPos")) != null) {
            n2 = Integer.parseInt(((String)object).trim());
        }
        if ((object = GameMidlet.a.getAppProperty("MIDlet-Version")) != null) {
            this.a = ((String)object).trim();
        }
        this.a(96);
        if (n2 == 1) {
            p = 2048;
            q = 1024;
        }
        this.a(100);
        this.bd = 0;
    }

    public final void a(int n2) {
        eF.c();
    }

    public final String a(int n2, int n3, int n4) {
        String string = n2 == 0 ? k.l(121 + n3) : this.d(n3);
        String string2 = k.l(32 + n2) + "\n" + string + "\n" + "\u7b2c " + (n4 + 1) + "  \u56de\u5408";
        return string2;
    }

    public final boolean b() {
        return this.bQ && e.eF.l == this;
    }

    public final void c() throws Exception {
        int n2;
        byte by;
        this.be = null;
        f.b();
        System.gc();
        this.d = this.eH - b;
        this.f = this.d >> 1;
        p.h();
        if (this.bd == 1) {
            return;
        }
        this.bd = 1;
        m.a(this);
        p.i();
        this.I = new j[5][12];
        for (by = 0; by < 5; by = (byte)((byte)(by + 1))) {
            for (n2 = 0; n2 < 12; n2 = (int)((byte)(n2 + 1))) {
                this.I[by][n2] = by == 0 ? new j() : new j();
            }
        }
        j j2 = new j("tiles0");
        l[] lArray = j2.X;
        this.M = lArray.length;
        l[] lArray2 = new l[10];
        for (by = 0; by <= 4; by = (byte)(by + 1)) {
            j j3 = new j("buildings", by);
            for (n2 = 0; n2 < 2; n2 = (int)((byte)(n2 + 1))) {
                lArray2[by * 2 + n2] = j3.X[n2];
            }
        }
        this.W = new l[lArray.length + lArray2.length];
        System.arraycopy(lArray, 0, this.W, 0, lArray.length);
        System.arraycopy(lArray2, 0, this.W, this.M, lArray2.length);
        this.ai = new Image[6];
        for (int i2 = 0; i2 < this.ai.length; ++i2) {
            this.ai[i2] = Image.createImage((String)("/pic/head" + i2 + ".png"));
        }
        this.X = new j("cursor");
        this.af = new j("redspark");
        this.ad = new j("smoke");
        this.ae = new j("spark");
        this.ag = new j("status");
        this.cr = new j("arrow_icons");
        this.V = new l("tombstone");
        this.ck = new j("levelup");
        this.cm = new j[2];
        this.cm[0] = new j("king_head_icons");
        this.cm[1] = new j("king_head_icons", 0);
        this.X.a(B[0]);
        this.Y = new j(this.X);
        this.Y.a(B[3]);
        this.bt = new l[2];
        this.bs = J[0];
        this.bt[0] = this.W[J[0]];
        this.bt[1] = this.W[J[1]];
        this.bV = new j("b_smoke");
    }

    public final void a(int n2, int n3) {
        if (this.o == 0 && this.bd == 1 && this.am == 0) {
            boolean bl = false;
            this.cT.append(n3);
            String string = this.cT.toString();
            for (int i2 = 0; i2 < cS.length; ++i2) {
                if (string.equals(cS[i2])) {
                    if (i2 == 0) {
                        if (this.ap == 7) {
                            this.cw = true;
                        } else {
                            this.v();
                        }
                    } else if (i2 == 1) {
                        byte by = this.aJ;
                        this.aO[by] = this.aO[by] + 1000;
                    }
                    this.cP = true;
                    continue;
                }
                if (!cS[i2].startsWith(string)) continue;
                bl = true;
            }
            if (!bl) {
                this.cT = new StringBuffer();
            }
        }
    }

    public final void d() {
        this.cP = true;
        this.cQ = true;
    }

    public final byte[] e() throws Exception {
        int n2;
        this.aP[this.aJ][0] = (byte)this.aj;
        this.aP[this.aJ][1] = (byte)this.ak;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeByte(this.o);
        dataOutputStream.writeByte(this.ap);
        dataOutputStream.writeByte(this.aF);
        dataOutputStream.writeByte(this.aJ);
        dataOutputStream.writeByte(this.aH[this.aJ]);
        dataOutputStream.writeShort(this.aK);
        dataOutputStream.writeByte(this.bB);
        dataOutputStream.writeByte(this.aF);
        for (n2 = 0; n2 < this.aF; ++n2) {
            dataOutputStream.writeByte(this.aI[n2]);
            dataOutputStream.writeByte(this.aQ[n2]);
            dataOutputStream.writeShort(this.aO[n2]);
            dataOutputStream.writeByte(this.aP[n2][0]);
            dataOutputStream.writeByte(this.aP[n2][1]);
        }
        dataOutputStream.writeByte(this.n);
        for (n2 = 0; n2 < this.bH.length; ++n2) {
            dataOutputStream.writeByte(this.al[this.bH[n2][0]][this.bH[n2][1]]);
        }
        dataOutputStream.writeByte(this.aA.size());
        int n3 = this.aA.size();
        for (n2 = 0; n2 < n3; ++n2) {
            m m2 = (m)this.aA.elementAt(n2);
            dataOutputStream.writeByte(m2.l);
            dataOutputStream.writeByte(m2.m);
            dataOutputStream.writeByte(m2.v);
            dataOutputStream.writeByte(m2.w);
            dataOutputStream.writeByte(m2.u);
            dataOutputStream.writeByte(m2.f);
            dataOutputStream.writeShort(m2.g);
            dataOutputStream.writeShort(m2.n);
            dataOutputStream.writeShort(m2.o);
            dataOutputStream.writeByte(m2.E);
            dataOutputStream.writeByte(m2.F);
            if (m2.l != 9) continue;
            dataOutputStream.writeByte(m2.I);
            dataOutputStream.writeShort(m2.K);
            dataOutputStream.writeByte(this.aL[m2.m] == m2 ? 1 : 0);
        }
        dataOutputStream.writeShort((short)this.ep);
        dataOutputStream.writeInt((short)this.eq);
        dataOutputStream.writeInt(this.er);
        dataOutputStream.writeByte(this.es ? 0 : 1);
        byte[] byArray = byteArrayOutputStream.toByteArray();
        dataOutputStream.close();
        return byArray;
    }

    public final void a(byte[] byArray) throws Exception {
        int n2;
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
        this.o = dataInputStream.readByte();
        this.ap = dataInputStream.readByte();
        this.aF = dataInputStream.readByte();
        this.e(this.ap);
        this.aJ = dataInputStream.readByte();
        dataInputStream.readByte();
        this.aK = dataInputStream.readShort();
        this.bB = dataInputStream.readByte();
        this.aF = dataInputStream.readByte();
        for (n2 = 0; n2 < this.aF; ++n2) {
            this.aI[n2] = dataInputStream.readByte();
            this.aQ[n2] = dataInputStream.readByte();
            this.aO[n2] = dataInputStream.readShort();
            this.aP[n2][0] = dataInputStream.readByte();
            this.aP[n2][1] = dataInputStream.readByte();
        }
        this.n = dataInputStream.readByte();
        for (n2 = 0; n2 < this.bH.length; ++n2) {
            this.al[this.bH[n2][0]][this.bH[n2][1]] = dataInputStream.readByte();
        }
        this.aM = new m[this.aF][4];
        this.aN = new int[this.aF];
        this.i();
        n2 = dataInputStream.readByte();
        int n3 = n2;
        for (int i2 = 0; i2 < n3; ++i2) {
            byte by = dataInputStream.readByte();
            byte by2 = dataInputStream.readByte();
            byte by3 = dataInputStream.readByte();
            byte by4 = dataInputStream.readByte();
            byte by5 = dataInputStream.readByte();
            byte by6 = dataInputStream.readByte();
            short s = dataInputStream.readShort();
            short s2 = dataInputStream.readShort();
            short s3 = dataInputStream.readShort();
            byte by7 = dataInputStream.readByte();
            byte by8 = dataInputStream.readByte();
            m m2 = m.a(by, by2, (int)s2, s3);
            m.a(by, by2, (int)s2, s3).v = by3;
            m2.g = s;
            m2.a(by6);
            m2.w = by4;
            m2.e();
            m2.u = by5;
            m2.E = by7;
            m2.F = by8;
            if (by != 9) continue;
            byte by9 = dataInputStream.readByte();
            short s4 = dataInputStream.readShort();
            m2.b((int)by9);
            m2.K = s4;
            byte by10 = dataInputStream.readByte();
            if (by10 != 1) continue;
            this.aL[m2.m] = m2;
        }
        this.ep = dataInputStream.readShort();
        this.eq = dataInputStream.readInt();
        this.er = dataInputStream.readInt();
        this.es = dataInputStream.readByte() != 0;
        dataInputStream.close();
        if (this.ap == 6 && this.ep > 32) {
            this.bA = this.a(k.l(121 + this.ap), k.l(138), this.d, -1);
            this.bA.a((byte)0, true);
            this.bA.a((k)null);
        }
        this.g(this.aP[this.aJ][0], this.aP[this.aJ][1]);
        this.e(this.aP[this.aJ][0], this.aP[this.aJ][1]);
        p.b(G[this.aH[this.aJ]], 0);
    }

    public final void a(int n2, k k2) {
        try {
            p.a("save", n2, this.e());
            this.cy[n2] = this.a((int)this.o, this.ap, (int)this.aK);
            this.cz[n2] = this.aH[this.aJ];
            this.cA[n2] = this.ap;
            this.cE.a(null, this.cy[n2], this.c, -1);
            this.cE.ae = F[this.cz[n2]];
            this.cE.d();
            f f2 = this.a(null, k.l(77), this.d, 1000);
            this.a(null, k.l(77), this.d, 1000).N = k2;
            eF.a(f2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final void f() {
        try {
            byte[] byArray = p.a("settings", 0);
            for (int i2 = 0; i2 < 3; ++i2) {
                p.u[i2] = (byArray[0] & 1 << i2) != 0;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void g() {
        try {
            byte[] byArray = new byte[1];
            for (int i2 = 0; i2 < 3; ++i2) {
                if (!p.u[i2]) continue;
                byArray[0] = (byte)(byArray[0] | 1 << i2);
            }
            p.a("settings", 0, byArray);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void a(m m2) {
        this.cu = 0;
        this.g(m2.n, m2.o);
        this.ct = m2;
    }

    public final void a(m m2, m m3) {
        if (m3.v == 4) {
            this.aV = m3;
            this.a(this.af, this.aV.Y, this.aV.Z, 0, 0, 1, 50);
            this.ba = 6;
            this.at.g();
            this.am = 0;
            this.j();
            this.X.a(B[0]);
            if (this.aQ[this.aJ] == 0) {
                this.dS = this.ao;
                this.dL = (byte)6;
                return;
            }
        } else {
            if (p.u[2] && m3.h.length > 0) {
                this.bg = true;
                this.bh = 0;
                p.h();
            } else {
                this.am = (byte)13;
                this.bj = 0;
                this.X.a(B[0]);
            }
            this.bl = m2;
            this.bm = m3;
        }
    }

    public final void h() {
        this.j();
        if (this.bl.u <= 0) {
            this.aU = this.bl;
        } else if (this.bl.d()) {
            this.cj.addElement(this.bl);
        }
        if (this.bm.u <= 0) {
            this.aU = this.bm;
        } else {
            if (this.bl.a((short)128)) {
                this.a(this.ae, this.bm.Y, this.bm.Z, 0, 0, 1, 50);
                j j2 = j.a(this.ag, 0, 0, -4, -1, 800, (byte)5);
                j2.b(this.bm.Y + (this.bm.aa - j2.aa) / 2, this.bm.Z - j2.ab);
                j2.a(C);
                this.aS.addElement(j2);
                this.bm.b((byte)1);
            }
            if (this.bm.d()) {
                this.cj.addElement(this.bm);
            }
        }
        if (this.aU != null) {
            this.g(this.aU.n, this.aU.o);
            this.a(this.ae, this.aU.Y, this.aU.Z, 0, 0, 1, 50);
            p.c(-1, 1);
        }
        this.aW = this.ao;
        if (this.aQ[this.aJ] == 0) {
            this.dS = this.ao;
            this.dL = (byte)6;
        }
        this.X.a(B[0]);
        this.am = 0;
        this.bl.g();
        this.bm = null;
        this.bl = null;
    }

    public final j a(j j2, int n2, int n3, int n4, int n5, int n6, int n7) {
        j j3 = j.a(j2, n4, n5, 0, n6, n7, (byte)0);
        j3.b(n2, n3);
        this.aT.addElement(j3);
        return j3;
    }

    public final void b(m m2) {
        this.bc = true;
        this.bb = !this.bF;
        this.do = 20;
        this.am = 1;
        this.bp = true;
        this.a(this.aw, 0);
        m2.b(this.aw);
        this.ax = true;
        this.ay = false;
        this.X.a(B[2]);
    }

    public final void a(byte[] byArray, int n2, int n3, k k2) {
        f f2 = new f(0, 0);
        this.bO = n2;
        this.bP = n3;
        this.b(byArray);
        int n4 = byArray.length;
        Vector<String> vector = new Vector<String>(n4);
        Vector vector2 = new Vector(n4);
        for (int i2 = 0; i2 < n4; ++i2) {
            byte by = byArray[i2];
            try {
                vector.addElement(this.u[by]);
                continue;
            }
            catch (Exception exception) {
                System.out.println("\u8fd9\u91cc\u4ed6\u5988\u7684\u51fa\u95ee\u9898\u4e86");
            }
        }
        Object[] objectArray = new String[vector.size()];
        Object[] objectArray2 = new l[vector2.size()];
        System.out.println("menuIcons.length=" + objectArray2.length);
        vector.copyInto(objectArray);
        vector2.copyInto(objectArray2);
        f2.a((String[])objectArray, (l[])objectArray2, cY, this.eI, this.bO, this.bP, 3, (byte)1);
        f2.a(k2);
        eF.a(f2);
    }

    public final void b(byte[] byArray) {
        int n2;
        try {
            cU = new i("/pic/menumain.sprite", "/pic/menumain.png");
            cU.a(2, true);
        }
        catch (Exception exception) {
            System.out.println("it's wrong in PlayStage.java 1639");
        }
        try {
            cV = Image.createImage((String)"/pic/twords.png");
            cW = new Image[4];
            for (n2 = 0; n2 < cW.length; ++n2) {
                e.cW[n2] = Image.createImage((String)("/pic/fire" + n2 + ".png"));
            }
        }
        catch (Exception exception) {
            System.out.println("it's wrong in PlayStage.java 1646");
        }
        try {
            cY = new Image[byArray.length];
            for (n2 = 0; n2 < cY.length; ++n2) {
                try {
                    e.cY[n2] = Image.createImage((String)("/pic/menu" + byArray[n2] + ".png"));
                    System.out.println("/pic/menu" + byArray[n2] + ".png has created!!");
                    continue;
                }
                catch (IOException iOException) {
                    System.out.println("/pic/menu" + byArray[n2] + ".png is not here!!");
                }
            }
            return;
        }
        catch (Exception exception) {
            System.out.println("it's wrong in PlayStage.java 1664");
            return;
        }
    }

    public final void a(byte[] byArray, m m2) {
        this.aR = new f(0, 0);
        int n2 = byArray.length;
        String[] stringArray = new String[n2];
        l[] lArray = new l[n2];
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            stringArray[i2] = this.s[byArray[i2]];
            lArray[i2] = this.t[byArray[i2]];
        }
        if (this.ak * 40 <= this.d / 2 - 40) {
            this.aR.a(stringArray, lArray, 0, this.d - this.ab.ab, 36);
        } else {
            this.aR.a(stringArray, lArray, this.c, 0, 8);
        }
        this.aR.a(this);
        eF.a(this.aR);
    }

    public final f a(String string, l l2) {
        String[] stringArray = new String[3];
        for (int i2 = 0; i2 < 3; ++i2) {
            stringArray[i2] = "\u8bb0\u5f55 " + (i2 + 1) + "/" + 3;
        }
        this.cD = new f(14, 0);
        this.cD.a(stringArray, this.c, -1);
        this.cE = new f(10, 0);
        this.cE.a(null, this.cy[0], this.c, -1);
        if (this.cz[0] != -1) {
            this.cE.ae = F[this.cz[0]];
        }
        f f2 = new f(15, 15);
        int n2 = (this.d - this.cD.m - this.cE.m) / 2;
        f f3 = new f(10, 0);
        f3.a(null, string, this.c, -1);
        f3.ag = l2;
        f2.a(f3, 0, 0, 0);
        f2.a(this.cD, 0, n2 += f3.m / 2, 0);
        f2.a(this.cE, 0, n2 += this.cD.m, 20);
        f2.V = true;
        f2.a((byte)0, true);
        return f2;
    }

    public final int b(int n2) {
        if (n2 >= h.length) {
            return this.cO[n2 - h.length] + h.length;
        }
        return n2;
    }

    public final DataInputStream c(int n2) throws Exception {
        if (n2 >= h.length) {
            int n3 = n2 - h.length;
            return new DataInputStream(new ByteArrayInputStream(p.a("download", n3)));
        }
        return new DataInputStream(b.a("/pic/s" + n2));
    }

    public final String d(int n2) {
        if (n2 >= h.length) {
            int n3 = n2 - h.length;
            for (int i2 = 0; i2 < this.cO.length; ++i2) {
                if (this.cO[i2] != n3) continue;
                return this.cN[i2];
            }
            return null;
        }
        return h[n2];
    }

    public final void a(f f2, int n2, String string, byte by) throws Exception {
        int n3;
        int n4;
        int n5;
        if (f2 == this.aR && by == 1) {
            if (this.am == 3) {
                this.at.a(this.au, this.av);
                this.at.b(this.aw);
                this.b(this.at);
                this.bp = true;
            }
            return;
        }
        if (f2 == this.cF) {
            if (by == 0) {
                this.cJ = this.a(null, "\n\u66f4\u591a\u7cbe\u5f69\u6e38\u620f\n\u5c3d\u5728\u6e38\u620f\u9891\u9053\nwap.xjoys.com", this.d, -1);
                this.cJ.az = true;
                this.cJ.a((byte)0, true);
                this.cJ.a(f2);
                eF.a(this.cJ);
                return;
            }
            this.cF = null;
            return;
        }
        if (f2 == this.cG) {
            if (by == 0) {
                this.w();
                this.bh = 0;
                this.bg = true;
                this.am = (byte)11;
                this.ep = 1;
                e.eF.l = this;
                this.bG = 1;
                this.ch = false;
                return;
            }
            this.cG = null;
            return;
        }
        if (f2 == this.cH) {
            if (by == 0) {
                int n6 = this.cD.p;
                this.a(n6, this.cC);
            }
            this.cH = null;
            return;
        }
        if (f2 == this.cI) {
            if (by == 0) {
                g g2 = new g(GameMidlet.a);
                g2.a();
                return;
            }
            this.cF = null;
            return;
        }
        if (f2 == this.cJ) {
            if (by == 0) {
                g g3 = new g(GameMidlet.a);
                g3.a();
            } else {
                this.cF = null;
            }
            if (GameMidlet.a != null) {
                GameMidlet.a.notifyDestroyed();
                GameMidlet.a.destroyApp(true);
            }
            return;
        }
        if (f2 == this.cp) {
            if (by == 2 || by == 3) {
                this.cq.a(null, k.l(184 + this.cp.z[n2].l), this.c, this.d - this.co.m - this.cp.m);
                this.co.L = this.cp.z[n2];
                this.cq.d();
                this.co.d();
            }
            return;
        }
        if (f2 == this.cn) {
            if (by == 0) {
                m m2 = this.cp.z[this.cp.p];
                if (this.b(m2, this.aj, this.ak)) {
                    this.at = this.a(m2, this.aj, this.ak);
                    this.bF = true;
                    this.b(this.at);
                    eF.a(this);
                } else {
                    return;
                }
            }
            this.cn = null;
            this.cp = null;
            this.cq = null;
            this.co = null;
            return;
        }
        if (f2 == this.by) {
            if (by == 2 || by == 3) {
                String string2 = n2 == 0 ? k.l(15) : k.a(196 + n2 - 1, true);
                this.bz.a(null, string2, this.c, this.bz.m);
                this.bz.d();
            }
            return;
        }
        if (f2 == this.bx) {
            this.bx = null;
            this.by = null;
            this.bz = null;
            return;
        }
        if (f2 == this.bA) {
            if (by == 0) {
                eF.a(this);
            }
            return;
        }
        if (f2 == this.bW) {
            if (by == 0) {
                int n7;
                int n8;
                this.bX = new f(15, 15);
                f f3 = new f(10, 0);
                new f(10, 0).ag = this.v[4];
                f3.a(null, k.l(34), this.c, -1);
                this.bX.a(f3, 0, 0, 20);
                String[] stringArray = new String[this.cK];
                for (n8 = 0; n8 < this.cK; ++n8) {
                    stringArray[n8] = k.a(38, "" + (n8 + 1));
                }
                n8 = f3.m;
                f[] fArray = new f[this.cK];
                this.ca = new f[this.cK];
                this.cb = new f[this.cK];
                for (int i2 = 0; i2 < this.cK; ++i2) {
                    this.ca[i2] = new f(14, 6);
                    this.ca[i2].a(this.w, this.eI, -1);
                    this.cb[i2] = new f(14, 5);
                    this.cb[i2].a(stringArray, this.eI, -1);
                    this.cb[i2].p = i2;
                    int n9 = Math.max(this.ca[i2].l, this.cb[i2].l);
                    n7 = this.eG - n9;
                    this.ca[i2].l = n9;
                    this.cb[i2].l = n9;
                    this.bX.a(this.ca[i2], n7, n8, 20);
                    this.bX.a(this.cb[i2], n7, n8 += this.ca[i2].m, 20);
                    fArray[i2] = new f(10, 8);
                    fArray[i2].a(null, k.l(this.cL[i2] - 1 + 89), n7, this.ca[i2].m + this.cb[i2].m);
                    fArray[i2].ae = F[this.cL[i2]];
                    this.bX.a(fArray[i2], 0, n8 += this.cb[i2].m, 36);
                }
                this.bX.T = 1;
                f f4 = new f(10, 8);
                f4.a(null, k.l(40), this.e, -1);
                this.bX.a(f4, 0, n8, 20);
                this.bY = new f(14, 4);
                String[] stringArray2 = new String[k.length];
                for (n7 = 0; n7 < stringArray2.length; ++n7) {
                    stringArray2[n7] = "" + k[n7];
                }
                this.bY.a(stringArray2, this.e, f4.m);
                this.bX.a(this.bY, this.eI, n8, 20);
                f f5 = new f(10, 8);
                f5.a(null, k.l(41), this.e, -1);
                this.bX.a(f5, 0, n8 += f4.m, 20);
                this.bZ = new f(14, 4);
                String[] stringArray3 = new String[l.length];
                for (int i3 = 0; i3 < stringArray3.length; ++i3) {
                    stringArray3[i3] = "" + l[i3];
                }
                this.bZ.a(stringArray3, this.e, f5.m);
                this.bX.a(this.bZ, this.eI, n8, 20);
                this.bX.a(f2);
                this.bX.a((byte)0, true);
                eF.a(this.bX);
                return;
            }
            this.bW = null;
            return;
        }
        if (f2 == this.bX) {
            if (by == 0) {
                int n10;
                int n11 = 0;
                int n12 = 0;
                boolean[] blArray = new boolean[this.cK];
                for (n10 = 0; n10 < this.cK; ++n10) {
                    if (this.ca[n10].p == 2) {
                        this.aQ[n10] = 2;
                        continue;
                    }
                    ++n11;
                    if (this.ca[n10].p == 0) {
                        this.aQ[n10] = 1;
                    } else if (this.ca[n10].p == 1) {
                        this.aQ[n10] = 0;
                    }
                    this.aI[n10] = (byte)this.cb[n10].p;
                    if (blArray[this.aI[n10]]) continue;
                    ++n12;
                    blArray[this.aI[n10]] = true;
                }
                if (n11 < 2 || n12 < 2) {
                    f f6 = this.a(null, k.l(39), this.d, 2000);
                    f6.a(this.bX);
                    eF.a(f6);
                    return;
                }
                this.bX = null;
                this.bW = null;
                eF.a(this);
                this.m = k[this.bY.p];
                this.n = l[this.bZ.p];
                this.ca = null;
                this.bY = null;
                this.bZ = null;
                this.o = 1;
                this.bB = 8;
                this.bu = true;
                for (n10 = 0; n10 < 6; ++n10) {
                    eF.c();
                }
                this.c();
                for (n10 = 0; n10 < 6; ++n10) {
                    eF.c();
                }
                this.e(this.aq);
                for (n10 = 0; n10 < 6; ++n10) {
                    eF.c();
                }
                this.ap = this.aq;
                for (n10 = 0; n10 < 6; ++n10) {
                    eF.c();
                }
                this.bu = false;
                this.am = 0;
            }
            return;
        }
        if (f2 == this.bD) {
            n5 = this.bC.p;
            if (!(by != 0 || n5 < h.length && this.j[n5])) {
                int n13;
                this.aq = this.b(n5);
                DataInputStream dataInputStream = this.c(this.aq);
                n4 = dataInputStream.readInt();
                n3 = dataInputStream.readInt();
                byte[][] byArray = new byte[n4][n3];
                this.cL = new byte[4];
                byte[] byArray2 = new byte[5];
                for (n13 = 0; n13 < 5; ++n13) {
                    byArray2[n13] = -1;
                }
                this.cK = 0;
                for (n13 = 0; n13 < n4; ++n13) {
                    for (int i4 = 0; i4 < n3; ++i4) {
                        int n14;
                        byArray[n13][i4] = dataInputStream.readByte();
                        if (this.O[byArray[n13][i4]] != 9 || (n14 = this.a(n13, i4, byArray)) == 0 || byArray2[n14] != -1) continue;
                        this.cL[this.cK] = (byte)n14;
                        byArray2[n14] = this.cK;
                        this.cK = (byte)(this.cK + 1);
                    }
                }
                dataInputStream.close();
                this.cx = this.bC.h[n5];
                this.bW = new f(15, 15);
                f f7 = new f(10, 0);
                new f(10, 0).ag = this.v[4];
                f7.a(null, this.cx, this.c, -1);
                f f8 = new f(8, 0);
                f8.a(this.eG, this.d - f7.m - this.ab.ab, byArray, null);
                this.bW.a(f8, this.e, this.f + (f7.m - this.ab.ab) / 2, 3);
                this.bW.a(f7, 0, 0, 0);
                this.bW.a(f2);
                this.bW.a((byte)0, true);
                this.bW.V = true;
                eF.a(this.bW);
            }
        } else if (f2 == this.cc) {
            if (by == 1) {
                boolean bl = p.u[0];
                boolean bl2 = false;
                for (int i5 = 0; i5 < 3; ++i5) {
                    boolean bl3 = this.cd[i5].p == 0;
                    if (bl3 == p.u[i5]) continue;
                    p.u[i5] = bl3;
                    bl2 = true;
                }
                if (bl2) {
                    this.g();
                    if (bl != p.u[0]) {
                        if (!p.u[0]) {
                            p.h();
                            return;
                        }
                        if (this.bd == 1) {
                            if (this.am != 11 && this.am != 14) {
                                p.c(G[this.aH[this.aJ]], 0);
                                return;
                            }
                        } else if (this.bd == 0) {
                            p.c(0, 0);
                            return;
                        }
                    }
                } else {
                    this.cc = null;
                    this.cd = null;
                }
            }
            return;
        }
        if (f2 == this.cC) {
            if (by == 0) {
                n5 = this.cD.p;
                if (this.cz[n5] == -1) {
                    this.a(n5, f2);
                } else {
                    this.cH = this.a(null, k.l(88), this.d, -1);
                    this.cH.a((byte)0, true);
                    this.cH.a(f2);
                    eF.a(this.cH);
                }
            } else {
                this.cC = null;
                this.cD = null;
                this.cE = null;
            }
        } else if (f2 == this.cB) {
            if (by == 0) {
                byte[] byArray = null;
                try {
                    byArray = p.a("save", this.cD.p);
                }
                catch (Exception exception) {}
                if (byArray != null) {
                    int n15;
                    this.cB = null;
                    this.cD = null;
                    this.cE = null;
                    eF.a(this);
                    this.bu = true;
                    eF.c();
                    for (n15 = 0; n15 < 6; ++n15) {
                        eF.c();
                    }
                    this.c();
                    for (n15 = 0; n15 < 6; ++n15) {
                        eF.c();
                    }
                    this.a(byArray);
                    for (n15 = 0; n15 < 6; ++n15) {
                        eF.c();
                    }
                    if (this.o == 0) {
                        this.bQ = true;
                    }
                    for (n15 = 0; n15 < 6; ++n15) {
                        eF.c();
                    }
                    this.bu = false;
                    this.am = 0;
                }
            } else {
                this.cB = null;
                this.cD = null;
                this.cE = null;
            }
        } else if (f2 == this.cD) {
            if (by == 2 || by == 3) {
                this.cE.a(null, this.cy[n2], this.c, -1);
                this.cE.ae = this.cz[n2] == -1 ? 2370117 : F[this.cz[n2]];
                this.cE.d();
            }
            return;
        }
        if (f2.v == 7) {
            eF.a(this);
            return;
        }
        if (string == null || by != 0) {
            return;
        }
        if (string.equals(this.u[0])) {
            this.a(f2);
            return;
        }
        if (string.equals(this.u[1]) || f2 == this.bE) {
            int n16;
            eF.a(this);
            if (f2 == this.bE) {
                this.ap = n2;
                this.bE = null;
            } else {
                this.ap = 0;
            }
            this.o = 0;
            this.aQ[1] = 0;
            this.bu = true;
            eF.c();
            for (n16 = 0; n16 < 6; ++n16) {
                eF.c();
            }
            System.gc();
            for (n16 = 0; n16 < 6; ++n16) {
                eF.c();
            }
            this.c();
            for (n16 = 0; n16 < 6; ++n16) {
                eF.c();
            }
            this.e(this.ap);
            for (n16 = 0; n16 < 6; ++n16) {
                eF.c();
            }
            this.bu = false;
            this.s();
            this.am = 0;
            return;
        }
        if (string.equals(k.l(3))) {
            this.bE = new f(11, 0);
            int n17 = this.g;
            if (n17 > 7) {
                n17 = 7;
            }
            String[] stringArray = new String[++n17];
            for (n4 = 0; n4 < n17; ++n4) {
                stringArray[n4] = n4 + 1 + ". " + k.l(121 + n4);
            }
            f f9 = this.bE.a(string);
            this.bE.a(string).ag = this.v[3];
            this.bE.a(stringArray, this.eG / 2, (this.d + f9.m) / 2, this.c, this.d - f9.m, 3, 4);
            this.bE.a(f2);
            eF.a(this.bE);
            return;
        }
        if (string.equals(k.l(4))) {
            this.cC = this.a(string, this.v[10]);
            this.cC.a(f2);
            eF.a(this.cC);
            return;
        }
        if (string.equals(k.l(5))) {
            this.cB = this.a(string, this.v[2]);
            this.cB.a(f2);
            eF.a(this.cB);
            return;
        }
        if (string.equals(k.l(6))) {
            this.bD = new f(15, 15);
            f f10 = new f(10, 0);
            f10.a(null, string, this.c, -1);
            f10.ag = this.v[4];
            this.j = new boolean[12];
            for (int i6 = this.g; i6 <= 7; ++i6) {
                this.j[e.i[i6]] = true;
            }
            String[] stringArray = new String[12];
            for (n3 = 0; n3 < 12; ++n3) {
                stringArray[n3] = this.j[n3] ? k.l(42) : h[n3];
            }
            String[] stringArray4 = new String[12 + this.cM];
            System.arraycopy(stringArray, 0, stringArray4, 0, 12);
            System.arraycopy(this.cN, 0, stringArray4, 12, this.cM);
            this.bC = new f(0, 0);
            this.bC.a(stringArray4, 0, 0, this.c, this.d - f10.m - this.ab.ab * 2, 3, 4);
            this.bD.a(this.bC, this.e, (this.d + f10.m) / 2, 3);
            this.bD.a(f10, 0, 0, 0);
            this.bD.V = true;
            this.bD.a((byte)0, true);
            this.bD.a(f2);
            eF.a(this.bD);
            return;
        }
        if (string.equals(k.l(7))) {
            g g4 = new g(GameMidlet.a);
            g4.a();
            if (GameMidlet.a != null) {
                GameMidlet.a.notifyDestroyed();
                GameMidlet.a.destroyApp(true);
            }
            return;
        }
        if (string.equals(k.l(8))) {
            this.cc = new f(15, 15);
            f f11 = new f(10, 0);
            new f(10, 0).ag = this.v[5];
            f11.a(null, string, this.c, -1);
            this.cc.a(f11, 0, 0, 20);
            int n18 = f11.m;
            f[] fArray = new f[3];
            this.cd = new f[3];
            for (n3 = 0; n3 < 3; ++n3) {
                int n19 = 8;
                if (n3 != 0) {
                    n19 = 9;
                }
                if (n3 != 2) {
                    n19 |= 2;
                }
                fArray[n3] = new f(10, n19);
                fArray[n3].a(null, p.v[n3], this.e, -1);
                this.cc.a(fArray[n3], 0, n18, 20);
                n19 = 4;
                if (n3 != 0) {
                    n19 = 5;
                }
                if (n3 != 2) {
                    n19 |= 2;
                }
                this.cd[n3] = new f(14, n19);
                this.cd[n3].a(this.x, this.e, fArray[n3].m);
                this.cd[n3].p = p.u[n3] ? 0 : 1;
                this.cc.a(this.cd[n3], this.eI, n18, 20);
                n18 += fArray[n3].m;
            }
            this.cc.T = 2;
            this.cc.a(f2);
            eF.a(this.cc);
            return;
        }
        if (string.equals(k.l(9))) {
            this.bx = new f(15, 15);
            f f12 = new f(10, 0);
            f12.a(null, string, this.c, -1);
            f12.ag = this.v[7];
            String[] stringArray = new String[20];
            for (n4 = 0; n4 <= 19; ++n4) {
                stringArray[n4] = n4 > 0 ? k.l(bv[n4 - 1]) + " " + n4 + "/" + 19 : k.l(85) + " " + n4 + "/" + 19;
            }
            this.by = new f(14, 2);
            this.by.a(stringArray, this.c, -1);
            this.bz = new f(10, 1);
            this.bz.a(null, k.l(15), this.c, this.d - f12.m - this.by.m - this.ab.ab * 2);
            n4 = f12.m + this.ab.ab;
            this.bx.a(this.by, this.e, n4, 17);
            this.bx.a(this.bz, this.e, n4 += this.by.m, 17);
            this.bx.a(f12, 0, 0, 0);
            this.bx.a(f2);
            this.bx.V = true;
            eF.a(this.bx);
            return;
        }
        if (string.equals(k.l(10))) {
            f f13 = new f(15, 15);
            f f14 = new f(10, 0);
            f14.a(null, string, this.c, -1);
            f14.ag = this.v[8];
            f f15 = new f(10, 0);
            String string3 = k.a(16, this.a);
            if (this.a != null) {
                string3 = string3 + "\n\u4e07\u8054\u56fd\u901a\n\u516c\u53f8\u7535\u8bdd\uff1a\n010-84681373\n\u90ae\u7bb1\uff1a\ne1257@163.com";
            }
            f15.a(null, string3, this.c, this.d - f14.m - this.ab.ab * 2);
            f13.a(f15, 0, (this.d + f14.m) / 2, 6);
            f13.a(f14, 0, 0, 0);
            f13.a(f2);
            f13.V = true;
            eF.a(f13);
            return;
        }
        if (string.equals(k.l(11))) {
            this.cF = this.a(null, k.l(86), this.d, -1);
            this.cF.a((byte)0, true);
            this.cF.a(f2);
            eF.a(this.cF);
            return;
        }
        if (string.equals(k.l(60))) {
            this.cG = this.a(null, k.l(87), this.d, -1);
            this.cG.a((byte)0, true);
            this.cG.a(f2);
            eF.a(this.cG);
            return;
        }
        if (string.equals(k.l(61))) {
            this.bF = false;
            this.b(this.at);
            eF.a(this);
            return;
        }
        if (string.equals(k.l(62))) {
            this.a(this.aw, 0);
            this.an = this.am;
            this.am = (byte)6;
            this.bp = true;
            this.as = this.at.a((int)this.at.n, (int)this.at.o, (byte)0);
            this.ar = 0;
            this.ax = true;
            this.ay = true;
            this.at.a(this.aw, (int)this.at.n, (int)this.at.o);
            this.X.a(B[1]);
            this.g(this.as[this.ar].n, this.as[this.ar].o);
            this.bb = true;
            this.bc = true;
            eF.a(this);
            return;
        }
        if (string.equals(k.l(63))) {
            this.cn = new f(15, 15);
            this.cn.al = this.d;
            boolean bl = false;
            this.co = new f(2, 2);
            this.cp = new f(3, 1);
            this.cq = new f(10, 3);
            this.cq.U = true;
            this.co.L = this.cp.z[0];
            this.cq.a(null, k.l(184 + this.cp.z[0].l), this.c, this.d - this.co.m - this.cp.m);
            this.cn.a(this.co, 0, 0, 0);
            this.cn.a(this.cq, 0, this.co.m, 0);
            this.cn.a(this.cp, 0, this.d, 32);
            this.cn.V = true;
            this.cn.a(this);
            this.cn.a((byte)0, true);
            eF.a(this.cn);
            return;
        }
        if (string.equals(k.l(64))) {
            this.at.g();
            this.j();
            this.bL = this.a(this.aj, this.ak, (byte)0);
            this.am = 0;
            eF.a(this);
            return;
        }
        if (string.equals(k.l(66))) {
            this.o();
            eF.a(this);
            return;
        }
        if (string.equals(k.l(68))) {
            this.b((byte)this.M, (int)this.at.n, (int)this.at.o);
            eF.a(this.a(null, k.l(74), this.d, 1000));
            p.c(-1, 1);
            this.at.g();
            this.am = 0;
            return;
        }
        if (string.equals(k.l(67))) {
            if (this.b((int)this.at.n, (int)this.at.o, this.at)) {
                this.c((int)this.at.n, (int)this.at.o, (int)this.aH[this.at.m]);
                eF.a(this.a(null, k.l(73), this.d, 1000));
                this.am = (byte)9;
                p.c(-1, 1);
                this.aE = this.ao;
            }
            this.at.g();
            return;
        }
        if (string.equals(k.l(69))) {
            this.am = (byte)7;
            this.as = this.at.a((int)this.at.n, (int)this.at.o, (byte)1);
            this.ax = true;
            this.ay = true;
            this.at.a(this.aw, (int)this.at.n, (int)this.at.o);
            this.bb = true;
            eF.a(this);
            return;
        }
        if (string.equals(k.l(70))) {
            f f16 = new f(15, 15);
            f f17 = new f(10, 0);
            f17.a(null, this.cx, this.c, -1);
            f f18 = new f(8, 0);
            f18.a(this.c, this.d - f17.m - this.ab.ab, this.al, this.aA);
            f16.a(f18, this.e, this.f + (f17.m - this.ab.ab) / 2, 3);
            f16.a(f17, 0, 0, 0);
            f16.a(f2);
            f16.V = true;
            eF.a(f16);
            return;
        }
        if (string.equals(k.l(71))) {
            this.bA.a((byte)0, false);
            this.bA.a(f2);
            eF.a(this.bA);
        }
    }

    public final m a(m m2, int n2, int n3) {
        byte by = this.aJ;
        this.aO[by] = this.aO[by] - m2.K;
        m2.u = 100;
        m2.a(n2, n3);
        if (!this.aA.contains(m2)) {
            this.aA.addElement(m2);
        }
        this.cP = true;
        return m2;
    }

    public final m a(byte by, int n2, int n3) {
        byte by2 = this.aJ;
        this.aO[by2] = this.aO[by2] - m.V[by];
        this.cP = true;
        return m.a(by, this.aJ, n2, n3);
    }

    public final j a(byte by, byte by2) {
        return this.I[by][by2];
    }

    public final void i() {
        this.aA = new Vector();
        this.at = null;
        this.as = null;
        this.dk = null;
    }

    public final void e(int n2) throws Exception {
        int n3;
        DataInputStream dataInputStream;
        int n4;
        p.h();
        this.aS = new Vector();
        this.cg = false;
        this.az = true;
        this.bg = false;
        this.cw = false;
        this.aB = null;
        this.aU = null;
        this.ct = null;
        this.aV = null;
        this.aX = null;
        this.cj.removeAllElements();
        this.aK = 0;
        this.aJ = 0;
        this.aJ = 0;
        this.ep = 0;
        this.i();
        this.aL = null;
        this.al = null;
        this.aw = null;
        this.aF = 0;
        for (n4 = 0; n4 < 5; ++n4) {
            this.aG[n4] = -1;
        }
        this.bp = true;
        p.i();
        if (this.o == 0) {
            this.cx = k.l(113 + n2);
            dataInputStream = new DataInputStream(b.a("/pic/m" + n2));
        } else {
            this.cx = this.d(n2);
            dataInputStream = this.c(n2);
        }
        this.T = dataInputStream.readInt();
        this.U = dataInputStream.readInt();
        this.al = new byte[this.T][this.U];
        this.aw = new byte[this.T][this.U];
        this.dZ = new byte[this.T][this.U];
        this.ea = 0;
        int n5 = 0;
        byte[][] byArray = new byte[30][3];
        byte[][] byArray2 = new byte[30][2];
        for (n4 = 0; n4 < this.T; n4 = (int)((short)(n4 + 1))) {
            for (int n6 = 0; n6 < this.U; n6 = (int)((short)(n6 + 1))) {
                this.al[n4][n6] = dataInputStream.readByte();
                this.aw[n4][n6] = 0;
                if (this.al[n4][n6] < this.M && this.al[n4][n6] != 27) continue;
                n3 = this.i(n4, n6);
                byArray[n5][0] = (byte)n4;
                byArray[n5][1] = (byte)n6;
                byArray[n5][2] = (byte)n3;
                ++n5;
                if (this.h(n4, n6) != 9) continue;
                if (this.o == 1 && n3 != 0 && this.aG[n3] == -1) {
                    this.aH[this.aF] = (byte)n3;
                    this.aG[n3] = this.aF;
                    this.aF = (byte)(this.aF + 1);
                }
                byArray2[this.ea][0] = (byte)n4;
                byArray2[this.ea][1] = (byte)n6;
                ++this.ea;
            }
        }
        this.dX = new int[n5];
        this.bH = new byte[n5][];
        for (n4 = 0; n4 < n5; n4 = (int)((short)(n4 + 1))) {
            this.bH[n4] = byArray[n4];
        }
        this.bI = new byte[this.ea][2];
        System.arraycopy(byArray2, 0, this.bI, 0, this.ea);
        this.P = this.T * 40;
        this.Q = this.U * 40;
        if (this.o == 1) {
            for (n4 = 0; n4 < this.aF; n4 = (int)((short)(n4 + 1))) {
                this.aO[n4] = this.m;
            }
        } else {
            this.aF = (byte)2;
            this.aO[0] = 0;
            this.aO[1] = 0;
            this.aG[1] = 0;
            this.aG[2] = 1;
            this.aH[0] = 1;
            this.aH[1] = 2;
            this.aI[0] = 0;
            this.aI[1] = 1;
            this.aQ[0] = 1;
            this.aQ[1] = 0;
            this.n = 100;
        }
        for (n4 = 0; n4 < this.bH.length; n4 = (int)((short)(n4 + 1))) {
            n3 = this.bH[n4][2];
            if (n3 <= 0 || this.aQ[this.h(n3)] != 2) continue;
            this.c((int)this.bH[n4][0], (int)this.bH[n4][1], 0);
        }
        n3 = dataInputStream.readInt();
        dataInputStream.skip(n3 * 4);
        int n7 = dataInputStream.readInt();
        this.aL = new m[this.aF];
        this.aM = new m[this.aF][4];
        this.aN = new int[this.aF];
        for (n4 = 0; n4 < n7; n4 = (int)((short)(n4 + 1))) {
            byte by = dataInputStream.readByte();
            int n8 = dataInputStream.readShort() / 24;
            int n9 = dataInputStream.readShort() / 24;
            byte by2 = (byte)(by % 12);
            byte by3 = (byte)this.h(1 + by / 12);
            if (this.aQ[by3] == 2) continue;
            m m2 = m.a(by2, by3, n8, n9);
            if (by2 != 9) continue;
            this.aL[by3] = m2;
        }
        dataInputStream.close();
        this.bA = this.o == 0 ? this.a(k.l(121 + this.ap), k.l(129 + this.ap), this.d, -1) : (this.bA = this.a(k.l(71), k.l(137), this.d, -1));
        this.et = false;
        this.en = null;
        this.ej = null;
        this.ek = null;
        this.el = null;
        this.em = null;
        this.eo = null;
        for (n4 = 0; n4 < this.aL.length; n4 = (int)((short)(n4 + 1))) {
            if (this.aL[n4] == null) {
                this.aP[n4][0] = 0;
                this.aP[n4][1] = 0;
                continue;
            }
            this.aP[n4][0] = (byte)this.aL[n4].n;
            this.aP[n4][1] = (byte)this.aL[n4].o;
        }
        if (this.o == 1) {
            this.ep = 100;
            this.bQ = true;
            for (n4 = 0; n4 < this.aF; n4 = (int)((short)(n4 + 1))) {
                if (this.aQ[n4] != 2) {
                    this.aJ = (byte)n4;
                    break;
                }
                this.aK = (short)(this.aK + 1);
            }
        }
        if (this.aL[this.aJ] != null) {
            this.e(this.aL[this.aJ].n, this.aL[this.aJ].o);
            this.g(this.aL[this.aJ].n, this.aL[this.aJ].o);
        }
        this.dU = new m[this.bH.length];
        this.dV = new byte[this.bH.length];
        this.bU = new j[this.bH.length];
        for (n4 = 0; n4 < this.bH.length; n4 = (int)((short)(n4 + 1))) {
            if (this.h(this.bH[n4][0], this.bH[n4][1]) != 8) continue;
            this.bU[n4] = j.a(this.bV, 0, -1, 0, 1, 250, (byte)0);
            this.bU[n4].al = false;
        }
        if (this.aQ[this.aJ] == 0) {
            this.q();
        }
    }

    public final void j() {
        this.ar = 0;
        this.at = null;
        this.as = new m[0];
        this.a(this.aw, 0);
        this.ax = false;
        this.ay = false;
    }

    public final void a(byte[][] byArray, int n2) {
        for (int i2 = 0; i2 < this.T; ++i2) {
            for (int i3 = 0; i3 < this.U; ++i3) {
                byArray[i2][i3] = (byte)n2;
            }
        }
    }

    public final void c(m m2) {
        this.dk = null;
        this.a(this.aw, 0);
        this.ax = false;
        if (this.aQ[this.aJ] == 1) {
            this.dm = 1;
            this.az = true;
            this.X.a(B[0]);
            this.am = (byte)3;
            this.a(this.a(m2, (byte)0), m2);
            p.c(-1, 0);
            return;
        }
        if (this.aQ[this.aJ] == 0) {
            this.dL = (byte)4;
            this.am = 0;
        }
    }

    public final byte[] a(m m2, byte by) {
        Object[] objectArray;
        int n2 = 0;
        byte[] byArray = new byte[this.s.length];
        if (by == 1 && this.h(this.at.n, this.at.o) == 9 && this.e(this.at.n, this.at.o, m2.m)) {
            ++n2;
            byArray[0] = 0;
        }
        if (this.a((int)m2.n, (int)m2.o, m2)) {
            byArray[n2++] = 2;
        } else if (this.b((int)m2.n, (int)m2.o, m2)) {
            byArray[n2++] = 1;
        }
        if ((by == 1 || m2.l != 7) && m2.h.length > 0 && m2.a((int)m2.n, (int)m2.o, (byte)0).length > 0) {
            byArray[n2++] = 3;
        }
        if (m2.a((short)32) && (objectArray = m2.a((int)m2.n, (int)m2.o, (byte)1)).length > 0) {
            byArray[n2++] = 4;
        }
        byArray[n2++] = by == 1 ? 5 : 6;
        objectArray = new byte[n2];
        System.arraycopy(byArray, 0, objectArray, 0, n2);
        return objectArray;
    }

    public final void k() throws Exception {
        switch (this.bf) {
            case 0: {
                ++this.bf;
                return;
            }
            case 1: {
                ++this.bf;
                if (this.bh <= 0) {
                    this.bh = 0;
                    ++this.bf;
                    return;
                }
                --this.bh;
                return;
            }
            case 2: {
                new l("logo");
                this.z();
                ++this.bf;
                return;
            }
            case 3: {
                if (!eF.d(2048)) break;
                ++this.bf;
                return;
            }
            case 4: {
                int n2 = this.cZ[3].getHeight() + 1;
                System.out.println("\u521b\u5efa\u4e3b\u83dc\u5355\u9009\u77ff");
                this.a(this.y, (this.eH + n2) / 2, this.eH - n2, this.be == null ? null : this);
                eF.d();
                this.A();
                ++this.bf;
            }
        }
    }

    private void z() {
        this.cZ = new Image[4];
        for (int i2 = 0; i2 < this.cZ.length; ++i2) {
            try {
                this.cZ[i2] = Image.createImage((String)("/cg/cg" + i2 + ".png"));
                continue;
            }
            catch (IOException iOException) {
                IOException iOException2 = iOException;
                iOException.printStackTrace();
            }
        }
        this.da = new i("/cg/cg.sprite", "/cg/cg.png");
        this.da.a(false);
    }

    private void A() {
        System.out.println("destroy all CG images!");
        this.cZ = null;
        i.a();
        this.da = null;
    }

    private void h(Graphics graphics) {
        ++this.dh;
        if (this.dh > 200) {
            this.dh = 0;
        }
        graphics.setColor(0x404050);
        graphics.fillRect(0, 0, p.m, p.n);
        if (this.dD == 0) {
            this.db -= 3;
            this.dj = 15;
            this.di = true;
            if (this.db < this.dd - (this.db + this.cZ[2].getHeight() + 100)) {
                this.db = this.dd - (this.db + this.cZ[2].getHeight() + 100) + 2;
                ++this.dD;
                this.dh = 0;
            }
        } else if (this.dD == 1) {
            if (this.dh % 3 == 0) {
                this.df = 0;
            } else if (this.dh % 3 == 1) {
                this.df = -3;
            } else if (this.dh % 3 == 2) {
                this.df = 3;
            }
            this.dj = 10;
            this.di = true;
            if (this.dh >= 66) {
                this.df = 0;
                ++this.dD;
                this.dh = 0;
            }
        } else if (this.dD == 2) {
            this.dg -= 3;
            if (this.dj > 1) {
                this.dj -= this.dh / 60;
            }
            if (this.dg < -this.de - 100) {
                this.dg = -this.de - 100;
                ++this.dD;
                this.dh = 0;
            }
        }
        graphics.drawImage(this.cZ[0], this.dc, this.db + this.cZ[2].getHeight() - this.cZ[0].getHeight() - 100, 0);
        if (this.di && this.dD < 2) {
            this.a(graphics, this.dj);
        }
        graphics.drawImage(this.cZ[2], this.dc + this.df + p.m, this.db + this.dg, 24);
        graphics.drawImage(this.cZ[1], this.dc, this.db + this.cZ[2].getHeight() - 100, 0);
        if (this.di && this.dD >= 2) {
            this.a(graphics, this.dj);
        }
        if (this.dD == 3) {
            if (this.da.g() > 2) {
                graphics.drawImage(this.cZ[3], 0, 0, 0);
            }
            this.da.a(graphics, p.m / 2, p.n / 2);
            this.da.j();
            if (this.da.y) {
                ++this.dD;
                this.dh = 0;
            }
        } else if (this.dD == 4) {
            graphics.drawImage(this.cZ[3], 0, 0, 0);
            if (this.dh >= 80) {
                ++this.bf;
            }
        }
        graphics.setColor(0);
        graphics.setClip(0, 0, p.m, this.dd);
        graphics.fillRect(0, 0, p.m, this.dd);
        graphics.setClip(0, this.dd + this.de, p.m, this.dd);
        graphics.fillRect(0, this.dd + this.de, p.m, this.dd);
        graphics.setClip(0, 0, p.m, p.n);
        if (this.dD == 3) {
            if (this.da.g() > 2) {
                graphics.drawImage(this.cZ[3], 0, 0, 0);
            }
            this.da.a(graphics, p.m / 2, p.n / 2);
            this.da.j();
            if (this.da.y && this.dh >= 100) {
                ++this.bf;
            }
        }
        graphics.setColor(Math.abs(new Random().nextInt() % 155), Math.abs(new Random().nextInt() % 255), Math.abs(new Random().nextInt() % 55));
        graphics.drawString("\u6309\u53f3\u8f6f\u952e\u8df3\u8fc7", p.m, p.n, 40);
        if (this.bf >= 4) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, p.m, p.n);
        }
    }

    final void a(Graphics graphics, int n2) {
        if (new Random().nextInt() % n2 == 0) {
            graphics.setColor(0xFFFFFF);
            graphics.fillRect(0, this.dd, p.m, this.de);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l() throws Exception {
        int n2;
        block165: {
            block180: {
                m m2;
                block181: {
                    block179: {
                        block178: {
                            block176: {
                                block177: {
                                    block174: {
                                        block175: {
                                            block171: {
                                                block173: {
                                                    block172: {
                                                        block170: {
                                                            block169: {
                                                                block168: {
                                                                    block167: {
                                                                        this.ao += 50L;
                                                                        if (this.bd == 2) {
                                                                            this.x();
                                                                            return;
                                                                        }
                                                                        if (this.bd == 3) {
                                                                            this.n();
                                                                            return;
                                                                        }
                                                                        if (this.bd == 0) {
                                                                            this.k();
                                                                            return;
                                                                        }
                                                                        this.t();
                                                                        if (this.bw != -1) {
                                                                            if (p.u[1]) {
                                                                                f f2 = this.a(k.a(196 + this.bw, true), (byte)-1, (byte)2);
                                                                                this.a(k.a(196 + this.bw, true), (byte)-1, (byte)2).af = 7831691;
                                                                                f2.ae = 7831691;
                                                                                f2.b = 0xF7F7E7;
                                                                            }
                                                                            this.bw = -1;
                                                                        }
                                                                        if (e.eF.l != this) {
                                                                            return;
                                                                        }
                                                                        if (this.am == 0) {
                                                                            for (n2 = 0; n2 < this.bU.length; ++n2) {
                                                                                int n3 = this.i(this.bH[n2][0], this.bH[n2][1]);
                                                                                if (this.bU[n2] == null || n3 == -1 || n3 == 0 || this.bU[n2].al || p.t.nextInt() % 8 != 0) continue;
                                                                                this.bU[n2].al = true;
                                                                                this.bU[n2].c(0);
                                                                                this.bU[n2].af = 1;
                                                                                this.bU[n2].b((this.bH[n2][0] + 1) * 40 - this.bV.aa, this.bH[n2][1] * 40 - 2);
                                                                                this.aT.addElement(this.bU[n2]);
                                                                            }
                                                                        }
                                                                        if (this.ao - this.bo >= 300L) {
                                                                            this.bn = !this.bn;
                                                                            this.bo = this.ao;
                                                                        }
                                                                        if (this.eA && this.ao - this.eC >= this.eB) {
                                                                            this.eA = false;
                                                                        }
                                                                        if (this.bg) {
                                                                            ++this.bh;
                                                                            if (this.bh > 16) {
                                                                                if (this.am == 10) {
                                                                                    this.ew = 1;
                                                                                } else if (this.am == 11) {
                                                                                    if (this.o == 0) {
                                                                                        this.ci = true;
                                                                                        this.ch = true;
                                                                                        this.cf = 0;
                                                                                    }
                                                                                    this.bG = 0;
                                                                                    this.aE = this.ao;
                                                                                } else {
                                                                                    this.b(this.bl, this.bm);
                                                                                    this.dO = null;
                                                                                    this.j();
                                                                                }
                                                                                this.bg = false;
                                                                            }
                                                                            return;
                                                                        }
                                                                        if (this.ci) {
                                                                            if (this.cg) {
                                                                                if (this.cf < 16) {
                                                                                    ++this.cf;
                                                                                }
                                                                            } else if (this.ch) {
                                                                                ++this.cf;
                                                                                if (this.cf > 16) {
                                                                                    this.ch = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (this.aB != null) {
                                                                            this.aC = (this.aC + 1) % 20;
                                                                        }
                                                                        if (this.ax) {
                                                                            if (this.dF == 0) {
                                                                                ++this.dE;
                                                                                if (this.dE >= 15) {
                                                                                    this.dF = 1;
                                                                                }
                                                                            } else {
                                                                                --this.dE;
                                                                                if (this.dE <= 0) {
                                                                                    this.dF = 0;
                                                                                }
                                                                            }
                                                                            if (this.do > 0) {
                                                                                this.do -= 4;
                                                                                if (this.do < 0) {
                                                                                    this.do = 0;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (this.az && this.ao - this.D >= 200L) {
                                                                            this.X.k();
                                                                            this.D = this.ao;
                                                                        }
                                                                        int n4 = this.aj * 40;
                                                                        int n5 = this.ak * 40;
                                                                        int n6 = this.X.Y;
                                                                        int n7 = this.X.Z;
                                                                        if (n4 > n6) {
                                                                            n6 += 8;
                                                                        } else if (n4 < n6) {
                                                                            n6 -= 8;
                                                                        }
                                                                        if (n5 > n7) {
                                                                            n7 += 8;
                                                                        } else if (n5 < n7) {
                                                                            n7 -= 8;
                                                                        }
                                                                        this.X.b(n6, n7);
                                                                        if (this.bS || this.bR <= 0) break block167;
                                                                        this.bR = this.bR < 2 ? 0 : (this.bR /= 2);
                                                                        this.cP = true;
                                                                        this.cQ = true;
                                                                        break block165;
                                                                    }
                                                                    if (this.am != 8) break block168;
                                                                    if (this.aD == 0) {
                                                                        if (this.bR < b) {
                                                                            if (this.bR == 0) {
                                                                                this.bS = true;
                                                                                this.bR = 1;
                                                                            } else {
                                                                                this.bR *= 2;
                                                                            }
                                                                            this.cP = true;
                                                                            this.cQ = true;
                                                                            break block165;
                                                                        } else {
                                                                            this.aD = 1;
                                                                            this.p();
                                                                            String string = this.aQ[this.aJ] == 1 ? "" + this.dJ : "\u672a\u77e5";
                                                                            f f3 = this.a(k.l(75), k.a(76, string), this.d, 1500);
                                                                            eF.a(f3);
                                                                            f3.ae = F[this.aH[this.aJ]];
                                                                            p.b(G[this.aH[this.aJ]], 0);
                                                                            return;
                                                                        }
                                                                    }
                                                                    for (n2 = this.aA.size() - 1; n2 >= 0; --n2) {
                                                                        m m3 = (m)this.aA.elementAt(n2);
                                                                        if (m3.v == 3 || this.aJ != m3.m || this.h(m3.n, m3.o) != 7 && !this.d(m3.n, m3.o, this.aI[m3.m]) || m3.u >= 100) continue;
                                                                        int n8 = 100 - m3.u;
                                                                        if (n8 > 20) {
                                                                            n8 = 20;
                                                                        }
                                                                        m3.u += n8;
                                                                        j j2 = j.a("+" + n8, 0, -4, (byte)1);
                                                                        j2.b(m3.Y + m3.aa / 2, m3.Z + m3.ab);
                                                                        this.aS.addElement(j2);
                                                                    }
                                                                    this.aD = 0;
                                                                    this.bS = false;
                                                                    this.am = 0;
                                                                    break block165;
                                                                }
                                                                if (this.am != 9) break block169;
                                                                this.am = 0;
                                                                break block165;
                                                            }
                                                            if (this.am != 11) break block170;
                                                            if (!(this.bg || this.bG != 0 || this.o != 1 && this.ao - this.aE < 3000L)) {
                                                                this.d = this.eH;
                                                                this.f = this.eJ;
                                                                this.a(this.y, this.bO, this.bP, null);
                                                                this.bG = 1;
                                                                this.ch = false;
                                                                if (p.u[0]) {
                                                                    p.h();
                                                                    p.c(0, 0);
                                                                }
                                                            }
                                                            break block165;
                                                        }
                                                        if (this.am != 10 && this.am != 14) break block171;
                                                        if (this.ew != 1 && (this.am != 14 || this.ew == 2)) break block172;
                                                        ++this.ap;
                                                        if (this.ap > this.g) {
                                                            String string = h[i[this.g]];
                                                            f f4 = this.a(null, k.a(82, string), this.eH, 3000);
                                                            eF.a(f4);
                                                            this.g = this.ap;
                                                            try {
                                                                byte[] byArray = new byte[]{(byte)this.g};
                                                                p.a("settings", 1, byArray);
                                                            }
                                                            catch (Exception exception) {}
                                                        }
                                                        this.ew = 2;
                                                        break block165;
                                                    }
                                                    if (this.ew != 0) break block173;
                                                    this.bg = true;
                                                    this.bh = 0;
                                                    break block165;
                                                }
                                                if (this.ew == 2) {
                                                    if (this.am == 14) {
                                                        this.d = this.eH;
                                                        this.f = this.eJ;
                                                        this.a(this.y, this.bO, this.bP, null);
                                                        return;
                                                    }
                                                    if (this.ap <= 7) {
                                                        this.e(this.ap);
                                                        this.s();
                                                        this.am = 0;
                                                    }
                                                }
                                                break block165;
                                            }
                                            if (this.am != 13) break block174;
                                            if (this.bj != 0) break block175;
                                            int n9 = this.bl.c(this.bm);
                                            this.bm.a(400);
                                            p.c(-1, 1);
                                            this.a(this.af, this.bm.Y, this.bm.Z, 0, 0, 2, 50);
                                            j j3 = j.a("-" + n9, 0, -4, (byte)1);
                                            int n10 = this.bm.Y + this.bm.aa / 2;
                                            if (n10 + j3.aa / 2 > this.P) {
                                                n10 = this.P - j3.aa / 2;
                                            } else if (n10 - j3.aa / 2 < 0) {
                                                n10 = j3.aa / 2;
                                            }
                                            j3.b(n10, this.bm.Z + this.bm.ab);
                                            this.aS.addElement(j3);
                                            this.bk = this.ao;
                                            ++this.bj;
                                            break block165;
                                        }
                                        if (this.bj == 1) {
                                            if (this.ao - this.bk >= 800L) {
                                                this.g(this.bl.n, this.bl.o);
                                                if (this.bm.c(this.bl, this.bl.n, this.bl.o)) {
                                                    int n11 = this.bm.c(this.bl);
                                                    this.bl.a(400);
                                                    p.c(-1, 1);
                                                    this.a(this.af, this.bl.Y, this.bl.Z, 0, 0, 2, 50);
                                                    j j4 = j.a("-" + n11, 0, -4, (byte)1);
                                                    int n12 = this.bl.Y + this.bl.aa / 2;
                                                    if (n12 + j4.aa / 2 > this.P) {
                                                        n12 = this.P - j4.aa / 2;
                                                    } else if (n12 - j4.aa / 2 < 0) {
                                                        n12 = j4.aa / 2;
                                                    }
                                                    j4.b(n12, this.bl.Z + this.bl.ab);
                                                    this.aS.addElement(j4);
                                                    this.bk = this.ao;
                                                    ++this.bj;
                                                    break block165;
                                                } else {
                                                    this.h();
                                                }
                                            }
                                            break block165;
                                        } else if (this.ao - this.bk >= 800L) {
                                            this.h();
                                        }
                                        break block165;
                                    }
                                    if (this.ct == null) break block176;
                                    if (this.cu != 0) break block177;
                                    if (this.dn) {
                                        this.cs = this.a(this.ae, this.ct.Y, -this.S, 0, 20, -1, 0);
                                        f f5 = this.a(null, k.l(280), this.d, 2000);
                                        f5.a(this.e, 2, 17);
                                        eF.a(f5);
                                        this.cu = 1;
                                    }
                                    break block165;
                                }
                                if (this.cu == 1) {
                                    for (n2 = 0; n2 < 3; ++n2) {
                                        this.a(this.bV, this.cs.Y + p.a(this.cs.aa - this.bV.aa), this.cs.Z, 0, p.a(-3, 0), 1, 50 * p.a(4));
                                    }
                                    if (this.cs.Z >= this.ct.Z) {
                                        this.cs.al = false;
                                        this.k(500);
                                        if (this.cv) {
                                            int n13 = 25 + p.a(25);
                                            if (n13 > this.ct.u) {
                                                n13 = this.ct.u;
                                            }
                                            this.ct.u -= n13;
                                            j j5 = j.a("-" + n13, 0, -4, (byte)1);
                                            j5.b(this.ct.Y + this.ct.aa / 2, this.ct.Z + this.ct.ab);
                                            this.aS.addElement(j5);
                                        }
                                        this.d(this.ct);
                                        this.cu = 2;
                                    }
                                    break block165;
                                } else if (++this.cu >= 20) {
                                    if (this.ct.u <= 0) {
                                        this.aU = this.ct;
                                        this.a(this.ae, this.aU.Y, this.aU.Z, 0, 0, 1, 50);
                                        p.c(-1, 1);
                                        this.aW = this.ao;
                                    }
                                    this.ct = null;
                                }
                                break block165;
                            }
                            if (this.aV == null) break block178;
                            if (--this.ba <= 0) {
                                this.d(this.aV);
                                this.b((byte)27, (int)this.aV.n, (int)this.aV.o);
                                this.aV = null;
                            }
                            break block165;
                        }
                        if (this.aU == null) break block179;
                        if (this.ao - this.aW >= 300L && this.c(this.aU.n, this.aU.o)) {
                            if (this.o == 0 && this.ap == 7 && this.aU == this.aL[1]) {
                                this.cw = true;
                            } else {
                                this.a(this.ad, this.aU.Y, this.aU.Z, 0, -3, 1, 100);
                                this.aU.v = (byte)3;
                                this.aU.E = (byte)3;
                                if (this.aU.l == 10 || this.aU.l == 11) {
                                    this.aU.a();
                                } else if (this.aU.l == 9) {
                                    this.aU.a(-10, -10);
                                    this.aU.w = 0;
                                    this.aU.e();
                                }
                                if (this.aU.l == 9 && this.aU.K < 1000) {
                                    this.aU.K += 200;
                                }
                            }
                            this.aU = null;
                        }
                        break block165;
                    }
                    if (this.cj.size() <= 0) break block180;
                    m2 = (m)this.cj.elementAt(0);
                    if (this.cl != 0) break block181;
                    this.g(m2.n, m2.o);
                    this.cl = 1;
                    break block165;
                }
                if (!this.c(m2.n, m2.o)) break block165;
                this.a(this.ah, m2.Y + p.a(m2.aa), m2.Z + p.a(m2.ab), 0, 0, 1, 50);
                if (this.cl == 1) {
                    p.c(-1, 1);
                }
                if (this.cl <= 5) {
                    int n14 = 200;
                    if (this.cl == 5) {
                        n14 = 1000;
                    }
                    int n15 = m2.Y + (m2.aa - this.ck.aa) / 2;
                    int n16 = m2.Z - this.cl * 4;
                    if (n15 < 0) {
                        n15 = 0;
                    } else if (n15 + this.ck.aa > this.P) {
                        n15 = this.P - this.ck.aa;
                    }
                    if (n16 < 0) {
                        n16 = 0;
                    }
                    this.a(this.ck, n15, n16, 0, 0, 1, n14);
                }
                ++this.cl;
                if (this.cl >= 20) {
                    this.cj.removeElement(m2);
                    this.cl = 0;
                    if (m2.l != 9 && m2.f <= 6 && m2.f % 2 == 0) {
                        eF.a(this.a(null, k.l(80) + "\n" + m2.e, this.c, 2000));
                    }
                }
                break block165;
            }
            if (this.aX != null) {
                if (this.ao - this.aZ >= 400L) {
                    this.aX.a();
                    m m4 = m.a((byte)10, this.aY, (int)this.aX.n, this.aX.o);
                    m4.g();
                    this.aX = null;
                }
            } else if (!this.et) {
                if (this.am == 2) {
                    if (this.at.v != 1 && this.dn) {
                        this.c(this.at);
                    }
                } else if (this.aQ[this.aJ] == 0) {
                    this.r();
                } else if (this.b()) {
                    if (this.bc && eF.d(p)) {
                        eF.f(16);
                        eF.g(p);
                    }
                    if (this.am == 6 || this.am == 7) {
                        if (eF.c(4) || eF.c(1)) {
                            --this.ar;
                            if (this.ar < 0) {
                                this.ar = this.as.length - 1;
                            }
                            eF.g(4);
                            eF.g(1);
                            this.bp = true;
                        } else if (eF.c(8) || eF.c(2)) {
                            ++this.ar;
                            if (this.ar >= this.as.length) {
                                this.ar = 0;
                            }
                            eF.g(8);
                            eF.g(2);
                            this.bp = true;
                        }
                        this.g(this.as[this.ar].n, this.as[this.ar].o);
                        if (this.bp) {
                            this.bL = this.a(this.aj, this.ak, (byte)0);
                            this.cQ = true;
                        }
                        if (eF.c(16)) {
                            if (this.am == 6) {
                                this.a(this.at, this.as[this.ar]);
                            } else if (this.am == 7) {
                                this.b(this.as[this.ar], this.aJ);
                                this.at.g();
                                this.am = 0;
                            }
                            this.aR = null;
                            this.ax = false;
                            this.ay = false;
                            this.bb = false;
                            this.bc = false;
                        }
                        this.bp = false;
                    } else {
                        Object object;
                        Object object2;
                        if (this.ao - this.E >= 150L && this.X.Y % 40 == 0 && this.X.Z % 40 == 0) {
                            if (eF.c(4) || eF.e(4)) {
                                if (this.aj > 0) {
                                    --this.aj;
                                }
                                this.bp = true;
                                this.E = this.ao;
                            } else if (eF.c(8) || eF.e(8)) {
                                if (this.aj < this.T - 1) {
                                    ++this.aj;
                                }
                                this.bp = true;
                                this.E = this.ao;
                            }
                            if (eF.c(1) || eF.e(1)) {
                                if (this.ak > 0) {
                                    --this.ak;
                                }
                                this.bp = true;
                                this.E = this.ao;
                            } else if (eF.c(2) || eF.e(2)) {
                                if (this.ak < this.U - 1) {
                                    ++this.ak;
                                }
                                this.bp = true;
                                this.E = this.ao;
                            }
                            if (this.bp) {
                                if (this.am == 1) {
                                    if (this.aw[this.aj][this.ak] > 0) {
                                        this.aB = this.at.a((int)this.at.n, (int)this.at.o, this.aj, this.ak);
                                    }
                                } else {
                                    this.bL = this.a(this.aj, this.ak, (byte)0);
                                }
                                this.cQ = true;
                            }
                            this.bp = false;
                        }
                        if ((this.am == 1 || this.am == 0) && eF.c(256)) {
                            object2 = this.a(this.aj, this.ak, (byte)0);
                            if (object2 != null) {
                                object = new f(15, 15);
                                new f(15, 15).al = this.d;
                                boolean bl = false;
                                f f6 = new f(5, 2);
                                f f7 = new f(10, 1);
                                new f(10, 1).U = true;
                                String string = k.l(184 + ((m)object2).l);
                                if (((m)object2).w != 0) {
                                    StringBuffer stringBuffer = new StringBuffer(k.l(98));
                                    if ((((m)object2).w & 2) != 0) {
                                        stringBuffer.append('\n');
                                        stringBuffer.append(k.l(100));
                                    }
                                    if ((((m)object2).w & 1) != 0) {
                                        stringBuffer.append('\n');
                                        stringBuffer.append(k.l(99));
                                    }
                                    stringBuffer.append("\n-----------\n");
                                    string = stringBuffer.toString() + string;
                                }
                                f7.a(null, string, this.c, this.d - f6.m);
                                ((f)object).a(f6, 0, 0, 0);
                                ((f)object).a(f7, 0, f6.m, 0);
                                ((f)object).V = true;
                                ((f)object).a(this);
                                eF.a((k)object);
                            }
                            eF.g(256);
                        }
                        if (this.am == 1) {
                            if (eF.c(16) && this.at != null) {
                                object2 = this.a(this.aj, this.ak, (byte)0);
                                if (this.aw[this.aj][this.ak] > 0 && (object2 == null || object2 == this.at)) {
                                    this.au = this.at.n;
                                    this.av = this.at.o;
                                    this.at.a(this.aj, this.ak, true);
                                    this.dk = this.at;
                                    this.az = false;
                                    this.ax = false;
                                    this.aB = null;
                                    this.aR = null;
                                    this.bb = false;
                                    this.bc = false;
                                    this.am = (byte)2;
                                    p.c(-1, 1);
                                }
                                eF.g(16);
                            }
                        } else if (this.am == 0) {
                            if (eF.c(512)) {
                                int n17 = 0;
                                object = this.aL[this.aJ];
                                if (this.bL != null && this.bL.l == 9) {
                                    object = this.aM[this.aJ][(this.bL.J + 1) % this.aN[this.aJ]];
                                }
                                while (++n17 < this.aN[this.aJ] && ((m)object).v == 3) {
                                    object = this.aM[this.aJ][(((m)object).J + 1) % this.aN[this.aJ]];
                                }
                                if (object != null && ((m)object).v != 3) {
                                    this.g(((m)object).n, ((m)object).o);
                                    this.d(((m)object).Y + 20, ((m)object).Z + 20);
                                }
                            } else if (eF.c(32)) {
                                if (this.ay) {
                                    this.a(this.aw, 0);
                                    this.ax = false;
                                    this.ay = false;
                                } else {
                                    this.at = this.a(this.aj, this.ak, (byte)0);
                                    if (this.at != null) {
                                        this.a(this.aw, 0);
                                        this.at.a(this.aw);
                                        this.ay = true;
                                        this.ax = true;
                                        this.do = 20;
                                    }
                                }
                                eF.g(32);
                            } else if (eF.c(16) || eF.c(p)) {
                                this.at = this.a(this.aj, this.ak, (byte)0);
                                if (this.at != null && this.at.v == 0 && this.at.m == this.aJ) {
                                    byte[] byArray = this.a(this.at, (byte)1);
                                    object2 = byArray;
                                    if (byArray.length > 1) {
                                        this.a((byte[])object2, this.at);
                                        p.c(-1, 0);
                                    } else {
                                        this.bF = false;
                                        this.b(this.at);
                                    }
                                } else if (this.h(this.aj, this.ak) == 9 && this.e(this.aj, this.ak, this.aJ)) {
                                    object2 = new byte[]{0};
                                    this.a((byte[])object2, null);
                                    p.c(-1, 0);
                                } else {
                                    this.at = null;
                                    this.aR = new f(11, 0);
                                    this.aR.a(this.r, 2, 2, -1, this.d, 20, 0);
                                    this.aR.a(this);
                                    eF.a(this.aR);
                                    p.c(-1, 0);
                                }
                                eF.d();
                            }
                        }
                    }
                }
            }
        }
        int n18 = this.aA.size();
        for (n2 = 0; n2 < n18; ++n2) {
            ((m)this.aA.elementAt(n2)).f();
        }
        if (this.ao - this.bq >= 300L) {
            this.br = (this.br + 1) % this.bt.length;
            this.W[this.bs] = this.bt[this.br];
            this.bq = this.ao;
        }
        this.m();
        if (this.bb && eF.d(q)) {
            if (this.am == 1) {
                this.am = 0;
                this.a(this.aw, 0);
                this.aB = null;
                this.X.a(B[0]);
                this.g(this.at.n, this.at.o);
                this.at = null;
            } else if (this.am == 6 || this.am == 7) {
                this.am = this.an;
                this.a(this.aw, 0);
                this.X.a(B[0]);
                this.g(this.at.n, this.at.o);
                eF.a(this.aR);
            }
            this.ax = false;
            this.ay = false;
            eF.g(q);
            this.bb = false;
            this.bc = false;
        }
        for (n2 = this.aS.size() - 1; n2 >= 0; --n2) {
            j j6 = (j)this.aS.elementAt(n2);
            j6.f();
            if (j6.al) continue;
            this.aS.removeElement(j6);
        }
        n2 = 0;
        n18 = this.aT.size();
        while (true) {
            if (n2 >= n18) {
                this.aT.removeAllElements();
                return;
            }
            this.aS.addElement(this.aT.elementAt(n2));
            ++n2;
        }
    }

    public final void d(m m2) {
        int n2 = m2.Z + 40;
        this.a(this.ad, m2.Y, n2 - this.ad.ab, 0, -2, 1, 100);
        for (int i2 = 0; i2 < 5; ++i2) {
            this.a(this.bV, m2.Y, n2 - this.bV.ab, -2 + i2, p.a(-4, -1), 1, 50 + 50 * p.a(4));
        }
        this.a(this.ae, m2.Y, m2.Z, 0, 0, 1, 100);
    }

    public final void b(m m2, byte by) {
        this.aX = m2;
        this.aY = by;
        this.a(this.ae, m2.Y - 8, m2.Z - 8, 1, 1, 3, 50);
        this.a(this.ae, m2.Y + 8, m2.Z - 8, -1, 1, 3, 50);
        this.a(this.ae, m2.Y - 8, m2.Z + 8, 1, -1, 3, 50);
        this.a(this.ae, m2.Y + 8, m2.Z + 8, -1, -1, 3, 50);
        this.aZ = this.ao;
    }

    public final void m() {
        if (this.dk == null) {
            this.f(this.X.Y + 20, this.X.Z + 20);
            return;
        }
        this.f(this.dk.Y + 20, this.dk.Z + 20);
    }

    public final boolean b(int n2, int n3) {
        return this.R == this.f(n2) && this.S == this.g(n3);
    }

    public final boolean c(int n2, int n3) {
        return this.b(n2 * 40 + 20, n3 * 40 + 20);
    }

    public final int f(int n2) {
        int n3;
        if (this.P > this.c) {
            n3 = this.e - n2;
            if (n3 > 0) {
                n3 = 0;
            } else if (n3 < this.c - this.P) {
                n3 = this.c - this.P;
            }
        } else {
            n3 = (this.c - this.P) / 2;
        }
        return n3;
    }

    public final int g(int n2) {
        int n3;
        if (this.Q > this.d) {
            n3 = this.f - n2;
            if (n3 > 0) {
                n3 = 0;
            } else if (n3 < this.d - this.Q) {
                n3 = this.d - this.Q;
            }
        } else {
            n3 = (this.d - this.Q) / 2;
        }
        return n3;
    }

    public final void d(int n2, int n3) {
        this.R = this.f(n2);
        this.S = this.g(n3);
    }

    public final void e(int n2, int n3) {
        this.d(n2 * 40 + 20, n3 * 40 + 20);
    }

    public final void f(int n2, int n3) {
        int n4;
        this.dn = true;
        int n5 = this.f(n2);
        int n6 = this.g(n3);
        int n7 = n5 - this.R;
        int n8 = n6 - this.S;
        if (n7 != 0) {
            n4 = n7 / 2;
            if (n7 < 0) {
                if (n4 > -this.dm) {
                    n4 = -this.dm;
                } else if (n4 < -this.dl) {
                    n4 = -this.dl;
                }
            } else if (n4 < this.dm) {
                n4 = this.dm;
            } else if (n4 > this.dl) {
                n4 = this.dl;
            }
            this.R += n4;
            this.dn = false;
        }
        if (n8 != 0) {
            n4 = n8 / 2;
            if (n8 < 0) {
                if (n4 > -this.dm) {
                    n4 = -this.dm;
                } else if (n4 < -this.dl) {
                    n4 = -this.dl;
                }
            } else if (n4 < this.dm) {
                n4 = this.dm;
            } else if (n4 > this.dl) {
                n4 = this.dl;
            }
            this.S += n4;
            this.dn = false;
        }
    }

    public final void g(int n2, int n3) {
        this.aj = n2;
        this.ak = n3;
        this.X.b(n2 * 40, n3 * 40);
        this.bL = this.a(this.aj, this.ak, (byte)0);
        this.cQ = true;
    }

    public final void a(Graphics graphics) {
        int n2 = -this.R / 40;
        int n3 = -this.S / 40;
        if (n3 < 0) {
            n3 = 0;
        }
        int n4 = (this.c - this.R - 1) / 40;
        int n5 = (this.d - this.S - 1) / 40;
        if (n5 >= this.U) {
            n5 = this.U - 1;
        }
        int n6 = this.R < 0 ? this.R % 40 : this.R;
        int n7 = this.S < 0 ? this.S % 40 : this.S;
        int n8 = 0;
        if (this.ay) {
            n8 = 1;
        }
        for (int i2 = n3; i2 <= n5; ++i2) {
            int n9 = n6;
            for (int i3 = n2; i3 <= n4; ++i3) {
                byte by = this.al[i3][i2];
                this.W[by].a(graphics, n9, n7);
                int n10 = i2 + 1;
                if (n10 < this.U && this.O[this.al[i3][n10]] == 9) {
                    this.W[28].a(graphics, n9, n7);
                }
                if (this.ax && this.aw[i3][i2] > 0) {
                    if (this.do != 0) {
                        int n11 = n7 + this.do;
                        if (n11 >= this.d) {
                            graphics.setClip(0, 0, 0, 0);
                        } else {
                            graphics.clipRect(n9 + this.do, n11, 40 - (this.do << 1), 40 - (this.do << 1));
                        }
                    }
                    this.ce.a(graphics, n8, n9, n7, 0);
                    if (this.do != 0) {
                        graphics.setClip(0, 0, this.c, this.d);
                    }
                }
                n9 += 40;
            }
            n7 += 40;
        }
        this.b(graphics);
    }

    public final void b(Graphics graphics) {
        int n2 = -this.R / 40;
        int n3 = -this.S / 40;
        if (n3 < 0) {
            n3 = 0;
        }
        int n4 = (this.c - this.R - 1) / 40;
        int n5 = (this.d - this.S - 1) / 40;
        if (n5 >= this.U) {
            n5 = this.U - 1;
        }
        boolean bl = false;
        bl = false;
        boolean bl2 = false;
        bl2 = false;
        boolean bl3 = false;
        for (int i2 = n3; i2 <= n5; ++i2) {
            boolean bl4 = false;
            for (int i3 = n2; i3 <= n4; ++i3) {
                m m2;
                boolean bl5 = false;
                m m3 = this.a(i3, i2, (byte)0);
                if (m3 != null) {
                    m3.a(graphics, this.R, this.S);
                }
                if ((m2 = this.a(i3, i2, (byte)1)) == null) continue;
                this.V.a(graphics, this.R + m2.Y, this.S + m2.Z);
            }
        }
    }

    public final boolean c(Graphics graphics) {
        graphics.setFont(p.d);
        graphics.setColor(0);
        graphics.fillRect(0, 0, this.eG, this.eH);
        this.dp += 10;
        this.dq -= 986895;
        if (this.dq < 0) {
            this.dq = 0xFFFFFF;
        }
        if (this.dp > 360) {
            this.dp = 0;
            return true;
        }
        System.out.println("angle=" + this.dp);
        n.a(graphics, 0, 0, p.m, p.n, this.dp, this.dq);
        return false;
    }

    public static final int a(int n2, int n3, int n4, int n5) {
        if (n4 == 0) {
            return n2;
        }
        if (n4 == n5) {
            return n3;
        }
        int n6 = n2 & 0xFF0000;
        int n7 = n2 & 0xFF00;
        int n8 = n2 & 0xFF;
        int n9 = (((n3 & 0xFF0000) - n6) * n4 / n5 & 0xFF0000) + n6;
        int n10 = (((n3 & 0xFF00) - n7) * n4 / n5 & 0xFF00) + n7;
        int n11 = ((n3 & 0xFF) - n8) * n4 / n5 + n8;
        return n9 | n10 | n11;
    }

    public static final int b(int n2, int n3, int n4) {
        int n5 = (n2 & 0xFF0000) * n3 / n4 & 0xFF0000;
        int n6 = (n2 & 0xFF00) * n3 / n4 & 0xFF00;
        int n7 = (n2 & 0xFF) * n3 / n4;
        return n5 | n6 | n7;
    }

    public final void a(String string) {
        this.dy = this.bd;
        this.dw = e.a(string, this.eG, p.c);
        this.bh = 16;
        this.dx = false;
        this.dz = 3;
        this.dA = 3;
        this.dB = 0;
        this.dr = p.h;
        this.dt = this.eH / this.dr;
        this.ds = this.eH - this.dr;
        this.du = 0;
        eF.d();
        this.bd = (byte)3;
    }

    public final void n() {
        --this.bh;
        if (this.bh < 0) {
            this.bh = 0;
            this.bd = this.dy;
            this.dv = null;
            this.dw = null;
            return;
        }
    }

    public final void d(Graphics graphics) {
        int n2;
        graphics.setFont(p.c);
        graphics.setColor(0);
        graphics.fillRect(0, 0, this.eG, this.eH);
        if (this.dv != null) {
            if (!this.dx && (this.dz == 2 && this.bh >= 40 || this.dz != 2 && this.bh >= 16)) {
                this.dv.a(graphics, 0, 0);
                this.dC.a(graphics, p.m / 2, this.dr / 2);
                this.dC.j();
            } else if (this.dA == 2 && this.dx || this.dz == 2 && !this.dx) {
                this.dv.a(graphics, 0, 0);
                this.dv.a(graphics, 0, 0);
                this.dC.a(graphics, p.m / 2, this.dr / 2);
                this.dC.j();
            } else if (this.dA == 3 && this.dx || this.dz == 3 && !this.dx) {
                this.dv.a(graphics, 0, 0);
                this.dv.a(graphics, 0, 0);
                this.dC.a(graphics, p.m / 2, this.dr / 2);
                this.dC.j();
                n2 = 255 * (16 - this.bh) / 16;
                p.a(graphics, n2 << 24, 0, 0, this.dv.a(), this.dv.b());
            } else {
                this.dv.a(graphics, 0, 0);
                this.dv.a(graphics, 0, 0);
                this.dC.a(graphics, p.m / 2, this.dr / 2);
                this.dC.j();
                if (this.dx) {
                    if (this.dA == 1 && this.bh <= 16) {
                        e.a(graphics, 0, 16 - this.bh, 16, 0, this.dv, 0, 0, this.eG, this.eH);
                    }
                } else if (this.dz == 0) {
                    if (this.bh <= 16) {
                        e.a(graphics, 0xFFFFFF, this.bh, 16, 1, null, 0, 0, this.eG, this.eH);
                    }
                } else if (this.dz == 1 && this.bh <= 16) {
                    e.a(graphics, 0, this.bh, 16, 1, null, 0, 0, this.eG, this.dv.b());
                }
            }
        }
        graphics.setClip(0, 0, this.eG, this.eH);
        n2 = this.bh;
        if (this.dx && this.dA == 2 && (n2 -= 24) < 0) {
            n2 = 0;
        }
        int n3 = this.ds;
        for (int i2 = this.du; i2 < this.du + this.dt && i2 < this.dw.length && n3 < this.eH - this.dr; n3 += this.dr, ++i2) {
            int n4 = this.dr;
            if (n3 < this.dB + this.dr) {
                n4 = n3 - this.dB;
            } else if (n3 + this.dr > this.eH - this.dr) {
                n4 = this.eH - this.dr - n3;
            }
            int n5 = n4 < this.dr ? e.b(14672074, n4, this.dr) : 14672074;
            if (this.dx) {
                n5 = e.a(0, n5, n2, 16);
            }
            graphics.setColor(n5);
            p.b(graphics, this.dw[i2], this.eI, n3 + 3, 17);
        }
        if (!this.dx) {
            this.a(graphics, p, 2, this.eH);
        }
    }

    public final void e(Graphics graphics) {
        if (this.bf == 0) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, this.eG, this.eH);
            graphics.setColor(0xFFFFFF);
            graphics.drawString("\u662f\u5426\u5f00\u542f\u97f3\u6548\uff1a", this.eG / 2, this.eH / 2, 65);
            graphics.drawString("\u662f", 0, this.eH, 36);
            graphics.drawString("\u5426", this.eG, this.eH, 40);
            return;
        }
        if (this.bf == 1) {
            return;
        }
        if (this.bf == 3) {
            this.h(graphics);
            return;
        }
        if (this.bf >= 4) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, p.m, p.n);
        }
    }

    public final void f(Graphics graphics) {
        if (this.bd == 4) {
            graphics.setColor(0xFFFFFF);
            graphics.fillRect(0, 0, this.eG, this.eH);
            this.c(graphics);
            return;
        }
        if (this.bd == 2) {
            this.g(graphics);
            return;
        }
        if (this.bd == 3) {
            this.d(graphics);
            return;
        }
        if (this.bu) {
            this.c(graphics);
            return;
        }
        if (this.bg) {
            if (this.bh >= 16) {
                if (this.am != 11 && this.am != 10) {
                    this.c(graphics);
                    return;
                }
                graphics.setColor(0);
                graphics.fillRect(0, 0, this.eG, this.eH);
                return;
            }
            e.a(graphics, 0, this.bh, 16, this.bi, null, 0, 0, this.eG, this.eH);
            return;
        }
        if (this.bd == 0) {
            this.e(graphics);
        } else if (this.am == 14) {
            graphics.setClip(0, 0, this.eG, this.eH);
            graphics.setColor(0);
            graphics.fillRect(0, 0, this.eG, this.eH);
        } else if (this.am == 10 && this.ew >= 1) {
            this.c(graphics);
        } else if (this.am == 11 && !this.bg) {
            String string = k.l(57);
            graphics.setClip(0, 0, this.eG, this.eH);
            graphics.setFont(p.d);
            graphics.setColor(0);
            graphics.fillRect(0, 0, this.eG, this.eH);
            if (this.o == 0) {
                graphics.setColor(0xFFFFFF);
                if (this.cR != null) {
                    this.cR.a(graphics, this.eI, this.eJ, 3);
                    p.b(graphics, string, this.eI, this.eH - 2, 33);
                } else {
                    int n2 = this.eJ - p.d.getHeight() / 2;
                    if (this.ao - this.aE < 2800L) {
                        p.b(graphics, string, this.eI, n2, 17);
                    }
                }
            }
        } else {
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            graphics.setClip(0, 0, this.c, this.d);
            if (this.P < this.c || this.Q < this.d) {
                graphics.setColor(0);
                graphics.fillRect(0, 0, this.c, this.d);
            }
            if (this.eA) {
                n9 = p.b() % 10;
                n8 = p.b() % 4;
                graphics.translate(n9, n8);
                this.a(graphics);
                graphics.translate(-n9, -n8);
            } else {
                this.a(graphics);
            }
            n8 = this.aA.size();
            for (n9 = 0; n9 < n8; ++n9) {
                ((m)this.aA.elementAt(n9)).b(graphics, this.R, this.S);
            }
            if (this.aB != null) {
                graphics.setColor(14745682);
                n8 = 20 + this.dH / 4;
                n7 = 40 - n8;
                n6 = this.aB.size();
                for (n5 = 0; n5 < n6; ++n5) {
                    short[] sArray;
                    short[] sArray2 = (short[])this.aB.elementAt(n5);
                    n4 = sArray2[0] * 40 + this.R;
                    int n10 = sArray2[1] * 40 + this.S;
                    int n11 = n4 + 20;
                    int n12 = n10 + 20;
                    boolean bl = false;
                    boolean bl2 = false;
                    if (n5 != 0) {
                        sArray = (short[])this.aB.elementAt(n5 - 1);
                        if (sArray[0] == sArray2[0] + 1) {
                            graphics.fillRect(n4 + n7, n12 - this.dI, n8, this.dH);
                        } else if (sArray[0] == sArray2[0] - 1) {
                            graphics.fillRect(n4, n12 - this.dI, n8, this.dH);
                        } else if (sArray[1] == sArray2[1] + 1) {
                            graphics.fillRect(n11 - this.dI, n10 + n7, this.dH, n8);
                        } else if (sArray[1] == sArray2[1] - 1) {
                            graphics.fillRect(n11 - this.dI, n10, this.dH, n8);
                        }
                    }
                    if (n5 == n6 - 1) {
                        graphics.setClip(0, 0, this.c, this.d);
                        this.Y.a(graphics, n11, n12, 3);
                        continue;
                    }
                    sArray = (short[])this.aB.elementAt(n5 + 1);
                    if (sArray[0] == sArray2[0] + 1) {
                        graphics.fillRect(n4 + n7, n12 - this.dI, n8, this.dH);
                        continue;
                    }
                    if (sArray[0] == sArray2[0] - 1) {
                        graphics.fillRect(n4, n12 - this.dI, n8, this.dH);
                        continue;
                    }
                    if (sArray[1] == sArray2[1] + 1) {
                        graphics.fillRect(n11 - this.dI, n10 + n7, this.dH, n8);
                        continue;
                    }
                    if (sArray[1] != sArray2[1] - 1) continue;
                    graphics.fillRect(n11 - this.dI, n10, this.dH, n8);
                }
            }
            if (this.at != null) {
                this.at.a(graphics, this.R, this.S);
                this.at.b(graphics, this.R, this.S);
            }
            if (this.az) {
                this.X.a(graphics, this.R + 20, this.S + 20, 3);
            }
            n8 = this.aS.size();
            for (n3 = 0; n3 < n8; ++n3) {
                j j2 = (j)this.aS.elementAt(n3);
                j2.a(graphics, this.R, this.S + j2.ad);
            }
            graphics.setClip(0, 0, this.eG, this.eH);
            n3 = this.eH - b;
            if (this.bR > 0) {
                f.a(graphics, 0, n3, this.c, b, 14);
                graphics.setClip(0, 0, this.eG, this.eH);
            }
            n8 = b - 32 >> 1;
            n7 = 32 + n8 * 2;
            n5 = this.eG - n7;
            n3 += this.bR;
            if (this.cP) {
                this.cP = false;
                f.a(graphics, 0, n3, n5 + 1, b, 0, 2370117, F[this.aH[this.aJ]], this.bR, b);
                n6 = this.eH - b / 2 + this.bR;
                if (this.o == 1) {
                    n4 = n5 / 2;
                    this.bN.a(graphics, 0, n4, n6, 6);
                    p.a(graphics, this.b(-1, -1, this.aJ) - this.b(10, -1, this.aJ) + "/" + this.n, n4 + this.bN.aa + 1, n6, 1, 6);
                }
                n4 = 10;
                if (this.c <= 120) {
                    n4 = 4;
                }
                this.bN.a(graphics, 1, n4, n6, 6);
                n4 += this.bN.aa + 1;
                if (this.aQ[this.aJ] == 1) {
                    p.a(graphics, "" + this.aO[this.aJ], n4, n6, 1, 6);
                } else {
                    p.a(graphics, "- - -", n4, n6, 1, 6);
                }
                graphics.setClip(0, 0, this.eG, this.eH);
            }
            if (this.cQ) {
                this.cQ = false;
                if (n8 > 0) {
                    this.a(graphics, n5, n3, n7, (int)b);
                }
                n6 = n5 + n8;
                n4 = n3 + n8;
                this.W[this.al[this.aj][this.ak]].a(graphics, n6, n4);
                String string = "." + K[this.h(this.aj, this.ak)];
                p.a(graphics, string, n6 + 32, n4 + 32, 0, 40);
                if (n8 == 0) {
                    graphics.setColor(0);
                    graphics.drawRect(n6, n4, 40, 40);
                }
            }
            if (this.am == 6 && this.as[this.ar].v != 4) {
                n6 = 0;
                if (this.ak * 40 <= this.d / 2 - 40) {
                    n6 = this.d - this.ab.ab - this.dG + 2;
                }
                this.a(graphics, this.at, this.as[this.ar], n6);
            }
        }
        if (this.b()) {
            if (this.bb) {
                this.a(graphics, q, 1, this.d);
            }
            if (this.bc) {
                this.a(graphics, p, 0, this.d);
            }
            if (this.bd == 1 && (this.aQ[this.aJ] == 0 || this.am == 0) && this.am != 11) {
                this.a(graphics, p, 3, this.d);
            }
        }
        if (this.cg || this.ch) {
            e.a(graphics, 0, this.cf, 16, this.cg ? 0 : 1, null, 0, 0, this.eG, this.eH);
        }
    }

    public final void a(Graphics graphics, int n2, int n3, int n4, int n5) {
        graphics.setColor(4344163);
        graphics.fillRect(n2, n3, n4, n5);
        graphics.setColor(11384493);
        graphics.fillRect(n2 + 1, n3 + 1, n4 - 2, n5 - 2);
        graphics.setColor(4344163);
        graphics.fillRect(n2 + 3, n3 + 3, n4 - 6, n5 - 6);
    }

    public final void a(Graphics graphics, m m2, m m3, int n2) {
        int n3 = this.dG - 2;
        graphics.setColor(11384493);
        graphics.fillRect(0, n2, this.c, n3);
        graphics.setColor(0);
        graphics.fillRect(0, n3 + n2, this.c, 2);
        boolean bl = false;
        int n4 = 0;
        int n5 = n3 / 2;
        int n6 = n5 + n2;
        for (int i2 = 0; i2 < 3; ++i2) {
            this.bM.a(graphics, i2, n4 + 1, n6, 6);
            int n7 = n2 + 1;
            int n8 = i2 == 0 ? (this.eG <= 120 ? 54 : (this.eG <= 132 ? 56 : 61 * this.c / 176)) : (i2 == 1 ? (this.eG <= 120 ? 25 : (this.eG <= 132 ? 28 : 47 * this.c / 176)) : this.c - (n4 += this.bM.aa + 2));
            for (int i3 = 0; i3 < 2; ++i3) {
                m m4;
                m m5;
                if (i3 == 0) {
                    m5 = m2;
                    m4 = m3;
                } else {
                    m5 = m3;
                    m4 = m2;
                }
                int n9 = n3 / 2 - 2;
                graphics.setColor(2172994);
                graphics.fillRect(n4, n7, n8, n9);
                int n10 = n4 + 1;
                if (i2 == 0 || this.eG > 132) {
                    graphics.setColor(F[this.aH[m5.m]]);
                    graphics.fillRect(n10, n7 + 1, 3, n9 - 2);
                    n10 += 4;
                }
                int n11 = 0;
                String string = null;
                if (i2 == 0) {
                    if (i3 == 0 || m3.c(m2, m2.n, m2.o)) {
                        n11 = m5.a(m4);
                        string = m5.r + n11 + "-" + (m5.s + n11);
                    } else {
                        string = "0-0";
                    }
                } else if (i2 == 1) {
                    n11 = m5.b(m4);
                    string = "" + (m5.t + n11);
                } else {
                    string = "" + m5.f;
                }
                p.a(graphics, string, n10, n7 + 1, 0);
                if (n11 > 0) {
                    this.cr.a(graphics, 1, n10 + 1 + p.a((byte)0, string), n7 + n9 / 2, 6);
                } else if (n11 < 0) {
                    this.cr.a(graphics, 2, n10 + 1 + p.a((byte)0, string), n7 + n9 / 2, 6);
                }
                int n12 = n4 + n8 - 2;
                if (i2 == 0 && (m5.w & 2) != 0) {
                    this.ag.a(graphics, 1, n12, n7 + n9 / 2, 10);
                    n12 -= this.ag.aa;
                }
                if ((i2 == 0 || i2 == 1) && (m5.w & 1) != 0) {
                    this.ag.a(graphics, 0, n12, n7 + n9 / 2, 10);
                }
                n7 += n5;
            }
            n4 += n8;
        }
    }

    public final void a(Graphics graphics, int n2, int n3, int n4) {
        int n5 = 0;
        int n6 = 0;
        if (n2 == 1024) {
            n6 = 36;
        } else if (n2 == 2048) {
            n5 = this.eG;
            n6 = 40;
        }
        this.ab.a(graphics, n3, n5, n4, n6);
    }

    public final m a(int n2, int n3, byte by) {
        int n4 = this.aA.size();
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5;
            int n6;
            m m2 = (m)this.aA.elementAt(i2);
            if (m2.v == 1) {
                n6 = m2.p;
                n5 = m2.q;
            } else {
                n6 = m2.n;
                n5 = m2.o;
            }
            if (n2 != n6 || n3 != n5 || !(by == 0 ? m2.v != 3 : by == 1 && m2.v == 3)) continue;
            return m2;
        }
        return null;
    }

    public final byte h(int n2, int n3) {
        return this.O[this.al[n2][n3]];
    }

    public final void o() {
        p.h();
        this.aD = 0;
        this.bR = 0;
        this.am = (byte)8;
        this.aE = this.ao;
    }

    public final void p() {
        int n2;
        this.aP[this.aJ][0] = (byte)this.aj;
        this.aP[this.aJ][1] = (byte)this.ak;
        this.aK = (short)(this.aK + 1);
        this.aJ = (byte)((this.aJ + 1) % this.aF);
        if (this.aQ[this.aJ] == 2) {
            this.p();
            return;
        }
        for (n2 = this.aA.size() - 1; n2 >= 0; --n2) {
            m m2 = (m)this.aA.elementAt(n2);
            if (m2.v == 3) {
                if (m2.l == 9 || (m2.E = (byte)(m2.E - 1)) > 0) continue;
                m2.a();
                continue;
            }
            m2.v = 0;
            if ((m2.w & 1) != 0 && m2.F == this.aJ) {
                m2.c((byte)1);
            }
            if (m2.m == this.aJ) {
                m2.c((byte)2);
            }
            m2.L = 0;
        }
        this.dJ = 0;
        for (n2 = 0; n2 < this.al.length; ++n2) {
            for (int i2 = 0; i2 < this.al[n2].length; ++i2) {
                if (!this.e(n2, i2, this.aJ)) continue;
                if (this.h(n2, i2) == 8) {
                    this.dJ += 30;
                    continue;
                }
                if (this.h(n2, i2) != 9) continue;
                this.dJ += 50;
            }
        }
        byte by = this.aJ;
        this.aO[by] = this.aO[by] + this.dJ;
        for (n2 = 0; n2 < this.bH.length; ++n2) {
            this.dX[n2] = 0;
        }
        if (this.aQ[this.aJ] == 1) {
            this.g(this.aP[this.aJ][0], this.aP[this.aJ][1]);
        }
        this.bp = true;
        this.cP = true;
        if (this.aQ[this.aJ] == 0) {
            this.q();
        } else {
            m.c = m.b;
        }
        if (this.b(-1, 0, this.aJ) <= 0 && this.i(this.aJ) == 0) {
            this.p();
        }
    }

    public final boolean a(int n2, int n3, m m2) {
        return m2.a((short)8) && this.h(m2.n, m2.o) == 8 && this.al[m2.n][m2.o] < this.M;
    }

    public final boolean b(int n2, int n3, m m2) {
        if (m2.a((short)8) && this.h(m2.n, m2.o) == 8 && this.al[m2.n][m2.o] >= this.M && !this.d(m2.n, m2.o, this.aI[m2.m])) {
            return true;
        }
        return m2.a((short)16) && this.h(m2.n, m2.o) == 9 && !this.d(m2.n, m2.o, this.aI[m2.m]);
    }

    public final void b(byte by, int n2, int n3) {
        this.al[n2][n3] = by;
    }

    public final void c(int n2, int n3, int n4) {
        if (this.al[n2][n3] >= this.M) {
            this.b((byte)(this.M + n4 * 2 + (this.al[n2][n3] - this.M) % 2), n2, n3);
        }
    }

    public final int i(int n2, int n3) {
        return this.a(n2, n3, this.al);
    }

    public final int a(int n2, int n3, byte[][] byArray) {
        if (byArray[n2][n3] >= this.M) {
            return (byArray[n2][n3] - this.M) / 2;
        }
        return -1;
    }

    public final int h(int n2) {
        if (n2 != -1 && n2 != 0) {
            return this.aG[n2];
        }
        return -1;
    }

    public final boolean d(int n2, int n3, int n4) {
        int n5 = this.h(this.i(n2, n3));
        if (n5 > -1) {
            return n4 == this.aI[n5];
        }
        return false;
    }

    public final boolean e(int n2, int n3, int n4) {
        return this.i(n2, n3) == this.aH[n4];
    }

    public final int i(int n2) {
        int n3 = 0;
        for (int i2 = 0; i2 < this.ea; ++i2) {
            if (!this.e(this.bI[i2][0], this.bI[i2][1], n2)) continue;
            ++n3;
        }
        return n3;
    }

    public final int b(int n2, int n3, byte by) {
        int n4 = 0;
        int n5 = this.aA.size();
        for (int i2 = 0; i2 < n5; ++i2) {
            m m2 = (m)this.aA.elementAt(i2);
            if (n2 != -1 && m2.l != n2 || (n3 != -1 || m2.v == 3) && n3 != m2.v || by != -1 && m2.m != by) continue;
            ++n4;
        }
        return n4;
    }

    public final m[] c(int n2, int n3, byte by) {
        Vector<m> vector = new Vector<m>();
        int n4 = this.aA.size();
        for (int i2 = 0; i2 < n4; ++i2) {
            m m2 = (m)this.aA.elementAt(i2);
            if (n2 != -1 && m2.l != n2 || (n3 != -1 || m2.v == 3) && n3 != m2.v || by != -1 && m2.m != by) continue;
            vector.addElement(m2);
        }
        Object[] objectArray = new m[vector.size()];
        vector.copyInto(objectArray);
        return objectArray;
    }

    public static final void a(Graphics graphics, int n2, int n3, int n4, int n5, l l2, int n6, int n7, int n8, int n9) {
        int n10 = n8 / 8 + 1;
        int n11 = n9 / 1;
        int n12 = n4 - 7;
        for (int i2 = 0; i2 < 8; ++i2) {
            int n13;
            int n14;
            int n15 = n3 - i2 * 1;
            if (n15 < 0) {
                n15 = 0;
            }
            if (n15 >= n12) {
                boolean bl = false;
                n14 = n10;
            } else {
                n14 = n10 * n15 / n12;
            }
            if (n5 == 1) {
                n13 = i2 * n10 + n14;
                n14 = n10 - n14;
            } else {
                n13 = i2 * n10;
            }
            int n16 = 255 * n14 / n10;
            p.a(graphics, n16 << 24 | n2);
            for (int i3 = 0; i3 < 1; ++i3) {
                graphics.fillRect(n6 + n13, n7, n14, n11);
            }
        }
    }

    public final boolean c(byte by, int n2, int n3) {
        if (this.n > this.b(-1, -1, this.aJ) - this.b(10, -1, this.aJ) && by <= this.bB && m.V[by] <= this.aO[this.aJ] && m.V[by] > 0) {
            this.a(this.aw, 0);
            return m.a(this.aw, n2, n3, m.P[by], -1, by, this.aJ, true);
        }
        return false;
    }

    public final boolean b(m m2, int n2, int n3) {
        if (this.n > this.b(-1, -1, this.aJ) - this.b(10, -1, this.aJ) && (m2.l <= this.bB || m2.l == 9) && m2.K <= this.aO[this.aJ]) {
            this.a(this.aw, 0);
            return m.a(this.aw, n2, n3, m.P[m2.l], -1, m2.l, this.aJ, true);
        }
        return false;
    }

    public final void q() {
        m[] mArray = this.c(-1, 0, this.aJ);
        this.ef = new Vector(mArray.length);
        for (int i2 = 0; i2 < mArray.length; ++i2) {
            int n2;
            for (n2 = 0; n2 < i2; ++n2) {
                m m2 = (m)this.ef.elementAt(n2);
                byte by = dK[mArray[i2].l];
                byte by2 = dK[m2.l];
                if (by >= by2 && (by != by2 || mArray[i2].u >= m2.u)) continue;
                this.ef.insertElementAt(mArray[i2], n2);
                break;
            }
            if (n2 != i2) continue;
            this.ef.addElement(mArray[i2]);
        }
        this.dU = new m[this.bH.length];
        this.dV = new byte[this.bH.length];
        m.c = m.a;
        this.dR = 0;
        this.dL = 0;
    }

    public final void r() throws Exception {
        if (eF.c(p)) {
            this.a(this.z, this.bO, this.bP, this);
            eF.d();
            return;
        }
        if (this.eg) {
            return;
        }
        if (this.dL == 4) {
            if (this.dO != null || this.dP != null) {
                this.dL = (byte)5;
                this.at.a(this.aw, (int)this.at.n, (int)this.at.o);
                this.ay = true;
                this.ax = true;
                this.dS = this.ao;
                if (this.dO != null) {
                    this.X.a(B[1]);
                    this.g(this.dO.n, this.dO.o);
                } else if (this.dP != null) {
                    this.g(this.dP.n, this.dP.o);
                }
            } else {
                if (this.b((int)this.at.n, (int)this.at.o, this.at)) {
                    int n2 = this.j(this.at.n, this.at.o);
                    if (this.ee != -1 && this.ee != n2) {
                        this.dU[this.ee] = this.dU[n2];
                        this.dU[n2] = this.at;
                    }
                    this.c((int)this.at.n, (int)this.at.o, (int)this.aH[this.at.m]);
                    eF.a(this.a(null, k.l(73), this.d, 1000));
                    p.c(-1, 1);
                    this.am = (byte)9;
                    this.aE = this.ao;
                } else if (this.a((int)this.at.n, (int)this.at.o, this.at)) {
                    int n3 = this.j(this.at.n, this.at.o);
                    if (this.ee != -1 && this.ee != n3) {
                        this.dU[this.ee] = this.dU[n3];
                        this.dU[n3] = this.at;
                    }
                    this.b((byte)this.M, (int)this.at.n, (int)this.at.o);
                    eF.a(this.a(null, k.l(74), this.d, 1000));
                    p.c(-1, 1);
                    this.am = 0;
                    this.aE = this.ao;
                } else {
                    this.am = 0;
                }
                this.at.g();
                this.at = null;
                this.dL = 0;
            }
            this.az = true;
            return;
        }
        if (this.dL == 5) {
            if (this.ao - this.dS >= 500L) {
                if (this.dO != null) {
                    this.a(this.at, this.dO);
                } else if (this.dP != null) {
                    this.b(this.dP, this.aJ);
                    this.dP = null;
                    this.dL = (byte)7;
                    this.at.g();
                }
                this.ax = false;
                this.ay = false;
                return;
            }
        } else if (this.dL == 7) {
            if (this.aX == null) {
                this.dL = 0;
                this.am = 0;
                return;
            }
        } else if (this.dL == 6) {
            if (this.ao - this.dS >= 1000L) {
                this.dO = null;
                this.dL = 0;
                this.am = 0;
                return;
            }
        } else {
            if (this.dL == 2) {
                return;
            }
            if (this.dL == 3) {
                if (this.dR == 0) {
                    if (this.b(this.at.Y + 20, this.at.Z + 20)) {
                        if (this.o == 0 && this.ap == 7 && this.at == this.aL[1]) {
                            this.dk = null;
                            m[] mArray = this.c(-1, -1, (byte)0);
                            if (mArray.length > 0) {
                                this.a(mArray[p.a(mArray.length)]);
                            }
                            this.dL = (byte)4;
                            return;
                        }
                        this.dR = 1;
                        this.dS = this.ao;
                        return;
                    }
                } else if (this.dR == 1) {
                    if (this.ao - this.dS >= 100L) {
                        this.ax = true;
                        this.ay = false;
                        this.dR = 2;
                        this.am = 1;
                        this.dS = this.ao;
                        return;
                    }
                } else if (this.dR == 2) {
                    if (this.ao - this.dS >= 200L) {
                        this.aj = this.dM;
                        this.ak = this.dN;
                        this.X.b(this.dM * 40, this.dN * 40);
                        this.aB = this.at.a((int)this.at.n, (int)this.at.o, this.aj, this.ak);
                        this.dR = 3;
                        this.dS = this.ao;
                        return;
                    }
                } else if (this.dR == 3 && this.ao - this.dS >= 200L) {
                    this.aB = null;
                    this.at.a(this.dM, this.dN, true);
                    this.dL = (byte)2;
                    this.dR = 0;
                    this.am = (byte)2;
                }
                return;
            }
            if (this.ef.size() == 0) {
                int n4;
                int n5;
                int n6;
                int n7;
                m m2 = null;
                int n8 = 0;
                int n9 = 6666;
                int n10 = 0;
                int n11 = 0;
                for (n7 = 0; n7 < this.bH.length; ++n7) {
                    int n12;
                    n6 = this.bH[n7][0];
                    n5 = this.bH[n7][1];
                    if (this.h(n6, n5) != 9 || !this.e(n6, n5, this.aJ)) continue;
                    if (n8 == 0) {
                        n10 = n6;
                        n11 = n5;
                    }
                    ++n8;
                    int n13 = 0;
                    for (n4 = this.aA.size() - 1; n4 >= 0; --n4) {
                        m m3 = (m)this.aA.elementAt(n4);
                        if (this.aI[m3.m] == this.aI[this.aJ] || !m3.a((short)16)) continue;
                        n12 = Math.abs(m3.n - n6) + Math.abs(m3.o - n5);
                        if (n12 < n9) {
                            n9 = n12;
                            n10 = n6;
                            n11 = n5;
                        }
                        ++n13;
                    }
                    if (n13 != 0) continue;
                    for (n4 = 0; n4 < this.bH.length; ++n4) {
                        int n14;
                        byte by = this.bH[n4][0];
                        n12 = this.bH[n4][1];
                        if (this.h(by, n12) != 9 || this.e(by, n12, this.aJ) || (n14 = Math.abs(by - n6) + Math.abs(n12 - n5)) >= n9) continue;
                        n9 = n14;
                        n10 = n6;
                        n11 = n5;
                    }
                }
                if (n8 > 0) {
                    for (n7 = 0; n7 < this.aN[this.aJ]; ++n7) {
                        if (this.aM[this.aJ][n7] == null || this.aM[this.aJ][n7].v != 3 || !this.b(this.aM[this.aJ][n7], n10, n11)) continue;
                        m2 = this.a(this.aM[this.aJ][n7], n10, n11);
                    }
                    if (m2 == null) {
                        if (this.b(0, -1, this.aJ) < 2 && this.c((byte)0, n10, n11)) {
                            m2 = this.a((byte)0, n10, n11);
                        } else if (this.b(1, -1, this.aJ) < 2 && this.c((byte)1, n10, n11)) {
                            m2 = this.a((byte)1, n10, n11);
                        } else {
                            n7 = 0;
                            n6 = 0;
                            for (n5 = 0; n5 < this.aF; n5 = (byte)(n5 + 1)) {
                                if (this.aI[n5] == this.aI[this.aJ]) {
                                    n7 += this.b(-1, -1, (byte)n5);
                                    continue;
                                }
                                n6 += this.b(-1, -1, (byte)n5);
                            }
                            if (this.aO[this.aJ] >= 1000 || this.b(-1, -1, this.aJ) < 8 || n7 < n6) {
                                n5 = 0;
                                byte[] byArray = new byte[12];
                                for (n4 = 1; n4 < 12; n4 = (int)((byte)(n4 + 1))) {
                                    if (this.b(n4, -1, this.aJ) >= 1 && m.V[n4] < 600 || !this.c((byte)n4, n10, n11)) continue;
                                    byArray[n5] = n4;
                                    ++n5;
                                }
                                if (n5 > 0) {
                                    n4 = byArray[Math.abs(p.b()) % n5];
                                    m2 = this.a((byte)n4, n10, n11);
                                }
                            }
                        }
                    }
                }
                if (m2 != null) {
                    this.e(m2);
                    return;
                }
                this.dT = null;
                this.ef = null;
                this.o();
                return;
            }
            if (this.o == 0 && this.ap == 7 && this.aL[1].v != 2) {
                this.at = this.aL[1];
                this.g(this.at.n, this.at.o);
                this.dk = this.at;
                this.dL = (byte)3;
                this.ef.removeElement(this.at);
                return;
            }
            m m4 = this.dQ;
            if (m4 == null) {
                m4 = (m)this.ef.elementAt(0);
            }
            this.e(m4);
            if (this.dQ == null) {
                this.ef.removeElement(m4);
            }
        }
    }

    public final void e(m m2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        this.at = m2;
        this.az = true;
        this.a(this.aw, 0);
        this.at.b(this.aw);
        this.ax = false;
        this.dT = this.c(0, -1, this.aJ);
        int n9 = 0;
        int n10 = this.aL.length + this.dT.length + this.bH.length;
        this.dW = new int[n10][5];
        this.dY = 0;
        boolean bl = false;
        int n11 = 10000;
        this.eb = -1;
        this.ec = -1;
        this.ed = -1;
        this.ee = -1;
        for (n8 = 0; n8 < this.dT.length + this.aL.length; ++n8) {
            m m3 = null;
            if (n8 >= this.dT.length) {
                m3 = this.aL[n8 - this.dT.length];
                if (m3 != null) {
                    if (m3.v == 3) {
                        m3 = null;
                    } else if (this.aI[m3.m] != this.aI[this.aJ] && this.aL[this.aJ] == null) {
                        int[] nArray = this.dW[n9];
                        nArray[2] = nArray[2] + m3.a((int)m3.n, (int)m3.o, null) * 2;
                    } else if (this.aK >= 15 && this.aI[m3.m] != this.aI[this.aJ] && this.b(-1, -1, m3.m) < 4 && this.b(-1, -1, this.aJ) >= 8) {
                        int[] nArray = this.dW[n9];
                        nArray[2] = nArray[2] + m3.a((int)m3.n, (int)m3.o, null) * 2;
                    } else if (m3.m != this.aJ) {
                        m3 = null;
                    }
                }
            } else if (this.aL[this.aJ] != null) {
                m3 = this.dT[n8];
            }
            if (m3 != null) {
                this.dW[n9][0] = m3.n;
                this.dW[n9][1] = m3.o;
                if (m3.m == this.aJ) {
                    m[] mArray = m3.a(m3.n, (int)m3.o, 1, 5, (byte)0);
                    for (n7 = 0; n7 < mArray.length; ++n7) {
                        if (mArray[n7].v == 4) continue;
                        int[] nArray = this.dW[n9];
                        nArray[2] = nArray[2] + mArray[n7].a((int)mArray[n7].n, (int)mArray[n7].o, m3);
                    }
                }
                if (this.dW[n9][2] > 0) {
                    int[] nArray = this.dW[n9];
                    nArray[4] = nArray[4] + m3.a((int)m3.n, (int)m3.o, null);
                    int[] nArray2 = this.dW[n9];
                    nArray2[4] = nArray2[4] + m3.L;
                    if (this.dW[n9][2] > this.dY) {
                        this.dY = this.dW[n9][2];
                    }
                    this.dW[n9][3] = Math.abs(m3.n - m2.n) + Math.abs(m3.o - m2.o);
                    if (this.dW[n9][3] < 1) {
                        this.dW[n9][3] = 1;
                    }
                    if (this.dW[n9][3] < n11) {
                        n11 = this.dW[n9][3];
                    }
                } else {
                    this.dW[n9][2] = -6666;
                }
            } else {
                this.dW[n9][2] = -6666;
            }
            ++n9;
        }
        n8 = 666;
        int n12 = 666;
        int n13 = -1;
        n7 = -1;
        for (n6 = 0; n6 < this.bH.length; ++n6) {
            int n14;
            Object object;
            n5 = this.bH[n6][0];
            n4 = this.bH[n6][1];
            n3 = this.h(n5, n4);
            n2 = this.e(n5, n4, m2.m);
            this.dW[n9][2] = -6666;
            if (n2 != 0 || this.dU[n6] != null) {
                object = m2.a(n5, n4, 1, 5, (byte)0);
                this.dW[n9][0] = n5;
                this.dW[n9][1] = n4;
                this.dW[n9][2] = 0;
                for (n14 = 0; n14 < ((m[])object).length; ++n14) {
                    if (object[n14].v == 4) continue;
                    if (this.dU[n6] != null && n2 == 0) {
                        int[] nArray = this.dW[n9];
                        nArray[2] = nArray[2] + object[n14].a((int)object[n14].n, (int)object[n14].o, null);
                        continue;
                    }
                    if ((n3 != 8 || !object[n14].a((short)8)) && (n3 != 9 || !object[n14].a((short)16))) continue;
                    int[] nArray = this.dW[n9];
                    nArray[2] = nArray[2] + object[n14].a((int)object[n14].n, (int)object[n14].o, null);
                }
                if (this.dW[n9][2] == 0) {
                    if (this.dU[n6] != null && n2 == 0) {
                        this.dW[n9][2] = 100;
                        int[] nArray = this.dW[n9];
                        nArray[4] = nArray[4] + 2000;
                    } else {
                        this.dW[n9][2] = -6666;
                    }
                }
                if (this.dW[n9][2] != -6666) {
                    int[] nArray = this.dW[n9];
                    nArray[4] = nArray[4] + this.dX[n6];
                    if (this.dW[n9][2] > this.dY) {
                        this.dY = this.dW[n9][2];
                    }
                    this.dW[n9][3] = Math.abs(n5 - m2.n) + Math.abs(n4 - m2.o);
                    if (this.dW[n9][3] < 1) {
                        this.dW[n9][3] = 1;
                    }
                    if (this.dW[n9][3] < n11) {
                        n11 = this.dW[n9][3];
                    }
                }
            }
            if (this.d(n5, n4, this.aI[m2.m])) {
                object = this.a(n5, n4, (byte)0);
                if ((object == null || object.m == m2.m) && (n14 = Math.abs(n5 - m2.n) + Math.abs(n4 - m2.o)) < n12) {
                    n7 = n6;
                    n12 = n14;
                }
            } else if ((this.dU[n6] == null || this.dU[n6] == m2) && (n3 == 8 && m2.a((short)8) || n3 == 9 && m2.a((short)16))) {
                int n15 = Math.abs(n5 - m2.n) + Math.abs(n4 - m2.o);
                if (n15 < n8) {
                    n13 = n6;
                    n8 = n15;
                }
                m m4 = this.a(n5, n4, (byte)0);
                if (n15 < n12 && this.aw[n5][n4] > 0 && (m4 == null || m4.m == m2.m)) {
                    n7 = n6;
                    n12 = n15;
                }
            }
            ++n9;
        }
        if (m2.u < 50 && n7 != -1) {
            if (n7 == n13) {
                this.ee = n13;
            }
            this.dU[n7] = m2;
            this.eb = this.bH[n7][0];
            this.ec = this.bH[n7][1];
            this.a(this.dZ, 0);
            m.a(this.dZ, this.eb, this.ec, 10, -1, m2.l, this.aJ, false);
        } else if (this.aL[this.aJ] != null && n13 != -1 && (m2.a((short)8) || m2.a((short)16))) {
            this.ee = n13;
            this.dU[n13] = m2;
            this.eb = this.bH[n13][0];
            this.ec = this.bH[n13][1];
            this.a(this.dZ, 0);
            m.a(this.dZ, this.eb, this.ec, 10, -1, m2.l, this.aJ, false);
        } else {
            n6 = -1;
            n5 = -6666;
            for (n4 = 0; n4 < n9; ++n4) {
                if (this.dW[n4][2] <= -6666) continue;
                if (this.dW[n4][2] > 0) {
                    this.dW[n4][2] = this.dW[n4][2] * n11 / this.dW[n4][3];
                }
                int[] nArray = this.dW[n4];
                nArray[2] = nArray[2] - this.dW[n4][4];
                if (this.dW[n4][2] <= n5) continue;
                n5 = this.dW[n4][2];
                n6 = n4;
            }
            if (n6 != -1) {
                n4 = m2.a((int)m2.n, (int)m2.o, null);
                if (n6 < this.dT.length) {
                    this.dT[n6].L += n4;
                } else if (n6 < this.aL.length + this.dT.length) {
                    this.aL[n6 - this.dT.length].L += n4;
                } else {
                    int n16 = this.ed = n6 - this.aL.length - this.dT.length;
                    this.dX[n16] = this.dX[n16] + n4;
                }
                this.eb = this.dW[n6][0];
                this.ec = this.dW[n6][1];
                this.a(this.dZ, 0);
                m.a(this.dZ, this.eb, this.ec, 10, -1, m2.l, this.aJ, false);
            }
        }
        n6 = -10000;
        n4 = this.aw.length;
        for (n5 = 0; n5 < n4; ++n5) {
            n2 = this.aw[n5].length;
            for (n3 = 0; n3 < n2; ++n3) {
                int n17;
                m m5;
                if (this.aw[n5][n3] <= 0 || (m5 = this.a(n5, n3, (byte)0)) != null && m5 != m2 && (this.dQ != null || m5.m != m2.m || m5.v != 0)) continue;
                if (!m2.a((short)512) || m5 == m2) {
                    m[] mArray = m2.a(n5, n3, (byte)0);
                    for (int i2 = 0; i2 < mArray.length; ++i2) {
                        n17 = this.a(m2, n5, n3, mArray[i2], null);
                        if (n17 <= n6) continue;
                        this.dP = null;
                        this.dO = mArray[i2];
                        n6 = n17;
                        this.dM = n5;
                        this.dN = n3;
                    }
                }
                if (m2.a((short)32)) {
                    this.as = m2.a(n5, n3, (byte)1);
                    for (int i3 = 0; i3 < this.as.length; ++i3) {
                        n17 = this.a(m2, n5, n3, null, this.as[i3]);
                        if (n17 <= n6) continue;
                        this.dO = null;
                        this.dP = this.as[i3];
                        n6 = n17;
                        this.dM = n5;
                        this.dN = n3;
                    }
                }
                if ((n17 = this.a(m2, n5, n3, null, null)) <= n6) continue;
                this.dO = null;
                this.dP = null;
                n6 = n17;
                this.dM = n5;
                this.dN = n3;
            }
        }
        if (this.ee != -1) {
            this.dV[this.ee] = (byte)(10 - this.dZ[this.dM][this.dN]);
        }
        this.dQ = null;
        m m6 = this.a(this.dM, this.dN, (byte)0);
        if (m6 != null && m6 != m2) {
            this.dQ = m6;
            this.dL = 0;
            return;
        }
        this.g(m2.n, m2.o);
        this.dk = m2;
        this.dL = (byte)3;
    }

    public final int a(m m2, int n2, int n3, m m3, m m4) {
        m m5;
        int n4;
        int n5;
        int n6 = 0;
        if (this.ee != -1 && this.aL[m2.m] != null) {
            if (this.eb != -1) {
                if (this.dZ[n2][n3] > 0) {
                    n6 = 0 + (100 + 100 * this.dZ[n2][n3] / 10);
                } else {
                    n5 = Math.abs(this.eb - m2.n) + Math.abs(this.ec - m2.o);
                    n4 = Math.abs(this.eb - n2) + Math.abs(this.ec - n3);
                    n6 = 0 + 100 * (n5 - n4) / (m.P[m2.l] - 1);
                    if (L[this.h(n2, n3)] <= 1) {
                        n6 += 20;
                    }
                }
            }
            if (m3 == null && !this.d(n2, n3, this.aI[m2.m])) {
                if (m2.a((short)16) && this.h(n2, n3) == 9) {
                    n6 += 300;
                } else if (m2.a((short)8) && (this.h(n2, n3) == 8 || this.al[n2][n3] == 27)) {
                    n6 += 200;
                }
            }
        }
        switch (m2.l) {
            case 3: {
                if (m4 == null) break;
                n6 += 100;
                break;
            }
            case 4: {
                m[] mArray = m2.a(n2, n3, 1, 2, (byte)2);
                if (m4 == null) break;
                n6 += 25 * mArray.length;
                break;
            }
            case 2: {
                if (this.h(n2, n3) != 5) break;
                n6 += 25;
            }
        }
        if (m3 != null) {
            if (m3.v == 4) {
                n5 = this.i(m3.n, m3.o);
                n4 = this.j(m3.n, m3.o);
                if (n5 != 0 && n4 != -1 && this.dU[n4] == null) {
                    n6 += m2.a(n2, n3, m3) / 2;
                }
            } else {
                n6 = !m3.c(m2, n2, n3) ? (n6 += m2.a(n2, n3, m3) * 2) : (n6 += m2.a(n2, n3, m3) * 3 / 2 - m3.a(n2, n3, m2));
                if (m3.l == 9) {
                    n6 += 25;
                } else if (m3.l == 11) {
                    n6 += 100;
                }
            }
        }
        n6 += K[this.h(n2, n3)];
        if (m2.u < 100 && this.d(n2, n3, this.aI[m2.m])) {
            n6 += 100 - m2.u;
        }
        n5 = this.j(n2, n3);
        if (this.dZ[n2][n3] > 0) {
            n4 = this.dZ[n2][n3];
            int n7 = 10 - m.P[m2.l] / 2;
            if (n4 > n7) {
                n4 = n7;
            }
            n6 += 50 + 100 * n4 / n7;
        } else if (this.eb != -1) {
            n4 = Math.abs(this.eb - m2.n) + Math.abs(this.ec - m2.o);
            int n8 = Math.abs(this.eb - n2) + Math.abs(this.ec - n3);
            n6 += 50 * (n4 - n8) / (m.P[m2.l] - 1);
        }
        if (n5 != -1 && (m5 = this.dU[n5]) != null && m5 != m2 && m5.v == 0 && this.dV[n5] < m.P[m5.l]) {
            n6 -= 200;
        }
        return n6 += 20 * (Math.abs(n2 - m2.n) + Math.abs(n3 - m2.o)) / (m.P[m2.l] - 1);
    }

    public final int j(int n2, int n3) {
        for (int i2 = 0; i2 < this.bH.length; ++i2) {
            if (this.bH[i2][0] != n2 || this.bH[i2][1] != n3) continue;
            return i2;
        }
        return -1;
    }

    public final void j(int n2) {
        this.eh = n2;
        this.es = true;
    }

    public final f a(String string, byte by, byte by2) {
        f f2 = new f(7, 12);
        int n2 = p.f * 3;
        f2.a(string, this.eG, n2, by, by2);
        f2.a(0, this.eH - n2, 0);
        eF.a(f2);
        return f2;
    }

    public final f a(String string, String string2, int n2, int n3) {
        return this.a(string, string2, n2, -1, n3);
    }

    public final f a(String string, String string2, int n2, int n3, int n4) {
        f f2 = new f(10, 12);
        f2.a(string, string2, this.eG, n3);
        f2.a(this.eI, n2 / 2, 3);
        f2.N = this;
        f2.I = n4;
        return f2;
    }

    public final void s() throws Exception {
        this.en = null;
        if (this.o == 0) {
            this.bR = b;
            this.bS = true;
            this.bQ = false;
            this.ei = this.a(null, this.cx, this.eH, 2000);
            this.ei.a(this.eI, this.eJ, 3);
            this.ci = true;
            this.ch = true;
            this.cf = 0;
        }
        if (this.ap == 0) {
            this.bB = 0;
            this.aO[0] = 0;
            this.aO[1] = 0;
            m.c = (byte)4;
            this.dl = 2;
            this.e(this.aL[0].n, this.aL[0].o);
            this.g(this.aL[0].n, this.aL[0].o);
            p.b(1, 0);
            this.ci = false;
            this.az = false;
            this.ep = 0;
            return;
        }
        if (this.ap == 1) {
            this.bB = 1;
            this.aO[0] = 300;
            this.aO[1] = 50;
            m.c = (byte)4;
            this.dl = 2;
            this.aL[0].b(2);
            this.e(this.aL[0].n, this.aL[0].o);
            this.g(this.aL[0].n, this.aL[0].o);
            this.a(7, 12, (byte)0).a(7, 10, false);
            this.a(8, 11, (byte)0).a(8, 9, false);
            this.a(9, 12, (byte)0).a(9, 10, false);
            this.k(7, 3);
            eF.a(this.ei);
            return;
        }
        if (this.ap == 2) {
            this.bB = 0;
            this.aO[0] = 0;
            this.aO[1] = 0;
            m.c = (byte)4;
            this.aO[0] = 0;
            this.e(this.aL[0].n, this.aL[0].o);
            this.g(this.aL[0].n, this.aL[0].o);
            this.ej = this.a(8, 17, (byte)0);
            this.ek = this.a(8, 18, (byte)0);
            this.el = this.a(8, 19, (byte)0);
            this.ej.a(8, 15, false);
            this.ek.a(8, 15, false);
            this.el.a(8, 15, false);
            this.aL[0].a(8, 14, false);
            this.az = false;
            eF.a(this.ei);
            this.ep = 0;
            return;
        }
        if (this.ap == 3) {
            this.bB = 7;
            m.c = (byte)4;
            this.aO[0] = 400;
            this.aO[1] = 400;
            this.ej = m.a((byte)0, (byte)0, -1, 5);
            this.ek = m.a((byte)2, (byte)0, -2, 5);
            this.el = m.a((byte)3, (byte)0, -3, 5);
            this.ej.a(3, 4, false);
            this.ek.a(4, 4, false);
            this.el.a(2, 4, false);
            this.aL[0].a(3, 3, false);
            this.e(this.aL[0].n, this.aL[0].o);
            this.g(3, 3);
            this.dk = this.aL[0];
            p.b(1, 0);
            this.ci = false;
            this.az = false;
            this.ep = 0;
            return;
        }
        if (this.ap == 4) {
            this.bB = 0;
            this.aO[0] = 0;
            this.aO[1] = 0;
            this.d(this.aL[0].Y + 20, this.aL[0].Z + 20);
            this.g(this.aL[0].n, this.aL[0].o);
            m.c = (byte)4;
            m m2 = this.a(11, 2, (byte)0);
            m2.a(11, 2);
            m2.a(11, 2, false);
            m2 = this.a(10, 1, (byte)0);
            m2.a(10, 1);
            m2.a(10, 1, false);
            m2 = this.a(11, 1, (byte)0);
            m2.a(11, 1);
            m2.a(11, 1, false);
            m2 = this.a(12, 1, (byte)0);
            m2.a(12, 1);
            m2.a(12, 1, false);
            m2 = this.a(11, 0, (byte)0);
            m2.a(11, 0);
            m2.a(11, 0, false);
            m2 = this.a(12, 0, (byte)0);
            m2.a(12, 0);
            m2.a(12, 0, false);
            eF.a(this.ei);
            this.az = false;
            this.ep = 0;
            return;
        }
        if (this.ap == 5) {
            this.bB = 7;
            this.aO[0] = 600;
            this.aO[1] = 600;
            this.aL[0].b(2);
            this.e(5, 0);
            this.g(5, 0);
            this.dl = 4;
            this.k(this.aL[0].n, this.aL[0].o);
            eF.a(this.ei);
            this.az = false;
            this.ep = 0;
            return;
        }
        if (this.ap == 6) {
            this.bB = 8;
            m.c = (byte)4;
            this.aO[0] = 400;
            this.aO[1] = 600;
            m m3 = m.a((byte)0, (byte)0, 13, -1);
            m m4 = m.a((byte)1, (byte)0, 13, -1);
            m m5 = m.a((byte)3, (byte)0, 13, -1);
            m m6 = m.a((byte)11, (byte)0, 13, -1);
            this.aL[0].H = m3;
            m3.H = m4;
            m4.H = m5;
            m5.H = m6;
            this.aL[0].b(this.aw);
            this.aL[0].a(14, 3, true);
            this.e(this.aL[0].n, this.aL[0].o);
            this.g(this.aL[0].n, this.aL[0].o);
            this.dk = this.aL[0];
            eF.a(this.ei);
            this.az = false;
            this.ep = 0;
            return;
        }
        if (this.ap == 7) {
            m m7;
            this.bB = 8;
            m.c = (byte)4;
            this.aO[0] = 800;
            this.aO[1] = 200;
            m m8 = this.a(7, 4, (byte)0);
            m8.b(3);
            this.aL[1] = m8;
            this.aL[0] = m7 = this.a(8, 15, (byte)0);
            m7.b(0);
            m m9 = this.a(6, 15, (byte)0);
            m9.b(2);
            this.d(this.aL[0].Y + 20, this.aL[0].Z + 20);
            this.g(this.aL[0].n, this.aL[0].o);
            p.b(1, 0);
            this.ci = false;
            this.az = false;
            this.ep = 0;
        }
    }

    public final void t() throws Exception {
        int n2;
        if (this.eh > 0 && --this.eh > 0) {
            return;
        }
        if (this.et) {
            if (this.ep == 0) {
                this.bg = true;
                this.bh = 0;
                this.am = (byte)11;
                this.ep = 1;
            }
            return;
        }
        if (this.o == 1) {
            if (this.ep == 100) {
                p.b(G[this.aH[this.aJ]], 0);
                this.bA.a((byte)0, true);
                this.bA.a((k)null);
                eF.a(this.bA);
                ++this.ep;
                return;
            }
            if (this.ep == 101) {
                byte by = -1;
                int n3 = -1;
                boolean bl = true;
                for (int i2 = 0; i2 < this.aF; ++i2) {
                    if (this.aQ[i2] == 2 || (this.aL[i2] == null || this.aL[i2].v == 3) && this.i(i2) == 0) continue;
                    n3 = i2;
                    if (by != -1 && by != this.aI[i2]) {
                        bl = false;
                        break;
                    }
                    by = this.aI[i2];
                }
                if (bl) {
                    this.bQ = false;
                    this.az = false;
                    String string = k.a(38, "" + (this.aI[n3] + 1));
                    String string2 = k.a(81, string) + "\n(";
                    for (int i3 = 0; i3 < this.aF; ++i3) {
                        if (this.aQ[i3] == 2 || this.aI[i3] != this.aI[n3]) continue;
                        string2 = string2 + " " + k.l(88 + this.aH[i3]) + " ";
                    }
                    string2 = string2 + ")";
                    f f2 = this.a(null, string2, this.d, this.f, -1);
                    f2.a(this);
                    eF.a(f2);
                    if (this.aQ[n3] == 1) {
                        p.b(0, 1);
                    } else {
                        p.b(4, 1);
                    }
                    this.j(15);
                    ++this.ep;
                    return;
                }
            } else if (this.ep == 102) {
                this.bg = true;
                this.bh = 0;
                this.am = (byte)11;
                ++this.ep;
            }
            return;
        }
        if (this.bd != 1 || this.o != 0 || this.ep == -1) {
            return;
        }
        if (this.eu != -1) {
            if (this.c(this.eu, this.ev)) {
                this.eu = -1;
                this.ev = -1;
            } else {
                return;
            }
        }
        if (this.am != 11) {
            boolean bl = true;
            for (n2 = 0; n2 < this.aN[0]; ++n2) {
                if (this.aM[0][n2].v == 3) continue;
                bl = false;
                break;
            }
            if (bl && this.i(0) == 0) {
                this.w();
                return;
            }
        }
        if (this.ap == 0) {
            switch (this.ep) {
                case 0: {
                    ++this.ep;
                    break;
                }
                case 1: {
                    eF.a(this.ei);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 2: {
                    this.ci = true;
                    this.a(0, 8, (byte)0).a(3, 8, false);
                    this.a(1, 9, (byte)0).a(4, 9, false);
                    this.a(0, 10, (byte)0).a(3, 10, false);
                    this.k(5, 9);
                    break;
                }
                case 3: {
                    this.k(9, 3);
                    this.az = true;
                    break;
                }
                case 4: {
                    this.j(10);
                    this.dl = 20;
                    m.c = m.b;
                    ++this.ep;
                    break;
                }
                case 5: {
                    this.a(k.l(221), (byte)2, (byte)4);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 6: {
                    m m2 = this.a(9, 3, (byte)0);
                    m2.a(400);
                    this.a(this.af, m2.Y + 8, m2.Z + 8, 0, 0, 2, 50);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 7: {
                    this.a(k.l(222), (byte)2, (byte)4);
                    ++this.ep;
                    break;
                }
                case 8: {
                    m m3 = this.a(9, 3, (byte)0);
                    this.a(this.ae, m3.Y + 8, m3.Z + 8, 0, 0, 1, 50);
                    this.a(this.ad, m3.Y, m3.Z, 0, -3, 1, 100);
                    m3.a();
                    this.j(20);
                    ++this.ep;
                    break;
                }
                case 9: {
                    this.az = false;
                    this.k(this.aL[0].n, this.aL[0].o);
                    break;
                }
                case 10: {
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 11: {
                    this.a(k.l(223), (byte)0, (byte)4);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 12: {
                    this.a(k.l(224), (byte)5, (byte)4);
                    ++this.ep;
                    break;
                }
                case 13: {
                    this.u();
                    ++this.ep;
                    break;
                }
                case 14: {
                    if (this.bR != 0) break;
                    this.bw = 0;
                    ++this.ep;
                    break;
                }
                case 15: {
                    if (this.aJ != 0 || this.am != 1 || this.do != 0) break;
                    this.bw = 1;
                    ++this.ep;
                    break;
                }
                case 16: {
                    if (this.aJ != 0 || this.eo == null) break;
                    this.bw = 2;
                    ++this.ep;
                    break;
                }
                case 17: {
                    if (this.aJ != 0 || this.eo == null) break;
                    this.bw = 3;
                    ++this.ep;
                    break;
                }
                case 18: {
                    if (this.b(-1, 2, (byte)0) >= 3) {
                        this.bw = 4;
                        ++this.ep;
                        break;
                    }
                    if (this.aK < 1) break;
                    ++this.ep;
                    break;
                }
                case 19: {
                    if (this.aK < 2) break;
                    this.bw = 5;
                    ++this.ep;
                    break;
                }
                case 20: {
                    this.bw = 6;
                    ++this.ep;
                    break;
                }
                case 21: {
                    if (this.am != 1 || this.aJ != 0) break;
                    this.bw = 7;
                    ++this.ep;
                    break;
                }
                case 22: {
                    if (this.b(-1, -1, (byte)1) != 0) break;
                    this.bQ = false;
                    this.j(20);
                    ++this.ep;
                    break;
                }
                case 23: {
                    this.k(1, 1);
                    break;
                }
                case 24: {
                    m m4 = m.a((byte)1, (byte)1, 1, 1);
                    m4.a(1, 2, false, true);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 25: {
                    this.k(10, 10);
                    break;
                }
                case 26: {
                    m m5 = m.a((byte)0, (byte)1, 10, 10);
                    m5.a(10, 9, false, true);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 27: {
                    this.k(this.aL[0].n, this.aL[0].o);
                    break;
                }
                case 28: {
                    this.a(k.l(225), (byte)5, (byte)4);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 29: {
                    this.a(k.l(226), (byte)0, (byte)4);
                    this.bQ = true;
                    ++this.ep;
                    break;
                }
                case 30: {
                    if (this.b(-1, -1, (byte)1) != 0 || this.am != 0) break;
                    this.bQ = false;
                    this.az = false;
                    this.j(30);
                    ++this.ep;
                    break;
                }
                case 31: {
                    this.cg = true;
                    this.cf = 0;
                    this.j(20);
                    ++this.ep;
                    break;
                }
                case 32: {
                    this.a(k.l(227), (byte)2, (byte)4);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 33: {
                    this.a(k.l(228), (byte)0, (byte)4);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 34: {
                    this.a(k.l(229), (byte)2, (byte)4);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 35: {
                    this.a(k.l(230), (byte)0, (byte)4);
                    this.j(15);
                    ++this.ep;
                    break;
                }
                case 36: {
                    this.v();
                }
            }
        } else if (this.ap == 1) {
            switch (this.ep) {
                case 1: {
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 2: {
                    this.dl = 4;
                    this.k(12, 3);
                    break;
                }
                case 3: {
                    this.a(k.l(231), (byte)1, (byte)4);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 4: {
                    this.a(k.l(232), (byte)3, (byte)4);
                    this.k(this.aL[0].n, this.aL[0].o);
                    break;
                }
                case 5: {
                    this.a(k.l(233), (byte)5, (byte)4);
                    this.k(7, 3);
                    break;
                }
                case 6: {
                    m.c = (byte)2;
                    this.ej = m.a((byte)0, (byte)1, 7, 3);
                    this.ek = m.a((byte)11, (byte)1, 7, 3);
                    this.el = m.a((byte)0, (byte)1, 7, 3);
                    this.ej.H = this.ek;
                    this.ek.H = this.el;
                    this.ej.a(6, -2, false);
                    this.j(30);
                    ++this.ep;
                    break;
                }
                case 7: {
                    if (this.el.n != 6 || this.el.o != 1) break;
                    m.c = (byte)4;
                    this.em = m.a((byte)0, (byte)0, 7, 3);
                    this.em.a(6, 2, false);
                    this.ek.H = null;
                    this.a(k.l(234), (byte)2, (byte)4);
                    ++this.ep;
                    break;
                }
                case 8: {
                    if (this.em.v == 1) break;
                    this.em.a(400);
                    this.a(this.af, this.em.Y + 8, this.em.Z + 8, 0, 0, 2, 50);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 9: {
                    this.a(k.l(235), (byte)2, (byte)4);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 10: {
                    this.a(this.ad, this.em.Y, this.em.Z, 0, -3, 1, 100);
                    this.a(this.ae, this.em.Y + 8, this.em.Z + 8, 0, 0, 1, 50);
                    this.em.a();
                    this.em = null;
                    this.j(15);
                    ++this.ep;
                    break;
                }
                case 11: {
                    m.c = m.b;
                    this.ej.a();
                    this.ek.a();
                    this.ej = null;
                    this.ek = null;
                    this.el = null;
                    this.dl = 20;
                    this.k(this.aL[0].n, this.aL[0].o);
                    break;
                }
                case 12: {
                    this.a(k.l(236), (byte)5, (byte)4);
                    ++this.ep;
                    break;
                }
                case 13: {
                    this.a(k.l(237), (byte)1, (byte)4);
                    ++this.ep;
                    break;
                }
                case 14: {
                    this.k(3, 5);
                    break;
                }
                case 15: {
                    this.a(k.l(238), (byte)5, (byte)4);
                    ++this.ep;
                    break;
                }
                case 16: {
                    this.k(this.aL[0].n, this.aL[0].o);
                    break;
                }
                case 17: {
                    this.bw = 8;
                    ++this.ep;
                    break;
                }
                case 18: {
                    this.bw = 9;
                    ++this.ep;
                    break;
                }
                case 19: {
                    this.u();
                    ++this.ep;
                    break;
                }
                case 20: {
                    if (this.am != 9 || this.aJ != 0) break;
                    this.bw = 10;
                    ++this.ep;
                    break;
                }
                case 21: {
                    this.bw = 11;
                    ++this.ep;
                    break;
                }
                case 22: {
                    if (this.aL[0].v != 3 && this.aL[1].v != 3) break;
                    this.bw = 12;
                    ++this.ep;
                    break;
                }
                case 23: {
                    if (this.b(-1, -1, (byte)1) != 0 || this.i(1) != 0) break;
                    this.bQ = false;
                    this.j(20);
                    ++this.ep;
                    break;
                }
                case 24: {
                    this.k(this.aL[0].n, this.aL[0].o);
                    break;
                }
                case 25: {
                    this.a(k.l(239), (byte)1, (byte)4);
                    ++this.ep;
                    break;
                }
                case 26: {
                    this.a(k.l(240), (byte)5, (byte)4);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 27: {
                    this.v();
                }
            }
        } else if (this.ap == 2) {
            block68 : switch (this.ep) {
                case 0: {
                    if (this.ej.v == 1) break;
                    this.ej.a(7, 14, false);
                    ++this.ep;
                    break;
                }
                case 1: {
                    if (this.ek.v == 1) break;
                    this.ek.a(7, 15, false);
                    this.j(20);
                    ++this.ep;
                    break;
                }
                case 2: {
                    m.c = m.b;
                    this.ej = null;
                    this.ek = null;
                    this.el = null;
                    this.a(k.l(241), (byte)5, (byte)4);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 3: {
                    this.a(k.l(242), (byte)0, (byte)4);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 4: {
                    this.a(k.l(243), (byte)5, (byte)4);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 5: {
                    this.bw = 14;
                    ++this.ep;
                    break;
                }
                case 6: {
                    this.u();
                    ++this.ep;
                    break;
                }
                case 7: 
                case 8: {
                    if (this.ep == 7 && this.aJ == 0 && this.bR == 0 && this.b(-1, 3, (byte)-1) >= 1) {
                        this.bw = 15;
                        ++this.ep;
                    }
                    m[] mArray = this.c(-1, 2, (byte)0);
                    for (n2 = 0; n2 < mArray.length; ++n2) {
                        if (mArray[n2].n > 4 && mArray[n2].o > 10) continue;
                        this.j(10);
                        this.bQ = false;
                        this.az = false;
                        this.ep = 9;
                        break block68;
                    }
                    break;
                }
                case 9: {
                    this.k(0, 8);
                    m.a((byte)5, (byte)1, -1, 8).a(0, 8, false);
                    m.a((byte)5, (byte)1, -2, 7).a(1, 7, false);
                    this.j(20);
                    break;
                }
                case 10: {
                    this.k(8, 6);
                    m.a((byte)5, (byte)1, 12, 6).a(8, 6, false);
                    this.j(20);
                    break;
                }
                case 11: {
                    this.k(2, 1);
                    m.a((byte)5, (byte)1, 1, -2).a(1, 2, false);
                    m.a((byte)5, (byte)1, 3, -2).a(3, 2, false);
                    m.a((byte)4, (byte)1, 2, -1).a(2, 1, false);
                    this.j(20);
                    break;
                }
                case 12: {
                    this.a(k.l(244), (byte)5, (byte)4);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 13: {
                    this.k(4, 8);
                    this.j(15);
                    break;
                }
                case 14: {
                    m m6 = m.a((byte)2, (byte)1, 3, 8);
                    m m7 = m.a((byte)2, (byte)1, 4, 7);
                    m m8 = m.a((byte)2, (byte)1, 5, 8);
                    this.a(this.ae, m6.Y + 8, m6.Z + 8, 0, 0, 1, 50);
                    this.a(this.ae, m7.Y + 8, m7.Z + 8, 0, 0, 1, 50);
                    this.a(this.ae, m8.Y + 8, m8.Z + 8, 0, 0, 1, 50);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 15: {
                    this.a(k.l(245), (byte)5, (byte)4);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 16: {
                    this.a(k.l(246), (byte)-1, (byte)4);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 17: {
                    this.a(k.l(247), (byte)0, (byte)4);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 18: {
                    eF.a(this.a(null, k.l(248), this.d, 1500));
                    ++this.ep;
                    break;
                }
                case 19: {
                    this.a(3, 8, (byte)0).a();
                    this.a(4, 7, (byte)0).a();
                    this.a(5, 8, (byte)0).a();
                    m m9 = m.a((byte)2, (byte)0, 3, 8);
                    m m10 = m.a((byte)2, (byte)0, 4, 7);
                    m m11 = m.a((byte)2, (byte)0, 5, 8);
                    this.a(this.ae, m9.Y + 8, m9.Z + 8, 0, 0, 1, 50);
                    this.a(this.ae, m10.Y + 8, m10.Z + 8, 0, 0, 1, 50);
                    this.a(this.ae, m11.Y + 8, m11.Z + 8, 0, 0, 1, 50);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 20: {
                    this.bQ = true;
                    this.az = true;
                    this.bw = 13;
                    ++this.ep;
                    break;
                }
                case 21: {
                    if (this.b(-1, -1, (byte)1) != 0) break;
                    this.bQ = false;
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 22: {
                    this.v();
                }
            }
        } else if (this.ap == 3) {
            switch (this.ep) {
                case 0: {
                    eF.a(this.ei);
                    this.ci = true;
                    ++this.ep;
                    break;
                }
                case 1: {
                    if (this.aL[0].v == 1) break;
                    this.dk = null;
                    this.j(20);
                    ++this.ep;
                    break;
                }
                case 2: {
                    this.cg = true;
                    this.ci = true;
                    this.cf = 0;
                    this.j(20);
                    ++this.ep;
                    break;
                }
                case 3: {
                    this.a(k.l(249), (byte)2, (byte)4);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 4: {
                    this.a(k.l(250), (byte)0, (byte)4);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 5: {
                    this.a(k.l(251), (byte)5, (byte)4);
                    this.g(13, 3);
                    this.d(520, 120);
                    this.aL[0].a(7, 1);
                    this.ej.a(5, 4);
                    this.ek.a(7, 5);
                    this.el.a(3, 3);
                    this.ej = null;
                    this.ek = null;
                    this.el = null;
                    this.dl = 2;
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 6: {
                    this.cg = false;
                    this.ch = true;
                    this.cf = 0;
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 7: {
                    this.k(13, 10);
                    break;
                }
                case 8: {
                    m.c = (byte)2;
                    this.dl = 4;
                    this.ej = this.a(10, 10, (byte)0);
                    this.ej.a(6, 10, false);
                    this.g(6, 10);
                    this.k(6, 10);
                    break;
                }
                case 9: {
                    if (this.ej.v == 1) break;
                    this.ej = null;
                    this.az = true;
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 10: {
                    this.g(4, 9);
                    this.k(4, 9);
                    this.a(this.af, 168, 368, 0, 0, 1, 50);
                    this.j(15);
                    break;
                }
                case 11: {
                    this.aV = m.a((byte)0, (byte)0, 4, 9, false);
                    this.aV.l = (byte)-1;
                    this.aV.v = (byte)4;
                    this.ba = 6;
                    this.j(20);
                    ++this.ep;
                    break;
                }
                case 12: {
                    this.a(k.l(252), (byte)5, (byte)4);
                    this.k(7, 1);
                    break;
                }
                case 13: {
                    this.a(k.l(253), (byte)0, (byte)4);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 14: {
                    this.bw = 17;
                    ++this.ep;
                    break;
                }
                case 15: {
                    this.u();
                    ++this.ep;
                    break;
                }
                case 16: {
                    if (this.b(-1, -1, (byte)1) != 0 || this.i(1) != 0) break;
                    this.j(15);
                    this.bQ = false;
                    ++this.ep;
                    break;
                }
                case 17: {
                    this.a(k.l(254), (byte)5, (byte)4);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 18: {
                    this.a(k.l(255), (byte)0, (byte)4);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 19: {
                    this.v();
                }
            }
        } else if (this.ap == 4) {
            if (this.en == null) {
                this.en = this.c(11, -1, (byte)0)[0];
            }
            if (this.ep == 25 && this.en.n >= 15 && this.en.o >= 11 && this.en.v == 2) {
                this.j(10);
                this.bQ = false;
                this.az = false;
                this.ep = 26;
                return;
            }
            if (this.en.v == 3) {
                this.en = null;
                this.w();
                return;
            }
            block114 : switch (this.ep) {
                case 0: {
                    this.j(50);
                    ++this.ep;
                    break;
                }
                case 1: {
                    this.a(k.l(256), (byte)5, (byte)4);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 2: {
                    this.a(k.l(257), (byte)0, (byte)4);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 3: {
                    this.u();
                    ++this.ep;
                    break;
                }
                case 4: {
                    m[] mArray = this.c(-1, -1, (byte)0);
                    for (n2 = 0; n2 < mArray.length; ++n2) {
                        if (mArray[n2].v != 2 || mArray[n2].n > 8) continue;
                        this.bQ = false;
                        this.j(5);
                        ++this.ep;
                        break block114;
                    }
                    break;
                }
                case 5: {
                    this.az = false;
                    this.k(4, 4);
                    break;
                }
                case 6: {
                    m.a((byte)10, (byte)1, 4, 4).a(4, 1, false, true);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 7: {
                    m.a((byte)1, (byte)1, 4, 4).a(5, 2, false, true);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 8: {
                    m.a((byte)10, (byte)1, 4, 4).a(4, 3, false, true);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 9: {
                    this.a(k.l(258), (byte)5, (byte)4);
                    this.k(this.aL[0].n, this.aL[0].o);
                    break;
                }
                case 10: {
                    this.bQ = true;
                    this.az = true;
                    ++this.ep;
                    break;
                }
                case 11: {
                    m[] mArray = this.c(-1, -1, (byte)0);
                    for (n2 = 0; n2 < mArray.length; ++n2) {
                        if (mArray[n2].v != 2 || mArray[n2].o < 7) continue;
                        this.bQ = false;
                        this.az = false;
                        this.k(6, 10);
                        break block114;
                    }
                    break;
                }
                case 12: {
                    m.a((byte)1, (byte)1, 6, 10).a(5, 10, false, true);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 13: {
                    m.a((byte)5, (byte)1, 6, 10).a(7, 8, false, true);
                    this.j(15);
                    ++this.ep;
                    break;
                }
                case 14: {
                    m.a((byte)5, (byte)1, 6, 10).a(7, 9, false, true);
                    this.bQ = true;
                    this.az = true;
                    ++this.ep;
                    break;
                }
                case 15: {
                    m[] mArray = this.c(-1, -1, (byte)0);
                    for (n2 = 0; n2 < mArray.length; ++n2) {
                        if (mArray[n2].v != 2 || mArray[n2].n < 8 || mArray[n2].o < 6) continue;
                        this.bQ = false;
                        this.az = false;
                        this.k(12, 5);
                        break block114;
                    }
                    break;
                }
                case 16: {
                    m.a((byte)5, (byte)1, 12, 5).a(12, 7, false, true);
                    this.j(15);
                    ++this.ep;
                    break;
                }
                case 17: {
                    m.a((byte)6, (byte)1, 12, 5).a(12, 6, false, true);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 18: {
                    m.a((byte)5, (byte)1, 12, 5).a(12, 5, false, true);
                    this.bQ = true;
                    this.az = true;
                    ++this.ep;
                    break;
                }
                case 19: {
                    m[] mArray = this.c(-1, -1, (byte)0);
                    for (n2 = 0; n2 < mArray.length; ++n2) {
                        if (mArray[n2].v != 2 || mArray[n2].n < 15 || mArray[n2].o < 8) continue;
                        this.bQ = false;
                        this.az = false;
                        this.k(18, 8);
                        break block114;
                    }
                    break;
                }
                case 20: {
                    m.a((byte)5, (byte)1, 18, 8).a(16, 10, false, true);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 21: {
                    m.a((byte)6, (byte)1, 18, 8).a(17, 10, false, true);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 22: {
                    m.a((byte)5, (byte)1, 18, 8).a(18, 10, false, true);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 23: {
                    m.a((byte)1, (byte)1, 18, 8).a(18, 9, false, true);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 24: {
                    this.a(k.l(259), (byte)0, (byte)4);
                    this.bQ = true;
                    this.az = true;
                    ++this.ep;
                    break;
                }
                case 25: {
                    if (this.b(-1, -1, (byte)1) != 0) break;
                    this.bQ = false;
                    this.az = false;
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 26: {
                    this.v();
                    ++this.ep;
                }
            }
        } else if (this.ap == 5) {
            switch (this.ep) {
                case 0: {
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 1: {
                    this.a(k.l(260), (byte)1, (byte)4);
                    ++this.ep;
                    break;
                }
                case 2: {
                    this.u();
                    ++this.ep;
                    break;
                }
                case 3: {
                    if (this.b(-1, -1, (byte)1) != 0 || this.i(1) != 0) break;
                    this.bQ = false;
                    this.az = false;
                    this.j(15);
                    ++this.ep;
                    break;
                }
                case 4: {
                    this.k(this.aL[0].n, this.aL[0].o);
                    break;
                }
                case 5: {
                    this.a(k.l(261), (byte)0, (byte)4);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 6: {
                    this.v();
                }
            }
        } else if (this.ap == 6) {
            if (this.ep <= 10) {
                if (this.en == null) {
                    this.en = this.c(11, -1, (byte)0)[0];
                }
                if (this.en.v == 3) {
                    this.en = null;
                    this.w();
                    return;
                }
            }
            switch (this.ep) {
                case 0: {
                    if (this.aL[0].v == 1) break;
                    this.dk = null;
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 1: {
                    this.a(k.l(262), (byte)5, (byte)4);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 2: {
                    this.a(k.l(263), (byte)0, (byte)4);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 3: {
                    m[] mArray = this.c(-1, -1, (byte)0);
                    for (n2 = 0; n2 < mArray.length; ++n2) {
                        mArray[n2].H = null;
                    }
                    this.u();
                    ++this.ep;
                    break;
                }
                case 4: {
                    if (this.aK < 2) break;
                    this.j(15);
                    this.bQ = false;
                    this.az = false;
                    this.k(11, 7);
                    break;
                }
                case 5: {
                    m m12 = m.a((byte)5, (byte)1, 11, 8);
                    m12.b(this.aw);
                    m12.a(14, 7, true);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 6: {
                    m m13 = m.a((byte)0, (byte)1, 11, 8);
                    m13.b(this.aw);
                    m13.a(13, 7, true);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 7: {
                    m m14 = m.a((byte)3, (byte)1, 11, 8);
                    m14.b(this.aw);
                    m14.a(12, 7, true);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 8: {
                    m m15 = m.a((byte)1, (byte)1, 11, 8);
                    m15.a(13, 8, false);
                    this.j(20);
                    ++this.ep;
                    break;
                }
                case 9: {
                    this.a(k.l(264), (byte)5, (byte)4);
                    this.bQ = true;
                    this.az = true;
                    this.k(this.aL[0].n, this.aL[0].o);
                    break;
                }
                case 10: {
                    boolean bl = false;
                    m[] mArray = this.c(-1, 2, (byte)0);
                    for (int i4 = 0; i4 < mArray.length; ++i4) {
                        if (mArray[i4].n > 9 && mArray[i4].o < 10) continue;
                        bl = true;
                        break;
                    }
                    if (!bl && this.b(-1, -1, (byte)1) != 0) break;
                    this.az = false;
                    this.bQ = false;
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 11: {
                    this.ej = this.c(11, -1, (byte)0)[0];
                    this.ek = m.a((byte)8, (byte)1, this.T, this.ej.o);
                    this.k(this.T - 1, this.ej.o);
                    this.az = false;
                    break;
                }
                case 12: {
                    this.ek.a((int)this.ej.n, (int)this.ej.o, false);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 13: {
                    this.a(k.l(265), (byte)5, (byte)4);
                    this.dk = this.ek;
                    ++this.ep;
                    break;
                }
                case 14: {
                    if (this.ek.v == 1) break;
                    this.a(k.l(266), (byte)0, (byte)4);
                    this.ek.a(-1, (int)this.ek.o, false);
                    this.j(3);
                    ++this.ep;
                    break;
                }
                case 15: {
                    this.ej.a(-1, (int)this.ek.o, false);
                    ++this.ep;
                    break;
                }
                case 16: {
                    if (this.ek.v == 1) break;
                    this.j(10);
                    this.ej.a();
                    this.ek.a();
                    this.g(0, this.ek.o);
                    this.ej = null;
                    this.ek = null;
                    this.dk = null;
                    ++this.ep;
                    break;
                }
                case 17: {
                    this.k(1, 9);
                    break;
                }
                case 18: {
                    this.aL[1] = m.a((byte)9, (byte)1, -2, 8);
                    this.aL[1].a(0, 8, false);
                    m.a((byte)0, (byte)1, -1, 8).a(3, 8, false);
                    m.a((byte)0, (byte)1, -1, 10).a(1, 10, false);
                    m.a((byte)8, (byte)1, -3, 7).a(4, 8, false);
                    m.a((byte)8, (byte)1, -3, 11).a(2, 10, false);
                    m.a((byte)4, (byte)1, -2, 9).a(2, 9, false);
                    m.a((byte)6, (byte)1, -4, 9).a(4, 9, false);
                    m.a((byte)6, (byte)1, -6, 9).a(5, 10, false);
                    this.j(50);
                    ++this.ep;
                    break;
                }
                case 19: {
                    this.a(k.l(267), (byte)3, (byte)4);
                    ++this.ep;
                    break;
                }
                case 20: {
                    this.k(13, 14);
                    break;
                }
                case 21: {
                    m.a((byte)0, (byte)1, 13, 14).a(12, 14, false);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 22: {
                    m.a((byte)6, (byte)1, 13, 14).a(14, 14, false);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 23: {
                    m.a((byte)2, (byte)1, 13, 14).a(13, 12, false);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 24: {
                    m.a((byte)3, (byte)1, 13, 14).a(13, 15, false);
                    this.j(15);
                    ++this.ep;
                    break;
                }
                case 25: {
                    this.a(k.l(268), (byte)5, (byte)4);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 26: {
                    this.a(k.l(269), (byte)0, (byte)4);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 27: {
                    this.k(13, 17);
                    break;
                }
                case 28: {
                    m m16 = m.a((byte)9, (byte)0, 13, 18);
                    m16.b(2);
                    m16.a(13, 16, false);
                    m.a((byte)6, (byte)0, 12, 18).a(12, 16, false);
                    m.a((byte)8, (byte)0, 14, 19).a(14, 16, false);
                    m.a((byte)4, (byte)0, 13, 19).a(13, 17, false);
                    m.a((byte)1, (byte)0, 12, 19).a(12, 17, false);
                    this.j(20);
                    ++this.ep;
                    break;
                }
                case 29: {
                    this.a(k.l(270), (byte)1, (byte)4);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 30: {
                    this.k(this.aL[0].n, this.aL[0].o);
                    break;
                }
                case 31: {
                    this.bw = 18;
                    ++this.ep;
                    break;
                }
                case 32: {
                    this.bQ = true;
                    this.az = true;
                    this.bA = this.a(k.l(121 + this.ap), k.l(138), this.d, -1);
                    this.bA.a((byte)0, true);
                    this.bA.a((k)null);
                    eF.a(this.bA);
                    ++this.ep;
                    break;
                }
                case 33: {
                    if (this.b(-1, -1, (byte)1) != 0 || this.i(1) != 0) break;
                    this.bQ = false;
                    this.az = false;
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 34: {
                    this.v();
                }
            }
        } else if (this.ap == 7) {
            switch (this.ep) {
                case 0: {
                    eF.a(this.ei);
                    this.ci = true;
                    ++this.ep;
                    break;
                }
                case 1: {
                    if (this.ch) break;
                    this.a(k.l(271), (byte)0, (byte)4);
                    ++this.ep;
                    break;
                }
                case 2: {
                    this.k(this.aL[1].n, this.aL[1].o);
                    break;
                }
                case 3: {
                    this.a(k.l(272), (byte)4, (byte)4);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 4: {
                    this.a(k.l(273), (byte)1, (byte)4);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 5: {
                    this.a(k.l(274), (byte)4, (byte)4);
                    ++this.ep;
                    break;
                }
                case 6: {
                    this.ej = this.a(5, 2, (byte)0);
                    this.ej.a(7, 2, false);
                    ++this.ep;
                    break;
                }
                case 7: {
                    if (this.ej.v == 1) break;
                    this.ej.a();
                    this.ej = null;
                    this.ek = this.a(7, 3, (byte)0);
                    this.ek.a(7, 2, false);
                    ++this.ep;
                    break;
                }
                case 8: {
                    if (this.ek.v == 1) break;
                    this.ek.a();
                    this.ek = null;
                    this.el = this.a(9, 2, (byte)0);
                    this.el.a(7, 2, false);
                    ++this.ep;
                    break;
                }
                case 9: {
                    if (this.el.v == 1) break;
                    this.el.a();
                    this.el = null;
                    this.aL[1].a(7, 2, false);
                    this.j(20);
                    ++this.ep;
                    break;
                }
                case 10: {
                    this.k(9, 15);
                    this.az = true;
                    break;
                }
                case 11: {
                    f f3 = this.a(null, k.l(279), this.d, 2000);
                    f3.a(this.e, 2, 17);
                    eF.a(f3);
                    ++this.ep;
                    break;
                }
                case 12: {
                    this.cv = false;
                    this.a(this.a(9, 15, (byte)0));
                    ++this.ep;
                    break;
                }
                case 13: {
                    if (this.cu < 2) break;
                    this.a(k.l(275), (byte)0, (byte)4);
                    m m17 = this.a(9, 15, (byte)0);
                    m17.a();
                    this.cv = true;
                    this.j(20);
                    ++this.ep;
                    break;
                }
                case 14: {
                    this.az = false;
                    this.a(k.l(276), (byte)4, (byte)4);
                    ++this.ep;
                    break;
                }
                case 15: {
                    this.a(k.l(277), (byte)1, (byte)4);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 16: {
                    this.az = true;
                    this.dl = 4;
                    this.k(3, 9);
                    break;
                }
                case 17: {
                    this.k(13, 4);
                    break;
                }
                case 18: {
                    this.dl = 20;
                    this.a(k.l(278), (byte)5, (byte)4);
                    this.k(this.aL[0].n, this.aL[0].o);
                    break;
                }
                case 19: {
                    this.u();
                    ++this.ep;
                    break;
                }
                case 20: {
                    if (!this.cw) break;
                    this.az = false;
                    this.bQ = false;
                    this.j(20);
                    ++this.ep;
                    break;
                }
                case 21: {
                    this.cg = true;
                    this.cf = 0;
                    this.ci = true;
                    ++this.ep;
                    break;
                }
                case 22: {
                    if (this.cf < 16) break;
                    this.e(7, 2);
                    this.g(7, 2);
                    this.i();
                    this.aL[1] = m.a((byte)9, (byte)1, 7, 2);
                    this.aL[1].b(3);
                    m.a((byte)9, (byte)0, 6, 3);
                    m m18 = m.a((byte)9, (byte)0, 8, 3);
                    m18.b(2);
                    m.a((byte)0, (byte)0, 6, 1);
                    m.a((byte)0, (byte)0, 8, 1);
                    this.j(10);
                    ++this.ep;
                    p.b(1, 0);
                    break;
                }
                case 23: {
                    this.cg = false;
                    this.ch = true;
                    this.cf = 0;
                    ++this.ep;
                    break;
                }
                case 24: {
                    if (this.cf < 16) break;
                    this.a(k.l(281), (byte)4, (byte)4);
                    this.j(15);
                    ++this.ep;
                    break;
                }
                case 25: {
                    this.a(k.l(282), (byte)0, (byte)4);
                    this.j(8);
                    ++this.ep;
                    break;
                }
                case 26: {
                    this.a(k.l(283), (byte)4, (byte)4);
                    this.j(15);
                    ++this.ep;
                    break;
                }
                case 27: {
                    this.a(this.ae, 288, 88, 0, 0, 1, 50);
                    this.aA.removeElement(this.aL[1]);
                    this.j(15);
                    ++this.ep;
                    break;
                }
                case 28: {
                    this.k(5000);
                    this.j(10);
                    ++this.ep;
                    break;
                }
                case 29: {
                    this.a(k.l(284), (byte)5, (byte)4);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 30: {
                    this.a(k.l(285), (byte)2, (byte)4);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 31: {
                    this.a(k.l(286), (byte)1, (byte)4);
                    this.j(5);
                    ++this.ep;
                    break;
                }
                case 32: {
                    this.a(k.l(287), (byte)0, (byte)4);
                    this.cg = true;
                    this.cf = 0;
                    ++this.ep;
                    break;
                }
                case 33: {
                    if (this.cf < 16) break;
                    this.j(10);
                    this.eA = false;
                    ++this.ep;
                    break;
                }
                case 34: {
                    ++this.ep;
                    break;
                }
                case 35: {
                    p.b(0, 0);
                    this.a(k.l(288));
                    ++this.ep;
                    break;
                }
                case 36: {
                    this.ew = 0;
                    this.am = (byte)14;
                    ++this.ep;
                }
            }
        }
        this.eo = null;
    }

    public final void u() {
        this.ei = null;
        this.dl = 20;
        m.c = m.b;
        this.bA.a((byte)0, true);
        this.bA.a((byte)1, false);
        eF.a(this.bA);
        this.az = true;
        this.bQ = true;
        this.bS = false;
        p.b(2, 0);
    }

    public final void k(int n2, int n3) {
        this.eu = n2;
        this.ev = n3;
        this.g(n2, n3);
        ++this.ep;
    }

    public final void v() {
        p.h();
        p.c(0, 1);
        eF.a(this.a(null, k.l(72), this.d, 3000));
        this.aE = this.ao;
        this.ep = -1;
        this.ew = 0;
        this.am = (byte)10;
    }

    public final void w() {
        this.et = true;
        this.ep = 0;
        this.j(20);
        p.h();
        p.c(4, 1);
    }

    public final void b(m m2, m m3) throws Exception {
        System.gc();
        this.eE = new a(this);
        this.bh = 0;
        this.ey = false;
        this.bl = m2;
        this.bm = m3;
        this.eE.a(this, m2);
        this.eE.b(this, m3);
        this.eE.i = m2.c(m3);
        System.out.println("def_die:" + this.eE.i);
        if (m3.c(m2, m2.n, m2.o)) {
            this.eE.j = m3.c(m2);
            System.out.println("off_die:" + this.eE.j);
            this.eD = true;
        } else {
            this.eD = false;
        }
        this.eE.x = this.eD;
        p.c(H[this.aH[this.aJ]], 0);
        this.bd = (byte)2;
    }

    public final void x() throws Exception {
        if (this.eA && this.ao - this.eC >= this.eB) {
            this.eA = false;
        }
        if (this.ey) {
            System.out.println("currentGameTime - stageDoneTime=" + (this.ao - this.ex));
            if (this.ao - this.ex >= 300L) {
                this.ez.removeAllElements();
                this.aS = new Vector();
                this.h();
                this.bd = 1;
                p.h();
                p.c(G[this.aH[this.aJ]], 0);
                eF.d();
                this.cP = true;
                this.cQ = true;
                return;
            }
        }
    }

    public final void g(Graphics graphics) {
        try {
            this.eE.a(graphics);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void k(int n2) {
        this.eA = true;
        this.eB = n2;
        this.eC = this.ao;
    }

    public final void run() {
    }

    public final void a(f f2) {
        if (this.bd == 0 || this.am != 0) {
            this.a(this.A, this.bO, this.bP, f2);
            return;
        }
        this.cG = this.a(null, k.l(87), this.d, -1);
        this.cG.a((byte)0, true);
        this.cG.a(f2);
        eF.a(this.cG);
    }

    static {
        int[][][] nArrayArray = new int[][][]{new int[0][], new int[][]{{150, 217, 244}, {65, 149, 233}, {0, 100, 198}, {12, 53, 112}}, new int[][]{{244, 158, 156}, {219, 36, 113}, {161, 0, 112}, {95, 5, 120}}, new int[][]{{171, 237, 90}, {99, 190, 37}, {0, 153, 55}, {0, 85, 82}}, new int[][]{{0, 118, 150}, {0, 65, 114}, {0, 43, 75}, {0, 22, 48}}};
        F = new int[]{0xA0A0A0, 26054, 15204434, 39473, 16754};
        G = new int[]{-1, 1, 2, 3, 4};
        H = new int[]{-1, 5, 5, 5, 5};
        J = new byte[]{1, 2};
        K = new byte[]{0, 5, 10, 10, 15, 0, 5, 15, 15, 15};
        L = new byte[]{1, 1, 2, 2, 3, 3, 1, 1, 1, 1};
        bv = new int[]{83, 83, 83, 83, 83, 83, 83, 83, 175, 175, 84, 84, 84, 147, 159, 151, 155, 167, 171};
        cS = new String[]{"14281428", "18241824"};
        dK = new byte[]{0, 2, 3, 3, 1, 3, 3, 3, 3, 3, 3, 3};
    }
}

