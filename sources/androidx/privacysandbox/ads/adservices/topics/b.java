package androidx.privacysandbox.ads.adservices.topics;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: GetTopicsRequest.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f3023b;

    /* JADX INFO: compiled from: GetTopicsRequest.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f3024a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f3025b = true;

        public final b a() {
            return new b(this.f3024a, this.f3025b);
        }

        public final a b(String adsSdkName) {
            t.f(adsSdkName, "adsSdkName");
            if (!(adsSdkName.length() > 0)) {
                throw new IllegalStateException("adsSdkName must be set".toString());
            }
            this.f3024a = adsSdkName;
            return this;
        }

        public final a c(boolean z10) {
            this.f3025b = z10;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.f3022a;
    }

    public final boolean b() {
        return this.f3023b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return t.a(this.f3022a, bVar.f3022a) && this.f3023b == bVar.f3023b;
    }

    public int hashCode() {
        return (this.f3022a.hashCode() * 31) + Boolean.hashCode(this.f3023b);
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f3022a + ", shouldRecordObservation=" + this.f3023b;
    }

    public b(String adsSdkName, boolean z10) {
        t.f(adsSdkName, "adsSdkName");
        this.f3022a = adsSdkName;
        this.f3023b = z10;
    }

    public /* synthetic */ b(String str, boolean z10, int i10, kotlin.jvm.internal.k kVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10);
    }
}
