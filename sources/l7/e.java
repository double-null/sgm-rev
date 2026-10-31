package l7;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class e extends j implements h7.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g7.n f21798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g7.n f21799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g7.n f21800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g7.n f21801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g7.n f21802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g7.n f21803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g7.n f21804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g7.n f21805k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final o f21806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f21807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f21808n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private g f21809o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Boolean f21810p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Float f21811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f21812r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f21813s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f21814t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f21815u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Integer f21816v;

    e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        this.f21798d = new g7.n();
        this.f21799e = new g7.n();
        this.f21800f = new g7.n();
        this.f21801g = new g7.n();
        this.f21802h = new g7.n();
        this.f21803i = new g7.n();
        this.f21804j = new g7.n();
        this.f21805k = new g7.n();
        this.f21806l = new o();
        this.f21812r = false;
        this.f21813s = false;
        this.f21814t = false;
        this.f21815u = false;
        xmlPullParser.require(2, null, "Extension");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.I(name, "Video")) {
                    u.H(xmlPullParser, this.f21798d);
                } else if (u.I(name, "LoadingView")) {
                    u.H(xmlPullParser, this.f21804j);
                } else if (u.I(name, "Countdown")) {
                    u.H(xmlPullParser, this.f21805k);
                } else if (u.I(name, "Progress")) {
                    u.H(xmlPullParser, this.f21802h);
                } else if (u.I(name, "ClosableView")) {
                    u.H(xmlPullParser, this.f21801g);
                } else if (u.I(name, "Mute")) {
                    u.H(xmlPullParser, this.f21800f);
                } else if (u.I(name, "CTA")) {
                    u.H(xmlPullParser, this.f21799e);
                } else if (u.I(name, "RepeatView")) {
                    u.H(xmlPullParser, this.f21803i);
                } else if (u.I(name, "Postbanner")) {
                    this.f21806l.r0(xmlPullParser);
                } else if (u.I(name, "Autorotate")) {
                    this.f21810p = Boolean.valueOf(u.N(xmlPullParser));
                } else if (u.I(name, "R1")) {
                    this.f21814t = u.N(xmlPullParser);
                } else if (u.I(name, "R2")) {
                    this.f21815u = u.N(xmlPullParser);
                } else if (u.I(name, "ForceOrientation")) {
                    this.f21816v = u.i0(u.Y(xmlPullParser));
                } else if (u.I(name, "CtaText")) {
                    this.f21799e.j0(u.Y(xmlPullParser));
                } else if (u.I(name, "ShowCta")) {
                    this.f21799e.A0(Boolean.valueOf(u.N(xmlPullParser)));
                } else if (u.I(name, "ShowMute")) {
                    this.f21800f.A0(Boolean.valueOf(u.N(xmlPullParser)));
                } else if (u.I(name, "ShowCompanion")) {
                    this.f21806l.z0(u.N(xmlPullParser));
                } else if (u.I(name, "CompanionCloseTime")) {
                    int iH0 = u.h0(u.Y(xmlPullParser));
                    if (iH0 > -1) {
                        this.f21806l.y0(iH0);
                    }
                } else if (u.I(name, "Muted")) {
                    this.f21812r = u.N(xmlPullParser);
                } else if (u.I(name, "VideoClickable")) {
                    this.f21813s = u.N(xmlPullParser);
                } else if (u.I(name, "CtaXPosition")) {
                    this.f21799e.p0(u.m0(u.Y(xmlPullParser)));
                } else if (u.I(name, "CtaYPosition")) {
                    this.f21799e.z0(u.n0(u.Y(xmlPullParser)));
                } else if (u.I(name, "CloseXPosition")) {
                    this.f21801g.p0(u.m0(u.Y(xmlPullParser)));
                } else if (u.I(name, "CloseYPosition")) {
                    this.f21801g.z0(u.n0(u.Y(xmlPullParser)));
                } else if (u.I(name, "MuteXPosition")) {
                    this.f21800f.p0(u.m0(u.Y(xmlPullParser)));
                } else if (u.I(name, "MuteYPosition")) {
                    this.f21800f.z0(u.n0(u.Y(xmlPullParser)));
                } else if (u.I(name, "AssetsColor")) {
                    Integer numU = u.U(u.Y(xmlPullParser));
                    if (numU != null) {
                        this.f21807m = numU;
                    }
                } else if (u.I(name, "AssetsBackgroundColor")) {
                    Integer numU2 = u.U(u.Y(xmlPullParser));
                    if (numU2 != null) {
                        this.f21808n = numU2;
                    }
                } else if (u.I(name, "Companion")) {
                    g gVar = new g(xmlPullParser);
                    if (gVar.C0() && gVar.B0()) {
                        this.f21809o = gVar;
                    }
                } else if (u.I(name, "CloseTime")) {
                    String strY = u.Y(xmlPullParser);
                    if (strY != null) {
                        this.f21811q = Float.valueOf(Float.parseFloat(strY));
                    }
                } else if (u.I(name, "ShowProgress")) {
                    this.f21802h.A0(Boolean.valueOf(u.N(xmlPullParser)));
                } else {
                    u.a0(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Extension");
    }

    @Override // h7.c
    public g7.n B() {
        return this.f21802h;
    }

    @Override // h7.c
    public g7.n b() {
        return this.f21801g;
    }

    @Override // h7.c
    public Integer c() {
        return this.f21808n;
    }

    @Override // h7.c
    public g7.n e() {
        return this.f21800f;
    }

    @Override // h7.c
    public boolean f() {
        return this.f21815u;
    }

    @Override // h7.c
    public g7.n g() {
        return this.f21798d;
    }

    @Override // h7.c
    public boolean h() {
        return this.f21814t;
    }

    @Override // h7.c
    public g7.n k() {
        return this.f21803i;
    }

    @Override // h7.c
    public Integer n() {
        return this.f21807m;
    }

    @Override // h7.c
    public o o() {
        return this.f21806l;
    }

    @Override // h7.c
    public boolean p() {
        return this.f21813s;
    }

    @Override // h7.c
    public g7.n s() {
        return this.f21799e;
    }

    @Override // h7.c
    public Boolean t() {
        return this.f21810p;
    }

    public g t0() {
        return this.f21809o;
    }

    public boolean u0() {
        return this.f21812r;
    }

    @Override // h7.c
    public Integer v() {
        return this.f21816v;
    }

    @Override // h7.c
    public Float w() {
        return this.f21811q;
    }

    @Override // h7.c
    public g7.n x() {
        return this.f21805k;
    }

    @Override // h7.c
    public g7.n z() {
        return this.f21804j;
    }
}
