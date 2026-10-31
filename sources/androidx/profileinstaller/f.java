package androidx.profileinstaller;

/* JADX INFO: compiled from: FileSectionType.java */
/* JADX INFO: loaded from: classes.dex */
enum f {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f3071a;

    f(long j10) {
        this.f3071a = j10;
    }

    public long c() {
        return this.f3071a;
    }
}
