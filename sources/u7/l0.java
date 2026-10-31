package u7;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: VideoSize.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l0 f26202e = new l0(0, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f26203f = x7.l0.C0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f26204g = x7.l0.C0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f26205h = x7.l0.C0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final int f26208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26209d;

    public l0(int i10, int i11) {
        this(i10, i11, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f26206a == l0Var.f26206a && this.f26207b == l0Var.f26207b && this.f26209d == l0Var.f26209d;
    }

    public int hashCode() {
        return ((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.f26206a) * 31) + this.f26207b) * 31) + Float.floatToRawIntBits(this.f26209d);
    }

    public l0(int i10, int i11, float f10) {
        this.f26206a = i10;
        this.f26207b = i11;
        this.f26208c = 0;
        this.f26209d = f10;
    }
}
