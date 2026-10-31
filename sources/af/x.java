package af;

/* JADX INFO: compiled from: Segment.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f400h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x f406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x f407g;

    /* JADX INFO: compiled from: Segment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public x() {
        this.f401a = new byte[8192];
        this.f405e = true;
        this.f404d = false;
    }

    public final void a() {
        x xVar = this.f407g;
        int i10 = 0;
        if (!(xVar != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        kotlin.jvm.internal.t.c(xVar);
        if (xVar.f405e) {
            int i11 = this.f403c - this.f402b;
            x xVar2 = this.f407g;
            kotlin.jvm.internal.t.c(xVar2);
            int i12 = 8192 - xVar2.f403c;
            x xVar3 = this.f407g;
            kotlin.jvm.internal.t.c(xVar3);
            if (!xVar3.f404d) {
                x xVar4 = this.f407g;
                kotlin.jvm.internal.t.c(xVar4);
                i10 = xVar4.f402b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            x xVar5 = this.f407g;
            kotlin.jvm.internal.t.c(xVar5);
            f(xVar5, i11);
            b();
            y.b(this);
        }
    }

    public final x b() {
        x xVar = this.f406f;
        if (xVar == this) {
            xVar = null;
        }
        x xVar2 = this.f407g;
        kotlin.jvm.internal.t.c(xVar2);
        xVar2.f406f = this.f406f;
        x xVar3 = this.f406f;
        kotlin.jvm.internal.t.c(xVar3);
        xVar3.f407g = this.f407g;
        this.f406f = null;
        this.f407g = null;
        return xVar;
    }

    public final x c(x segment) {
        kotlin.jvm.internal.t.f(segment, "segment");
        segment.f407g = this;
        segment.f406f = this.f406f;
        x xVar = this.f406f;
        kotlin.jvm.internal.t.c(xVar);
        xVar.f407g = segment;
        this.f406f = segment;
        return segment;
    }

    public final x d() {
        this.f404d = true;
        return new x(this.f401a, this.f402b, this.f403c, true, false);
    }

    public final x e(int i10) {
        x xVarC;
        if (!(i10 > 0 && i10 <= this.f403c - this.f402b)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i10 >= 1024) {
            xVarC = d();
        } else {
            xVarC = y.c();
            byte[] bArr = this.f401a;
            byte[] bArr2 = xVarC.f401a;
            int i11 = this.f402b;
            kotlin.collections.m.g(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        xVarC.f403c = xVarC.f402b + i10;
        this.f402b += i10;
        x xVar = this.f407g;
        kotlin.jvm.internal.t.c(xVar);
        xVar.c(xVarC);
        return xVarC;
    }

    public final void f(x sink, int i10) {
        kotlin.jvm.internal.t.f(sink, "sink");
        if (!sink.f405e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i11 = sink.f403c;
        if (i11 + i10 > 8192) {
            if (sink.f404d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f402b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f401a;
            kotlin.collections.m.g(bArr, bArr, 0, i12, i11, 2, null);
            sink.f403c -= sink.f402b;
            sink.f402b = 0;
        }
        byte[] bArr2 = this.f401a;
        byte[] bArr3 = sink.f401a;
        int i13 = sink.f403c;
        int i14 = this.f402b;
        kotlin.collections.m.d(bArr2, bArr3, i13, i14, i14 + i10);
        sink.f403c += i10;
        this.f402b += i10;
    }

    public x(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        kotlin.jvm.internal.t.f(data, "data");
        this.f401a = data;
        this.f402b = i10;
        this.f403c = i11;
        this.f404d = z10;
        this.f405e = z11;
    }
}
