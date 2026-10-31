package u7;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: MediaItem.java */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s f26294i = new c().a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f26295j = x7.l0.C0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f26296k = x7.l0.C0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f26297l = x7.l0.C0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f26298m = x7.l0.C0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f26299n = x7.l0.C0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f26300o = x7.l0.C0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f26302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final h f26303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f26304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f26305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f26306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public final e f26307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f26308h;

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class b {
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f26309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f26310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f26311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d.a f26312d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f.a f26313e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<b0> f26314f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f26315g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.google.common.collect.u<k> f26316h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Object f26317i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f26318j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private u f26319k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private g.a f26320l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private i f26321m;

        public s a() {
            h hVar;
            x7.a.g(this.f26313e.f26363b == null || this.f26313e.f26362a != null);
            Uri uri = this.f26310b;
            if (uri != null) {
                hVar = new h(uri, this.f26311c, this.f26313e.f26362a != null ? this.f26313e.i() : null, null, this.f26314f, this.f26315g, this.f26316h, this.f26317i, this.f26318j);
            } else {
                hVar = null;
            }
            String str = this.f26309a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarG = this.f26312d.g();
            g gVarF = this.f26320l.f();
            u uVar = this.f26319k;
            if (uVar == null) {
                uVar = u.I;
            }
            return new s(str2, eVarG, hVar, gVarF, uVar, this.f26321m);
        }

        public c b(g gVar) {
            this.f26320l = gVar.a();
            return this;
        }

        public c c(String str) {
            this.f26309a = (String) x7.a.e(str);
            return this;
        }

        public c d(List<k> list) {
            this.f26316h = com.google.common.collect.u.B(list);
            return this;
        }

        public c e(Object obj) {
            this.f26317i = obj;
            return this;
        }

        public c f(Uri uri) {
            this.f26310b = uri;
            return this;
        }

        public c g(String str) {
            return f(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.f26312d = new d.a();
            this.f26313e = new f.a();
            this.f26314f = Collections.emptyList();
            this.f26316h = com.google.common.collect.u.H();
            this.f26320l = new g.a();
            this.f26321m = i.f26403d;
            this.f26318j = -9223372036854775807L;
        }

        private c(s sVar) {
            f.a aVar;
            this();
            this.f26312d = sVar.f26306f.a();
            this.f26309a = sVar.f26301a;
            this.f26319k = sVar.f26305e;
            this.f26320l = sVar.f26304d.a();
            this.f26321m = sVar.f26308h;
            h hVar = sVar.f26302b;
            if (hVar != null) {
                this.f26315g = hVar.f26398e;
                this.f26311c = hVar.f26395b;
                this.f26310b = hVar.f26394a;
                this.f26314f = hVar.f26397d;
                this.f26316h = hVar.f26399f;
                this.f26317i = hVar.f26401h;
                f fVar = hVar.f26396c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f26313e = aVar;
                this.f26318j = hVar.f26402i;
            }
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static class d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final d f26322h = new a().f();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f26323i = x7.l0.C0(0);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f26324j = x7.l0.C0(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f26325k = x7.l0.C0(2);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f26326l = x7.l0.C0(3);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f26327m = x7.l0.C0(4);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final String f26328n = x7.l0.C0(5);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final String f26329o = x7.l0.C0(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f26330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f26331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f26332c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f26333d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f26334e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f26335f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f26336g;

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f26337a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f26338b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f26339c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f26340d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f26341e;

            public d f() {
                return new d(this);
            }

            @Deprecated
            public e g() {
                return new e(this);
            }

            public a() {
                this.f26338b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f26337a = dVar.f26331b;
                this.f26338b = dVar.f26333d;
                this.f26339c = dVar.f26334e;
                this.f26340d = dVar.f26335f;
                this.f26341e = dVar.f26336g;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f26331b == dVar.f26331b && this.f26333d == dVar.f26333d && this.f26334e == dVar.f26334e && this.f26335f == dVar.f26335f && this.f26336g == dVar.f26336g;
        }

        public int hashCode() {
            long j10 = this.f26331b;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f26333d;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f26334e ? 1 : 0)) * 31) + (this.f26335f ? 1 : 0)) * 31) + (this.f26336g ? 1 : 0);
        }

        private d(a aVar) {
            this.f26330a = x7.l0.t1(aVar.f26337a);
            this.f26332c = x7.l0.t1(aVar.f26338b);
            this.f26331b = aVar.f26337a;
            this.f26333d = aVar.f26338b;
            this.f26334e = aVar.f26339c;
            this.f26335f = aVar.f26340d;
            this.f26336g = aVar.f26341e;
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    @Deprecated
    public static final class e extends d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final e f26342p = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f26343l = x7.l0.C0(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f26344m = x7.l0.C0(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f26345n = x7.l0.C0(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f26346o = x7.l0.C0(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final String f26347p = x7.l0.C0(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f26348q = x7.l0.C0(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f26349r = x7.l0.C0(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f26350s = x7.l0.C0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f26351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public final UUID f26352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f26353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public final com.google.common.collect.v<String, String> f26354d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final com.google.common.collect.v<String, String> f26355e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f26356f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f26357g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f26358h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public final com.google.common.collect.u<Integer> f26359i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final com.google.common.collect.u<Integer> f26360j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final byte[] f26361k;

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f26361k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f26351a.equals(fVar.f26351a) && Objects.equals(this.f26353c, fVar.f26353c) && Objects.equals(this.f26355e, fVar.f26355e) && this.f26356f == fVar.f26356f && this.f26358h == fVar.f26358h && this.f26357g == fVar.f26357g && this.f26360j.equals(fVar.f26360j) && Arrays.equals(this.f26361k, fVar.f26361k);
        }

        public int hashCode() {
            int iHashCode = this.f26351a.hashCode() * 31;
            Uri uri = this.f26353c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f26355e.hashCode()) * 31) + (this.f26356f ? 1 : 0)) * 31) + (this.f26358h ? 1 : 0)) * 31) + (this.f26357g ? 1 : 0)) * 31) + this.f26360j.hashCode()) * 31) + Arrays.hashCode(this.f26361k);
        }

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private UUID f26362a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Uri f26363b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private com.google.common.collect.v<String, String> f26364c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f26365d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f26366e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f26367f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private com.google.common.collect.u<Integer> f26368g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private byte[] f26369h;

            public f i() {
                return new f(this);
            }

            @Deprecated
            private a() {
                this.f26364c = com.google.common.collect.v.t();
                this.f26366e = true;
                this.f26368g = com.google.common.collect.u.H();
            }

            private a(f fVar) {
                this.f26362a = fVar.f26351a;
                this.f26363b = fVar.f26353c;
                this.f26364c = fVar.f26355e;
                this.f26365d = fVar.f26356f;
                this.f26366e = fVar.f26357g;
                this.f26367f = fVar.f26358h;
                this.f26368g = fVar.f26360j;
                this.f26369h = fVar.f26361k;
            }
        }

        private f(a aVar) {
            x7.a.g((aVar.f26367f && aVar.f26363b == null) ? false : true);
            UUID uuid = (UUID) x7.a.e(aVar.f26362a);
            this.f26351a = uuid;
            this.f26352b = uuid;
            this.f26353c = aVar.f26363b;
            this.f26354d = aVar.f26364c;
            this.f26355e = aVar.f26364c;
            this.f26356f = aVar.f26365d;
            this.f26358h = aVar.f26367f;
            this.f26357g = aVar.f26366e;
            this.f26359i = aVar.f26368g;
            this.f26360j = aVar.f26368g;
            this.f26361k = aVar.f26369h != null ? Arrays.copyOf(aVar.f26369h, aVar.f26369h.length) : null;
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f26370f = new a().f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f26371g = x7.l0.C0(0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f26372h = x7.l0.C0(1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f26373i = x7.l0.C0(2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f26374j = x7.l0.C0(3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f26375k = x7.l0.C0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f26376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f26377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f26378c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f26379d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f26380e;

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f26381a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f26382b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f26383c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private float f26384d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private float f26385e;

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f26383c = j10;
                return this;
            }

            public a h(float f10) {
                this.f26385e = f10;
                return this;
            }

            public a i(long j10) {
                this.f26382b = j10;
                return this;
            }

            public a j(float f10) {
                this.f26384d = f10;
                return this;
            }

            public a k(long j10) {
                this.f26381a = j10;
                return this;
            }

            public a() {
                this.f26381a = -9223372036854775807L;
                this.f26382b = -9223372036854775807L;
                this.f26383c = -9223372036854775807L;
                this.f26384d = -3.4028235E38f;
                this.f26385e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f26381a = gVar.f26376a;
                this.f26382b = gVar.f26377b;
                this.f26383c = gVar.f26378c;
                this.f26384d = gVar.f26379d;
                this.f26385e = gVar.f26380e;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f26376a == gVar.f26376a && this.f26377b == gVar.f26377b && this.f26378c == gVar.f26378c && this.f26379d == gVar.f26379d && this.f26380e == gVar.f26380e;
        }

        public int hashCode() {
            long j10 = this.f26376a;
            long j11 = this.f26377b;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f26378c;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f26379d;
            int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f26380e;
            return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }

        private g(a aVar) {
            this(aVar.f26381a, aVar.f26382b, aVar.f26383c, aVar.f26384d, aVar.f26385e);
        }

        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f26376a = j10;
            this.f26377b = j11;
            this.f26378c = j12;
            this.f26379d = f10;
            this.f26380e = f11;
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class h {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f26386j = x7.l0.C0(0);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f26387k = x7.l0.C0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f26388l = x7.l0.C0(2);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f26389m = x7.l0.C0(3);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f26390n = x7.l0.C0(4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f26391o = x7.l0.C0(5);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f26392p = x7.l0.C0(6);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f26393q = x7.l0.C0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f26394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f26395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f26396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<b0> f26397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f26398e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final com.google.common.collect.u<k> f26399f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Deprecated
        public final List<j> f26400g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f26401h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f26402i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f26394a.equals(hVar.f26394a) && Objects.equals(this.f26395b, hVar.f26395b) && Objects.equals(this.f26396c, hVar.f26396c) && this.f26397d.equals(hVar.f26397d) && Objects.equals(this.f26398e, hVar.f26398e) && this.f26399f.equals(hVar.f26399f) && Objects.equals(this.f26401h, hVar.f26401h) && this.f26402i == hVar.f26402i;
        }

        public int hashCode() {
            int iHashCode = this.f26394a.hashCode() * 31;
            String str = this.f26395b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f26396c;
            int iHashCode3 = (((((iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + 0) * 31) + this.f26397d.hashCode()) * 31;
            String str2 = this.f26398e;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f26399f.hashCode()) * 31;
            Object obj = this.f26401h;
            return (int) ((((long) (iHashCode4 + (obj != null ? obj.hashCode() : 0))) * 31) + this.f26402i);
        }

        private h(Uri uri, String str, f fVar, b bVar, List<b0> list, String str2, com.google.common.collect.u<k> uVar, Object obj, long j10) {
            this.f26394a = uri;
            this.f26395b = w.u(str);
            this.f26396c = fVar;
            this.f26397d = list;
            this.f26398e = str2;
            this.f26399f = uVar;
            com.google.common.collect.u.a aVarV = com.google.common.collect.u.v();
            for (int i10 = 0; i10 < uVar.size(); i10++) {
                aVarV.a(uVar.get(i10).a().i());
            }
            this.f26400g = aVarV.m();
            this.f26401h = obj;
            this.f26402i = j10;
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f26403d = new a().d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f26404e = x7.l0.C0(0);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f26405f = x7.l0.C0(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f26406g = x7.l0.C0(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f26407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f26408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f26409c;

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f26410a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f26411b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Bundle f26412c;

            public i d() {
                return new i(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Objects.equals(this.f26407a, iVar.f26407a) && Objects.equals(this.f26408b, iVar.f26408b)) {
                if ((this.f26409c == null) == (iVar.f26409c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f26407a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f26408b;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f26409c != null ? 1 : 0);
        }

        private i(a aVar) {
            this.f26407a = aVar.f26410a;
            this.f26408b = aVar.f26411b;
            this.f26409c = aVar.f26412c;
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    @Deprecated
    public static final class j extends k {
        private j(k.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static class k {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f26413h = x7.l0.C0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f26414i = x7.l0.C0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f26415j = x7.l0.C0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f26416k = x7.l0.C0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f26417l = x7.l0.C0(4);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f26418m = x7.l0.C0(5);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f26419n = x7.l0.C0(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f26420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f26421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f26422c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f26423d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f26424e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f26425f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f26426g;

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f26427a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f26428b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f26429c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f26430d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f26431e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private String f26432f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f26433g;

            /* JADX INFO: Access modifiers changed from: private */
            public j i() {
                return new j(this);
            }

            private a(k kVar) {
                this.f26427a = kVar.f26420a;
                this.f26428b = kVar.f26421b;
                this.f26429c = kVar.f26422c;
                this.f26430d = kVar.f26423d;
                this.f26431e = kVar.f26424e;
                this.f26432f = kVar.f26425f;
                this.f26433g = kVar.f26426g;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f26420a.equals(kVar.f26420a) && Objects.equals(this.f26421b, kVar.f26421b) && Objects.equals(this.f26422c, kVar.f26422c) && this.f26423d == kVar.f26423d && this.f26424e == kVar.f26424e && Objects.equals(this.f26425f, kVar.f26425f) && Objects.equals(this.f26426g, kVar.f26426g);
        }

        public int hashCode() {
            int iHashCode = this.f26420a.hashCode() * 31;
            String str = this.f26421b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f26422c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f26423d) * 31) + this.f26424e) * 31;
            String str3 = this.f26425f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f26426g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        private k(a aVar) {
            this.f26420a = aVar.f26427a;
            this.f26421b = aVar.f26428b;
            this.f26422c = aVar.f26429c;
            this.f26423d = aVar.f26430d;
            this.f26424e = aVar.f26431e;
            this.f26425f = aVar.f26432f;
            this.f26426g = aVar.f26433g;
        }
    }

    public static s b(String str) {
        return new c().g(str).a();
    }

    public c a() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Objects.equals(this.f26301a, sVar.f26301a) && this.f26306f.equals(sVar.f26306f) && Objects.equals(this.f26302b, sVar.f26302b) && Objects.equals(this.f26304d, sVar.f26304d) && Objects.equals(this.f26305e, sVar.f26305e) && Objects.equals(this.f26308h, sVar.f26308h);
    }

    public int hashCode() {
        int iHashCode = this.f26301a.hashCode() * 31;
        h hVar = this.f26302b;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f26304d.hashCode()) * 31) + this.f26306f.hashCode()) * 31) + this.f26305e.hashCode()) * 31) + this.f26308h.hashCode();
    }

    private s(String str, e eVar, h hVar, g gVar, u uVar, i iVar) {
        this.f26301a = str;
        this.f26302b = hVar;
        this.f26303c = hVar;
        this.f26304d = gVar;
        this.f26305e = uVar;
        this.f26306f = eVar;
        this.f26307g = eVar;
        this.f26308h = iVar;
    }
}
