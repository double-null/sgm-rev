package o1;

import java.util.concurrent.Executor;
import n1.j;

/* JADX INFO: compiled from: TaskExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public interface a {
    Executor a();

    void b(Runnable runnable);

    j getBackgroundExecutor();
}
