package io.bidmachine.analytics.internal.p;

import java.text.ParseException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import rd.l;
import rd.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0297a f17173c = new C0297a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f17174a = new o("^(\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3}) ([A-Z])\\/(\\S+)\\(\\s*(\\d+)\\): (.*)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f17175b = new i();

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p.a$a, reason: collision with other inner class name */
    public static final class C0297a {
        public /* synthetic */ C0297a(k kVar) {
            this();
        }

        private C0297a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f17176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f17177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f17178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f17179d;

        public b(long j10, String str, String str2, String str3) {
            this.f17176a = j10;
            this.f17177b = str;
            this.f17178c = str2;
            this.f17179d = str3;
        }

        public final String a() {
            return this.f17178c;
        }

        public final String b() {
            return this.f17179d;
        }

        public final String c() {
            return this.f17177b;
        }

        public final long d() {
            return this.f17176a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f17176a == bVar.f17176a && t.a(this.f17177b, bVar.f17177b) && t.a(this.f17178c, bVar.f17178c) && t.a(this.f17179d, bVar.f17179d);
        }

        public int hashCode() {
            return (((((Long.hashCode(this.f17176a) * 31) + this.f17177b.hashCode()) * 31) + this.f17178c.hashCode()) * 31) + this.f17179d.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final b a(String str) throws ParseException {
        l lVarC = o.c(this.f17174a, str, 0, 2, null);
        if (lVarC == null) {
            return null;
        }
        l.b bVarA = lVarC.a();
        String str2 = bVarA.a().b().get(1);
        String str3 = bVarA.a().b().get(2);
        String str4 = bVarA.a().b().get(3);
        String str5 = bVarA.a().b().get(5);
        Long lA = this.f17175b.a(str2);
        return new b(lA != null ? lA.longValue() : 0L, str4, str3, str5);
    }
}
