package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: GetAuthTokenListener.java */
/* JADX INFO: loaded from: classes4.dex */
class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f12271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource<f> f12272b;

    public d(h hVar, TaskCompletionSource<f> taskCompletionSource) {
        this.f12271a = hVar;
        this.f12272b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(Exception exc) {
        this.f12272b.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(w3.d dVar) {
        if (!dVar.k() || this.f12271a.f(dVar)) {
            return false;
        }
        this.f12272b.setResult(f.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
