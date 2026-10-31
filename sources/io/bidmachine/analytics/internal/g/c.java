package io.bidmachine.analytics.internal.g;

import kotlin.jvm.internal.t;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f16887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f16888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f16889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f16890f;

    public c(String str, String str2, long j10, a aVar, float f10, g gVar) {
        this.f16885a = str;
        this.f16886b = str2;
        this.f16887c = j10;
        this.f16888d = aVar;
        this.f16889e = f10;
        this.f16890f = gVar;
    }

    public final a a() {
        return this.f16888d;
    }

    public final String b() {
        return this.f16885a;
    }

    public final long c() {
        return this.f16887c;
    }

    public final float d() {
        return this.f16889e;
    }

    public final g e() {
        return this.f16890f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return t.a(this.f16885a, cVar.f16885a) && t.a(this.f16886b, cVar.f16886b) && this.f16887c == cVar.f16887c && this.f16888d == cVar.f16888d && Float.compare(this.f16889e, cVar.f16889e) == 0 && this.f16890f == cVar.f16890f;
    }

    public final String f() {
        return this.f16886b;
    }

    public int hashCode() {
        return (((((((((this.f16885a.hashCode() * 31) + this.f16886b.hashCode()) * 31) + Long.hashCode(this.f16887c)) * 31) + this.f16888d.hashCode()) * 31) + Float.hashCode(this.f16889e)) * 31) + this.f16890f.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
