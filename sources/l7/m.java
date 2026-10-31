package l7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class m extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f21830i = {"skipoffset"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Float f21831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f21832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w f21833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f21834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private EnumMap f21835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21836h;

    m(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        this.f21836h = -1;
        xmlPullParser.require(2, null, "Linear");
        int iE0 = u.e0(C("skipoffset"));
        if (iE0 > -1) {
            t0(iE0);
        }
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.I(name, "Duration")) {
                    float fE0 = u.e0(u.Y(xmlPullParser));
                    if (fE0 > -1.0f) {
                        D0(Float.valueOf(fE0));
                    }
                } else if (u.I(name, "MediaFiles")) {
                    v0(x0(xmlPullParser));
                } else if (u.I(name, "VideoClicks")) {
                    w0(new w(xmlPullParser));
                } else if (u.I(name, "AdParameters")) {
                    C0(u.Y(xmlPullParser));
                } else if (u.I(name, "TrackingEvents")) {
                    u0(new q(xmlPullParser).t0());
                } else {
                    u.a0(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Linear");
    }

    private void t0(int i10) {
        this.f21836h = i10;
    }

    private void u0(EnumMap enumMap) {
        this.f21835g = enumMap;
    }

    private void v0(List list) {
        this.f21832d = list;
    }

    private void w0(w wVar) {
        this.f21833e = wVar;
    }

    private static List x0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "MediaFiles");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (u.I(xmlPullParser.getName(), "MediaFile")) {
                    n nVar = new n(xmlPullParser);
                    if (nVar.w0()) {
                        arrayList.add(nVar);
                    } else {
                        h7.e.a("VastXmlTag", "MediaFile: is not valid. Skipping it.", new Object[0]);
                        u.a0(xmlPullParser);
                    }
                } else {
                    u.a0(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "MediaFiles");
        return arrayList;
    }

    public Map<h7.a, List<String>> A0() {
        return this.f21835g;
    }

    public w B0() {
        return this.f21833e;
    }

    public void C0(String str) {
        this.f21834f = str;
    }

    public void D0(Float f10) {
        this.f21831c = f10;
    }

    @Override // l7.u
    public String[] k0() {
        return f21830i;
    }

    public Float y0() {
        return this.f21831c;
    }

    public List<n> z0() {
        return this.f21832d;
    }
}
