package f8;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.base.t;
import com.google.common.collect.b0;
import com.google.common.collect.u;
import com.google.firebase.crashlytics.internal.RPrM.UICvx;
import g7.EinF.ZHgPsTG;
import io.bidmachine.media3.common.ParserException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p9.p;
import u7.q;
import u7.w;
import x7.i0;
import x7.l0;
import x7.m0;
import x7.r;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: compiled from: DashManifestParser.java */
/* JADX INFO: loaded from: classes4.dex */
public class d extends DefaultHandler implements io.bidmachine.media3.exoplayer.upstream.c.a<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f14678b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f14679c = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f14680d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f14681e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f14682f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f14683a;

    /* JADX INFO: compiled from: DashManifestParser.java */
    protected static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f14684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u<b> f14685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k f14686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f14687d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList<u7.l.b> f14688e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList<e> f14689f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f14690g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<e> f14691h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final List<e> f14692i;

        public a(q qVar, List<b> list, k kVar, String str, ArrayList<u7.l.b> arrayList, ArrayList<e> arrayList2, List<e> list2, List<e> list3, long j10) {
            this.f14684a = qVar;
            this.f14685b = u.B(list);
            this.f14686c = kVar;
            this.f14687d = str;
            this.f14688e = arrayList;
            this.f14689f = arrayList2;
            this.f14691h = list2;
            this.f14692i = list3;
            this.f14690g = j10;
        }
    }

    public d() {
        try {
            this.f14683a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    protected static int D(List<e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f14693a) && (str = eVar.f14694b) != null) {
                Matcher matcher = f14679c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                r.h("MpdParser", "Unable to parse CEA-608 channel number from: " + eVar.f14694b);
            }
        }
        return -1;
    }

    protected static int E(List<e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f14693a) && (str = eVar.f14694b) != null) {
                Matcher matcher = f14680d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                r.h("MpdParser", "Unable to parse CEA-708 service block number from: " + eVar.f14694b);
            }
        }
        return -1;
    }

    protected static long H(XmlPullParser xmlPullParser, String str, long j10) throws ParserException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : l0.a1(attributeValue);
    }

    protected static e I(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strU0 = u0(xmlPullParser, "schemeIdUri", "");
        String strU1 = u0(xmlPullParser, "value", null);
        String strU2 = u0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!m0.d(xmlPullParser, str));
        return new e(strU0, strU1, strU2);
    }

    protected static int J(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || attributeValue.length() != 6) {
            return -1;
        }
        int i10 = Integer.parseInt(attributeValue, 16);
        return (8388608 & i10) != 0 ? L(str) : K(i10);
    }

    private static int K(int i10) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = f14681e;
            if (i11 >= iArr.length) {
                break;
            }
            i12 += ((i10 >> i11) & 1) * iArr[i11];
            i11++;
        }
        if (i12 == 0) {
            return -1;
        }
        return i12;
    }

    private static int L(String str) {
        String[] strArrO1 = l0.o1(str);
        if (strArrO1.length == 0) {
            return -1;
        }
        List<String> listJ = t.f('.').j(com.google.common.base.c.e(strArrO1[0].trim()));
        if (listJ.size() != 4 || !listJ.get(0).equals("ac-4")) {
            return -1;
        }
        String str2 = listJ.get(3);
        str2.hashCode();
        if (str2.equals("03")) {
            return 18;
        }
        return !str2.equals("04") ? -1 : 21;
    }

    protected static int M(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String strE = com.google.common.base.c.e(attributeValue);
        strE.hashCode();
        switch (strE) {
            case "4000":
                return 1;
            case "a000":
                return 2;
            case "f800":
                return 5;
            case "f801":
                return 6;
            case "fa01":
                return 8;
            default:
                return -1;
        }
    }

    protected static int N(XmlPullParser xmlPullParser) {
        int iX = X(xmlPullParser, "value", -1);
        if (iX <= 0 || iX >= 33) {
            return -1;
        }
        return iX;
    }

    protected static int O(XmlPullParser xmlPullParser) {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return iBitCount;
    }

    protected static long P(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : l0.b1(attributeValue);
    }

    protected static String Q(List<e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            String str = eVar.f14693a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(eVar.f14694b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(eVar.f14694b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    protected static float U(XmlPullParser xmlPullParser, String str, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f10 : Float.parseFloat(attributeValue);
    }

    protected static float V(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f10;
        }
        Matcher matcher = f14678b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f10;
        }
        int i10 = Integer.parseInt(matcher.group(1));
        String strGroup = matcher.group(2);
        return !TextUtils.isEmpty(strGroup) ? i10 / Integer.parseInt(strGroup) : i10;
    }

    protected static int X(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i10 : Integer.parseInt(attributeValue);
    }

    protected static long Z(List<e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if (com.google.common.base.c.a("http://dashif.org/guidelines/last-segment-number", eVar.f14693a)) {
                return Long.parseLong(eVar.f14694b);
            }
        }
        return -1L;
    }

    protected static long a0(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : Long.parseLong(attributeValue);
    }

    private long b(List<k.d> list, long j10, long j11, int i10, long j12) {
        int iL = i10 >= 0 ? i10 + 1 : (int) l0.l(j12 - j10, j11);
        for (int i11 = 0; i11 < iL; i11++) {
            list.add(m(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    protected static int c0(XmlPullParser xmlPullParser) {
        int iX = X(xmlPullParser, "value", -1);
        if (iX < 0) {
            return -1;
        }
        int[] iArr = f14682f;
        if (iX < iArr.length) {
            return iArr[iX];
        }
        return -1;
    }

    private static int p(int i10, int i11) {
        if (i10 == -1) {
            return i11;
        }
        if (i11 == -1) {
            return i10;
        }
        x7.a.g(i10 == i11);
        return i10;
    }

    private static String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        x7.a.g(str.equals(str2));
        return str;
    }

    private static void r(ArrayList<u7.l.b> arrayList) {
        String str;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                str = null;
                break;
            }
            u7.l.b bVar = arrayList.get(i10);
            if (u7.f.f26061c.equals(bVar.f26198b) && (str = bVar.f26199c) != null) {
                arrayList.remove(i10);
                break;
            }
            i10++;
        }
        if (str == null) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            u7.l.b bVar2 = arrayList.get(i11);
            if (u7.f.f26060b.equals(bVar2.f26198b) && bVar2.f26199c == null) {
                arrayList.set(i11, new u7.l.b(u7.f.f26061c, str, bVar2.f26200d, bVar2.f26201e));
            }
        }
    }

    private static void s(ArrayList<u7.l.b> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u7.l.b bVar = arrayList.get(size);
            if (!bVar.c()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (arrayList.get(i10).a(bVar)) {
                        arrayList.remove(size);
                        break;
                    }
                }
            }
        }
    }

    private static long t(long j10, long j11) {
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        if (j10 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j10;
    }

    private static String u(String str, String str2) {
        if (w.o(str)) {
            return w.c(str2);
        }
        if (w.t(str)) {
            return w.n(str2);
        }
        if (w.s(str) || w.q(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String strG = w.g(str2);
        return "text/vtt".equals(strG) ? "application/x-mp4-vtt" : strG;
    }

    protected static String u0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    private boolean v(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    protected static String v0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                w(xmlPullParser);
            }
        } while (!m0.d(xmlPullParser, str));
        return text;
    }

    public static void w(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (m0.e(xmlPullParser)) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (m0.e(xmlPullParser)) {
                    i10++;
                } else if (m0.c(xmlPullParser)) {
                    i10--;
                }
            }
        }
    }

    protected int A(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strU0 = u0(xmlPullParser, "schemeIdUri", null);
        strU0.hashCode();
        int iN = -1;
        switch (strU0) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                iN = N(xmlPullParser);
                break;
            case "tag:dolby.com,2015:dash:audio_channel_configuration:2015":
                iN = J(xmlPullParser, str);
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                iN = X(xmlPullParser, "value", -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                iN = M(xmlPullParser);
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                iN = c0(xmlPullParser);
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                iN = O(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!m0.d(xmlPullParser, "AudioChannelConfiguration"));
        return iN;
    }

    protected long B(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    protected List<b> C(XmlPullParser xmlPullParser, List<b> list, boolean z10) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : z10 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i11 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String strV0 = v0(xmlPullParser, "BaseURL");
        if (i0.c(strV0)) {
            if (attributeValue3 == null) {
                attributeValue3 = strV0;
            }
            return b0.j(new b(strV0, attributeValue3, i10, i11));
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            b bVar = list.get(i12);
            String strE = i0.e(bVar.f14661a, strV0);
            String str = attributeValue3 == null ? strE : attributeValue3;
            if (z10) {
                i10 = bVar.f14663c;
                i11 = bVar.f14664d;
                str = bVar.f14662b;
            }
            arrayList.add(new b(strE, str, i10, i11));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:69:0x0118  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9 */
    protected Pair<String, u7.l.b> F(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? text;
        ?? B;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue2 != null) {
            String strE = com.google.common.base.c.e(attributeValue2);
            strE.hashCode();
            switch (strE) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = u7.f.f26061c;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    B = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = u7.f.f26063e;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    B = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = u7.f.f26062d;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    B = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    String strB = m0.b(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(strB) && !"00000000-0000-0000-0000-000000000000".equals(strB)) {
                        String[] strArrSplit = strB.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                            uuidArr[i10] = UUID.fromString(strArrSplit[i10]);
                        }
                        uuid = u7.f.f26060b;
                        text = 0;
                        B = p.b(uuid, uuidArr, null);
                        break;
                    } else {
                        r.h("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        uuid = null;
                        uuid2 = uuid;
                        text = uuid2;
                        B = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    text = uuid2;
                    B = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            text = uuid2;
            B = uuid2;
        }
        do {
            xmlPullParser.next();
            if ((m0.f(xmlPullParser, "clearkey:Laurl") || m0.f(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                B = B;
                text = xmlPullParser.getText();
            } else if (m0.f(xmlPullParser, "ms:laurl")) {
                B = B;
                text = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (B == 0 && m0.g(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                UUID uuidF = p.f(bArrDecode);
                if (uuidF == null) {
                    r.h("MpdParser", "Skipping malformed cenc:pssh data");
                    uuid = uuidF;
                    B = 0;
                    text = text;
                } else {
                    B = bArrDecode;
                    uuid = uuidF;
                    text = text;
                }
            } else if (B == 0) {
                UUID uuid3 = u7.f.f26063e;
                if (uuid3.equals(uuid) && m0.f(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    B = p.a(uuid3, Base64.decode(xmlPullParser.getText(), 0));
                    text = text;
                } else {
                    w(xmlPullParser);
                    B = B;
                    text = text;
                }
            } else {
                w(xmlPullParser);
                B = B;
                text = text;
            }
        } while (!m0.d(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new u7.l.b(uuid, text, "video/mp4", B) : null);
    }

    protected int G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    protected Pair<Long, g9.a> R(XmlPullParser xmlPullParser, String str, String str2, long j10, long j11, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long jA0 = a0(xmlPullParser, "id", 0L);
        long jA1 = a0(xmlPullParser, "duration", -9223372036854775807L);
        long jA2 = a0(xmlPullParser, "presentationTime", 0L);
        long jF1 = l0.f1(jA1, 1000L, j10);
        long jF2 = l0.f1(jA2 - j11, 1000000L, j10);
        String strU0 = u0(xmlPullParser, "messageData", null);
        byte[] bArrS = S(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jF2);
        if (strU0 != null) {
            bArrS = l0.u0(strU0);
        }
        return Pair.create(lValueOf, d(str, str2, jA0, jF1, bArrS));
    }

    protected byte[] S(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
        xmlPullParser.nextToken();
        while (!m0.d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i10), xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    protected f T(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ArrayList arrayList;
        String strU0 = u0(xmlPullParser, "schemeIdUri", "");
        String strU1 = u0(xmlPullParser, "value", "");
        long jA0 = a0(xmlPullParser, "timescale", 1L);
        long jA1 = a0(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j10 = jA1;
                arrayList = arrayList2;
                arrayList.add(R(xmlPullParser, strU0, strU1, jA0, j10, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                arrayList = arrayList2;
                w(xmlPullParser);
            }
            if (m0.d(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            jA1 = jA1;
        }
        long[] jArr = new long[arrayList.size()];
        g9.a[] aVarArr = new g9.a[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            jArr[i10] = ((Long) pair.first).longValue();
            aVarArr[i10] = (g9.a) pair.second;
        }
        return e(strU0, strU1, jA0, jArr, aVarArr);
    }

    protected i W(XmlPullParser xmlPullParser) {
        return g0(xmlPullParser, "sourceURL", "range");
    }

    protected u7.r Y(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return new u7.r(xmlPullParser.getAttributeValue(null, "lang"), v0(xmlPullParser, "Label"));
    }

    protected f8.a c(long j10, int i10, List<j> list, List<e> list2, List<e> list3, List<e> list4) {
        return new f8.a(j10, i10, list, list2, list3, list4);
    }

    protected g9.a d(String str, String str2, long j10, long j11, byte[] bArr) {
        return new g9.a(str, str2, j11, j10, bArr);
    }

    protected Pair<g, Long> d0(XmlPullParser xmlPullParser, List<b> list, long j10, long j11, long j12, long j13, boolean z10) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        List<f8.a> list2;
        List<f> list3;
        Object obj;
        long j14;
        k kVarO0;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long jP = P(xmlPullParser2, "start", j10);
        long j15 = -9223372036854775807L;
        long j16 = j12 != -9223372036854775807L ? j12 + jP : -9223372036854775807L;
        long jP2 = P(xmlPullParser2, "duration", -9223372036854775807L);
        List<f8.a> arrayList2 = new ArrayList<>();
        List<f> arrayList3 = new ArrayList<>();
        ArrayList arrayList4 = new ArrayList();
        long jB = j11;
        boolean z11 = false;
        long j17 = -9223372036854775807L;
        k kVarM0 = null;
        e eVarI = null;
        while (true) {
            xmlPullParser.next();
            if (m0.f(xmlPullParser2, "BaseURL")) {
                if (!z11) {
                    jB = B(xmlPullParser2, jB);
                    z11 = true;
                }
                arrayList4.addAll(C(xmlPullParser2, list, z10));
                list3 = arrayList3;
                arrayList = arrayList4;
                j14 = j15;
                obj = obj2;
                list2 = arrayList2;
            } else {
                if (m0.f(xmlPullParser2, "AdaptationSet")) {
                    jB = jB;
                    arrayList = arrayList4;
                    list2 = arrayList2;
                    list2.add(y(xmlPullParser, !arrayList4.isEmpty() ? arrayList4 : list, kVarM0, jP2, jB, j17, j16, j13, z10));
                    xmlPullParser2 = xmlPullParser;
                    list3 = arrayList3;
                } else {
                    jB = jB;
                    List<f> list4 = arrayList3;
                    arrayList = arrayList4;
                    list2 = arrayList2;
                    xmlPullParser2 = xmlPullParser;
                    if (m0.f(xmlPullParser2, "EventStream")) {
                        list4.add(T(xmlPullParser));
                        list3 = list4;
                    } else if (m0.f(xmlPullParser2, "SegmentBase")) {
                        list3 = list4;
                        kVarM0 = m0(xmlPullParser2, null);
                        obj = null;
                        jB = jB;
                        j14 = -9223372036854775807L;
                    } else {
                        list3 = list4;
                        if (m0.f(xmlPullParser2, "SegmentList")) {
                            long jB2 = B(xmlPullParser2, -9223372036854775807L);
                            obj = null;
                            kVarO0 = n0(xmlPullParser, null, j16, jP2, jB, jB2, j13);
                            j17 = jB2;
                            j14 = -9223372036854775807L;
                        } else {
                            obj = null;
                            if (m0.f(xmlPullParser2, "SegmentTemplate")) {
                                long jB3 = B(xmlPullParser2, -9223372036854775807L);
                                j14 = -9223372036854775807L;
                                kVarO0 = o0(xmlPullParser, null, u.H(), j16, jP2, jB, jB3, j13);
                                j17 = jB3;
                            } else {
                                j14 = -9223372036854775807L;
                                if (m0.f(xmlPullParser2, "AssetIdentifier")) {
                                    eVarI = I(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    w(xmlPullParser);
                                }
                                jB = jB;
                            }
                        }
                        kVarM0 = kVarO0;
                    }
                }
                obj = null;
                j14 = -9223372036854775807L;
                jB = jB;
            }
            if (m0.d(xmlPullParser2, "Period")) {
                return Pair.create(h(attributeValue, jP, list2, list3, eVarI), Long.valueOf(jP2));
            }
            arrayList2 = list2;
            arrayList4 = arrayList;
            obj2 = obj;
            arrayList3 = list3;
            j15 = j14;
        }
    }

    protected f e(String str, String str2, long j10, long[] jArr, g9.a[] aVarArr) {
        return new f(str, str2, j10, jArr, aVarArr);
    }

    protected String[] e0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    protected q f(String str, String str2, int i10, int i11, float f10, int i12, int i13, int i14, String str3, List<e> list, List<e> list2, String str4, String str5, String str6, List<e> list3, List<e> list4) {
        String str7 = str5;
        String str8 = str4;
        String strU = u(str2, str8);
        if ("audio/eac3".equals(strU)) {
            strU = Q(list4);
            if ("audio/eac3-joc".equals(strU)) {
                str8 = "ec+3";
            }
        }
        if (w.p(str8, str7)) {
            if (str7 == null) {
                str7 = str8;
            }
            strU = "video/dolby-vision";
            str8 = str7;
        }
        int iS0 = s0(list);
        int iL0 = l0(list) | i0(list2) | k0(list3) | k0(list4);
        Pair<Integer, Integer> pairW0 = w0(list3);
        q.b bVarJ0 = new q.b().f0(str).U(str2).u0(strU).S(str8).p0(i14).w0(iS0).s0(iL0).j0(str3);
        int iE = -1;
        q.b bVarA0 = bVarJ0.z0(pairW0 != null ? ((Integer) pairW0.first).intValue() : -1).A0(pairW0 != null ? ((Integer) pairW0.second).intValue() : -1);
        if (w.t(strU)) {
            bVarA0.B0(i10).d0(i11).b0(f10);
        } else if (w.o(strU)) {
            bVarA0.R(i12).v0(i13);
        } else if (w.s(strU)) {
            if ("application/cea-608".equals(strU)) {
                iE = D(list2);
            } else if ("application/cea-708".equals(strU)) {
                iE = E(list2);
            }
            bVarA0.O(iE);
        } else if (w.q(strU)) {
            bVarA0.B0(i10).d0(i11);
        }
        return bVarA0.N();
    }

    protected c g(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        return new c(j10, j11, j12, z10, j13, j14, j15, j16, hVar, oVar, lVar, uri, list);
    }

    protected i g0(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j10 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j11 = (Long.parseLong(strArrSplit[1]) - j10) + 1;
            }
            return i(attributeValue, j10, j11);
        }
        j10 = 0;
        j11 = -1;
        return i(attributeValue, j10, j11);
    }

    protected g h(String str, long j10, List<f8.a> list, List<f> list2, e eVar) {
        return new g(str, j10, list, list2, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x021c A[LOOP:0: B:3:0x007a->B:59:0x021c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x01c0 A[EDGE_INSN: B:60:0x01c0->B:49:0x01c0 BREAK  A[LOOP:0: B:3:0x007a->B:59:0x021c], SYNTHETIC] */
    protected a h0(XmlPullParser xmlPullParser, List<b> list, String str, String str2, String str3, String str4, int i10, int i11, float f10, int i12, int i13, String str5, List<e> list2, List<e> list3, List<e> list4, List<e> list5, k kVar, long j10, long j11, long j12, long j13, long j14, boolean z10) throws XmlPullParserException, IOException {
        long j15;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        long jB;
        ArrayList arrayList7;
        k eVar;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        int iX = X(xmlPullParser, "bandwidth", -1);
        String strU0 = u0(xmlPullParser, "mimeType", str);
        String strU1 = u0(xmlPullParser, "codecs", str2);
        String strU2 = u0(xmlPullParser, "scte214:supplementalCodecs", str3);
        String strU3 = u0(xmlPullParser, "scte214:supplementalProfiles", str4);
        int iX2 = X(xmlPullParser, ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i10);
        int iX3 = X(xmlPullParser, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, i11);
        float fV = V(xmlPullParser, f10);
        int iX4 = X(xmlPullParser, "audioSamplingRate", i13);
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList(list4);
        ArrayList arrayList14 = new ArrayList(list5);
        int iA = i12;
        long jB2 = j12;
        boolean z11 = false;
        String str6 = null;
        k kVarO0 = kVar;
        long j16 = j13;
        ArrayList arrayList15 = new ArrayList();
        while (true) {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, "BaseURL")) {
                if (!z11) {
                    jB2 = B(xmlPullParser, jB2);
                    z11 = true;
                }
                arrayList15.addAll(C(xmlPullParser, list, z10));
                jB2 = jB2;
            } else {
                if (m0.f(xmlPullParser, "AudioChannelConfiguration")) {
                    eVar = kVarO0;
                    iA = A(xmlPullParser, strU1);
                    arrayList5 = arrayList11;
                    arrayList6 = arrayList13;
                    arrayList10 = arrayList15;
                } else if (m0.f(xmlPullParser, "SegmentBase")) {
                    kVarO0 = m0(xmlPullParser, (k.e) kVarO0);
                } else {
                    if (m0.f(xmlPullParser, "SegmentList")) {
                        jB = B(xmlPullParser, j16);
                        j15 = jB2;
                        arrayList9 = arrayList15;
                        arrayList = arrayList13;
                        arrayList2 = arrayList14;
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList12;
                        kVarO0 = n0(xmlPullParser, (k.b) kVarO0, j10, j11, j15, jB, j14);
                    } else {
                        j15 = jB2;
                        ArrayList arrayList16 = arrayList15;
                        arrayList = arrayList13;
                        arrayList2 = arrayList14;
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList12;
                        if (m0.f(xmlPullParser, "SegmentTemplate")) {
                            jB = B(xmlPullParser, j16);
                            kVarO0 = o0(xmlPullParser, (k.c) kVarO0, list5, j10, j11, j15, jB, j14);
                            arrayList9 = arrayList16;
                        } else {
                            strU1 = strU1;
                            if (m0.f(xmlPullParser, "ContentProtection")) {
                                Pair<String, u7.l.b> pairF = F(xmlPullParser);
                                Object obj = pairF.first;
                                if (obj != null) {
                                    str6 = (String) obj;
                                }
                                Object obj2 = pairF.second;
                                if (obj2 != null) {
                                    arrayList5 = arrayList3;
                                    arrayList5.add((u7.l.b) obj2);
                                } else {
                                    arrayList5 = arrayList3;
                                }
                                jB2 = j15;
                                arrayList6 = arrayList;
                                arrayList14 = arrayList2;
                                arrayList8 = arrayList16;
                                arrayList12 = arrayList4;
                                arrayList7 = arrayList8;
                            } else {
                                arrayList5 = arrayList3;
                                if (m0.f(xmlPullParser, "InbandEventStream")) {
                                    arrayList12 = arrayList4;
                                    arrayList12.add(I(xmlPullParser, "InbandEventStream"));
                                    arrayList6 = arrayList;
                                } else {
                                    arrayList12 = arrayList4;
                                    if (m0.f(xmlPullParser, "EssentialProperty")) {
                                        arrayList6 = arrayList;
                                        arrayList6.add(I(xmlPullParser, "EssentialProperty"));
                                    } else {
                                        arrayList6 = arrayList;
                                        if (m0.f(xmlPullParser, "SupplementalProperty")) {
                                            arrayList14 = arrayList2;
                                            arrayList14.add(I(xmlPullParser, "SupplementalProperty"));
                                        } else {
                                            arrayList14 = arrayList2;
                                            w(xmlPullParser);
                                        }
                                    }
                                    iA = iA;
                                    jB2 = j15;
                                    arrayList7 = arrayList16;
                                }
                                arrayList14 = arrayList2;
                                iA = iA;
                                jB2 = j15;
                                arrayList7 = arrayList16;
                            }
                        }
                        eVar = kVarO0;
                        arrayList10 = arrayList7;
                    }
                    j16 = jB;
                    jB2 = j15;
                    arrayList6 = arrayList;
                    arrayList14 = arrayList2;
                    arrayList5 = arrayList3;
                    arrayList8 = arrayList9;
                    arrayList12 = arrayList4;
                    arrayList7 = arrayList8;
                    eVar = kVarO0;
                    arrayList10 = arrayList7;
                }
                if (m0.d(xmlPullParser, "Representation")) {
                    break;
                }
                arrayList13 = arrayList6;
                arrayList11 = arrayList5;
                kVarO0 = eVar;
                arrayList15 = arrayList10;
                strU1 = strU1;
                iA = iA;
            }
            iA = iA;
            eVar = kVarO0;
            arrayList5 = arrayList11;
            arrayList6 = arrayList13;
            arrayList10 = arrayList15;
            if (m0.d(xmlPullParser, "Representation")) {
                break;
                break;
            }
            arrayList13 = arrayList6;
            arrayList11 = arrayList5;
            kVarO0 = eVar;
            arrayList15 = arrayList10;
            strU1 = strU1;
            iA = iA;
        }
        List<e> list6 = arrayList14;
        List<e> list7 = arrayList6;
        ArrayList arrayList17 = arrayList12;
        ArrayList arrayList18 = arrayList5;
        q qVarF = f(attributeValue, strU0, iX2, iX3, fV, iA, iX4, iX, str5, list2, list3, strU1, strU2, strU3, list7, list6);
        if (eVar == null) {
            eVar = new k.e();
        }
        boolean zIsEmpty = arrayList10.isEmpty();
        List list8 = arrayList10;
        if (zIsEmpty) {
            list8 = list;
        }
        return new a(qVarF, list8, eVar, str6, arrayList18, arrayList17, list7, list6, -1L);
    }

    protected i i(String str, long j10, long j11) {
        return new i(str, j10, j11);
    }

    protected int i0(List<e> list) {
        int iX0;
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if (com.google.common.base.c.a("urn:mpeg:dash:role:2011", eVar.f14693a)) {
                iX0 = j0(eVar.f14694b);
            } else {
                if (com.google.common.base.c.a("urn:tva:metadata:cs:AudioPurposeCS:2007", eVar.f14693a)) {
                    iX0 = x0(eVar.f14694b);
                }
            }
            i10 |= iX0;
        }
        return i10;
    }

    protected j j(a aVar, String str, List<u7.r> list, String str2, ArrayList<u7.l.b> arrayList, ArrayList<e> arrayList2) {
        q.b bVarB = aVar.f14684a.b();
        if (str == null || !list.isEmpty()) {
            bVarB.i0(list);
        } else {
            bVarB.h0(str);
        }
        String str3 = aVar.f14687d;
        if (str3 == null) {
            str3 = str2;
        }
        ArrayList<u7.l.b> arrayList3 = aVar.f14688e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            s(arrayList3);
            bVarB.Y(new u7.l(str3, arrayList3));
        }
        ArrayList<e> arrayList4 = aVar.f14689f;
        arrayList4.addAll(arrayList2);
        return j.o(aVar.f14690g, bVarB.N(), aVar.f14685b, aVar.f14686c, arrayList4, aVar.f14691h, aVar.f14692i, null);
    }

    protected int j0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "subtitle":
            case "forced_subtitle":
            case "forced-subtitle":
                return 128;
            case "description":
                return 512;
            case "enhanced-audio-intelligibility":
                return 2048;
            case "alternate":
                return 2;
            case "dub":
                return 16;
            case "main":
                return 1;
            case "sign":
                return UserVerificationMethods.USER_VERIFY_HANDPRINT;
            case "caption":
                return 64;
            case "commentary":
                return 8;
            case "emergency":
                return 32;
            case "supplementary":
                return 4;
            default:
                return 0;
        }
    }

    protected k.b k(i iVar, long j10, long j11, long j12, long j13, List<k.d> list, long j14, List<i> list2, long j15, long j16) {
        return new k.b(iVar, j10, j11, j12, j13, list, j14, list2, l0.S0(j15), l0.S0(j16));
    }

    protected int k0(List<e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (com.google.common.base.c.a("http://dashif.org/guidelines/trickmode", list.get(i11).f14693a)) {
                i10 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
        }
        return i10;
    }

    protected k.c l(i iVar, long j10, long j11, long j12, long j13, long j14, List<k.d> list, long j15, n nVar, n nVar2, long j16, long j17) {
        return new k.c(iVar, j10, j11, j12, j13, j14, list, j15, nVar, nVar2, l0.S0(j16), l0.S0(j17));
    }

    protected int l0(List<e> list) {
        int iJ0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if (com.google.common.base.c.a("urn:mpeg:dash:role:2011", eVar.f14693a)) {
                iJ0 |= j0(eVar.f14694b);
            }
        }
        return iJ0;
    }

    protected k.d m(long j10, long j11) {
        return new k.d(j10, j11);
    }

    protected k.e m0(XmlPullParser xmlPullParser, k.e eVar) throws XmlPullParserException, IOException {
        long j10;
        long j11;
        long jA0 = a0(xmlPullParser, "timescale", eVar != null ? eVar.f14730b : 1L);
        long jA1 = a0(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f14731c : 0L);
        long j12 = eVar != null ? eVar.f14744d : 0L;
        long j13 = eVar != null ? eVar.f14745e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j11 = Long.parseLong(strArrSplit[0]);
            j10 = (Long.parseLong(strArrSplit[1]) - j11) + 1;
        } else {
            j10 = j13;
            j11 = j12;
        }
        i iVarW = eVar != null ? eVar.f14729a : null;
        do {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, "Initialization")) {
                iVarW = W(xmlPullParser);
            } else {
                w(xmlPullParser);
            }
        } while (!m0.d(xmlPullParser, "SegmentBase"));
        return n(iVarW, jA0, jA1, j11, j10);
    }

    protected k.e n(i iVar, long j10, long j11, long j12, long j13) {
        return new k.e(iVar, j10, j11, j12, j13);
    }

    protected o o(String str, String str2) {
        return new o(str, str2);
    }

    protected k.c o0(XmlPullParser xmlPullParser, k.c cVar, List<e> list, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long jA0 = a0(xmlPullParser, "timescale", cVar != null ? cVar.f14730b : 1L);
        long jA1 = a0(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f14731c : 0L);
        long jA2 = a0(xmlPullParser, "duration", cVar != null ? cVar.f14733e : -9223372036854775807L);
        long jA3 = a0(xmlPullParser, "startNumber", cVar != null ? cVar.f14732d : 1L);
        long jZ = Z(list);
        long jT = t(j12, j13);
        List<k.d> listP0 = null;
        n nVarY0 = y0(xmlPullParser, ShareConstants.WEB_DIALOG_PARAM_MEDIA, cVar != null ? cVar.f14740k : null);
        n nVarY1 = y0(xmlPullParser, "initialization", cVar != null ? cVar.f14739j : null);
        i iVarW = null;
        do {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, "Initialization")) {
                iVarW = W(xmlPullParser);
            } else if (m0.f(xmlPullParser, "SegmentTimeline")) {
                listP0 = p0(xmlPullParser, jA0, j11);
            } else {
                w(xmlPullParser);
            }
        } while (!m0.d(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (iVarW == null) {
                iVarW = cVar.f14729a;
            }
            if (listP0 == null) {
                listP0 = cVar.f14734f;
            }
        }
        return l(iVarW, jA0, jA1, jA3, jZ, jA2, listP0, jT, nVarY1, nVarY0, j14, j10);
    }

    protected List<k.d> p0(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jB = 0;
        long jA0 = -9223372036854775807L;
        boolean z10 = false;
        int iX = 0;
        do {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, "S")) {
                long jA1 = a0(xmlPullParser, "t", -9223372036854775807L);
                if (z10) {
                    jB = b(arrayList, jB, jA0, iX, jA1);
                }
                if (jA1 == -9223372036854775807L) {
                    jA1 = jB;
                }
                jA0 = a0(xmlPullParser, "d", -9223372036854775807L);
                iX = X(xmlPullParser, "r", 0);
                z10 = true;
                jB = jA1;
            } else {
                w(xmlPullParser);
            }
        } while (!m0.d(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            b(arrayList, jB, jA0, iX, l0.f1(j11, j10, 1000L));
        }
        return arrayList;
    }

    protected i q0(XmlPullParser xmlPullParser) {
        return g0(xmlPullParser, ShareConstants.WEB_DIALOG_PARAM_MEDIA, "mediaRange");
    }

    protected int r0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    protected int s0(List<e> list) {
        int iR0 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if (com.google.common.base.c.a("urn:mpeg:dash:role:2011", eVar.f14693a)) {
                iR0 |= r0(eVar.f14694b);
            }
        }
        return iR0;
    }

    protected l t0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long jA0 = -9223372036854775807L;
        long jA1 = -9223372036854775807L;
        long jA2 = -9223372036854775807L;
        float fU = -3.4028235E38f;
        float fU2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, "Latency")) {
                jA0 = a0(xmlPullParser, "target", -9223372036854775807L);
                jA1 = a0(xmlPullParser, "min", -9223372036854775807L);
                jA2 = a0(xmlPullParser, AppLovinMediationProvider.MAX, -9223372036854775807L);
            } else if (m0.f(xmlPullParser, "PlaybackRate")) {
                fU = U(xmlPullParser, "min", -3.4028235E38f);
                fU2 = U(xmlPullParser, AppLovinMediationProvider.MAX, -3.4028235E38f);
            }
            long j10 = jA0;
            long j11 = jA1;
            long j12 = jA2;
            float f10 = fU;
            float f11 = fU2;
            if (m0.d(xmlPullParser, "ServiceDescription")) {
                return new l(j10, j11, j12, f10, f11);
            }
            jA0 = j10;
            jA1 = j11;
            jA2 = j12;
            fU = f10;
            fU2 = f11;
        }
    }

    protected Pair<Integer, Integer> w0(List<e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if ((com.google.common.base.c.a("http://dashif.org/thumbnail_tile", eVar.f14693a) || com.google.common.base.c.a("http://dashif.org/guidelines/thumbnail_tile", eVar.f14693a)) && (str = eVar.f14694b) != null) {
                String[] strArrM1 = l0.m1(str, "x");
                if (strArrM1.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(strArrM1[0])), Integer.valueOf(Integer.parseInt(strArrM1[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.c.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public c a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f14683a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return b0(xmlPullParserNewPullParser, uri);
            }
            throw ParserException.e("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw ParserException.e(null, e10);
        }
    }

    protected int x0(String str) {
        if (str == null) {
            return 0;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 49:
                if (str.equals(AppEventsConstants.EVENT_PARAM_VALUE_YES)) {
                    b10 = 0;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    b10 = 1;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    b10 = 2;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    b10 = 3;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    b10 = 4;
                }
                break;
        }
        switch (b10) {
            case 0:
                return 512;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0361 A[LOOP:0: B:3:0x008c->B:76:0x0361, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x031f A[EDGE_INSN: B:77:0x031f->B:70:0x031f BREAK  A[LOOP:0: B:3:0x008c->B:76:0x0361], SYNTHETIC] */
    protected f8.a y(XmlPullParser xmlPullParser, List<b> list, k kVar, long j10, long j11, long j12, long j13, long j14, boolean z10) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        Object obj;
        String str;
        List<u7.r> list2;
        ArrayList<e> arrayList2;
        long j15;
        long j16;
        int i10;
        ArrayList<e> arrayList3;
        long jB;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long jA0 = a0(xmlPullParser2, "id", -1L);
        int iG = G(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "scte214:supplementalCodecs");
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, "scte214:supplementalProfiles");
        int iX = X(xmlPullParser2, ViewHierarchyConstants.DIMENSION_WIDTH_KEY, -1);
        int iX2 = X(xmlPullParser2, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, -1);
        float fV = V(xmlPullParser2, -1.0f);
        int iX3 = X(xmlPullParser2, "audioSamplingRate", -1);
        String str2 = "lang";
        String attributeValue5 = xmlPullParser2.getAttributeValue(null, "lang");
        String attributeValue6 = xmlPullParser2.getAttributeValue(null, "label");
        List<u7.r> arrayList4 = new ArrayList<>();
        ArrayList<u7.l.b> arrayList5 = new ArrayList<>();
        ArrayList<e> arrayList6 = new ArrayList<>();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        k kVarO0 = kVar;
        int iA = -1;
        List<u7.r> list3 = arrayList4;
        boolean z11 = false;
        String str3 = null;
        String str4 = attributeValue5;
        long jB2 = j11;
        long j17 = j12;
        while (true) {
            xmlPullParser.next();
            arrayList = arrayList11;
            if (m0.f(xmlPullParser2, "BaseURL")) {
                if (!z11) {
                    jB2 = B(xmlPullParser2, jB2);
                    z11 = true;
                }
                arrayList12.addAll(C(xmlPullParser2, list, z10));
                jB2 = jB2;
                arrayList3 = arrayList6;
            } else {
                long j18 = jB2;
                ArrayList<e> arrayList13 = arrayList6;
                if (m0.f(xmlPullParser2, "ContentProtection")) {
                    Pair<String, u7.l.b> pairF = F(xmlPullParser);
                    Object obj2 = pairF.first;
                    if (obj2 != null) {
                        str3 = (String) obj2;
                    }
                    Object obj3 = pairF.second;
                    if (obj3 != null) {
                        arrayList5.add((u7.l.b) obj3);
                    }
                    arrayList3 = arrayList13;
                    jB2 = j18;
                } else {
                    if (m0.f(xmlPullParser2, "ContentComponent")) {
                        obj = null;
                        String strQ = q(str4, xmlPullParser2.getAttributeValue(null, str2));
                        iG = p(iG, G(xmlPullParser));
                        str4 = strQ;
                    } else {
                        obj = null;
                        if (m0.f(xmlPullParser2, "Role")) {
                            arrayList8.add(I(xmlPullParser2, "Role"));
                        } else if (m0.f(xmlPullParser2, "AudioChannelConfiguration")) {
                            iA = A(xmlPullParser2, attributeValue2);
                        } else {
                            String str5 = ZHgPsTG.twJ;
                            if (m0.f(xmlPullParser2, str5)) {
                                arrayList7.add(I(xmlPullParser2, str5));
                            } else if (m0.f(xmlPullParser2, "EssentialProperty")) {
                                arrayList9.add(I(xmlPullParser2, "EssentialProperty"));
                            } else if (m0.f(xmlPullParser2, "SupplementalProperty")) {
                                arrayList10.add(I(xmlPullParser2, "SupplementalProperty"));
                            } else {
                                if (m0.f(xmlPullParser2, "Representation")) {
                                    int i11 = iG;
                                    arrayList10 = arrayList10;
                                    arrayList9 = arrayList9;
                                    arrayList8 = arrayList8;
                                    arrayList7 = arrayList7;
                                    arrayList2 = arrayList13;
                                    arrayList5 = arrayList5;
                                    str = str4;
                                    list2 = list3;
                                    str2 = str2;
                                    attributeValue2 = attributeValue2;
                                    arrayList12 = arrayList12;
                                    a aVarH0 = h0(xmlPullParser, !arrayList12.isEmpty() ? arrayList12 : list, attributeValue, attributeValue2, attributeValue3, attributeValue4, iX, iX2, fV, iA, iX3, str, arrayList8, arrayList7, arrayList9, arrayList10, kVarO0, j13, j10, j18, j17, j14, z10);
                                    int iP = p(i11, w.k(aVarH0.f14684a.f26252o));
                                    arrayList = arrayList;
                                    arrayList.add(aVarH0);
                                    xmlPullParser2 = xmlPullParser;
                                    jB = j17;
                                    iG = iP;
                                    jB2 = j18;
                                } else {
                                    int i12 = iG;
                                    arrayList10 = arrayList10;
                                    arrayList9 = arrayList9;
                                    arrayList8 = arrayList8;
                                    arrayList7 = arrayList7;
                                    arrayList5 = arrayList5;
                                    str = str4;
                                    str2 = str2;
                                    attributeValue2 = attributeValue2;
                                    arrayList12 = arrayList12;
                                    list2 = list3;
                                    arrayList = arrayList;
                                    arrayList2 = arrayList13;
                                    j15 = j18;
                                    xmlPullParser2 = xmlPullParser;
                                    if (m0.f(xmlPullParser2, "SegmentBase")) {
                                        jB = j17;
                                        kVarO0 = m0(xmlPullParser2, (k.e) kVarO0);
                                        iG = i12;
                                        jB2 = j15;
                                        arrayList3 = arrayList2;
                                        list3 = list2;
                                        str4 = str;
                                        xmlPullParser2 = xmlPullParser2;
                                    } else {
                                        if (m0.f(xmlPullParser2, "SegmentList")) {
                                            jB = B(xmlPullParser2, j17);
                                            i10 = i12;
                                            kVarO0 = n0(xmlPullParser, (k.b) kVarO0, j13, j10, j15, jB, j14);
                                        } else {
                                            j16 = j17;
                                            i10 = i12;
                                            if (m0.f(xmlPullParser2, "SegmentTemplate")) {
                                                jB = B(xmlPullParser2, j16);
                                                kVarO0 = o0(xmlPullParser, (k.c) kVarO0, arrayList10, j13, j10, j15, jB, j14);
                                            } else {
                                                xmlPullParser2 = xmlPullParser2;
                                                if (m0.f(xmlPullParser2, "InbandEventStream")) {
                                                    arrayList3 = arrayList2;
                                                    arrayList3.add(I(xmlPullParser2, "InbandEventStream"));
                                                    list3 = list2;
                                                } else {
                                                    arrayList3 = arrayList2;
                                                    if (m0.f(xmlPullParser2, "Label")) {
                                                        list3 = list2;
                                                        list3.add(Y(xmlPullParser));
                                                    } else {
                                                        list3 = list2;
                                                        if (m0.e(xmlPullParser)) {
                                                            z(xmlPullParser);
                                                        }
                                                    }
                                                }
                                                jB = j16;
                                                jB2 = j15;
                                                iG = i10;
                                                str4 = str;
                                            }
                                        }
                                        jB2 = j15;
                                        iG = i10;
                                    }
                                }
                                arrayList3 = arrayList2;
                                list3 = list2;
                                str4 = str;
                            }
                        }
                        i10 = iG;
                        arrayList10 = arrayList10;
                        arrayList9 = arrayList9;
                        arrayList8 = arrayList8;
                        arrayList7 = arrayList7;
                        arrayList5 = arrayList5;
                        str = str4;
                        str2 = str2;
                        attributeValue2 = attributeValue2;
                        arrayList12 = arrayList12;
                        list3 = list3;
                        arrayList = arrayList;
                        arrayList3 = arrayList13;
                        j15 = j18;
                        j16 = j17;
                        jB = j16;
                        jB2 = j15;
                        iG = i10;
                        str4 = str;
                    }
                    arrayList10 = arrayList10;
                    arrayList9 = arrayList9;
                    arrayList8 = arrayList8;
                    arrayList7 = arrayList7;
                    arrayList5 = arrayList5;
                    str2 = str2;
                    attributeValue2 = attributeValue2;
                    arrayList12 = arrayList12;
                    list3 = list3;
                    arrayList = arrayList;
                    arrayList3 = arrayList13;
                    jB2 = j18;
                    jB = j17;
                }
                if (m0.d(xmlPullParser2, "AdaptationSet")) {
                    break;
                }
                arrayList6 = arrayList3;
                arrayList11 = arrayList;
                j17 = jB;
                arrayList9 = arrayList9;
                arrayList8 = arrayList8;
                arrayList7 = arrayList7;
                arrayList5 = arrayList5;
                str2 = str2;
                attributeValue2 = attributeValue2;
                arrayList12 = arrayList12;
                list3 = list3;
                arrayList10 = arrayList10;
            }
            jB = j17;
            if (m0.d(xmlPullParser2, "AdaptationSet")) {
                break;
                break;
            }
            arrayList6 = arrayList3;
            arrayList11 = arrayList;
            j17 = jB;
            arrayList9 = arrayList9;
            arrayList8 = arrayList8;
            arrayList7 = arrayList7;
            arrayList5 = arrayList5;
            str2 = str2;
            attributeValue2 = attributeValue2;
            arrayList12 = arrayList12;
            list3 = list3;
            arrayList10 = arrayList10;
        }
        List<j> arrayList14 = new ArrayList<>(arrayList.size());
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            arrayList14.add(j((a) arrayList.get(i13), attributeValue6, list3, str3, arrayList5, arrayList3));
        }
        return c(jA0, iG, arrayList14, arrayList7, arrayList9, arrayList10);
    }

    protected n y0(XmlPullParser xmlPullParser, String str, n nVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? n.b(attributeValue) : nVar;
    }

    protected void z(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        w(xmlPullParser);
    }

    protected o z0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:71:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e8 A[LOOP:0: B:25:0x00a5->B:82:0x01e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x01a4 A[SYNTHETIC] */
    protected c b0(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        long j10;
        boolean z10;
        long j11;
        Throwable th;
        ArrayList arrayList;
        boolean z11;
        long j12;
        d dVar = this;
        boolean zV = dVar.v(dVar.e0(xmlPullParser, "profiles", new String[0]));
        long j13 = -9223372036854775807L;
        long jH = H(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long jP = P(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long jP2 = P(xmlPullParser, "minBufferTime", -9223372036854775807L);
        Throwable th2 = null;
        boolean zEquals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long jP3 = zEquals ? P(xmlPullParser, ljglrLUdGZhMhQ.oPrKrfRrz, -9223372036854775807L) : -9223372036854775807L;
        long jP4 = zEquals ? P(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long jP5 = zEquals ? P(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long jH2 = H(xmlPullParser, "publishTime", -9223372036854775807L);
        long jB = zEquals ? 0L : -9223372036854775807L;
        boolean z12 = true;
        ArrayList arrayListJ = b0.j(new b(uri.toString(), uri.toString(), zV ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean z13 = false;
        boolean z14 = false;
        long j14 = zEquals ? -9223372036854775807L : 0L;
        h hVarF0 = null;
        o oVarZ0 = null;
        Uri uriF = null;
        l lVarT0 = null;
        while (true) {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, "BaseURL")) {
                if (!z13) {
                    jB = dVar.B(xmlPullParser, jB);
                    z13 = z12;
                }
                arrayList3.addAll(dVar.C(xmlPullParser, arrayListJ, zV));
            } else if (m0.f(xmlPullParser, "ProgramInformation")) {
                hVarF0 = f0(xmlPullParser);
            } else if (m0.f(xmlPullParser, "UTCTiming")) {
                oVarZ0 = z0(xmlPullParser);
            } else if (m0.f(xmlPullParser, "Location")) {
                uriF = i0.f(uri.toString(), xmlPullParser.nextText());
            } else {
                if (m0.f(xmlPullParser, "ServiceDescription")) {
                    lVarT0 = t0(xmlPullParser);
                } else {
                    if (!m0.f(xmlPullParser, "Period") || z14) {
                        j10 = jB;
                        z10 = z12;
                        j11 = j13;
                        th = th2;
                        arrayList = arrayList2;
                        w(xmlPullParser);
                    } else {
                        j10 = jB;
                        arrayList = arrayList2;
                        z10 = z12;
                        j11 = j13;
                        th = th2;
                        Pair<g, Long> pairD0 = d0(xmlPullParser, !arrayList3.isEmpty() ? arrayList3 : arrayListJ, j14, j10, jH, jP4, zV);
                        g gVar = (g) pairD0.first;
                        if (gVar.f14702b != j11) {
                            long jLongValue = ((Long) pairD0.second).longValue();
                            long j15 = jLongValue == j11 ? j11 : gVar.f14702b + jLongValue;
                            arrayList.add(gVar);
                            j14 = j15;
                            z11 = z14;
                        } else {
                            if (!zEquals) {
                                throw ParserException.e("Unable to determine start of period " + arrayList.size(), th);
                            }
                            arrayList = arrayList;
                            z11 = z10;
                        }
                        z14 = z11;
                    }
                    jB = j10;
                }
                if (m0.d(xmlPullParser, "MPD")) {
                    if (jP != j11) {
                        j12 = jP;
                    } else if (j14 != j11) {
                        j12 = j14;
                    } else {
                        if (!zEquals) {
                            throw ParserException.e("Unable to determine duration of static manifest.", th);
                        }
                        j12 = jP;
                    }
                    if (arrayList.isEmpty()) {
                        throw ParserException.e("No periods found.", th);
                    }
                    return g(jH, j12, jP2, zEquals, jP3, jP4, jP5, jH2, hVarF0, oVarZ0, lVarT0, uriF, arrayList);
                }
                arrayList2 = arrayList;
                th2 = th;
                arrayList3 = arrayList3;
                z12 = z10;
                arrayListJ = arrayListJ;
                j13 = j11;
                dVar = this;
            }
            arrayList3 = arrayList3;
            arrayListJ = arrayListJ;
            z10 = z12;
            j11 = j13;
            th = th2;
            arrayList = arrayList2;
            if (m0.d(xmlPullParser, "MPD")) {
                if (jP != j11) {
                    j12 = jP;
                } else if (j14 != j11) {
                    j12 = j14;
                } else {
                    if (!zEquals) {
                        throw ParserException.e("Unable to determine duration of static manifest.", th);
                    }
                    j12 = jP;
                }
                if (arrayList.isEmpty()) {
                    return g(jH, j12, jP2, zEquals, jP3, jP4, jP5, jH2, hVarF0, oVarZ0, lVarT0, uriF, arrayList);
                }
                throw ParserException.e("No periods found.", th);
            }
            arrayList2 = arrayList;
            th2 = th;
            arrayList3 = arrayList3;
            z12 = z10;
            arrayListJ = arrayListJ;
            j13 = j11;
            dVar = this;
        }
    }

    protected h f0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String strU0 = u0(xmlPullParser, "moreInformationURL", null);
        String strU1 = u0(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (m0.f(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (m0.f(xmlPullParser, "Copyright")) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                w(xmlPullParser);
            }
            String str = strNextText3;
            if (m0.d(xmlPullParser, UICvx.YJUUOcMd)) {
                return new h(strNextText, strNextText2, str, strU0, strU1);
            }
            strNextText3 = str;
        }
    }

    protected k.b n0(XmlPullParser xmlPullParser, k.b bVar, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long jA0 = a0(xmlPullParser, "timescale", bVar != null ? bVar.f14730b : 1L);
        long jA1 = a0(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f14731c : 0L);
        long jA2 = a0(xmlPullParser, GEmOVMyH.GxZAsxgr, bVar != null ? bVar.f14733e : -9223372036854775807L);
        long jA3 = a0(xmlPullParser, "startNumber", bVar != null ? bVar.f14732d : 1L);
        long jT = t(j12, j13);
        List<k.d> listP0 = null;
        List<i> arrayList = null;
        i iVarW = null;
        do {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, "Initialization")) {
                iVarW = W(xmlPullParser);
            } else if (m0.f(xmlPullParser, "SegmentTimeline")) {
                listP0 = p0(xmlPullParser, jA0, j11);
            } else if (m0.f(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(q0(xmlPullParser));
            } else {
                w(xmlPullParser);
            }
        } while (!m0.d(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (iVarW == null) {
                iVarW = bVar.f14729a;
            }
            if (listP0 == null) {
                listP0 = bVar.f14734f;
            }
            if (arrayList == null) {
                arrayList = bVar.f14738j;
            }
        }
        return k(iVarW, jA0, jA1, jA3, jA2, listP0, jT, arrayList, j14, j10);
    }
}
