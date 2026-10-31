package i1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: compiled from: NetworkState.java */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f15886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f15887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15889d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f15886a = z10;
        this.f15887b = z11;
        this.f15888c = z12;
        this.f15889d = z13;
    }

    public boolean a() {
        return this.f15886a;
    }

    public boolean b() {
        return this.f15888c;
    }

    public boolean c() {
        return this.f15889d;
    }

    public boolean d() {
        return this.f15887b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15886a == bVar.f15886a && this.f15887b == bVar.f15887b && this.f15888c == bVar.f15888c && this.f15889d == bVar.f15889d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r10 = this.f15886a;
        int i10 = r10;
        if (this.f15887b) {
            i10 = r10 + 16;
        }
        int i11 = i10;
        if (this.f15888c) {
            i11 = i10 + UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        return this.f15889d ? i11 + 4096 : i11;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f15886a), Boolean.valueOf(this.f15887b), Boolean.valueOf(this.f15888c), Boolean.valueOf(this.f15889d));
    }
}
