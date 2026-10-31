package od;

import d5.LXP.wcAlQCOdREZdI;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes5.dex */
final class d implements e<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f23383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f23384b;

    public d(float f10, float f11) {
        this.f23383a = f10;
        this.f23384b = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // od.e
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return b(((Number) comparable).floatValue());
    }

    public boolean b(float f10) {
        return f10 >= this.f23383a && f10 <= this.f23384b;
    }

    public boolean c() {
        return this.f23383a > this.f23384b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (!c() || !((d) obj).c()) {
            d dVar = (d) obj;
            if (!(this.f23383a == dVar.f23383a)) {
                return false;
            }
            if (!(this.f23384b == dVar.f23384b)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (c()) {
            return -1;
        }
        return (Float.hashCode(this.f23383a) * 31) + Float.hashCode(this.f23384b);
    }

    public String toString() {
        return this.f23383a + wcAlQCOdREZdI.CfqeRLVSntSgO + this.f23384b;
    }
}
