package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: GetIdListener.java */
/* JADX INFO: loaded from: classes4.dex */
class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource<String> f12273a;

    public e(TaskCompletionSource<String> taskCompletionSource) {
        this.f12273a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(w3.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f12273a.trySetResult(dVar.d());
        return true;
    }
}
