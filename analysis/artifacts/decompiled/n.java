/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Random;
import javax.microedition.lcdui.Graphics;

public final class n {
    public static final short[] a = new short[]{0, 286, 571, 858, 1143, 1428, 1712, 1997, 2280, 2562, 2844, 3126, 3406, 3684, 3963, 4240, 4515, 4790, 5062, 5332, 5603, 5872, 6137, 6401, 6663, 6923, 7182, 7438, 7692, 7942, 8192, 8437, 8681, 8922, 9161, 9397, 9630, 9859, 10085, 10310, 10531, 10749, 10962, 11173, 11381, 11585, 11785, 11983, 12174, 12365, 12550, 12732, 12910, 13084, 13254, 13421, 13582, 13741, 13893, 14044, 14188, 14329, 14465, 14598, 14725, 14848, 14966, 15081, 15191, 15296, 15396, 15491, 15582, 15668, 15748, 15825, 15897, 15964, 16025, 16082, 16134, 16182, 16223, 16261, 16293, 16321, 16344, 16361, 16374, 16380, 16384};

    public n() {
        new Random();
    }

    public static final int a(int n2, int n3) {
        if (n2 > n3) {
            return n3;
        }
        return n2;
    }

    public static final void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6) {
        int n7 = n2 - n4;
        int n8 = n3 - n4;
        graphics.drawArc(n7, n8, n4 << 1, n4 << 1, n5, n6);
    }

    public static final void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16 = n2 + n4 >> 1;
        int n17 = n3 + n5 >> 1;
        int n18 = n.a(n4, n5) >> 1;
        graphics.setColor(n7);
        n.a(graphics, n16, n17, n18, 0, 360);
        int n19 = n18 - 5;
        int n20 = n19 * n.a(10) >> 14;
        int n21 = -n6 - 10 + 180;
        for (n15 = 0; n15 < 4; ++n15) {
            n.a(graphics, n16, n17, n19, -n6 + n15 * 90, 70);
            n14 = (n19 * n.b(n6 + n15 * 90 + 10) >> 14) + n16;
            n13 = (n19 * n.a(n6 + n15 * 90 + 10) >> 14) + n17;
            n.a(graphics, n14, n13, n20, n21 -= 90, 180);
        }
        n15 = n19 - (n20 + 5);
        n.a(graphics, n16, n17, n15, 0, 360);
        n14 = -n6 + 10;
        for (n13 = 0; n13 < 6; ++n13) {
            for (n12 = 0; n12 < 5; ++n12) {
                n11 = ((n15 - n12) * n.b(n14) >> 14) + n16;
                n10 = ((n15 - n12) * n.a(n14) >> 14) + n17;
                n9 = ((n15 - n12) * n.b(n14 + 120) >> 14) + n16;
                n8 = ((n15 - n12) * n.a(n14 + 120) >> 14) + n17;
                graphics.drawLine(n11, n10, n9, n8);
                n14 += 60;
            }
        }
        n13 = n15 - (n20 - 5);
        for (n12 = 0; n12 < 4; ++n12) {
            n11 = (n13 * n.b(-n6 + 45 + n12 * 90 + 10) >> 14) + n16;
            n10 = (n13 * n.a(-n6 + 45 + n12 * 90 + 10) >> 14) + n17;
            n.a(graphics, n11, n10, n20 - 5, 0, 360);
        }
        n12 = n13 - (n20 + 15);
        n11 = (3 * n.b(n6 * 2) >> 14) + n16;
        n10 = (3 * n.a(n6 * 2) >> 14) + n17;
        n9 = (n12 * n.b(n6 * 2 + 90) >> 14) + n16;
        n8 = (n12 * n.a(n6 * 2 + 90) >> 14) + n17;
        int n22 = (3 * n.b(n6 * 2 + 180) >> 14) + n16;
        int n23 = (3 * n.a(n6 * 2 + 180) >> 14) + n17;
        int n24 = (n12 * n.b(n6 * 2 + 270) >> 14) + n16;
        int n25 = (n12 * n.a(n6 * 2 + 270) >> 14) + n17;
        graphics.drawLine(n9, n8, n11, n10);
        graphics.drawLine(n9, n8, n22, n23);
        graphics.drawLine(n24, n25, n11, n10);
        graphics.drawLine(n24, n25, n22, n23);
        n.a(graphics, n16, n17, n12, 0, 360);
        int n26 = n16 + (5 * n.b(n6 * 2) >> 14);
        int n27 = n17 + (5 * n.a(n6 * 2) >> 14);
        n.a(graphics, n26, n27, n12 - 10, -n6 * 2 - 180 + 45, 270);
        int n28 = n16 - ((n12 >> 1) * n.b(n6 * 2) >> 14);
        int n29 = n17 - ((n12 >> 1) * n.a(n6 * 2) >> 14);
        n.a(graphics, n28, n29, n12 >> 1, 0, 360);
    }

    public static final short a(int n2) {
        if (n2 > 360) {
            n2 %= 360;
        } else if (n2 < 0) {
            n2 = 360 - -n2 % 360;
        }
        if (n2 < 180) {
            if (n2 < 90) {
                return a[n2];
            }
            return a[180 - n2];
        }
        if (n2 < 270) {
            return -a[n2 - 180];
        }
        return -a[360 - n2];
    }

    public static final short b(int n2) {
        if (n2 > 360) {
            n2 %= 360;
        } else if (n2 < 0) {
            n2 = 360 - -n2 % 360;
        }
        if (n2 < 180) {
            if (n2 < 90) {
                return a[90 - n2];
            }
            return -a[n2 - 90];
        }
        if (n2 < 270) {
            return -a[270 - n2];
        }
        return a[n2 - 270];
    }
}

