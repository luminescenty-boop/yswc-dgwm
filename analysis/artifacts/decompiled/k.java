/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public class k {
    public static p eF;
    public int eG = eF.getWidth();
    public int eH = eF.getHeight();
    public int eI = this.eG >> 1;
    public int eJ = this.eH >> 1;
    public static String[] eK;
    public static short[] eL;
    public static int eM;
    public static int eN;
    public static int eO;

    public void d() {
    }

    public void a(int n2, int n3) {
    }

    public void l() throws Exception {
    }

    public void f(Graphics graphics) {
    }

    public static final String[] a(String string, int n2, Font font) {
        int n3;
        Vector<String> vector = new Vector<String>();
        int n4 = 0;
        boolean bl = false;
        int n5 = string.length();
        String string2 = null;
        do {
            n3 = n4;
            int n6 = string.indexOf(10, n3);
            block1: do {
                int n7 = n3;
                String string3 = string2;
                n3 = k.a(string, n3);
                if (n6 > -1 && n6 < n3) {
                    n3 = n6;
                }
                if (font.stringWidth(string2 = string.substring(n4, n3).trim()) <= n2) continue;
                if (n7 == n4) {
                    for (int i2 = string2.length() - 1; i2 > 0; --i2) {
                        String string4 = string2.substring(0, i2);
                        if (font.stringWidth(string4) > n2) continue;
                        n3 = n7 + i2;
                        string2 = string4;
                        break block1;
                    }
                    break;
                }
                n3 = n7;
                string2 = string3;
                break;
            } while (n3 != n6 && n3 < n5);
            vector.addElement(string2);
        } while ((n4 = ++n3) < n5);
        Object[] objectArray = new String[vector.size()];
        vector.copyInto(objectArray);
        return objectArray;
    }

    private static int a(String string, int n2) {
        int n3;
        char c2 = string.charAt(n2);
        if (k.n(c2)) {
            return n2 + 1;
        }
        int n4 = 0;
        while ((n3 = string.indexOf(32, n2)) == 0) {
            ++n2;
        }
        n4 = n3;
        n4 = n4 == -1 ? string.length() : ++n4;
        for (n3 = n2 + 1; n3 < n4; ++n3) {
            if (!k.n(string.charAt(n3))) continue;
            return n3;
        }
        return n4;
    }

    private static boolean n(int n2) {
        return n2 >= 11904 && n2 < 44032 || n2 >= 63744 && n2 < 64256 || n2 >= 65280 && n2 < 65504;
    }

    public static final int a(String string, boolean bl) throws Exception {
        c c2 = new c();
        eK = c2.a;
        return eK.length;
    }

    public static final String l(int n2) {
        return k.a(n2, false);
    }

    public static final String a(int n2, boolean bl) {
        if (n2 < eK.length) {
            String string = eK[n2];
            if (bl) {
                string = k.a(string, "%K5", k.a(20, eF.b(16)), true);
                string = k.a(string, "%K0", eF.b(32), true);
                string = k.a(string, "%K7", eF.b(256), true);
                if ((string = k.a(string, "%K9", eF.b(512), true)).indexOf("%KM") != -1) {
                    StringBuffer stringBuffer = new StringBuffer();
                    String[] stringArray = new String[]{eF.b(1), eF.b(2), eF.b(4), eF.b(8)};
                    stringBuffer.append(k.a(17, stringArray));
                    if (stringBuffer.length() > 0) {
                        stringBuffer.append('/');
                    }
                    stringBuffer.append(k.l(18));
                    string = k.a(string, "%KM", stringBuffer.toString(), true);
                }
            }
            return string;
        }
        return "?: " + n2;
    }

    public static final String a(int n2, String[] stringArray) {
        String string = new String(k.l(n2));
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            string = k.a(string, "%U", stringArray[i2], false);
        }
        return string;
    }

    public static final String a(int n2, String string) {
        return k.a(k.l(n2), "%U", string, false);
    }

    public static final String a(String string, String string2, String string3, boolean bl) {
        int n2;
        String string4 = string;
        while ((n2 = string4.indexOf(string2)) != -1) {
            string4 = string4.substring(0, n2) + string3 + string4.substring(n2 + string2.length());
            if (bl) continue;
        }
        return string4;
    }

    public static final void y() {
        boolean bl = false;
        eN = eM >> 1;
        eO = eN >> 1;
        eL = new short[eM];
        int n2 = eM * 10000 / 2 / 31415;
        int n3 = 1024 * n2;
        int n4 = 0;
        for (int i2 = 0; i2 < eM; ++i2) {
            int n5 = n4 / n2;
            k.eL[i2] = (short)n5;
            n4 += (n3 -= n5) / n2;
        }
        k.eL[180] = 0;
        k.eL[270] = -1024;
    }

    public static final short m(int n2) {
        return eL[n2 %= 360];
    }

    static {
        eL = null;
        eM = 360;
        eN = 0;
        eO = 0;
    }
}

