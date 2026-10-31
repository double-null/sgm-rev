package o7;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: InstallInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f23130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Long f23131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f23132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Long f23133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Boolean f23134g;

    public g() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final Long a() {
        return this.f23131d;
    }

    public final Long b() {
        return this.f23133f;
    }

    public final Long c() {
        return this.f23130c;
    }

    public final Long d() {
        return this.f23132e;
    }

    public final String e() {
        return this.f23128a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return t.a(this.f23128a, gVar.f23128a) && t.a(this.f23129b, gVar.f23129b) && t.a(this.f23130c, gVar.f23130c) && t.a(this.f23131d, gVar.f23131d) && t.a(this.f23132e, gVar.f23132e) && t.a(this.f23133f, gVar.f23133f) && t.a(this.f23134g, gVar.f23134g);
    }

    public final String f() {
        return this.f23129b;
    }

    public final boolean g() {
        Long l10;
        Long l11;
        Long l12;
        Long l13;
        return this.f23128a == null && this.f23129b == null && ((l10 = this.f23130c) == null || (l10 != null && l10.longValue() == 0)) && (((l11 = this.f23131d) == null || (l11 != null && l11.longValue() == 0)) && (((l12 = this.f23132e) == null || (l12 != null && l12.longValue() == 0)) && (((l13 = this.f23133f) == null || (l13 != null && l13.longValue() == 0)) && this.f23134g == null)));
    }

    public final boolean h() {
        Long l10;
        Long l11;
        Long l12;
        Long l13;
        return (this.f23128a == null || this.f23129b == null || (l10 = this.f23130c) == null || (l10 != null && l10.longValue() == 0) || (l11 = this.f23131d) == null || ((l11 != null && l11.longValue() == 0) || (l12 = this.f23132e) == null || ((l12 != null && l12.longValue() == 0) || (l13 = this.f23133f) == null || ((l13 != null && l13.longValue() == 0) || this.f23134g == null)))) ? false : true;
    }

    public int hashCode() {
        String str = this.f23128a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f23129b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.f23130c;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f23131d;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f23132e;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f23133f;
        int iHashCode6 = (iHashCode5 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Boolean bool = this.f23134g;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean i() {
        return this.f23134g;
    }

    public String toString() {
        return "InstallInfo(installReferrerUrl=" + this.f23128a + ", installVersion=" + this.f23129b + ", installReferrerClickSec=" + this.f23130c + ", installBeginSec=" + this.f23131d + ", installReferrerClickServerSec=" + this.f23132e + ", installBeginServerSec=" + this.f23133f + ", isGooglePlayInstant=" + this.f23134g + ')';
    }

    public g(String str, String str2, Long l10, Long l11, Long l12, Long l13, Boolean bool) {
        this.f23128a = str;
        this.f23129b = str2;
        this.f23130c = l10;
        this.f23131d = l11;
        this.f23132e = l12;
        this.f23133f = l13;
        this.f23134g = bool;
    }

    public /* synthetic */ g(String str, String str2, Long l10, Long l11, Long l12, Long l13, Boolean bool, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : l10, (i10 & 8) != 0 ? null : l11, (i10 & 16) != 0 ? null : l12, (i10 & 32) != 0 ? null : l13, (i10 & 64) != 0 ? null : bool);
    }
}
