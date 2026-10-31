package q8;

import java.util.List;
import u7.d0;
import u7.e0;

/* JADX INFO: compiled from: ExoTrackSelection.java */
/* JADX INFO: loaded from: classes4.dex */
public interface q extends t {

    /* JADX INFO: compiled from: ExoTrackSelection.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0 f24596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f24597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f24598c;

        public a(e0 e0Var, int... iArr) {
            this(e0Var, iArr, 0);
        }

        public a(e0 e0Var, int[] iArr, int i10) {
            if (iArr.length == 0) {
                x7.r.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f24596a = e0Var;
            this.f24597b = iArr;
            this.f24598c = i10;
        }
    }

    /* JADX INFO: compiled from: ExoTrackSelection.java */
    public interface b {
        q[] a(a[] aVarArr, r8.d dVar, io.bidmachine.media3.exoplayer.source.r.b bVar, d0 d0Var);
    }

    boolean a(int i10, long j10);

    int b();

    void d();

    boolean g(int i10, long j10);

    void h(float f10);

    Object i();

    void l(long j10, long j11, long j12, List<? extends o8.m> list, o8.n[] nVarArr);

    void o();

    int p(long j10, List<? extends o8.m> list);

    int q();

    default boolean r(long j10, o8.e eVar, List<? extends o8.m> list) {
        return false;
    }

    u7.q s();

    int t();

    default void j() {
    }

    default void u() {
    }

    default void n(boolean z10) {
    }
}
