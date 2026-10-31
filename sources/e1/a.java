package e1;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: ApiFeature.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements e1.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<a> f13869c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13871b;

    /* JADX INFO: renamed from: e1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ApiFeature.java */
    private static class C0193a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Set<String> f13872a = new HashSet(Arrays.asList(t.c().a()));
    }

    /* JADX INFO: compiled from: ApiFeature.java */
    public static class b extends a {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // e1.a
        public final boolean b() {
            return true;
        }
    }

    /* JADX INFO: compiled from: ApiFeature.java */
    public static class c extends a {
        c(String str, String str2) {
            super(str, str2);
        }

        @Override // e1.a
        public final boolean b() {
            return true;
        }
    }

    /* JADX INFO: compiled from: ApiFeature.java */
    public static class d extends a {
        d(String str, String str2) {
            super(str, str2);
        }

        @Override // e1.a
        public final boolean b() {
            return false;
        }
    }

    /* JADX INFO: compiled from: ApiFeature.java */
    public static class e extends a {
        e(String str, String str2) {
            super(str, str2);
        }

        @Override // e1.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* JADX INFO: compiled from: ApiFeature.java */
    public static class f extends a {
        f(String str, String str2) {
            super(str, str2);
        }

        @Override // e1.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* JADX INFO: compiled from: ApiFeature.java */
    public static class g extends a {
        g(String str, String str2) {
            super(str, str2);
        }

        @Override // e1.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* JADX INFO: compiled from: ApiFeature.java */
    public static class h extends a {
        h(String str, String str2) {
            super(str, str2);
        }

        @Override // e1.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* JADX INFO: compiled from: ApiFeature.java */
    public static class i extends a {
        i(String str, String str2) {
            super(str, str2);
        }

        @Override // e1.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    a(String str, String str2) {
        this.f13870a = str;
        this.f13871b = str2;
        f13869c.add(this);
    }

    public static Set<a> d() {
        return Collections.unmodifiableSet(f13869c);
    }

    @Override // e1.h
    public String a() {
        return this.f13870a;
    }

    public abstract boolean b();

    public boolean c() {
        return cf.a.b(C0193a.f13872a, this.f13871b);
    }

    @Override // e1.h
    public boolean isSupported() {
        return b() || c();
    }
}
