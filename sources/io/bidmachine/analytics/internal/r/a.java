package io.bidmachine.analytics.internal.r;

import java.util.Date;
import kotlin.jvm.internal.t;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC0305a f17363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Date f17364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f17365d;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.r.a$a, reason: collision with other inner class name */
    public enum EnumC0305a {
        INAPP_CONSUMABLE,
        INAPP_NON_CONSUMABLE,
        SUBS_AUTO_RENEWABLE,
        SUBS_NON_AUTO_RENEWABLE
    }

    public a(String str, EnumC0305a enumC0305a, Date date, boolean z10) {
        this.f17362a = str;
        this.f17363b = enumC0305a;
        this.f17364c = date;
        this.f17365d = z10;
    }

    public final a a(String str, EnumC0305a enumC0305a, Date date, boolean z10) {
        return new a(str, enumC0305a, date, z10);
    }

    public final EnumC0305a b() {
        return this.f17363b;
    }

    public final boolean c() {
        return this.f17365d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return t.a(this.f17362a, aVar.f17362a) && this.f17363b == aVar.f17363b && t.a(this.f17364c, aVar.f17364c) && this.f17365d == aVar.f17365d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((((this.f17362a.hashCode() * 31) + this.f17363b.hashCode()) * 31) + this.f17364c.hashCode()) * 31;
        boolean z10 = this.f17365d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ a a(a aVar, String str, EnumC0305a enumC0305a, Date date, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f17362a;
        }
        if ((i10 & 2) != 0) {
            enumC0305a = aVar.f17363b;
        }
        if ((i10 & 4) != 0) {
            date = aVar.f17364c;
        }
        if ((i10 & 8) != 0) {
            z10 = aVar.f17365d;
        }
        return aVar.a(str, enumC0305a, date, z10);
    }

    public final Date a() {
        return this.f17364c;
    }
}
