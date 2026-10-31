package b8;

/* JADX INFO: compiled from: RendererConfiguration.java */
/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f4173c = new y(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4175b;

    public y(int i10, boolean z10) {
        this.f4174a = i10;
        this.f4175b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f4174a == yVar.f4174a && this.f4175b == yVar.f4175b;
    }

    public int hashCode() {
        return (this.f4174a << 1) + (this.f4175b ? 1 : 0);
    }
}
