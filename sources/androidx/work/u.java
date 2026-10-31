package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: WorkInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UUID f3831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f3832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f3833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set<String> f3834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f3835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3836f;

    /* JADX INFO: compiled from: WorkInfo.java */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean b() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public u(UUID uuid, a aVar, e eVar, List<String> list, e eVar2, int i10) {
        this.f3831a = uuid;
        this.f3832b = aVar;
        this.f3833c = eVar;
        this.f3834d = new HashSet(list);
        this.f3835e = eVar2;
        this.f3836f = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f3836f == uVar.f3836f && this.f3831a.equals(uVar.f3831a) && this.f3832b == uVar.f3832b && this.f3833c.equals(uVar.f3833c) && this.f3834d.equals(uVar.f3834d)) {
            return this.f3835e.equals(uVar.f3835e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f3831a.hashCode() * 31) + this.f3832b.hashCode()) * 31) + this.f3833c.hashCode()) * 31) + this.f3834d.hashCode()) * 31) + this.f3835e.hashCode()) * 31) + this.f3836f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f3831a + "', mState=" + this.f3832b + ", mOutputData=" + this.f3833c + ", mTags=" + this.f3834d + ", mProgress=" + this.f3835e + '}';
    }
}
