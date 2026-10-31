package pb;

/* JADX INFO: loaded from: classes5.dex */
public final class f1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f24060g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f24063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f24064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f24065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f24066f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ f1 c(a aVar, String str, int i10, String str2, boolean z10, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                z10 = false;
            }
            return aVar.b(str, i10, str2, z10);
        }

        public final f1 a(String scriptId, int i10, String source) {
            kotlin.jvm.internal.t.f(scriptId, "scriptId");
            kotlin.jvm.internal.t.f(source, "source");
            return c(this, scriptId, i10, source, false, 8, null);
        }

        public final f1 b(String scriptId, int i10, String source, boolean z10) {
            kotlin.jvm.internal.t.f(scriptId, "scriptId");
            kotlin.jvm.internal.t.f(source, "source");
            b bVar = b.InlineTag;
            boolean z11 = true;
            if (z10) {
                source = f7.e.a(source);
            }
            return new f1(scriptId, i10, bVar, z11, source, null, 32, null);
        }

        private a() {
        }
    }

    public enum b {
        DocumentStart,
        DocumentEnd,
        InlineTag,
        Runtime
    }

    public f1(String scriptId, int i10, b bVar, boolean z10, String source, String str) {
        kotlin.jvm.internal.t.f(scriptId, "scriptId");
        kotlin.jvm.internal.t.f(source, "source");
        this.f24061a = scriptId;
        this.f24062b = i10;
        this.f24063c = bVar;
        this.f24064d = z10;
        this.f24065e = source;
        this.f24066f = str;
    }

    public static final f1 a(String str, int i10, String str2) {
        return f24060g.a(str, i10, str2);
    }

    public static final f1 b(String str, int i10, String str2, boolean z10) {
        return f24060g.b(str, i10, str2, z10);
    }

    public final boolean c() {
        return this.f24064d;
    }

    public final String d() {
        return this.f24066f;
    }

    public final int e() {
        return this.f24062b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return kotlin.jvm.internal.t.a(this.f24061a, f1Var.f24061a) && this.f24062b == f1Var.f24062b && this.f24063c == f1Var.f24063c && this.f24064d == f1Var.f24064d && kotlin.jvm.internal.t.a(this.f24065e, f1Var.f24065e) && kotlin.jvm.internal.t.a(this.f24066f, f1Var.f24066f);
    }

    public final String f() {
        return this.f24061a;
    }

    public final String g() {
        return this.f24065e;
    }

    public final b h() {
        return this.f24063c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    public int hashCode() {
        int iHashCode = ((this.f24061a.hashCode() * 31) + Integer.hashCode(this.f24062b)) * 31;
        b bVar = this.f24063c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        boolean z10 = this.f24064d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iHashCode3 = (((iHashCode2 + r10) * 31) + this.f24065e.hashCode()) * 31;
        String str = this.f24066f;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ScriptConfig(scriptId=" + this.f24061a + ", priority=" + this.f24062b + ", type=" + this.f24063c + ", forMainFrameOnly=" + this.f24064d + ", source=" + this.f24065e + ", messageHandler=" + this.f24066f + ')';
    }

    public /* synthetic */ f1(String str, int i10, b bVar, boolean z10, String str2, String str3, int i11, kotlin.jvm.internal.k kVar) {
        this(str, i10, bVar, z10, str2, (i11 & 32) != 0 ? null : str3);
    }
}
