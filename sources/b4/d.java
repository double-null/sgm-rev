package b4;

/* JADX INFO: compiled from: SessionEvent.kt */
/* JADX INFO: loaded from: classes4.dex */
public enum d implements q3.f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ bd.a f3931i = bd.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3932a;

    d(int i10) {
        this.f3932a = i10;
    }

    @Override // q3.f
    public int getNumber() {
        return this.f3932a;
    }
}
