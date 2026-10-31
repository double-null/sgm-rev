package la;

import android.graphics.Bitmap;
import android.net.Uri;
import pb.b0;
import pb.j1;
import pb.r0;
import wc.r;

/* JADX INFO: loaded from: classes5.dex */
public interface g {

    public interface a<SuccessType> {
        void a(b0 b0Var);

        void onSuccess(SuccessType successtype);
    }

    Object a(j1 j1Var, Object obj, zc.f<? super r<? extends Uri>> fVar);

    void b(r0 r0Var, Object obj, a<Uri> aVar);

    void c(r0 r0Var, Object obj, a<String> aVar);

    void d(r0 r0Var, Object obj, a<Bitmap> aVar);

    void e(Object obj);

    Object f(r0 r0Var, Object obj, zc.f<? super r<? extends Uri>> fVar);
}
