package t9;

import io.bidmachine.media3.extractor.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import s9.k;
import s9.l;
import s9.o;
import s9.p;
import x7.l0;

/* JADX INFO: compiled from: CeaDecoder.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque<b> f25775a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<p> f25776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f25777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f25778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f25779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f25780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f25781g;

    /* JADX INFO: compiled from: CeaDecoder.java */
    private static final class b extends o implements Comparable<b> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f25782k;

        private b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (j() != bVar.j()) {
                return j() ? 1 : -1;
            }
            long j10 = this.f18059f - bVar.f18059f;
            if (j10 == 0) {
                j10 = this.f25782k - bVar.f25782k;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: CeaDecoder.java */
    static final class c extends p {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private a8.e.a<c> f25783g;

        public c(a8.e.a<c> aVar) {
            this.f25783g = aVar;
        }

        @Override // a8.e
        public final void p() {
            this.f25783g.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f25775a.add(new b());
        }
        this.f25776b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f25776b.add(new c(new a8.e.a() { // from class: t9.d
                @Override // a8.e.a
                public final void a(a8.e eVar) {
                    this.f25774a.p((e.c) eVar);
                }
            }));
        }
        this.f25777c = new ArrayDeque<>();
        this.f25781g = -9223372036854775807L;
    }

    private void o(b bVar) {
        bVar.g();
        this.f25775a.add(bVar);
    }

    @Override // s9.l
    public void b(long j10) {
        this.f25779e = j10;
    }

    @Override // a8.d
    public final void d(long j10) {
        this.f25781g = j10;
    }

    @Override // a8.d
    public void flush() {
        this.f25780f = 0L;
        this.f25779e = 0L;
        while (!this.f25777c.isEmpty()) {
            o((b) l0.i(this.f25777c.poll()));
        }
        b bVar = this.f25778d;
        if (bVar != null) {
            o(bVar);
            this.f25778d = null;
        }
    }

    protected abstract k g();

    protected abstract void h(o oVar);

    @Override // a8.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public o e() throws SubtitleDecoderException {
        x7.a.g(this.f25778d == null);
        if (this.f25775a.isEmpty()) {
            return null;
        }
        b bVarPollFirst = this.f25775a.pollFirst();
        this.f25778d = bVarPollFirst;
        return bVarPollFirst;
    }

    @Override // a8.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public p a() throws SubtitleDecoderException {
        if (this.f25776b.isEmpty()) {
            return null;
        }
        while (!this.f25777c.isEmpty() && ((b) l0.i(this.f25777c.peek())).f18059f <= this.f25779e) {
            b bVar = (b) l0.i(this.f25777c.poll());
            if (bVar.j()) {
                p pVar = (p) l0.i(this.f25776b.pollFirst());
                pVar.e(4);
                o(bVar);
                return pVar;
            }
            h(bVar);
            if (m()) {
                k kVarG = g();
                p pVar2 = (p) l0.i(this.f25776b.pollFirst());
                pVar2.q(bVar.f18059f, kVarG, Long.MAX_VALUE);
                o(bVar);
                return pVar2;
            }
            o(bVar);
        }
        return null;
    }

    protected final p k() {
        return this.f25776b.pollFirst();
    }

    protected final long l() {
        return this.f25779e;
    }

    protected abstract boolean m();

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    @Override // a8.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void c(o oVar) throws SubtitleDecoderException {
        x7.a.a(oVar == this.f25778d);
        b bVar = (b) oVar;
        if (bVar.j()) {
            long j10 = this.f25780f;
            this.f25780f = 1 + j10;
            bVar.f25782k = j10;
            this.f25777c.add(bVar);
        } else {
            long j11 = bVar.f18059f;
            if (j11 != Long.MIN_VALUE) {
                long j12 = this.f25781g;
                if (j12 == -9223372036854775807L || j11 >= j12) {
                    long j13 = this.f25780f;
                    this.f25780f = 1 + j13;
                    bVar.f25782k = j13;
                    this.f25777c.add(bVar);
                } else {
                    o(bVar);
                }
            } else {
                long j14 = this.f25780f;
                this.f25780f = 1 + j14;
                bVar.f25782k = j14;
                this.f25777c.add(bVar);
            }
        }
        this.f25778d = null;
    }

    protected void p(p pVar) {
        pVar.g();
        this.f25776b.add(pVar);
    }

    @Override // a8.d
    public void release() {
    }
}
