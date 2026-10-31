package io.bidmachine.analytics.internal.g;

import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f16900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f16902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f16903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f16904g;

    public interface a {

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.g.e$a$a, reason: collision with other inner class name */
        public static final class C0280a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f16905a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f16906b;

            public C0280a(String str, String str2) {
                this.f16905a = str;
                this.f16906b = str2;
            }

            public final String a() {
                return this.f16906b;
            }

            public final String b() {
                return this.f16905a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0280a)) {
                    return false;
                }
                C0280a c0280a = (C0280a) obj;
                return t.a(this.f16905a, c0280a.f16905a) && t.a(this.f16906b, c0280a.f16906b);
            }

            public int hashCode() {
                return (this.f16905a.hashCode() * 31) + this.f16906b.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f16907a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f16908b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f16909c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final boolean f16910d;

            public b(String str, String str2, String str3, boolean z10) {
                this.f16907a = str;
                this.f16908b = str2;
                this.f16909c = str3;
                this.f16910d = z10;
            }

            public final String a() {
                return this.f16908b;
            }

            public final String b() {
                return this.f16909c;
            }

            public final boolean c() {
                return this.f16910d;
            }

            public final String d() {
                return this.f16907a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return t.a(this.f16907a, bVar.f16907a) && t.a(this.f16908b, bVar.f16908b) && t.a(this.f16909c, bVar.f16909c) && this.f16910d == bVar.f16910d;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v7, types: [int] */
            /* JADX WARN: Type inference failed for: r1v6, types: [int] */
            /* JADX WARN: Type inference failed for: r1v7 */
            /* JADX WARN: Type inference failed for: r1v9 */
            public int hashCode() {
                int iHashCode = ((this.f16907a.hashCode() * 31) + this.f16908b.hashCode()) * 31;
                String str = this.f16909c;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                boolean z10 = this.f16910d;
                ?? r10 = z10;
                if (z10) {
                    r10 = 1;
                }
                return iHashCode2 + r10;
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    public e(String str, String str2, long j10, String str3, a aVar, h hVar, boolean z10) {
        this.f16898a = str;
        this.f16899b = str2;
        this.f16900c = j10;
        this.f16901d = str3;
        this.f16902e = aVar;
        this.f16903f = hVar;
        this.f16904g = z10;
    }

    public final e a(String str, String str2, long j10, String str3, a aVar, h hVar, boolean z10) {
        return new e(str, str2, j10, str3, aVar, hVar, z10);
    }

    public final h b() {
        return this.f16903f;
    }

    public final String c() {
        return this.f16898a;
    }

    public final String d() {
        return this.f16899b;
    }

    public final a e() {
        return this.f16902e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return t.a(this.f16898a, eVar.f16898a) && t.a(this.f16899b, eVar.f16899b) && this.f16900c == eVar.f16900c && t.a(this.f16901d, eVar.f16901d) && t.a(this.f16902e, eVar.f16902e) && t.a(this.f16903f, eVar.f16903f) && this.f16904g == eVar.f16904g;
    }

    public final long f() {
        return this.f16900c;
    }

    public final boolean g() {
        return this.f16904g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    public int hashCode() {
        int iHashCode = ((((((((this.f16898a.hashCode() * 31) + this.f16899b.hashCode()) * 31) + Long.hashCode(this.f16900c)) * 31) + this.f16901d.hashCode()) * 31) + this.f16902e.hashCode()) * 31;
        h hVar = this.f16903f;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        boolean z10 = this.f16904g;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode2 + r10;
    }

    public String toString() {
        return "ReaderRecord(id=" + this.f16898a + ", name=" + this.f16899b + ", timestamp=" + this.f16900c + ", dataHash=" + this.f16901d + ", rule=" + this.f16902e + ", error=" + this.f16903f + ", isDirty=" + this.f16904g + ')';
    }

    public final String a() {
        return this.f16901d;
    }

    public /* synthetic */ e(String str, String str2, long j10, String str3, a aVar, h hVar, boolean z10, int i10, k kVar) {
        this((i10 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, j10, str3, aVar, (i10 & 32) != 0 ? null : hVar, (i10 & 64) != 0 ? true : z10);
    }
}
