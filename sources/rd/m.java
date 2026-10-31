package rd;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes5.dex */
final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matcher f25061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f25062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f25063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<String> f25064d;

    /* JADX INFO: compiled from: Regex.kt */
    public static final class a extends kotlin.collections.d<String> {
        a() {
        }

        @Override // kotlin.collections.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return e((String) obj);
            }
            return false;
        }

        public /* bridge */ boolean e(String str) {
            return super.contains(str);
        }

        @Override // kotlin.collections.d, java.util.List
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String get(int i10) {
            String strGroup = m.this.d().group(i10);
            return strGroup == null ? "" : strGroup;
        }

        public /* bridge */ int g(String str) {
            return super.indexOf(str);
        }

        @Override // kotlin.collections.d, kotlin.collections.b
        public int getSize() {
            return m.this.d().groupCount() + 1;
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return g((String) obj);
            }
            return -1;
        }

        @Override // kotlin.collections.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return o((String) obj);
            }
            return -1;
        }

        public /* bridge */ int o(String str) {
            return super.lastIndexOf(str);
        }
    }

    /* JADX INFO: compiled from: Regex.kt */
    public static final class b extends kotlin.collections.b<j> implements k {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j o(b bVar, int i10) {
            return bVar.g(i10);
        }

        @Override // kotlin.collections.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof j) {
                return f((j) obj);
            }
            return false;
        }

        public /* bridge */ boolean f(j jVar) {
            return super.contains(jVar);
        }

        public j g(int i10) {
            od.h hVarD = p.d(m.this.d(), i10);
            if (hVarD.j().intValue() < 0) {
                return null;
            }
            String strGroup = m.this.d().group(i10);
            kotlin.jvm.internal.t.e(strGroup, "group(...)");
            return new j(strGroup, hVarD);
        }

        @Override // kotlin.collections.b
        public int getSize() {
            return m.this.d().groupCount() + 1;
        }

        @Override // kotlin.collections.b, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // kotlin.collections.b, java.util.Collection, java.lang.Iterable
        public Iterator<j> iterator() {
            return qd.r.v(kotlin.collections.b0.E(kotlin.collections.t.l(this)), new id.l() { // from class: rd.n
                @Override // id.l
                public final Object invoke(Object obj) {
                    return m.b.o(this.f25067a, ((Integer) obj).intValue());
                }
            }).iterator();
        }
    }

    public m(Matcher matcher, CharSequence input) {
        kotlin.jvm.internal.t.f(matcher, "matcher");
        kotlin.jvm.internal.t.f(input, "input");
        this.f25061a = matcher;
        this.f25062b = input;
        this.f25063c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult d() {
        return this.f25061a;
    }

    @Override // rd.l
    public l.b a() {
        return l.a.a(this);
    }

    @Override // rd.l
    public List<String> b() {
        if (this.f25064d == null) {
            this.f25064d = new a();
        }
        List<String> list = this.f25064d;
        kotlin.jvm.internal.t.c(list);
        return list;
    }
}
