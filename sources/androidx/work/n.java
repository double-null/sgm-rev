package androidx.work;

/* JADX INFO: compiled from: OneTimeWorkRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class n extends w {
    n(a aVar) {
        super(aVar.f3848b, aVar.f3849c, aVar.f3850d);
    }

    public static n d(Class<? extends ListenableWorker> cls) {
        return new a(cls).b();
    }

    /* JADX INFO: compiled from: OneTimeWorkRequest.java */
    public static final class a extends w.a<a, n> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f3849c.f22081d = OverwritingInputMerger.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.w.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public n c() {
            if (this.f3847a && this.f3849c.f22087j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new n(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.w.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d() {
            return this;
        }
    }
}
