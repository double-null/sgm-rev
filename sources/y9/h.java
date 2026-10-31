package y9;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import s9.k;
import x7.l0;

/* JADX INFO: compiled from: TtmlSubtitle.java */
/* JADX INFO: loaded from: classes4.dex */
final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f28863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f28864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, g> f28865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, e> f28866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, String> f28867e;

    public h(c cVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f28863a = cVar;
        this.f28866d = map2;
        this.f28867e = map3;
        this.f28865c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f28864b = cVar.j();
    }

    @Override // s9.k
    public int a(long j10) {
        int iD = l0.d(this.f28864b, j10, false, false);
        if (iD < this.f28864b.length) {
            return iD;
        }
        return -1;
    }

    @Override // s9.k
    public List<w7.a> b(long j10) {
        return this.f28863a.h(j10, this.f28865c, this.f28866d, this.f28867e);
    }

    @Override // s9.k
    public long c(int i10) {
        return this.f28864b[i10];
    }

    @Override // s9.k
    public int d() {
        return this.f28864b.length;
    }
}
