package n8;

import android.net.Uri;
import com.google.common.collect.b0;
import io.bidmachine.media3.exoplayer.source.UnrecognizedInputFormatException;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import v8.i0;

/* JADX INFO: compiled from: BundledExtractorsAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements io.bidmachine.media3.exoplayer.source.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v8.u f22767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v8.p f22768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v8.q f22769c;

    public b(v8.u uVar) {
        this.f22767a = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(v8.p pVar) {
        return pVar.f().getClass().getSimpleName();
    }

    @Override // io.bidmachine.media3.exoplayer.source.w
    public void a(long j10, long j11) {
        ((v8.p) x7.a.e(this.f22768b)).a(j10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.source.w
    public void b() {
        v8.p pVar = this.f22768b;
        if (pVar == null) {
            return;
        }
        v8.p pVarF = pVar.f();
        if (pVarF instanceof o9.f) {
            ((o9.f) pVarF).k();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0072  */
    @Override // io.bidmachine.media3.exoplayer.source.w
    public void c(u7.h hVar, Uri uri, Map<String, List<String>> map, long j10, long j11, v8.r rVar) throws IOException {
        v8.i iVar = new v8.i(hVar, j10, j11);
        this.f22769c = iVar;
        if (this.f22768b != null) {
            return;
        }
        v8.p[] pVarArrF = this.f22767a.f(uri, map);
        com.google.common.collect.u.a aVarW = com.google.common.collect.u.w(pVarArrF.length);
        if (pVarArrF.length == 1) {
            this.f22768b = pVarArrF[0];
        } else {
            for (v8.p pVar : pVarArrF) {
                try {
                    if (pVar.e(iVar)) {
                        this.f22768b = pVar;
                        x7.a.g(true);
                        iVar.d();
                        break;
                    } else {
                        aVarW.k(pVar.i());
                        boolean z10 = this.f22768b != null || iVar.getPosition() == j10;
                        x7.a.g(z10);
                        iVar.d();
                    }
                } catch (EOFException unused) {
                    if (this.f22768b != null || iVar.getPosition() == j10) {
                    }
                } catch (Throwable th) {
                    x7.a.g(this.f22768b != null || iVar.getPosition() == j10);
                    iVar.d();
                    throw th;
                }
                x7.a.g(z10);
                iVar.d();
            }
            if (this.f22768b == null) {
                throw new UnrecognizedInputFormatException("None of the available extractors (" + com.google.common.base.i.g(", ").d(b0.m(com.google.common.collect.u.D(pVarArrF), new com.google.common.base.g() { // from class: n8.a
                    @Override // com.google.common.base.g
                    public final Object apply(Object obj) {
                        return b.g((v8.p) obj);
                    }
                })) + ") could read the stream.", (Uri) x7.a.e(uri), aVarW.m());
            }
        }
        this.f22768b.c(rVar);
    }

    @Override // io.bidmachine.media3.exoplayer.source.w
    public long d() {
        v8.q qVar = this.f22769c;
        if (qVar != null) {
            return qVar.getPosition();
        }
        return -1L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.w
    public int e(i0 i0Var) throws IOException {
        return ((v8.p) x7.a.e(this.f22768b)).l((v8.q) x7.a.e(this.f22769c), i0Var);
    }

    @Override // io.bidmachine.media3.exoplayer.source.w
    public void release() {
        v8.p pVar = this.f22768b;
        if (pVar != null) {
            pVar.release();
            this.f22768b = null;
        }
        this.f22769c = null;
    }
}
