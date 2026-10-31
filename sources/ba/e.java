package ba;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import c0.IbU.elEbP;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import x7.a0;
import x7.l0;
import x7.r;

/* JADX INFO: compiled from: WebvttCueParser.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f4201a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f4202b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f4203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, Integer> f4204d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: WebvttCueParser.java */
    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator<b> f4205c = new Comparator() { // from class: ba.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.b.e((e.b) obj, (e.b) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f4206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f4207b;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int e(b bVar, b bVar2) {
            return Integer.compare(bVar.f4206a.f4209b, bVar2.f4206a.f4209b);
        }

        private b(c cVar, int i10) {
            this.f4206a = cVar;
            this.f4207b = i10;
        }
    }

    /* JADX INFO: compiled from: WebvttCueParser.java */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f4210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set<String> f4211d;

        private c(String str, int i10, String str2, Set<String> set) {
            this.f4209b = i10;
            this.f4208a = str;
            this.f4210c = str2;
            this.f4211d = set;
        }

        public static c a(String str, int i10) {
            String str2;
            String strTrim = str.trim();
            x7.a.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrM1 = l0.m1(strTrim, "\\.");
            String str3 = strArrM1[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < strArrM1.length; i11++) {
                hashSet.add(strArrM1[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    /* JADX INFO: compiled from: WebvttCueParser.java */
    private static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ba.c f4213b;

        public d(int i10, ba.c cVar) {
            this.f4212a = i10;
            this.f4213b = cVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f4212a, dVar.f4212a);
        }
    }

    /* JADX INFO: renamed from: ba.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WebvttCueParser.java */
    private static final class C0084e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f4216c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f4214a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f4215b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4217d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f4218e = -3.4028235E38f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4219f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f4220g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f4221h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f4222i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f4223j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f4224k = Integer.MIN_VALUE;

        private static float b(float f10, int i10) {
            if (f10 != -3.4028235E38f && i10 == 0 && (f10 < 0.0f || f10 > 1.0f)) {
                return 1.0f;
            }
            if (f10 != -3.4028235E38f) {
                return f10;
            }
            return i10 == 0 ? 1.0f : -3.4028235E38f;
        }

        private static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            r.h("WebvttCueParser", "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float d(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        private static float e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int f(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        public ba.d a() {
            return new ba.d(g().a(), this.f4214a, this.f4215b);
        }

        public w7.a.b g() {
            float fE = this.f4221h;
            if (fE == -3.4028235E38f) {
                fE = e(this.f4217d);
            }
            int iF = this.f4222i;
            if (iF == Integer.MIN_VALUE) {
                iF = f(this.f4217d);
            }
            w7.a.b bVarR = new w7.a.b().p(c(this.f4217d)).h(b(this.f4218e, this.f4219f), this.f4219f).i(this.f4220g).k(fE).l(iF).n(Math.min(this.f4223j, d(iF, fE))).r(this.f4224k);
            CharSequence charSequence = this.f4216c;
            if (charSequence != null) {
                bVarR.o(charSequence);
            }
            return bVarR;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f4203c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f4204d = Collections.unmodifiableMap(map2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i10, int i11) {
        for (String str : set) {
            Map<String, Integer> map = f4203c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i10, i11, 33);
            } else {
                Map<String, Integer> map2 = f4204d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i10, i11, 33);
                }
            }
        }
    }

    private static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                r.h("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<ba.c> list2) {
        int iJ = j(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f4205c);
        int i10 = cVar.f4209b;
        int length = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if ("rt".equals(((b) arrayList.get(i11)).f4206a.f4208a)) {
                b bVar = (b) arrayList.get(i11);
                int iH = h(j(list2, str, bVar.f4206a), iJ, 1);
                int i12 = bVar.f4206a.f4209b - length;
                int i13 = bVar.f4207b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i12, i13);
                spannableStringBuilder.delete(i12, i13);
                spannableStringBuilder.setSpan(new w7.f(charSequenceSubSequence.toString(), iH), i10, i12, 33);
                length += charSequenceSubSequence.length();
                i10 = i12;
            }
        }
    }

    private static void d(String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<ba.c> list2) {
        int i10 = cVar.f4209b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f4208a;
        str2.hashCode();
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case "c":
                a(spannableStringBuilder, cVar.f4211d, i10, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case "v":
                f(spannableStringBuilder, cVar.f4210c, i10, length);
                break;
            case "ruby":
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<d> listI = i(list2, str, cVar);
        for (int i11 = 0; i11 < listI.size(); i11++) {
            e(spannableStringBuilder, listI.get(i11).f4213b, i10, length);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, ba.c cVar, int i10, int i11) {
        if (cVar == null) {
            return;
        }
        if (cVar.i() != -1) {
            w7.g.b(spannableStringBuilder, new StyleSpan(cVar.i()), i10, i11, 33);
        }
        if (cVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (cVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (cVar.k()) {
            w7.g.b(spannableStringBuilder, new ForegroundColorSpan(cVar.c()), i10, i11, 33);
        }
        if (cVar.j()) {
            w7.g.b(spannableStringBuilder, new BackgroundColorSpan(cVar.a()), i10, i11, 33);
        }
        if (cVar.d() != null) {
            w7.g.b(spannableStringBuilder, new TypefaceSpan(cVar.d()), i10, i11, 33);
        }
        int iF = cVar.f();
        if (iF == 1) {
            w7.g.b(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar.e(), true), i10, i11, 33);
        } else if (iF == 2) {
            w7.g.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e()), i10, i11, 33);
        } else if (iF == 3) {
            w7.g.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e() / 100.0f), i10, i11, 33);
        }
        if (cVar.b()) {
            spannableStringBuilder.setSpan(new w7.d(), i10, i11, 33);
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        spannableStringBuilder.setSpan(new w7.i(str), i10, i11, 33);
    }

    private static int g(String str, int i10) {
        int iIndexOf = str.indexOf(62, i10);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static int h(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    private static List<d> i(List<ba.c> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ba.c cVar2 = list.get(i10);
            int iH = cVar2.h(str, cVar.f4208a, cVar.f4211d, cVar.f4210c);
            if (iH > 0) {
                arrayList.add(new d(iH, cVar2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int j(List<ba.c> list, String str, c cVar) {
        List<d> listI = i(list, str, cVar);
        for (int i10 = 0; i10 < listI.size(); i10++) {
            ba.c cVar2 = listI.get(i10).f4213b;
            if (cVar2.g() != -1) {
                return cVar2.g();
            }
        }
        return -1;
    }

    private static String k(String str) {
        String strTrim = str.trim();
        x7.a.a(!strTrim.isEmpty());
        return l0.n1(strTrim, "[ \\.]")[0];
    }

    private static boolean l(String str) {
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static w7.a m(CharSequence charSequence) {
        C0084e c0084e = new C0084e();
        c0084e.f4216c = charSequence;
        return c0084e.g().a();
    }

    private static ba.d n(String str, Matcher matcher, a0 a0Var, List<ba.c> list) {
        C0084e c0084e = new C0084e();
        try {
            c0084e.f4214a = h.d((String) x7.a.e(matcher.group(1)));
            c0084e.f4215b = h.d((String) x7.a.e(matcher.group(2)));
            q((String) x7.a.e(matcher.group(3)), c0084e);
            StringBuilder sb2 = new StringBuilder();
            String strS = a0Var.s();
            while (!TextUtils.isEmpty(strS)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strS.trim());
                strS = a0Var.s();
            }
            c0084e.f4216c = r(str, sb2.toString(), list);
            return c0084e.a();
        } catch (IllegalArgumentException unused) {
            r.h("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static ba.d o(a0 a0Var, List<ba.c> list) {
        String strS = a0Var.s();
        if (strS == null) {
            return null;
        }
        Pattern pattern = f4201a;
        Matcher matcher = pattern.matcher(strS);
        if (matcher.matches()) {
            return n(null, matcher, a0Var, list);
        }
        String strS2 = a0Var.s();
        if (strS2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strS2);
        if (matcher2.matches()) {
            return n(strS.trim(), matcher2, a0Var, list);
        }
        return null;
    }

    static w7.a.b p(String str) {
        C0084e c0084e = new C0084e();
        q(str, c0084e);
        return c0084e.g();
    }

    static SpannedString r(String str, String str2, List<ba.c> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                i10++;
                int iIndexOf = str2.indexOf(59, i10);
                int iIndexOf2 = str2.indexOf(32, i10);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    b(str2.substring(i10, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i10++;
            } else {
                int iG = i10 + 1;
                if (iG < str2.length()) {
                    boolean z10 = str2.charAt(iG) == '/';
                    iG = g(str2, iG);
                    int i11 = iG - 2;
                    boolean z11 = str2.charAt(i11) == '/';
                    int i12 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i11 = iG - 1;
                    }
                    String strSubstring = str2.substring(i12, i11);
                    if (!strSubstring.trim().isEmpty()) {
                        String strK = k(strSubstring);
                        if (l(strK)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.f4208a.equals(strK)) {
                                        break;
                                    }
                                }
                            } else if (!z11) {
                                arrayDeque.push(c.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i10 = iG;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static int s(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                r.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void t(String str, C0084e c0084e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c0084e.f4220g = s(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c0084e.f4218e = h.c(str);
            c0084e.f4219f = 0;
        } else {
            c0084e.f4218e = Integer.parseInt(str);
            c0084e.f4219f = 1;
        }
    }

    private static void v(String str, C0084e c0084e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c0084e.f4222i = u(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        c0084e.f4221h = h.c(str);
    }

    private static int w(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                r.h("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int x(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        r.h("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }

    private static void q(String str, C0084e c0084e) {
        Matcher matcher = f4202b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) x7.a.e(matcher.group(1));
            String str3 = (String) x7.a.e(matcher.group(2));
            try {
                if (KBBdKxoAiHo.GVmmdCW.equals(str2)) {
                    t(str3, c0084e);
                } else if ("align".equals(str2)) {
                    c0084e.f4217d = w(str3);
                } else if ("position".equals(str2)) {
                    v(str3, c0084e);
                } else if ("size".equals(str2)) {
                    c0084e.f4223j = h.c(str3);
                } else if ("vertical".equals(str2)) {
                    c0084e.f4224k = x(str3);
                } else {
                    r.h("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                r.h("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    private static int u(String str) {
        str.hashCode();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    b10 = 0;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    b10 = 1;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    b10 = 2;
                }
                break;
            case -1074341483:
                if (str.equals(elEbP.Wjorog)) {
                    b10 = 3;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    b10 = 4;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    b10 = 5;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                r.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }
}
