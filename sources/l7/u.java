package l7;

import android.graphics.Color;
import android.text.TextUtils;
import c0.IbU.elEbP;
import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import g7.y;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f21855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap f21856b;

    public u() {
    }

    private static HashMap D(u uVar, XmlPullParser xmlPullParser) {
        if (xmlPullParser.getAttributeCount() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
            if (uVar.d0(xmlPullParser.getAttributeName(i10))) {
                map.put(xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
            }
        }
        return map;
    }

    private void F(HashMap map) {
        this.f21856b = map;
    }

    static void H(XmlPullParser xmlPullParser, g7.n nVar) {
        for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (!TextUtils.isEmpty(attributeValue)) {
                try {
                    if ("stroke".equals(attributeName)) {
                        nVar.w0(U(attributeValue));
                    } else if ("fill".equals(attributeName)) {
                        nVar.k0(U(attributeValue));
                    } else if ("outlined".equals(attributeName)) {
                        nVar.t0(Boolean.valueOf(q0(attributeValue)));
                    } else if ("visible".equals(attributeName)) {
                        nVar.A0(Boolean.valueOf(q0(attributeValue)));
                    } else if ("x".equals(attributeName)) {
                        nVar.p0(m0(attributeValue));
                    } else if ("y".equals(attributeName)) {
                        nVar.z0(n0(attributeValue));
                    } else if (AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE.equals(attributeName)) {
                        nVar.y0(attributeValue);
                    } else if ("opacity".equals(attributeName)) {
                        nVar.s0(Float.valueOf(Float.parseFloat(attributeValue)));
                    } else if ("hideafter".equals(attributeName)) {
                        nVar.o0(Float.valueOf(Float.parseFloat(attributeValue)));
                    } else if ("padding".equals(attributeName)) {
                        nVar.v0(attributeValue);
                    } else if ("margin".equals(attributeName)) {
                        nVar.r0(attributeValue);
                    } else if ("strokewidth".equals(attributeName)) {
                        nVar.x0(y.g(attributeValue));
                    } else if (ViewHierarchyConstants.DIMENSION_WIDTH_KEY.equals(attributeName)) {
                        nVar.B0(y.g(attributeValue));
                    } else if (ViewHierarchyConstants.DIMENSION_HEIGHT_KEY.equals(attributeName)) {
                        nVar.n0(y.g(attributeValue));
                    } else if (elEbP.xtKjbshYDuTK.equals(attributeName)) {
                        nVar.m0(Integer.valueOf(Integer.parseInt(attributeValue)));
                    } else if ("fontsize".equals(attributeName)) {
                        nVar.l0(y.g(attributeValue));
                    }
                } catch (Throwable th) {
                    h7.e.c("VastXmlTag", th);
                }
            }
        }
        try {
            nVar.j0(Y(xmlPullParser));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            xmlPullParser.require(3, null, xmlPullParser.getName());
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    static boolean I(String str, String str2) {
        return str != null && str.equalsIgnoreCase(str2);
    }

    static boolean N(XmlPullParser xmlPullParser) {
        return q0(Y(xmlPullParser));
    }

    static Integer U(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception e10) {
            h7.e.b("VastXmlTag", e10.getMessage(), new Object[0]);
            return null;
        }
    }

    static String Y(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.next() != 4) {
            return null;
        }
        String text = xmlPullParser.getText();
        if (!TextUtils.isEmpty(text)) {
            text = text.trim();
        }
        xmlPullParser.nextTag();
        return text;
    }

    static void a0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private boolean d0(String str) {
        for (String str2 : k0()) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    static int h0(String str) {
        if (str == null) {
            return -1;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length <= 1) {
            return -1;
        }
        try {
            return (Integer.parseInt(strArrSplit[0]) * 60) + Integer.parseInt(strArrSplit[1]);
        } catch (Exception e10) {
            h7.e.c("VastXmlTag", e10);
            return -1;
        }
    }

    static Integer i0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        if (lowerCase.equals("portrait")) {
            return 1;
        }
        return !lowerCase.equals("landscape") ? null : 2;
    }

    static Integer m0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        switch (lowerCase) {
            case "center":
                return 1;
            case "left":
                return 3;
            case "right":
                return 5;
            default:
                return null;
        }
    }

    static Integer n0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        switch (lowerCase) {
            case "bottom":
                return 80;
            case "center":
                return 16;
            case "top":
                return 48;
            default:
                return null;
        }
    }

    static boolean p0(String str) {
        return str != null && (str.equalsIgnoreCase("false") || str.equalsIgnoreCase(AppEventsConstants.EVENT_PARAM_VALUE_NO));
    }

    static boolean q0(String str) {
        return str != null && (str.equalsIgnoreCase(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE) || str.equalsIgnoreCase(AppEventsConstants.EVENT_PARAM_VALUE_YES));
    }

    final String C(String str) {
        HashMap map = this.f21856b;
        if (map != null) {
            return (String) map.get(str);
        }
        return null;
    }

    protected void G(XmlPullParser xmlPullParser) {
    }

    final int K(String str) {
        String strC = C(str);
        if (TextUtils.isEmpty(strC)) {
            h7.e.a("VastXmlTag", "Error parse attribute value - %s, by name - %s", strC, str);
            return -1;
        }
        try {
            return Integer.parseInt(strC);
        } catch (Exception unused) {
            h7.e.b("VastXmlTag", "Error parse attribute value - %s, by name - %s", strC, str);
            return -1;
        }
    }

    public final boolean j0(String str, boolean z10) {
        String strC = C(str);
        if (q0(strC)) {
            return true;
        }
        if (p0(strC)) {
            return false;
        }
        return z10;
    }

    public String[] k0() {
        return new String[0];
    }

    public final String l0() {
        return this.f21855a;
    }

    public boolean o0() {
        return false;
    }

    public void r0(XmlPullParser xmlPullParser) {
        F(D(this, xmlPullParser));
        if (o0()) {
            s0(Y(xmlPullParser));
        }
        G(xmlPullParser);
    }

    public final void s0(String str) {
        this.f21855a = str;
    }

    public u(XmlPullParser xmlPullParser) {
        r0(xmlPullParser);
    }

    static int e0(String str) {
        if (str == null) {
            return -1;
        }
        int iIndexOf = str.indexOf(".");
        if (iIndexOf > 0) {
            str = str.substring(0, iIndexOf);
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length <= 2) {
            return -1;
        }
        try {
            return (Integer.parseInt(strArrSplit[0]) * 3600) + (Integer.parseInt(strArrSplit[1]) * 60) + Integer.parseInt(strArrSplit[2]);
        } catch (Exception e10) {
            h7.e.c(sRGQSqxgxlS.AoAXhcpkwtpfrzp, e10);
            return -1;
        }
    }
}
