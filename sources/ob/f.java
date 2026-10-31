package ob;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import pb.b0;

/* JADX INFO: loaded from: classes5.dex */
public interface f<ViewType extends View> extends Serializable {
    void R(ViewType viewtype, ViewGroup viewGroup);

    void T(ViewType viewtype);

    void a(b0 b0Var);

    void i(Runnable runnable);

    void onClicked();

    void onShown();

    void u(ViewType viewtype);
}
