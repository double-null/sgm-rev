package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.g0;
import androidx.lifecycle.j;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: LoaderManager.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LoaderManager.java */
    public interface InterfaceC0053a<D> {
        androidx.loader.content.b<D> onCreateLoader(int i10, Bundle bundle);

        void onLoadFinished(androidx.loader.content.b<D> bVar, D d10);

        void onLoaderReset(androidx.loader.content.b<D> bVar);
    }

    public static <T extends j & g0> a b(T t10) {
        return new b(t10, t10.getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> androidx.loader.content.b<D> c(int i10, Bundle bundle, InterfaceC0053a<D> interfaceC0053a);

    public abstract void d();
}
