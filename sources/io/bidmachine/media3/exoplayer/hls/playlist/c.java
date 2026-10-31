package io.bidmachine.media3.exoplayer.hls.playlist;

import android.net.Uri;
import com.google.common.collect.u;
import com.google.common.collect.v;
import com.google.common.collect.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import u7.b0;
import u7.l;

/* JADX INFO: compiled from: HlsMediaPlaylist.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends i8.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f18923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f18924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f18926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f18927l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f18928m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f18929n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f18930o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f18931p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f18932q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<f> f18933r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<d> f18934s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map<Uri, e> f18935t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f18936u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h f18937v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final u<C0326c> f18938w;

    /* JADX INFO: renamed from: io.bidmachine.media3.exoplayer.hls.playlist.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    public static final class C0326c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f18944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f18945c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f18946d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f18947e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f18948f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f18949g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<String> f18950h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f18951i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f18952j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f18953k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final u<String> f18954l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final u<String> f18955m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final u<b> f18956n;

        public C0326c(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, List<String> list, boolean z10, long j14, long j15, List<String> list2, List<String> list3, List<b> list4) {
            x7.a.a((uri == null || uri2 == null) && !(uri == null && uri2 == null));
            this.f18943a = str;
            this.f18944b = uri;
            this.f18945c = uri2;
            this.f18946d = j10;
            this.f18947e = j11;
            this.f18948f = j12;
            this.f18949g = j13;
            this.f18950h = list;
            this.f18951i = z10;
            this.f18952j = j14;
            this.f18953k = j15;
            this.f18954l = u.B(list2);
            this.f18955m = u.B(list3);
            this.f18956n = u.B(list4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0326c)) {
                return false;
            }
            C0326c c0326c = (C0326c) obj;
            return this.f18946d == c0326c.f18946d && this.f18947e == c0326c.f18947e && this.f18948f == c0326c.f18948f && this.f18949g == c0326c.f18949g && this.f18951i == c0326c.f18951i && this.f18952j == c0326c.f18952j && this.f18953k == c0326c.f18953k && Objects.equals(this.f18943a, c0326c.f18943a) && Objects.equals(this.f18944b, c0326c.f18944b) && Objects.equals(this.f18945c, c0326c.f18945c) && Objects.equals(this.f18950h, c0326c.f18950h) && Objects.equals(this.f18954l, c0326c.f18954l) && Objects.equals(this.f18955m, c0326c.f18955m) && Objects.equals(this.f18956n, c0326c.f18956n);
        }

        public int hashCode() {
            return Objects.hash(this.f18943a, this.f18944b, this.f18945c, Long.valueOf(this.f18946d), Long.valueOf(this.f18947e), Long.valueOf(this.f18948f), Long.valueOf(this.f18949g), this.f18950h, Boolean.valueOf(this.f18951i), Long.valueOf(this.f18952j), Long.valueOf(this.f18953k), this.f18954l, this.f18955m, this.f18956n);
        }
    }

    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    public static final class d extends g {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f18957l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f18958m;

        public d(String str, f fVar, long j10, int i10, long j11, l lVar, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, fVar, j10, i10, j11, lVar, str2, str3, j12, j13, z10);
            this.f18957l = z11;
            this.f18958m = z12;
        }

        public d b(long j10, int i10) {
            return new d(this.f18964a, this.f18965b, this.f18966c, i10, j10, this.f18969f, this.f18970g, this.f18971h, this.f18972i, this.f18973j, this.f18974k, this.f18957l, this.f18958m);
        }
    }

    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f18959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18961c;

        public e(Uri uri, long j10, int i10) {
            this.f18959a = uri;
            this.f18960b = j10;
            this.f18961c = i10;
        }
    }

    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    public static class g implements Comparable<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f18965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f18966c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f18967d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f18968e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final l f18969f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f18970g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f18971h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f18972i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f18973j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f18974k;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l10) {
            if (this.f18968e > l10.longValue()) {
                return 1;
            }
            return this.f18968e < l10.longValue() ? -1 : 0;
        }

        private g(String str, f fVar, long j10, int i10, long j11, l lVar, String str2, String str3, long j12, long j13, boolean z10) {
            this.f18964a = str;
            this.f18965b = fVar;
            this.f18966c = j10;
            this.f18967d = i10;
            this.f18968e = j11;
            this.f18969f = lVar;
            this.f18970g = str2;
            this.f18971h = str3;
            this.f18972i = j12;
            this.f18973j = j13;
            this.f18974k = z10;
        }
    }

    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f18977c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f18978d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f18979e;

        public h(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f18975a = j10;
            this.f18976b = z10;
            this.f18977c = j11;
            this.f18978d = j12;
            this.f18979e = z11;
        }
    }

    public c(int i10, String str, List<String> list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, l lVar, List<f> list2, List<d> list3, h hVar, Map<Uri, e> map, List<C0326c> list4) {
        super(str, list, z12);
        this.f18919d = i10;
        this.f18923h = j11;
        this.f18922g = z10;
        this.f18924i = z11;
        this.f18925j = i11;
        this.f18926k = j12;
        this.f18927l = i12;
        this.f18928m = j13;
        this.f18929n = j14;
        this.f18930o = z13;
        this.f18931p = z14;
        this.f18932q = lVar;
        this.f18933r = u.B(list2);
        this.f18934s = u.B(list3);
        this.f18935t = v.f(map);
        this.f18938w = u.B(list4);
        if (!list3.isEmpty()) {
            d dVar = (d) y.d(list3);
            this.f18936u = dVar.f18968e + dVar.f18966c;
        } else if (list2.isEmpty()) {
            this.f18936u = 0L;
        } else {
            f fVar = (f) y.d(list2);
            this.f18936u = fVar.f18968e + fVar.f18966c;
        }
        this.f18920e = j10 != -9223372036854775807L ? j10 >= 0 ? Math.min(this.f18936u, j10) : Math.max(0L, this.f18936u + j10) : -9223372036854775807L;
        this.f18921f = j10 >= 0;
        this.f18937v = hVar;
    }

    public c c(long j10, int i10) {
        return new c(this.f18919d, this.f16102a, this.f16103b, this.f18920e, this.f18922g, j10, true, i10, this.f18926k, this.f18927l, this.f18928m, this.f18929n, this.f16104c, this.f18930o, this.f18931p, this.f18932q, this.f18933r, this.f18934s, this.f18937v, this.f18935t, this.f18938w);
    }

    public c d() {
        return this.f18930o ? this : new c(this.f18919d, this.f16102a, this.f16103b, this.f18920e, this.f18922g, this.f18923h, this.f18924i, this.f18925j, this.f18926k, this.f18927l, this.f18928m, this.f18929n, this.f16104c, true, this.f18931p, this.f18932q, this.f18933r, this.f18934s, this.f18937v, this.f18935t, this.f18938w);
    }

    public long e() {
        return this.f18923h + this.f18936u;
    }

    public boolean f(c cVar) {
        if (cVar == null) {
            return true;
        }
        long j10 = this.f18926k;
        long j11 = cVar.f18926k;
        if (j10 > j11) {
            return true;
        }
        if (j10 < j11) {
            return false;
        }
        int size = this.f18933r.size() - cVar.f18933r.size();
        if (size != 0) {
            return size > 0;
        }
        int size2 = this.f18934s.size();
        int size3 = cVar.f18934s.size();
        if (size2 <= size3) {
            return size2 == size3 && this.f18930o && !cVar.f18930o;
        }
        return true;
    }

    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    public static final class f extends g {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f18962l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final List<d> f18963m;

        public f(String str, long j10, long j11, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false, u.H());
        }

        public f b(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.f18963m.size(); i11++) {
                d dVar = this.f18963m.get(i11);
                arrayList.add(dVar.b(j11, i10));
                j11 += dVar.f18966c;
            }
            return new f(this.f18964a, this.f18965b, this.f18962l, this.f18966c, i10, j10, this.f18969f, this.f18970g, this.f18971h, this.f18972i, this.f18973j, this.f18974k, arrayList);
        }

        public f(String str, f fVar, String str2, long j10, int i10, long j11, l lVar, String str3, String str4, long j12, long j13, boolean z10, List<d> list) {
            super(str, fVar, j10, i10, j11, lVar, str3, str4, j12, j13, z10);
            this.f18962l = str2;
            this.f18963m = u.B(list);
        }
    }

    /* JADX INFO: compiled from: HlsMediaPlaylist.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final double f18941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f18942d;

        public b(String str, double d10) {
            this.f18939a = str;
            this.f18940b = 2;
            this.f18941c = d10;
            this.f18942d = null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f18940b == bVar.f18940b && Double.compare(this.f18941c, bVar.f18941c) == 0 && Objects.equals(this.f18939a, bVar.f18939a) && Objects.equals(this.f18942d, bVar.f18942d);
        }

        public int hashCode() {
            return Objects.hash(this.f18939a, Integer.valueOf(this.f18940b), Double.valueOf(this.f18941c), this.f18942d);
        }

        public b(String str, String str2, int i10) {
            boolean z10 = true;
            if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
                z10 = false;
            }
            x7.a.g(z10);
            this.f18939a = str;
            this.f18940b = i10;
            this.f18942d = str2;
            this.f18941c = 0.0d;
        }
    }

    @Override // m8.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c a(List<b0> list) {
        return this;
    }
}
