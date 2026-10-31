package u7;

/* JADX INFO: compiled from: AuxEffectInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f26008b;

    public d(int i10, float f10) {
        this.f26007a = i10;
        this.f26008b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f26007a == dVar.f26007a && Float.compare(dVar.f26008b, this.f26008b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f26007a) * 31) + Float.floatToIntBits(this.f26008b);
    }
}
