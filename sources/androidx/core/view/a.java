package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: AccessibilityDelegateCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f1894c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f1895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f1896b;

    /* JADX INFO: renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AccessibilityDelegateCompat.java */
    static final class C0036a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f1897a;

        C0036a(a aVar) {
            this.f1897a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f1897a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            x.v vVarB = this.f1897a.b(view);
            if (vVarB != null) {
                return (AccessibilityNodeProvider) vVarB.a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1897a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            x.p pVarF0 = x.p.f0(accessibilityNodeInfo);
            pVarF0.b0(z0.z(view));
            pVarF0.Z(z0.w(view));
            pVarF0.a0(z0.h(view));
            pVarF0.d0(z0.r(view));
            this.f1897a.g(view, pVarF0);
            pVarF0.d(accessibilityNodeInfo.getText(), view);
            List<x.p.a> listC = a.c(view);
            for (int i10 = 0; i10 < listC.size(); i10++) {
                pVarF0.b(listC.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1897a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f1897a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f1897a.j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f1897a.l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f1897a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(f1894c);
    }

    static List<x.p.a> c(View view) {
        List<x.p.a> list = (List) view.getTag(r.e.H);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrN = x.p.n(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; clickableSpanArrN != null && i10 < clickableSpanArrN.length; i10++) {
                if (clickableSpan.equals(clickableSpanArrN[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(r.e.I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1895a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public x.v b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f1895a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new x.v(accessibilityNodeProvider);
        }
        return null;
    }

    View.AccessibilityDelegate d() {
        return this.f1896b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f1895a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, x.p pVar) {
        this.f1895a.onInitializeAccessibilityNodeInfo(view, pVar.e0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f1895a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1895a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) {
        List<x.p.a> listC = c(view);
        boolean zPerformAccessibilityAction = false;
        for (int i11 = 0; i11 < listC.size(); i11++) {
            x.p.a aVar = listC.get(i11);
            if (aVar.a() == i10) {
                zPerformAccessibilityAction = aVar.c(view, bundle);
                break;
            }
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f1895a.performAccessibilityAction(view, i10, bundle);
        }
        return (zPerformAccessibilityAction || i10 != r.e.f24804a || bundle == null) ? zPerformAccessibilityAction : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i10) {
        this.f1895a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f1895a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1895a = accessibilityDelegate;
        this.f1896b = new C0036a(this);
    }
}
