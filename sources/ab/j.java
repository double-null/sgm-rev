package ab;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f220a;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f221a;

        static {
            int[] iArr = new int[pb.g.values().length];
            try {
                iArr[pb.g.EaseIn.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pb.g.EaseOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pb.g.EaseInOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f221a = iArr;
        }
    }

    public j(Map params) {
        t.f(params, "params");
        this.f220a = params;
    }

    private final TimeInterpolator b(pb.g gVar) {
        int i10 = gVar == null ? -1 : a.f221a[gVar.ordinal()];
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 != 2) {
            return i10 != 3 ? new LinearInterpolator() : new AccelerateDecelerateInterpolator();
        }
        return new DecelerateInterpolator();
    }

    public final ViewPropertyAnimator c(View view, pb.f eventType, f targetValues) {
        t.f(view, "view");
        t.f(eventType, "eventType");
        t.f(targetValues, "targetValues");
        pb.h hVar = (pb.h) this.f220a.get(eventType);
        if (hVar == null) {
            return null;
        }
        ViewPropertyAnimator viewPropertyAnimatorWithStartAction = view.animate().alpha(targetValues.a()).translationX(targetValues.b()).translationY(targetValues.c()).setDuration(hVar.b()).withStartAction(new Runnable() { // from class: ab.i
            @Override // java.lang.Runnable
            public final void run() {
                j.d();
            }
        });
        viewPropertyAnimatorWithStartAction.setInterpolator(b(hVar.c()));
        return viewPropertyAnimatorWithStartAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d() {
    }
}
