package z7;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: StatsDataSource.java */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f29074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f29075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f29076c = Uri.EMPTY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, List<String>> f29077d = Collections.emptyMap();

    public n(d dVar) {
        this.f29074a = (d) x7.a.e(dVar);
    }

    @Override // z7.d
    public void a(o oVar) {
        x7.a.e(oVar);
        this.f29074a.a(oVar);
    }

    @Override // z7.d
    public Map<String, List<String>> c() {
        return this.f29074a.c();
    }

    @Override // z7.d
    public void close() throws IOException {
        this.f29074a.close();
    }

    @Override // z7.d
    public long i(g gVar) throws IOException {
        this.f29076c = gVar.f29009a;
        this.f29077d = Collections.emptyMap();
        try {
            return this.f29074a.i(gVar);
        } finally {
            Uri uriM = m();
            if (uriM != null) {
                this.f29076c = uriM;
            }
            this.f29077d = c();
        }
    }

    @Override // z7.d
    public Uri m() {
        return this.f29074a.m();
    }

    public long o() {
        return this.f29075b;
    }

    public Uri p() {
        return this.f29076c;
    }

    public Map<String, List<String>> q() {
        return this.f29077d;
    }

    public void r() {
        this.f29075b = 0L;
    }

    @Override // u7.h
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f29074a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f29075b += (long) i12;
        }
        return i12;
    }
}
