package l7;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class c extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f21795d = {"id"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f21796c;

    c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, "Ad");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.I(name, "InLine")) {
                    this.f21796c = new k(xmlPullParser);
                } else if (u.I(name, "Wrapper")) {
                    this.f21796c = new x(xmlPullParser);
                } else {
                    u.a0(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Ad");
    }

    @Override // l7.u
    public String[] k0() {
        return f21795d;
    }

    public a t0() {
        return this.f21796c;
    }
}
