package lb;

/* JADX INFO: loaded from: classes5.dex */
public interface a {

    /* JADX INFO: renamed from: lb.a$a, reason: collision with other inner class name */
    public enum EnumC0355a {
        LoadingStarted,
        Loaded,
        FailedToLoad,
        ShowInitiated,
        ViewabilityShow,
        Shown,
        FailedToShow,
        Clicked,
        Appeared,
        Disappeared,
        Finished,
        Expired,
        Destroyed
    }

    public interface b {
        void a(a aVar, EnumC0355a enumC0355a);
    }

    boolean a();

    boolean a(boolean z10);

    boolean b();

    boolean b(boolean z10);

    boolean c();

    boolean d();

    void destroy();

    boolean e();

    boolean f();

    boolean g();

    boolean h();

    boolean i();

    boolean j();

    boolean k();

    void l();

    void l(b bVar);

    void m(b bVar);

    boolean m();

    boolean n();

    boolean o();

    boolean r();

    void s();
}
