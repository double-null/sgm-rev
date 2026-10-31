package b4;

/* JADX INFO: compiled from: SessionEvent.kt */
/* JADX INFO: loaded from: classes4.dex */
public enum j implements q3.f {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ bd.a f3955e = bd.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3956a;

    j(int i10) {
        this.f3956a = i10;
    }

    @Override // q3.f
    public int getNumber() {
        return this.f3956a;
    }
}
