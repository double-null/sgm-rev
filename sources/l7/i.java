package l7;

import com.applovin.mediation.adapters.google.NK.ykDFMuXDQMaR;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class i extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f21826d = {"id", ykDFMuXDQMaR.CSPdtFpUCPTY};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f21827c;

    i(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, "Creative");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.I(name, "Linear")) {
                    this.f21827c = new m(xmlPullParser);
                } else if (u.I(name, "CompanionAds")) {
                    this.f21827c = new f(xmlPullParser);
                } else {
                    u.a0(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Creative");
    }

    @Override // l7.u
    public String[] k0() {
        return f21826d;
    }

    public h t0() {
        return this.f21827c;
    }
}
