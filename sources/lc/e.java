package lc;

import android.graphics.Rect;
import android.view.View;
import com.applovin.mediation.ads.Zfi.OgqfiHA;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wb.i0;

/* JADX INFO: compiled from: ViewabilityVisibilityMetric.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e implements lc.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f22002c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final bc.e f22003d = new bc.e("VisibilityMetric", null, 2, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f22004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f22005b;

    /* JADX INFO: compiled from: ViewabilityVisibilityMetric.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: ViewabilityVisibilityMetric.kt */
    public enum b {
        PARENT_VIEW,
        SCREEN,
        SAFE_AREA
    }

    /* JADX INFO: compiled from: ViewabilityVisibilityMetric.kt */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.PARENT_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.SAFE_AREA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: ViewabilityVisibilityMetric.kt */
    static final class d extends u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f22010d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(0);
            this.f22010d = view;
        }

        @Override // id.a
        public final String invoke() {
            return "Check failed: view is completely clipped - " + this.f22010d;
        }
    }

    /* JADX INFO: renamed from: lc.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewabilityVisibilityMetric.kt */
    static final class C0359e extends u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f22011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f22012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f22013f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0359e(float f10, e eVar, View view) {
            super(0);
            this.f22011d = f10;
            this.f22012e = eVar;
            this.f22013f = view;
        }

        @Override // id.a
        public final String invoke() {
            return "Check failed: view not completely visible (" + this.f22011d + "%), must be more then " + this.f22012e.b() + "% - " + this.f22013f;
        }
    }

    /* JADX INFO: compiled from: ViewabilityVisibilityMetric.kt */
    static final class f extends u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f22014d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(View view) {
            super(0);
            this.f22014d = view;
        }

        @Override // id.a
        public final String invoke() {
            return "Check failed: content or root layout not found - " + this.f22014d;
        }
    }

    /* JADX INFO: compiled from: ViewabilityVisibilityMetric.kt */
    static final class g extends u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f22015d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(View view) {
            super(0);
            this.f22015d = view;
        }

        @Override // id.a
        public final String invoke() {
            return "Check failed: view is out of current window - " + this.f22015d;
        }
    }

    /* JADX INFO: compiled from: ViewabilityVisibilityMetric.kt */
    static final class h extends u implements id.a<String> {
        h() {
            super(0);
        }

        @Override // id.a
        public final String invoke() {
            return "Check not supported (scope - " + e.this.c().name() + ')';
        }
    }

    /* JADX INFO: compiled from: ViewabilityVisibilityMetric.kt */
    static final class i extends u implements id.a<String> {
        i() {
            super(0);
        }

        @Override // id.a
        public final String invoke() {
            return "Check not supported (scope - " + e.this.c().name() + ')';
        }
    }

    public e(b scope, float f10) {
        t.f(scope, "scope");
        this.f22004a = scope;
        this.f22005b = f10;
    }

    public final float b() {
        return this.f22005b;
    }

    public final b c() {
        return this.f22004a;
    }

    @Override // lc.a
    public boolean a(View view) {
        t.f(view, OgqfiHA.NwYqfQBq);
        int i10 = c.$EnumSwitchMapping$0[this.f22004a.ordinal()];
        if (i10 == 1) {
            Rect rect = new Rect();
            if (!view.getGlobalVisibleRect(rect)) {
                bc.c.e(f22003d, null, new d(view), 1, null);
                return false;
            }
            float fWidth = ((rect.width() * rect.height()) / (view.getWidth() * view.getHeight())) * 100;
            if (fWidth < this.f22005b) {
                bc.c.e(f22003d, null, new C0359e(fWidth, this, view), 1, null);
                return false;
            }
            View viewI = i0.i(view);
            if (viewI == null) {
                bc.c.e(f22003d, null, new f(view), 1, null);
                return false;
            }
            Rect rect2 = new Rect();
            viewI.getGlobalVisibleRect(rect2);
            if (!Rect.intersects(rect, rect2)) {
                bc.c.e(f22003d, null, new g(view), 1, null);
                return false;
            }
        } else if (i10 == 2) {
            bc.c.c(f22003d, null, new h(), 1, null);
        } else if (i10 == 3) {
            bc.c.c(f22003d, null, new i(), 1, null);
        }
        return true;
    }
}
