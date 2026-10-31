package io.bidmachine.analytics.internal.g;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f16915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16916c;

    public enum a {
        UNKNOWN,
        MONITOR_INVALID,
        MONITOR_NO_CONTENT,
        MONITOR_BAD_CONTENT,
        READER_INVALID,
        READER_NO_CONTENT,
        READER_BAD_CONTENT,
        READER_NO_ACCESS
    }

    public h(String str, a aVar, String str2) {
        this.f16914a = str;
        this.f16915b = aVar;
        this.f16916c = str2;
    }

    public final String a() {
        return this.f16914a;
    }

    public final String b() {
        return this.f16916c;
    }

    public final a c() {
        return this.f16915b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return t.a(this.f16914a, hVar.f16914a) && this.f16915b == hVar.f16915b && t.a(this.f16916c, hVar.f16916c);
    }

    public int hashCode() {
        return (((this.f16914a.hashCode() * 31) + this.f16915b.hashCode()) * 31) + this.f16916c.hashCode();
    }

    public String toString() {
        return "TrackerError(name=" + this.f16914a + ", type=" + this.f16915b + ", reason=" + this.f16916c + ')';
    }

    public /* synthetic */ h(String str, a aVar, String str2, int i10, k kVar) {
        this(str, aVar, (i10 & 4) != 0 ? "" : str2);
    }
}
