package k9;

import com.google.common.primitives.h;
import u7.v;

/* JADX INFO: compiled from: MotionPhotoMetadata.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21270e;

    public a(long j10, long j11, long j12, long j13, long j14) {
        this.f21266a = j10;
        this.f21267b = j11;
        this.f21268c = j12;
        this.f21269d = j13;
        this.f21270e = j14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f21266a == aVar.f21266a && this.f21267b == aVar.f21267b && this.f21268c == aVar.f21268c && this.f21269d == aVar.f21269d && this.f21270e == aVar.f21270e;
    }

    public int hashCode() {
        return ((((((((527 + h.a(this.f21266a)) * 31) + h.a(this.f21267b)) * 31) + h.a(this.f21268c)) * 31) + h.a(this.f21269d)) * 31) + h.a(this.f21270e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f21266a + ", photoSize=" + this.f21267b + ", photoPresentationTimestampUs=" + this.f21268c + ", videoStartPosition=" + this.f21269d + ", videoSize=" + this.f21270e;
    }
}
