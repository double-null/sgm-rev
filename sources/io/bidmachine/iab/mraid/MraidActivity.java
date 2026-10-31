package io.bidmachine.iab.mraid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.pairip.VMRunner;

/* JADX INFO: loaded from: classes4.dex */
public class MraidActivity extends pa.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final SparseArray f17603d = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f17604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f17605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17606c = false;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17607a;

        static {
            int[] iArr = new int[j0.values().length];
            f17607a = iArr;
            try {
                iArr[j0.Static.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17607a[j0.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17607a[j0.Rewarded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static Intent g(Context context, j0 j0Var, int i10) {
        Intent intentA = pa.c.a(context, MraidActivity.class);
        intentA.putExtra("InterstitialId", i10);
        intentA.putExtra("InterstitialType", j0Var);
        return intentA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Exception exc) {
        return "Exception during showing MraidInterstitial in MraidActivity: " + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String i(Throwable th) {
        return "Exception during showing MraidActivity: " + th;
    }

    private static void j(y yVar) {
        f17603d.put(yVar.f17842a, yVar);
    }

    private static void k(Integer num) {
        if (num == null) {
            return;
        }
        f17603d.remove(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        k(this.f17604a);
    }

    public static void m(Context context, y yVar, j0 j0Var) {
        if (yVar == null) {
            b0.g("MraidActivity", "MraidInterstitial is null during showing MraidActivity", new Object[0]);
            return;
        }
        if (context == null) {
            b0.g("MraidActivity", "Context is null during showing MraidActivity", new Object[0]);
            yVar.l(c7.b.h("Context is null during showing MraidActivity"));
            return;
        }
        if (j0Var == null) {
            b0.g("MraidActivity", "MraidType is null during showing MraidActivity", new Object[0]);
            yVar.l(c7.b.h("MraidType is null during showing MraidActivity"));
            return;
        }
        try {
            j(yVar);
            context.startActivity(g(context, j0Var, yVar.f17842a));
        } catch (Throwable th) {
            b0.e("MraidActivity", new id.a() { // from class: io.bidmachine.iab.mraid.a
                @Override // id.a
                public final Object invoke() {
                    return MraidActivity.i(th);
                }
            });
            yVar.l(c7.b.j("Exception during showing MraidActivity", th));
            k(Integer.valueOf(yVar.f17842a));
        }
    }

    @Override // pa.b
    protected void b() {
        if (this.f17606c) {
            y yVar = this.f17605b;
            if (yVar != null) {
                yVar.p();
            } else {
                wb.a0.b(this);
            }
        }
    }

    @Override // pa.b, android.app.Activity
    protected void onCreate(Bundle bundle) {
        VMRunner.invoke("BChUR0K8KpgULN1j", new Object[]{this, bundle});
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.f17605b == null || isChangingConfigurations()) {
            return;
        }
        this.f17605b.g();
        l();
    }
}
