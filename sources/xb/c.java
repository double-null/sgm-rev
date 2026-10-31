package xb;

import java.io.File;
import java.util.Date;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: MediaFileMetadata.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f28395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f28397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f28398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f28399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f28400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Date f28401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Date f28402h;

    public /* synthetic */ c(File file, String str, long j10, long j11, long j12, long j13, Date date, Date date2, k kVar) {
        this(file, str, j10, j11, j12, j13, date, date2);
    }

    public final c a(File file, String mimeType, long j10, long j11, long j12, long j13, Date lastUsedTime, Date createdAt) {
        t.f(file, "file");
        t.f(mimeType, "mimeType");
        t.f(lastUsedTime, "lastUsedTime");
        t.f(createdAt, "createdAt");
        return new c(file, mimeType, j10, j11, j12, j13, lastUsedTime, createdAt, null);
    }

    public final Date c() {
        return this.f28402h;
    }

    public final long d() {
        return this.f28400f;
    }

    public final File e() {
        return this.f28395a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return t.a(this.f28395a, cVar.f28395a) && t.a(this.f28396b, cVar.f28396b) && this.f28397c == cVar.f28397c && this.f28398d == cVar.f28398d && sd.a.k(this.f28399e, cVar.f28399e) && sd.a.k(this.f28400f, cVar.f28400f) && t.a(this.f28401g, cVar.f28401g) && t.a(this.f28402h, cVar.f28402h);
    }

    public final Date f() {
        return this.f28401g;
    }

    public final String g() {
        return this.f28396b;
    }

    public final long h() {
        return this.f28399e;
    }

    public int hashCode() {
        return (((((((((((((this.f28395a.hashCode() * 31) + this.f28396b.hashCode()) * 31) + Long.hashCode(this.f28397c)) * 31) + Long.hashCode(this.f28398d)) * 31) + sd.a.x(this.f28399e)) * 31) + sd.a.x(this.f28400f)) * 31) + this.f28401g.hashCode()) * 31) + this.f28402h.hashCode();
    }

    public final long i() {
        return this.f28397c;
    }

    public final long j() {
        return this.f28398d;
    }

    public String toString() {
        return "MediaFileMetadata(file=" + this.f28395a + ", mimeType=" + this.f28396b + ", sizeBytes=" + this.f28397c + ", usageFrequency=" + this.f28398d + ", pingTime=" + ((Object) sd.a.H(this.f28399e)) + ", downloadTime=" + ((Object) sd.a.H(this.f28400f)) + ", lastUsedTime=" + this.f28401g + ", createdAt=" + this.f28402h + ')';
    }

    private c(File file, String str, long j10, long j11, long j12, long j13, Date date, Date date2) {
        this.f28395a = file;
        this.f28396b = str;
        this.f28397c = j10;
        this.f28398d = j11;
        this.f28399e = j12;
        this.f28400f = j13;
        this.f28401g = date;
        this.f28402h = date2;
    }
}
