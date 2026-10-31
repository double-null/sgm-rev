package r7;

import android.content.Context;
import io.bidmachine.BidMachineSharedPreferenceKt;
import io.bidmachine.SessionManagerKtWrapper;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: VersionManager.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f24917b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id.a<hc.a> f24918a;

    /* JADX INFO: compiled from: VersionManager.kt */
    static final class a extends u implements id.a<hc.a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f24919d = new a();

        a() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final hc.a invoke() {
            hc.a aVarA = hc.a.f15817d.a("3.6.1");
            if (aVarA != null) {
                return aVarA;
            }
            io.bidmachine.core.a.f("Unexpected version parsing error: 3.6.1");
            return new hc.a(0, 0, 0);
        }
    }

    /* JADX INFO: compiled from: VersionManager.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final f e(Context context, SessionManagerKtWrapper sessionManagerKtWrapper) {
        hc.a aVarH;
        hc.a aVarInvoke = this.f24918a.invoke();
        BidMachineSharedPreferenceKt bidMachineSharedPreferenceKt = BidMachineSharedPreferenceKt.INSTANCE;
        List historyVersionMilestoneList = bidMachineSharedPreferenceKt.getHistoryVersionMilestoneList(context);
        f currentVersionMilestone = bidMachineSharedPreferenceKt.getCurrentVersionMilestone(context);
        Object next = null;
        hc.a aVarH2 = currentVersionMilestone != null ? currentVersionMilestone.h() : null;
        if (t.a(aVarInvoke, aVarH2)) {
            return currentVersionMilestone;
        }
        long sessionStartTime = sessionManagerKtWrapper.getSessionStartTime();
        hc.a aVar = aVarH2;
        f fVar = new f(aVarInvoke, 0, sessionStartTime, sessionStartTime, 0L, 0L);
        List listR0 = b0.r0(historyVersionMilestoneList);
        if (currentVersionMilestone != null) {
            listR0.add(currentVersionMilestone.a((15 & 1) != 0 ? currentVersionMilestone.f24920a : null, (15 & 2) != 0 ? currentVersionMilestone.f24921b : 0, (15 & 4) != 0 ? currentVersionMilestone.f24922c : 0L, (15 & 8) != 0 ? currentVersionMilestone.f24923d : 0L, (15 & 16) != 0 ? currentVersionMilestone.f24924e : 0L, (15 & 32) != 0 ? currentVersionMilestone.f24925f : currentVersionMilestone.c()));
        }
        bidMachineSharedPreferenceKt.setHistoryVersionMilestoneList(context, listR0);
        if (aVar == null) {
            h(context, sessionStartTime);
        } else if (aVarInvoke.compareTo(aVar) < 0) {
            f(aVar, aVarInvoke);
        } else {
            Iterator it = historyVersionMilestoneList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    hc.a aVarH3 = ((f) next).h();
                    do {
                        Object next2 = it.next();
                        hc.a aVarH4 = ((f) next2).h();
                        if (aVarH3.compareTo(aVarH4) < 0) {
                            next = next2;
                            aVarH3 = aVarH4;
                        }
                    } while (it.hasNext());
                }
            }
            f fVar2 = (f) next;
            if (fVar2 == null || (aVarH = fVar2.h()) == null) {
                aVarH = aVar;
            }
            m(aVar, aVarInvoke, aVarH);
        }
        return fVar;
    }

    private final void f(final hc.a aVar, final hc.a aVar2) {
        io.bidmachine.core.a.m("VersionManager", new qc.b() { // from class: r7.d
            @Override // qc.b
            public final Object get() {
                return e.g(aVar, aVar2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(hc.a from, hc.a to) {
        t.f(from, "$from");
        t.f(to, "$to");
        return "Downgrade detected: " + from + " -> " + to;
    }

    private final void h(Context context, long j10) {
        BidMachineSharedPreferenceKt bidMachineSharedPreferenceKt = BidMachineSharedPreferenceKt.INSTANCE;
        if (bidMachineSharedPreferenceKt.hasBMIFV(context)) {
            io.bidmachine.core.a.a("VersionManager", "Migration from old version detected");
        } else {
            io.bidmachine.core.a.a("VersionManager", "Install detected");
            bidMachineSharedPreferenceKt.setSdkInstallTime(context, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(f fVar) {
        return "Pause session, milestone updated:\n" + fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(f fVar) {
        return "New session, milestone updated:\n" + fVar;
    }

    private final void m(final hc.a aVar, final hc.a aVar2, final hc.a aVar3) {
        io.bidmachine.core.a.b("VersionManager", new qc.b() { // from class: r7.c
            @Override // qc.b
            public final Object get() {
                return e.n(aVar, aVar2, aVar3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(hc.a from, hc.a to, hc.a aVar) {
        t.f(from, "$from");
        t.f(to, "$to");
        return "Upgrade detected: " + from + " -> " + to + ", last max version: " + aVar;
    }

    public final void i(Context context, SessionManagerKtWrapper sessionManager) {
        t.f(context, "context");
        t.f(sessionManager, "sessionManager");
        BidMachineSharedPreferenceKt bidMachineSharedPreferenceKt = BidMachineSharedPreferenceKt.INSTANCE;
        f currentVersionMilestone = bidMachineSharedPreferenceKt.getCurrentVersionMilestone(context);
        final f fVarA = currentVersionMilestone != null ? currentVersionMilestone.a((15 & 1) != 0 ? currentVersionMilestone.f24920a : null, (15 & 2) != 0 ? currentVersionMilestone.f24921b : 0, (15 & 4) != 0 ? currentVersionMilestone.f24922c : 0L, (15 & 8) != 0 ? currentVersionMilestone.f24923d : 0L, (15 & 16) != 0 ? currentVersionMilestone.f24924e : sessionManager.getSessionDurationMs(), (15 & 32) != 0 ? currentVersionMilestone.f24925f : 0L) : null;
        bidMachineSharedPreferenceKt.setCurrentVersionMilestone(context, fVarA);
        io.bidmachine.core.a.b("VersionManager", new qc.b() { // from class: r7.b
            @Override // qc.b
            public final Object get() {
                return e.j(fVarA);
            }
        });
    }

    public final void k(Context context, SessionManagerKtWrapper sessionManager) {
        t.f(context, "context");
        t.f(sessionManager, "sessionManager");
        f fVarE = e(context, sessionManager);
        final f fVarA = fVarE != null ? fVarE.a((15 & 1) != 0 ? fVarE.f24920a : null, (15 & 2) != 0 ? fVarE.f24921b : fVarE.g() + 1, (15 & 4) != 0 ? fVarE.f24922c : 0L, (15 & 8) != 0 ? fVarE.f24923d : sessionManager.getSessionStartTime(), (15 & 16) != 0 ? fVarE.f24924e : sessionManager.getSessionDurationMs(), (15 & 32) != 0 ? fVarE.f24925f : fVarE.c()) : null;
        BidMachineSharedPreferenceKt.INSTANCE.setCurrentVersionMilestone(context, fVarA);
        io.bidmachine.core.a.b("VersionManager", new qc.b() { // from class: r7.a
            @Override // qc.b
            public final Object get() {
                return e.l(fVarA);
            }
        });
    }

    public e(id.a<hc.a> currentVersionProvider) {
        t.f(currentVersionProvider, "currentVersionProvider");
        this.f24918a = currentVersionProvider;
    }

    public /* synthetic */ e(id.a aVar, int i10, k kVar) {
        this((i10 & 1) != 0 ? a.f24919d : aVar);
    }
}
