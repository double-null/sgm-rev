package kotlinx.serialization.json;

import ke.k1;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class w extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final he.f f21610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21611c;

    public /* synthetic */ w(Object obj, boolean z10, he.f fVar, int i10, kotlin.jvm.internal.k kVar) {
        this(obj, z10, (i10 & 4) != 0 ? null : fVar);
    }

    @Override // kotlinx.serialization.json.g0
    public String a() {
        return this.f21611c;
    }

    public final he.f c() {
        return this.f21610b;
    }

    public boolean d() {
        return this.f21609a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return d() == wVar.d() && kotlin.jvm.internal.t.a(a(), wVar.a());
    }

    public int hashCode() {
        return (Boolean.hashCode(d()) * 31) + a().hashCode();
    }

    @Override // kotlinx.serialization.json.g0
    public String toString() {
        if (!d()) {
            return a();
        }
        StringBuilder sb2 = new StringBuilder();
        k1.c(sb2, a());
        String string = sb2.toString();
        kotlin.jvm.internal.t.e(string, "toString(...)");
        return string;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Object body, boolean z10, he.f fVar) {
        super(null);
        kotlin.jvm.internal.t.f(body, "body");
        this.f21609a = z10;
        this.f21610b = fVar;
        this.f21611c = body.toString();
        if (fVar != null && !fVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
