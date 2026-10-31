package u7;

import java.util.Objects;

/* JADX INFO: compiled from: Label.java */
/* JADX INFO: loaded from: classes4.dex */
public class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f26290c = x7.l0.C0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f26291d = x7.l0.C0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26293b;

    public r(String str, String str2) {
        this.f26292a = x7.l0.V0(str);
        this.f26293b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return Objects.equals(this.f26292a, rVar.f26292a) && Objects.equals(this.f26293b, rVar.f26293b);
    }

    public int hashCode() {
        int iHashCode = this.f26293b.hashCode() * 31;
        String str = this.f26292a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
