package io.bidmachine.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import x7.l0;

/* JADX INFO: compiled from: PlayerControlView.java */
/* JADX INFO: loaded from: classes4.dex */
public class d extends FrameLayout {
    private static final float[] A0;
    private final View A;
    private final View B;
    private final TextView C;
    private final TextView D;
    private final h0 E;
    private final StringBuilder F;
    private final Formatter G;
    private final u7.d0.b H;
    private final u7.d0.c I;
    private final Runnable J;
    private final Drawable K;
    private final Drawable L;
    private final Drawable M;
    private final Drawable N;
    private final Drawable O;
    private final String P;
    private final String Q;
    private final String R;
    private final Drawable S;
    private final Drawable T;
    private final float U;
    private final float V;
    private final String W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f20123a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final String f20124a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f20125b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final Drawable f20126b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f20127c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final Drawable f20128c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArrayList<m> f20129d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final String f20130d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RecyclerView f20131e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final String f20132e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f20133f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final Drawable f20134f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e f20135g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final Drawable f20136g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j f20137h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final String f20138h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f20139i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final String f20140i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final fa.y f20141j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private u7.y f20142j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final PopupWindow f20143k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private InterfaceC0331d f20144k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f20145l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f20146l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ImageView f20147m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f20148m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ImageView f20149n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f20150n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ImageView f20151o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f20152o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final View f20153p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f20154p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f20155q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f20156q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final TextView f20157r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f20158r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final TextView f20159s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f20160s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ImageView f20161t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f20162t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ImageView f20163u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private long[] f20164u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ImageView f20165v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private boolean[] f20166v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ImageView f20167w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private long[] f20168w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ImageView f20169x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean[] f20170x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ImageView f20171y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private long f20172y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final View f20173z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f20174z0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: PlayerControlView.java */
    final class b extends l {
        private b() {
            super();
        }

        private boolean i(u7.g0 g0Var) {
            for (int i10 = 0; i10 < this.f20195i.size(); i10++) {
                if (g0Var.D.containsKey(this.f20195i.get(i10).f20192a.a())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(View view) {
            if (d.this.f20142j0 == null || !d.this.f20142j0.r(29)) {
                return;
            }
            ((u7.y) l0.i(d.this.f20142j0)).y(d.this.f20142j0.w().a().G(1).P(1, false).F());
            d.this.f20133f.d(1, d.this.getResources().getString(fa.v.f14860w));
            d.this.f20143k.dismiss();
        }

        @Override // io.bidmachine.media3.ui.d.l
        public void e(i iVar) {
            iVar.f20189b.setText(fa.v.f14860w);
            iVar.f20190c.setVisibility(i(((u7.y) x7.a.e(d.this.f20142j0)).w()) ? 4 : 0);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.media3.ui.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20223a.k(view);
                }
            });
        }

        @Override // io.bidmachine.media3.ui.d.l
        public void g(String str) {
            d.this.f20133f.d(1, str);
        }

        public void j(List<k> list) {
            this.f20195i = list;
            u7.g0 g0VarW = ((u7.y) x7.a.e(d.this.f20142j0)).w();
            if (list.isEmpty()) {
                d.this.f20133f.d(1, d.this.getResources().getString(fa.v.f14861x));
                return;
            }
            if (!i(g0VarW)) {
                d.this.f20133f.d(1, d.this.getResources().getString(fa.v.f14860w));
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                k kVar = list.get(i10);
                if (kVar.a()) {
                    d.this.f20133f.d(1, kVar.f20194c);
                    return;
                }
            }
        }
    }

    /* JADX INFO: compiled from: PlayerControlView.java */
    private final class c implements u7.y.d, h0.a, View.OnClickListener, PopupWindow.OnDismissListener {
        private c() {
        }

        @Override // u7.y.d
        public void C(u7.y yVar, u7.y.c cVar) {
            if (cVar.a(4, 5, 13)) {
                d.this.u0();
            }
            if (cVar.a(4, 5, 7, 13)) {
                d.this.w0();
            }
            if (cVar.a(8, 13)) {
                d.this.x0();
            }
            if (cVar.a(9, 13)) {
                d.this.B0();
            }
            if (cVar.a(8, 9, 11, 0, 16, 17, 13)) {
                d.this.t0();
            }
            if (cVar.a(11, 0, 13)) {
                d.this.C0();
            }
            if (cVar.a(12, 13)) {
                d.this.v0();
            }
            if (cVar.a(2, 13)) {
                d.this.D0();
            }
        }

        @Override // io.bidmachine.media3.ui.h0.a
        public void J(h0 h0Var, long j10) {
            if (d.this.D != null) {
                d.this.D.setText(l0.o0(d.this.F, d.this.G, j10));
            }
        }

        @Override // io.bidmachine.media3.ui.h0.a
        public void K(h0 h0Var, long j10) {
            d.this.f20156q0 = true;
            if (d.this.D != null) {
                d.this.D.setText(l0.o0(d.this.F, d.this.G, j10));
            }
            d.this.f20123a.V();
        }

        @Override // io.bidmachine.media3.ui.h0.a
        public void R(h0 h0Var, long j10, boolean z10) {
            d.this.f20156q0 = false;
            if (!z10 && d.this.f20142j0 != null) {
                d dVar = d.this;
                dVar.l0(dVar.f20142j0, j10);
            }
            d.this.f20123a.W();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            u7.y yVar = d.this.f20142j0;
            if (yVar == null) {
                return;
            }
            d.this.f20123a.W();
            if (d.this.f20149n == view) {
                if (yVar.r(9)) {
                    yVar.x();
                    return;
                }
                return;
            }
            if (d.this.f20147m == view) {
                if (yVar.r(7)) {
                    yVar.j();
                    return;
                }
                return;
            }
            if (d.this.f20153p == view) {
                if (yVar.R() == 4 || !yVar.r(12)) {
                    return;
                }
                yVar.Y();
                return;
            }
            if (d.this.f20155q == view) {
                if (yVar.r(11)) {
                    yVar.Z();
                    return;
                }
                return;
            }
            if (d.this.f20151o == view) {
                l0.x0(yVar, d.this.f20152o0);
                return;
            }
            if (d.this.f20161t == view) {
                if (yVar.r(15)) {
                    yVar.T(x7.b0.a(yVar.V(), d.this.f20162t0));
                    return;
                }
                return;
            }
            if (d.this.f20163u == view) {
                if (yVar.r(14)) {
                    yVar.E(!yVar.W());
                    return;
                }
                return;
            }
            if (d.this.f20173z == view) {
                d.this.f20123a.V();
                d dVar = d.this;
                dVar.V(dVar.f20133f, d.this.f20173z);
                return;
            }
            if (d.this.A == view) {
                d.this.f20123a.V();
                d dVar2 = d.this;
                dVar2.V(dVar2.f20135g, d.this.A);
            } else if (d.this.B == view) {
                d.this.f20123a.V();
                d dVar3 = d.this;
                dVar3.V(dVar3.f20139i, d.this.B);
            } else if (d.this.f20167w == view) {
                d.this.f20123a.V();
                d dVar4 = d.this;
                dVar4.V(dVar4.f20137h, d.this.f20167w);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (d.this.f20174z0) {
                d.this.f20123a.W();
            }
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.media3.ui.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PlayerControlView.java */
    @Deprecated
    public interface InterfaceC0331d {
        void K(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: PlayerControlView.java */
    final class e extends RecyclerView.h<i> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String[] f20177i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float[] f20178j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f20179k;

        public e(String[] strArr, float[] fArr) {
            this.f20177i = strArr;
            this.f20178j = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(int i10, View view) {
            if (i10 != this.f20179k) {
                d.this.setPlaybackSpeed(this.f20178j[i10]);
            }
            d.this.f20143k.dismiss();
        }

        public String b() {
            return this.f20177i[this.f20179k];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, final int i10) {
            String[] strArr = this.f20177i;
            if (i10 < strArr.length) {
                iVar.f20189b.setText(strArr[i10]);
            }
            if (i10 == this.f20179k) {
                iVar.itemView.setSelected(true);
                iVar.f20190c.setVisibility(0);
            } else {
                iVar.itemView.setSelected(false);
                iVar.f20190c.setVisibility(4);
            }
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.media3.ui.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20224a.c(i10, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(d.this.getContext()).inflate(fa.t.f14835f, viewGroup, false));
        }

        public void f(float f10) {
            int i10 = 0;
            float f11 = Float.MAX_VALUE;
            int i11 = 0;
            while (true) {
                float[] fArr = this.f20178j;
                if (i10 >= fArr.length) {
                    this.f20179k = i11;
                    return;
                }
                float fAbs = Math.abs(f10 - fArr[i10]);
                if (fAbs < f11) {
                    i11 = i10;
                    f11 = fAbs;
                }
                i10++;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f20177i.length;
        }
    }

    /* JADX INFO: compiled from: PlayerControlView.java */
    public interface f {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: PlayerControlView.java */
    final class g extends RecyclerView.f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextView f20181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final TextView f20182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ImageView f20183d;

        public g(View view) {
            super(view);
            if (l0.f28136a < 26) {
                view.setFocusable(true);
            }
            this.f20181b = (TextView) view.findViewById(fa.r.f14823v);
            this.f20182c = (TextView) view.findViewById(fa.r.O);
            this.f20183d = (ImageView) view.findViewById(fa.r.f14821t);
            view.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.media3.ui.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f20226a.e(view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(View view) {
            d.this.i0(getBindingAdapterPosition());
        }
    }

    /* JADX INFO: compiled from: PlayerControlView.java */
    private class h extends RecyclerView.h<g> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String[] f20185i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String[] f20186j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final Drawable[] f20187k;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.f20185i = strArr;
            this.f20186j = new String[strArr.length];
            this.f20187k = drawableArr;
        }

        private boolean e(int i10) {
            if (d.this.f20142j0 == null) {
                return false;
            }
            if (i10 == 0) {
                return d.this.f20142j0.r(13);
            }
            if (i10 != 1) {
                return true;
            }
            return d.this.f20142j0.r(30) && d.this.f20142j0.r(29);
        }

        public boolean a() {
            return e(1) || e(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(g gVar, int i10) {
            if (e(i10)) {
                gVar.itemView.setLayoutParams(new RecyclerView.q(-1, -2));
            } else {
                gVar.itemView.setLayoutParams(new RecyclerView.q(0, 0));
            }
            gVar.f20181b.setText(this.f20185i[i10]);
            if (this.f20186j[i10] == null) {
                gVar.f20182c.setVisibility(8);
            } else {
                gVar.f20182c.setText(this.f20186j[i10]);
            }
            if (this.f20187k[i10] == null) {
                gVar.f20183d.setVisibility(8);
            } else {
                gVar.f20183d.setImageDrawable(this.f20187k[i10]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public g onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return d.this.new g(LayoutInflater.from(d.this.getContext()).inflate(fa.t.f14834e, viewGroup, false));
        }

        public void d(int i10, String str) {
            this.f20186j[i10] = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f20185i.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long getItemId(int i10) {
            return i10;
        }
    }

    /* JADX INFO: compiled from: PlayerControlView.java */
    private static class i extends RecyclerView.f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f20189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f20190c;

        public i(View view) {
            super(view);
            if (l0.f28136a < 26) {
                view.setFocusable(true);
            }
            this.f20189b = (TextView) view.findViewById(fa.r.R);
            this.f20190c = view.findViewById(fa.r.f14809h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: PlayerControlView.java */
    static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u7.h0.a f20192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f20194c;

        public k(u7.h0 h0Var, int i10, int i11, String str) {
            this.f20192a = h0Var.a().get(i10);
            this.f20193b = i11;
            this.f20194c = str;
        }

        public boolean a() {
            return this.f20192a.g(this.f20193b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: PlayerControlView.java */
    abstract class l extends RecyclerView.h<i> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected List<k> f20195i = new ArrayList();

        protected l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(u7.y yVar, u7.e0 e0Var, k kVar, View view) {
            if (yVar.r(29)) {
                yVar.y(yVar.w().a().L(new u7.f0(e0Var, com.google.common.collect.u.I(Integer.valueOf(kVar.f20193b)))).P(kVar.f20192a.c(), false).F());
                g(kVar.f20194c);
                d.this.f20143k.dismiss();
            }
        }

        protected void b() {
            this.f20195i = Collections.emptyList();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: d */
        public void onBindViewHolder(i iVar, int i10) {
            final u7.y yVar = d.this.f20142j0;
            if (yVar == null) {
                return;
            }
            if (i10 == 0) {
                e(iVar);
                return;
            }
            final k kVar = this.f20195i.get(i10 - 1);
            final u7.e0 e0VarA = kVar.f20192a.a();
            boolean z10 = yVar.w().D.get(e0VarA) != null && kVar.a();
            iVar.f20189b.setText(kVar.f20194c);
            iVar.f20190c.setVisibility(z10 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.media3.ui.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20228a.c(yVar, e0VarA, kVar, view);
                }
            });
        }

        protected abstract void e(i iVar);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(d.this.getContext()).inflate(fa.t.f14835f, viewGroup, false));
        }

        protected abstract void g(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (this.f20195i.isEmpty()) {
                return 0;
            }
            return this.f20195i.size() + 1;
        }
    }

    /* JADX INFO: compiled from: PlayerControlView.java */
    @Deprecated
    public interface m {
        void J(int i10);
    }

    static {
        u7.t.a("media3.ui");
        A0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public d(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) throws Throwable {
        int i11;
        final d dVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        final d dVar2;
        boolean z18;
        super(context, attributeSet, i10);
        int i28 = fa.t.f14831b;
        int i29 = fa.p.f14788g;
        int i30 = fa.p.f14787f;
        int i31 = fa.p.f14786e;
        int i32 = fa.p.f14795n;
        int i33 = fa.p.f14789h;
        int i34 = fa.p.f14796o;
        int i35 = fa.p.f14785d;
        int i36 = fa.p.f14784c;
        int i37 = fa.p.f14791j;
        int i38 = fa.p.f14792k;
        int i39 = fa.p.f14790i;
        int i40 = fa.p.f14794m;
        int i41 = fa.p.f14793l;
        int i42 = fa.p.f14799r;
        int i43 = fa.p.f14798q;
        int i44 = fa.p.f14800s;
        this.f20152o0 = true;
        this.f20158r0 = Sdk.SDKError.Reason.MEDIATION_ERROR_VALUE;
        this.f20162t0 = 0;
        this.f20160s0 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, fa.x.f14907y, i10, 0);
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(fa.x.A, i28);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(fa.x.G, i29);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(fa.x.F, i30);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(fa.x.E, i31);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(fa.x.B, i32);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(fa.x.H, i33);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(fa.x.M, i34);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(fa.x.D, i35);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(fa.x.C, i36);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(fa.x.J, i37);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(fa.x.K, i38);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(fa.x.I, i39);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(fa.x.W, i40);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(fa.x.V, i41);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(fa.x.Y, i42);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(fa.x.X, i43);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(fa.x.f14866a0, i44);
                dVar = this;
                try {
                    dVar.f20158r0 = typedArrayObtainStyledAttributes.getInt(fa.x.T, dVar.f20158r0);
                    dVar.f20162t0 = X(typedArrayObtainStyledAttributes, dVar.f20162t0);
                    boolean z19 = typedArrayObtainStyledAttributes.getBoolean(fa.x.Q, true);
                    boolean z20 = typedArrayObtainStyledAttributes.getBoolean(fa.x.N, true);
                    boolean z21 = typedArrayObtainStyledAttributes.getBoolean(fa.x.P, true);
                    boolean z22 = typedArrayObtainStyledAttributes.getBoolean(fa.x.O, true);
                    boolean z23 = typedArrayObtainStyledAttributes.getBoolean(fa.x.R, false);
                    boolean z24 = typedArrayObtainStyledAttributes.getBoolean(fa.x.S, false);
                    boolean z25 = typedArrayObtainStyledAttributes.getBoolean(fa.x.U, false);
                    dVar.setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(fa.x.Z, dVar.f20160s0));
                    boolean z26 = typedArrayObtainStyledAttributes.getBoolean(fa.x.f14908z, true);
                    typedArrayObtainStyledAttributes.recycle();
                    i27 = resourceId14;
                    i26 = resourceId;
                    z17 = z26;
                    i12 = resourceId6;
                    i13 = resourceId7;
                    i14 = resourceId8;
                    i15 = resourceId9;
                    i16 = resourceId10;
                    i17 = resourceId11;
                    i18 = resourceId12;
                    i19 = resourceId13;
                    i20 = resourceId15;
                    i21 = resourceId16;
                    i11 = resourceId17;
                    z10 = z19;
                    z11 = z20;
                    z12 = z21;
                    z13 = z22;
                    z14 = z23;
                    z15 = z24;
                    z16 = z25;
                    i22 = resourceId2;
                    i23 = resourceId3;
                    i24 = resourceId5;
                    i25 = resourceId4;
                } catch (Throwable th) {
                    th = th;
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            i11 = i44;
            dVar = this;
            i12 = i33;
            i13 = i34;
            i14 = i35;
            i15 = i36;
            i16 = i37;
            i17 = i38;
            i18 = i39;
            i19 = i40;
            i20 = i42;
            i21 = i43;
            z10 = true;
            z11 = true;
            z12 = true;
            z13 = true;
            z14 = false;
            z15 = false;
            z16 = false;
            z17 = true;
            i22 = i29;
            i23 = i30;
            i24 = i32;
            i25 = i31;
            i26 = i28;
            i27 = i41;
        }
        LayoutInflater.from(context).inflate(i26, dVar);
        dVar.setDescendantFocusability(262144);
        c cVar = new c();
        dVar.f20127c = cVar;
        dVar.f20129d = new CopyOnWriteArrayList<>();
        dVar.H = new u7.d0.b();
        dVar.I = new u7.d0.c();
        StringBuilder sb2 = new StringBuilder();
        dVar.F = sb2;
        int i45 = i24;
        dVar.G = new Formatter(sb2, Locale.getDefault());
        dVar.f20164u0 = new long[0];
        dVar.f20166v0 = new boolean[0];
        dVar.f20168w0 = new long[0];
        dVar.f20170x0 = new boolean[0];
        dVar.J = new Runnable() { // from class: fa.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f14769a.w0();
            }
        };
        dVar.C = (TextView) dVar.findViewById(fa.r.f14814m);
        dVar.D = (TextView) dVar.findViewById(fa.r.E);
        ImageView imageView = (ImageView) dVar.findViewById(fa.r.P);
        dVar.f20167w = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        ImageView imageView2 = (ImageView) dVar.findViewById(fa.r.f14820s);
        dVar.f20169x = imageView2;
        b0(imageView2, new View.OnClickListener() { // from class: fa.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14770a.g0(view);
            }
        });
        ImageView imageView3 = (ImageView) dVar.findViewById(fa.r.f14825x);
        dVar.f20171y = imageView3;
        b0(imageView3, new View.OnClickListener() { // from class: fa.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14770a.g0(view);
            }
        });
        View viewFindViewById = dVar.findViewById(fa.r.L);
        dVar.f20173z = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(cVar);
        }
        View viewFindViewById2 = dVar.findViewById(fa.r.D);
        dVar.A = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar);
        }
        View viewFindViewById3 = dVar.findViewById(fa.r.f14804c);
        dVar.B = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar);
        }
        int i46 = fa.r.G;
        h0 h0Var = (h0) dVar.findViewById(i46);
        View viewFindViewById4 = dVar.findViewById(fa.r.H);
        if (h0Var != null) {
            dVar.E = h0Var;
            dVar2 = dVar;
        } else if (viewFindViewById4 != null) {
            io.bidmachine.media3.ui.b bVar = new io.bidmachine.media3.ui.b(context, null, 0, attributeSet2, fa.w.f14864a);
            bVar.setId(i46);
            bVar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(bVar, iIndexOfChild);
            dVar2 = this;
            dVar2.E = bVar;
        } else {
            dVar2 = dVar;
            dVar2.E = null;
        }
        h0 h0Var2 = dVar2.E;
        if (h0Var2 != null) {
            h0Var2.a(cVar);
        }
        Resources resources = context.getResources();
        dVar2.f20125b = resources;
        ImageView imageView4 = (ImageView) dVar2.findViewById(fa.r.C);
        dVar2.f20151o = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(cVar);
        }
        ImageView imageView5 = (ImageView) dVar2.findViewById(fa.r.F);
        dVar2.f20147m = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(l0.a0(context, resources, i12));
            imageView5.setOnClickListener(cVar);
        }
        ImageView imageView6 = (ImageView) dVar2.findViewById(fa.r.f14826y);
        dVar2.f20149n = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(l0.a0(context, resources, i25));
            imageView6.setOnClickListener(cVar);
        }
        Typeface typefaceA = androidx.core.content.res.d.a(context, fa.q.f14801a);
        ImageView imageView7 = (ImageView) dVar2.findViewById(fa.r.J);
        TextView textView = (TextView) dVar2.findViewById(fa.r.K);
        if (imageView7 != null) {
            imageView7.setImageDrawable(l0.a0(context, resources, i13));
            dVar2.f20155q = imageView7;
            dVar2.f20159s = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceA);
            dVar2.f20159s = textView;
            dVar2.f20155q = textView;
        } else {
            dVar2.f20159s = null;
            dVar2.f20155q = null;
        }
        View view = dVar2.f20155q;
        if (view != null) {
            view.setOnClickListener(dVar2.f20127c);
        }
        ImageView imageView8 = (ImageView) dVar2.findViewById(fa.r.f14818q);
        TextView textView2 = (TextView) dVar2.findViewById(fa.r.f14819r);
        if (imageView8 != null) {
            imageView8.setImageDrawable(l0.a0(context, resources, i45));
            dVar2.f20153p = imageView8;
            dVar2.f20157r = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceA);
            dVar2.f20157r = textView2;
            dVar2.f20153p = textView2;
        } else {
            dVar2.f20157r = null;
            dVar2.f20153p = null;
        }
        View view2 = dVar2.f20153p;
        if (view2 != null) {
            view2.setOnClickListener(dVar2.f20127c);
        }
        ImageView imageView9 = (ImageView) dVar2.findViewById(fa.r.I);
        dVar2.f20161t = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(dVar2.f20127c);
        }
        ImageView imageView10 = (ImageView) dVar2.findViewById(fa.r.M);
        dVar2.f20163u = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(dVar2.f20127c);
        }
        dVar2.U = resources.getInteger(fa.s.f14829b) / 100.0f;
        dVar2.V = resources.getInteger(fa.s.f14828a) / 100.0f;
        ImageView imageView11 = (ImageView) dVar2.findViewById(fa.r.T);
        dVar2.f20165v = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(l0.a0(context, resources, i11));
            dVar2.o0(false, imageView11);
        }
        w wVar = new w(dVar2);
        dVar2.f20123a = wVar;
        wVar.X(z17);
        h hVar = dVar2.new h(new String[]{resources.getString(fa.v.f14845h), dVar2.f20125b.getString(fa.v.f14862y)}, new Drawable[]{l0.a0(context, dVar2.f20125b, fa.p.f14797p), l0.a0(context, dVar2.f20125b, fa.p.f14783b)});
        dVar2.f20133f = hVar;
        dVar2.f20145l = dVar2.f20125b.getDimensionPixelSize(fa.o.f14778a);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(fa.t.f14833d, (ViewGroup) null);
        dVar2.f20131e = recyclerView;
        recyclerView.setAdapter(hVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        dVar2.f20143k = popupWindow;
        if (l0.f28136a < 23) {
            z18 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z18 = false;
        }
        popupWindow.setOnDismissListener(dVar2.f20127c);
        dVar2.f20174z0 = true;
        dVar2.f20141j = new fa.d(getResources());
        dVar2.f20126b0 = l0.a0(context, dVar2.f20125b, i20);
        dVar2.f20128c0 = l0.a0(context, dVar2.f20125b, i21);
        dVar2.f20130d0 = dVar2.f20125b.getString(fa.v.f14839b);
        dVar2.f20132e0 = dVar2.f20125b.getString(fa.v.f14838a);
        dVar2.f20137h = new j();
        dVar2.f20139i = new b();
        dVar2.f20135g = dVar2.new e(dVar2.f20125b.getStringArray(fa.m.f14776a), A0);
        dVar2.K = l0.a0(context, dVar2.f20125b, i22);
        dVar2.L = l0.a0(context, dVar2.f20125b, i23);
        dVar2.f20134f0 = l0.a0(context, dVar2.f20125b, i14);
        dVar2.f20136g0 = l0.a0(context, dVar2.f20125b, i15);
        dVar2.M = l0.a0(context, dVar2.f20125b, i16);
        dVar2.N = l0.a0(context, dVar2.f20125b, i17);
        dVar2.O = l0.a0(context, dVar2.f20125b, i18);
        dVar2.S = l0.a0(context, dVar2.f20125b, i19);
        dVar2.T = l0.a0(context, dVar2.f20125b, i27);
        dVar2.f20138h0 = dVar2.f20125b.getString(fa.v.f14841d);
        dVar2.f20140i0 = dVar2.f20125b.getString(fa.v.f14840c);
        dVar2.P = dVar2.f20125b.getString(fa.v.f14847j);
        dVar2.Q = dVar2.f20125b.getString(fa.v.f14848k);
        dVar2.R = dVar2.f20125b.getString(fa.v.f14846i);
        dVar2.W = dVar2.f20125b.getString(fa.v.f14851n);
        dVar2.f20124a0 = dVar2.f20125b.getString(fa.v.f14850m);
        dVar2.f20123a.Y((ViewGroup) dVar2.findViewById(fa.r.f14806e), true);
        dVar2.f20123a.Y(dVar2.f20153p, z11);
        dVar2.f20123a.Y(dVar2.f20155q, z10);
        dVar2.f20123a.Y(dVar2.f20147m, z12);
        dVar2.f20123a.Y(dVar2.f20149n, z13);
        dVar2.f20123a.Y(dVar2.f20163u, z14);
        dVar2.f20123a.Y(dVar2.f20167w, z15);
        dVar2.f20123a.Y(dVar2.f20165v, z16);
        dVar2.f20123a.Y(dVar2.f20161t, dVar2.f20162t0 == 0 ? z18 : true);
        dVar2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: fa.g
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i47, int i48, int i49, int i50, int i51, int i52, int i53, int i54) {
                this.f14771a.h0(view3, i47, i48, i49, i50, i51, i52, i53, i54);
            }
        });
    }

    private void A0() {
        this.f20131e.measure(0, 0);
        this.f20143k.setWidth(Math.min(this.f20131e.getMeasuredWidth(), getWidth() - (this.f20145l * 2)));
        this.f20143k.setHeight(Math.min(getHeight() - (this.f20145l * 2), this.f20131e.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0() {
        ImageView imageView;
        if (e0() && this.f20148m0 && (imageView = this.f20163u) != null) {
            u7.y yVar = this.f20142j0;
            if (!this.f20123a.A(imageView)) {
                o0(false, this.f20163u);
                return;
            }
            if (yVar == null || !yVar.r(14)) {
                o0(false, this.f20163u);
                this.f20163u.setImageDrawable(this.T);
                this.f20163u.setContentDescription(this.f20124a0);
            } else {
                o0(true, this.f20163u);
                this.f20163u.setImageDrawable(yVar.W() ? this.S : this.T);
                this.f20163u.setContentDescription(yVar.W() ? this.W : this.f20124a0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd A[SYNTHETIC] */
    public void C0() {
        long jS0;
        int i10;
        u7.d0.c cVar;
        long jN;
        long[] jArr;
        int length;
        u7.y yVar = this.f20142j0;
        if (yVar == null) {
            return;
        }
        boolean z10 = true;
        this.f20154p0 = this.f20150n0 && T(yVar, this.I);
        this.f20172y0 = 0L;
        u7.d0 d0VarU = yVar.r(17) ? yVar.u() : u7.d0.f26009a;
        if (d0VarU.q()) {
            if (yVar.r(16)) {
                long jG = yVar.G();
                if (jG != -9223372036854775807L) {
                    jS0 = l0.S0(jG);
                } else {
                    jS0 = 0;
                }
            } else {
                jS0 = 0;
            }
            i10 = 0;
        } else {
            int iS = yVar.S();
            boolean z11 = this.f20154p0;
            int i11 = z11 ? 0 : iS;
            int iP = z11 ? d0VarU.p() - 1 : iS;
            long j10 = 0;
            i10 = 0;
            while (i11 <= iP) {
                if (i11 == iS) {
                    this.f20172y0 = l0.t1(j10);
                }
                d0VarU.n(i11, this.I);
                u7.d0.c cVar2 = this.I;
                if (cVar2.f26047m == -9223372036854775807L) {
                    x7.a.g(this.f20154p0 ^ z10);
                    break;
                }
                int i12 = cVar2.f26048n;
                while (true) {
                    cVar = this.I;
                    if (i12 <= cVar.f26049o) {
                        d0VarU.f(i12, this.H);
                        int iC = this.H.c();
                        for (int iO = this.H.o(); iO < iC; iO++) {
                            long jF = this.H.f(iO);
                            if (jF == Long.MIN_VALUE) {
                                long j11 = this.H.f26021d;
                                if (j11 != -9223372036854775807L) {
                                    jF = j11;
                                    jN = jF + this.H.n();
                                    if (jN >= 0) {
                                        jArr = this.f20164u0;
                                        if (i10 == jArr.length) {
                                            if (jArr.length == 0) {
                                                length = 1;
                                            } else {
                                                length = jArr.length * 2;
                                            }
                                            this.f20164u0 = Arrays.copyOf(jArr, length);
                                            this.f20166v0 = Arrays.copyOf(this.f20166v0, length);
                                        }
                                        this.f20164u0[i10] = l0.t1(j10 + jN);
                                        this.f20166v0[i10] = this.H.p(iO);
                                        i10++;
                                    }
                                }
                            } else {
                                jN = jF + this.H.n();
                                if (jN >= 0) {
                                    jArr = this.f20164u0;
                                    if (i10 == jArr.length) {
                                        if (jArr.length == 0) {
                                            length = 1;
                                        } else {
                                            length = jArr.length * 2;
                                        }
                                        this.f20164u0 = Arrays.copyOf(jArr, length);
                                        this.f20166v0 = Arrays.copyOf(this.f20166v0, length);
                                    }
                                    this.f20164u0[i10] = l0.t1(j10 + jN);
                                    this.f20166v0[i10] = this.H.p(iO);
                                    i10++;
                                }
                            }
                        }
                        i12++;
                    }
                }
                j10 += cVar.f26047m;
                i11++;
                z10 = true;
            }
            jS0 = j10;
        }
        long jT1 = l0.t1(jS0);
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(l0.o0(this.F, this.G, jT1));
        }
        h0 h0Var = this.E;
        if (h0Var != null) {
            h0Var.setDuration(jT1);
            int length2 = this.f20168w0.length;
            int i13 = i10 + length2;
            long[] jArr2 = this.f20164u0;
            if (i13 > jArr2.length) {
                this.f20164u0 = Arrays.copyOf(jArr2, i13);
                this.f20166v0 = Arrays.copyOf(this.f20166v0, i13);
            }
            System.arraycopy(this.f20168w0, 0, this.f20164u0, i10, length2);
            System.arraycopy(this.f20170x0, 0, this.f20166v0, i10, length2);
            this.E.b(this.f20164u0, this.f20166v0, i13);
        }
        w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0() {
        a0();
        o0(this.f20137h.getItemCount() > 0, this.f20167w);
        z0();
    }

    private static boolean T(u7.y yVar, u7.d0.c cVar) {
        u7.d0 d0VarU;
        int iP;
        if (!yVar.r(17) || (iP = (d0VarU = yVar.u()).p()) <= 1 || iP > 100) {
            return false;
        }
        for (int i10 = 0; i10 < iP; i10++) {
            if (d0VarU.n(i10, cVar).f26047m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(RecyclerView.h<?> hVar, View view) {
        this.f20131e.setAdapter(hVar);
        A0();
        this.f20174z0 = false;
        this.f20143k.dismiss();
        this.f20174z0 = true;
        this.f20143k.showAsDropDown(view, (getWidth() - this.f20143k.getWidth()) - this.f20145l, (-this.f20143k.getHeight()) - this.f20145l);
    }

    private com.google.common.collect.u<k> W(u7.h0 h0Var, int i10) {
        com.google.common.collect.u.a aVar = new com.google.common.collect.u.a();
        com.google.common.collect.u<u7.h0.a> uVarA = h0Var.a();
        for (int i11 = 0; i11 < uVarA.size(); i11++) {
            u7.h0.a aVar2 = uVarA.get(i11);
            if (aVar2.c() == i10) {
                for (int i12 = 0; i12 < aVar2.f26173a; i12++) {
                    if (aVar2.h(i12)) {
                        u7.q qVarB = aVar2.b(i12);
                        if ((qVarB.f26242e & 2) == 0) {
                            aVar.a(new k(h0Var, i11, i12, this.f20141j.a(qVarB)));
                        }
                    }
                }
            }
        }
        return aVar.m();
    }

    private static int X(TypedArray typedArray, int i10) {
        return typedArray.getInt(fa.x.L, i10);
    }

    private void a0() {
        this.f20137h.b();
        this.f20139i.b();
        u7.y yVar = this.f20142j0;
        if (yVar != null && yVar.r(30) && this.f20142j0.r(29)) {
            u7.h0 h0VarM = this.f20142j0.m();
            this.f20139i.j(W(h0VarM, 1));
            if (this.f20123a.A(this.f20167w)) {
                this.f20137h.i(W(h0VarM, 3));
            } else {
                this.f20137h.i(com.google.common.collect.u.H());
            }
        }
    }

    private static void b0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    private static boolean d0(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(View view) {
        s0(!this.f20146l0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i13 - i11;
        int i19 = i17 - i15;
        if (!(i12 - i10 == i16 - i14 && i18 == i19) && this.f20143k.isShowing()) {
            A0();
            this.f20143k.update(view, (getWidth() - this.f20143k.getWidth()) - this.f20145l, (-this.f20143k.getHeight()) - this.f20145l, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(int i10) {
        if (i10 == 0) {
            V(this.f20135g, (View) x7.a.e(this.f20173z));
        } else if (i10 == 1) {
            V(this.f20139i, (View) x7.a.e(this.f20173z));
        } else {
            this.f20143k.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(u7.y yVar, long j10) {
        if (this.f20154p0) {
            if (yVar.r(17) && yVar.r(10)) {
                u7.d0 d0VarU = yVar.u();
                int iP = d0VarU.p();
                int i10 = 0;
                while (true) {
                    long jD = d0VarU.n(i10, this.I).d();
                    if (j10 < jD) {
                        break;
                    }
                    if (i10 == iP - 1) {
                        j10 = jD;
                        break;
                    } else {
                        j10 -= jD;
                        i10++;
                    }
                }
                yVar.B(i10, j10);
            }
        } else if (yVar.r(5)) {
            yVar.N(j10);
        }
        w0();
    }

    private void o0(boolean z10, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.U : this.V);
    }

    private void p0() {
        u7.y yVar = this.f20142j0;
        int iO = (int) ((yVar != null ? yVar.O() : 15000L) / 1000);
        TextView textView = this.f20157r;
        if (textView != null) {
            textView.setText(String.valueOf(iO));
        }
        View view = this.f20153p;
        if (view != null) {
            view.setContentDescription(this.f20125b.getQuantityString(fa.u.f14836a, iO, Integer.valueOf(iO)));
        }
    }

    private void q0(ImageView imageView, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (z10) {
            imageView.setImageDrawable(this.f20134f0);
            imageView.setContentDescription(this.f20138h0);
        } else {
            imageView.setImageDrawable(this.f20136g0);
            imageView.setContentDescription(this.f20140i0);
        }
    }

    private static void r0(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (z10) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        u7.y yVar = this.f20142j0;
        if (yVar == null || !yVar.r(13)) {
            return;
        }
        u7.y yVar2 = this.f20142j0;
        yVar2.c(yVar2.e().b(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        boolean zR;
        boolean zR2;
        boolean zR3;
        boolean zR4;
        boolean zR5;
        if (e0() && this.f20148m0) {
            u7.y yVar = this.f20142j0;
            if (yVar != null) {
                zR = (this.f20150n0 && T(yVar, this.I)) ? yVar.r(10) : yVar.r(5);
                zR3 = yVar.r(7);
                zR4 = yVar.r(11);
                zR5 = yVar.r(12);
                zR2 = yVar.r(9);
            } else {
                zR = false;
                zR2 = false;
                zR3 = false;
                zR4 = false;
                zR5 = false;
            }
            if (zR4) {
                y0();
            }
            if (zR5) {
                p0();
            }
            o0(zR3, this.f20147m);
            o0(zR4, this.f20155q);
            o0(zR5, this.f20153p);
            o0(zR2, this.f20149n);
            h0 h0Var = this.E;
            if (h0Var != null) {
                h0Var.setEnabled(zR);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        if (e0() && this.f20148m0 && this.f20151o != null) {
            boolean zL1 = l0.l1(this.f20142j0, this.f20152o0);
            Drawable drawable = zL1 ? this.K : this.L;
            int i10 = zL1 ? fa.v.f14844g : fa.v.f14843f;
            this.f20151o.setImageDrawable(drawable);
            this.f20151o.setContentDescription(this.f20125b.getString(i10));
            o0(l0.k1(this.f20142j0), this.f20151o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        u7.y yVar = this.f20142j0;
        if (yVar == null) {
            return;
        }
        this.f20135g.f(yVar.e().f26518a);
        this.f20133f.d(0, this.f20135g.b());
        z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        long jP;
        long jX;
        if (e0() && this.f20148m0) {
            u7.y yVar = this.f20142j0;
            if (yVar == null || !yVar.r(16)) {
                jP = 0;
                jX = 0;
            } else {
                jP = this.f20172y0 + yVar.P();
                jX = this.f20172y0 + yVar.X();
            }
            TextView textView = this.D;
            if (textView != null && !this.f20156q0) {
                textView.setText(l0.o0(this.F, this.G, jP));
            }
            h0 h0Var = this.E;
            if (h0Var != null) {
                h0Var.setPosition(jP);
                this.E.setBufferedPosition(jX);
            }
            removeCallbacks(this.J);
            int iR = yVar == null ? 1 : yVar.R();
            if (yVar == null || !yVar.isPlaying()) {
                if (iR == 4 || iR == 1) {
                    return;
                }
                postDelayed(this.J, 1000L);
                return;
            }
            h0 h0Var2 = this.E;
            long jMin = Math.min(h0Var2 != null ? h0Var2.getPreferredUpdateDelay() : 1000L, 1000 - (jP % 1000));
            float f10 = yVar.e().f26518a;
            postDelayed(this.J, l0.q(f10 > 0.0f ? (long) (jMin / f10) : 1000L, this.f20160s0, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0() {
        ImageView imageView;
        if (e0() && this.f20148m0 && (imageView = this.f20161t) != null) {
            if (this.f20162t0 == 0) {
                o0(false, imageView);
                return;
            }
            u7.y yVar = this.f20142j0;
            if (yVar == null || !yVar.r(15)) {
                o0(false, this.f20161t);
                this.f20161t.setImageDrawable(this.M);
                this.f20161t.setContentDescription(this.P);
                return;
            }
            o0(true, this.f20161t);
            int iV = yVar.V();
            if (iV == 0) {
                this.f20161t.setImageDrawable(this.M);
                this.f20161t.setContentDescription(this.P);
            } else if (iV == 1) {
                this.f20161t.setImageDrawable(this.N);
                this.f20161t.setContentDescription(this.Q);
            } else {
                if (iV != 2) {
                    return;
                }
                this.f20161t.setImageDrawable(this.O);
                this.f20161t.setContentDescription(this.R);
            }
        }
    }

    private void y0() {
        u7.y yVar = this.f20142j0;
        int iB0 = (int) ((yVar != null ? yVar.b0() : 5000L) / 1000);
        TextView textView = this.f20159s;
        if (textView != null) {
            textView.setText(String.valueOf(iB0));
        }
        View view = this.f20155q;
        if (view != null) {
            view.setContentDescription(this.f20125b.getQuantityString(fa.u.f14837b, iB0, Integer.valueOf(iB0)));
        }
    }

    private void z0() {
        o0(this.f20133f.a(), this.f20173z);
    }

    @Deprecated
    public void S(m mVar) {
        x7.a.e(mVar);
        this.f20129d.add(mVar);
    }

    public boolean U(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        u7.y yVar = this.f20142j0;
        if (yVar == null || !d0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (yVar.R() == 4 || !yVar.r(12)) {
                return true;
            }
            yVar.Y();
            return true;
        }
        if (keyCode == 89 && yVar.r(11)) {
            yVar.Z();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            l0.x0(yVar, this.f20152o0);
            return true;
        }
        if (keyCode == 87) {
            if (!yVar.r(9)) {
                return true;
            }
            yVar.x();
            return true;
        }
        if (keyCode == 88) {
            if (!yVar.r(7)) {
                return true;
            }
            yVar.j();
            return true;
        }
        if (keyCode == 126) {
            l0.w0(yVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        l0.v0(yVar);
        return true;
    }

    public void Y() {
        this.f20123a.C();
    }

    public void Z() {
        this.f20123a.F();
    }

    public boolean c0() {
        return this.f20123a.I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return U(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean e0() {
        return getVisibility() == 0;
    }

    void f0() {
        Iterator<m> it = this.f20129d.iterator();
        while (it.hasNext()) {
            it.next().J(getVisibility());
        }
    }

    public u7.y getPlayer() {
        return this.f20142j0;
    }

    public int getRepeatToggleModes() {
        return this.f20162t0;
    }

    public boolean getShowShuffleButton() {
        return this.f20123a.A(this.f20163u);
    }

    public boolean getShowSubtitleButton() {
        return this.f20123a.A(this.f20167w);
    }

    public int getShowTimeoutMs() {
        return this.f20158r0;
    }

    public boolean getShowVrButton() {
        return this.f20123a.A(this.f20165v);
    }

    @Deprecated
    public void j0(m mVar) {
        this.f20129d.remove(mVar);
    }

    void k0() {
        ImageView imageView = this.f20151o;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    public void m0() {
        this.f20123a.b0();
    }

    void n0() {
        u0();
        t0();
        x0();
        B0();
        D0();
        v0();
        C0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20123a.O();
        this.f20148m0 = true;
        if (c0()) {
            this.f20123a.W();
        }
        n0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20123a.P();
        this.f20148m0 = false;
        removeCallbacks(this.J);
        this.f20123a.V();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f20123a.Q(z10, i10, i11, i12, i13);
    }

    public void s0(boolean z10) {
        if (this.f20146l0 == z10) {
            return;
        }
        this.f20146l0 = z10;
        q0(this.f20169x, z10);
        q0(this.f20171y, z10);
        InterfaceC0331d interfaceC0331d = this.f20144k0;
        if (interfaceC0331d != null) {
            interfaceC0331d.K(z10);
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.f20123a.X(z10);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(InterfaceC0331d interfaceC0331d) {
        this.f20144k0 = interfaceC0331d;
        r0(this.f20169x, interfaceC0331d != null);
        r0(this.f20171y, interfaceC0331d != null);
    }

    public void setPlayer(u7.y yVar) {
        boolean z10 = true;
        x7.a.g(Looper.myLooper() == Looper.getMainLooper());
        if (yVar != null && yVar.v() != Looper.getMainLooper()) {
            z10 = false;
        }
        x7.a.a(z10);
        u7.y yVar2 = this.f20142j0;
        if (yVar2 == yVar) {
            return;
        }
        if (yVar2 != null) {
            yVar2.A(this.f20127c);
        }
        this.f20142j0 = yVar;
        if (yVar != null) {
            yVar.i(this.f20127c);
        }
        n0();
    }

    public void setRepeatToggleModes(int i10) {
        this.f20162t0 = i10;
        u7.y yVar = this.f20142j0;
        if (yVar != null && yVar.r(15)) {
            int iV = this.f20142j0.V();
            if (i10 == 0 && iV != 0) {
                this.f20142j0.T(0);
            } else if (i10 == 1 && iV == 2) {
                this.f20142j0.T(1);
            } else if (i10 == 2 && iV == 1) {
                this.f20142j0.T(2);
            }
        }
        this.f20123a.Y(this.f20161t, i10 != 0);
        x0();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f20123a.Y(this.f20153p, z10);
        t0();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f20150n0 = z10;
        C0();
    }

    public void setShowNextButton(boolean z10) {
        this.f20123a.Y(this.f20149n, z10);
        t0();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        this.f20152o0 = z10;
        u0();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f20123a.Y(this.f20147m, z10);
        t0();
    }

    public void setShowRewindButton(boolean z10) {
        this.f20123a.Y(this.f20155q, z10);
        t0();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f20123a.Y(this.f20163u, z10);
        B0();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f20123a.Y(this.f20167w, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.f20158r0 = i10;
        if (c0()) {
            this.f20123a.W();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f20123a.Y(this.f20165v, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f20160s0 = l0.p(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f20165v;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            o0(onClickListener != null, this.f20165v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: PlayerControlView.java */
    final class j extends l {
        private j() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(View view) {
            if (d.this.f20142j0 == null || !d.this.f20142j0.r(29)) {
                return;
            }
            d.this.f20142j0.y(d.this.f20142j0.w().a().G(3).K(-3).M(null).O(0).F());
            d.this.f20143k.dismiss();
        }

        @Override // io.bidmachine.media3.ui.d.l, androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, int i10) {
            super.onBindViewHolder(iVar, i10);
            if (i10 > 0) {
                iVar.f20190c.setVisibility(this.f20195i.get(i10 + (-1)).a() ? 0 : 4);
            }
        }

        @Override // io.bidmachine.media3.ui.d.l
        public void e(i iVar) {
            boolean z10;
            iVar.f20189b.setText(fa.v.f14861x);
            int i10 = 0;
            while (true) {
                if (i10 >= this.f20195i.size()) {
                    z10 = true;
                    break;
                } else {
                    if (this.f20195i.get(i10).a()) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
            }
            iVar.f20190c.setVisibility(z10 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.media3.ui.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20227a.j(view);
                }
            });
        }

        public void i(List<k> list) {
            boolean z10 = false;
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (list.get(i10).a()) {
                    z10 = true;
                    break;
                }
            }
            if (d.this.f20167w != null) {
                ImageView imageView = d.this.f20167w;
                d dVar = d.this;
                imageView.setImageDrawable(z10 ? dVar.f20126b0 : dVar.f20128c0);
                d.this.f20167w.setContentDescription(z10 ? d.this.f20130d0 : d.this.f20132e0);
            }
            this.f20195i = list;
        }

        @Override // io.bidmachine.media3.ui.d.l
        public void g(String str) {
        }
    }

    public void setProgressUpdateListener(f fVar) {
    }
}
