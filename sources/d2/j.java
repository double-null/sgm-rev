package d2;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: ExecutionModule.java */
/* JADX INFO: loaded from: classes3.dex */
abstract class j {
    static Executor a() {
        return new n(Executors.newSingleThreadExecutor());
    }
}
