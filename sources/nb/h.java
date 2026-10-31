package nb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wb.e0;
import wc.g0;
import wc.k;
import wc.m;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f22954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f22955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f22956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f22957d;

    static final class a extends u implements id.a {
        a() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LinearLayout invoke() {
            return (LinearLayout) h.this.findViewById(la.c.f21917a);
        }
    }

    static final class b extends u implements id.a {
        b() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            return h.this.findViewById(la.c.f21918b);
        }
    }

    static final class c extends u implements id.a {
        c() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) h.this.findViewById(la.c.f21919c);
        }
    }

    static final class d extends u implements id.a {
        d() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) h.this.findViewById(la.c.f21920d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        t.f(context, "context");
        this.f22954a = m.a(new d());
        this.f22955b = m.a(new c());
        this.f22956c = m.a(new b());
        this.f22957d = m.a(new a());
        View.inflate(context, la.d.f21921a, this);
        setOrientation(1);
        setBackgroundResource(la.b.f21916b);
        int iK = e0.k(context, 16.0f);
        setPadding(iK, iK, iK, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(id.a clickListener, View view) {
        t.f(clickListener, "$clickListener");
        clickListener.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(id.a clickListener, View view) {
        t.f(clickListener, "$clickListener");
        clickListener.invoke();
    }

    private final LinearLayout getActionButtonsContainer() {
        Object value = this.f22957d.getValue();
        t.e(value, "<get-actionButtonsContainer>(...)");
        return (LinearLayout) value;
    }

    private final View getCloseButton() {
        Object value = this.f22956c.getValue();
        t.e(value, "<get-closeButton>(...)");
        return (View) value;
    }

    private final TextView getSubtitleTextView() {
        Object value = this.f22955b.getValue();
        t.e(value, "<get-subtitleTextView>(...)");
        return (TextView) value;
    }

    private final TextView getTitleTextView() {
        Object value = this.f22954a.getValue();
        t.e(value, "<get-titleTextView>(...)");
        return (TextView) value;
    }

    public final void c() {
        getActionButtonsContainer().removeAllViews();
    }

    public final void e(String title, Drawable drawable, final id.a clickListener) {
        t.f(title, "title");
        t.f(clickListener, "clickListener");
        LinearLayout actionButtonsContainer = getActionButtonsContainer();
        Context context = getContext();
        t.e(context, "context");
        nb.a aVar = new nb.a(context);
        aVar.setText(title);
        aVar.setActionIcon(drawable);
        aVar.setOnClickListener(new View.OnClickListener() { // from class: nb.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.d(clickListener, view);
            }
        });
        actionButtonsContainer.addView(aVar, -1, -2);
    }

    public final void setOnCloseButtonClickListener(final id.a<g0> clickListener) {
        t.f(clickListener, "clickListener");
        getCloseButton().setOnClickListener(new View.OnClickListener() { // from class: nb.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.f(clickListener, view);
            }
        });
    }

    public final void setSubtitle(String subtitle) {
        t.f(subtitle, "subtitle");
        getSubtitleTextView().setText(subtitle);
    }

    public final void setTitle(String title) {
        t.f(title, "title");
        getTitleTextView().setText(title);
    }
}
