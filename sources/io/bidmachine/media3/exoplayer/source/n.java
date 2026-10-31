package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: IcyDataSource.java */
/* JADX INFO: loaded from: classes4.dex */
final class n implements z7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z7.d f19657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f19659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f19660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19661e;

    /* JADX INFO: compiled from: IcyDataSource.java */
    public interface a {
        void a(x7.a0 a0Var);
    }

    public n(z7.d dVar, int i10, a aVar) {
        x7.a.a(i10 > 0);
        this.f19657a = dVar;
        this.f19658b = i10;
        this.f19659c = aVar;
        this.f19660d = new byte[1];
        this.f19661e = i10;
    }

    private boolean o() throws IOException {
        if (this.f19657a.read(this.f19660d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f19660d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = this.f19657a.read(bArr, i12, i11);
            if (i13 == -1) {
                return false;
            }
            i12 += i13;
            i11 -= i13;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f19659c.a(new x7.a0(bArr, i10));
        }
        return true;
    }

    @Override // z7.d
    public void a(z7.o oVar) {
        x7.a.e(oVar);
        this.f19657a.a(oVar);
    }

    @Override // z7.d
    public Map<String, List<String>> c() {
        return this.f19657a.c();
    }

    @Override // z7.d
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // z7.d
    public long i(z7.g gVar) {
        throw new UnsupportedOperationException();
    }

    @Override // z7.d
    public Uri m() {
        return this.f19657a.m();
    }

    @Override // u7.h
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f19661e == 0) {
            if (!o()) {
                return -1;
            }
            this.f19661e = this.f19658b;
        }
        int i12 = this.f19657a.read(bArr, i10, Math.min(this.f19661e, i11));
        if (i12 != -1) {
            this.f19661e -= i12;
        }
        return i12;
    }
}
