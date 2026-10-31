package nb;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wb.e0;
import wc.g0;
import wc.k;
import wc.m;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f22947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private id.a f22948b;

    static final class a extends u implements id.a {
        a() {
            super(0);
        }

        public final void a() {
            d.this.getOnCloseClickListener().invoke();
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return g0.f27756a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        t.f(context, "context");
        this.f22947a = m.a(new c(context));
        this.f22948b = b.f22950d;
        setOnClickListener(new View.OnClickListener() { // from class: nb.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.f(this.f22944a, view);
            }
        });
        h privacySheetView = getPrivacySheetView();
        privacySheetView.setOnCloseButtonClickListener(new a());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        g0 g0Var = g0.f27756a;
        addView(privacySheetView, layoutParams);
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets c(d this$0, int i10, View view, WindowInsets insets) {
        Rect rect;
        t.f(this$0, "this$0");
        t.f(view, "<anonymous parameter 0>");
        t.f(insets, "insets");
        if (Build.VERSION.SDK_INT >= 30) {
            Insets insets2 = insets.getInsets(WindowInsets.Type.systemBars());
            rect = new Rect(insets2.left, insets2.top, insets2.right, insets2.bottom);
        } else {
            rect = new Rect(insets.getSystemWindowInsetLeft(), insets.getSystemWindowInsetTop(), insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom());
        }
        this$0.getPrivacySheetView().setPadding(this$0.getPrivacySheetView().getPaddingLeft(), this$0.getPrivacySheetView().getPaddingTop(), this$0.getPrivacySheetView().getPaddingRight(), i10 + rect.bottom);
        this$0.setPadding(0, rect.top, 0, 0);
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(d this$0, View view) {
        t.f(this$0, "this$0");
        this$0.f22948b.invoke();
    }

    private final void g() {
        final int paddingBottom = getPrivacySheetView().getPaddingBottom();
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: nb.c
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return d.c(this.f22945a, paddingBottom, view, windowInsets);
            }
        });
    }

    private final h getPrivacySheetView() {
        return (h) this.f22947a.getValue();
    }

    public final void d() {
        getPrivacySheetView().c();
    }

    public final void e(String title, Drawable drawable, id.a clickListener) {
        t.f(title, "title");
        t.f(clickListener, "clickListener");
        getPrivacySheetView().e(title, drawable, clickListener);
    }

    public final id.a<g0> getOnCloseClickListener() {
        return this.f22948b;
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View child, int i10, int i11, int i12, int i13) {
        t.f(child, "child");
        int size = View.MeasureSpec.getSize(i10);
        Context context = getContext();
        t.e(context, "context");
        int iK = e0.k(context, 600.0f);
        Context context2 = getContext();
        t.e(context2, "context");
        if (size >= e0.k(context2, 32.0f) + iK) {
            i10 = View.MeasureSpec.makeMeasureSpec(iK, 1073741824);
        }
        super.measureChildWithMargins(child, i10, i11, i12, i13);
    }

    public final void setOnCloseClickListener(id.a<g0> aVar) {
        t.f(aVar, "<set-?>");
        this.f22948b = aVar;
    }

    public final void setSubtitle(String subtitle) {
        t.f(subtitle, "subtitle");
        getPrivacySheetView().setSubtitle(subtitle);
    }

    public final void setTitle(String title) {
        t.f(title, "title");
        getPrivacySheetView().setTitle(title);
    }

    static final class b extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f22950d = new b();

        b() {
            super(0);
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return g0.f27756a;
        }

        public final void a() {
        }
    }

    static final class c extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f22951d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.f22951d = context;
        }

        @Override // id.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            h hVar = new h(this.f22951d);
            hVar.setOnClickListener(new View.OnClickListener() { // from class: nb.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.c.e(view);
                }
            });
            return hVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(View view) {
        }
    }
}
