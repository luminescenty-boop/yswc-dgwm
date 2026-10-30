/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class l {
    public static Hashtable a = new Hashtable();
    public Image b;
    private boolean d = false;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    public int c;

    public l(l l2, int n2, int n3, int n4, int n5) {
        this.b = l2.b;
        this.g = n4;
        this.h = n5;
        this.e = n2 * n4 + l2.e;
        this.f = n3 * n5 + l2.f;
        this.d = true;
    }

    public l(l l2, int n2) {
        this.b = l2.b;
        this.g = l2.g;
        this.h = l2.h;
        this.i = l2.i;
        this.j = l2.j;
        this.e = l2.e;
        this.f = l2.f;
        this.d = l2.d;
        this.c = n2;
    }

    public l(String string) throws Exception {
        String string2 = string + 1;
        this.b = (Image)a.get(string2);
        if (this.b == null) {
            try {
                this.b = Image.createImage((String)("/pic/" + string + ".png"));
                a.put(string2, this.b);
            }
            catch (Exception exception) {
                System.out.println("b No pic /pic/" + string + ".png");
            }
        }
        this.g = (short)this.b.getWidth();
        this.h = (short)this.b.getHeight();
        this.d = false;
    }

    public final void a(int n2, int n3, int n4) {
        if (this.d) {
            return;
        }
        int n5 = n2 & 0xD;
        int n6 = n2 & 0x32;
        if (this.c == 1) {
            if ((n5 & 4) != 0) {
                n5 = 8;
            } else if ((n5 & 8) != 0) {
                n5 = 4;
            }
        } else if (this.c == 2) {
            if ((n6 & 0x10) != 0) {
                n5 = 32;
            } else if ((n5 & 0x20) != 0) {
                n5 = 16;
            }
        }
        n2 = n5 | n6;
        if ((n2 & 8) != 0) {
            this.i = n3 - this.g;
        } else if ((n2 & 1) != 0) {
            this.i = n3 - this.g >> 1;
        }
        if ((n2 & 0x20) != 0) {
            this.j = n4 - this.h;
            return;
        }
        if ((n2 & 2) != 0) {
            this.j = n4 - this.h >> 1;
        }
    }

    public final void a(int n2, int n3) {
        this.i += n2;
        this.j += n3;
    }

    public final int a() {
        return this.g;
    }

    public final int b() {
        return this.h;
    }

    public final void a(Graphics graphics, int n2, int n3) {
        this.a(graphics, n2, n3, 20);
    }

    public final void a(Graphics graphics, int n2, int n3, int n4) {
        if (this.d) {
            if ((n4 & 8) != 0) {
                n2 -= this.g;
            } else if ((n4 & 1) != 0) {
                n2 -= this.g >> 1;
            }
            if ((n4 & 0x20) != 0) {
                n3 -= this.h;
            } else if ((n4 & 2) != 0) {
                n3 -= this.h >> 1;
            }
            int n5 = graphics.getClipX();
            int n6 = graphics.getClipY();
            int n7 = graphics.getClipWidth();
            int n8 = graphics.getClipHeight();
            int n9 = n2 + this.i;
            int n10 = n3 + this.j;
            graphics.clipRect(n9, n10, this.g, this.h);
            if (this.b != null) {
                graphics.drawImage(this.b, n9 - this.e, n10 - this.f, 0);
            }
            graphics.setClip(n5, n6, n7, n8);
            return;
        }
        if (this.b != null) {
            graphics.drawImage(this.b, n2 + this.i, n3 + this.j, n4);
        }
    }

    public l(String string, int n2) throws Exception {
        String string2 = string + n2;
        this.b = (Image)a.get(string2);
        if (this.b == null) {
            try {
                byte[] byArray = null;
                Object var5_5 = null;
                try {
                    byArray = n2 == 1 ? this.a("/pic/" + string + ".png", null) : this.a("/pic/T" + string + ".png", null);
                }
                catch (Exception exception) {
                    byArray = this.a("/pic/" + string + ".png", null);
                }
                try {
                    this.b = Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
                }
                catch (Exception exception) {}
                a.put(string2, this.b);
            }
            catch (Exception exception) {}
        }
        this.g = (short)this.b.getWidth();
        this.h = (short)this.b.getHeight();
        this.d = false;
        this.g = this.b.getWidth();
        this.h = this.b.getHeight();
    }

    public final byte[] a(String string, InputStream inputStream) throws IOException {
        inputStream = this.getClass().getResourceAsStream(string);
        int n2 = 0;
        while (inputStream.read() != -1) {
            ++n2;
        }
        inputStream = this.getClass().getResourceAsStream(string);
        byte[] byArray = new byte[n2];
        inputStream.read(byArray);
        inputStream.close();
        System.gc();
        return byArray;
    }
}

