package io.bidmachine.media3.exoplayer;

import android.os.Looper;

/* JADX INFO: compiled from: PlayerMessage.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f18627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f18628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x7.h f18629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u7.d0 f18630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f18632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Looper f18633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f18634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f18635i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f18636j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f18637k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f18638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f18639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f18640n;

    /* JADX INFO: compiled from: PlayerMessage.java */
    public interface a {
        void b(f2 f2Var);
    }

    /* JADX INFO: compiled from: PlayerMessage.java */
    public interface b {
        void z(int i10, Object obj) throws ExoPlaybackException;
    }

    public f2(a aVar, b bVar, u7.d0 d0Var, int i10, x7.h hVar, Looper looper) {
        this.f18628b = aVar;
        this.f18627a = bVar;
        this.f18630d = d0Var;
        this.f18633g = looper;
        this.f18629c = hVar;
        this.f18634h = i10;
    }

    public boolean a() {
        return this.f18636j;
    }

    public Looper b() {
        return this.f18633g;
    }

    public int c() {
        return this.f18634h;
    }

    public Object d() {
        return this.f18632f;
    }

    public long e() {
        return this.f18635i;
    }

    public b f() {
        return this.f18627a;
    }

    public u7.d0 g() {
        return this.f18630d;
    }

    public int h() {
        return this.f18631e;
    }

    public synchronized boolean i() {
        return this.f18640n;
    }

    public synchronized void j(boolean z10) {
        this.f18638l = z10 | this.f18638l;
        this.f18639m = true;
        notifyAll();
    }

    public f2 k() {
        x7.a.g(!this.f18637k);
        if (this.f18635i == -9223372036854775807L) {
            x7.a.a(this.f18636j);
        }
        this.f18637k = true;
        this.f18628b.b(this);
        return this;
    }

    public f2 l(Object obj) {
        x7.a.g(!this.f18637k);
        this.f18632f = obj;
        return this;
    }

    public f2 m(int i10) {
        x7.a.g(!this.f18637k);
        this.f18631e = i10;
        return this;
    }
}
