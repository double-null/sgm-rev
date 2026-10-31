package com.explorestack.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: IterableByteBufferInputStream.java */
/* JADX INFO: loaded from: classes.dex */
class m0 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator<ByteBuffer> f10630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f10631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10632c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f10636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f10638i;

    m0(Iterable<ByteBuffer> iterable) {
        this.f10630a = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.f10632c++;
        }
        this.f10633d = -1;
        if (b()) {
            return;
        }
        this.f10631b = l0.f10624d;
        this.f10633d = 0;
        this.f10634e = 0;
        this.f10638i = 0L;
    }

    private boolean b() {
        this.f10633d++;
        if (!this.f10630a.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f10630a.next();
        this.f10631b = next;
        this.f10634e = next.position();
        if (this.f10631b.hasArray()) {
            this.f10635f = true;
            this.f10636g = this.f10631b.array();
            this.f10637h = this.f10631b.arrayOffset();
        } else {
            this.f10635f = false;
            this.f10638i = z2.k(this.f10631b);
            this.f10636g = null;
        }
        return true;
    }

    private void c(int i10) {
        int i11 = this.f10634e + i10;
        this.f10634e = i11;
        if (i11 == this.f10631b.limit()) {
            b();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f10633d == this.f10632c) {
            return -1;
        }
        if (this.f10635f) {
            int i10 = this.f10636g[this.f10634e + this.f10637h] & 255;
            c(1);
            return i10;
        }
        int iW = z2.w(((long) this.f10634e) + this.f10638i) & 255;
        c(1);
        return iW;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f10633d == this.f10632c) {
            return -1;
        }
        int iLimit = this.f10631b.limit();
        int i12 = this.f10634e;
        int i13 = iLimit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f10635f) {
            System.arraycopy(this.f10636g, i12 + this.f10637h, bArr, i10, i11);
            c(i11);
        } else {
            int iPosition = this.f10631b.position();
            this.f10631b.position(this.f10634e);
            this.f10631b.get(bArr, i10, i11);
            this.f10631b.position(iPosition);
            c(i11);
        }
        return i11;
    }
}
