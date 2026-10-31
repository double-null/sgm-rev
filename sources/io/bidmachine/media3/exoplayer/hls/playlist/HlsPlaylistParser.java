package io.bidmachine.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.applovin.mediation.ads.Zfi.OgqfiHA;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.facebook.appevents.AppEventsConstants;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import com.google.common.collect.u;
import com.google.common.collect.y;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import d5.LXP.wcAlQCOdREZdI;
import h8.h;
import io.bidmachine.media3.common.ParserException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p9.p;
import s.sBoZ.TwDPD;
import u7.f;
import u7.l;
import u7.q;
import u7.v;
import u7.w;
import x7.i0;
import x7.l0;
import x7.r;

/* JADX INFO: loaded from: classes4.dex */
public final class HlsPlaylistParser implements io.bidmachine.media3.exoplayer.upstream.c.a<i8.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f18881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f18882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f18840c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f18842d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f18844e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f18846f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f18848g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f18850h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f18852i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f18854j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f18856k = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f18858l = Pattern.compile("SUPPLEMENTAL-CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f18860m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f18862n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f18864o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f18866p = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Pattern f18868q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f18870r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f18872s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pattern f18874t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f18875u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pattern f18876v = c("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Pattern f18877w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Pattern f18878x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Pattern f18879y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Pattern f18880z = c("CAN-BLOCK-RELOAD");
    private static final Pattern A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern D = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern E = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern L = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern M = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern N = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern O = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern P = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern Q = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern R = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern S = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern T = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern U = Pattern.compile(wHzciBnJlYkdX.aNdY);
    private static final Pattern V = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern W = c(TwDPD.KHhtPU);
    private static final Pattern X = c("DEFAULT");
    private static final Pattern Y = c("FORCED");
    private static final Pattern Z = c("INDEPENDENT");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Pattern f18838a0 = c("GAP");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Pattern f18839b0 = c("PRECISE");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Pattern f18841c0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Pattern f18843d0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final Pattern f18845e0 = Pattern.compile("[:,]ID=\"(.+?)\"");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final Pattern f18847f0 = Pattern.compile("CLASS=\"(.+?)\"");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final Pattern f18849g0 = Pattern.compile(OgqfiHA.KsiXeqDT);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final Pattern f18851h0 = Pattern.compile("CUE=\"(.+?)\"");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Pattern f18853i0 = Pattern.compile("END-DATE=\"(.+?)\"");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final Pattern f18855j0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final Pattern f18857k0 = c("END-ON-NEXT");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final Pattern f18859l0 = Pattern.compile("X-ASSET-URI=\"(.+?)\"");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final Pattern f18861m0 = Pattern.compile("X-ASSET-LIST=\"(.+?)\"");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final Pattern f18863n0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final Pattern f18865o0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final Pattern f18867p0 = Pattern.compile("X-SNAP=\"(.+?)\"");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final Pattern f18869q0 = Pattern.compile("X-RESTRICT=\"(.+?)\"");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final Pattern f18871r0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Pattern f18873s0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public static final class DeltaUpdateException extends IOException {
    }

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BufferedReader f18883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Queue<String> f18884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f18885c;

        public a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f18884b = queue;
            this.f18883a = bufferedReader;
        }

        public boolean a() throws IOException {
            String strTrim;
            if (this.f18885c != null) {
                return true;
            }
            if (!this.f18884b.isEmpty()) {
                this.f18885c = (String) x7.a.e(this.f18884b.poll());
                return true;
            }
            do {
                String line = this.f18883a.readLine();
                this.f18885c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f18885c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String b() throws IOException {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.f18885c;
            this.f18885c = null;
            return str;
        }
    }

    public HlsPlaylistParser() {
        this(d.f18980n, null);
    }

    private static c.h A(String str) {
        double dT = t(str, f18875u, -9.223372036854776E18d);
        long j10 = dT == -9.223372036854776E18d ? -9223372036854775807L : (long) (dT * 1000000.0d);
        boolean zS = s(str, f18876v, false);
        double dT2 = t(str, f18878x, -9.223372036854776E18d);
        long j11 = dT2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dT2 * 1000000.0d);
        double dT3 = t(str, f18879y, -9.223372036854776E18d);
        return new c.h(j10, zS, j11, dT3 != -9.223372036854776E18d ? (long) (dT3 * 1000000.0d) : -9223372036854775807L, s(str, f18880z, false));
    }

    private static String B(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String strX = x(str, pattern, map);
        if (strX != null) {
            return strX;
        }
        throw ParserException.e("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    private static long C(String str, Pattern pattern) throws ParserException {
        return new BigDecimal(B(str, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String D(String str, Map<String, String> map) {
        Matcher matcher = f18871r0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int E(BufferedReader bufferedReader, boolean z10, int i10) throws IOException {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !l0.I0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    private static boolean b(BufferedReader bufferedReader) throws IOException {
        int i10 = bufferedReader.read();
        if (i10 == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i10 = bufferedReader.read();
        }
        int iE = E(bufferedReader, true, i10);
        for (int i11 = 0; i11 < 7; i11++) {
            if (iE != "#EXTM3U".charAt(i11)) {
                return false;
            }
            iE = bufferedReader.read();
        }
        return l0.I0(E(bufferedReader, false, iE));
    }

    private static l d(String str, l.b[] bVarArr) {
        l.b[] bVarArr2 = new l.b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr2[i10] = bVarArr[i10].b(null);
        }
        return new l(str, bVarArr2);
    }

    private static String e(long j10, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j10);
    }

    private static d.b f(ArrayList<d.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            d.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f18998d)) {
                return bVar;
            }
        }
        return null;
    }

    private static d.b g(ArrayList<d.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            d.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f18999e)) {
                return bVar;
            }
        }
        return null;
    }

    private static d.b h(ArrayList<d.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            d.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f18997c)) {
                return bVar;
            }
        }
        return null;
    }

    private static boolean i(String str, String str2, String str3, String str4) {
        if (!w.p(str2, str3)) {
            return false;
        }
        if (str3 == null) {
            return true;
        }
        if (str == null || str4 == null) {
            return false;
        }
        return (!str.equals("PQ") || str4.equals("db1p")) && (!str.equals("SDR") || str4.equals("db2g")) && (!str.equals("HLG") || str4.startsWith("db4"));
    }

    private static c.b k(String str, String str2, Map<String, String> map) throws ParserException {
        String str3 = str2 + "=";
        int iIndexOf = str.indexOf(str3) + str3.length();
        String strSubstring = str.substring(iIndexOf, (str.length() == iIndexOf + 1 ? 1 : 2) + iIndexOf);
        if (strSubstring.startsWith("\"")) {
            return new c.b(str2, B(str, Pattern.compile(str2 + "=\"(.+?)\""), map), 0);
        }
        if (strSubstring.equals("0x") || strSubstring.equals("0X")) {
            return new c.b(str2, B(str, Pattern.compile(str2 + "=(0[xX][A-F0-9]+)"), map), 1);
        }
        return new c.b(str2, l(str, Pattern.compile(str2 + "=([\\d\\.]+)\\b")));
    }

    private static double l(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(B(str, pattern, Collections.emptyMap()));
    }

    private static l.b m(String str, String str2, Map<String, String> map) throws ParserException {
        String strW = w(str, M, AppEventsConstants.EVENT_PARAM_VALUE_YES, map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strB = B(str, N, map);
            return new l.b(f.f26062d, "video/mp4", Base64.decode(strB.substring(strB.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new l.b(f.f26062d, "hls", l0.u0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(strW)) {
            return null;
        }
        String strB2 = B(str, N, map);
        byte[] bArrDecode = Base64.decode(strB2.substring(strB2.indexOf(44)), 0);
        UUID uuid = f.f26063e;
        return new l.b(uuid, "video/mp4", p.a(uuid, bArrDecode));
    }

    private static String n(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    private static int o(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(B(str, pattern, Collections.emptyMap()));
    }

    private static long p(String str, Pattern pattern) throws ParserException {
        return Long.parseLong(B(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0328 A[PHI: r80
      0x0328: PHI (r80v13 java.lang.String) = (r80v11 java.lang.String), (r80v1 java.lang.String) binds: [B:119:0x033e, B:111:0x031d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:233:0x068a A[PHI: r48
      0x068a: PHI (r48v11 int) = (r48v7 int), (r48v8 int), (r48v9 int), (r48v12 int) binds: [B:243:0x06af, B:239:0x06a2, B:235:0x0694, B:232:0x0688] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:296:0x07ce A[PHI: r45
      0x07ce: PHI (r45v12 java.util.regex.Matcher) = 
      (r45v5 java.util.regex.Matcher)
      (r45v6 java.util.regex.Matcher)
      (r45v7 java.util.regex.Matcher)
      (r45v8 java.util.regex.Matcher)
      (r45v9 java.util.regex.Matcher)
      (r45v10 java.util.regex.Matcher)
      (r45v13 java.util.regex.Matcher)
     binds: [B:318:0x081b, B:314:0x080d, B:310:0x07ff, B:306:0x07f2, B:302:0x07e5, B:298:0x07d8, B:295:0x07cc] A[DONT_GENERATE, DONT_INLINE]] */
    private static c q(d dVar, c cVar, a aVar, String str) throws IOException {
        ArrayList arrayList;
        String str2;
        String str3;
        boolean z10;
        int i10;
        ArrayList arrayList2;
        TreeMap treeMap;
        String strB;
        String str4;
        long j10;
        long j11;
        ArrayList arrayList3;
        long j12;
        ArrayList arrayList4;
        HashMap map;
        boolean z11;
        l lVar;
        Matcher matcher;
        byte b10;
        int i11;
        byte b11;
        String str5;
        dVar = dVar;
        cVar = cVar;
        boolean z12 = dVar.f16104c;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        c.h hVar = new c.h(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap2 = new TreeMap();
        boolean z13 = false;
        String str6 = "";
        boolean z14 = z12;
        c.h hVarA = hVar;
        int i12 = 0;
        boolean zS = false;
        boolean z15 = false;
        int i13 = 0;
        boolean z16 = false;
        boolean z17 = false;
        int i14 = 0;
        boolean z18 = false;
        long jS0 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long jP = 0;
        long jC = 0;
        long j17 = 0;
        String strW = str6;
        long j18 = -9223372036854775807L;
        int iO = 1;
        long jO = -9223372036854775807L;
        long jL = -9223372036854775807L;
        l lVarD = null;
        l lVar2 = null;
        String str7 = null;
        long j19 = -1;
        String str8 = null;
        String strN = null;
        c.f fVar = null;
        ArrayList arrayList10 = arrayList6;
        c.d dVar2 = null;
        while (aVar.a()) {
            String strB2 = aVar.b();
            if (strB2.startsWith("#EXT")) {
                arrayList8.add(strB2);
            }
            if (strB2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strB3 = B(strB2, f18874t, map2);
                if ("VOD".equals(strB3)) {
                    i12 = 1;
                } else if ("EVENT".equals(strB3)) {
                    i12 = 2;
                }
            } else if (strB2.equals("#EXT-X-I-FRAMES-ONLY")) {
                z18 = true;
            } else {
                if (strB2.startsWith("#EXT-X-START")) {
                    arrayList9 = arrayList9;
                    long jL2 = (long) (l(strB2, F) * 1000000.0d);
                    zS = s(strB2, f18839b0, z13);
                    j18 = jL2;
                } else {
                    arrayList9 = arrayList9;
                    if (strB2.startsWith("#EXT-X-SERVER-CONTROL")) {
                        hVarA = A(strB2);
                    } else if (strB2.startsWith("#EXT-X-PART-INF")) {
                        jL = (long) (l(strB2, f18870r) * 1000000.0d);
                    } else if (strB2.startsWith("#EXT-X-MAP")) {
                        String strB4 = B(strB2, N, map2);
                        String strX = x(strB2, H, map2);
                        if (strX != null) {
                            String[] strArrM1 = l0.m1(strX, "@");
                            j19 = Long.parseLong(strArrM1[z13 ? 1 : 0]);
                            if (strArrM1.length > 1) {
                                j14 = Long.parseLong(strArrM1[1]);
                            }
                        }
                        if (j19 == -1) {
                            j14 = 0;
                        }
                        String str9 = str7;
                        String str10 = str8;
                        if (str9 != null && str10 == null) {
                            throw ParserException.e(RHIpdOnfgiYkEj.KzMZ, null);
                        }
                        fVar = new c.f(strB4, j14, j19, str9, str10);
                        if (j19 != -1) {
                            j14 += j19;
                        }
                        str7 = str9;
                        str8 = str10;
                        arrayList9 = arrayList9;
                        j19 = -1;
                    } else {
                        str7 = str7;
                        str8 = str8;
                        if (strB2.startsWith("#EXT-X-TARGETDURATION")) {
                            jO = 1000000 * ((long) o(strB2, f18864o));
                        } else {
                            if (strB2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                jP = p(strB2, A);
                                str8 = str8;
                                str7 = str7;
                                j13 = jP;
                            } else if (strB2.startsWith("#EXT-X-VERSION")) {
                                iO = o(strB2, f18872s);
                            } else {
                                if (strB2.startsWith("#EXT-X-DEFINE")) {
                                    String strX2 = x(strB2, f18843d0, map2);
                                    if (strX2 != null) {
                                        String str11 = dVar.f18989l.get(strX2);
                                        if (str11 != null) {
                                            map2.put(strX2, str11);
                                        }
                                    } else {
                                        map2.put(B(strB2, S, map2), B(strB2, f18841c0, map2));
                                    }
                                    arrayList = arrayList10;
                                    str2 = str6;
                                    str3 = strN;
                                    z10 = false;
                                    i10 = i12;
                                    arrayList8 = arrayList8;
                                } else {
                                    if (strB2.startsWith("#EXTINF")) {
                                        jC = C(strB2, B);
                                        strW = w(strB2, C, str6, map2);
                                    } else {
                                        str2 = str6;
                                        if (strB2.startsWith("#EXT-X-SKIP")) {
                                            int iO2 = o(strB2, f18877w);
                                            x7.a.g(cVar != null && arrayList5.isEmpty());
                                            int i15 = (int) (j13 - ((c) l0.i(cVar)).f18926k);
                                            int i16 = iO2 + i15;
                                            if (i15 < 0 || i16 > cVar.f18933r.size()) {
                                                throw new DeltaUpdateException();
                                            }
                                            str8 = str8;
                                            String str12 = str7;
                                            long j20 = j16;
                                            while (i15 < i16) {
                                                c.f fVarB = cVar.f18933r.get(i15);
                                                ArrayList arrayList11 = arrayList10;
                                                ArrayList arrayList12 = arrayList8;
                                                if (j13 != cVar.f18926k) {
                                                    fVarB = fVarB.b(j20, (cVar.f18925j - i13) + fVarB.f18967d);
                                                }
                                                arrayList5.add(fVarB);
                                                j20 += fVarB.f18966c;
                                                long j21 = fVarB.f18973j;
                                                int i17 = i16;
                                                if (j21 != -1) {
                                                    j14 = fVarB.f18972i + j21;
                                                }
                                                int i18 = fVarB.f18967d;
                                                c.f fVar2 = fVarB.f18965b;
                                                l lVar3 = fVarB.f18969f;
                                                String str13 = fVarB.f18970g;
                                                String str14 = fVarB.f18971h;
                                                if (str14 == null || !str14.equals(Long.toHexString(jP))) {
                                                    str8 = fVarB.f18971h;
                                                }
                                                jP++;
                                                i15++;
                                                cVar = cVar;
                                                str12 = str13;
                                                j15 = j20;
                                                arrayList8 = arrayList12;
                                                i14 = i18;
                                                i16 = i17;
                                                fVar = fVar2;
                                                lVar2 = lVar3;
                                                arrayList10 = arrayList11;
                                            }
                                            dVar = dVar;
                                            cVar = cVar;
                                            str6 = str2;
                                            str7 = str12;
                                            j16 = j20;
                                        } else {
                                            arrayList = arrayList10;
                                            arrayList8 = arrayList8;
                                            if (strB2.startsWith("#EXT-X-KEY")) {
                                                String strB5 = B(strB2, K, map2);
                                                String strW2 = w(strB2, L, "identity", map2);
                                                if ("NONE".equals(strB5)) {
                                                    treeMap2.clear();
                                                    strB = null;
                                                    lVar2 = null;
                                                    str8 = null;
                                                } else {
                                                    String strX3 = x(strB2, O, map2);
                                                    if (!"identity".equals(strW2)) {
                                                        String str15 = strN;
                                                        strN = str15 == null ? n(strB5) : str15;
                                                        l.b bVarM = m(strB2, strW2, map2);
                                                        if (bVarM != null) {
                                                            treeMap2.put(strW2, bVarM);
                                                            str8 = strX3;
                                                            strB = null;
                                                            lVar2 = null;
                                                        } else {
                                                            str8 = strX3;
                                                            strB = null;
                                                        }
                                                    } else if ("AES-128".equals(strB5)) {
                                                        strB = B(strB2, N, map2);
                                                        str8 = strX3;
                                                    } else {
                                                        str8 = strX3;
                                                        strB = null;
                                                    }
                                                }
                                                str7 = strB;
                                                arrayList10 = arrayList;
                                            } else {
                                                String str16 = strN;
                                                if (strB2.startsWith("#EXT-X-BYTERANGE")) {
                                                    String[] strArrM2 = l0.m1(B(strB2, G, map2), "@");
                                                    j19 = Long.parseLong(strArrM2[0]);
                                                    if (strArrM2.length > 1) {
                                                        j14 = Long.parseLong(strArrM2[1]);
                                                    }
                                                } else {
                                                    if (strB2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                                        i13 = Integer.parseInt(strB2.substring(strB2.indexOf(58) + 1));
                                                        cVar = cVar;
                                                        strN = str16;
                                                        str8 = str8;
                                                        str7 = str7;
                                                        arrayList8 = arrayList8;
                                                        arrayList10 = arrayList;
                                                        arrayList9 = arrayList9;
                                                        z15 = true;
                                                    } else if (strB2.equals("#EXT-X-DISCONTINUITY")) {
                                                        i14++;
                                                    } else if (strB2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                        if (jS0 == 0) {
                                                            jS0 = l0.S0(l0.a1(strB2.substring(strB2.indexOf(58) + 1))) - j16;
                                                        } else {
                                                            i10 = i12;
                                                            str3 = str16;
                                                            str2 = str2;
                                                            z10 = false;
                                                        }
                                                    } else if (strB2.equals("#EXT-X-GAP")) {
                                                        cVar = cVar;
                                                        strN = str16;
                                                        str8 = str8;
                                                        str7 = str7;
                                                        arrayList8 = arrayList8;
                                                        arrayList10 = arrayList;
                                                        arrayList9 = arrayList9;
                                                        z17 = true;
                                                    } else if (strB2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                        cVar = cVar;
                                                        strN = str16;
                                                        str8 = str8;
                                                        str7 = str7;
                                                        arrayList8 = arrayList8;
                                                        arrayList10 = arrayList;
                                                        arrayList9 = arrayList9;
                                                        z14 = true;
                                                    } else if (strB2.equals("#EXT-X-ENDLIST")) {
                                                        cVar = cVar;
                                                        strN = str16;
                                                        str8 = str8;
                                                        str7 = str7;
                                                        arrayList8 = arrayList8;
                                                        arrayList10 = arrayList;
                                                        arrayList9 = arrayList9;
                                                        z16 = true;
                                                    } else {
                                                        if (strB2.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                            i10 = i12;
                                                            str4 = str16;
                                                            arrayList7.add(new c.e(Uri.parse(i0.e(str, B(strB2, N, map2))), v(strB2, D, -1L), u(strB2, E, -1)));
                                                        } else {
                                                            i10 = i12;
                                                            str4 = str16;
                                                            if (!strB2.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                                str3 = str4;
                                                                jP = jP;
                                                                if (strB2.startsWith("#EXT-X-PART")) {
                                                                    String strE = e(jP, str7, str8);
                                                                    String strB6 = B(strB2, N, map2);
                                                                    long jL3 = (long) (l(strB2, f18866p) * 1000000.0d);
                                                                    c.d dVar3 = dVar2;
                                                                    ArrayList arrayList13 = arrayList7;
                                                                    boolean zS2 = s(strB2, Z, false) | (z14 && arrayList.isEmpty());
                                                                    boolean zS3 = s(strB2, f18838a0, false);
                                                                    String strX4 = x(strB2, H, map2);
                                                                    if (strX4 != null) {
                                                                        String[] strArrM3 = l0.m1(strX4, "@");
                                                                        j11 = Long.parseLong(strArrM3[0]);
                                                                        if (strArrM3.length > 1) {
                                                                            j17 = Long.parseLong(strArrM3[1]);
                                                                        }
                                                                        j10 = -1;
                                                                    } else {
                                                                        j10 = -1;
                                                                        j11 = -1;
                                                                    }
                                                                    if (j11 == j10) {
                                                                        j17 = 0;
                                                                    }
                                                                    if (lVar2 == null && !treeMap2.isEmpty()) {
                                                                        l.b[] bVarArr = (l.b[]) treeMap2.values().toArray(new l.b[0]);
                                                                        l lVar4 = new l(str3, bVarArr);
                                                                        if (lVarD == null) {
                                                                            lVarD = d(str3, bVarArr);
                                                                        }
                                                                        lVar2 = lVar4;
                                                                    }
                                                                    arrayList.add(new c.d(strB6, fVar, jL3, i14, j15, lVar2, str7, strE, j17, j11, zS3, zS2, false));
                                                                    j15 += jL3;
                                                                    if (j11 != j10) {
                                                                        j17 += j11;
                                                                    }
                                                                    str7 = str7;
                                                                    dVar2 = dVar3;
                                                                    i12 = i10;
                                                                    arrayList7 = arrayList13;
                                                                    strN = str3;
                                                                    jP = jP;
                                                                    str8 = str8;
                                                                    arrayList10 = arrayList;
                                                                } else {
                                                                    dVar2 = dVar2;
                                                                    arrayList2 = arrayList7;
                                                                    ArrayList arrayList14 = arrayList;
                                                                    if (strB2.startsWith("#EXT-X-DATERANGE") && w(strB2, f18847f0, str2, map2).equals(EFLCCdIRcb.cdzi)) {
                                                                        String strB7 = B(strB2, f18845e0, map2);
                                                                        String strX5 = x(strB2, f18859l0, map2);
                                                                        Uri uri = strX5 != null ? Uri.parse(strX5) : null;
                                                                        String strX6 = x(strB2, f18861m0, map2);
                                                                        Uri uri2 = strX6 != null ? Uri.parse(strX6) : null;
                                                                        long jS1 = l0.S0(l0.a1(B(strB2, f18849g0, map2)));
                                                                        String strX7 = x(strB2, f18853i0, map2);
                                                                        long jS2 = strX7 != null ? l0.S0(l0.a1(strX7)) : -9223372036854775807L;
                                                                        ArrayList arrayList15 = new ArrayList();
                                                                        String strX8 = x(strB2, f18851h0, map2);
                                                                        if (strX8 != null) {
                                                                            String[] strArrM4 = l0.m1(strX8, ",");
                                                                            int length = strArrM4.length;
                                                                            int i19 = 0;
                                                                            while (i19 < length) {
                                                                                String[] strArr = strArrM4;
                                                                                String strTrim = strArrM4[i19].trim();
                                                                                strTrim.hashCode();
                                                                                switch (strTrim.hashCode()) {
                                                                                    case 79491:
                                                                                        i11 = length;
                                                                                        if (!strTrim.equals("PRE")) {
                                                                                            b11 = -1;
                                                                                        } else {
                                                                                            b11 = 0;
                                                                                        }
                                                                                        break;
                                                                                    case 2430593:
                                                                                        i11 = length;
                                                                                        if (!strTrim.equals("ONCE")) {
                                                                                            b11 = -1;
                                                                                        } else {
                                                                                            b11 = 1;
                                                                                        }
                                                                                        break;
                                                                                    case 2461856:
                                                                                        i11 = length;
                                                                                        if (!strTrim.equals("POST")) {
                                                                                            b11 = -1;
                                                                                        } else {
                                                                                            b11 = 2;
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        i11 = length;
                                                                                        b11 = -1;
                                                                                        break;
                                                                                }
                                                                                switch (b11) {
                                                                                    case 0:
                                                                                    case 1:
                                                                                    case 2:
                                                                                        arrayList15.add(strTrim);
                                                                                        break;
                                                                                }
                                                                                i19++;
                                                                                length = i11;
                                                                                strArrM4 = strArr;
                                                                            }
                                                                        }
                                                                        treeMap = treeMap2;
                                                                        double dT = t(strB2, f18868q, -1.0d);
                                                                        long j22 = dT >= 0.0d ? (long) (dT * 1000000.0d) : -9223372036854775807L;
                                                                        double dT2 = t(strB2, f18855j0, -1.0d);
                                                                        long j23 = dT2 >= 0.0d ? (long) (dT2 * 1000000.0d) : -9223372036854775807L;
                                                                        boolean zS4 = s(strB2, f18857k0, false);
                                                                        double dT3 = t(strB2, f18863n0, Double.MIN_VALUE);
                                                                        long j24 = dT3 != Double.MIN_VALUE ? (long) (dT3 * 1000000.0d) : -9223372036854775807L;
                                                                        double dT4 = t(strB2, f18865o0, -1.0d);
                                                                        long j25 = dT4 >= 0.0d ? (long) (dT4 * 1000000.0d) : -9223372036854775807L;
                                                                        ArrayList arrayList16 = new ArrayList();
                                                                        String strX9 = x(strB2, f18867p0, map2);
                                                                        if (strX9 != null) {
                                                                            String[] strArrM5 = l0.m1(strX9, ",");
                                                                            int length2 = strArrM5.length;
                                                                            int i20 = 0;
                                                                            while (i20 < length2) {
                                                                                String[] strArr2 = strArrM5;
                                                                                String strTrim2 = strArrM5[i20].trim();
                                                                                strTrim2.hashCode();
                                                                                int i21 = length2;
                                                                                if (strTrim2.equals("IN") || strTrim2.equals("OUT")) {
                                                                                    arrayList16.add(strTrim2);
                                                                                }
                                                                                i20++;
                                                                                length2 = i21;
                                                                                strArrM5 = strArr2;
                                                                            }
                                                                        }
                                                                        ArrayList arrayList17 = new ArrayList();
                                                                        String strX10 = x(strB2, f18869q0, map2);
                                                                        if (strX10 != null) {
                                                                            String[] strArrM6 = l0.m1(strX10, ",");
                                                                            int length3 = strArrM6.length;
                                                                            int i22 = 0;
                                                                            while (i22 < length3) {
                                                                                String[] strArr3 = strArrM6;
                                                                                String strTrim3 = strArrM6[i22].trim();
                                                                                strTrim3.hashCode();
                                                                                int i23 = length3;
                                                                                if (strTrim3.equals("JUMP") || strTrim3.equals("SKIP")) {
                                                                                    arrayList17.add(strTrim3);
                                                                                }
                                                                                i22++;
                                                                                length3 = i23;
                                                                                strArrM6 = strArr3;
                                                                            }
                                                                        }
                                                                        u.a aVar2 = new u.a();
                                                                        String strSubstring = strB2.substring(17);
                                                                        Matcher matcher2 = f18873s0.matcher(strSubstring);
                                                                        while (matcher2.find()) {
                                                                            String strGroup = matcher2.group();
                                                                            strGroup.hashCode();
                                                                            switch (strGroup.hashCode()) {
                                                                                case -2136701954:
                                                                                    matcher = matcher2;
                                                                                    if (!strGroup.equals(wcAlQCOdREZdI.RuIPrQtaCHTR)) {
                                                                                        b10 = -1;
                                                                                    } else {
                                                                                        b10 = 0;
                                                                                    }
                                                                                    break;
                                                                                case -148960310:
                                                                                    matcher = matcher2;
                                                                                    if (!strGroup.equals("X-PLAYOUT-LIMIT=")) {
                                                                                        b10 = -1;
                                                                                    } else {
                                                                                        b10 = 1;
                                                                                    }
                                                                                    break;
                                                                                case 397239341:
                                                                                    matcher = matcher2;
                                                                                    if (!strGroup.equals("X-ASSET-LIST=")) {
                                                                                        b10 = -1;
                                                                                    } else {
                                                                                        b10 = 2;
                                                                                    }
                                                                                    break;
                                                                                case 1472528844:
                                                                                    matcher = matcher2;
                                                                                    if (!strGroup.equals("X-RESTRICT=")) {
                                                                                        b10 = -1;
                                                                                    } else {
                                                                                        b10 = 3;
                                                                                    }
                                                                                    break;
                                                                                case 1748487807:
                                                                                    matcher = matcher2;
                                                                                    if (!strGroup.equals("X-RESUME-OFFSET=")) {
                                                                                        b10 = -1;
                                                                                    } else {
                                                                                        b10 = 4;
                                                                                    }
                                                                                    break;
                                                                                case 1814205923:
                                                                                    matcher = matcher2;
                                                                                    if (!strGroup.equals("X-ASSET-URI=")) {
                                                                                        b10 = -1;
                                                                                    } else {
                                                                                        b10 = 5;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    matcher = matcher2;
                                                                                    b10 = -1;
                                                                                    break;
                                                                            }
                                                                            switch (b10) {
                                                                                case 0:
                                                                                case 1:
                                                                                case 2:
                                                                                case 3:
                                                                                case 4:
                                                                                case 5:
                                                                                    break;
                                                                                default:
                                                                                    aVar2.a(k(strSubstring, strGroup.substring(0, strGroup.length() - 1), map2));
                                                                                    break;
                                                                            }
                                                                            matcher2 = matcher;
                                                                            arrayList14 = arrayList14;
                                                                        }
                                                                        arrayList = arrayList14;
                                                                        if ((uri2 != null || uri == null) && (uri2 == null || uri != null)) {
                                                                            arrayList3 = arrayList9;
                                                                        } else {
                                                                            c.C0326c c0326c = new c.C0326c(strB7, uri, uri2, jS1, jS2, j22, j23, arrayList15, zS4, j24, j25, arrayList16, arrayList17, aVar2.m());
                                                                            arrayList3 = arrayList9;
                                                                            arrayList3.add(c0326c);
                                                                        }
                                                                    } else {
                                                                        treeMap = treeMap2;
                                                                        str2 = str2;
                                                                        arrayList = arrayList14;
                                                                        arrayList5 = arrayList5;
                                                                        arrayList3 = arrayList9;
                                                                        if (!strB2.startsWith("#")) {
                                                                            String strE2 = e(jP, str7, str8);
                                                                            long j26 = jP + 1;
                                                                            String strD = D(strB2, map2);
                                                                            c.f fVar3 = (c.f) map3.get(strD);
                                                                            if (j19 == -1) {
                                                                                j12 = 0;
                                                                            } else {
                                                                                if (z18 && fVar == null && fVar3 == null) {
                                                                                    fVar3 = new c.f(strD, 0L, j14, null, null);
                                                                                    map3.put(strD, fVar3);
                                                                                }
                                                                                j12 = j14;
                                                                            }
                                                                            if (lVar2 != null || treeMap.isEmpty()) {
                                                                                arrayList4 = arrayList3;
                                                                                map = map2;
                                                                                z11 = false;
                                                                                lVar = lVar2;
                                                                            } else {
                                                                                arrayList4 = arrayList3;
                                                                                map = map2;
                                                                                z11 = false;
                                                                                l.b[] bVarArr2 = (l.b[]) treeMap.values().toArray(new l.b[0]);
                                                                                lVar = new l(str3, bVarArr2);
                                                                                if (lVarD == null) {
                                                                                    lVarD = d(str3, bVarArr2);
                                                                                }
                                                                            }
                                                                            arrayList5.add(new c.f(strD, fVar != null ? fVar : fVar3, strW, jC, i14, j16, lVar, str7, strE2, j12, j19, z17, arrayList));
                                                                            j15 = j16 + jC;
                                                                            ArrayList arrayList18 = new ArrayList();
                                                                            if (j19 != -1) {
                                                                                j12 += j19;
                                                                            }
                                                                            j14 = j12;
                                                                            z13 = z11;
                                                                            z17 = z13 ? 1 : 0;
                                                                            treeMap2 = treeMap;
                                                                            lVar2 = lVar;
                                                                            jC = 0;
                                                                            j16 = j15;
                                                                            strW = str2;
                                                                            dVar2 = dVar2;
                                                                            arrayList7 = arrayList2;
                                                                            arrayList9 = arrayList4;
                                                                            j19 = -1;
                                                                            arrayList5 = arrayList5;
                                                                            jP = j26;
                                                                            arrayList8 = arrayList8;
                                                                            str6 = strW;
                                                                            i12 = i10;
                                                                            strN = str3;
                                                                            arrayList10 = arrayList18;
                                                                            map2 = map;
                                                                        }
                                                                        dVar = dVar;
                                                                    }
                                                                    arrayList9 = arrayList3;
                                                                    map2 = map2;
                                                                    arrayList5 = arrayList5;
                                                                    z10 = false;
                                                                    z13 = z10;
                                                                    arrayList5 = arrayList5;
                                                                    treeMap2 = treeMap;
                                                                    map2 = map2;
                                                                    dVar2 = dVar2;
                                                                    i12 = i10;
                                                                    arrayList7 = arrayList2;
                                                                    arrayList9 = arrayList9;
                                                                    strN = str3;
                                                                    jP = jP;
                                                                    arrayList8 = arrayList8;
                                                                    arrayList10 = arrayList;
                                                                    str6 = str2;
                                                                    dVar = dVar;
                                                                }
                                                            } else if (dVar2 == null && "PART".equals(B(strB2, Q, map2))) {
                                                                String strB8 = B(strB2, N, map2);
                                                                long jV = v(strB2, I, -1L);
                                                                long jV2 = v(strB2, J, -1L);
                                                                long j27 = jP;
                                                                String strE3 = e(j27, str7, str8);
                                                                if (lVar2 != null || treeMap2.isEmpty()) {
                                                                    str5 = str4;
                                                                } else {
                                                                    l.b[] bVarArr3 = (l.b[]) treeMap2.values().toArray(new l.b[0]);
                                                                    str5 = str4;
                                                                    l lVar5 = new l(str5, bVarArr3);
                                                                    if (lVarD == null) {
                                                                        lVarD = d(str5, bVarArr3);
                                                                    }
                                                                    lVar2 = lVar5;
                                                                }
                                                                if (jV == -1 || jV2 != -1) {
                                                                    dVar2 = new c.d(strB8, fVar, 0L, i14, j15, lVar2, str7, strE3, jV != -1 ? jV : 0L, jV2, false, false, true);
                                                                }
                                                                dVar = dVar;
                                                                cVar = cVar;
                                                                jP = j27;
                                                                str8 = str8;
                                                                str7 = str7;
                                                                arrayList8 = arrayList8;
                                                                arrayList10 = arrayList;
                                                                i12 = i10;
                                                                arrayList9 = arrayList9;
                                                                str6 = str2;
                                                                strN = str5;
                                                            }
                                                        }
                                                        str2 = str2;
                                                        str3 = str4;
                                                        z10 = false;
                                                    }
                                                    str6 = str2;
                                                }
                                                cVar = cVar;
                                                strN = str16;
                                                str8 = str8;
                                                str7 = str7;
                                                arrayList8 = arrayList8;
                                                arrayList10 = arrayList;
                                                arrayList9 = arrayList9;
                                                str6 = str2;
                                            }
                                            str6 = str2;
                                        }
                                    }
                                    z13 = false;
                                }
                                arrayList2 = arrayList7;
                                treeMap = treeMap2;
                                z13 = z10;
                                arrayList5 = arrayList5;
                                treeMap2 = treeMap;
                                map2 = map2;
                                dVar2 = dVar2;
                                i12 = i10;
                                arrayList7 = arrayList2;
                                arrayList9 = arrayList9;
                                strN = str3;
                                jP = jP;
                                arrayList8 = arrayList8;
                                arrayList10 = arrayList;
                                str6 = str2;
                                dVar = dVar;
                            }
                            arrayList9 = arrayList9;
                            z13 = false;
                        }
                        str8 = str8;
                        str7 = str7;
                        arrayList9 = arrayList9;
                        z13 = false;
                    }
                }
                arrayList9 = arrayList9;
            }
        }
        int i24 = i12;
        c.d dVar4 = dVar2;
        ArrayList arrayList19 = arrayList7;
        ArrayList arrayList20 = arrayList10;
        ArrayList arrayList21 = arrayList8;
        boolean z19 = z13 ? 1 : 0;
        ArrayList arrayList22 = arrayList9;
        ArrayList arrayList23 = arrayList5;
        HashMap map4 = new HashMap();
        int i25 = z19 ? 1 : 0;
        while (i25 < arrayList19.size()) {
            ArrayList arrayList24 = arrayList19;
            c.e eVar = (c.e) arrayList24.get(i25);
            long size = eVar.f18960b;
            if (size == -1) {
                size = (j13 + ((long) arrayList23.size())) - (arrayList20.isEmpty() ? 1L : 0L);
            }
            int size2 = eVar.f18961c;
            if (size2 == -1 && jL != -9223372036854775807L) {
                size2 = (arrayList20.isEmpty() ? ((c.f) y.d(arrayList23)).f18963m : arrayList20).size() - 1;
            }
            Uri uri3 = eVar.f18959a;
            map4.put(uri3, new c.e(uri3, size, size2));
            i25++;
            arrayList19 = arrayList24;
        }
        if (dVar4 != null) {
            arrayList20.add(dVar4);
        }
        if (jS0 != 0) {
            z19 = true;
        }
        return new c(i24, str, arrayList21, j18, zS, jS0, z15, i13, j13, iO, jO, jL, z14, z16, z19, lVarD, arrayList23, arrayList20, hVarA, map4, arrayList22);
    }

    private static boolean s(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z10;
    }

    private static double t(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) x7.a.e(matcher.group(1))) : d10;
    }

    private static int u(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) x7.a.e(matcher.group(1))) : i10;
    }

    private static long v(String str, Pattern pattern, long j10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) x7.a.e(matcher.group(1))) : j10;
    }

    private static String w(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) x7.a.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : D(str2, map);
    }

    private static String x(String str, Pattern pattern, Map<String, String> map) {
        return w(str, pattern, null, map);
    }

    private static int y(String str, Map<String, String> map) {
        String strX = x(str, U, map);
        if (TextUtils.isEmpty(strX)) {
            return 0;
        }
        String[] strArrM1 = l0.m1(strX, ",");
        int i10 = l0.s(strArrM1, "public.accessibility.describes-video") ? 512 : 0;
        if (l0.s(strArrM1, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= 4096;
        }
        if (l0.s(strArrM1, "public.accessibility.describes-music-and-sound")) {
            i10 |= 1024;
        }
        return l0.s(strArrM1, "public.easy-to-read") ? i10 | 8192 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int z(String str) {
        boolean zS = s(str, X, false);
        ?? r10 = zS;
        if (s(str, Y, false)) {
            r10 = (zS ? 1 : 0) | 2;
        }
        return s(str, W, false) ? r10 | 4 : r10;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.c.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public i8.d a(Uri uri, InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!b(bufferedReader)) {
                throw ParserException.e("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    l0.m(bufferedReader);
                    throw ParserException.e("Failed to parse the playlist, could not identify any tags.", null);
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        d dVarR = r(new a(arrayDeque, bufferedReader), uri.toString());
                        l0.m(bufferedReader);
                        return dVarR;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    c cVarQ = q(this.f18881a, this.f18882b, new a(arrayDeque, bufferedReader), uri.toString());
                    l0.m(bufferedReader);
                    return cVarQ;
                }
            }
        } catch (Throwable th) {
            l0.m(bufferedReader);
            throw th;
        }
    }

    public HlsPlaylistParser(d dVar, c cVar) {
        this.f18881a = dVar;
        this.f18882b = cVar;
    }

    private static Pattern c(String str) {
        return Pattern.compile(str + "=(" + EFLCCdIRcb.WQCg + "|YES)");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:166:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0153  */
    /* JADX WARN: Code duplicated, block: B:46:0x015a  */
    /* JADX WARN: Code duplicated, block: B:47:0x016e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0177  */
    /* JADX WARN: Code duplicated, block: B:55:0x0193  */
    /* JADX WARN: Code duplicated, block: B:57:0x019a  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x0233  */
    /* JADX WARN: Code duplicated, block: B:96:0x037b  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x015a, please report this as an issue */
    private static d r(a aVar, String str) throws IOException {
        ArrayList arrayList;
        String strG;
        ArrayList arrayList2;
        int i10;
        String str2;
        String strG2;
        ArrayList arrayList3;
        String str3;
        String str4;
        String strS;
        String strX;
        int i11;
        int i12;
        String strX2;
        float f10;
        Uri uriF;
        ArrayList arrayList4;
        int i13;
        int i14;
        int i15;
        String strT;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            String str5 = "application/x-mpegURL";
            boolean z12 = z10;
            if (!aVar.a()) {
                ArrayList arrayList13 = arrayList10;
                ArrayList arrayList14 = arrayList6;
                ArrayList arrayList15 = arrayList7;
                ArrayList arrayList16 = arrayList8;
                ArrayList arrayList17 = arrayList9;
                ArrayList arrayList18 = arrayList12;
                ArrayList arrayList19 = arrayList11;
                ArrayList arrayList20 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    d.b bVar = (d.b) arrayList5.get(i16);
                    if (hashSet.add(bVar.f18995a)) {
                        x7.a.g(bVar.f18996b.f26249l == null);
                        arrayList20.add(bVar.a(bVar.f18996b.b().n0(new v(new h(null, null, (List) x7.a.e((ArrayList) map.get(bVar.f18995a))))).N()));
                    }
                }
                ArrayList arrayList21 = null;
                q qVarN = null;
                int i17 = 0;
                while (i17 < arrayList13.size()) {
                    arrayList13 = arrayList13;
                    String str6 = (String) arrayList13.get(i17);
                    String strB = B(str6, T, map2);
                    String strB2 = B(str6, S, map2);
                    q.b bVarJ0 = new q.b().f0(strB + ":" + strB2).h0(strB2).U(str5).w0(z(str6)).s0(y(str6, map2)).j0(x(str6, R, map2));
                    String strX3 = x(str6, N, map2);
                    Uri uriF2 = strX3 == null ? null : i0.f(str, strX3);
                    String str7 = str5;
                    q qVar = qVarN;
                    v vVar = new v(new h(strB, strB2, Collections.emptyList()));
                    String strB3 = B(str6, P, map2);
                    strB3.hashCode();
                    switch (strB3) {
                        case "SUBTITLES":
                            arrayList = arrayList15;
                            d.b bVarG = g(arrayList5, strB);
                            if (bVarG != null) {
                                String strS2 = l0.S(bVarG.f18996b.f26248k, 3);
                                bVarJ0.S(strS2);
                                strG = w.g(strS2);
                            } else {
                                strG = null;
                            }
                            if (strG == null) {
                                strG = "text/vtt";
                            }
                            bVarJ0.u0(strG).n0(vVar);
                            if (uriF2 != null) {
                                d.a aVar2 = new d.a(uriF2, bVarJ0.N(), strB, strB2);
                                arrayList2 = arrayList16;
                                arrayList2.add(aVar2);
                            } else {
                                arrayList2 = arrayList16;
                                r.h("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            qVarN = qVar;
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList = arrayList15;
                            String strB4 = B(str6, V, map2);
                            if (strB4.startsWith("CC")) {
                                i10 = Integer.parseInt(strB4.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                i10 = Integer.parseInt(strB4.substring(7));
                                str2 = "application/cea-708";
                            }
                            if (arrayList21 == null) {
                                arrayList21 = new ArrayList();
                            }
                            bVarJ0.u0(str2).O(i10);
                            arrayList21.add(bVarJ0.N());
                            qVarN = qVar;
                            arrayList2 = arrayList16;
                            break;
                        case "AUDIO":
                            arrayList14 = arrayList14;
                            d.b bVarF = f(arrayList5, strB);
                            if (bVarF != null) {
                                String strS3 = l0.S(bVarF.f18996b.f26248k, 1);
                                bVarJ0.S(strS3);
                                strG2 = w.g(strS3);
                            } else {
                                strG2 = null;
                            }
                            String strX4 = x(str6, f18852i, map2);
                            if (strX4 != null) {
                                bVarJ0.R(Integer.parseInt(l0.n1(strX4, "/")[0]));
                                if ("audio/eac3".equals(strG2) && strX4.endsWith("/JOC")) {
                                    bVarJ0.S("ec+3");
                                    strG2 = "audio/eac3-joc";
                                }
                            }
                            bVarJ0.u0(strG2);
                            if (uriF2 == null) {
                                arrayList = arrayList15;
                                if (bVarF != null) {
                                    qVarN = bVarJ0.N();
                                    arrayList2 = arrayList16;
                                }
                                break;
                            } else {
                                bVarJ0.n0(vVar);
                                arrayList = arrayList15;
                                arrayList.add(new d.a(uriF2, bVarJ0.N(), strB, strB2));
                            }
                            arrayList2 = arrayList16;
                            qVarN = qVar;
                            break;
                        case "VIDEO":
                            d.b bVarH = h(arrayList5, strB);
                            if (bVarH != null) {
                                q qVar2 = bVarH.f18996b;
                                String strS4 = l0.S(qVar2.f26248k, 2);
                                bVarJ0.S(strS4).u0(w.g(strS4)).B0(qVar2.f26259v).d0(qVar2.f26260w).b0(qVar2.f26261x);
                            }
                            if (uriF2 != null) {
                                bVarJ0.n0(vVar);
                                arrayList14.add(new d.a(uriF2, bVarJ0.N(), strB, strB2));
                                break;
                            }
                        default:
                            arrayList2 = arrayList16;
                            arrayList = arrayList15;
                            qVarN = qVar;
                            break;
                    }
                    i17++;
                    arrayList16 = arrayList2;
                    arrayList15 = arrayList;
                    str5 = str7;
                }
                return new d(str, arrayList18, arrayList20, arrayList14, arrayList15, arrayList16, arrayList17, qVarN, z11 ? Collections.emptyList() : arrayList21, z12, map2, arrayList19);
            }
            String strB5 = aVar.b();
            if (strB5.startsWith("#EXT")) {
                arrayList12.add(strB5);
            }
            boolean zStartsWith = strB5.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList22 = arrayList9;
            if (strB5.startsWith("#EXT-X-DEFINE")) {
                map2.put(B(strB5, S, map2), B(strB5, f18841c0, map2));
            } else {
                if (strB5.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    arrayList3 = arrayList10;
                    z10 = true;
                } else if (strB5.startsWith(cTJaRZ.woF)) {
                    arrayList10.add(strB5);
                } else if (strB5.startsWith("#EXT-X-SESSION-KEY")) {
                    l.b bVarM = m(strB5, w(strB5, L, "identity", map2), map2);
                    if (bVarM != null) {
                        arrayList11.add(new l(n(B(strB5, K, map2)), bVarM));
                    }
                } else if (strB5.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                    boolean zContains = z11 | strB5.contains("CLOSED-CAPTIONS=NONE");
                    int i18 = zStartsWith ? Http2.INITIAL_MAX_FRAME_SIZE : 0;
                    int iO = o(strB5, f18850h);
                    int iU = u(strB5, f18840c, -1);
                    String strX5 = x(strB5, f18854j, map2);
                    String strX6 = x(strB5, f18856k, map2);
                    String strX7 = x(strB5, f18858l, map2);
                    if (strX7 != null) {
                        String[] strArrM1 = l0.m1(l0.n1(strX7, ",")[0], "/");
                        String str8 = strArrM1[0];
                        arrayList3 = arrayList10;
                        if (strArrM1.length > 1) {
                            str4 = strArrM1[1];
                            map = map;
                            str3 = str8;
                        } else {
                            str3 = str8;
                        }
                        strS = l0.S(strX6, 2);
                        if (i(strX5, strS, str3, str4)) {
                            if (str3 == null) {
                                str3 = strS;
                            }
                            strT = l0.T(strX6, 2);
                            if (strT != null) {
                                strX6 = str3 + "," + strT;
                            } else {
                                strX6 = str3;
                            }
                        }
                        strX = x(strB5, f18860m, map2);
                        if (strX != null) {
                            String[] strArrM2 = l0.m1(strX, "x");
                            i13 = Integer.parseInt(strArrM2[0]);
                            i14 = Integer.parseInt(strArrM2[1]);
                            if (i13 > 0 || i14 <= 0) {
                                i14 = -1;
                                i15 = -1;
                            } else {
                                i15 = i13;
                            }
                            i12 = i14;
                            i11 = i15;
                        } else {
                            i11 = -1;
                            i12 = -1;
                        }
                        strX2 = x(strB5, f18862n, map2);
                        if (strX2 != null) {
                            f10 = Float.parseFloat(strX2);
                        } else {
                            f10 = -1.0f;
                        }
                        String strX8 = x(strB5, f18842d, map2);
                        String strX9 = x(strB5, f18844e, map2);
                        String strX10 = x(strB5, f18846f, map2);
                        String strX11 = x(strB5, f18848g, map2);
                        if (zStartsWith) {
                            uriF = i0.f(str, B(strB5, N, map2));
                        } else {
                            if (aVar.a()) {
                                throw ParserException.e("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            uriF = i0.f(str, D(aVar.b(), map2));
                        }
                        arrayList5.add(new d.b(uriF, new q.b().e0(arrayList5.size()).U("application/x-mpegURL").S(strX6).Q(iU).p0(iO).B0(i11).d0(i12).b0(f10).s0(i18).N(), strX8, strX9, strX10, strX11));
                        map = map;
                        arrayList4 = (ArrayList) map.get(uriF);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            map.put(uriF, arrayList4);
                        }
                        arrayList4.add(new h.a(iU, iO, strX8, strX9, strX10, strX11));
                        z10 = z12;
                        z11 = zContains;
                    } else {
                        arrayList3 = arrayList10;
                        str3 = null;
                    }
                    str4 = null;
                    strS = l0.S(strX6, 2);
                    if (i(strX5, strS, str3, str4)) {
                        if (str3 == null) {
                            str3 = strS;
                        }
                        strT = l0.T(strX6, 2);
                        if (strT != null) {
                            strX6 = str3 + "," + strT;
                        } else {
                            strX6 = str3;
                        }
                    }
                    strX = x(strB5, f18860m, map2);
                    if (strX != null) {
                        String[] strArrM3 = l0.m1(strX, "x");
                        i13 = Integer.parseInt(strArrM3[0]);
                        i14 = Integer.parseInt(strArrM3[1]);
                        if (i13 > 0) {
                            i14 = -1;
                            i15 = -1;
                        } else {
                            i14 = -1;
                            i15 = -1;
                        }
                        i12 = i14;
                        i11 = i15;
                    } else {
                        i11 = -1;
                        i12 = -1;
                    }
                    strX2 = x(strB5, f18862n, map2);
                    if (strX2 != null) {
                        f10 = Float.parseFloat(strX2);
                    } else {
                        f10 = -1.0f;
                    }
                    String strX12 = x(strB5, f18842d, map2);
                    String strX13 = x(strB5, f18844e, map2);
                    String strX14 = x(strB5, f18846f, map2);
                    String strX15 = x(strB5, f18848g, map2);
                    if (zStartsWith) {
                        uriF = i0.f(str, B(strB5, N, map2));
                    } else {
                        if (aVar.a()) {
                            throw ParserException.e("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        uriF = i0.f(str, D(aVar.b(), map2));
                    }
                    arrayList5.add(new d.b(uriF, new q.b().e0(arrayList5.size()).U("application/x-mpegURL").S(strX6).Q(iU).p0(iO).B0(i11).d0(i12).b0(f10).s0(i18).N(), strX12, strX13, strX14, strX15));
                    map = map;
                    arrayList4 = (ArrayList) map.get(uriF);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        map.put(uriF, arrayList4);
                    }
                    arrayList4.add(new h.a(iU, iO, strX12, strX13, strX14, strX15));
                    z10 = z12;
                    z11 = zContains;
                }
                arrayList9 = arrayList22;
                arrayList11 = arrayList11;
                arrayList12 = arrayList12;
                arrayList8 = arrayList8;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList10 = arrayList3;
            }
            arrayList3 = arrayList10;
            z10 = z12;
            arrayList9 = arrayList22;
            arrayList11 = arrayList11;
            arrayList12 = arrayList12;
            arrayList8 = arrayList8;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList10 = arrayList3;
        }
    }
}
