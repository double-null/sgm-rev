package u7;

/* JADX INFO: compiled from: PlaybackParameters.java */
/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f26515d = new x(1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f26516e = x7.l0.C0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f26517f = x7.l0.C0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f26519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26520c;

    public x(float f10) {
        this(f10, 1.0f);
    }

    public long a(long j10) {
        return j10 * ((long) this.f26520c);
    }

    public x b(float f10) {
        return new x(f10, this.f26519b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.f26518a == xVar.f26518a && this.f26519b == xVar.f26519b;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f26518a)) * 31) + Float.floatToRawIntBits(this.f26519b);
    }

    public String toString() {
        return x7.l0.G("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f26518a), Float.valueOf(this.f26519b));
    }

    public x(float f10, float f11) {
        x7.a.a(f10 > 0.0f);
        x7.a.a(f11 > 0.0f);
        this.f26518a = f10;
        this.f26519b = f11;
        this.f26520c = Math.round(f10 * 1000.0f);
    }
}
