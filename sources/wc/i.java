package wc;

/* JADX INFO: compiled from: KotlinVersion.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i implements Comparable<i> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f27760e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f27761f = j.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27765d;

    /* JADX INFO: compiled from: KotlinVersion.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public i(int i10, int i11, int i12) {
        this.f27762a = i10;
        this.f27763b = i11;
        this.f27764c = i12;
        this.f27765d = b(i10, i11, i12);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0020  */
    private final int b(int i10, int i11, int i12) {
        boolean z10;
        if (i10 >= 0 && i10 < 256) {
            if (i11 >= 0 && i11 < 256) {
                z10 = i12 >= 0 && i12 < 256;
            }
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(i other) {
        kotlin.jvm.internal.t.f(other, "other");
        return this.f27765d - other.f27765d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        i iVar = obj instanceof i ? (i) obj : null;
        return iVar != null && this.f27765d == iVar.f27765d;
    }

    public int hashCode() {
        return this.f27765d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27762a);
        sb2.append('.');
        sb2.append(this.f27763b);
        sb2.append('.');
        sb2.append(this.f27764c);
        return sb2.toString();
    }
}
