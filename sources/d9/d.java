package d9;

import v8.q;
import v8.z;

/* JADX INFO: compiled from: StartOffsetExtractorInput.java */
/* JADX INFO: loaded from: classes4.dex */
final class d extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f13433b;

    public d(q qVar, long j10) {
        super(qVar);
        x7.a.a(qVar.getPosition() >= j10);
        this.f13433b = j10;
    }

    @Override // v8.z, v8.q
    public long f() {
        return super.f() - this.f13433b;
    }

    @Override // v8.z, v8.q
    public long getLength() {
        return super.getLength() - this.f13433b;
    }

    @Override // v8.z, v8.q
    public long getPosition() {
        return super.getPosition() - this.f13433b;
    }
}
