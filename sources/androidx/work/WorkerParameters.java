package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UUID f3598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f3599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f3600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f3601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Executor f3603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o1.a f3604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private x f3605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private q f3606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f3607j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<String> f3608a = Collections.emptyList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<Uri> f3609b = Collections.emptyList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Network f3610c;
    }

    public WorkerParameters(UUID uuid, e eVar, Collection<String> collection, a aVar, int i10, Executor executor, o1.a aVar2, x xVar, q qVar, h hVar) {
        this.f3598a = uuid;
        this.f3599b = eVar;
        this.f3600c = new HashSet(collection);
        this.f3601d = aVar;
        this.f3602e = i10;
        this.f3603f = executor;
        this.f3604g = aVar2;
        this.f3605h = xVar;
        this.f3606i = qVar;
        this.f3607j = hVar;
    }

    public Executor a() {
        return this.f3603f;
    }

    public h b() {
        return this.f3607j;
    }

    public UUID c() {
        return this.f3598a;
    }

    public e d() {
        return this.f3599b;
    }

    public Network e() {
        return this.f3601d.f3610c;
    }

    public q f() {
        return this.f3606i;
    }

    public int g() {
        return this.f3602e;
    }

    public Set<String> h() {
        return this.f3600c;
    }

    public o1.a i() {
        return this.f3604g;
    }

    public List<String> j() {
        return this.f3601d.f3608a;
    }

    public List<Uri> k() {
        return this.f3601d.f3609b;
    }

    public x l() {
        return this.f3605h;
    }
}
