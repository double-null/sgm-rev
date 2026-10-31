package pe;

import com.vungle.ads.internal.signals.SignalManager;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import me.b0;
import me.z;
import rd.c0;

/* JADX INFO: compiled from: CacheStrategy.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f24276c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f24277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0 f24278b;

    /* JADX INFO: compiled from: CacheStrategy.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:24:0x003b  */
        public final boolean a(b0 response, z request) {
            t.f(response, "response");
            t.f(request, "request");
            int iH = response.h();
            if (iH != 200 && iH != 410 && iH != 414 && iH != 501 && iH != 203 && iH != 204) {
                if (iH == 307) {
                    if (b0.p(response, "Expires", null, 2, null) == null && response.c().d() == -1 && !response.c().c() && !response.c().b()) {
                        return false;
                    }
                } else if (iH != 308 && iH != 404 && iH != 405) {
                    switch (iH) {
                        case 300:
                        case MRAID_ERROR_VALUE:
                            break;
                        case INVALID_IFA_STATUS_VALUE:
                            if (b0.p(response, "Expires", null, 2, null) == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (response.c().i() || request.b().i()) ? false : true;
        }
    }

    /* JADX INFO: compiled from: CacheStrategy.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f24279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z f24280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b0 f24281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Date f24282d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f24283e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Date f24284f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f24285g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Date f24286h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f24287i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f24288j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f24289k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f24290l;

        public b(long j10, z request, b0 b0Var) {
            t.f(request, "request");
            this.f24279a = j10;
            this.f24280b = request;
            this.f24281c = b0Var;
            this.f24290l = -1;
            if (b0Var != null) {
                this.f24287i = b0Var.H();
                this.f24288j = b0Var.F();
                me.t tVarS = b0Var.s();
                int size = tVarS.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    String strC = tVarS.c(i10);
                    String strE = tVarS.e(i10);
                    if (c0.B(strC, "Date", true)) {
                        this.f24282d = se.c.a(strE);
                        this.f24283e = strE;
                    } else if (c0.B(strC, "Expires", true)) {
                        this.f24286h = se.c.a(strE);
                    } else if (c0.B(strC, "Last-Modified", true)) {
                        this.f24284f = se.c.a(strE);
                        this.f24285g = strE;
                    } else if (c0.B(strC, "ETag", true)) {
                        this.f24289k = strE;
                    } else if (c0.B(strC, "Age", true)) {
                        this.f24290l = ne.d.W(strE, -1);
                    }
                    i10 = i11;
                }
            }
        }

        private final long a() {
            Date date = this.f24282d;
            long jMax = date != null ? Math.max(0L, this.f24288j - date.getTime()) : 0L;
            int i10 = this.f24290l;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.f24288j;
            return jMax + (j10 - this.f24287i) + (this.f24279a - j10);
        }

        private final c c() {
            String str;
            if (this.f24281c == null) {
                return new c(this.f24280b, null);
            }
            if (this.f24280b.g() && this.f24281c.n() == null) {
                return new c(this.f24280b, null);
            }
            if (!c.f24276c.a(this.f24281c, this.f24280b)) {
                return new c(this.f24280b, null);
            }
            me.d dVarB = this.f24280b.b();
            if (dVarB.h() || e(this.f24280b)) {
                return new c(this.f24280b, null);
            }
            me.d dVarC = this.f24281c.c();
            long jA = a();
            long jD = d();
            if (dVarB.d() != -1) {
                jD = Math.min(jD, TimeUnit.SECONDS.toMillis(dVarB.d()));
            }
            long millis = 0;
            long millis2 = dVarB.f() != -1 ? TimeUnit.SECONDS.toMillis(dVarB.f()) : 0L;
            if (!dVarC.g() && dVarB.e() != -1) {
                millis = TimeUnit.SECONDS.toMillis(dVarB.e());
            }
            if (!dVarC.h()) {
                long j10 = millis2 + jA;
                if (j10 < millis + jD) {
                    b0.a aVarZ = this.f24281c.z();
                    if (j10 >= jD) {
                        aVarZ.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jA > SignalManager.TWENTY_FOUR_HOURS_MILLIS && f()) {
                        aVarZ.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new c(null, aVarZ.c());
                }
            }
            String str2 = this.f24289k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f24284f != null) {
                    str2 = this.f24285g;
                } else {
                    if (this.f24282d == null) {
                        return new c(this.f24280b, null);
                    }
                    str2 = this.f24283e;
                }
                str = "If-Modified-Since";
            }
            me.t.a aVarD = this.f24280b.f().d();
            t.c(str2);
            aVarD.c(str, str2);
            return new c(this.f24280b.i().f(aVarD.d()).b(), this.f24281c);
        }

        private final long d() {
            Long lValueOf;
            b0 b0Var = this.f24281c;
            t.c(b0Var);
            me.d dVarC = b0Var.c();
            if (dVarC.d() != -1) {
                return TimeUnit.SECONDS.toMillis(dVarC.d());
            }
            Date date = this.f24286h;
            if (date != null) {
                Date date2 = this.f24282d;
                lValueOf = date2 != null ? Long.valueOf(date2.getTime()) : null;
                long time = date.getTime() - (lValueOf == null ? this.f24288j : lValueOf.longValue());
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f24284f == null || this.f24281c.G().j().m() != null) {
                return 0L;
            }
            Date date3 = this.f24282d;
            lValueOf = date3 != null ? Long.valueOf(date3.getTime()) : null;
            long jLongValue = lValueOf == null ? this.f24287i : lValueOf.longValue();
            Date date4 = this.f24284f;
            t.c(date4);
            long time2 = jLongValue - date4.getTime();
            if (time2 > 0) {
                return time2 / ((long) 10);
            }
            return 0L;
        }

        private final boolean e(z zVar) {
            return (zVar.d("If-Modified-Since") == null && zVar.d("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            b0 b0Var = this.f24281c;
            t.c(b0Var);
            return b0Var.c().d() == -1 && this.f24286h == null;
        }

        public final c b() {
            c cVarC = c();
            return (cVarC.b() == null || !this.f24280b.b().k()) ? cVarC : new c(null, null);
        }
    }

    public c(z zVar, b0 b0Var) {
        this.f24277a = zVar;
        this.f24278b = b0Var;
    }

    public final b0 a() {
        return this.f24278b;
    }

    public final z b() {
        return this.f24277a;
    }
}
