package ke;

/* JADX INFO: compiled from: JsonElementMarker.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final je.d0 f21370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21371b;

    /* JADX INFO: compiled from: JsonElementMarker.kt */
    /* synthetic */ class a extends kotlin.jvm.internal.q implements id.p<he.f, Integer, Boolean> {
        a(Object obj) {
            super(2, obj, j0.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        @Override // id.p
        public /* bridge */ /* synthetic */ Boolean invoke(he.f fVar, Integer num) {
            return k(fVar, num.intValue());
        }

        public final Boolean k(he.f p10, int i10) {
            kotlin.jvm.internal.t.f(p10, "p0");
            return Boolean.valueOf(((j0) this.receiver).e(p10, i10));
        }
    }

    public j0(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        this.f21370a = new je.d0(descriptor, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(he.f fVar, int i10) {
        boolean z10 = !fVar.j(i10) && fVar.h(i10).b();
        this.f21371b = z10;
        return z10;
    }

    public final boolean b() {
        return this.f21371b;
    }

    public final void c(int i10) {
        this.f21370a.a(i10);
    }

    public final int d() {
        return this.f21370a.d();
    }
}
