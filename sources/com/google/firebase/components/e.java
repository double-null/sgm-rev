package com.google.firebase.components;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import x2.n;

/* JADX INFO: compiled from: EventBus.java */
/* JADX INFO: loaded from: classes4.dex */
class e implements s3.d, s3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<s3.b<Object>, Executor>> f11946a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue<s3.a<?>> f11947b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f11948c;

    e(Executor executor) {
        this.f11948c = executor;
    }

    private synchronized Set<Map.Entry<s3.b<Object>, Executor>> e(s3.a<?> aVar) {
        ConcurrentHashMap<s3.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f11946a.get(aVar.b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Map.Entry entry, s3.a aVar) {
        ((s3.b) entry.getKey()).a(aVar);
    }

    @Override // s3.d
    public synchronized <T> void a(Class<T> cls, Executor executor, s3.b<? super T> bVar) {
        n.b(cls);
        n.b(bVar);
        n.b(executor);
        if (!this.f11946a.containsKey(cls)) {
            this.f11946a.put(cls, new ConcurrentHashMap<>());
        }
        this.f11946a.get(cls).put(bVar, executor);
    }

    @Override // s3.c
    public void b(final s3.a<?> aVar) {
        n.b(aVar);
        synchronized (this) {
            Queue<s3.a<?>> queue = this.f11947b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry<s3.b<Object>, Executor> entry : e(aVar)) {
                entry.getValue().execute(new Runnable() { // from class: com.google.firebase.components.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.f(entry, aVar);
                    }
                });
            }
        }
    }

    void d() {
        Queue<s3.a<?>> queue;
        synchronized (this) {
            queue = this.f11947b;
            if (queue != null) {
                this.f11947b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator<s3.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        }
    }
}
