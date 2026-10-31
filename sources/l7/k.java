package l7;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class k extends a {
    k(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, "InLine");
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
                } else {
                    u.a0(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "InLine");
    }
}
