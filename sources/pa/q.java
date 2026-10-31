package pa;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f23850b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f23851a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    public q() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        kotlin.jvm.internal.t.e(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        this.f23851a = executorServiceNewSingleThreadExecutor;
    }

    private final Intent b(Intent intent) {
        Intent flags = Intent.createChooser(intent, "").setFlags(268435456);
        kotlin.jvm.internal.t.e(flags, "createChooser(intent, \"\"…t.FLAG_ACTIVITY_NEW_TASK)");
        return flags;
    }

    private final Intent c(io.bidmachine.iab.mraid.v vVar) {
        int i10;
        Intent intentPutExtra = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("title", vVar.g()).putExtra("beginTime", vVar.k().getTime());
        kotlin.jvm.internal.t.e(intentPutExtra, "Intent(Intent.ACTION_INS…CalendarEvent.start.time)");
        Date dateH = vVar.h();
        if (dateH != null) {
            intentPutExtra.putExtra(SDKConstants.PARAM_END_TIME, dateH.getTime());
        }
        String strM = vVar.m();
        if (strM != null) {
            intentPutExtra.putExtra("description", strM);
        }
        String strI = vVar.i();
        if (strI != null) {
            intentPutExtra.putExtra("eventLocation", strI);
        }
        String strL = vVar.l();
        int i11 = 2;
        if (strL != null) {
            if (kotlin.jvm.internal.t.a(strL, "confirmed")) {
                i10 = 1;
            } else {
                i10 = kotlin.jvm.internal.t.a(strL, AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED) ? 2 : 0;
            }
            intentPutExtra.putExtra("eventStatus", i10);
        }
        String strN = vVar.n();
        if (strN != null) {
            if (kotlin.jvm.internal.t.a(strN, "transparent")) {
                i11 = 1;
            } else if (kotlin.jvm.internal.t.a(strN, "opaque")) {
                i11 = 0;
            }
            intentPutExtra.putExtra("availability", i11);
        }
        String strJ = vVar.j();
        if (strJ != null) {
            intentPutExtra.putExtra("rrule", strJ);
        }
        return intentPutExtra;
    }

    private final void d(Context context, Intent intent, wb.i iVar) {
        try {
            context.startActivity(intent);
            qb.h.f(Boolean.TRUE, iVar);
        } catch (Exception e10) {
            t.i(e10);
            qb.h.f(Boolean.FALSE, iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(q this$0, Context applicationContext, Uri uri, wb.i iVar) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(uri, "$uri");
        kotlin.jvm.internal.t.e(applicationContext, "applicationContext");
        this$0.j(applicationContext, uri, iVar);
    }

    private final void h(Context context, final Uri uri, final wb.i iVar) {
        final Context applicationContext = context.getApplicationContext();
        this.f23851a.execute(new Runnable() { // from class: pa.p
            @Override // java.lang.Runnable
            public final void run() {
                q.g(this.f23846a, applicationContext, uri, iVar);
            }
        });
    }

    private final void i(Context context, io.bidmachine.iab.mraid.v vVar, wb.i iVar) {
        d(context, b(c(vVar)), iVar);
    }

    private final void j(Context context, Uri uri, wb.i iVar) {
        wb.m.a(context, uri.toString(), iVar);
    }

    public final void e(Context context, Uri uri, wb.i iVar) {
        kotlin.jvm.internal.t.f(context, "context");
        if (uri == null) {
            t.b("IntentLauncher", "launch - Uri is null", new Object[0]);
            qb.h.f(Boolean.FALSE, iVar);
        } else if (wb.d0.t(uri)) {
            h(context, uri, iVar);
        } else if (uri.getScheme() != null) {
            qb.h.f(Boolean.valueOf(wb.p.j(context, uri.toString())), iVar);
        } else {
            t.b("IntentLauncher", "launch - Invalid uri: %s", uri);
            qb.h.f(Boolean.FALSE, iVar);
        }
    }

    public final void f(Context context, io.bidmachine.iab.mraid.v mraidCalendarEvent, wb.i iVar) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(mraidCalendarEvent, "mraidCalendarEvent");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.t.e(applicationContext, "applicationContext");
        i(applicationContext, mraidCalendarEvent, iVar);
    }
}
