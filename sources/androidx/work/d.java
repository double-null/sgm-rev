package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: ContentUriTriggers.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<a> f3655a = new HashSet();

    /* JADX INFO: compiled from: ContentUriTriggers.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f3656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f3657b;

        a(Uri uri, boolean z10) {
            this.f3656a = uri;
            this.f3657b = z10;
        }

        public Uri a() {
            return this.f3656a;
        }

        public boolean b() {
            return this.f3657b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3657b == aVar.f3657b && this.f3656a.equals(aVar.f3656a);
        }

        public int hashCode() {
            return (this.f3656a.hashCode() * 31) + (this.f3657b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z10) {
        this.f3655a.add(new a(uri, z10));
    }

    public Set<a> b() {
        return this.f3655a;
    }

    public int c() {
        return this.f3655a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f3655a.equals(((d) obj).f3655a);
    }

    public int hashCode() {
        return this.f3655a.hashCode();
    }
}
