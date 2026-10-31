package l7;

import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class o extends u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f21842g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g7.n f21838c = new g7.n();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g7.n f21839d = new g7.n();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g7.n f21840e = new g7.n();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g7.n f21841f = new g7.n();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f21843h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f21844i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21845j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f21846k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f21847l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f21848m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f21849n = false;

    public g7.n B() {
        return this.f21841f;
    }

    @Override // l7.u
    protected void G(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "Postbanner");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                try {
                    String name = xmlPullParser.getName();
                    if (u.I(name, "CloseTime")) {
                        String strY = u.Y(xmlPullParser);
                        if (!TextUtils.isEmpty(strY)) {
                            this.f21843h = Float.parseFloat(strY);
                        }
                    } else if (u.I(name, "Duration")) {
                        String strY2 = u.Y(xmlPullParser);
                        if (!TextUtils.isEmpty(strY2)) {
                            this.f21844i = Float.parseFloat(strY2);
                        }
                    } else if (u.I(name, "ClosableView")) {
                        u.H(xmlPullParser, this.f21838c);
                    } else if (u.I(name, "Countdown")) {
                        u.H(xmlPullParser, this.f21839d);
                    } else if (u.I(name, "LoadingView")) {
                        u.H(xmlPullParser, this.f21840e);
                    } else if (u.I(name, "Progress")) {
                        u.H(xmlPullParser, this.f21841f);
                    } else if (u.I(name, "UseNativeClose")) {
                        this.f21847l = u.N(xmlPullParser);
                    } else if (u.I(name, "IgnoresSafeAreaLayoutGuide")) {
                        this.f21846k = u.N(xmlPullParser);
                    } else if (u.I(name, "ProductLink")) {
                        this.f21842g = u.Y(xmlPullParser);
                    } else if (u.I(name, "R1")) {
                        this.f21848m = u.N(xmlPullParser);
                    } else if (u.I(name, "R2")) {
                        this.f21849n = u.N(xmlPullParser);
                    } else {
                        u.a0(xmlPullParser);
                    }
                } catch (Throwable th) {
                    h7.e.c("VastXmlTag", th);
                }
            }
        }
        xmlPullParser.require(3, null, "Postbanner");
    }

    public g7.n b() {
        return this.f21838c;
    }

    public boolean f() {
        return this.f21849n;
    }

    public boolean h() {
        return this.f21848m;
    }

    public float t0() {
        return this.f21843h;
    }

    public float u0() {
        return this.f21844i;
    }

    public String v0() {
        return this.f21842g;
    }

    public boolean w0() {
        return this.f21847l;
    }

    public g7.n x() {
        return this.f21839d;
    }

    public boolean x0() {
        return this.f21845j;
    }

    public void y0(int i10) {
        this.f21843h = i10;
    }

    public g7.n z() {
        return this.f21840e;
    }

    public void z0(boolean z10) {
        this.f21845j = z10;
    }
}
