package b4;

import com.android.billingclient.gp.VRfCTjjLv;

/* JADX INFO: compiled from: SessionEvent.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f3937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f3938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f3939c;

    public e() {
        this(null, null, 0.0d, 7, null);
    }

    public final d a() {
        return this.f3938b;
    }

    public final d b() {
        return this.f3937a;
    }

    public final double c() {
        return this.f3939c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f3937a == eVar.f3937a && this.f3938b == eVar.f3938b && Double.compare(this.f3939c, eVar.f3939c) == 0;
    }

    public int hashCode() {
        return (((this.f3937a.hashCode() * 31) + this.f3938b.hashCode()) * 31) + Double.hashCode(this.f3939c);
    }

    public e(d performance, d crashlytics, double d10) {
        kotlin.jvm.internal.t.f(performance, "performance");
        kotlin.jvm.internal.t.f(crashlytics, "crashlytics");
        this.f3937a = performance;
        this.f3938b = crashlytics;
        this.f3939c = d10;
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f3937a + ", crashlytics=" + this.f3938b + VRfCTjjLv.Xbc + this.f3939c + ')';
    }

    public /* synthetic */ e(d dVar, d dVar2, double d10, int i10, kotlin.jvm.internal.k kVar) {
        this((i10 & 1) != 0 ? d.COLLECTION_SDK_NOT_INSTALLED : dVar, (i10 & 2) != 0 ? d.COLLECTION_SDK_NOT_INSTALLED : dVar2, (i10 & 4) != 0 ? 1.0d : d10);
    }
}
