package l7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class f extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f21817c;

    f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        this.f21817c = new ArrayList();
        xmlPullParser.require(2, null, "CompanionAds");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (u.I(xmlPullParser.getName(), "Companion")) {
                    g gVar = new g(xmlPullParser);
                    if (gVar.C0()) {
                        this.f21817c.add(gVar);
                    } else {
                        h7.e.a("VastXmlTag", "Creative Companion: is not valid. Skipping it.", new Object[0]);
                    }
                } else {
                    u.a0(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "CompanionAds");
    }

    public List<g> t0() {
        return this.f21817c;
    }
}
