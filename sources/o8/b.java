package o8;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: BaseMediaChunkIterator.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f23142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f23143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f23144d;

    public b(long j10, long j11) {
        this.f23142b = j10;
        this.f23143c = j11;
        f();
    }

    protected final void c() {
        long j10 = this.f23144d;
        if (j10 < this.f23142b || j10 > this.f23143c) {
            throw new NoSuchElementException();
        }
    }

    protected final long d() {
        return this.f23144d;
    }

    public boolean e() {
        return this.f23144d > this.f23143c;
    }

    public void f() {
        this.f23144d = this.f23142b - 1;
    }

    @Override // o8.n
    public boolean next() {
        this.f23144d++;
        return !e();
    }
}
