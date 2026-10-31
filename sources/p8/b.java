package p8;

import s9.j;
import s9.k;
import s9.r;

/* JADX INFO: compiled from: DelegatingSubtitleDecoder.java */
/* JADX INFO: loaded from: classes4.dex */
final class b extends j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final r f23507p;

    public b(String str, r rVar) {
        super(str);
        this.f23507p = rVar;
    }

    @Override // s9.j
    protected k C(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f23507p.reset();
        }
        return this.f23507p.a(bArr, 0, i10);
    }
}
