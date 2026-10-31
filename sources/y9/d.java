package y9;

import android.text.Layout;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import com.google.firebase.crashlytics.internal.RPrM.UICvx;
import io.bidmachine.media3.extractor.text.SubtitleDecoderException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import rd.PSo.cNMUz;
import s9.i;
import s9.k;
import s9.r;
import x7.j;
import x7.l;
import x7.l0;
import x7.m0;

/* JADX INFO: compiled from: TtmlParser.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f28818b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f28819c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f28820d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Pattern f28821e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Pattern f28822f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f28823g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f28824h = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f28825i = new a(30.0f, 1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f28826a;

    /* JADX INFO: compiled from: TtmlParser.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f28827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f28828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f28829c;

        a(float f10, int i10, int i11) {
            this.f28827a = f10;
            this.f28828b = i10;
            this.f28829c = i11;
        }
    }

    /* JADX INFO: compiled from: TtmlParser.java */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f28830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f28831b;

        b(int i10, int i11) {
            this.f28830a = i10;
            this.f28831b = i11;
        }
    }

    public d() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f28826a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static g d(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static boolean e(String str) {
        return str.equals("tt") || str.equals("head") || str.equals(SDKConstants.PARAM_A2U_BODY) || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE) || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static Layout.Alignment f(String str) {
        String strE = com.google.common.base.c.e(str);
        strE.hashCode();
        switch (strE) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static int g(XmlPullParser xmlPullParser, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i10;
        }
        Matcher matcher = f28824h.matcher(attributeValue);
        if (!matcher.matches()) {
            x7.r.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
        boolean z10 = true;
        try {
            int i11 = Integer.parseInt((String) x7.a.e(matcher.group(1)));
            int i12 = Integer.parseInt((String) x7.a.e(matcher.group(2)));
            if (i11 == 0 || i12 == 0) {
                z10 = false;
            }
            x7.a.b(z10, "Invalid cell resolution " + i11 + " " + i12);
            return i12;
        } catch (NumberFormatException unused) {
            x7.r.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i10;
        }
    }

    private static void h(String str, g gVar) throws SubtitleDecoderException {
        Matcher matcher;
        String[] strArrM1 = l0.m1(str, "\\s+");
        if (strArrM1.length == 1) {
            matcher = f28820d.matcher(str);
        } else {
            if (strArrM1.length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + strArrM1.length + ".");
            }
            matcher = f28820d.matcher(strArrM1[1]);
            x7.r.h("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        String str2 = (String) x7.a.e(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                gVar.C(3);
                break;
            case "em":
                gVar.C(2);
                break;
            case "px":
                gVar.C(1);
                break;
            default:
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.B(Float.parseFloat((String) x7.a.e(matcher.group(1))));
    }

    private static a i(XmlPullParser xmlPullParser) {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrM1 = l0.m1(attributeValue2, " ");
            x7.a.b(strArrM1.length == 2, "frameRateMultiplier doesn't have 2 parts");
            f10 = Integer.parseInt(strArrM1[0]) / Integer.parseInt(strArrM1[1]);
        } else {
            f10 = 1.0f;
        }
        a aVar = f28825i;
        int i11 = aVar.f28828b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = aVar.f28829c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new a(i10 * f10, i11, i12);
    }

    private static Map<String, g> j(XmlPullParser xmlPullParser, Map<String, g> map, int i10, b bVar, Map<String, e> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) {
                String strA = m0.a(xmlPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE);
                g gVarO = o(xmlPullParser, new g());
                if (strA != null) {
                    for (String str : p(strA)) {
                        gVarO.a(map.get(str));
                    }
                }
                String strH = gVarO.h();
                if (strH != null) {
                    map.put(strH, gVarO);
                }
            } else if (m0.f(xmlPullParser, "region")) {
                e eVarM = m(xmlPullParser, i10, bVar, map);
                if (eVarM != null) {
                    map2.put(eVarM.f28832a, eVarM);
                }
            } else if (m0.f(xmlPullParser, "metadata")) {
                k(xmlPullParser, map3);
            }
        } while (!m0.d(xmlPullParser, "head"));
        return map;
    }

    private static void k(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, "image") && (strA = m0.a(xmlPullParser, "id")) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!m0.d(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:66:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:6:0x0039  */
    private static c l(XmlPullParser xmlPullParser, c cVar, Map<String, e> map, a aVar) throws SubtitleDecoderException {
        long j10;
        long j11;
        int attributeCount = xmlPullParser.getAttributeCount();
        g gVarO = o(xmlPullParser, null);
        String[] strArr = null;
        String strSubstring = null;
        String str = "";
        long jQ = -9223372036854775807L;
        long jQ2 = -9223372036854775807L;
        long jQ3 = -9223372036854775807L;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.hashCode();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jQ3 = q(attributeValue, aVar);
                    break;
                case "end":
                    jQ2 = q(attributeValue, aVar);
                    break;
                case "begin":
                    jQ = q(attributeValue, aVar);
                    break;
                case "style":
                    String[] strArrP = p(attributeValue);
                    if (strArrP.length > 0) {
                        strArr = strArrP;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (cVar != null) {
            long j12 = cVar.f28808d;
            j10 = -9223372036854775807L;
            if (j12 != -9223372036854775807L) {
                if (jQ != -9223372036854775807L) {
                    jQ += j12;
                }
                if (jQ2 != -9223372036854775807L) {
                    jQ2 += j12;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        long j13 = jQ;
        if (jQ2 != j10) {
            j11 = jQ2;
        } else if (jQ3 != j10) {
            j11 = j13 + jQ3;
        } else if (cVar != null) {
            long j14 = cVar.f28809e;
            if (j14 != j10) {
                j11 = j14;
            } else {
                j11 = jQ2;
            }
        } else {
            j11 = jQ2;
        }
        return c.c(xmlPullParser.getName(), j13, j11, gVarO, strArr, str, strSubstring, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x023d  */
    private static e m(XmlPullParser xmlPullParser, int i10, b bVar, Map<String, g> map) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i11;
        int i12;
        float f14;
        String strA;
        g gVar;
        float f15;
        float f16;
        String strA2;
        g gVar2;
        String strA3 = m0.a(xmlPullParser, "id");
        if (strA3 == null) {
            return null;
        }
        String strA4 = m0.a(xmlPullParser, "origin");
        if (strA4 == null && (strA2 = m0.a(xmlPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) != null && (gVar2 = map.get(strA2)) != null) {
            strA4 = gVar2.j();
        }
        if (strA4 != null) {
            Matcher matcher = f28822f.matcher(strA4);
            Matcher matcher2 = f28823g.matcher(strA4);
            if (matcher.matches()) {
                try {
                    f15 = Float.parseFloat((String) x7.a.e(matcher.group(1))) / 100.0f;
                    f16 = Float.parseFloat((String) x7.a.e(matcher.group(2))) / 100.0f;
                } catch (NumberFormatException unused) {
                    x7.r.h("TtmlParser", "Ignoring region with malformed origin: " + strA4);
                    return null;
                }
            } else {
                if (!matcher2.matches()) {
                    x7.r.h("TtmlParser", "Ignoring region with unsupported origin: " + strA4);
                    return null;
                }
                if (bVar == null) {
                    x7.r.h("TtmlParser", "Ignoring region with missing tts:extent: " + strA4);
                    return null;
                }
                try {
                    int i13 = Integer.parseInt((String) x7.a.e(matcher2.group(1)));
                    int i14 = Integer.parseInt((String) x7.a.e(matcher2.group(2)));
                    float f17 = i13 / bVar.f28830a;
                    float f18 = i14 / bVar.f28831b;
                    f15 = f17;
                    f16 = f18;
                } catch (NumberFormatException unused2) {
                    x7.r.h("TtmlParser", "Ignoring region with malformed origin: " + strA4);
                    return null;
                }
            }
            float f19 = f15;
            f11 = f16;
            f10 = f19;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        String strA5 = m0.a(xmlPullParser, "extent");
        if (strA5 == null && (strA = m0.a(xmlPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) != null && (gVar = map.get(strA)) != null) {
            strA5 = gVar.c();
        }
        if (strA5 != null) {
            Matcher matcher3 = f28822f.matcher(strA5);
            Matcher matcher4 = f28823g.matcher(strA5);
            if (matcher3.matches()) {
                try {
                    f12 = Float.parseFloat((String) x7.a.e(matcher3.group(1))) / 100.0f;
                    f14 = Float.parseFloat((String) x7.a.e(matcher3.group(2))) / 100.0f;
                } catch (NumberFormatException unused3) {
                    x7.r.h("TtmlParser", "Ignoring region with malformed extent: " + strA4);
                    return null;
                }
            } else {
                if (!matcher4.matches()) {
                    x7.r.h("TtmlParser", "Ignoring region with unsupported extent: " + strA4);
                    return null;
                }
                if (bVar == null) {
                    x7.r.h("TtmlParser", "Ignoring region with missing tts:extent: " + strA4);
                    return null;
                }
                try {
                    int i15 = Integer.parseInt((String) x7.a.e(matcher4.group(1)));
                    int i16 = Integer.parseInt((String) x7.a.e(matcher4.group(2)));
                    float f20 = i15 / bVar.f28830a;
                    f14 = i16 / bVar.f28831b;
                    f12 = f20;
                } catch (NumberFormatException unused4) {
                    x7.r.h("TtmlParser", "Ignoring region with malformed extent: " + strA4);
                    return null;
                }
            }
            f13 = f14;
        } else {
            f12 = 1.0f;
            f13 = 1.0f;
        }
        String strA6 = m0.a(xmlPullParser, "displayAlign");
        if (strA6 != null) {
            String strE = com.google.common.base.c.e(strA6);
            strE.hashCode();
            if (strE.equals("center")) {
                f11 += f13 / 2.0f;
                i11 = 1;
            } else if (strE.equals("after")) {
                f11 += f13;
                i11 = 2;
            } else {
                i11 = 0;
            }
        } else {
            i11 = 0;
        }
        float f21 = f11;
        float f22 = 1.0f / i10;
        String strA7 = m0.a(xmlPullParser, "writingMode");
        if (strA7 != null) {
            String strE2 = com.google.common.base.c.e(strA7);
            strE2.hashCode();
            switch (strE2) {
                case "tb":
                case "tblr":
                    i12 = 2;
                    break;
                case "tbrl":
                    i12 = 1;
                    break;
                default:
                    i12 = Integer.MIN_VALUE;
                    break;
            }
        } else {
            i12 = Integer.MIN_VALUE;
        }
        return new e(strA3, f10, f21, 0, i11, f12, f13, 1, f22, i12);
    }

    private static float n(String str) {
        Matcher matcher = f28821e.matcher(str);
        if (!matcher.matches()) {
            x7.r.h("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) x7.a.e(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            x7.r.i("TtmlParser", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    private static String[] p(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : l0.m1(strTrim, "\\s+");
    }

    private static long q(String str, a aVar) throws SubtitleDecoderException {
        double d10;
        double d11;
        Matcher matcher = f28818b.matcher(str);
        if (matcher.matches()) {
            double d12 = (Long.parseLong((String) x7.a.e(matcher.group(1))) * 3600) + (Long.parseLong((String) x7.a.e(matcher.group(2))) * 60) + Long.parseLong((String) x7.a.e(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d13 = d12 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d14 = d13 + (strGroup2 != null ? Long.parseLong(strGroup2) / aVar.f28827a : 0.0d);
            String strGroup3 = matcher.group(6);
            return (long) ((d14 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) aVar.f28828b)) / ((double) aVar.f28827a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f28819c.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException("Malformed time expression: " + str);
        }
        double d15 = Double.parseDouble((String) x7.a.e(matcher2.group(1)));
        String str2 = (String) x7.a.e(matcher2.group(2));
        str2.hashCode();
        switch (str2) {
            case "f":
                d10 = aVar.f28827a;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            case "h":
                d11 = 3600.0d;
                break;
            case "m":
                d11 = 60.0d;
                break;
            case "t":
                d10 = aVar.f28829c;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            case "ms":
                d10 = 1000.0d;
                d15 /= d10;
                return (long) (d15 * 1000000.0d);
            default:
                return (long) (d15 * 1000000.0d);
        }
        d15 *= d11;
        return (long) (d15 * 1000000.0d);
    }

    private static b r(XmlPullParser xmlPullParser) {
        String strA = m0.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f28823g.matcher(strA);
        if (!matcher.matches()) {
            x7.r.h("TtmlParser", "Ignoring non-pixel tts extent: " + strA);
            return null;
        }
        try {
            return new b(Integer.parseInt((String) x7.a.e(matcher.group(1))), Integer.parseInt((String) x7.a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            x7.r.h("TtmlParser", "Ignoring malformed tts extent: " + strA);
            return null;
        }
    }

    @Override // s9.r
    public k a(byte[] bArr, int i10, int i11) {
        char c10;
        a aVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f28826a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e(""));
            b bVarR = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            a aVarI = f28825i;
            h hVar = null;
            int i12 = 0;
            int iG = 15;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVarI = i(xmlPullParserNewPullParser);
                            c10 = 15;
                            iG = g(xmlPullParserNewPullParser, 15);
                            bVarR = r(xmlPullParserNewPullParser);
                        } else {
                            c10 = 15;
                        }
                        b bVar = bVarR;
                        a aVar2 = aVarI;
                        int i13 = iG;
                        if (e(name)) {
                            if ("head".equals(name)) {
                                aVar = aVar2;
                                j(xmlPullParserNewPullParser, map, i13, bVar, map2, map3);
                            } else {
                                aVar = aVar2;
                                try {
                                    c cVarL = l(xmlPullParserNewPullParser, cVar, map2, aVar);
                                    arrayDeque.push(cVarL);
                                    if (cVar != null) {
                                        cVar.a(cVarL);
                                    }
                                } catch (SubtitleDecoderException e10) {
                                    x7.r.i("TtmlParser", "Suppressing parser error", e10);
                                    i12++;
                                }
                            }
                            aVarI = aVar;
                            bVarR = bVar;
                            iG = i13;
                        } else {
                            x7.r.f("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i12++;
                            aVarI = aVar2;
                            bVarR = bVar;
                            iG = i13;
                        }
                    } else if (eventType == 4) {
                        ((c) x7.a.e(cVar)).a(c.d(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            hVar = new h((c) x7.a.e((c) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (k) x7.a.e(hVar);
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }

    @Override // s9.r
    public void b(byte[] bArr, int i10, int i11, r.b bVar, l<s9.e> lVar) {
        i.c(a(bArr, i10, i11), bVar, lVar);
    }

    @Override // s9.r
    public int c() {
        return 1;
    }

    private static g o(XmlPullParser xmlPullParser, g gVar) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            String attributeName = xmlPullParser.getAttributeName(i10);
            attributeName.hashCode();
            byte b10 = 5;
            byte b11 = -1;
            switch (attributeName) {
                case "fontStyle":
                    gVar = d(gVar).E("italic".equalsIgnoreCase(attributeValue));
                    break;
                case "extent":
                    gVar = d(gVar).y(attributeValue);
                    break;
                case "fontFamily":
                    gVar = d(gVar).A(attributeValue);
                    break;
                case "textAlign":
                    gVar = d(gVar).L(f(attributeValue));
                    break;
                case "origin":
                    gVar = d(gVar).H(attributeValue);
                    break;
                case "textDecoration":
                    String strE = com.google.common.base.c.e(attributeValue);
                    strE.hashCode();
                    switch (strE.hashCode()) {
                        case -1461280213:
                            if (strE.equals("nounderline")) {
                                b11 = 0;
                            }
                            break;
                        case -1026963764:
                            if (strE.equals("underline")) {
                                b11 = 1;
                            }
                            break;
                        case 913457136:
                            if (strE.equals(cNMUz.JGVFBZI)) {
                                b11 = 2;
                            }
                            break;
                        case 1679736913:
                            if (strE.equals("linethrough")) {
                                b11 = 3;
                            }
                            break;
                    }
                    switch (b11) {
                        case 0:
                            gVar = d(gVar).O(false);
                            break;
                        case 1:
                            gVar = d(gVar).O(true);
                            break;
                        case 2:
                            gVar = d(gVar).F(false);
                            break;
                        case 3:
                            gVar = d(gVar).F(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    gVar = d(gVar).x("bold".equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if (!AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE.equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        gVar = d(gVar).D(attributeValue);
                        break;
                    }
                    break;
                case "ruby":
                    String strE2 = com.google.common.base.c.e(attributeValue);
                    strE2.hashCode();
                    switch (strE2.hashCode()) {
                        case -618561360:
                            b10 = !strE2.equals("baseContainer") ? (byte) -1 : (byte) 0;
                            break;
                        case -410956671:
                            b10 = !strE2.equals("container") ? (byte) -1 : (byte) 1;
                            break;
                        case -250518009:
                            b10 = !strE2.equals("delimiter") ? (byte) -1 : (byte) 2;
                            break;
                        case -136074796:
                            b10 = !strE2.equals(UICvx.UKPm) ? (byte) -1 : (byte) 3;
                            break;
                        case 3016401:
                            b10 = !strE2.equals("base") ? (byte) -1 : (byte) 4;
                            break;
                        case 3556653:
                            if (!strE2.equals("text")) {
                                b10 = -1;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        case 0:
                        case 4:
                            gVar = d(gVar).J(2);
                            break;
                        case 1:
                            gVar = d(gVar).J(1);
                            break;
                        case 2:
                            gVar = d(gVar).J(4);
                            break;
                        case 3:
                        case 5:
                            gVar = d(gVar).J(3);
                            break;
                    }
                    break;
                case "color":
                    gVar = d(gVar);
                    try {
                        gVar.z(j.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        x7.r.h("TtmlParser", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                    break;
                case "shear":
                    gVar = d(gVar).K(n(attributeValue));
                    break;
                case "textCombine":
                    String strE3 = com.google.common.base.c.e(attributeValue);
                    strE3.hashCode();
                    if (!strE3.equals("all")) {
                        if (strE3.equals("none")) {
                            gVar = d(gVar).M(false);
                        }
                        break;
                    } else {
                        gVar = d(gVar).M(true);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        gVar = d(gVar);
                        h(attributeValue, gVar);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        x7.r.h("TtmlParser", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                    break;
                case "textEmphasis":
                    gVar = d(gVar).N(y9.b.a(attributeValue));
                    break;
                case "rubyPosition":
                    String strE4 = com.google.common.base.c.e(attributeValue);
                    strE4.hashCode();
                    if (!strE4.equals("before")) {
                        if (strE4.equals("after")) {
                            gVar = d(gVar).I(2);
                        }
                        break;
                    } else {
                        gVar = d(gVar).I(1);
                        break;
                    }
                    break;
                case "backgroundColor":
                    gVar = d(gVar);
                    try {
                        gVar.w(j.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        x7.r.h("TtmlParser", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                    break;
                case "multiRowAlign":
                    gVar = d(gVar).G(f(attributeValue));
                    break;
            }
        }
        return gVar;
    }
}
