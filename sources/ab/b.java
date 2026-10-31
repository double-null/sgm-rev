package ab;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import wb.y;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewPropertyAnimator f210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f211e;

    public b(y tag, j animatorFactory, g valuesCalculator) {
        t.f(tag, "tag");
        t.f(animatorFactory, "animatorFactory");
        t.f(valuesCalculator, "valuesCalculator");
        this.f207a = tag;
        this.f208b = animatorFactory;
        this.f209c = valuesCalculator;
        this.f211e = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(b this$0, Runnable runnable) {
        t.f(this$0, "this$0");
        this$0.f211e.set(false);
        if (runnable != null) {
            runnable.run();
        }
    }

    private final void d(View view, f fVar) {
        view.setAlpha(fVar.a());
        view.setTranslationX(fVar.b());
        view.setTranslationY(fVar.c());
    }

    public final void b() {
        pa.t.g(this.f207a, "Cancel animation", new Object[0]);
        ViewPropertyAnimator viewPropertyAnimator = this.f210d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            viewPropertyAnimator.setListener(null);
            viewPropertyAnimator.setUpdateListener(null);
        }
        this.f210d = null;
        this.f211e.set(false);
    }

    public final void e(View view, pb.f eventType) {
        t.f(view, "view");
        t.f(eventType, "eventType");
        f fVarA = this.f209c.a(view, eventType);
        d(view, fVarA);
        pa.t.g(this.f207a, "Prepare animation for event: " + eventType + "; initial values: " + fVarA, new Object[0]);
    }

    public final void f(View view, pb.f eventType, Runnable runnable, final Runnable runnable2, boolean z10) {
        t.f(eventType, "eventType");
        if (runnable != null) {
            runnable.run();
        }
        if (view == null) {
            pa.t.g(this.f207a, "Animation not started for event: " + eventType + "; view is null", new Object[0]);
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        if (g() || z10) {
            pa.t.g(this.f207a, "Animation is already running for event: " + eventType, new Object[0]);
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        f fVarB = this.f209c.b(view, eventType);
        ViewPropertyAnimator viewPropertyAnimatorC = this.f208b.c(view, eventType, fVarB);
        if (viewPropertyAnimatorC == null) {
            d(view, fVarB);
            pa.t.g(this.f207a, "Apply values without animation for event: " + eventType + "; target values: " + fVarB, new Object[0]);
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        pa.t.g(this.f207a, "Start animation for event: " + eventType + "; target values: " + fVarB, new Object[0]);
        this.f211e.set(true);
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = viewPropertyAnimatorC.withEndAction(new Runnable() { // from class: ab.a
            @Override // java.lang.Runnable
            public final void run() {
                b.c(this.f205a, runnable2);
            }
        });
        viewPropertyAnimatorWithEndAction.start();
        this.f210d = viewPropertyAnimatorWithEndAction;
    }

    public final boolean g() {
        return this.f211e.get();
    }
}
