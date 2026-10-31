package io.bidmachine.media3.exoplayer.upstream;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import n8.i;
import x7.l0;
import z7.d;
import z7.e;
import z7.g;
import z7.n;

/* JADX INFO: compiled from: ParsingLoadable.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c<T> implements Loader.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f19818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f19820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a<? extends T> f19821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile T f19822f;

    /* JADX INFO: compiled from: ParsingLoadable.java */
    public interface a<T> {
        T a(Uri uri, InputStream inputStream) throws IOException;
    }

    public c(d dVar, Uri uri, int i10, a<? extends T> aVar) {
        this(dVar, new g.b().i(uri).b(1).a(), i10, aVar);
    }

    public long a() {
        return this.f19820d.o();
    }

    public Map<String, List<String>> c() {
        return this.f19820d.q();
    }

    public final T d() {
        return this.f19822f;
    }

    public Uri e() {
        return this.f19820d.p();
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.e
    public final void load() throws IOException {
        this.f19820d.r();
        e eVar = new e(this.f19820d, this.f19818b);
        try {
            eVar.c();
            this.f19822f = this.f19821e.a((Uri) x7.a.e(this.f19820d.m()), eVar);
        } finally {
            l0.m(eVar);
        }
    }

    public c(d dVar, g gVar, int i10, a<? extends T> aVar) {
        this.f19820d = new n(dVar);
        this.f19818b = gVar;
        this.f19819c = i10;
        this.f19821e = aVar;
        this.f19817a = i.a();
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.Loader.e
    public final void b() {
    }
}
