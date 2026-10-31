package com.google.firebase.components;

import android.util.Log;
import com.applovin.impl.sdk.i0;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import x2.m;
import x2.n;
import x2.o;

/* JADX INFO: loaded from: classes4.dex */
public class ComponentRuntime implements x2.d, n3.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Provider<Set<Object>> f11918i = new Provider() { // from class: x2.j
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<x2.c<?>, Provider<?>> f11919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<o<?>, Provider<?>> f11920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<o<?>, f<?>> f11921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Provider<ComponentRegistrar>> f11922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set<String> f11923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f11924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference<Boolean> f11925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final x2.i f11926h;

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List<x2.c<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<Provider<ComponentRegistrar>> it = this.f11922d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f11926h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator<x2.c<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                for (Object obj : it2.next().j().toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f11923e.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f11923e.add(obj.toString());
                    }
                }
            }
            if (this.f11919a.isEmpty()) {
                c.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f11919a.keySet());
                arrayList2.addAll(list);
                c.a(arrayList2);
            }
            for (final x2.c<?> cVar : list) {
                this.f11919a.put(cVar, new Lazy(new Provider() { // from class: x2.k
                    @Override // com.google.firebase.inject.Provider
                    public final Object get() {
                        return this.f27967a.s(cVar);
                    }
                }));
            }
            arrayList.addAll(x(list));
            arrayList.addAll(y());
            w();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        v();
    }

    private void o(Map<x2.c<?>, Provider<?>> map, boolean z10) {
        for (Map.Entry<x2.c<?>, Provider<?>> entry : map.entrySet()) {
            x2.c<?> key = entry.getKey();
            Provider<?> value = entry.getValue();
            if (key.n() || (key.o() && z10)) {
                value.get();
            }
        }
        this.f11924f.d();
    }

    private static <T> List<T> r(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(x2.c cVar) {
        return cVar.h().create(new k(cVar, this));
    }

    private void v() {
        Boolean bool = this.f11925g.get();
        if (bool != null) {
            o(this.f11919a, bool.booleanValue());
        }
    }

    private void w() {
        for (x2.c<?> cVar : this.f11919a.keySet()) {
            for (m mVar : cVar.g()) {
                if (mVar.g() && !this.f11921c.containsKey(mVar.c())) {
                    this.f11921c.put(mVar.c(), f.b(Collections.emptySet()));
                } else if (this.f11920b.containsKey(mVar.c())) {
                    continue;
                } else {
                    if (mVar.f()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", cVar, mVar.c()));
                    }
                    if (!mVar.g()) {
                        this.f11920b.put(mVar.c(), j.e());
                    }
                }
            }
        }
    }

    private List<Runnable> x(List<x2.c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (x2.c<?> cVar : list) {
            if (cVar.p()) {
                final Provider<?> provider = this.f11919a.get(cVar);
                for (o<? super Object> oVar : cVar.j()) {
                    if (this.f11920b.containsKey(oVar)) {
                        final j jVar = (j) this.f11920b.get(oVar);
                        arrayList.add(new Runnable() { // from class: com.google.firebase.components.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                jVar.j(provider);
                            }
                        });
                    } else {
                        this.f11920b.put(oVar, provider);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> y() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<x2.c<?>, Provider<?>> entry : this.f11919a.entrySet()) {
            x2.c<?> key = entry.getKey();
            if (!key.p()) {
                Provider<?> value = entry.getValue();
                for (o<? super Object> oVar : key.j()) {
                    if (!map.containsKey(oVar)) {
                        map.put(oVar, new HashSet());
                    }
                    ((Set) map.get(oVar)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f11921c.containsKey(entry2.getKey())) {
                final f<?> fVar = this.f11921c.get(entry2.getKey());
                for (final Provider provider : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.google.firebase.components.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            fVar.a(provider);
                        }
                    });
                }
            } else {
                this.f11921c.put((o) entry2.getKey(), f.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // x2.d
    public <T> Deferred<T> c(o<T> oVar) {
        Provider<T> providerE = e(oVar);
        if (providerE == null) {
            return j.e();
        }
        return providerE instanceof j ? (j) providerE : j.i(providerE);
    }

    @Override // x2.d
    public synchronized <T> Provider<T> e(o<T> oVar) {
        n.c(oVar, "Null interface requested.");
        return (Provider) this.f11920b.get(oVar);
    }

    @Override // x2.d
    public synchronized <T> Provider<Set<T>> i(o<T> oVar) {
        f<?> fVar = this.f11921c.get(oVar);
        if (fVar != null) {
            return fVar;
        }
        return (Provider<Set<T>>) f11918i;
    }

    public void p() {
        Iterator<Provider<?>> it = this.f11919a.values().iterator();
        while (it.hasNext()) {
            it.next().get();
        }
    }

    public void q(boolean z10) {
        HashMap map;
        if (i0.a(this.f11925g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                map = new HashMap(this.f11919a);
            }
            o(map, z10);
        }
    }

    private ComponentRuntime(Executor executor, Iterable<Provider<ComponentRegistrar>> iterable, Collection<x2.c<?>> collection, x2.i iVar) {
        this.f11919a = new HashMap();
        this.f11920b = new HashMap();
        this.f11921c = new HashMap();
        this.f11923e = new HashSet();
        this.f11925g = new AtomicReference<>();
        e eVar = new e(executor);
        this.f11924f = eVar;
        this.f11926h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(x2.c.s(eVar, e.class, s3.d.class, s3.c.class));
        arrayList.add(x2.c.s(this, n3.a.class, new Class[0]));
        for (x2.c<?> cVar : collection) {
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f11922d = r(iterable);
        n(arrayList);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f11927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<Provider<ComponentRegistrar>> f11928b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<x2.c<?>> f11929c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private x2.i f11930d = x2.i.f27966a;

        b(Executor executor) {
            this.f11927a = executor;
        }

        public b b(x2.c<?> cVar) {
            this.f11929c.add(cVar);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f11928b.add(new Provider() { // from class: x2.l
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentRuntime.b.f(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection<Provider<ComponentRegistrar>> collection) {
            this.f11928b.addAll(collection);
            return this;
        }

        public ComponentRuntime e() {
            return new ComponentRuntime(this.f11927a, this.f11928b, this.f11929c, this.f11930d);
        }

        public b g(x2.i iVar) {
            this.f11930d = iVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
