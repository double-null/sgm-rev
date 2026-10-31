package io.bidmachine.media3.exoplayer.audio;

/* JADX INFO: compiled from: AudioOffloadSupport.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f18231d = new b().d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18234c;

    /* JADX INFO: compiled from: AudioOffloadSupport.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f18235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f18236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f18237c;

        public d d() {
            if (this.f18235a || !(this.f18236b || this.f18237c)) {
                return new d(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public b e(boolean z10) {
            this.f18235a = z10;
            return this;
        }

        public b f(boolean z10) {
            this.f18236b = z10;
            return this;
        }

        public b g(boolean z10) {
            this.f18237c = z10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f18232a == dVar.f18232a && this.f18233b == dVar.f18233b && this.f18234c == dVar.f18234c;
    }

    public int hashCode() {
        return ((this.f18232a ? 1 : 0) << 2) + ((this.f18233b ? 1 : 0) << 1) + (this.f18234c ? 1 : 0);
    }

    private d(b bVar) {
        this.f18232a = bVar.f18235a;
        this.f18233b = bVar.f18236b;
        this.f18234c = bVar.f18237c;
    }
}
