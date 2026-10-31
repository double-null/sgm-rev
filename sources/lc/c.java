package lc;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ViewabilityLifecycleMetric.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c implements lc.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21980b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final bc.e f21981c = new bc.e("LifecycleMetric", null, 2, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<b> f21982a;

    /* JADX INFO: compiled from: ViewabilityLifecycleMetric.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: ViewabilityLifecycleMetric.kt */
    public enum b {
        HAS_WINDOW_FOCUS
    }

    /* JADX INFO: renamed from: lc.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewabilityLifecycleMetric.kt */
    static final class C0357c extends u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f21985d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0357c(View view) {
            super(0);
            this.f21985d = view;
        }

        @Override // id.a
        public final String invoke() {
            return "Check failed: view window focus (false), must be true - " + this.f21985d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends b> states) {
        t.f(states, "states");
        this.f21982a = states;
    }

    @Override // lc.a
    public boolean a(View view) {
        t.f(view, "view");
        if (!this.f21982a.contains(b.HAS_WINDOW_FOCUS) || view.hasWindowFocus()) {
            return true;
        }
        bc.c.e(f21981c, null, new C0357c(view), 1, null);
        return false;
    }
}
