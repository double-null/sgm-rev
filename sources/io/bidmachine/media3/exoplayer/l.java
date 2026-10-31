package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: DefaultSuitableOutputChecker.java */
/* JADX INFO: loaded from: classes4.dex */
final class l implements q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q2 f19131a;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DefaultSuitableOutputChecker.java */
    static final class b implements q2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AudioManager f19132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AudioDeviceCallback f19133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private x7.f<Boolean> f19134c;

        /* JADX INFO: compiled from: DefaultSuitableOutputChecker.java */
        class a extends AudioDeviceCallback {
            a() {
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f19134c.i(Boolean.valueOf(b.this.i()));
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f19134c.i(Boolean.valueOf(b.this.i()));
            }
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean i() {
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) x7.a.i(this.f19132a)).getDevices(2)) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i10 = x7.l0.f28136a;
                if (i10 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i10 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i10 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i10 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j() {
            AudioManager audioManager = this.f19132a;
            if (audioManager != null) {
                audioManager.unregisterAudioDeviceCallback((AudioDeviceCallback) x7.a.e(this.f19133b));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void k(q2.a aVar, Boolean bool, Boolean bool2) {
            aVar.a(bool2.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(Context context) {
            AudioManager audioManager;
            x7.a.e(this.f19134c);
            if (x7.l0.L0(context) && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                this.f19132a = audioManager;
                a aVar = new a();
                this.f19133b = aVar;
                audioManager.registerAudioDeviceCallback(aVar, new Handler((Looper) x7.a.e(Looper.myLooper())));
                this.f19134c.i(Boolean.valueOf(i()));
            }
        }

        @Override // io.bidmachine.media3.exoplayer.q2
        public boolean a() {
            x7.f<Boolean> fVar = this.f19134c;
            if (fVar == null) {
                return true;
            }
            return fVar.d().booleanValue();
        }

        @Override // io.bidmachine.media3.exoplayer.q2
        public void b(final q2.a aVar, final Context context, Looper looper, Looper looper2, x7.h hVar) {
            x7.f<Boolean> fVar = new x7.f<>(Boolean.TRUE, looper2, looper, hVar, new x7.f.a() { // from class: io.bidmachine.media3.exoplayer.m
                @Override // x7.f.a
                public final void a(Object obj, Object obj2) {
                    l.b.k(aVar, (Boolean) obj, (Boolean) obj2);
                }
            });
            this.f19134c = fVar;
            fVar.h(new Runnable() { // from class: io.bidmachine.media3.exoplayer.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19308a.l(context);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.q2
        public void d() {
            ((x7.f) x7.a.e(this.f19134c)).h(new Runnable() { // from class: io.bidmachine.media3.exoplayer.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19315a.j();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DefaultSuitableOutputChecker.java */
    static final class c implements q2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final RouteDiscoveryPreference f19136e = new RouteDiscoveryPreference.Builder(com.google.common.collect.u.H(), false).build();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MediaRouter2 f19137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediaRouter2.RouteCallback f19138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private MediaRouter2.ControllerCallback f19139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private x7.f<Boolean> f19140d;

        /* JADX INFO: compiled from: DefaultSuitableOutputChecker.java */
        class a extends MediaRouter2.RouteCallback {
            a() {
            }
        }

        /* JADX INFO: compiled from: DefaultSuitableOutputChecker.java */
        class b extends MediaRouter2.ControllerCallback {
            b() {
            }

            @Override // android.media.MediaRouter2.ControllerCallback
            public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                c.this.f19140d.i(Boolean.valueOf(c.k(c.this.f19137a)));
            }
        }

        private c() {
        }

        private static boolean j(MediaRoute2Info mediaRoute2Info, int i10, boolean z10) {
            int suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
            if (suitabilityStatus == 1) {
                return (i10 == 1 || i10 == 2) && z10;
            }
            return suitabilityStatus == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean k(MediaRouter2 mediaRouter2) {
            int transferReason = ((MediaRouter2) x7.a.e(mediaRouter2)).getSystemController().getRoutingSessionInfo().getTransferReason();
            boolean zWasTransferInitiatedBySelf = mediaRouter2.getSystemController().wasTransferInitiatedBySelf();
            Iterator it = mediaRouter2.getSystemController().getSelectedRoutes().iterator();
            while (it.hasNext()) {
                if (j((MediaRoute2Info) it.next(), transferReason, zWasTransferInitiatedBySelf)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l() {
            ((MediaRouter2) x7.a.e(this.f19137a)).unregisterControllerCallback((MediaRouter2.ControllerCallback) x7.a.e(this.f19139c));
            this.f19139c = null;
            this.f19137a.unregisterRouteCallback((MediaRouter2.RouteCallback) x7.a.e(this.f19138b));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void m(q2.a aVar, Boolean bool, Boolean bool2) {
            aVar.a(bool2.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(Context context) {
            x7.a.e(this.f19140d);
            this.f19137a = MediaRouter2.getInstance(context);
            this.f19138b = new a();
            final x7.f<Boolean> fVar = this.f19140d;
            Objects.requireNonNull(fVar);
            Executor executor = new Executor() { // from class: b8.l
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    fVar.h(runnable);
                }
            };
            this.f19137a.registerRouteCallback(executor, this.f19138b, f19136e);
            b bVar = new b();
            this.f19139c = bVar;
            this.f19137a.registerControllerCallback(executor, bVar);
            this.f19140d.i(Boolean.valueOf(k(this.f19137a)));
        }

        @Override // io.bidmachine.media3.exoplayer.q2
        public boolean a() {
            x7.f<Boolean> fVar = this.f19140d;
            if (fVar == null) {
                return true;
            }
            return fVar.d().booleanValue();
        }

        @Override // io.bidmachine.media3.exoplayer.q2
        public void b(final q2.a aVar, final Context context, Looper looper, Looper looper2, x7.h hVar) {
            x7.f<Boolean> fVar = new x7.f<>(Boolean.TRUE, looper2, looper, hVar, new x7.f.a() { // from class: io.bidmachine.media3.exoplayer.p
                @Override // x7.f.a
                public final void a(Object obj, Object obj2) {
                    l.c.m(aVar, (Boolean) obj, (Boolean) obj2);
                }
            });
            this.f19140d = fVar;
            fVar.h(new Runnable() { // from class: io.bidmachine.media3.exoplayer.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19352a.n(context);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.q2
        public void d() {
            ((x7.f) x7.a.i(this.f19140d)).h(new Runnable() { // from class: io.bidmachine.media3.exoplayer.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19357a.l();
                }
            });
        }
    }

    public l() {
        int i10 = x7.l0.f28136a;
        if (i10 >= 35) {
            this.f19131a = new c();
        } else if (i10 >= 23) {
            this.f19131a = new b();
        } else {
            this.f19131a = null;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.q2
    public boolean a() {
        q2 q2Var = this.f19131a;
        return q2Var == null || q2Var.a();
    }

    @Override // io.bidmachine.media3.exoplayer.q2
    public void b(q2.a aVar, Context context, Looper looper, Looper looper2, x7.h hVar) {
        q2 q2Var = this.f19131a;
        if (q2Var != null) {
            q2Var.b(aVar, context, looper, looper2, hVar);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.q2
    public void d() {
        q2 q2Var = this.f19131a;
        if (q2Var != null) {
            q2Var.d();
        }
    }
}
