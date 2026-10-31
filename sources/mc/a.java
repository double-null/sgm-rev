package mc;

/* JADX INFO: compiled from: ActionEvent.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22253b;

    public a(int i10, boolean z10) {
        this.f22252a = i10;
        this.f22253b = z10;
    }

    public final int a() {
        return this.f22252a;
    }

    public final boolean b() {
        return this.f22253b;
    }

    public String toString() {
        return "action code - " + this.f22252a + ", is billable - " + this.f22253b;
    }
}
