package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import com.facebook.internal.NativeProtocol;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Random f515a = new Random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, String> f516b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Integer> f517c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, d> f518d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<String> f519e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient Map<String, c<?>> f520f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map<String, Object> f521g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Bundle f522h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    class a<I> extends ActivityResultLauncher<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.a f529c;

        a(String str, int i10, f.a aVar) {
            this.f527a = str;
            this.f528b = i10;
            this.f529c = aVar;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public f.a<I, ?> a() {
            return this.f529c;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public void c(I i10, ActivityOptionsCompat activityOptionsCompat) {
            ActivityResultRegistry.this.f519e.add(this.f527a);
            ActivityResultRegistry.this.f(this.f528b, this.f529c, i10, activityOptionsCompat);
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public void d() {
            ActivityResultRegistry.this.l(this.f527a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    class b<I> extends ActivityResultLauncher<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.a f533c;

        b(String str, int i10, f.a aVar) {
            this.f531a = str;
            this.f532b = i10;
            this.f533c = aVar;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public f.a<I, ?> a() {
            return this.f533c;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public void c(I i10, ActivityOptionsCompat activityOptionsCompat) {
            ActivityResultRegistry.this.f519e.add(this.f531a);
            ActivityResultRegistry.this.f(this.f532b, this.f533c, i10, activityOptionsCompat);
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        public void d() {
            ActivityResultRegistry.this.l(this.f531a);
        }
    }

    private static class c<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.activity.result.b<O> f535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final f.a<?, O> f536b;

        c(androidx.activity.result.b<O> bVar, f.a<?, O> aVar) {
            this.f535a = bVar;
            this.f536b = aVar;
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final f f537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<h> f538b = new ArrayList<>();

        d(f fVar) {
            this.f537a = fVar;
        }

        void a(h hVar) {
            this.f537a.a(hVar);
            this.f538b.add(hVar);
        }

        void b() {
            Iterator<h> it = this.f538b.iterator();
            while (it.hasNext()) {
                this.f537a.c(it.next());
            }
            this.f538b.clear();
        }
    }

    private void a(int i10, String str) {
        this.f516b.put(Integer.valueOf(i10), str);
        this.f517c.put(str, Integer.valueOf(i10));
    }

    private <O> void d(String str, int i10, Intent intent, c<O> cVar) {
        androidx.activity.result.b<O> bVar;
        if (cVar != null && (bVar = cVar.f535a) != null) {
            bVar.onActivityResult(cVar.f536b.parseResult(i10, intent));
        } else {
            this.f521g.remove(str);
            this.f522h.putParcelable(str, new androidx.activity.result.a(i10, intent));
        }
    }

    private int e() {
        int iNextInt = this.f515a.nextInt(2147418112);
        while (true) {
            int i10 = iNextInt + NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
            if (!this.f516b.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            iNextInt = this.f515a.nextInt(2147418112);
        }
    }

    private int k(String str) {
        Integer num = this.f517c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int iE = e();
        a(iE, str);
        return iE;
    }

    public final boolean b(int i10, int i11, Intent intent) {
        String str = this.f516b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        this.f519e.remove(str);
        d(str, i11, intent, this.f520f.get(str));
        return true;
    }

    public final <O> boolean c(int i10, O o10) {
        androidx.activity.result.b<?> bVar;
        String str = this.f516b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        this.f519e.remove(str);
        c<?> cVar = this.f520f.get(str);
        if (cVar != null && (bVar = cVar.f535a) != null) {
            bVar.onActivityResult(o10);
            return true;
        }
        this.f522h.remove(str);
        this.f521g.put(str, o10);
        return true;
    }

    public abstract <I, O> void f(int i10, f.a<I, O> aVar, I i11, ActivityOptionsCompat activityOptionsCompat);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
        }
        this.f519e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f515a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f522h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f516b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f516b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f519e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f522h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f515a);
    }

    public final <I, O> ActivityResultLauncher<I> i(final String str, j jVar, final f.a<I, O> aVar, final androidx.activity.result.b<O> bVar) {
        f lifecycle = jVar.getLifecycle();
        if (lifecycle.b().c(f.b.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + jVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        int iK = k(str);
        d dVar = this.f518d.get(str);
        if (dVar == null) {
            dVar = new d(lifecycle);
        }
        dVar.a(new h() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.h
            public void b(j jVar2, f.a aVar2) {
                if (!f.a.ON_START.equals(aVar2)) {
                    if (f.a.ON_STOP.equals(aVar2)) {
                        ActivityResultRegistry.this.f520f.remove(str);
                        return;
                    } else {
                        if (f.a.ON_DESTROY.equals(aVar2)) {
                            ActivityResultRegistry.this.l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f520f.put(str, new c<>(bVar, aVar));
                if (ActivityResultRegistry.this.f521g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f521g.get(str);
                    ActivityResultRegistry.this.f521g.remove(str);
                    bVar.onActivityResult(obj);
                }
                androidx.activity.result.a aVar3 = (androidx.activity.result.a) ActivityResultRegistry.this.f522h.getParcelable(str);
                if (aVar3 != null) {
                    ActivityResultRegistry.this.f522h.remove(str);
                    bVar.onActivityResult(aVar.parseResult(aVar3.b(), aVar3.a()));
                }
            }
        });
        this.f518d.put(str, dVar);
        return new a(str, iK, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> ActivityResultLauncher<I> j(String str, f.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        int iK = k(str);
        this.f520f.put(str, new c<>(bVar, aVar));
        if (this.f521g.containsKey(str)) {
            Object obj = this.f521g.get(str);
            this.f521g.remove(str);
            bVar.onActivityResult(obj);
        }
        androidx.activity.result.a aVar2 = (androidx.activity.result.a) this.f522h.getParcelable(str);
        if (aVar2 != null) {
            this.f522h.remove(str);
            bVar.onActivityResult(aVar.parseResult(aVar2.b(), aVar2.a()));
        }
        return new b(str, iK, aVar);
    }

    final void l(String str) {
        Integer numRemove;
        if (!this.f519e.contains(str) && (numRemove = this.f517c.remove(str)) != null) {
            this.f516b.remove(numRemove);
        }
        this.f520f.remove(str);
        if (this.f521g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f521g.get(str));
            this.f521g.remove(str);
        }
        if (this.f522h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f522h.getParcelable(str));
            this.f522h.remove(str);
        }
        d dVar = this.f518d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f518d.remove(str);
        }
    }
}
