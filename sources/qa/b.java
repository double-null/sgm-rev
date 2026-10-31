package qa;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.t;
import la.g;
import ob.d;
import ob.e;
import pb.q0;
import sa.h;
import wa.k;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f24699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f24700b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24701a;

        static {
            int[] iArr = new int[pb.b.values().length];
            try {
                iArr[pb.b.Mraid.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pb.b.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pb.b.Image.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pb.b.Label.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[pb.b.Progress.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[pb.b.Countdown.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f24701a = iArr;
        }
    }

    public b(Context context, g repository) {
        t.f(context, "context");
        t.f(repository, "repository");
        this.f24699a = repository;
        this.f24700b = context.getApplicationContext();
    }

    public final e a(ob.g gVar, List list) {
        e eVarA;
        if (gVar == null || list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q0 q0Var = (q0) it.next();
            try {
                eVarA = gVar.a(this.f24700b, q0Var.a(), q0Var.b());
            } catch (Throwable unused) {
                eVarA = null;
            }
            if (eVarA != null) {
                arrayList.add(eVarA);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ob.c(arrayList);
    }

    public final qa.a b(Object assetsHolder, pb.a adElementParams, c adFormListener, fb.b eventCallback, db.a aVar) {
        t.f(assetsHolder, "assetsHolder");
        t.f(adElementParams, "adElementParams");
        t.f(adFormListener, "adFormListener");
        t.f(eventCallback, "eventCallback");
        switch (a.f24701a[adElementParams.a().ordinal()]) {
            case 1:
                Context applicationContext = this.f24700b;
                t.e(applicationContext, "applicationContext");
                return new h(applicationContext, assetsHolder, this.f24699a, adElementParams, adFormListener, eventCallback, aVar, a(adElementParams.h(), adElementParams.i()), adElementParams.m());
            case 2:
                Context applicationContext2 = this.f24700b;
                t.e(applicationContext2, "applicationContext");
                return new k(applicationContext2, assetsHolder, this.f24699a, adElementParams, adFormListener, eventCallback, aVar, c(adElementParams.h(), adElementParams.i()));
            case 3:
                Context applicationContext3 = this.f24700b;
                t.e(applicationContext3, "applicationContext");
                return new ta.a(applicationContext3, assetsHolder, this.f24699a, adElementParams, adFormListener, eventCallback, aVar);
            case 4:
                Context applicationContext4 = this.f24700b;
                t.e(applicationContext4, "applicationContext");
                return new ua.a(applicationContext4, assetsHolder, this.f24699a, adElementParams, adFormListener, eventCallback, aVar);
            case 5:
                Context applicationContext5 = this.f24700b;
                t.e(applicationContext5, "applicationContext");
                return new va.a(applicationContext5, assetsHolder, this.f24699a, adElementParams, adFormListener, eventCallback, aVar);
            case 6:
                Context applicationContext6 = this.f24700b;
                t.e(applicationContext6, "applicationContext");
                return new ra.a(applicationContext6, assetsHolder, this.f24699a, adElementParams, adFormListener, eventCallback, aVar);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final ob.h c(ob.g gVar, List list) {
        ob.h hVarB;
        if (gVar == null || list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q0 q0Var = (q0) it.next();
            try {
                hVarB = gVar.b(this.f24700b, q0Var.a(), q0Var.b());
            } catch (Throwable unused) {
                hVarB = null;
            }
            if (hVarB != null) {
                arrayList.add(hVarB);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new d(arrayList);
    }
}
