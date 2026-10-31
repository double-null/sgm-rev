package l7;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class a extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f21789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f21790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f21791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f21792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f21793g;

    a(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    private j x0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        j eVar;
        xmlPullParser.require(2, null, "Extension");
        String strC = new j(xmlPullParser).C("type");
        if (u.I(strC, AppLovinMediationProvider.APPODEAL)) {
            eVar = new e(xmlPullParser);
        } else if (u.I(strC, "AdVerifications")) {
            d dVar = null;
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (u.I(xmlPullParser.getName(), "AdVerifications")) {
                        dVar = new d(xmlPullParser);
                    } else {
                        u.a0(xmlPullParser);
                    }
                }
            }
            eVar = dVar;
        } else {
            u.a0(xmlPullParser);
            eVar = null;
        }
        xmlPullParser.require(3, null, "Extension");
        return eVar;
    }

    public List<String> A0() {
        return this.f21793g;
    }

    public List<j> B0() {
        return this.f21791e;
    }

    public List<String> C0() {
        return this.f21792f;
    }

    void D0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f21793g == null) {
            this.f21793g = new ArrayList();
        }
        this.f21793g.add(str);
    }

    void E0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f21792f == null) {
            this.f21792f = new ArrayList();
        }
        this.f21792f.add(str);
    }

    void t0(List list) {
        this.f21790d = list;
    }

    void u0(b bVar) {
        this.f21789c = bVar;
    }

    void v0(List list) {
        this.f21791e = list;
    }

    List w0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "Creatives");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (u.I(xmlPullParser.getName(), "Creative")) {
                    arrayList.add(new i(xmlPullParser));
                } else {
                    u.a0(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Creatives");
        return arrayList;
    }

    List y0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "Extensions");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (u.I(xmlPullParser.getName(), "Extension")) {
                    j jVarX0 = x0(xmlPullParser);
                    if (jVarX0 != null) {
                        arrayList.add(jVarX0);
                    }
                } else {
                    u.a0(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Extensions");
        return arrayList;
    }

    public List<i> z0() {
        return this.f21790d;
    }
}
