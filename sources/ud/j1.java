package ud;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
final class j1 implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26774a;

    public j1(boolean z10) {
        this.f26774a = z10;
    }

    @Override // ud.w1
    public l2 a() {
        return null;
    }

    @Override // ud.w1
    public boolean c() {
        return this.f26774a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(c() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
