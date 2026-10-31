package s5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import o5.o;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f25244c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<o> f25245a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<o> f25246b = new ArrayList<>();

    private c() {
    }

    public static c e() {
        return f25244c;
    }

    public Collection<o> a() {
        return Collections.unmodifiableCollection(this.f25246b);
    }

    public void b(o oVar) {
        this.f25245a.add(oVar);
    }

    public Collection<o> c() {
        return Collections.unmodifiableCollection(this.f25245a);
    }

    public void d(o oVar) {
        boolean zG = g();
        this.f25245a.remove(oVar);
        this.f25246b.remove(oVar);
        if (!zG || g()) {
            return;
        }
        i.d().f();
    }

    public void f(o oVar) {
        boolean zG = g();
        this.f25246b.add(oVar);
        if (zG) {
            return;
        }
        i.d().e();
    }

    public boolean g() {
        return this.f25246b.size() > 0;
    }
}
