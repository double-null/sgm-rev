package j9;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: ChapterTocFrame.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f20710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i[] f20711f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f20707b = str;
        this.f20708c = z10;
        this.f20709d = z11;
        this.f20710e = strArr;
        this.f20711f = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f20708c == dVar.f20708c && this.f20709d == dVar.f20709d && Objects.equals(this.f20707b, dVar.f20707b) && Arrays.equals(this.f20710e, dVar.f20710e) && Arrays.equals(this.f20711f, dVar.f20711f);
    }

    public int hashCode() {
        int i10 = (((527 + (this.f20708c ? 1 : 0)) * 31) + (this.f20709d ? 1 : 0)) * 31;
        String str = this.f20707b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
