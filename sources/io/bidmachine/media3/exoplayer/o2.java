package io.bidmachine.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import c0.IbU.elEbP;

/* JADX INFO: compiled from: StreamVolumeManager.java */
/* JADX INFO: loaded from: classes4.dex */
final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f19336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x7.f<c> f19337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioManager f19338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f19339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19340f;

    /* JADX INFO: compiled from: StreamVolumeManager.java */
    public interface b {
        void E(int i10, boolean z10);

        void w(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: StreamVolumeManager.java */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f19343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19344d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f19345e;

        public c(int i10, int i11, boolean z10, int i12, int i13) {
            this.f19341a = i10;
            this.f19342b = i11;
            this.f19343c = z10;
            this.f19344d = i12;
            this.f19345e = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: StreamVolumeManager.java */
    final class d extends BroadcastReceiver {
        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            if (o2.this.f19339e == null) {
                return;
            }
            o2.this.f19337c.i(o2.this.h(((c) o2.this.f19337c.d()).f19341a));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            o2.this.f19337c.h(new Runnable() { // from class: io.bidmachine.media3.exoplayer.p2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19351a.b();
                }
            });
        }
    }

    public o2(Context context, b bVar, final int i10, Looper looper, Looper looper2, x7.h hVar) {
        this.f19335a = context.getApplicationContext();
        this.f19336b = bVar;
        x7.f<c> fVar = new x7.f<>(new c(i10, 0, false, 0, 0), looper, looper2, hVar, new x7.f.a() { // from class: io.bidmachine.media3.exoplayer.k2
            @Override // x7.f.a
            public final void a(Object obj, Object obj2) {
                this.f19130a.n((o2.c) obj, (o2.c) obj2);
            }
        });
        this.f19337c = fVar;
        fVar.h(new Runnable() { // from class: io.bidmachine.media3.exoplayer.l2
            @Override // java.lang.Runnable
            public final void run() {
                this.f19161a.k(i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c h(int i10) {
        x7.a.e(this.f19338d);
        return new c(i10, v7.d.f(this.f19338d, i10), v7.d.g(this.f19338d, i10), v7.d.e(this.f19338d, i10), v7.d.d(this.f19338d, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c l(c cVar) {
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ c m(c cVar) {
        d dVar = this.f19339e;
        if (dVar != null) {
            try {
                this.f19335a.unregisterReceiver(dVar);
            } catch (RuntimeException e10) {
                x7.r.i("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f19339e = null;
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(c cVar, c cVar2) {
        boolean z10 = cVar.f19343c;
        if (!z10 && cVar2.f19343c) {
            this.f19340f = cVar.f19342b;
        }
        int i10 = cVar.f19342b;
        int i11 = cVar2.f19342b;
        if (i10 != i11 || z10 != cVar2.f19343c) {
            this.f19336b.E(i11, cVar2.f19343c);
        }
        int i12 = cVar.f19341a;
        int i13 = cVar2.f19341a;
        if (i12 == i13 && cVar.f19344d == cVar2.f19344d && cVar.f19345e == cVar2.f19345e) {
            return;
        }
        this.f19336b.w(i13);
    }

    public int i() {
        return this.f19337c.d().f19345e;
    }

    public int j() {
        return this.f19337c.d().f19344d;
    }

    public void o() {
        this.f19337c.j(new com.google.common.base.g() { // from class: io.bidmachine.media3.exoplayer.m2
            @Override // com.google.common.base.g
            public final Object apply(Object obj) {
                return o2.l((o2.c) obj);
            }
        }, new com.google.common.base.g() { // from class: io.bidmachine.media3.exoplayer.n2
            @Override // com.google.common.base.g
            public final Object apply(Object obj) {
                return this.f19314a.m((o2.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(int i10) {
        this.f19338d = (AudioManager) x7.a.i((AudioManager) this.f19335a.getSystemService("audio"));
        d dVar = new d();
        try {
            this.f19335a.registerReceiver(dVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f19339e = dVar;
        } catch (RuntimeException e10) {
            x7.r.i(elEbP.QqmEjwqKpmsiTH, "Error registering stream volume receiver", e10);
        }
        this.f19337c.i(h(i10));
    }
}
