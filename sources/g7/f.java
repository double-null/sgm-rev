package g7;

import android.graphics.PointF;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15452a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PointF f15453b = new PointF(0.5f, 0.7f);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f15454a = new a();

            private a() {
            }

            private final float b(Random random, float f10, float f11) {
                double d10;
                long j10 = 100000;
                double dSqrt = Math.sqrt(((double) (-2)) * Math.log(Math.abs(((random.nextLong() % j10) + 1) / 100000.0d))) * Math.sin(Math.abs(((random.nextLong() % j10) + 1) / 100000.0d) * 6.283185307179586d);
                if (0.4f > f11 || f11 > 0.6f) {
                    double d11 = f11;
                    d10 = f11 < 0.4f ? d11 + (((double) f10) / (dSqrt * dSqrt)) : d11 - (((double) f10) / (dSqrt * dSqrt));
                } else {
                    d10 = (dSqrt * ((double) f10)) + ((double) f11);
                }
                return (float) od.k.h(d10, 0.0d, 1.0d);
            }

            @Override // g7.f.b
            public PointF a(Random random, pb.v clickArea) {
                kotlin.jvm.internal.t.f(random, "random");
                kotlin.jvm.internal.t.f(clickArea, "clickArea");
                return new PointF(b(random, clickArea.e().x, clickArea.c().x), b(random, clickArea.e().y, clickArea.c().y));
            }
        }

        /* JADX INFO: renamed from: g7.f$b$b, reason: collision with other inner class name */
        public static final class C0234b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0234b f15455a = new C0234b();

            private C0234b() {
            }

            private final float b(Random random, float f10, float f11) {
                return (float) (((double) (f10 - f11)) + (random.nextDouble() * ((double) f11) * ((double) 2)));
            }

            @Override // g7.f.b
            public PointF a(Random random, pb.v clickArea) {
                kotlin.jvm.internal.t.f(random, "random");
                kotlin.jvm.internal.t.f(clickArea, "clickArea");
                return new PointF(b(random, clickArea.c().x, clickArea.e().x), b(random, clickArea.c().y, clickArea.e().y));
            }
        }

        PointF a(Random random, pb.v vVar);
    }

    public final PointF a(pb.v clickArea, b distribution) {
        kotlin.jvm.internal.t.f(clickArea, "clickArea");
        kotlin.jvm.internal.t.f(distribution, "distribution");
        Long lD = clickArea.d();
        return distribution.a(lD != null ? new Random(lD.longValue()) : new Random(), clickArea);
    }
}
