package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import c8.r1;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import io.bidmachine.media3.common.PriorityTaskManager;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.image.ImageOutput;

/* JADX INFO: loaded from: classes4.dex */
public interface ExoPlayer extends u7.y {

    public static final class b {
        long A;
        long B;
        boolean C;
        boolean D;
        b8.x E;
        boolean F;
        boolean G;
        String H;
        boolean I;
        q2 J;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f18072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        x7.h f18073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f18074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        com.google.common.base.w<b8.z> f18075d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        com.google.common.base.w<io.bidmachine.media3.exoplayer.source.r.a> f18076e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        com.google.common.base.w<q8.v> f18077f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        com.google.common.base.w<j1> f18078g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        com.google.common.base.w<r8.d> f18079h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        com.google.common.base.g<x7.h, c8.a> f18080i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Looper f18081j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f18082k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        PriorityTaskManager f18083l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        u7.c f18084m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f18085n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f18086o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f18087p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f18088q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f18089r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f18090s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f18091t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f18092u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        b8.a0 f18093v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        long f18094w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        long f18095x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        long f18096y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        b8.v f18097z;

        public b(final Context context) {
            this(context, new com.google.common.base.w() { // from class: b8.m
                @Override // com.google.common.base.w
                public final Object get() {
                    return ExoPlayer.b.f(context);
                }
            }, new com.google.common.base.w() { // from class: b8.n
                @Override // com.google.common.base.w
                public final Object get() {
                    return ExoPlayer.b.g(context);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ b8.z f(Context context) {
            return new b8.d(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ io.bidmachine.media3.exoplayer.source.r.a g(Context context) {
            return new io.bidmachine.media3.exoplayer.source.i(context, new v8.l());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ q8.v h(Context context) {
            return new q8.n(context);
        }

        public ExoPlayer e() {
            x7.a.g(!this.F);
            this.F = true;
            return new u0(this, null);
        }

        private b(final Context context, com.google.common.base.w<b8.z> wVar, com.google.common.base.w<io.bidmachine.media3.exoplayer.source.r.a> wVar2) {
            this(context, wVar, wVar2, new com.google.common.base.w() { // from class: b8.o
                @Override // com.google.common.base.w
                public final Object get() {
                    return ExoPlayer.b.h(context);
                }
            }, new com.google.common.base.w() { // from class: b8.p
                @Override // com.google.common.base.w
                public final Object get() {
                    return new io.bidmachine.media3.exoplayer.j();
                }
            }, new com.google.common.base.w() { // from class: b8.q
                @Override // com.google.common.base.w
                public final Object get() {
                    return r8.i.n(context);
                }
            }, new com.google.common.base.g() { // from class: b8.r
                @Override // com.google.common.base.g
                public final Object apply(Object obj) {
                    return new r1((x7.h) obj);
                }
            });
        }

        private b(Context context, com.google.common.base.w<b8.z> wVar, com.google.common.base.w<io.bidmachine.media3.exoplayer.source.r.a> wVar2, com.google.common.base.w<q8.v> wVar3, com.google.common.base.w<j1> wVar4, com.google.common.base.w<r8.d> wVar5, com.google.common.base.g<x7.h, c8.a> gVar) {
            this.f18072a = (Context) x7.a.e(context);
            this.f18075d = wVar;
            this.f18076e = wVar2;
            this.f18077f = wVar3;
            this.f18078g = wVar4;
            this.f18079h = wVar5;
            this.f18080i = gVar;
            this.f18081j = x7.l0.X();
            this.f18084m = u7.c.f25984g;
            this.f18086o = 0;
            this.f18090s = 1;
            this.f18091t = 0;
            this.f18092u = true;
            this.f18093v = b8.a0.f4125g;
            this.f18094w = 5000L;
            this.f18095x = 15000L;
            this.f18096y = 3000L;
            this.f18097z = new i.b().a();
            this.f18073b = x7.h.f28124a;
            this.A = 500L;
            this.B = 2000L;
            this.D = true;
            this.H = KBBdKxoAiHo.thpKdFckic;
            this.f18082k = -1000;
            this.J = new l();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f18098b = new c(-9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18099a;

        public c(long j10) {
            this.f18099a = j10;
        }
    }

    @Override // u7.y
    ExoPlaybackException a();

    void release();

    void setImageOutput(ImageOutput imageOutput);

    public interface a {
        default void C(boolean z10) {
        }

        default void F(boolean z10) {
        }
    }
}
