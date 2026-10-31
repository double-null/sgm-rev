package e2;

import android.content.Context;

/* JADX INFO: compiled from: AutoValue_CreationContext.java */
/* JADX INFO: loaded from: classes3.dex */
final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n2.a f13932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n2.a f13933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f13934d;

    c(Context context, n2.a aVar, n2.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f13931a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f13932b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f13933c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f13934d = str;
    }

    @Override // e2.h
    public Context b() {
        return this.f13931a;
    }

    @Override // e2.h
    public String c() {
        return this.f13934d;
    }

    @Override // e2.h
    public n2.a d() {
        return this.f13933c;
    }

    @Override // e2.h
    public n2.a e() {
        return this.f13932b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f13931a.equals(hVar.b()) && this.f13932b.equals(hVar.e()) && this.f13933c.equals(hVar.d()) && this.f13934d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.f13931a.hashCode() ^ 1000003) * 1000003) ^ this.f13932b.hashCode()) * 1000003) ^ this.f13933c.hashCode()) * 1000003) ^ this.f13934d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f13931a + ", wallClock=" + this.f13932b + ", monotonicClock=" + this.f13933c + ", backendName=" + this.f13934d + "}";
    }
}
