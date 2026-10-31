package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: MenuPopupWindow.java */
/* JADX INFO: loaded from: classes.dex */
public class w0 extends t0 implements u0 {
    private static Method K;
    private u0 J;

    /* JADX INFO: compiled from: MenuPopupWindow.java */
    public static class a extends n0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final int f1483o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final int f1484p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private u0 f1485q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private MenuItem f1486r;

        public a(Context context, boolean z10) {
            super(context, z10);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f1483o = 21;
                this.f1484p = 22;
            } else {
                this.f1483o = 22;
                this.f1484p = 21;
            }
        }

        @Override // androidx.appcompat.widget.n0
        public /* bridge */ /* synthetic */ int d(int i10, int i11, int i12, int i13, int i14) {
            return super.d(i10, i11, i12, i13, i14);
        }

        @Override // androidx.appcompat.widget.n0
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i10) {
            return super.e(motionEvent, i10);
        }

        @Override // androidx.appcompat.widget.n0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.n0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.n0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.n0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.n0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.d dVar;
            int headersCount;
            int iPointToPosition;
            int i10;
            if (this.f1485q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    dVar = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.g item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= dVar.getCount()) ? null : dVar.getItem(i10);
                MenuItem menuItem = this.f1486r;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.e eVarB = dVar.b();
                    if (menuItem != null) {
                        this.f1485q.l(eVarB, menuItem);
                    }
                    this.f1486r = item;
                    if (item != null) {
                        this.f1485q.c(eVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f1483o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i10 != this.f1484p) {
                return super.onKeyDown(i10, keyEvent);
            }
            setSelection(-1);
            ((androidx.appcompat.view.menu.d) getAdapter()).b().e(false);
            return true;
        }

        @Override // androidx.appcompat.widget.n0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(u0 u0Var) {
            this.f1485q = u0Var;
        }

        @Override // androidx.appcompat.widget.n0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public w0(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public void L(Object obj) {
        this.G.setEnterTransition((Transition) obj);
    }

    public void M(Object obj) {
        this.G.setExitTransition((Transition) obj);
    }

    public void N(u0 u0Var) {
        this.J = u0Var;
    }

    public void O(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            this.G.setTouchModal(z10);
            return;
        }
        Method method = K;
        if (method != null) {
            try {
                method.invoke(this.G, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.u0
    public void c(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        u0 u0Var = this.J;
        if (u0Var != null) {
            u0Var.c(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.u0
    public void l(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        u0 u0Var = this.J;
        if (u0Var != null) {
            u0Var.l(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.t0
    n0 q(Context context, boolean z10) {
        a aVar = new a(context, z10);
        aVar.setHoverListener(this);
        return aVar;
    }
}
