package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public class c extends l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static TimeInterpolator f3306s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<RecyclerView.f0> f3307h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<RecyclerView.f0> f3308i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<j> f3309j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList<i> f3310k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.f0>> f3311l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ArrayList<ArrayList<j>> f3312m = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ArrayList<ArrayList<i>> f3313n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList<RecyclerView.f0> f3314o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList<RecyclerView.f0> f3315p = new ArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList<RecyclerView.f0> f3316q = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ArrayList<RecyclerView.f0> f3317r = new ArrayList<>();

    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f3318a;

        a(ArrayList arrayList) {
            this.f3318a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (j jVar : this.f3318a) {
                c.this.S(jVar.f3352a, jVar.f3353b, jVar.f3354c, jVar.f3355d, jVar.f3356e);
            }
            this.f3318a.clear();
            c.this.f3312m.remove(this.f3318a);
        }
    }

    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f3320a;

        b(ArrayList arrayList) {
            this.f3320a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3320a.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f3320a.clear();
            c.this.f3313n.remove(this.f3320a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    class RunnableC0065c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f3322a;

        RunnableC0065c(ArrayList arrayList) {
            this.f3322a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3322a.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.f0) it.next());
            }
            this.f3322a.clear();
            c.this.f3311l.remove(this.f3322a);
        }
    }

    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.f0 f3324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f3326c;

        d(RecyclerView.f0 f0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3324a = f0Var;
            this.f3325b = viewPropertyAnimator;
            this.f3326c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3325b.setListener(null);
            this.f3326c.setAlpha(1.0f);
            c.this.G(this.f3324a);
            c.this.f3316q.remove(this.f3324a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.H(this.f3324a);
        }
    }

    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.f0 f3328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f3329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3330c;

        e(RecyclerView.f0 f0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3328a = f0Var;
            this.f3329b = view;
            this.f3330c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3329b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3330c.setListener(null);
            c.this.A(this.f3328a);
            c.this.f3314o.remove(this.f3328a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.B(this.f3328a);
        }
    }

    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.f0 f3332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f3334c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f3335d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3336e;

        f(RecyclerView.f0 f0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3332a = f0Var;
            this.f3333b = i10;
            this.f3334c = view;
            this.f3335d = i11;
            this.f3336e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f3333b != 0) {
                this.f3334c.setTranslationX(0.0f);
            }
            if (this.f3335d != 0) {
                this.f3334c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3336e.setListener(null);
            c.this.E(this.f3332a);
            c.this.f3315p.remove(this.f3332a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.F(this.f3332a);
        }
    }

    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f3338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f3340c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3338a = iVar;
            this.f3339b = viewPropertyAnimator;
            this.f3340c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3339b.setListener(null);
            this.f3340c.setAlpha(1.0f);
            this.f3340c.setTranslationX(0.0f);
            this.f3340c.setTranslationY(0.0f);
            c.this.C(this.f3338a.f3346a, true);
            c.this.f3317r.remove(this.f3338a.f3346a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f3338a.f3346a, true);
        }
    }

    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f3342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f3344c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3342a = iVar;
            this.f3343b = viewPropertyAnimator;
            this.f3344c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3343b.setListener(null);
            this.f3344c.setAlpha(1.0f);
            this.f3344c.setTranslationX(0.0f);
            this.f3344c.setTranslationY(0.0f);
            c.this.C(this.f3342a.f3347b, false);
            c.this.f3317r.remove(this.f3342a.f3347b);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f3342a.f3347b, false);
        }
    }

    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    private static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.f0 f3352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3355d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3356e;

        j(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
            this.f3352a = f0Var;
            this.f3353b = i10;
            this.f3354c = i11;
            this.f3355d = i12;
            this.f3356e = i13;
        }
    }

    private void T(RecyclerView.f0 f0Var) {
        View view = f0Var.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3316q.add(f0Var);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(f0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    private void W(List<i> list, RecyclerView.f0 f0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Y(iVar, f0Var) && iVar.f3346a == null && iVar.f3347b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.f0 f0Var = iVar.f3346a;
        if (f0Var != null) {
            Y(iVar, f0Var);
        }
        RecyclerView.f0 f0Var2 = iVar.f3347b;
        if (f0Var2 != null) {
            Y(iVar, f0Var2);
        }
    }

    private boolean Y(i iVar, RecyclerView.f0 f0Var) {
        boolean z10 = false;
        if (iVar.f3347b == f0Var) {
            iVar.f3347b = null;
        } else {
            if (iVar.f3346a != f0Var) {
                return false;
            }
            iVar.f3346a = null;
            z10 = true;
        }
        f0Var.itemView.setAlpha(1.0f);
        f0Var.itemView.setTranslationX(0.0f);
        f0Var.itemView.setTranslationY(0.0f);
        C(f0Var, z10);
        return true;
    }

    private void Z(RecyclerView.f0 f0Var) {
        if (f3306s == null) {
            f3306s = new ValueAnimator().getInterpolator();
        }
        f0Var.itemView.animate().setInterpolator(f3306s);
        j(f0Var);
    }

    void Q(RecyclerView.f0 f0Var) {
        View view = f0Var.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3314o.add(f0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(f0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    void R(i iVar) {
        RecyclerView.f0 f0Var = iVar.f3346a;
        View view = f0Var == null ? null : f0Var.itemView;
        RecyclerView.f0 f0Var2 = iVar.f3347b;
        View view2 = f0Var2 != null ? f0Var2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f3317r.add(iVar.f3346a);
            duration.translationX(iVar.f3350e - iVar.f3348c);
            duration.translationY(iVar.f3351f - iVar.f3349d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f3317r.add(iVar.f3347b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void S(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
        View view = f0Var.itemView;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3315p.add(f0Var);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(f0Var, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    void U(List<RecyclerView.f0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.f0 f0Var, List<Object> list) {
        return !list.isEmpty() || super.g(f0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j(RecyclerView.f0 f0Var) {
        View view = f0Var.itemView;
        view.animate().cancel();
        int size = this.f3309j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f3309j.get(size).f3352a == f0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(f0Var);
                this.f3309j.remove(size);
            }
        }
        W(this.f3310k, f0Var);
        if (this.f3307h.remove(f0Var)) {
            view.setAlpha(1.0f);
            G(f0Var);
        }
        if (this.f3308i.remove(f0Var)) {
            view.setAlpha(1.0f);
            A(f0Var);
        }
        for (int size2 = this.f3313n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f3313n.get(size2);
            W(arrayList, f0Var);
            if (arrayList.isEmpty()) {
                this.f3313n.remove(size2);
            }
        }
        for (int size3 = this.f3312m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f3312m.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).f3352a == f0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(f0Var);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f3312m.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f3311l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.f0> arrayList3 = this.f3311l.get(size5);
            if (arrayList3.remove(f0Var)) {
                view.setAlpha(1.0f);
                A(f0Var);
                if (arrayList3.isEmpty()) {
                    this.f3311l.remove(size5);
                }
            }
        }
        this.f3316q.remove(f0Var);
        this.f3314o.remove(f0Var);
        this.f3317r.remove(f0Var);
        this.f3315p.remove(f0Var);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k() {
        int size = this.f3309j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f3309j.get(size);
            View view = jVar.f3352a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f3352a);
            this.f3309j.remove(size);
        }
        for (int size2 = this.f3307h.size() - 1; size2 >= 0; size2--) {
            G(this.f3307h.get(size2));
            this.f3307h.remove(size2);
        }
        int size3 = this.f3308i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.f0 f0Var = this.f3308i.get(size3);
            f0Var.itemView.setAlpha(1.0f);
            A(f0Var);
            this.f3308i.remove(size3);
        }
        for (int size4 = this.f3310k.size() - 1; size4 >= 0; size4--) {
            X(this.f3310k.get(size4));
        }
        this.f3310k.clear();
        if (p()) {
            for (int size5 = this.f3312m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f3312m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f3352a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f3352a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3312m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3311l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.f0> arrayList2 = this.f3311l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.f0 f0Var2 = arrayList2.get(size8);
                    f0Var2.itemView.setAlpha(1.0f);
                    A(f0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3311l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3313n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f3313n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3313n.remove(arrayList3);
                    }
                }
            }
            U(this.f3316q);
            U(this.f3315p);
            U(this.f3314o);
            U(this.f3317r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean p() {
        return (this.f3308i.isEmpty() && this.f3310k.isEmpty() && this.f3309j.isEmpty() && this.f3307h.isEmpty() && this.f3315p.isEmpty() && this.f3316q.isEmpty() && this.f3314o.isEmpty() && this.f3317r.isEmpty() && this.f3312m.isEmpty() && this.f3311l.isEmpty() && this.f3313n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void u() {
        boolean z10 = !this.f3307h.isEmpty();
        boolean z11 = !this.f3309j.isEmpty();
        boolean z12 = !this.f3310k.isEmpty();
        boolean z13 = !this.f3308i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.f0> it = this.f3307h.iterator();
            while (it.hasNext()) {
                T(it.next());
            }
            this.f3307h.clear();
            if (z11) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f3309j);
                this.f3312m.add(arrayList);
                this.f3309j.clear();
                a aVar = new a(arrayList);
                if (z10) {
                    z0.F(arrayList.get(0).f3352a.itemView, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f3310k);
                this.f3313n.add(arrayList2);
                this.f3310k.clear();
                b bVar = new b(arrayList2);
                if (z10) {
                    z0.F(arrayList2.get(0).f3346a.itemView, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList<RecyclerView.f0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f3308i);
                this.f3311l.add(arrayList3);
                this.f3308i.clear();
                RunnableC0065c runnableC0065c = new RunnableC0065c(arrayList3);
                if (z10 || z11 || z12) {
                    z0.F(arrayList3.get(0).itemView, runnableC0065c, (z10 ? o() : 0L) + Math.max(z11 ? n() : 0L, z12 ? m() : 0L));
                } else {
                    runnableC0065c.run();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.l
    public boolean w(RecyclerView.f0 f0Var) {
        Z(f0Var);
        f0Var.itemView.setAlpha(0.0f);
        this.f3308i.add(f0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.l
    public boolean x(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i10, int i11, int i12, int i13) {
        if (f0Var == f0Var2) {
            return y(f0Var, i10, i11, i12, i13);
        }
        float translationX = f0Var.itemView.getTranslationX();
        float translationY = f0Var.itemView.getTranslationY();
        float alpha = f0Var.itemView.getAlpha();
        Z(f0Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        f0Var.itemView.setTranslationX(translationX);
        f0Var.itemView.setTranslationY(translationY);
        f0Var.itemView.setAlpha(alpha);
        if (f0Var2 != null) {
            Z(f0Var2);
            f0Var2.itemView.setTranslationX(-i14);
            f0Var2.itemView.setTranslationY(-i15);
            f0Var2.itemView.setAlpha(0.0f);
        }
        this.f3310k.add(new i(f0Var, f0Var2, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.l
    public boolean y(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
        View view = f0Var.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) f0Var.itemView.getTranslationY());
        Z(f0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(f0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f3309j.add(new j(f0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.l
    public boolean z(RecyclerView.f0 f0Var) {
        Z(f0Var);
        this.f3307h.add(f0Var);
        return true;
    }

    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.f0 f3346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.f0 f3347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3350e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3351f;

        private i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
            this.f3346a = f0Var;
            this.f3347b = f0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3346a + ", newHolder=" + this.f3347b + ", fromX=" + this.f3348c + ", fromY=" + this.f3349d + ", toX=" + this.f3350e + ", toY=" + this.f3351f + '}';
        }

        i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i10, int i11, int i12, int i13) {
            this(f0Var, f0Var2);
            this.f3348c = i10;
            this.f3349d = i11;
            this.f3350e = i12;
            this.f3351f = i13;
        }
    }
}
