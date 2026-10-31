package com.adjust.sdk.scheduler;

/* JADX INFO: loaded from: classes.dex */
class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f5817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AsyncTaskExecutor.a f5818b;

    public a(AsyncTaskExecutor.a aVar, Object obj) {
        this.f5818b = aVar;
        this.f5817a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AsyncTaskExecutor.this.onPostExecute(this.f5817a);
    }
}
