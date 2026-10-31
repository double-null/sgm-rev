package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.f0;
import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: FragmentManagerViewModel.java */
/* JADX INFO: loaded from: classes2.dex */
final class q extends androidx.lifecycle.c0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final androidx.lifecycle.d0.b f2710k = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f2714g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<String, Fragment> f2711d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<String, q> f2712e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<String, f0> f2713f = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2715h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2716i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f2717j = false;

    /* JADX INFO: compiled from: FragmentManagerViewModel.java */
    /* JADX INFO: loaded from: classes.dex */
    class a implements androidx.lifecycle.d0.b {
        a() {
        }

        @Override // androidx.lifecycle.d0.b
        public <T extends androidx.lifecycle.c0> T b(Class<T> cls) {
            return new q(true);
        }
    }

    q(boolean z10) {
        this.f2714g = z10;
    }

    static q j(f0 f0Var) {
        return (q) new androidx.lifecycle.d0(f0Var, f2710k).a(q.class);
    }

    @Override // androidx.lifecycle.c0
    protected void d() {
        if (n.D0(3)) {
            Log.d(ljglrLUdGZhMhQ.yCD, "onCleared called for " + this);
        }
        this.f2715h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f2711d.equals(qVar.f2711d) && this.f2712e.equals(qVar.f2712e) && this.f2713f.equals(qVar.f2713f);
    }

    void f(Fragment fragment) {
        if (this.f2717j) {
            if (n.D0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f2711d.containsKey(fragment.mWho)) {
                return;
            }
            this.f2711d.put(fragment.mWho, fragment);
            if (n.D0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    void g(Fragment fragment) {
        if (n.D0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        q qVar = this.f2712e.get(fragment.mWho);
        if (qVar != null) {
            qVar.d();
            this.f2712e.remove(fragment.mWho);
        }
        f0 f0Var = this.f2713f.get(fragment.mWho);
        if (f0Var != null) {
            f0Var.a();
            this.f2713f.remove(fragment.mWho);
        }
    }

    Fragment h(String str) {
        return this.f2711d.get(str);
    }

    public int hashCode() {
        return (((this.f2711d.hashCode() * 31) + this.f2712e.hashCode()) * 31) + this.f2713f.hashCode();
    }

    q i(Fragment fragment) {
        q qVar = this.f2712e.get(fragment.mWho);
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this.f2714g);
        this.f2712e.put(fragment.mWho, qVar2);
        return qVar2;
    }

    Collection<Fragment> k() {
        return new ArrayList(this.f2711d.values());
    }

    f0 l(Fragment fragment) {
        f0 f0Var = this.f2713f.get(fragment.mWho);
        if (f0Var != null) {
            return f0Var;
        }
        f0 f0Var2 = new f0();
        this.f2713f.put(fragment.mWho, f0Var2);
        return f0Var2;
    }

    boolean m() {
        return this.f2715h;
    }

    void n(Fragment fragment) {
        if (this.f2717j) {
            if (n.D0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f2711d.remove(fragment.mWho) != null) && n.D0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    void o(boolean z10) {
        this.f2717j = z10;
    }

    boolean p(Fragment fragment) {
        if (this.f2711d.containsKey(fragment.mWho)) {
            return this.f2714g ? this.f2715h : !this.f2716i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f2711d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f2712e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2713f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
