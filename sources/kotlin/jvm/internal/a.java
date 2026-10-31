package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: AdaptedFunctionReference.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements o, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f21498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f21499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f21502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f21503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21504g;

    public a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f21498a = obj;
        this.f21499b = cls;
        this.f21500c = str;
        this.f21501d = str2;
        this.f21502e = (i11 & 1) == 1;
        this.f21503f = i10;
        this.f21504g = i11 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f21502e == aVar.f21502e && this.f21503f == aVar.f21503f && this.f21504g == aVar.f21504g && t.a(this.f21498a, aVar.f21498a) && t.a(this.f21499b, aVar.f21499b) && this.f21500c.equals(aVar.f21500c) && this.f21501d.equals(aVar.f21501d);
    }

    @Override // kotlin.jvm.internal.o
    public int getArity() {
        return this.f21503f;
    }

    public int hashCode() {
        Object obj = this.f21498a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f21499b;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f21500c.hashCode()) * 31) + this.f21501d.hashCode()) * 31) + (this.f21502e ? 1231 : 1237)) * 31) + this.f21503f) * 31) + this.f21504g;
    }

    public String toString() {
        return i0.h(this);
    }
}
