package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.x2;

/* JADX INFO: compiled from: DecorToolbar.java */
/* JADX INFO: loaded from: classes.dex */
public interface l0 {
    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    void d(Menu menu, androidx.appcompat.view.menu.j.a aVar);

    boolean e();

    void f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i(int i10);

    Menu j();

    int k();

    x2 l(int i10, long j10);

    ViewGroup m();

    void n(boolean z10);

    void o();

    void p(boolean z10);

    void q();

    void r(a1 a1Var);

    void s(int i10);

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2);

    void u(int i10);

    int v();

    void w();
}
