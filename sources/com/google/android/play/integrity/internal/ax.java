package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ax implements bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f11395a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile bb f11396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Object f11397c = f11395a;

    private ax(bb bbVar) {
        this.f11396b = bbVar;
    }

    public static bb b(bb bbVar) {
        return bbVar instanceof ax ? bbVar : new ax(bbVar);
    }

    @Override // com.google.android.play.integrity.internal.bd, com.google.android.play.integrity.internal.bc
    public final Object a() {
        Object objA = this.f11397c;
        Object obj = f11395a;
        if (objA == obj) {
            synchronized (this) {
                objA = this.f11397c;
                if (objA == obj) {
                    objA = this.f11396b.a();
                    Object obj2 = this.f11397c;
                    if (obj2 != obj && obj2 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f11397c = objA;
                    this.f11396b = null;
                }
            }
        }
        return objA;
    }
}
