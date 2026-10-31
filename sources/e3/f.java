package e3;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
/* JADX INFO: loaded from: classes4.dex */
final class f extends h0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<h0.d.b> f14181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14182b;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
    static final class b extends h0.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<h0.d.b> f14183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f14184b;

        b() {
        }

        @Override // e3.h0.d.a
        public h0.d a() {
            List<h0.d.b> list = this.f14183a;
            if (list != null) {
                return new f(list, this.f14184b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // e3.h0.d.a
        public h0.d.a b(List<h0.d.b> list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f14183a = list;
            return this;
        }

        @Override // e3.h0.d.a
        public h0.d.a c(String str) {
            this.f14184b = str;
            return this;
        }
    }

    @Override // e3.h0.d
    public List<h0.d.b> b() {
        return this.f14181a;
    }

    @Override // e3.h0.d
    public String c() {
        return this.f14182b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.d)) {
            return false;
        }
        h0.d dVar = (h0.d) obj;
        if (this.f14181a.equals(dVar.b())) {
            String str = this.f14182b;
            if (str == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (str.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f14181a.hashCode() ^ 1000003) * 1000003;
        String str = this.f14182b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f14181a + ", orgId=" + this.f14182b + "}";
    }

    private f(List<h0.d.b> list, String str) {
        this.f14181a = list;
        this.f14182b = str;
    }
}
