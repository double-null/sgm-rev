package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.g;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import f1.i;
import i1.c;
import i1.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import m1.p;

/* JADX INFO: compiled from: SystemForegroundDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
public class a implements c, f1.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f3754k = l.f("SystemFgDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f3755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f3756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o1.a f3757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f3758d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f3759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Map<String, g> f3760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map<String, p> f3761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Set<p> f3762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final d f3763i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f3764j;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SystemForegroundDispatcher.java */
    class RunnableC0075a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WorkDatabase f3765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f3766b;

        RunnableC0075a(WorkDatabase workDatabase, String str) {
            this.f3765a = workDatabase;
            this.f3766b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVarG = this.f3765a.B().g(this.f3766b);
            if (pVarG == null || !pVarG.b()) {
                return;
            }
            synchronized (a.this.f3758d) {
                a.this.f3761g.put(this.f3766b, pVarG);
                a.this.f3762h.add(pVarG);
                a aVar = a.this;
                aVar.f3763i.d(aVar.f3762h);
            }
        }
    }

    /* JADX INFO: compiled from: SystemForegroundDispatcher.java */
    interface b {
        void a(int i10, Notification notification);

        void c(int i10, int i11, Notification notification);

        void d(int i10);

        void stop();
    }

    a(Context context) {
        this.f3755a = context;
        i iVarK = i.k(context);
        this.f3756b = iVarK;
        o1.a aVarP = iVarK.p();
        this.f3757c = aVarP;
        this.f3759e = null;
        this.f3760f = new LinkedHashMap();
        this.f3762h = new HashSet();
        this.f3761g = new HashMap();
        this.f3763i = new d(this.f3755a, aVarP, this);
        this.f3756b.m().c(this);
    }

    public static Intent a(Context context, String str, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.a());
        intent.putExtra("KEY_NOTIFICATION", gVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.a());
        intent.putExtra("KEY_NOTIFICATION", gVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void g(Intent intent) {
        l.c().d(f3754k, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f3756b.f(UUID.fromString(stringExtra));
    }

    private void h(Intent intent) {
        int iA = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        l.c().a(f3754k, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f3764j == null) {
            return;
        }
        this.f3760f.put(stringExtra, new g(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f3759e)) {
            this.f3759e = stringExtra;
            this.f3764j.c(intExtra, intExtra2, notification);
            return;
        }
        this.f3764j.a(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator<Map.Entry<String, g>> it = this.f3760f.entrySet().iterator();
        while (it.hasNext()) {
            iA |= it.next().getValue().a();
        }
        g gVar = this.f3760f.get(this.f3759e);
        if (gVar != null) {
            this.f3764j.c(gVar.c(), iA, gVar.b());
        }
    }

    private void i(Intent intent) {
        l.c().d(f3754k, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f3757c.b(new RunnableC0075a(this.f3756b.o(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // i1.c
    public void b(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            l.c().a(f3754k, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f3756b.w(str);
        }
    }

    @Override // f1.b
    public void e(String str, boolean z10) {
        Map.Entry<String, g> entry;
        synchronized (this.f3758d) {
            p pVarRemove = this.f3761g.remove(str);
            if (pVarRemove != null ? this.f3762h.remove(pVarRemove) : false) {
                this.f3763i.d(this.f3762h);
            }
        }
        g gVarRemove = this.f3760f.remove(str);
        if (str.equals(this.f3759e) && this.f3760f.size() > 0) {
            Iterator<Map.Entry<String, g>> it = this.f3760f.entrySet().iterator();
            Map.Entry<String, g> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f3759e = entry.getKey();
            if (this.f3764j != null) {
                g value = entry.getValue();
                this.f3764j.c(value.c(), value.a(), value.b());
                this.f3764j.d(value.c());
            }
        }
        b bVar = this.f3764j;
        if (gVarRemove == null || bVar == null) {
            return;
        }
        l.c().a(f3754k, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(gVarRemove.c()), str, Integer.valueOf(gVarRemove.a())), new Throwable[0]);
        bVar.d(gVarRemove.c());
    }

    void j(Intent intent) {
        l.c().d(f3754k, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f3764j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    void k() {
        this.f3764j = null;
        synchronized (this.f3758d) {
            this.f3763i.e();
        }
        this.f3756b.m().i(this);
    }

    void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
            h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            j(intent);
        }
    }

    void m(b bVar) {
        if (this.f3764j != null) {
            l.c().b(f3754k, "A callback already exists.", new Throwable[0]);
        } else {
            this.f3764j = bVar;
        }
    }

    @Override // i1.c
    public void f(List<String> list) {
    }
}
