package l7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
class q extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumMap f21851c;

    q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        h7.a aVarValueOf;
        super(xmlPullParser);
        this.f21851c = new EnumMap(h7.a.class);
        xmlPullParser.require(2, null, "TrackingEvents");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (u.I(xmlPullParser.getName(), "Tracking")) {
                    String strC = new r(xmlPullParser).C("event");
                    try {
                        aVarValueOf = h7.a.valueOf(strC);
                    } catch (Exception unused) {
                        h7.e.a("VastXmlTag", "Event: %s is not valid. Skipping it.", strC);
                        aVarValueOf = null;
                    }
                    if (aVarValueOf != null) {
                        String strY = u.Y(xmlPullParser);
                        List list = (List) this.f21851c.get(aVarValueOf);
                        if (list != null) {
                            list.add(strY);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(strY);
                            this.f21851c.put(aVarValueOf, arrayList);
                        }
                    } else {
                        u.a0(xmlPullParser);
                    }
                } else {
                    u.a0(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "TrackingEvents");
    }

    EnumMap t0() {
        return this.f21851c;
    }
}
