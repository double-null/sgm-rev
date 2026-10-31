package d9;

import java.util.List;

/* JADX INFO: compiled from: MotionPhotoDescription.java */
/* JADX INFO: loaded from: classes4.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f13428b;

    /* JADX INFO: compiled from: MotionPhotoDescription.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f13429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f13431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f13432d;

        public a(String str, String str2, long j10, long j11) {
            this.f13429a = str;
            this.f13430b = str2;
            this.f13431c = j10;
            this.f13432d = j11;
        }
    }

    public c(long j10, List<a> list) {
        this.f13427a = j10;
        this.f13428b = list;
    }

    public k9.a a(long j10) {
        long j11;
        if (this.f13428b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f13428b.size() - 1; size >= 0; size--) {
            a aVar = this.f13428b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f13429a) | z10;
            if (size == 0) {
                j12 -= aVar.f13432d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f13431c;
            }
            long j17 = j12;
            j12 = j11;
            if (!zEquals || j12 == j17) {
                z10 = zEquals;
            } else {
                j16 = j17 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j17;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new k9.a(j13, j14, this.f13427a, j15, j16);
    }
}
