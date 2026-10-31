package q6;

/* JADX INFO: compiled from: NetworkParamsImpl.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24459b;

    public t(String str, String str2) {
        this.f24458a = str;
        this.f24459b = str2;
    }

    @Override // q6.s
    public String a() {
        return this.f24458a;
    }

    @Override // q6.s
    public String getNetworkName() {
        return this.f24459b;
    }
}
