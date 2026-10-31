package oc;

/* JADX INFO: compiled from: Tag.java */
/* JADX INFO: loaded from: classes5.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f23372b;

    public p(String str) {
        this.f23371a = str;
    }

    public String toString() {
        if (this.f23372b == null) {
            this.f23372b = this.f23371a + " @" + Integer.toHexString(hashCode());
        }
        return this.f23372b;
    }
}
