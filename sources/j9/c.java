package j9;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: ChapterFrame.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i[] f20706g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f20701b = str;
        this.f20702c = i10;
        this.f20703d = i11;
        this.f20704e = j10;
        this.f20705f = j11;
        this.f20706g = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f20702c == cVar.f20702c && this.f20703d == cVar.f20703d && this.f20704e == cVar.f20704e && this.f20705f == cVar.f20705f && Objects.equals(this.f20701b, cVar.f20701b) && Arrays.equals(this.f20706g, cVar.f20706g);
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f20702c) * 31) + this.f20703d) * 31) + ((int) this.f20704e)) * 31) + ((int) this.f20705f)) * 31;
        String str = this.f20701b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
