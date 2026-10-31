package s9;

import io.bidmachine.media3.common.ParserException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import v8.e0;
import v8.i0;
import v8.o0;
import x7.a0;
import x7.l0;

/* JADX INFO: compiled from: SubtitleExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public class n implements v8.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f25326a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u7.q f25328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<b> f25329d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o0 f25332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f25335j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f25336k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f25327b = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f25331f = l0.f28141f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a0 f25330e = new a0();

    /* JADX INFO: compiled from: SubtitleExtractor.java */
    private static class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f25337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f25338b;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Long.compare(this.f25337a, bVar.f25337a);
        }

        private b(long j10, byte[] bArr) {
            this.f25337a = j10;
            this.f25338b = bArr;
        }
    }

    public n(r rVar, u7.q qVar) {
        this.f25326a = rVar;
        this.f25328c = qVar != null ? qVar.b().u0("application/x-media3-cues").S(qVar.f26252o).W(rVar.c()).N() : null;
        this.f25329d = new ArrayList();
        this.f25334i = 0;
        this.f25335j = l0.f28142g;
        this.f25336k = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(e eVar) {
        b bVar = new b(eVar.f25317b, this.f25327b.a(eVar.f25316a, eVar.f25318c));
        this.f25329d.add(bVar);
        long j10 = this.f25336k;
        if (j10 == -9223372036854775807L || eVar.f25317b >= j10) {
            m(bVar);
        }
    }

    private void g() throws IOException {
        try {
            long j10 = this.f25336k;
            this.f25326a.b(this.f25331f, 0, this.f25333h, j10 != -9223372036854775807L ? r.b.c(j10) : r.b.b(), new x7.l() { // from class: s9.m
                @Override // x7.l
                public final void accept(Object obj) {
                    this.f25325a.d((e) obj);
                }
            });
            Collections.sort(this.f25329d);
            this.f25335j = new long[this.f25329d.size()];
            for (int i10 = 0; i10 < this.f25329d.size(); i10++) {
                this.f25335j[i10] = this.f25329d.get(i10).f25337a;
            }
            this.f25331f = l0.f28141f;
        } catch (RuntimeException e10) {
            throw ParserException.b("SubtitleParser failed.", e10);
        }
    }

    private boolean h(v8.q qVar) throws IOException {
        byte[] bArr = this.f25331f;
        if (bArr.length == this.f25333h) {
            this.f25331f = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.f25331f;
        int i10 = this.f25333h;
        int i11 = qVar.read(bArr2, i10, bArr2.length - i10);
        if (i11 != -1) {
            this.f25333h += i11;
        }
        long length = qVar.getLength();
        return (length != -1 && ((long) this.f25333h) == length) || i11 == -1;
    }

    private boolean j(v8.q qVar) throws IOException {
        return qVar.h((qVar.getLength() > (-1L) ? 1 : (qVar.getLength() == (-1L) ? 0 : -1)) != 0 ? com.google.common.primitives.f.d(qVar.getLength()) : 1024) == -1;
    }

    private void k() {
        long j10 = this.f25336k;
        for (int iH = j10 == -9223372036854775807L ? 0 : l0.h(this.f25335j, j10, true, true); iH < this.f25329d.size(); iH++) {
            m(this.f25329d.get(iH));
        }
    }

    private void m(b bVar) {
        x7.a.i(this.f25332g);
        int length = bVar.f25338b.length;
        this.f25330e.T(bVar.f25338b);
        this.f25332g.b(this.f25330e, length);
        this.f25332g.f(bVar.f25337a, 1, length, 0, null);
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        int i10 = this.f25334i;
        x7.a.g((i10 == 0 || i10 == 5) ? false : true);
        this.f25336k = j11;
        if (this.f25334i == 2) {
            this.f25334i = 1;
        }
        if (this.f25334i == 4) {
            this.f25334i = 3;
        }
    }

    @Override // v8.p
    public void c(v8.r rVar) {
        x7.a.g(this.f25334i == 0);
        o0 o0VarE = rVar.e(0, 3);
        this.f25332g = o0VarE;
        u7.q qVar = this.f25328c;
        if (qVar != null) {
            o0VarE.a(qVar);
            rVar.r();
            rVar.h(new e0(new long[]{0}, new long[]{0}, -9223372036854775807L));
        }
        this.f25334i = 1;
    }

    @Override // v8.p
    public boolean e(v8.q qVar) throws IOException {
        return true;
    }

    @Override // v8.p
    public int l(v8.q qVar, i0 i0Var) throws IOException {
        int i10 = this.f25334i;
        x7.a.g((i10 == 0 || i10 == 5) ? false : true);
        if (this.f25334i == 1) {
            int iD = qVar.getLength() != -1 ? com.google.common.primitives.f.d(qVar.getLength()) : 1024;
            if (iD > this.f25331f.length) {
                this.f25331f = new byte[iD];
            }
            this.f25333h = 0;
            this.f25334i = 2;
        }
        if (this.f25334i == 2 && h(qVar)) {
            g();
            this.f25334i = 4;
        }
        if (this.f25334i == 3 && j(qVar)) {
            k();
            this.f25334i = 4;
        }
        return this.f25334i == 4 ? -1 : 0;
    }

    @Override // v8.p
    public void release() {
        if (this.f25334i == 5) {
            return;
        }
        this.f25326a.reset();
        this.f25334i = 5;
    }
}
