package b4;

/* JADX INFO: compiled from: ApplicationInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public enum v implements q3.f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ bd.a f4033g = bd.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4034a;

    v(int i10) {
        this.f4034a = i10;
    }

    @Override // q3.f
    public int getNumber() {
        return this.f4034a;
    }
}
