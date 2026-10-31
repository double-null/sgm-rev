package ib;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.jvm.internal.t;
import wb.r;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f16279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f16280b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f16282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f16283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f16284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final InterfaceC0259a f16285e;

        /* JADX INFO: renamed from: ib.i$a$a, reason: collision with other inner class name */
        public interface InterfaceC0259a {

            /* JADX INFO: renamed from: ib.i$a$a$a, reason: collision with other inner class name */
            public static final class C0260a implements InterfaceC0259a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0260a f16286a = new C0260a();

                private C0260a() {
                }

                @Override // ib.i.a.InterfaceC0259a
                public int a(int i10, int i11, int i12, int i13, int i14) {
                    return kd.c.a(r.a(i13, i14, (i10 * i11) / (i12 * i12)));
                }
            }

            int a(int i10, int i11, int i12, int i13, int i14);
        }

        public a(int i10, int i11, int i12, int i13, InterfaceC0259a samplingStrategy) {
            t.f(samplingStrategy, "samplingStrategy");
            this.f16281a = i10;
            this.f16282b = i11;
            this.f16283c = i12;
            this.f16284d = i13;
            this.f16285e = samplingStrategy;
        }

        public final int a() {
            return this.f16281a;
        }

        public final int b(Rect rect) {
            t.f(rect, "rect");
            return this.f16285e.a(rect.width(), rect.height(), this.f16282b, this.f16283c, this.f16284d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16281a == aVar.f16281a && this.f16282b == aVar.f16282b && this.f16283c == aVar.f16283c && this.f16284d == aVar.f16284d && t.a(this.f16285e, aVar.f16285e);
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f16281a) * 31) + Integer.hashCode(this.f16282b)) * 31) + Integer.hashCode(this.f16283c)) * 31) + Integer.hashCode(this.f16284d)) * 31) + this.f16285e.hashCode();
        }

        public String toString() {
            return "Config(defaultColor=" + this.f16281a + ", maxDimensionPx=" + this.f16282b + ", minSampleStepPx=" + this.f16283c + ", maxSampleStepPx=" + this.f16284d + ", samplingStrategy=" + this.f16285e + ')';
        }
    }

    public i(a config, m pixelsExtractor) {
        t.f(config, "config");
        t.f(pixelsExtractor, "pixelsExtractor");
        this.f16279a = config;
        this.f16280b = pixelsExtractor;
    }

    public final int a(Bitmap bitmap, Rect rect) {
        t.f(bitmap, "bitmap");
        t.f(rect, "rect");
        Rect rectA = wb.a.f27681a.a(bitmap, rect);
        if (rectA == null) {
            return this.f16279a.a();
        }
        return wb.e.f27687a.d(this.f16280b.a(bitmap, rectA), bitmap.hasAlpha(), this.f16279a.b(rectA));
    }
}
