package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

/* JADX INFO: compiled from: AlertDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class c extends g implements DialogInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AlertController f627c;

    /* JADX INFO: compiled from: AlertDialog.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AlertController.b f628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f629b;

        public a(Context context) {
            this(context, c.f(context, 0));
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f628a;
            bVar.f600w = listAdapter;
            bVar.f601x = onClickListener;
            return this;
        }

        public a b(View view) {
            this.f628a.f584g = view;
            return this;
        }

        public a c(Drawable drawable) {
            this.f628a.f581d = drawable;
            return this;
        }

        public c create() {
            c cVar = new c(this.f628a.f578a, this.f629b);
            this.f628a.a(cVar.f627c);
            cVar.setCancelable(this.f628a.f595r);
            if (this.f628a.f595r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f628a.f596s);
            cVar.setOnDismissListener(this.f628a.f597t);
            DialogInterface.OnKeyListener onKeyListener = this.f628a.f598u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public a d(DialogInterface.OnKeyListener onKeyListener) {
            this.f628a.f598u = onKeyListener;
            return this;
        }

        public a e(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f628a;
            bVar.f600w = listAdapter;
            bVar.f601x = onClickListener;
            bVar.I = i10;
            bVar.H = true;
            return this;
        }

        public Context getContext() {
            return this.f628a.f578a;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f628a;
            bVar.f589l = bVar.f578a.getText(i10);
            this.f628a.f591n = onClickListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f628a;
            bVar.f586i = bVar.f578a.getText(i10);
            this.f628a.f588k = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f628a.f583f = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.b bVar = this.f628a;
            bVar.f603z = view;
            bVar.f602y = 0;
            bVar.E = false;
            return this;
        }

        public a(Context context, int i10) {
            this.f628a = new AlertController.b(new ContextThemeWrapper(context, c.f(context, i10)));
            this.f629b = i10;
        }
    }

    protected c(Context context, int i10) {
        super(context, f(context, i10));
        this.f627c = new AlertController(getContext(), this, getWindow());
    }

    static int f(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(g.a.f14992o, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f627c.d();
    }

    @Override // androidx.appcompat.app.g, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f627c.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f627c.f(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f627c.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.g, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f627c.p(charSequence);
    }
}
