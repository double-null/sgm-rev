package de;

import java.util.concurrent.atomic.AtomicReferenceArray;
import zd.b0;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes5.dex */
final class k extends b0<k> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f13547e;

    public k(long j10, k kVar, int i10) {
        super(j10, kVar, i10);
        this.f13547e = new AtomicReferenceArray(j.f13546f);
    }

    @Override // zd.b0
    public int r() {
        return j.f13546f;
    }

    @Override // zd.b0
    public void s(int i10, Throwable th, zc.j jVar) {
        v().set(i10, j.f13545e);
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f29187c + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.f13547e;
    }
}
