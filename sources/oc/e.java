package oc;

/* JADX INFO: compiled from: Gender.java */
/* JADX INFO: loaded from: classes5.dex */
public enum e {
    Female("F", 1),
    Male("M", 2),
    Omitted("O", 0);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23363b;

    e(String str, int i10) {
        this.f23362a = str;
        this.f23363b = i10;
    }

    public String c() {
        return this.f23362a;
    }
}
