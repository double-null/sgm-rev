package g2;

import d2.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ClientMetrics.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f15273e = new C0228a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f15274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<d> f15275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f15276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15277d;

    /* JADX INFO: renamed from: g2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ClientMetrics.java */
    public static final class C0228a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f15278a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<d> f15279b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f15280c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f15281d = "";

        C0228a() {
        }

        public C0228a a(d dVar) {
            this.f15279b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f15278a, Collections.unmodifiableList(this.f15279b), this.f15280c, this.f15281d);
        }

        public C0228a c(String str) {
            this.f15281d = str;
            return this;
        }

        public C0228a d(b bVar) {
            this.f15280c = bVar;
            return this;
        }

        public C0228a e(f fVar) {
            this.f15278a = fVar;
            return this;
        }
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f15274a = fVar;
        this.f15275b = list;
        this.f15276c = bVar;
        this.f15277d = str;
    }

    public static C0228a e() {
        return new C0228a();
    }

    public String a() {
        return this.f15277d;
    }

    public b b() {
        return this.f15276c;
    }

    public List<d> c() {
        return this.f15275b;
    }

    public f d() {
        return this.f15274a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
