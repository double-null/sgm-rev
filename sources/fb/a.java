package fb;

import id.l;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.o;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;
import pb.a1;
import pb.d0;
import pb.e0;
import pb.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0223a f14909c = new C0223a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f14910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14911b;

    /* JADX INFO: renamed from: fb.a$a, reason: collision with other inner class name */
    public static final class C0223a {
        public /* synthetic */ C0223a(k kVar) {
            this();
        }

        private C0223a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14912a;

        static {
            int[] iArr = new int[e0.values().length];
            try {
                iArr[e0.Track.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e0.Open.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e0.NotifyOpen.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e0.Skip.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e0.Close.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e0.Mute.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e0.UnMute.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[e0.Repeat.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[e0.Show.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[e0.Hide.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[e0.Progress.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[e0.Schedule.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[e0.Start.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[e0.LockVisibility.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[e0.UnlockVisibility.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[e0.SimulateClick.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[e0.OpenPrivacySheet.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[e0.ToggleStateGroups.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[e0.Expand.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[e0.Collapse.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[e0.RequestPermission.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[e0.ReportClick.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            f14912a = iArr;
        }
    }

    public a(f eventTaskExecutor, String sourceName) {
        t.f(eventTaskExecutor, "eventTaskExecutor");
        t.f(sourceName, "sourceName");
        this.f14910a = eventTaskExecutor;
        this.f14911b = sourceName;
    }

    private final void A(f0 f0Var, e0 e0Var) {
        y(f0Var, e0Var);
        this.f14910a.d();
    }

    private final void B(f0 f0Var, e0 e0Var, String str, Object... objArr) {
        s(f0Var, e0Var, "target - %s", str);
        f fVar = this.f14910a;
        Object objZ = o.z(objArr);
        fVar.h(str, objZ != null ? wb.e0.P(objZ, null, 1, null) : null);
    }

    private final void C(f0 f0Var, e0 e0Var) {
        y(f0Var, e0Var);
        this.f14910a.e();
    }

    private final void D(f0 f0Var, e0 e0Var, String str, Object... objArr) {
        s(f0Var, e0Var, "target - %s", str);
        f fVar = this.f14910a;
        Object objZ = o.z(objArr);
        fVar.k(str, objZ != null ? wb.e0.P(objZ, null, 1, null) : null);
    }

    private final String c(Object obj, Object... objArr) {
        String string = obj != null ? obj.toString() : null;
        if (string == null || string.length() == 0) {
            if (!(objArr.length == 0)) {
                Object obj2 = objArr[0];
                if (obj2 != null) {
                    return obj2.toString();
                }
                return null;
            }
        }
        return string;
    }

    private final void d(String str) {
        if (pa.t.f()) {
            pa.t.b("Event", str, new Object[0]);
        }
    }

    private final void e(f0 f0Var, e0 e0Var) {
        y(f0Var, e0Var);
        this.f14910a.a();
    }

    private final void f(f0 f0Var, e0 e0Var, Object obj) {
        String string = obj != null ? obj.toString() : null;
        if (string == null || rd.f0.k0(string)) {
            h(f0Var, e0Var, "value");
            return;
        }
        a1 a1VarC = qb.e.c(string);
        if (a1VarC == null) {
            h(f0Var, e0Var, "value");
        } else {
            s(f0Var, e0Var, "%s", string);
            this.f14910a.j(a1VarC);
        }
    }

    private final void g(f0 f0Var, e0 e0Var, Object obj, Object... objArr) {
        String strC = c(obj, Arrays.copyOf(objArr, objArr.length));
        if (strC == null || rd.f0.k0(strC)) {
            h(f0Var, e0Var, "notify open url");
        } else {
            s(f0Var, e0Var, "%s", strC);
            this.f14910a.g(this.f14911b, strC);
        }
    }

    private final void h(f0 f0Var, e0 e0Var, String str) {
        if (pa.t.f()) {
            d("Could not find required params (" + str + ") for execute task (" + f0Var + ", " + e0Var + ')');
        }
    }

    private final void i(f0 f0Var, e0 e0Var, String str, Object obj) {
        Long lU;
        long jLongValue = (obj == null || (lU = wb.e0.U(obj, null, 1, null)) == null) ? Long.MIN_VALUE : lU.longValue();
        if (jLongValue < 0) {
            h(f0Var, e0Var, "schedule time");
        } else {
            s(f0Var, e0Var, "target - %s, timeMs - %s", str, Long.valueOf(jLongValue));
            this.f14910a.q(str, jLongValue);
        }
    }

    private final void j(f0 f0Var, e0 e0Var, String str, Object obj, Object... objArr) {
        Boolean boolJ = wb.e0.J(obj, null, 1, null);
        if (boolJ == null) {
            if (!(objArr.length == 0)) {
                boolJ = wb.e0.J(objArr[0], null, 1, null);
            }
        }
        if (boolJ == null) {
            h(f0Var, e0Var, "visibility value");
        } else {
            s(f0Var, e0Var, "target - %s, lockVisibility - %s", str, boolJ);
            this.f14910a.a(str, boolJ.booleanValue());
        }
    }

    private final void k(f0 f0Var, e0 e0Var, String str, Object... objArr) {
        s(f0Var, e0Var, "target - %s", str);
        f fVar = this.f14910a;
        Object objZ = o.z(objArr);
        fVar.i(str, objZ != null ? wb.e0.P(objZ, null, 1, null) : null);
    }

    private final void l(String str) {
        if (pa.t.f()) {
            pa.t.g("Event", str, new Object[0]);
        }
    }

    private final void m(f0 f0Var, e0 e0Var) {
        y(f0Var, e0Var);
        this.f14910a.b();
    }

    private final void n(f0 f0Var, e0 e0Var, Object obj) {
        String string = obj != null ? obj.toString() : null;
        if (string == null || rd.f0.k0(string)) {
            h(f0Var, e0Var, "state groups value");
        } else {
            s(f0Var, e0Var, "%s", string);
            this.f14910a.a(string);
        }
    }

    private final void o(f0 f0Var, e0 e0Var, Object obj, Object... objArr) {
        String strC = c(obj, Arrays.copyOf(objArr, objArr.length));
        if (strC == null || rd.f0.k0(strC)) {
            h(f0Var, e0Var, "open url");
        } else {
            s(f0Var, e0Var, "%s", strC);
            this.f14910a.f(this.f14911b, strC);
        }
    }

    private final void p(f0 f0Var, e0 e0Var, String str) {
        s(f0Var, e0Var, "target - %s", str);
        this.f14910a.o(str);
    }

    private final void q(f0 f0Var, e0 e0Var, String str, Object obj) {
        s(f0Var, e0Var, "target - %s", str);
        this.f14910a.c(str, new g7.e(obj != null ? obj.toString() : null));
    }

    private final void r(f0 f0Var, e0 e0Var, String str, Object obj, Object... objArr) {
        try {
            switch (b.f14912a[e0Var.ordinal()]) {
                case 1:
                    u(f0Var, e0Var, obj);
                    break;
                case 2:
                    o(f0Var, e0Var, obj, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 3:
                    g(f0Var, e0Var, obj, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 4:
                    C(f0Var, e0Var);
                    break;
                case 5:
                    e(f0Var, e0Var);
                    break;
                case 6:
                    x(f0Var, e0Var, str, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 7:
                    D(f0Var, e0Var, str, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 8:
                    p(f0Var, e0Var, str);
                    break;
                case 9:
                    B(f0Var, e0Var, str, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 10:
                    k(f0Var, e0Var, str, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 11:
                    z(f0Var, e0Var, str, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 12:
                    i(f0Var, e0Var, str, obj);
                    break;
                case 13:
                    w(f0Var, e0Var, str, obj);
                    break;
                case 14:
                    j(f0Var, e0Var, str, obj, Arrays.copyOf(objArr, objArr.length));
                    break;
                case 15:
                    v(f0Var, e0Var, str);
                    break;
                case 16:
                    q(f0Var, e0Var, str, obj);
                    break;
                case 17:
                    f(f0Var, e0Var, obj);
                    break;
                case 18:
                    n(f0Var, e0Var, obj);
                    break;
                case 19:
                    t(f0Var, e0Var);
                    break;
                case 20:
                    m(f0Var, e0Var);
                    break;
                case 21:
                    d("RequestPermission task must not be executed with other tasks! Check integration!");
                    break;
                case 22:
                    A(f0Var, e0Var);
                    break;
            }
        } catch (Throwable th) {
            pa.t.i(th);
        }
    }

    private final void s(f0 f0Var, e0 e0Var, String str, Object... objArr) {
        if (pa.t.f()) {
            if (str == null) {
                l("Event - " + f0Var.getKey() + " (source - " + this.f14911b + "), Task - " + e0Var.getKey());
                return;
            }
            try {
                l0 l0Var = l0.f21527a;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                t.e(str2, "format(format, *args)");
                l("Event - " + f0Var.getKey() + " (source - " + this.f14911b + "), Task - " + e0Var.getKey() + " (" + str2 + ')');
            } catch (Throwable th) {
                pa.t.i(th);
            }
        }
    }

    private final void t(f0 f0Var, e0 e0Var) {
        y(f0Var, e0Var);
        this.f14910a.c();
    }

    private final void u(f0 f0Var, e0 e0Var, Object obj) {
        String string = obj != null ? obj.toString() : null;
        if (string == null || rd.f0.k0(string)) {
            h(f0Var, e0Var, "track url");
        } else {
            s(f0Var, e0Var, "%s", string);
            this.f14910a.b(string);
        }
    }

    private final void v(f0 f0Var, e0 e0Var, String str) {
        s(f0Var, e0Var, "target - %s", str);
        this.f14910a.m(str);
    }

    private final void w(f0 f0Var, e0 e0Var, String str, Object obj) {
        String string;
        if (obj == null || (string = obj.toString()) == null) {
            return;
        }
        s(f0Var, e0Var, "target - %s, value - %s", str, string);
        this.f14910a.a(str, string);
    }

    private final void x(f0 f0Var, e0 e0Var, String str, Object... objArr) {
        s(f0Var, e0Var, "target - %s", str);
        f fVar = this.f14910a;
        Object objZ = o.z(objArr);
        fVar.l(str, objZ != null ? wb.e0.P(objZ, null, 1, null) : null);
    }

    private final void y(f0 f0Var, e0 e0Var) {
        s(f0Var, e0Var, null, new Object[0]);
    }

    private final void z(f0 f0Var, e0 e0Var, String str, Object... objArr) {
        if (objArr.length < 2) {
            h(f0Var, e0Var, "progress parameters");
            return;
        }
        Long lU = wb.e0.U(objArr[0], null, 1, null);
        long jLongValue = lU != null ? lU.longValue() : Long.MIN_VALUE;
        Long lU2 = wb.e0.U(objArr[1], null, 1, null);
        long jLongValue2 = lU2 != null ? lU2.longValue() : Long.MIN_VALUE;
        if (jLongValue < 1 || jLongValue2 < 0) {
            h(f0Var, e0Var, "maxProgressMs, currentProgressMs");
        } else {
            this.f14910a.n(str, jLongValue, jLongValue2, (jLongValue2 * 100.0f) / jLongValue);
        }
    }

    @Override // fb.d
    public void a(f0 eventType, d0 eventTaskParams, Object... params) {
        t.f(eventType, "eventType");
        t.f(eventTaskParams, "eventTaskParams");
        t.f(params, "params");
        r(eventType, eventTaskParams.a(), eventTaskParams.c(), eventTaskParams.d(), Arrays.copyOf(params, params.length));
    }

    @Override // fb.d
    public void b(d0 requestPermissionEventTaskParams, f0 eventType, String str, List eventTaskParamsList, l callback) {
        t.f(requestPermissionEventTaskParams, "requestPermissionEventTaskParams");
        t.f(eventType, "eventType");
        t.f(eventTaskParamsList, "eventTaskParamsList");
        t.f(callback, "callback");
        e0 e0Var = e0.RequestPermission;
        Object objD = requestPermissionEventTaskParams.d();
        String string = objD != null ? objD.toString() : null;
        if (string == null || rd.f0.k0(string)) {
            h(eventType, e0Var, "request permission url");
            callback.invoke(null);
        } else {
            s(eventType, e0Var, "%s", string);
            this.f14910a.p(this.f14911b, eventType, str, eventTaskParamsList, string, callback);
        }
    }
}
