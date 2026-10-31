package androidx.fragment.app;

import android.view.ViewGroup;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: compiled from: FragmentTransaction.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f2742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f2743b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f2745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f2746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f2747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f2748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f2749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f2750i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f2752k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f2753l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    CharSequence f2754m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f2755n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    CharSequence f2756o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList<String> f2757p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList<String> f2758q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ArrayList<Runnable> f2760s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ArrayList<a> f2744c = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f2751j = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f2759r = false;

    /* JADX INFO: compiled from: FragmentTransaction.java */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Fragment f2762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2764d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2766f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.lifecycle.f.b f2767g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        androidx.lifecycle.f.b f2768h;

        a() {
        }

        a(int i10, Fragment fragment) {
            this.f2761a = i10;
            this.f2762b = fragment;
            androidx.lifecycle.f.b bVar = androidx.lifecycle.f.b.RESUMED;
            this.f2767g = bVar;
            this.f2768h = bVar;
        }
    }

    v(j jVar, ClassLoader classLoader) {
        this.f2742a = jVar;
        this.f2743b = classLoader;
    }

    public v b(int i10, Fragment fragment, String str) {
        k(i10, fragment, str, 1);
        return this;
    }

    v c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return b(viewGroup.getId(), fragment, str);
    }

    public v d(Fragment fragment, String str) {
        k(0, fragment, str, 1);
        return this;
    }

    void e(a aVar) {
        this.f2744c.add(aVar);
        aVar.f2763c = this.f2745d;
        aVar.f2764d = this.f2746e;
        aVar.f2765e = this.f2747f;
        aVar.f2766f = this.f2748g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public abstract void i();

    public v j() {
        if (this.f2750i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f2751j = false;
        return this;
    }

    void k(int i10, Fragment fragment, String str, int i11) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
            }
            fragment.mFragmentId = i10;
            fragment.mContainerId = i10;
        }
        e(new a(i11, fragment));
    }

    public v l(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public v m(boolean z10) {
        this.f2759r = z10;
        return this;
    }
}
