package com.google.common.util.concurrent;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
public class CycleDetectingLockFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, c>> f11765a = new com.google.common.collect.c0().l().i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c0 f11766b = new c0(CycleDetectingLockFactory.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<ArrayList<c>> f11767c = new a();

    public static final class PotentialDeadlockException extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f11768c;

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb2 = new StringBuilder(message);
            for (Throwable cause = this.f11768c; cause != null; cause = cause.getCause()) {
                sb2.append(", ");
                sb2.append(cause.getMessage());
            }
            return sb2.toString();
        }
    }

    class a extends ThreadLocal<ArrayList<c>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<c> initialValue() {
            return com.google.common.collect.b0.k(3);
        }
    }

    private static class b extends IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final StackTraceElement[] f11769a = new StackTraceElement[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final com.google.common.collect.w<String> f11770b = com.google.common.collect.w.H(CycleDetectingLockFactory.class.getName(), b.class.getName(), c.class.getName());
    }

    private static class c {
    }
}
