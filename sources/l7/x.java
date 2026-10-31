package l7;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class x extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f21863i = {"followAdditionalWrappers", "allowMultipleAds", "fallbackOnNoAd"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f21864h;

    public x(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, "Wrapper");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.I(name, "Creatives")) {
                    t0(w0(xmlPullParser));
                } else if (u.I(name, "Extensions")) {
                    v0(y0(xmlPullParser));
                } else if (u.I(name, "Impression")) {
                    E0(u.Y(xmlPullParser));
                } else if (u.I(name, "Error")) {
                    D0(u.Y(xmlPullParser));
                } else if (u.I(name, "AdSystem")) {
                    u0(new b(xmlPullParser));
                } else if (u.I(name, "VASTAdTagURI")) {
                    G0(u.Y(xmlPullParser));
                } else {
                    u.a0(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Wrapper");
    }

    private void G0(String str) {
        this.f21864h = str;
    }

    public String F0() {
        return this.f21864h;
    }

    @Override // l7.u
    public String[] k0() {
        return f21863i;
    }
}
