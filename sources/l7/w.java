package l7;

import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class w extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f21860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f21861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f21862e;

    w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, "VideoClicks");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.I(name, "ClickThrough")) {
                    x0(u.Y(xmlPullParser));
                } else if (u.I(name, "ClickTracking")) {
                    v0(u.Y(xmlPullParser));
                } else if (u.I(name, "CustomClick")) {
                    w0(u.Y(xmlPullParser));
                } else {
                    u.a0(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "VideoClicks");
    }

    private void v0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f21861d == null) {
            this.f21861d = new ArrayList();
        }
        this.f21861d.add(str);
    }

    private void w0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f21862e == null) {
            this.f21862e = new ArrayList();
        }
        this.f21862e.add(str);
    }

    private void x0(String str) {
        this.f21860c = str;
    }

    public String t0() {
        return this.f21860c;
    }

    public List<String> u0() {
        return this.f21861d;
    }
}
