package y7;

import u7.v;

/* JADX INFO: compiled from: Mp4TimestampData.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f28693c;

    public e(long j10, long j11, long j12) {
        this.f28691a = j10;
        this.f28692b = j11;
        this.f28693c = j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f28691a == eVar.f28691a && this.f28692b == eVar.f28692b && this.f28693c == eVar.f28693c;
    }

    public int hashCode() {
        return ((((527 + com.google.common.primitives.h.a(this.f28691a)) * 31) + com.google.common.primitives.h.a(this.f28692b)) * 31) + com.google.common.primitives.h.a(this.f28693c);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f28691a + ", modification time=" + this.f28692b + ", timescale=" + this.f28693c;
    }
}
