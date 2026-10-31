package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: ActionBar.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: compiled from: ActionBar.java */
    public interface b {
        void onMenuVisibilityChanged(boolean z10);
    }

    /* JADX INFO: compiled from: ActionBar.java */
    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z10);

    public abstract int i();

    public abstract Context j();

    public boolean k() {
        return false;
    }

    public abstract boolean n(int i10, KeyEvent keyEvent);

    public boolean o(KeyEvent keyEvent) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public abstract void q(boolean z10);

    public abstract void r(boolean z10);

    public abstract void s(CharSequence charSequence);

    public k.b t(k.b.a aVar) {
        return null;
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActionBar.java */
    public static class C0014a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f626a;

        public C0014a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f626a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f15206t);
            this.f626a = typedArrayObtainStyledAttributes.getInt(g.j.f15211u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0014a(int i10, int i11) {
            super(i10, i11);
            this.f626a = 8388627;
        }

        public C0014a(C0014a c0014a) {
            super((ViewGroup.MarginLayoutParams) c0014a);
            this.f626a = 0;
            this.f626a = c0014a.f626a;
        }

        public C0014a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f626a = 0;
        }
    }

    void m() {
    }

    public void l(Configuration configuration) {
    }
}
