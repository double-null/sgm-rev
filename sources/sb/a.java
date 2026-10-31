package sb;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import pb.a1;
import wb.e0;
import wb.p;
import wc.g0;
import wc.k;
import wc.m;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends Dialog {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0415a f25384c = new C0415a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static WeakReference f25385d = new WeakReference(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a1 f25386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f25387b;

    /* JADX INFO: renamed from: sb.a$a, reason: collision with other inner class name */
    public static final class C0415a {
        public /* synthetic */ C0415a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final a a(Context context, a1 privacySheetParams) {
            t.f(context, "context");
            t.f(privacySheetParams, "privacySheetParams");
            a aVar = (a) a.f25385d.get();
            if (aVar != null && aVar.isShowing()) {
                if (t.a(aVar.f25386a, privacySheetParams)) {
                    return aVar;
                }
                aVar.dismiss();
            }
            a aVar2 = new a(context, privacySheetParams, null);
            a.f25385d = new WeakReference(aVar2);
            try {
                aVar2.show();
            } catch (Throwable th) {
                pa.t.i(th);
            }
            return aVar2;
        }

        private C0415a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a1.b.values().length];
            try {
                iArr[a1.b.REDIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a1.b.COPY_TO_CLIPBOARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class c extends u implements id.a {
        c() {
            super(0);
        }

        public final void a() {
            a.this.dismiss();
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return g0.f27756a;
        }
    }

    static final class d extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f25389d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context) {
            super(0);
            this.f25389d = context;
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final nb.d invoke() {
            return new nb.d(this.f25389d);
        }
    }

    static final class e extends u implements id.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a1.a f25391e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a1.a aVar) {
            super(0);
            this.f25391e = aVar;
        }

        public final void a() {
            a.this.d(this.f25391e);
        }

        @Override // id.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return g0.f27756a;
        }
    }

    public /* synthetic */ a(Context context, a1 a1Var, kotlin.jvm.internal.k kVar) {
        this(context, a1Var);
    }

    private final Object a(String str) {
        try {
            r.a aVar = r.f27774b;
            Context context = getContext();
            t.e(context, "context");
            ClipboardManager clipboardManagerQ = e0.q(context);
            if (clipboardManagerQ != null) {
                clipboardManagerQ.setPrimaryClip(ClipData.newPlainText("", str));
            }
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    private final nb.d b() {
        return (nb.d) this.f25387b.getValue();
    }

    private final void c(Window window) {
        if (Build.VERSION.SDK_INT >= 30) {
            window.setDecorFitsSystemWindows(false);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(a1.a aVar) {
        String strA = aVar.a();
        int i10 = b.$EnumSwitchMapping$0[aVar.d().ordinal()];
        if (i10 == 1) {
            j(strA);
        } else {
            if (i10 != 2) {
                return;
            }
            a(strA);
        }
    }

    private final void e(a1 a1Var) {
        nb.d dVarB = b();
        dVarB.d();
        dVarB.setTitle(a1Var.c());
        dVarB.setSubtitle(a1Var.b());
        for (a1.a aVar : a1Var.a()) {
            Bitmap bitmapB = aVar.b();
            dVarB.e(aVar.c(), bitmapB != null ? new BitmapDrawable(dVarB.getResources(), bitmapB) : null, new e(aVar));
        }
    }

    private final Object j(String str) {
        try {
            r.a aVar = r.f27774b;
            Context context = getContext();
            t.e(context, "context");
            return r.c(Boolean.valueOf(p.j(context, str)));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        nb.d dVarB = b();
        dVarB.setOnCloseClickListener(new c());
        setContentView(dVarB);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
            c(window);
        }
        e(this.f25386a);
    }

    private a(Context context, a1 a1Var) {
        super(context, la.e.f21922a);
        this.f25386a = a1Var;
        this.f25387b = m.a(new d(context));
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
    }
}
