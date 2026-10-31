package l7;

import com.facebook.internal.ServerProtocol;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class t extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f21853d = {ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f21854c;

    t(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        this.f21854c = new ArrayList();
        xmlPullParser.require(2, null, "VAST");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (u.I(xmlPullParser.getName(), "Ad")) {
                    this.f21854c.add(new c(xmlPullParser));
                } else {
                    u.a0(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "VAST");
    }

    @Override // l7.u
    public String[] k0() {
        return f21853d;
    }

    public List<c> t0() {
        return this.f21854c;
    }

    public boolean u0() {
        return !this.f21854c.isEmpty();
    }
}
