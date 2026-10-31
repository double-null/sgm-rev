package q8;

import io.bidmachine.media3.exoplayer.ExoPlaybackException;
import io.bidmachine.media3.exoplayer.h2;
import io.bidmachine.media3.exoplayer.i2;
import n8.x;
import u7.d0;
import u7.g0;

/* JADX INFO: compiled from: TrackSelector.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f24609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r8.d f24610b;

    protected final r8.d b() {
        return (r8.d) x7.a.i(this.f24610b);
    }

    public g0 c() {
        return g0.F;
    }

    public i2.a d() {
        return null;
    }

    public void e(a aVar, r8.d dVar) {
        this.f24609a = aVar;
        this.f24610b = dVar;
    }

    protected final void f() {
        a aVar = this.f24609a;
        if (aVar != null) {
            aVar.c();
        }
    }

    protected final void g(h2 h2Var) {
        a aVar = this.f24609a;
        if (aVar != null) {
            aVar.a(h2Var);
        }
    }

    public boolean h() {
        return false;
    }

    public abstract void i(Object obj);

    public void j() {
        this.f24609a = null;
        this.f24610b = null;
    }

    public abstract w k(i2[] i2VarArr, x xVar, io.bidmachine.media3.exoplayer.source.r.b bVar, d0 d0Var) throws ExoPlaybackException;

    /* JADX INFO: compiled from: TrackSelector.java */
    public interface a {
        void c();

        default void a(h2 h2Var) {
        }
    }

    public void l(u7.c cVar) {
    }

    public void m(g0 g0Var) {
    }
}
