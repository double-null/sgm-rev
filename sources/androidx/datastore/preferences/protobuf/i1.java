package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: StructuralMessageInfo.java */
/* JADX INFO: loaded from: classes.dex */
final class i1 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0 f2201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f2202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f2203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r[] f2204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p0 f2205e;

    public int[] a() {
        return this.f2203c;
    }

    public r[] b() {
        return this.f2204d;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public p0 getDefaultInstance() {
        return this.f2205e;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public z0 getSyntax() {
        return this.f2201a;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public boolean isMessageSetWireFormat() {
        return this.f2202b;
    }
}
