package n1;

import androidx.work.WorkerParameters;

/* JADX INFO: compiled from: StartWorkRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f1.i f22688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f22689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WorkerParameters.a f22690c;

    public k(f1.i iVar, String str, WorkerParameters.a aVar) {
        this.f22688a = iVar;
        this.f22689b = str;
        this.f22690c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f22688a.m().k(this.f22689b, this.f22690c);
    }
}
