package ab;

import android.content.Context;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.t;
import pb.a0;
import pb.h1;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pb.a f293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f294b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f298d;

        static {
            int[] iArr = new int[pb.f.values().length];
            try {
                iArr[pb.f.Appear.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pb.f.Disappear.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f295a = iArr;
            int[] iArr2 = new int[pb.i.values().length];
            try {
                iArr2[pb.i.Fade.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[pb.i.Slide.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f296b = iArr2;
            int[] iArr3 = new int[h1.values().length];
            try {
                iArr3[h1.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[h1.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[h1.CenterX.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[h1.f24099d.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[h1.Bottom.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[h1.CenterY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            f297c = iArr3;
            int[] iArr4 = new int[pb.e.values().length];
            try {
                iArr4[pb.e.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[pb.e.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[pb.e.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[pb.e.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            f298d = iArr4;
        }
    }

    public l(pb.a params, boolean z10) {
        t.f(params, "params");
        this.f293a = params;
        this.f294b = z10;
    }

    private final f c(View view) {
        return new f(this.f294b ? 0.0f : view.getAlpha(), view.getTranslationX(), view.getTranslationY());
    }

    private final f d(View view, a0 a0Var, pb.e eVar) {
        Context context = view.getContext();
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        t.e(context, "context");
        float fH = a0Var.h(context);
        float fI = a0Var.i(context);
        float fJ = a0Var.j(context);
        float fG = a0Var.g(context);
        int iP = a0Var.p(context);
        int iE = a0Var.e(context);
        if ((iP <= 0 || iE <= 0) && (view.getMeasuredWidth() == 0 || view.getMeasuredHeight() == 0)) {
            int visibility = view.getVisibility();
            view.setVisibility(0);
            if (view2 != null) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view2.getMeasuredHeight(), 1073741824));
            }
            view.setVisibility(visibility);
        }
        Float fValueOf = Float.valueOf(iP);
        if (fValueOf.floatValue() <= 0.0f) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : view.getMeasuredWidth();
        Float fValueOf2 = Float.valueOf(iE);
        Float f10 = fValueOf2.floatValue() > 0.0f ? fValueOf2 : null;
        float fFloatValue2 = f10 != null ? f10.floatValue() : view.getMeasuredHeight();
        float fM = a0Var.m(context);
        float fN = a0Var.n(context);
        float measuredWidth = view2 != null ? view2.getMeasuredWidth() : fFloatValue;
        float measuredHeight = view2 != null ? view2.getMeasuredHeight() : fFloatValue2;
        int[] iArr = a.f298d;
        int i10 = iArr[eVar.ordinal()];
        if (i10 == 1) {
            h1 h1VarA = h.a(a0Var);
            int i11 = h1VarA == null ? -1 : a.f297c[h1VarA.ordinal()];
            if (i11 == 1) {
                fM = measuredWidth - fH;
            } else if (i11 == 2) {
                fM = fFloatValue - fI;
            } else if (i11 == 3) {
                fM = (measuredWidth + fFloatValue) / 2;
            }
        } else if (i10 == 2) {
            h1 h1VarA2 = h.a(a0Var);
            int i12 = h1VarA2 == null ? -1 : a.f297c[h1VarA2.ordinal()];
            if (i12 == 1) {
                fM = (-fFloatValue) - fH;
            } else if (i12 == 2) {
                fM = (-measuredWidth) - fI;
            } else if (i12 == 3) {
                fM = (-(measuredWidth + fFloatValue)) / 2;
            }
        }
        int i13 = iArr[eVar.ordinal()];
        if (i13 == 3) {
            h1 h1VarB = h.b(a0Var);
            int i14 = h1VarB != null ? a.f297c[h1VarB.ordinal()] : -1;
            if (i14 == 4) {
                fN = measuredHeight - fJ;
            } else if (i14 == 5) {
                fN = fFloatValue2 - fG;
            } else if (i14 == 6) {
                fN = (measuredHeight + fFloatValue2) / 2.0f;
            }
        } else if (i13 == 4) {
            h1 h1VarB2 = h.b(a0Var);
            int i15 = h1VarB2 != null ? a.f297c[h1VarB2.ordinal()] : -1;
            if (i15 == 4) {
                fN = (-fFloatValue2) - fJ;
            } else if (i15 == 5) {
                fN = (-measuredHeight) + fFloatValue2 + fG;
            } else if (i15 == 6) {
                fN = (-(measuredHeight + fFloatValue2)) / 2.0f;
            }
        }
        return new f(view.getAlpha(), fM, fN);
    }

    private final f e(View view, a0 a0Var, pb.i iVar, pb.e eVar) {
        f fVar;
        int i10 = iVar == null ? -1 : a.f296b[iVar.ordinal()];
        if (i10 == 1) {
            fVar = new f(0.0f, view.getTranslationX(), view.getTranslationY());
        } else {
            if (i10 != 2) {
                return c(view);
            }
            if (eVar == null || (fVar = d(view, a0Var, eVar)) == null) {
                return c(view);
            }
        }
        return fVar;
    }

    @Override // ab.g
    public f a(View view, pb.f eventType) {
        t.f(view, "view");
        t.f(eventType, "eventType");
        int i10 = a.f295a[eventType.ordinal()];
        if (i10 == 1) {
            pb.h hVar = this.f293a.b().get(eventType);
            return e(view, this.f293a.g(), hVar != null ? hVar.d() : null, hVar != null ? hVar.a() : null);
        }
        if (i10 == 2) {
            return c(view);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ab.g
    public f b(View view, pb.f eventType) {
        pb.e eVarA;
        t.f(view, "view");
        t.f(eventType, "eventType");
        a0 a0VarG = this.f293a.g();
        int i10 = a.f295a[eventType.ordinal()];
        if (i10 == 1) {
            Float fL = this.f293a.c().l();
            float fFloatValue = fL != null ? fL.floatValue() : 1.0f;
            Context context = view.getContext();
            t.e(context, "context");
            return new f(fFloatValue, a0VarG.m(context), a0VarG.n(context));
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        pb.h hVar = this.f293a.b().get(eventType);
        pb.e eVarC = null;
        pb.i iVarD = hVar != null ? hVar.d() : null;
        if (hVar != null && (eVarA = hVar.a()) != null) {
            eVarC = eVarA.c();
        }
        return e(view, a0VarG, iVarD, eVarC);
    }
}
