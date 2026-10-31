package e5;

import a5.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f14464c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<p> f14465a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<p> f14466b = new ArrayList<>();

    private c() {
    }

    public static c e() {
        return f14464c;
    }

    public Collection<p> a() {
        return Collections.unmodifiableCollection(this.f14466b);
    }

    public void b(p pVar) {
        this.f14465a.add(pVar);
    }

    public Collection<p> c() {
        return Collections.unmodifiableCollection(this.f14465a);
    }

    public void d(p pVar) {
        boolean zG = g();
        this.f14465a.remove(pVar);
        this.f14466b.remove(pVar);
        if (!zG || g()) {
            return;
        }
        i.d().f();
    }

    public void f(p pVar) {
        boolean zG = g();
        this.f14466b.add(pVar);
        if (zG) {
            return;
        }
        i.d().e();
    }

    public boolean g() {
        return this.f14466b.size() > 0;
    }
}
