package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.adjust.sdk.network.ErrorCodes;

/* JADX INFO: compiled from: MenuDialogHelper.java */
/* JADX INFO: loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.appcompat.app.c f895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c f896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j.a f897d;

    public f(e eVar) {
        this.f894a = eVar;
    }

    public void a() {
        androidx.appcompat.app.c cVar = this.f895b;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void b(e eVar, boolean z10) {
        if (z10 || eVar == this.f894a) {
            a();
        }
        j.a aVar = this.f897d;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean c(e eVar) {
        j.a aVar = this.f897d;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f894a;
        androidx.appcompat.app.c.a aVar = new androidx.appcompat.app.c.a(eVar.u());
        c cVar = new c(aVar.getContext(), g.g.f15085j);
        this.f896c = cVar;
        cVar.d(this);
        this.f894a.b(this.f896c);
        aVar.a(this.f896c.a(), this);
        View viewY = eVar.y();
        if (viewY != null) {
            aVar.b(viewY);
        } else {
            aVar.c(eVar.w()).setTitle(eVar.x());
        }
        aVar.d(this);
        androidx.appcompat.app.c cVarCreate = aVar.create();
        this.f895b = cVarCreate;
        cVarCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f895b.getWindow().getAttributes();
        attributes.type = ErrorCodes.MALFORMED_URL_EXCEPTION;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f895b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f894a.L((g) this.f896c.a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f896c.b(this.f894a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f895b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f895b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f894a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f894a.performShortcut(i10, keyEvent, 0);
    }
}
