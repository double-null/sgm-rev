package rd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25068b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f25069a;

    /* JADX INFO: compiled from: Regex.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: Regex.kt */
    private static final class b implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f25070c = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f25072b;

        /* JADX INFO: compiled from: Regex.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
                this();
            }
        }

        public b(String pattern, int i10) {
            kotlin.jvm.internal.t.f(pattern, "pattern");
            this.f25071a = pattern;
            this.f25072b = i10;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.f25071a, this.f25072b);
            kotlin.jvm.internal.t.e(patternCompile, "compile(...)");
            return new o(patternCompile);
        }
    }

    public o(Pattern nativePattern) {
        kotlin.jvm.internal.t.f(nativePattern, "nativePattern");
        this.f25069a = nativePattern;
    }

    public static /* synthetic */ l c(o oVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return oVar.b(charSequence, i10);
    }

    private final Object writeReplace() {
        String strPattern = this.f25069a.pattern();
        kotlin.jvm.internal.t.e(strPattern, "pattern(...)");
        return new b(strPattern, this.f25069a.flags());
    }

    public final l b(CharSequence input, int i10) {
        kotlin.jvm.internal.t.f(input, "input");
        Matcher matcher = this.f25069a.matcher(input);
        kotlin.jvm.internal.t.e(matcher, "matcher(...)");
        return p.c(matcher, i10, input);
    }

    public final boolean e(CharSequence input) {
        kotlin.jvm.internal.t.f(input, "input");
        return this.f25069a.matcher(input).matches();
    }

    public final String f(CharSequence input, String replacement) {
        kotlin.jvm.internal.t.f(input, "input");
        kotlin.jvm.internal.t.f(replacement, "replacement");
        String strReplaceAll = this.f25069a.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.t.e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final List<String> g(CharSequence input, int i10) {
        kotlin.jvm.internal.t.f(input, "input");
        f0.F0(i10);
        Matcher matcher = this.f25069a.matcher(input);
        if (i10 == 1 || !matcher.find()) {
            return kotlin.collections.s.e(input.toString());
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? od.k.f(i10, 10) : 10);
        int i11 = i10 - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i11 >= 0 && arrayList.size() == i11) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public String toString() {
        String string = this.f25069a.toString();
        kotlin.jvm.internal.t.e(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(String pattern) {
        kotlin.jvm.internal.t.f(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        kotlin.jvm.internal.t.e(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
