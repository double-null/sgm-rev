package d9;

import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
import com.google.common.collect.u;
import io.bidmachine.media3.common.ParserException;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import x7.m0;
import x7.r;

/* JADX INFO: compiled from: XmpMotionPhotoDescriptionParser.java */
/* JADX INFO: loaded from: classes4.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f13438a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f13439b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f13440c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static c a(String str) throws IOException {
        try {
            return b(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            r.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static u<c.a> c(XmlPullParser xmlPullParser) {
        for (String str : f13440c) {
            String strA = m0.a(xmlPullParser, str);
            if (strA != null) {
                return u.K(new c.a("image/jpeg", "Primary", 0L, 0L), new c.a("video/mp4", "MotionPhoto", Long.parseLong(strA), 0L));
            }
        }
        return u.H();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f13438a) {
            String strA = m0.a(xmlPullParser, str);
            if (strA != null) {
                return Integer.parseInt(strA) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String str : f13439b) {
            String strA = m0.a(xmlPullParser, str);
            if (strA != null) {
                long j10 = Long.parseLong(strA);
                if (j10 == -1) {
                    return -9223372036854775807L;
                }
                return j10;
            }
        }
        return -9223372036854775807L;
    }

    private static u<c.a> f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        u.a aVarV = u.v();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (m0.f(xmlPullParser, str3)) {
                String strA = m0.a(xmlPullParser, str2 + ":Mime");
                String strA2 = m0.a(xmlPullParser, str2 + ":Semantic");
                String strA3 = m0.a(xmlPullParser, str2 + ":Length");
                String strA4 = m0.a(xmlPullParser, str2 + ":Padding");
                if (strA == null || strA2 == null) {
                    return u.H();
                }
                aVarV.a(new c.a(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!m0.d(xmlPullParser, str4));
        return aVarV.m();
    }

    private static c b(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (m0.f(xmlPullParserNewPullParser, "x:xmpmeta")) {
            u<c.a> uVarH = u.H();
            long jE = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (m0.f(xmlPullParserNewPullParser, "rdf:Description")) {
                    if (!d(xmlPullParserNewPullParser)) {
                        return null;
                    }
                    jE = e(xmlPullParserNewPullParser);
                    uVarH = c(xmlPullParserNewPullParser);
                } else if (m0.f(xmlPullParserNewPullParser, "Container:Directory")) {
                    uVarH = f(xmlPullParserNewPullParser, ljglrLUdGZhMhQ.jWvlhgPqPMj, "Item");
                } else if (m0.f(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    uVarH = f(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!m0.d(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (uVarH.isEmpty()) {
                return null;
            }
            return new c(jE, uVarH);
        }
        throw ParserException.b("Couldn't find xmp metadata", null);
    }
}
