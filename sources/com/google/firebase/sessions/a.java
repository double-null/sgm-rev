package com.google.firebase.sessions;

import android.content.Context;
import b2.i;
import b4.a1;
import b4.b0;
import b4.c0;
import b4.g0;
import b4.h0;
import b4.i0;
import b4.l;
import b4.n0;
import b4.o0;
import b4.p0;
import b4.q0;
import b4.s0;
import b4.t;
import b4.t0;
import b4.u0;
import b4.v0;
import b4.w0;
import b4.y0;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import e0.k;
import e4.h;
import e4.m;
import e4.n;
import zc.j;

/* JADX INFO: compiled from: DaggerFirebaseSessionsComponent.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: compiled from: DaggerFirebaseSessionsComponent.java */
    private static final class b implements com.google.firebase.sessions.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f12290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private j f12291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private j f12292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private FirebaseApp f12293d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private FirebaseInstallationsApi f12294e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Provider<i> f12295f;

        private b() {
        }

        @Override // com.google.firebase.sessions.b.a
        public com.google.firebase.sessions.b build() {
            d4.d.a(this.f12290a, Context.class);
            d4.d.a(this.f12291b, j.class);
            d4.d.a(this.f12292c, j.class);
            d4.d.a(this.f12293d, FirebaseApp.class);
            d4.d.a(this.f12294e, FirebaseInstallationsApi.class);
            d4.d.a(this.f12295f, Provider.class);
            return new c(this.f12290a, this.f12291b, this.f12292c, this.f12293d, this.f12294e, this.f12295f);
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b e(Context context) {
            this.f12290a = (Context) d4.d.b(context);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b d(j jVar) {
            this.f12291b = (j) d4.d.b(jVar);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b f(j jVar) {
            this.f12292c = (j) d4.d.b(jVar);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b c(FirebaseApp firebaseApp) {
            this.f12293d = (FirebaseApp) d4.d.b(firebaseApp);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b a(FirebaseInstallationsApi firebaseInstallationsApi) {
            this.f12294e = (FirebaseInstallationsApi) d4.d.b(firebaseInstallationsApi);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b b(Provider<i> provider) {
            this.f12295f = (Provider) d4.d.b(provider);
            return this;
        }
    }

    /* JADX INFO: compiled from: DaggerFirebaseSessionsComponent.java */
    private static final class c implements com.google.firebase.sessions.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f12296a = this;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d4.e<FirebaseApp> f12297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        d4.e<Context> f12298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        d4.e<e4.b> f12299d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        d4.e<y0> f12300e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        d4.e<FirebaseInstallationsApi> f12301f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        d4.e<b4.b> f12302g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        d4.e<j> f12303h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        d4.e<e4.e> f12304i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        d4.e<j> f12305j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        d4.e<k<h>> f12306k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        d4.e<m> f12307l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        d4.e<e4.d> f12308m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        d4.e<e4.j> f12309n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        d4.e<a1> f12310o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        d4.e<p0> f12311p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        d4.e<Provider<i>> f12312q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        d4.e<b4.g> f12313r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        d4.e<n0> f12314s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        d4.e<h0> f12315t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        d4.e<k<g0>> f12316u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        d4.e<b0> f12317v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        d4.e<v0> f12318w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        d4.e<s0> f12319x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        d4.e<l> f12320y;

        c(Context context, j jVar, j jVar2, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Provider<i> provider) {
            c(context, jVar, jVar2, firebaseApp, firebaseInstallationsApi, provider);
        }

        private void c(Context context, j jVar, j jVar2, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Provider<i> provider) {
            this.f12297b = d4.c.a(firebaseApp);
            d4.b bVarA = d4.c.a(context);
            this.f12298c = bVarA;
            this.f12299d = d4.a.b(e4.c.a(bVarA));
            this.f12300e = d4.a.b(f.a());
            this.f12301f = d4.c.a(firebaseInstallationsApi);
            this.f12302g = d4.a.b(com.google.firebase.sessions.c.b(this.f12297b));
            d4.b bVarA2 = d4.c.a(jVar2);
            this.f12303h = bVarA2;
            this.f12304i = d4.a.b(e4.f.a(this.f12302g, bVarA2));
            this.f12305j = d4.c.a(jVar);
            d4.e<k<h>> eVarB = d4.a.b(d.a(this.f12298c, this.f12303h));
            this.f12306k = eVarB;
            d4.e<m> eVarB2 = d4.a.b(n.a(this.f12305j, this.f12300e, eVarB));
            this.f12307l = eVarB2;
            d4.e<e4.d> eVarB3 = d4.a.b(e4.g.a(this.f12300e, this.f12301f, this.f12302g, this.f12304i, eVarB2));
            this.f12308m = eVarB3;
            this.f12309n = d4.a.b(e4.k.a(this.f12299d, eVarB3));
            d4.e<a1> eVarB4 = d4.a.b(g.a());
            this.f12310o = eVarB4;
            this.f12311p = d4.a.b(q0.a(this.f12300e, eVarB4));
            d4.b bVarA3 = d4.c.a(provider);
            this.f12312q = bVarA3;
            d4.e<b4.g> eVarB5 = d4.a.b(b4.i.a(bVarA3));
            this.f12313r = eVarB5;
            this.f12314s = d4.a.b(o0.a(this.f12297b, this.f12301f, this.f12309n, eVarB5, this.f12305j));
            d4.e<h0> eVarB6 = d4.a.b(i0.a(this.f12311p));
            this.f12315t = eVarB6;
            this.f12316u = d4.a.b(e.a(this.f12298c, this.f12303h, eVarB6));
            d4.e<b0> eVarB7 = d4.a.b(c0.a(this.f12298c, this.f12310o));
            this.f12317v = eVarB7;
            d4.e<v0> eVarB8 = d4.a.b(w0.a(this.f12309n, this.f12311p, this.f12314s, this.f12300e, this.f12316u, eVarB7, this.f12305j));
            this.f12318w = eVarB8;
            d4.e<s0> eVarB9 = d4.a.b(t0.a(eVarB8));
            this.f12319x = eVarB9;
            this.f12320y = d4.a.b(t.a(this.f12297b, this.f12309n, this.f12305j, eVarB9));
        }

        @Override // com.google.firebase.sessions.b
        public u0 a() {
            return this.f12318w.get();
        }

        @Override // com.google.firebase.sessions.b
        public l b() {
            return this.f12320y.get();
        }
    }

    public static com.google.firebase.sessions.b.a a() {
        return new b();
    }
}
