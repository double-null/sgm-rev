package androidx.work;

import android.app.Notification;

/* JADX INFO: compiled from: ForegroundInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Notification f3669c;

    public g(int i10, Notification notification, int i11) {
        this.f3667a = i10;
        this.f3669c = notification;
        this.f3668b = i11;
    }

    public int a() {
        return this.f3668b;
    }

    public Notification b() {
        return this.f3669c;
    }

    public int c() {
        return this.f3667a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f3667a == gVar.f3667a && this.f3668b == gVar.f3668b) {
            return this.f3669c.equals(gVar.f3669c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f3667a * 31) + this.f3668b) * 31) + this.f3669c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f3667a + ", mForegroundServiceType=" + this.f3668b + ", mNotification=" + this.f3669c + '}';
    }
}
