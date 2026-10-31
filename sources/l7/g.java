package l7;

import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import io.bidmachine.iab.mraid.l0;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class g extends u {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f21818j = {ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "id", "assetWidth", "assetHeight", "expandedWidth", "expandedHeight", "apiFramework", wHzciBnJlYkdX.KMGWaOkqfOfWBmp, "required"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p f21819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f21820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f21821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f21822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f21823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f21824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f21825i;

    private void D0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f21823g == null) {
            this.f21823g = new ArrayList();
        }
        this.f21823g.add(str);
    }

    private void E0(String str) {
        this.f21822f = str;
    }

    private void F0(String str) {
        this.f21820d = str;
    }

    private void t0(Map map) {
        this.f21824h = map;
    }

    private void u0(p pVar) {
        this.f21819c = pVar;
    }

    public int A0() {
        return K(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
    }

    public boolean B0() {
        return (this.f21821e == null && this.f21819c == null && this.f21820d == null) ? false : true;
    }

    public boolean C0() {
        return (TextUtils.isEmpty(C(ViewHierarchyConstants.DIMENSION_WIDTH_KEY)) || TextUtils.isEmpty(C(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY))) ? false : true;
    }

    public void G0(String str) {
        this.f21825i = str;
    }

    public void H0(String str) {
        this.f21821e = str;
    }

    @Override // l7.u
    public String[] k0() {
        return f21818j;
    }

    public List<String> v0() {
        return this.f21823g;
    }

    public int w0() {
        return K(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
    }

    public String x0() {
        String strY0 = y0();
        if (strY0 != null) {
            return l0.t(strY0);
        }
        return null;
    }

    public String y0() {
        String str = this.f21821e;
        if (str != null) {
            return str;
        }
        p pVar = this.f21819c;
        if (pVar != null) {
            return String.format("<script type='text/javascript'>document.write('<a style=\"display: flex; width: 100%%; height: 100%%; justify-content: center; align-items: center\" href=\"%s\" target=\"_blank\"><img style=\"border-style: none; height: 100%%; width: 100%%; object-fit: contain;\" src=\"%s\"/></a>');</script>", this.f21822f, pVar.l0());
        }
        if (this.f21820d != null) {
            return String.format("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"%s\" height=\"%s\" src=\"%s\"></iframe>", Integer.valueOf(A0()), Integer.valueOf(w0()), this.f21820d);
        }
        return null;
    }

    public Map<h7.a, List<String>> z0() {
        return this.f21824h;
    }

    g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, null, "Companion");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (u.I(name, KBBdKxoAiHo.YfHNFQli)) {
                    p pVar = new p(xmlPullParser);
                    if (pVar.t0()) {
                        u0(pVar);
                    }
                } else if (u.I(name, "IFrameResource")) {
                    F0(u.Y(xmlPullParser));
                } else if (u.I(name, "HTMLResource")) {
                    H0(u.Y(xmlPullParser));
                } else if (u.I(name, "CompanionClickThrough")) {
                    E0(u.Y(xmlPullParser));
                } else if (u.I(name, "CompanionClickTracking")) {
                    D0(u.Y(xmlPullParser));
                } else if (u.I(name, "TrackingEvents")) {
                    t0(new q(xmlPullParser).t0());
                } else if (u.I(name, "AdParameters")) {
                    G0(u.Y(xmlPullParser));
                } else {
                    u.a0(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Companion");
    }
}
