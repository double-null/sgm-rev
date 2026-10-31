package je;

import java.util.Arrays;

/* JADX INFO: compiled from: InlineClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q0 extends g2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f20989m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(String name, l0<?> generatedSerializer) {
        super(name, generatedSerializer, 1);
        kotlin.jvm.internal.t.f(name, "name");
        kotlin.jvm.internal.t.f(generatedSerializer, "generatedSerializer");
        this.f20989m = true;
    }

    @Override // je.g2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q0) {
            he.f fVar = (he.f) obj;
            if (kotlin.jvm.internal.t.a(i(), fVar.i())) {
                q0 q0Var = (q0) obj;
                if ((q0Var.isInline() && Arrays.equals(u(), q0Var.u())) && e() == fVar.e()) {
                    int iE = e();
                    for (int i10 = 0; i10 < iE; i10++) {
                        if (kotlin.jvm.internal.t.a(h(i10).i(), fVar.h(i10).i()) && kotlin.jvm.internal.t.a(h(i10).d(), fVar.h(i10).d())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // je.g2
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // je.g2, he.f
    public boolean isInline() {
        return this.f20989m;
    }
}
