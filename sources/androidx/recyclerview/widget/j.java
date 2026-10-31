package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.z0;
import java.util.Map;
import java.util.WeakHashMap;
import x.p;
import x.v;

/* JADX INFO: compiled from: RecyclerViewAccessibilityDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public class j extends androidx.core.view.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final RecyclerView f3424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f3425e;

    /* JADX INFO: compiled from: RecyclerViewAccessibilityDelegate.java */
    public static class a extends androidx.core.view.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final j f3426d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<View, androidx.core.view.a> f3427e = new WeakHashMap();

        public a(j jVar) {
            this.f3426d = jVar;
        }

        @Override // androidx.core.view.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f3427e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public v b(View view) {
            androidx.core.view.a aVar = this.f3427e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f3427e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void g(View view, p pVar) {
            if (this.f3426d.o() || this.f3426d.f3424d.getLayoutManager() == null) {
                super.g(view, pVar);
                return;
            }
            this.f3426d.f3424d.getLayoutManager().N0(view, pVar);
            androidx.core.view.a aVar = this.f3427e.get(view);
            if (aVar != null) {
                aVar.g(view, pVar);
            } else {
                super.g(view, pVar);
            }
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f3427e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f3427e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (this.f3426d.o() || this.f3426d.f3424d.getLayoutManager() == null) {
                return super.j(view, i10, bundle);
            }
            androidx.core.view.a aVar = this.f3427e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.j(view, i10, bundle)) {
                return true;
            }
            return this.f3426d.f3424d.getLayoutManager().h1(view, i10, bundle);
        }

        @Override // androidx.core.view.a
        public void l(View view, int i10) {
            androidx.core.view.a aVar = this.f3427e.get(view);
            if (aVar != null) {
                aVar.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        @Override // androidx.core.view.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f3427e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        androidx.core.view.a n(View view) {
            return this.f3427e.remove(view);
        }

        void o(View view) {
            androidx.core.view.a aVarE = z0.e(view);
            if (aVarE == null || aVarE == this) {
                return;
            }
            this.f3427e.put(view, aVarE);
        }
    }

    public j(RecyclerView recyclerView) {
        this.f3424d = recyclerView;
        androidx.core.view.a aVarN = n();
        if (aVarN == null || !(aVarN instanceof a)) {
            this.f3425e = new a(this);
        } else {
            this.f3425e = (a) aVarN;
        }
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().J0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void g(View view, p pVar) {
        super.g(view, pVar);
        if (o() || this.f3424d.getLayoutManager() == null) {
            return;
        }
        this.f3424d.getLayoutManager().M0(pVar);
    }

    @Override // androidx.core.view.a
    public boolean j(View view, int i10, Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (o() || this.f3424d.getLayoutManager() == null) {
            return false;
        }
        return this.f3424d.getLayoutManager().f1(i10, bundle);
    }

    public androidx.core.view.a n() {
        return this.f3425e;
    }

    boolean o() {
        return this.f3424d.hasPendingAdapterUpdates();
    }
}
