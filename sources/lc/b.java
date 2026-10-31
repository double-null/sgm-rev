package lc;

import android.view.View;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wb.i0;

/* JADX INFO: compiled from: ViewabilityGeometryMetric.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements lc.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f21964e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final bc.e f21965f = new bc.e("GeometryMetric", null, 2, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f21967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Float f21968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Float f21969d;

    /* JADX INFO: compiled from: ViewabilityGeometryMetric.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: lc.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewabilityGeometryMetric.kt */
    static final class C0356b extends u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f21970d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0356b(View view) {
            super(0);
            this.f21970d = view;
        }

        @Override // id.a
        public final String invoke() {
            return "Check failed: view visibility (false), must be true - " + this.f21970d;
        }
    }

    /* JADX INFO: compiled from: ViewabilityGeometryMetric.kt */
    static final class c extends u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f21971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f21972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f21973f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f10, b bVar, View view) {
            super(0);
            this.f21971d = f10;
            this.f21972e = bVar;
            this.f21973f = view;
        }

        @Override // id.a
        public final String invoke() {
            return "Check failed: view alpha (" + this.f21971d + "), must be more then " + this.f21972e.b() + " - " + this.f21973f;
        }
    }

    /* JADX INFO: compiled from: ViewabilityGeometryMetric.kt */
    static final class d extends u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f21974d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f21975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f21976f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, b bVar, View view) {
            super(0);
            this.f21974d = i10;
            this.f21975e = bVar;
            this.f21976f = view;
        }

        @Override // id.a
        public final String invoke() {
            return "Check failed: view width (" + this.f21974d + "), must be more then " + this.f21975e.d() + " - " + this.f21976f;
        }
    }

    /* JADX INFO: compiled from: ViewabilityGeometryMetric.kt */
    static final class e extends u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f21977d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f21978e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f21979f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10, b bVar, View view) {
            super(0);
            this.f21977d = i10;
            this.f21978e = bVar;
            this.f21979f = view;
        }

        @Override // id.a
        public final String invoke() {
            return "Check failed: view height (" + this.f21977d + "), must be more then " + this.f21978e.c() + " - " + this.f21979f;
        }
    }

    public b(boolean z10, Float f10, Float f11, Float f12) {
        this.f21966a = z10;
        this.f21967b = f10;
        this.f21968c = f11;
        this.f21969d = f12;
    }

    @Override // lc.a
    public boolean a(View view) {
        t.f(view, "view");
        boolean zIsShown = view.isShown();
        if (this.f21966a && !zIsShown) {
            bc.c.e(f21965f, null, new C0356b(view), 1, null);
            return false;
        }
        float alpha = view.getAlpha();
        Float f10 = this.f21967b;
        if (f10 != null && alpha < f10.floatValue()) {
            bc.c.e(f21965f, null, new c(alpha, this, view), 1, null);
            return false;
        }
        int iM = i0.m(view);
        Float f11 = this.f21968c;
        if (f11 != null && iM < f11.floatValue()) {
            bc.c.e(f21965f, null, new d(iM, this, view), 1, null);
            return false;
        }
        int iK = i0.k(view);
        Float f12 = this.f21969d;
        if (f12 == null || iK >= f12.floatValue()) {
            return true;
        }
        bc.c.e(f21965f, null, new e(iK, this, view), 1, null);
        return false;
    }

    public final Float b() {
        return this.f21967b;
    }

    public final Float c() {
        return this.f21969d;
    }

    public final Float d() {
        return this.f21968c;
    }
}
