package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.o;

/* JADX INFO: compiled from: AppCompatDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class g extends Dialog implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o.a f701b;

    /* JADX INFO: compiled from: AppCompatDialog.java */
    class a implements o.a {
        a() {
        }

        @Override // androidx.core.view.o.a
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.c(keyEvent);
        }
    }

    public g(Context context, int i10) {
        super(context, b(context, i10));
        this.f701b = new a();
        e eVarA = a();
        eVarA.E(b(context, i10));
        eVarA.r(null);
    }

    private static int b(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(g.a.f15002y, typedValue, true);
        return typedValue.resourceId;
    }

    public e a() {
        if (this.f700a == null) {
            this.f700a = e.f(this, this);
        }
        return this.f700a;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i10) {
        return a().z(i10);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return o.e(this.f701b, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) a().g(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().n();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        a().m();
        super.onCreate(bundle);
        a().r(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().x();
    }

    @Override // androidx.appcompat.app.d
    public k.b onWindowStartingSupportActionMode(k.b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        a().A(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().F(charSequence);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().B(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().C(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        a().F(getContext().getString(i10));
    }

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeFinished(k.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeStarted(k.b bVar) {
    }
}
