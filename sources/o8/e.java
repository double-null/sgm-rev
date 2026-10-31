package o8;

import android.net.Uri;
import io.bidmachine.media3.exoplayer.upstream.Loader;
import java.util.List;
import java.util.Map;
import u7.q;

/* JADX INFO: compiled from: Chunk.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e implements Loader.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23168a = n8.i.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z7.g f23169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f23171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f23173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f23174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f23175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final z7.n f23176i;

    public e(z7.d dVar, z7.g gVar, int i10, q qVar, int i11, Object obj, long j10, long j11) {
        this.f23176i = new z7.n(dVar);
        this.f23169b = (z7.g) x7.a.e(gVar);
        this.f23170c = i10;
        this.f23171d = qVar;
        this.f23172e = i11;
        this.f23173f = obj;
        this.f23174g = j10;
        this.f23175h = j11;
    }

    public final long a() {
        return this.f23176i.o();
    }

    public final long c() {
        return this.f23175h - this.f23174g;
    }

    public final Map<String, List<String>> d() {
        return this.f23176i.q();
    }

    public final Uri e() {
        return this.f23176i.p();
    }
}
