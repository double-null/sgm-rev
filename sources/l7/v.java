package l7;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class v extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f21857e = {"vendor"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l f21858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f21859d;

    v(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, "Verification");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.I(name, "JavaScriptResource")) {
                    this.f21858c = new l(xmlPullParser);
                } else if (u.I(name, "VerificationParameters")) {
                    this.f21859d = u.Y(xmlPullParser);
                } else {
                    u.a0(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Verification");
    }

    @Override // l7.u
    public String[] k0() {
        return f21857e;
    }

    public l t0() {
        return this.f21858c;
    }

    public String u0() {
        return C("vendor");
    }

    public String v0() {
        return this.f21859d;
    }
}
