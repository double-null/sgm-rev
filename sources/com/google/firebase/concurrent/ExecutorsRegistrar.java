package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.inject.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Lazy<ScheduledExecutorService> f11966a = new Lazy<>(new Provider() { // from class: y2.b
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return ExecutorsRegistrar.p();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Lazy<ScheduledExecutorService> f11967b = new Lazy<>(new Provider() { // from class: y2.c
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return ExecutorsRegistrar.q();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Lazy<ScheduledExecutorService> f11968c = new Lazy<>(new Provider() { // from class: y2.d
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return ExecutorsRegistrar.r();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Lazy<ScheduledExecutorService> f11969d = new Lazy<>(new Provider() { // from class: y2.e
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return ExecutorsRegistrar.s();
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(x2.d dVar) {
        return f11966a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(x2.d dVar) {
        return f11968c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(x2.d dVar) {
        return f11967b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor o(x2.d dVar) {
        return y2.l.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, f11969d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<x2.c<?>> getComponents() {
        return Arrays.asList(x2.c.f(x2.o.a(w2.a.class, ScheduledExecutorService.class), x2.o.a(w2.a.class, ExecutorService.class), x2.o.a(w2.a.class, Executor.class)).e(new x2.g() { // from class: y2.f
            @Override // x2.g
            public final Object create(x2.d dVar) {
                return ExecutorsRegistrar.l(dVar);
            }
        }).c(), x2.c.f(x2.o.a(w2.b.class, ScheduledExecutorService.class), x2.o.a(w2.b.class, ExecutorService.class), x2.o.a(w2.b.class, Executor.class)).e(new x2.g() { // from class: y2.g
            @Override // x2.g
            public final Object create(x2.d dVar) {
                return ExecutorsRegistrar.m(dVar);
            }
        }).c(), x2.c.f(x2.o.a(w2.c.class, ScheduledExecutorService.class), x2.o.a(w2.c.class, ExecutorService.class), x2.o.a(w2.c.class, Executor.class)).e(new x2.g() { // from class: y2.h
            @Override // x2.g
            public final Object create(x2.d dVar) {
                return ExecutorsRegistrar.n(dVar);
            }
        }).c(), x2.c.e(x2.o.a(w2.d.class, Executor.class)).e(new x2.g() { // from class: y2.i
            @Override // x2.g
            public final Object create(x2.d dVar) {
                return ExecutorsRegistrar.o(dVar);
            }
        }).c());
    }
}
