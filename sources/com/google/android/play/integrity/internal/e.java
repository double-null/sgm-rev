package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11400b;

    e(int i10, long j10) {
        this.f11399a = i10;
        this.f11400b = j10;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final int a() {
        return this.f11399a;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final long b() {
        return this.f11400b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f11399a == fVar.a() && this.f11400b == fVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f11400b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ ((this.f11399a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f11399a + ", eventTimestamp=" + this.f11400b + "}";
    }
}
