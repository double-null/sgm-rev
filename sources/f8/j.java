package f8;

import android.net.Uri;
import com.google.common.collect.u;
import java.util.Collections;
import java.util.List;
import u7.q;

/* JADX INFO: compiled from: Representation.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f14716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u<f8.b> f14717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e> f14719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e> f14720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<e> f14721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f14722h;

    /* JADX INFO: compiled from: Representation.java */
    public static class c extends j {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Uri f14724i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f14725j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f14726k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final i f14727l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final m f14728m;

        public c(long j10, q qVar, List<f8.b> list, k.e eVar, List<e> list2, List<e> list3, List<e> list4, String str, long j11) {
            super(j10, qVar, list, eVar, list2, list3, list4);
            this.f14724i = Uri.parse(list.get(0).f14661a);
            i iVarC = eVar.c();
            this.f14727l = iVarC;
            this.f14726k = str;
            this.f14725j = j11;
            this.f14728m = iVarC != null ? null : new m(new i(null, 0L, j11));
        }

        @Override // f8.j
        public String a() {
            return this.f14726k;
        }

        @Override // f8.j
        public e8.e l() {
            return this.f14728m;
        }

        @Override // f8.j
        public i m() {
            return this.f14727l;
        }
    }

    public static j o(long j10, q qVar, List<f8.b> list, k kVar, List<e> list2, List<e> list3, List<e> list4, String str) {
        if (kVar instanceof k.e) {
            return new c(j10, qVar, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j10, qVar, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String a();

    public abstract e8.e l();

    public abstract i m();

    public i n() {
        return this.f14722h;
    }

    private j(long j10, q qVar, List<f8.b> list, k kVar, List<e> list2, List<e> list3, List<e> list4) {
        x7.a.a(!list.isEmpty());
        this.f14715a = j10;
        this.f14716b = qVar;
        this.f14717c = u.B(list);
        this.f14719e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f14720f = list3;
        this.f14721g = list4;
        this.f14722h = kVar.a(this);
        this.f14718d = kVar.b();
    }

    /* JADX INFO: compiled from: Representation.java */
    public static class b extends j implements e8.e {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final k.a f14723i;

        public b(long j10, q qVar, List<f8.b> list, k.a aVar, List<e> list2, List<e> list3, List<e> list4) {
            super(j10, qVar, list, aVar, list2, list3, list4);
            this.f14723i = aVar;
        }

        @Override // f8.j
        public String a() {
            return null;
        }

        @Override // e8.e
        public long b(long j10) {
            return this.f14723i.j(j10);
        }

        @Override // e8.e
        public long c(long j10, long j11) {
            return this.f14723i.h(j10, j11);
        }

        @Override // e8.e
        public long d(long j10, long j11) {
            return this.f14723i.d(j10, j11);
        }

        @Override // e8.e
        public long e(long j10, long j11) {
            return this.f14723i.f(j10, j11);
        }

        @Override // e8.e
        public i f(long j10) {
            return this.f14723i.k(this, j10);
        }

        @Override // e8.e
        public long g(long j10, long j11) {
            return this.f14723i.i(j10, j11);
        }

        @Override // e8.e
        public long h(long j10) {
            return this.f14723i.g(j10);
        }

        @Override // e8.e
        public boolean i() {
            return this.f14723i.l();
        }

        @Override // e8.e
        public long j() {
            return this.f14723i.e();
        }

        @Override // e8.e
        public long k(long j10, long j11) {
            return this.f14723i.c(j10, j11);
        }

        @Override // f8.j
        public i m() {
            return null;
        }

        @Override // f8.j
        public e8.e l() {
            return this;
        }
    }
}
