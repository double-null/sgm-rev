package d8;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f13396a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f13396a.post(runnable);
    }
}
