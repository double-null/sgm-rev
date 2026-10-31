package io.bidmachine.core;

/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f17528a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile rc.c f17529b = new rc.a("BidMachineLog");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile rc.c f17530c = new rc.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static volatile rc.c f17531d = f17530c;

    public static void a(Object obj, String str) {
        f17531d.e(obj, str);
    }

    public static void b(Object obj, qc.b<String> bVar) {
        f17531d.i(obj, bVar);
    }

    public static void c(String str) {
        f17531d.b(str);
    }

    public static void d(qc.b<String> bVar) {
        f17531d.d(bVar);
    }

    public static void e(Object obj, qc.b<String> bVar) {
        f17531d.k(obj, bVar);
    }

    public static void f(String str) {
        f17531d.h(str);
    }

    public static void g(qc.b<String> bVar) {
        f17531d.c(bVar);
    }

    public static boolean h() {
        return f17528a;
    }

    public static void i(rc.c cVar) {
        f17529b = cVar;
        j(f17528a);
    }

    public static void j(boolean z10) {
        f17528a = z10;
        f17531d = z10 ? f17529b : f17530c;
        bc.d.b(z10);
    }

    public static void k(Object obj, String str) {
        f17531d.l(obj, str);
    }

    public static void l(Object obj, Throwable th) {
        f17531d.j(obj, th);
    }

    public static void m(Object obj, qc.b<String> bVar) {
        f17531d.m(obj, bVar);
    }

    public static void n(String str) {
        f17531d.g(str);
    }

    public static void o(Throwable th) {
        f17531d.f(th);
    }

    public static void p(qc.b<String> bVar) {
        f17531d.a(bVar);
    }
}
