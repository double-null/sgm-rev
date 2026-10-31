package t9;

import java.util.Collections;
import java.util.List;
import s9.k;

/* JADX INFO: compiled from: CeaSubtitle.java */
/* JADX INFO: loaded from: classes4.dex */
final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<w7.a> f25784a;

    public f(List<w7.a> list) {
        this.f25784a = list;
    }

    @Override // s9.k
    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // s9.k
    public List<w7.a> b(long j10) {
        return j10 >= 0 ? this.f25784a : Collections.emptyList();
    }

    @Override // s9.k
    public long c(int i10) {
        x7.a.a(i10 == 0);
        return 0L;
    }

    @Override // s9.k
    public int d() {
        return 1;
    }
}
