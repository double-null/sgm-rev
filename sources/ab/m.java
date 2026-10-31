package ab;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.t;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pb.d f299a;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f302c;

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
            f300a = iArr;
            int[] iArr2 = new int[pb.i.values().length];
            try {
                iArr2[pb.i.Fade.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[pb.i.Slide.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f301b = iArr2;
            int[] iArr3 = new int[pb.e.values().length];
            try {
                iArr3[pb.e.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[pb.e.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[pb.e.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[pb.e.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f302c = iArr3;
        }
    }

    public m(pb.d params) {
        t.f(params, "params");
        this.f299a = params;
    }

    private final f c(View view, pb.e eVar) {
        float measuredWidth = view.getMeasuredWidth();
        int[] iArr = a.f302c;
        int i10 = iArr[eVar.ordinal()];
        if (i10 != 1) {
            measuredWidth = i10 != 2 ? view.getTranslationX() : -measuredWidth;
        }
        float measuredHeight = view.getMeasuredHeight();
        int i11 = iArr[eVar.ordinal()];
        if (i11 != 3) {
            measuredHeight = i11 != 4 ? view.getTranslationY() : -measuredHeight;
        }
        return new f(view.getAlpha(), measuredWidth, measuredHeight);
    }

    private final f d(View view, pb.i iVar, pb.e eVar) {
        f fVarC;
        int i10 = iVar == null ? -1 : a.f301b[iVar.ordinal()];
        if (i10 == 1) {
            return new f(0.0f, view.getTranslationX(), view.getTranslationY());
        }
        if (i10 != 2) {
            return new f(view);
        }
        return (eVar == null || (fVarC = c(view, eVar)) == null) ? new f(view) : fVarC;
    }

    @Override // ab.g
    public f a(View view, pb.f eventType) {
        t.f(view, "view");
        t.f(eventType, "eventType");
        int i10 = a.f300a[eventType.ordinal()];
        if (i10 == 1) {
            pb.h hVar = this.f299a.b().get(eventType);
            return d(view, hVar != null ? hVar.d() : null, hVar != null ? hVar.a() : null);
        }
        if (i10 == 2) {
            return new f(view);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ab.g
    public f b(View view, pb.f eventType) {
        pb.e eVarA;
        t.f(view, "view");
        t.f(eventType, "eventType");
        int i10 = a.f300a[eventType.ordinal()];
        if (i10 == 1) {
            return new f(1.0f, 0.0f, 0.0f);
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        pb.h hVar = this.f299a.b().get(eventType);
        pb.e eVarC = null;
        pb.i iVarD = hVar != null ? hVar.d() : null;
        if (hVar != null && (eVarA = hVar.a()) != null) {
            eVarC = eVarA.c();
        }
        return d(view, iVarD, eVarC);
    }
}
