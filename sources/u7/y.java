package u7;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import io.bidmachine.media3.common.PlaybackException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: Player.java */
/* JADX INFO: loaded from: classes4.dex */
public interface y {

    /* JADX INFO: compiled from: Player.java */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f26521b = new a().e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f26522c = x7.l0.C0(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o f26523a;

        /* JADX INFO: compiled from: Player.java */
        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final int[] f26524b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final o.b f26525a = new o.b();

            public a a(int i10) {
                this.f26525a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f26525a.b(bVar.f26523a);
                return this;
            }

            public a c(int... iArr) {
                this.f26525a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f26525a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f26525a.e());
            }
        }

        public boolean b(int i10) {
            return this.f26523a.a(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f26523a.equals(((b) obj).f26523a);
            }
            return false;
        }

        public int hashCode() {
            return this.f26523a.hashCode();
        }

        private b(o oVar) {
            this.f26523a = oVar;
        }
    }

    /* JADX INFO: compiled from: Player.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o f26526a;

        public c(o oVar) {
            this.f26526a = oVar;
        }

        public boolean a(int... iArr) {
            return this.f26526a.b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f26526a.equals(((c) obj).f26526a);
            }
            return false;
        }

        public int hashCode() {
            return this.f26526a.hashCode();
        }
    }

    /* JADX INFO: compiled from: Player.java */
    public static final class e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final String f26527k = x7.l0.C0(0);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f26528l = x7.l0.C0(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final String f26529m = x7.l0.C0(2);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final String f26530n = x7.l0.C0(3);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final String f26531o = x7.l0.C0(4);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f26532p = x7.l0.C0(5);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f26533q = x7.l0.C0(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f26534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public final int f26535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f26536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final s f26537d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f26538e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f26539f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f26540g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f26541h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f26542i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f26543j;

        public e(Object obj, int i10, s sVar, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f26534a = obj;
            this.f26535b = i10;
            this.f26536c = i10;
            this.f26537d = sVar;
            this.f26538e = obj2;
            this.f26539f = i11;
            this.f26540g = j10;
            this.f26541h = j11;
            this.f26542i = i12;
            this.f26543j = i13;
        }

        public boolean a(e eVar) {
            return this.f26536c == eVar.f26536c && this.f26539f == eVar.f26539f && this.f26540g == eVar.f26540g && this.f26541h == eVar.f26541h && this.f26542i == eVar.f26542i && this.f26543j == eVar.f26543j && Objects.equals(this.f26537d, eVar.f26537d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return a(eVar) && Objects.equals(this.f26534a, eVar.f26534a) && Objects.equals(this.f26538e, eVar.f26538e);
        }

        public int hashCode() {
            return Objects.hash(this.f26534a, Integer.valueOf(this.f26536c), this.f26537d, this.f26538e, Integer.valueOf(this.f26539f), Long.valueOf(this.f26540g), Long.valueOf(this.f26541h), Integer.valueOf(this.f26542i), Integer.valueOf(this.f26543j));
        }
    }

    void A(d dVar);

    void B(int i10, long j10);

    b C();

    boolean D();

    void E(boolean z10);

    long F();

    long G();

    int H();

    void I(TextureView textureView);

    l0 J();

    void K(s sVar);

    boolean L();

    int M();

    void N(long j10);

    long O();

    long P();

    boolean Q();

    int R();

    int S();

    void T(int i10);

    void U(SurfaceView surfaceView);

    int V();

    boolean W();

    long X();

    void Y();

    void Z();

    PlaybackException a();

    u a0();

    boolean b();

    long b0();

    void c(x xVar);

    boolean c0();

    long d();

    x e();

    void f();

    void g(List<s> list, boolean z10);

    long getCurrentPosition();

    long getDuration();

    float getVolume();

    void h(SurfaceView surfaceView);

    void i(d dVar);

    boolean isPlaying();

    void j();

    void k();

    void l(boolean z10);

    h0 m();

    void n();

    boolean o();

    w7.b p();

    void pause();

    int q();

    boolean r(int i10);

    boolean s();

    void setVolume(float f10);

    void stop();

    int t();

    d0 u();

    Looper v();

    g0 w();

    void x();

    void y(g0 g0Var);

    void z(TextureView textureView);

    /* JADX INFO: compiled from: Player.java */
    public interface d {
        default void Q() {
        }

        default void B(int i10) {
        }

        @Deprecated
        default void D(boolean z10) {
        }

        default void F(g0 g0Var) {
        }

        default void G(h0 h0Var) {
        }

        default void H(int i10) {
        }

        default void I(int i10) {
        }

        default void M(boolean z10) {
        }

        default void P(PlaybackException playbackException) {
        }

        default void W(u uVar) {
        }

        @Deprecated
        default void X(int i10) {
        }

        default void a(boolean z10) {
        }

        default void a0(boolean z10) {
        }

        default void c(l0 l0Var) {
        }

        default void c0(float f10) {
        }

        default void e0(PlaybackException playbackException) {
        }

        default void h0(k kVar) {
        }

        default void i0(b bVar) {
        }

        @Deprecated
        default void k(List<w7.a> list) {
        }

        default void q0(boolean z10) {
        }

        default void s(w7.b bVar) {
        }

        default void v(v vVar) {
        }

        default void w(int i10) {
        }

        default void x(x xVar) {
        }

        default void C(y yVar, c cVar) {
        }

        default void N(s sVar, int i10) {
        }

        default void O(int i10, boolean z10) {
        }

        default void S(d0 d0Var, int i10) {
        }

        default void V(int i10, int i11) {
        }

        @Deprecated
        default void j0(boolean z10, int i10) {
        }

        default void n0(boolean z10, int i10) {
        }

        default void Y(e eVar, e eVar2, int i10) {
        }
    }
}
