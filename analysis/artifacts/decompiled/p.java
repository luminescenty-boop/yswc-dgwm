/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.midlet.MIDlet
 *  javax.microedition.rms.RecordStore
 */
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

public final class p
extends Canvas
implements Runnable,
CommandListener {
    int a;
    boolean b = false;
    public static final Font c = Font.getFont((int)0, (int)0, (int)8);
    public static final Font d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final short[] i;
    public static final short[] j;
    public static final byte[][] k;
    private static Display K;
    private boolean L = false;
    private boolean M = true;
    public k l;
    public static int m;
    public static int n;
    public int o = 0;
    public int p;
    public int q = 0;
    public long r;
    public static j[] s;
    public static Random t;
    public static boolean[] u;
    public static String[] v;
    public static byte w;
    public static String[] x;
    public boolean y;
    public boolean z = false;
    public static int A;
    public static int B;
    public static int C;
    public static boolean D;
    d E;
    public static final String[] F;
    public static h G;
    public static int H;
    public static int I;
    public static String[] J;

    public p(MIDlet mIDlet) {
        this.setFullScreenMode(true);
        this.a = 0;
        try {
            k.eF = this;
            k.a("/lang.dat", false);
            m = this.getWidth();
            n = this.getHeight();
            K = Display.getDisplay((MIDlet)mIDlet);
            K.setCurrent((Displayable)this);
            new Thread(this).start();
        }
        catch (Exception exception) {
            this.b(exception.toString());
        }
        this.a();
    }

    public final void a() {
        Timer timer = new Timer();
        timer.schedule((TimerTask)new o(this), 300L, 300L);
    }

    public static final int a(int n2) {
        return p.a(0, n2);
    }

    public static final int a(int n2, int n3) {
        if (n3 > n2) {
            return n2 + Math.abs(t.nextInt()) % (n3 - n2);
        }
        return 0;
    }

    public static final int b() {
        return t.nextInt();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public static final byte[] a(String string, int n2) throws Exception {
        byte[] byArray;
        block10: {
            string = string + n2;
            RecordStore recordStore = null;
            byArray = null;
            recordStore = RecordStore.openRecordStore((String)string, (boolean)false);
            byArray = recordStore.getRecord(1);
            try {
                recordStore.closeRecordStore();
            }
            catch (Exception exception) {}
            break block10;
            catch (Exception exception) {
                try {}
                catch (Throwable throwable) {
                    try {
                        recordStore.closeRecordStore();
                    }
                    catch (Exception exception2) {}
                    throw throwable;
                }
                try {
                    recordStore.closeRecordStore();
                }
                catch (Exception exception3) {}
            }
        }
        return byArray;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public static final void a(String string, int n2, byte[] byArray) throws Exception {
        RecordStore recordStore;
        block13: {
            string = string + n2;
            try {
                RecordStore.deleteRecordStore((String)string);
            }
            catch (Exception exception) {}
            recordStore = null;
            recordStore = RecordStore.openRecordStore((String)string, (boolean)true);
            if (recordStore.getNumRecords() == 0) {
                recordStore.addRecord(byArray, 0, byArray.length);
                break block13;
            }
            recordStore.setRecord(1, byArray, 0, byArray.length);
        }
        try {
            recordStore.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
        catch (Exception exception) {
            try {}
            catch (Throwable throwable) {
                try {
                    recordStore.closeRecordStore();
                }
                catch (Exception exception2) {}
                throw throwable;
            }
            try {
                recordStore.closeRecordStore();
                return;
            }
            catch (Exception exception3) {
                return;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public static final int a(String string) {
        int n2;
        block10: {
            n2 = 0;
            RecordStore recordStore = null;
            recordStore = RecordStore.openRecordStore((String)string, (boolean)true);
            n2 = recordStore.getSizeAvailable();
            try {
                recordStore.closeRecordStore();
            }
            catch (Exception exception) {}
            break block10;
            catch (Exception exception) {
                try {}
                catch (Throwable throwable) {
                    try {
                        recordStore.closeRecordStore();
                    }
                    catch (Exception exception2) {}
                    throw throwable;
                }
                try {
                    recordStore.closeRecordStore();
                }
                catch (Exception exception3) {}
            }
        }
        return n2;
    }

    public static final int a(byte by, String string) {
        return p.s[by].aa * string.length();
    }

    public static final int a(byte by) {
        return p.s[by].ab;
    }

    public static final void a(Graphics graphics, int n2) {
        graphics.setColor(n2);
    }

    public static final void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6) {
        graphics.fillRect(n3, n4, n5, n6);
    }

    protected final void showNotify() {
        this.d();
        if (this.l != null) {
            this.l.d();
        }
    }

    protected final void hideNotify() {
        this.d();
        if (this.l != null) {
            if (!this.z) {
                D = true;
                if (G != null && u[0] && I == 0) {
                    A = H;
                    B = I;
                }
                p.h();
            }
            if (!this.y) {
                this.z = false;
                return;
            }
        } else {
            D = true;
        }
    }

    public static final void a(Graphics graphics, String string, int n2, int n3, int n4, int n5) {
        if ((n5 & 8) != 0) {
            n2 -= p.a((byte)n4, string);
        } else if ((n5 & 1) != 0) {
            n2 -= p.a((byte)n4, string) / 2;
        }
        if ((n5 & 0x20) != 0) {
            n3 -= p.a((byte)n4);
        } else if ((n5 & 2) != 0) {
            n3 -= p.a((byte)n4) / 2;
        }
        p.a(graphics, string, n2, n3, n4);
    }

    public static final void a(Graphics graphics, String string, int n2, int n3, int n4) {
        boolean bl = false;
        int n5 = string.length();
        for (int i2 = 0; i2 < n5; ++i2) {
            char c2 = string.charAt(i2);
            if (c2 < i[n4] || c2 > j[n4]) continue;
            byte by = k[n4][c2 - i[n4]];
            if (by != -1) {
                s[n4].c(by);
                s[n4].a(graphics, n2, n3);
                n2 += p.s[n4].aa;
                continue;
            }
            byte[] byArray = new byte[]{(byte)c2};
            String string2 = new String(byArray);
            graphics.drawString(string2, n2, n3, 20);
            n2 += graphics.getFont().stringWidth(string2);
        }
    }

    public static final void b(Graphics graphics, String string, int n2, int n3, int n4) {
        graphics.drawString(string, n2, n3, n4);
    }

    public final void a(k k2) {
        this.d();
        k2.d();
        this.l = k2;
    }

    public final void c() {
        this.repaint();
        this.serviceRepaints();
    }

    public final void paint(Graphics graphics) {
        if (!this.b) {
            if (this.E == null) {
                this.E = new d(this.getWidth(), this.getHeight());
            }
            if (this.a == 0) {
                this.E.a(graphics);
                if (this.d(1024) && this.E.a == 0) {
                    this.E.b();
                    p.u[0] = true;
                    this.E.c();
                    this.d();
                } else if (this.d(2048) && this.E.a == 0) {
                    this.E.b();
                    p.u[0] = false;
                    p.h();
                    this.d();
                }
                if (this.E.q) {
                    try {
                        Thread.sleep(2000L);
                    }
                    catch (InterruptedException interruptedException) {
                        InterruptedException interruptedException2 = interruptedException;
                        interruptedException.printStackTrace();
                    }
                    this.E.a();
                    if (u[0]) {
                        p.b(0, 0);
                    }
                    this.a = 5;
                }
            }
            if (this.a == 3) {
                this.a = 5;
                return;
            }
        } else {
            if (this.M) {
                graphics.setFont(d);
                graphics.setColor(0);
                graphics.drawString(k.l(58), m / 2, n / 2 - 1, 33);
                return;
            }
            if (D) {
                graphics.setFont(d);
                graphics.setColor(0);
                graphics.fillRect(0, 0, m, n);
                graphics.setColor(0xFFFFFF);
                graphics.drawString(k.l(21), m >> 1, n - e >> 1, 17);
                return;
            }
            this.l.f(graphics);
        }
    }

    public final int getGameAction(int n2) {
        try {
            if (w == 1) {
                switch (n2) {
                    case -6: {
                        return 1024;
                    }
                    case -7: {
                        return 2048;
                    }
                    case 48: {
                        return 32;
                    }
                    case 35: {
                        return 16;
                    }
                    case 57: {
                        return 64;
                    }
                    case 56: {
                        return 128;
                    }
                    case 54: {
                        return 256;
                    }
                    case 55: {
                        return 512;
                    }
                    case 49: {
                        return 1;
                    }
                    case 51: {
                        return 2;
                    }
                    case 50: {
                        return 4;
                    }
                    case 42: {
                        return 8;
                    }
                }
            } else {
                switch (n2) {
                    case -6: {
                        return 1024;
                    }
                    case -11: 
                    case -7: {
                        return 2048;
                    }
                    case 48: {
                        return 32;
                    }
                    case 53: {
                        return 16;
                    }
                    case 49: {
                        return 64;
                    }
                    case 51: {
                        return 128;
                    }
                    case 55: {
                        return 256;
                    }
                    case 57: {
                        return 512;
                    }
                    case 50: {
                        return 1;
                    }
                    case 56: {
                        return 2;
                    }
                    case 52: {
                        return 4;
                    }
                    case 54: {
                        return 8;
                    }
                }
            }
            switch (super.getGameAction(n2)) {
                case 1: {
                    return 1;
                }
                case 6: {
                    return 2;
                }
                case 2: {
                    return 4;
                }
                case 5: {
                    return 8;
                }
                case 8: {
                    return 16;
                }
            }
        }
        catch (Exception exception) {}
        return 4096;
    }

    public final String b(int n2) {
        int n3 = 0;
        if (w == 1) {
            switch (n2) {
                case 32: {
                    n3 = 48;
                    break;
                }
                case 16: {
                    n3 = 35;
                    break;
                }
                case 64: {
                    n3 = 57;
                    break;
                }
                case 128: {
                    n3 = 56;
                    break;
                }
                case 256: {
                    n3 = 54;
                    break;
                }
                case 512: {
                    n3 = 55;
                    break;
                }
                case 1: {
                    n3 = 49;
                    break;
                }
                case 2: {
                    n3 = 51;
                    break;
                }
                case 4: {
                    n3 = 50;
                    break;
                }
                case 8: {
                    n3 = 42;
                }
            }
        } else {
            switch (n2) {
                case 32: {
                    n3 = 48;
                    break;
                }
                case 16: {
                    n3 = 53;
                    break;
                }
                case 64: {
                    n3 = 49;
                    break;
                }
                case 128: {
                    n3 = 51;
                    break;
                }
                case 256: {
                    n3 = 55;
                    break;
                }
                case 512: {
                    n3 = 57;
                    break;
                }
                case 1: {
                    n3 = 50;
                    break;
                }
                case 2: {
                    n3 = 56;
                    break;
                }
                case 4: {
                    n3 = 52;
                    break;
                }
                case 8: {
                    n3 = 54;
                }
            }
        }
        return super.getKeyName(n3);
    }

    public final void keyPressed(int n2) {
        if (D) {
            if (n2 == 42) {
                D = false;
                C = 20;
            }
            return;
        }
        int n3 = this.getGameAction(n2);
        this.f(n3);
        if (this.l != null) {
            this.l.a(n2, n3);
        }
    }

    public final void d() {
        this.q = 0;
        this.o = 0;
        this.p = 0;
    }

    public final boolean c(int n2) {
        boolean bl = (this.p & n2) != 0;
        this.p &= ~n2;
        return bl;
    }

    public final boolean d(int n2) {
        return (this.o & n2) != 0;
    }

    public final void keyReleased(int n2) {
        this.g(this.getGameAction(n2));
    }

    public final boolean e(int n2) {
        return this.q == n2 && System.currentTimeMillis() - this.r >= 400L;
    }

    public final void f(int n2) {
        this.q = n2;
        this.r = System.currentTimeMillis();
        this.o |= n2;
        this.p |= n2;
    }

    public final void g(int n2) {
        if (n2 == this.q) {
            this.q = 0;
        }
        this.o &= ~n2;
    }

    public final void b(String string) {
        this.L = false;
        Form form = new Form("Fatal error!");
        form.append(string);
        Command command = new Command("Exit", 7, 1);
        form.addCommand(command);
        form.setCommandListener((CommandListener)this);
        K.setCurrent((Displayable)form);
    }

    public final void e() {
        this.L = false;
    }

    public static final void f() throws Exception {
        p.s[0] = new j("chars");
        p.s[1] = new j("lchars");
    }

    public final void run() {
        try {
            this.c();
            String[] stringArray = new String[]{k.l(27), k.l(25), k.l(24)};
            v = stringArray;
            e e2 = new e();
            this.c();
            this.l = e2;
            this.M = false;
            this.L = true;
            e2.a();
            while (this.L) {
                try {
                    int n2;
                    int n3;
                    long l2 = System.currentTimeMillis();
                    if (this.isShown() && !D) {
                        if (A >= 0 && --C <= 0) {
                            p.c(A, B);
                            A = -1;
                        }
                        this.l.l();
                        this.c();
                    }
                    if ((n3 = 65 - (n2 = (int)(System.currentTimeMillis() - l2))) < 10) {
                        n3 = 10;
                    }
                    if (n3 <= 0) continue;
                    try {
                        Thread.sleep(n3);
                    }
                    catch (Exception exception) {
                    }
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                }
            }
            p.h();
            if (GameMidlet.a != null) {
                GameMidlet.a.notifyDestroyed();
                GameMidlet.a.destroyApp(true);
            }
            return;
        }
        catch (Exception exception) {
            Exception exception3 = exception;
            exception.printStackTrace();
            this.b(exception3.toString());
            return;
        }
    }

    public static final void g() {
        System.out.println("\u521d\u59cb\u5316\u58f0\u97f3\u7ed3\u675f");
    }

    public static final h h(int n2) {
        try {
            return new h("/mid/" + n2 + ".mid", "audio/midi");
        }
        catch (Exception exception) {
            System.out.println("/mid/" + n2 + ".mid \u521d\u59cb\u5316\u5931\u8d25");
            return null;
        }
    }

    public static final void h() {
        System.out.println("\u505c\u6b62\u6240\u6709\u58f0\u97f3");
        try {
            if (G != null) {
                G.a();
                G = null;
                H = -1;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final void b(int n2, int n3) {
        System.out.println("\u64ad\u653e\u97f3\u4e50 music index=" + n2);
        p.c(n2, n3);
    }

    public static final void c(int n2, int n3) {
        System.out.println("\u64ad\u653e\u58f0\u97f3 sound index=" + n2);
        try {
            if (u[0]) {
                if (D) {
                    A = n2;
                    B = n3;
                } else {
                    if (n2 < 0) {
                        return;
                    }
                    p.h();
                    G = p.h(n2);
                    if (n3 == 0) {
                        System.out.println("activeSound " + n2 + "is playing");
                        G.a(-1);
                    } else {
                        G.a(n3);
                    }
                    I = n3;
                    H = n2;
                }
            } else {
                System.out.println("\u6211\u64cd\u4f60\u5988\u554a");
            }
            return;
        }
        catch (Exception exception) {
            System.out.println("\u58f0\u97f3\u64ad\u653e\u5931\u8d25");
            return;
        }
    }

    public static final void i() {
        if (J == null) {
            J = null;
            J = x;
        }
    }

    public final void commandAction(Command command, Displayable displayable) {
        GameMidlet.a.notifyDestroyed();
    }

    public final int getWidth() {
        return 240;
    }

    public final int getHeight() {
        return 320;
    }

    static {
        Font.getFont((int)0, (int)1, (int)0);
        d = Font.getFont((int)0, (int)1, (int)8);
        e = d.getBaselinePosition();
        f = e + 6;
        g = c.getBaselinePosition();
        h = g + 8;
        i = new short[]{45, 43};
        j = new short[]{57, 57};
        k = new byte[][]{{10, 11, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {12, -1, 11, -1, 10, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9}};
        s = new j[2];
        t = new Random();
        u = new boolean[]{true, true, true};
        w = 0;
        x = new String[]{"a0", "a1", "a2", "a3", "action_icons.png", "action_icons.sprite", "alpha.sprite", "alpha_00.png", "alpha_01.png", "archer.png", "archer.sprite", "archer_arrow.sprite", "archer_arrow_00.png", "archer_arrow_01.png", "archer_arrow_02.png", "archer_arrow_03.png", "arrow.png", "arrow.sprite", "arrow_icons.png", "arrow_icons.sprite", "big_circle.sprite", "big_circle_00.png", "big_circle_01.png", "bridge.sprite", "bridge_00.png", "bridge_01.png", "bridge_02.png", "bridge_bg.png", "buildings.sprite", "buildings_00.png", "buildings_01.png", "buttons.png", "buttons.sprite", "b_smoke.sprite", "b_smoke_00.png", "b_smoke_01.png", "b_smoke_02.png", "b_smoke_03.png", "catapult.png", "catapult.sprite", "chars.sprite", "chars_00.png", "chars_01.png", "chars_02.png", "chars_03.png", "chars_04.png", "chars_05.png", "chars_06.png", "chars_07.png", "chars_08.png", "chars_09.png", "chars_10.png", "chars_11.png", "crater.png", "crater.sprite", "cursor.sprite", "cursor_00.png", "cursor_01.png", "cursor_02.png", "cursor_03.png", "cursor_04.png", "cursor_05.png", "fish.sprite", "fish_00.png", "fish_01.png", "golem.png", "golem.sprite", "grass.sprite", "grass_00.png", "grass_01.png", "grass_02.png", "grass_03.png", "hill_bg.png", "hud_icons.png", "hud_icons.sprite", "hud_icons_2.png", "hud_icons_2.sprite", "intro0.png", "intro1.png", "intro2.png", "intro3.png", "intro4.png", "intro5.png", "king.sprite", "kingslash.sprite", "kingslash_00.png", "kingslash_01.png", "kingwave.png", "kingwave.sprite", "king_00.png", "king_01.png", "king_02.png", "king_03.png", "king_heads.png", "king_heads.sprite", "king_heads_back.png", "king_heads_back.sprite", "king_head_icons.png", "king_head_icons.sprite", "lchars.sprite", "lchars_00.png", "lchars_01.png", "lchars_02.png", "lchars_03.png", "lchars_04.png", "lchars_05.png", "lchars_06.png", "lchars_07.png", "lchars_08.png", "lchars_09.png", "lchars_10.png", "lchars_11.png", "lchars_12.png", "levelup.png", "levelup.sprite", "lizard.png", "lizard.sprite", "logo.png", "m0", "m1", "m2", "m3", "m4", "m5", "m6", "m7", "menu.sprite", "menu_00.png", "menu_01.png", "menu_02.png", "menu_03.png", "menu_04.png", "menu_05.png", "menu_06.png", "menu_07.png", "menu_icons.sprite", "menu_icons_00.png", "menu_icons_01.png", "menu_icons_02.png", "menu_icons_03.png", "menu_icons_04.png", "menu_icons_05.png", "menu_icons_06.png", "menu_icons_07.png", "menu_icons_08.png", "menu_icons_09.png", "mini_icons.png", "mini_icons.sprite", "mountain.sprite", "mountain_00.png", "mountain_01.png", "mountain_02.png", "mountain_bg.png", "ms_logo.png", "portraits.png", "portraits.sprite", "redspark.png", "redspark.sprite", "road.sprite", "road_00.png", "road_01.png", "road_02.png", "s0", "s1", "s10", "s11", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "side_arrow.png", "side_arrow.sprite", "skeleton.sprite", "skeleton_00.png", "skeleton_01.png", "skeleton_02.png", "skeleton_03.png", "skeleton_04.png", "skeleton_05.png", "skeleton_06.png", "skeleton_07.png", "slash.png", "slash.sprite", "small_circle.png", "small_circle.sprite", "small_spark.png", "small_spark.sprite", "smoke.png", "smoke.sprite", "soldier.png", "soldier.sprite", "spark.png", "spark.sprite", "spell.png", "spell.sprite", "spider.png", "spider.sprite", "status.png", "status.sprite", "stiles0.sprite", "stiles0_00.png", "stiles0_01.png", "stiles0_02.png", "stiles0_03.png", "stiles0_04.png", "stiles0_05.png", "stiles0_06.png", "stiles0_07.png", "stiles0_08.png", "stiles0_09.png", "stiles0_10.png", "stiles0_11.png", "stiles0_12.png", "stiles0_13.png", "stiles0_14.png", "stiles0_15.png", "stiles0_16.png", "stiles0_17.png", "stone.sprite", "tiles0.prop", "tiles0.sprite", "tiles0_00.png", "tiles0_01.png", "tiles0_02.png", "tiles0_03.png", "tiles0_04.png", "tiles0_05.png", "tiles0_06.png", "tiles0_07.png", "tiles0_08.png", "tiles0_09.png", "tiles0_10.png", "tiles0_11.png", "tiles0_12.png", "tiles0_13.png", "tiles0_14.png", "tiles0_15.png", "tiles0_16.png", "tiles0_17.png", "tiles0_18.png", "tiles0_19.png", "tiles0_20.png", "tiles0_21.png", "tiles0_22.png", "tiles0_23.png", "tiles0_24.png", "tiles0_25.png", "tiles0_26.png", "tiles0_27.png", "tiles0_28.png", "tiles0_29.png", "tiles0_30.png", "tiles0_31.png", "tiles0_32.png", "tiles0_33.png", "tiles0_34.png", "tiles0_35.png", "tiles0_36.png", "tombstone.png", "town.sprite", "town_00.png", "town_01.png", "town_02.png", "town_bg.png", "units.bin", "unit_icons.sprite", "unit_icons_00.png", "unit_icons_01.png", "unit_icons_02.png", "unit_icons_03.png", "unit_icons_04.png", "unit_icons_05.png", "unit_icons_06.png", "unit_icons_07.png", "unit_icons_08.png", "unit_icons_09.png", "unit_icons_10.png", "unit_icons_11.png", "unit_icons_12.png", "unit_icons_13.png", "unit_icons_14.png", "unit_icons_15.png", "unit_icons_16.png", "unit_icons_17.png", "unit_icons_18.png", "unit_icons_19.png", "unit_icons_20.png", "unit_icons_21.png", "unit_icons_22.png", "unit_icons_23.png", "water.sprite", "watermagic.png", "watermagic.sprite", "water_00.png", "water_01.png", "water_02.png", "wisp.png", "wisp.sprite", "wizard.sprite", "wizard_00.png", "wizard_01.png", "wizard_02.png", "wizard_03.png", "wizard_04.png", "wizard_05.png", "woods_bg.png", "wyvern.sprite", "wyvern_00.png", "wyvern_01.png", "wyvern_02.png", "wyvern_03.png"};
        A = -1;
        D = false;
        F = new String[]{"main_theme", "bg_story", "bg_good", "bg_bad", "battle_good", "battle_bad", "victory", "gameover", "game_complete"};
        byte[] byArray = new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] nArray = new int[]{110, 30, 27, 27};
        String[] stringArray = new String[]{"soldier", "archer.", "lizard", "wizard", "wisp", "spider", "golem", "catapult", "wyvern", "king_0", "skeleton", "unit_icons"};
    }
}

