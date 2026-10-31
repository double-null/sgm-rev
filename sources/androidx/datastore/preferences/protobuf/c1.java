package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: RawMessageInfo.java */
/* JADX INFO: loaded from: classes.dex */
final class c1 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f2114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f2116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2117d;

    c1(p0 p0Var, String str, Object[] objArr) {
        this.f2114a = p0Var;
        this.f2115b = str;
        this.f2116c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f2117d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f2117d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    Object[] a() {
        return this.f2116c;
    }

    String b() {
        return this.f2115b;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public p0 getDefaultInstance() {
        return this.f2114a;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public z0 getSyntax() {
        int i10 = this.f2117d;
        if ((i10 & 1) != 0) {
            return z0.PROTO2;
        }
        return (i10 & 4) == 4 ? z0.EDITIONS : z0.PROTO3;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public boolean isMessageSetWireFormat() {
        return (this.f2117d & 2) == 2;
    }
}
