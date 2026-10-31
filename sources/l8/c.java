package l8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b8.u;
import io.bidmachine.media3.exoplayer.h;
import io.bidmachine.media3.exoplayer.i2;
import io.bidmachine.media3.exoplayer.source.r;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import u7.q;
import u7.v;
import x7.l0;

/* JADX INFO: compiled from: MetadataRenderer.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements Handler.Callback {
    private v A;
    private long B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final a f21866r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final b f21867s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Handler f21868t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final e9.b f21869u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f21870v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private e9.a f21871w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f21872x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f21873y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f21874z;

    public c(b bVar, Looper looper) {
        this(bVar, looper, a.f21865a);
    }

    private void t0(v vVar, List<v.a> list) {
        for (int i10 = 0; i10 < vVar.e(); i10++) {
            q qVarA = vVar.d(i10).a();
            if (qVarA == null || !this.f21866r.a(qVarA)) {
                list.add(vVar.d(i10));
            } else {
                e9.a aVarB = this.f21866r.b(qVarA);
                byte[] bArr = (byte[]) x7.a.e(vVar.d(i10).c());
                this.f21869u.g();
                this.f21869u.q(bArr.length);
                ((ByteBuffer) l0.i(this.f21869u.f18057d)).put(bArr);
                this.f21869u.r();
                v vVarA = aVarB.a(this.f21869u);
                if (vVarA != null) {
                    t0(vVarA, list);
                }
            }
        }
    }

    private long u0(long j10) {
        x7.a.g(j10 != -9223372036854775807L);
        x7.a.g(this.B != -9223372036854775807L);
        return j10 - this.B;
    }

    private void v0(v vVar) {
        Handler handler = this.f21868t;
        if (handler != null) {
            handler.obtainMessage(1, vVar).sendToTarget();
        } else {
            w0(vVar);
        }
    }

    private void w0(v vVar) {
        this.f21867s.v(vVar);
    }

    private boolean x0(long j10) {
        boolean z10;
        v vVar = this.A;
        if (vVar == null || (!this.f21870v && vVar.f26507b > u0(j10))) {
            z10 = false;
        } else {
            v0(this.A);
            this.A = null;
            z10 = true;
        }
        if (this.f21872x && this.A == null) {
            this.f21873y = true;
        }
        return z10;
    }

    private void y0() {
        if (this.f21872x || this.A != null) {
            return;
        }
        this.f21869u.g();
        u uVarX = X();
        int iQ0 = q0(uVarX, this.f21869u, 0);
        if (iQ0 != -4) {
            if (iQ0 == -5) {
                this.f21874z = ((q) x7.a.e(uVarX.f4168b)).f26257t;
                return;
            }
            return;
        }
        if (this.f21869u.j()) {
            this.f21872x = true;
            return;
        }
        if (this.f21869u.f18059f >= Z()) {
            e9.b bVar = this.f21869u;
            bVar.f14513j = this.f21874z;
            bVar.r();
            v vVarA = ((e9.a) l0.i(this.f21871w)).a(this.f21869u);
            if (vVarA != null) {
                ArrayList arrayList = new ArrayList(vVarA.e());
                t0(vVarA, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.A = new v(u0(this.f21869u.f18059f), arrayList);
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public int a(q qVar) {
        if (this.f21866r.a(qVar)) {
            return i2.v(qVar.N == 0 ? 4 : 2);
        }
        return i2.v(0);
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public boolean b() {
        return this.f21873y;
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void f0() {
        this.A = null;
        this.f21871w = null;
        this.B = -9223372036854775807L;
    }

    @Override // io.bidmachine.media3.exoplayer.h2, io.bidmachine.media3.exoplayer.i2
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public boolean h() {
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        w0((v) message.obj);
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public void i(long j10, long j11) {
        boolean zX0 = true;
        while (zX0) {
            y0();
            zX0 = x0(j10);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void i0(long j10, boolean z10) {
        this.A = null;
        this.f21872x = false;
        this.f21873y = false;
    }

    @Override // io.bidmachine.media3.exoplayer.h
    protected void o0(q[] qVarArr, long j10, long j11, r.b bVar) {
        this.f21871w = this.f21866r.b(qVarArr[0]);
        v vVar = this.A;
        if (vVar != null) {
            this.A = vVar.c((vVar.f26507b + this.B) - j11);
        }
        this.B = j11;
    }

    public c(b bVar, Looper looper, a aVar) {
        this(bVar, looper, aVar, false);
    }

    public c(b bVar, Looper looper, a aVar, boolean z10) {
        super(5);
        this.f21867s = (b) x7.a.e(bVar);
        this.f21868t = looper == null ? null : l0.z(looper, this);
        this.f21866r = (a) x7.a.e(aVar);
        this.f21870v = z10;
        this.f21869u = new e9.b();
        this.B = -9223372036854775807L;
    }
}
