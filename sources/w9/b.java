package w9;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s9.e;
import s9.r;
import x7.a0;
import x7.l;
import x7.l0;

/* JADX INFO: compiled from: SsaParser.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f27627g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f27629b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, c> f27631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f27632e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f27633f = -3.4028235E38f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f27630c = new a0();

    public b(List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.f27628a = false;
            this.f27629b = null;
            return;
        }
        this.f27628a = true;
        String strH = l0.H(list.get(0));
        x7.a.a(strH.startsWith("Format:"));
        this.f27629b = (a) x7.a.e(a.a(strH));
        j(new a0(list.get(1)), StandardCharsets.UTF_8);
    }

    private static int d(long j10, List<Long> list, List<List<w7.a>> list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (list.get(size).longValue() == j10) {
                return size;
            }
            if (list.get(size).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList(list2.get(i10 - 1)));
        return i10;
    }

    private static float e(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static w7.a f(String str, c cVar, c.b bVar, float f10, float f11) {
        SpannableString spannableString = new SpannableString(str);
        w7.a.b bVarO = new w7.a.b().o(spannableString);
        if (cVar != null) {
            if (cVar.f27636c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f27636c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f27643j == 3 && cVar.f27637d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f27637d.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f27638e;
            if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                bVarO.q(f12 / f11, 1);
            }
            boolean z10 = cVar.f27639f;
            if (z10 && cVar.f27640g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z10) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f27640g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f27641h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f27642i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f27659a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f27635b : -1;
        }
        bVarO.p(p(i10)).l(o(i10)).i(n(i10));
        PointF pointF = bVar.f27660b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            bVarO.k(e(bVarO.d()));
            bVarO.h(e(bVarO.c()), 0);
        } else {
            bVarO.k(pointF.x / f10);
            bVarO.h(bVar.f27660b.y / f11, 0);
        }
        return bVarO.a();
    }

    private Charset g(a0 a0Var) {
        Charset charsetR = a0Var.R();
        return charsetR != null ? charsetR : StandardCharsets.UTF_8;
    }

    private void h(String str, a aVar, List<List<w7.a>> list, List<Long> list2) {
        int i10;
        x7.a.a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", aVar.f27626e);
        if (strArrSplit.length != aVar.f27626e) {
            x7.r.h("SsaParser", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long jM = m(strArrSplit[aVar.f27622a]);
        if (jM == -9223372036854775807L) {
            x7.r.h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        long jM2 = m(strArrSplit[aVar.f27623b]);
        if (jM2 == -9223372036854775807L || jM2 <= jM) {
            x7.r.h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        Map<String, c> map = this.f27631d;
        c cVar = (map == null || (i10 = aVar.f27624c) == -1) ? null : map.get(strArrSplit[i10].trim());
        String str2 = strArrSplit[aVar.f27625d];
        w7.a aVarF = f(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f27632e, this.f27633f);
        int iD = d(jM2, list2, list);
        for (int iD2 = d(jM, list2, list); iD2 < iD; iD2++) {
            list.get(iD2).add(aVarF);
        }
    }

    private void i(a0 a0Var, List<List<w7.a>> list, List<Long> list2, Charset charset) {
        a aVarA = this.f27628a ? this.f27629b : null;
        while (true) {
            String strT = a0Var.t(charset);
            if (strT == null) {
                return;
            }
            if (strT.startsWith("Format:")) {
                aVarA = a.a(strT);
            } else if (strT.startsWith("Dialogue:")) {
                if (aVarA == null) {
                    x7.r.h("SsaParser", "Skipping dialogue line before complete format: " + strT);
                } else {
                    h(strT, aVarA, list, list2);
                }
            }
        }
    }

    private void j(a0 a0Var, Charset charset) {
        while (true) {
            String strT = a0Var.t(charset);
            if (strT == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strT)) {
                k(a0Var, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strT)) {
                this.f27631d = l(a0Var, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(strT)) {
                x7.r.f("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strT)) {
                return;
            }
        }
    }

    private void k(a0 a0Var, Charset charset) {
        while (true) {
            String strT = a0Var.t(charset);
            if (strT == null) {
                return;
            }
            if (a0Var.a() != 0 && a0Var.h(charset) == '[') {
                return;
            }
            String[] strArrSplit = strT.split(":");
            if (strArrSplit.length == 2) {
                String strE = com.google.common.base.c.e(strArrSplit[0].trim());
                strE.hashCode();
                if (strE.equals("playresx")) {
                    this.f27632e = Float.parseFloat(strArrSplit[1].trim());
                } else if (strE.equals("playresy")) {
                    try {
                        this.f27633f = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, c> l(a0 a0Var, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarA = null;
        while (true) {
            String strT = a0Var.t(charset);
            if (strT == null || (a0Var.a() != 0 && a0Var.h(charset) == '[')) {
                break;
            }
            if (strT.startsWith("Format:")) {
                aVarA = c.a.a(strT);
            } else if (strT.startsWith("Style:")) {
                if (aVarA == null) {
                    x7.r.h("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + strT);
                } else {
                    c cVarB = c.b(strT, aVarA);
                    if (cVarB != null) {
                        linkedHashMap.put(cVarB.f27634a, cVarB);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long m(String str) {
        Matcher matcher = f27627g.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) l0.i(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) l0.i(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) l0.i(matcher.group(3))) * 1000000) + (Long.parseLong((String) l0.i(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int n(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                x7.r.h("SsaParser", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static int o(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                x7.r.h("SsaParser", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    private static Layout.Alignment p(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                x7.r.h("SsaParser", "Unknown alignment: " + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // s9.r
    public void b(byte[] bArr, int i10, int i11, r.b bVar, l<e> lVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.f27630c.U(bArr, i10 + i11);
        this.f27630c.W(i10);
        Charset charsetG = g(this.f27630c);
        if (!this.f27628a) {
            j(this.f27630c, charsetG);
        }
        i(this.f27630c, arrayList3, arrayList4, charsetG);
        ArrayList arrayList5 = (bVar.f25345a == -9223372036854775807L || !bVar.f25346b) ? null : new ArrayList();
        int i12 = 0;
        while (i12 < arrayList3.size()) {
            List<w7.a> list = arrayList3.get(i12);
            if (list.isEmpty() && i12 != 0) {
                arrayList = arrayList3;
                arrayList2 = arrayList4;
            } else {
                if (i12 == arrayList3.size() - 1) {
                    throw new IllegalStateException();
                }
                long jLongValue = arrayList4.get(i12).longValue();
                long jLongValue2 = arrayList4.get(i12 + 1).longValue() - arrayList4.get(i12).longValue();
                arrayList = arrayList3;
                arrayList2 = arrayList4;
                long j10 = bVar.f25345a;
                if (j10 == -9223372036854775807L || jLongValue >= j10) {
                    lVar.accept(new e(list, jLongValue, jLongValue2));
                } else if (arrayList5 != null) {
                    arrayList5.add(new e(list, jLongValue, jLongValue2));
                }
            }
            i12++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        }
        if (arrayList5 != null) {
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                lVar.accept((e) it.next());
            }
        }
    }

    @Override // s9.r
    public int c() {
        return 1;
    }
}
