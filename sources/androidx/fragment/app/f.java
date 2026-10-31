package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.view.m0;

/* JADX INFO: compiled from: FragmentAnim.java */
/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: compiled from: FragmentAnim.java */
    class a implements androidx.core.os.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f2621a;

        a(Fragment fragment) {
            this.f2621a = fragment;
        }

        @Override // androidx.core.os.d.a
        public void onCancel() {
            if (this.f2621a.getAnimatingAway() != null) {
                View animatingAway = this.f2621a.getAnimatingAway();
                this.f2621a.setAnimatingAway(null);
                animatingAway.clearAnimation();
            }
            this.f2621a.setAnimator(null);
        }
    }

    /* JADX INFO: compiled from: FragmentAnim.java */
    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f2629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w.g f2630d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.d f2631e;

        c(ViewGroup viewGroup, View view, Fragment fragment, w.g gVar, androidx.core.os.d dVar) {
            this.f2627a = viewGroup;
            this.f2628b = view;
            this.f2629c = fragment;
            this.f2630d = gVar;
            this.f2631e = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2627a.endViewTransition(this.f2628b);
            Animator animator2 = this.f2629c.getAnimator();
            this.f2629c.setAnimator(null);
            if (animator2 == null || this.f2627a.indexOfChild(this.f2628b) >= 0) {
                return;
            }
            this.f2630d.a(this.f2629c, this.f2631e);
        }
    }

    static void a(Fragment fragment, d dVar, w.g gVar) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        androidx.core.os.d dVar2 = new androidx.core.os.d();
        dVar2.c(new a(fragment));
        gVar.b(fragment, dVar2);
        if (dVar.f2632a != null) {
            e eVar = new e(dVar.f2632a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, dVar2));
            fragment.mView.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f2633b;
        fragment.setAnimator(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, dVar2));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    static d b(Context context, Fragment fragment, boolean z10) {
        int nextTransition = fragment.getNextTransition();
        int nextAnim = fragment.getNextAnim();
        boolean z11 = false;
        fragment.setNextAnim(0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i10 = j0.b.f20526c;
            if (viewGroup.getTag(i10) != null) {
                fragment.mContainer.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, nextAnim);
        if (animationOnCreateAnimation != null) {
            return new d(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, nextAnim);
        if (animatorOnCreateAnimator != null) {
            return new d(animatorOnCreateAnimator);
        }
        if (nextAnim == 0 && nextTransition != 0) {
            nextAnim = c(nextTransition, z10);
        }
        if (nextAnim != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(nextAnim));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, nextAnim);
                    if (animationLoadAnimation != null) {
                        return new d(animationLoadAnimation);
                    }
                    z11 = true;
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                }
            }
            if (!z11) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, nextAnim);
                    if (animatorLoadAnimator != null) {
                        return new d(animatorLoadAnimator);
                    }
                } catch (RuntimeException e11) {
                    if (zEquals) {
                        throw e11;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, nextAnim);
                    if (animationLoadAnimation2 != null) {
                        return new d(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    private static int c(int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? j0.a.f20522e : j0.a.f20523f;
        }
        if (i10 == 4099) {
            return z10 ? j0.a.f20520c : j0.a.f20521d;
        }
        if (i10 != 8194) {
            return -1;
        }
        return z10 ? j0.a.f20518a : j0.a.f20519b;
    }

    /* JADX INFO: compiled from: FragmentAnim.java */
    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f2632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f2633b;

        d(Animation animation) {
            this.f2632a = animation;
            this.f2633b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        d(Animator animator) {
            this.f2632a = null;
            this.f2633b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: compiled from: FragmentAnim.java */
    static class e extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f2634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f2635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f2636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f2637d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f2638e;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2638e = true;
            this.f2634a = viewGroup;
            this.f2635b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f2638e = true;
            if (this.f2636c) {
                return !this.f2637d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f2636c = true;
                m0.a(this.f2634a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2636c || !this.f2638e) {
                this.f2634a.endViewTransition(this.f2635b);
                this.f2637d = true;
            } else {
                this.f2638e = false;
                this.f2634a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f2638e = true;
            if (this.f2636c) {
                return !this.f2637d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f2636c = true;
                m0.a(this.f2634a, this);
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: FragmentAnim.java */
    class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f2623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w.g f2624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.d f2625d;

        /* JADX INFO: compiled from: FragmentAnim.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f2623b.getAnimatingAway() != null) {
                    b.this.f2623b.setAnimatingAway(null);
                    b bVar = b.this;
                    bVar.f2624c.a(bVar.f2623b, bVar.f2625d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, w.g gVar, androidx.core.os.d dVar) {
            this.f2622a = viewGroup;
            this.f2623b = fragment;
            this.f2624c = gVar;
            this.f2625d = dVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2622a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
