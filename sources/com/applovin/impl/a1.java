package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f5897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5898b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f5900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f5901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private w0 f5902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private v0.c f5903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w0 f5904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Dialog f5905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f5906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f5907k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5908l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u0 f5899c = new u0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private v0.b f5909m = new v0.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.applovin.impl.b f5910n = new a();

    class a extends com.applovin.impl.b {
        a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || a1.this.f5904h == null) {
                return;
            }
            if (a1.this.f5905i != null) {
                a1 a1Var = a1.this;
                if (!com.applovin.impl.d.d(a1Var.a(a1Var.f5905i))) {
                    a1.this.f5905i.dismiss();
                }
                a1.this.f5905i = null;
            }
            w0 w0Var = a1.this.f5904h;
            a1.this.f5904h = null;
            a1 a1Var2 = a1.this;
            a1Var2.a(a1Var2.f5902f, w0Var, activity);
        }
    }

    class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f5912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y0 f5913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f5914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f5915d;

        b(boolean z10, y0 y0Var, w0 w0Var, Activity activity) {
            this.f5912a = z10;
            this.f5913b = y0Var;
            this.f5914c = w0Var;
            this.f5915d = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            a1.this.f5904h = null;
            a1.this.f5905i = null;
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - a1.this.f5908l));
            CollectionUtils.putStringIfValid("details", String.valueOf(this.f5912a), mapHashMap);
            a1.this.f5897a.x0().d(f2.f6513q, mapHashMap);
            w0 w0VarA = a1.this.a(this.f5913b.a());
            if (w0VarA == null) {
                a1.this.a("Destination state for TOS/PP alert is null");
                return;
            }
            a1.this.a(this.f5914c, w0VarA, this.f5915d);
            if (w0VarA.d() != w0.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    class c extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f5917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f5918b;

        c(Uri uri, Activity activity) {
            this.f5917a = uri;
            this.f5918b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            q7.a(this.f5917a, this.f5918b, a1.this.f5897a);
        }
    }

    class d extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f5920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f5921b;

        d(Uri uri, Activity activity) {
            this.f5920a = uri;
            this.f5921b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            q7.a(this.f5920a, this.f5921b, a1.this.f5897a);
        }
    }

    class e implements CmpServiceImpl.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f5923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f5924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f5925c;

        e(long j10, w0 w0Var, Activity activity) {
            this.f5923a = j10;
            this.f5924b = w0Var;
            this.f5925c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            a1.this.f5909m.a(appLovinCmpError);
            a1.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f5923a);
            a1.this.a(this.f5924b, this.f5925c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    class f implements CmpServiceImpl.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f5927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f5928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f5929c;

        f(long j10, w0 w0Var, Activity activity) {
            this.f5927a = j10;
            this.f5928b = w0Var;
            this.f5929c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            a1.this.f5909m.a(appLovinCmpError);
            a1.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f5927a);
            a1.this.a(this.f5928b, this.f5929c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    class g implements CmpServiceImpl.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f5931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f5932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f5933c;

        g(long j10, w0 w0Var, Activity activity) {
            this.f5931a = j10;
            this.f5932b = w0Var;
            this.f5933c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
        public void a(AppLovinCmpError appLovinCmpError) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f5931a));
            if (appLovinCmpError != null) {
                a1.this.f5909m.a(appLovinCmpError);
                mapHashMap.putAll(a1.this.a(appLovinCmpError));
                a1.this.f5897a.x0().d(f2.f6523v, mapHashMap);
            } else {
                a1.this.f5909m.c();
                a1.this.f5897a.x0().d(f2.f6525w, mapHashMap);
            }
            a1.this.b(this.f5932b, this.f5933c);
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f5935a;

        h(w0 w0Var) {
            this.f5935a = w0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            a1 a1Var = a1.this;
            a1Var.a(a1Var.f5902f, this.f5935a, a1.this.f5897a.w0());
        }
    }

    public a1(com.applovin.impl.sdk.l lVar) {
        this.f5897a = lVar;
        this.f5898b = ((Integer) lVar.a(z4.f9285l7)).intValue();
    }

    private void c(final w0 w0Var, final Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.t8
            @Override // java.lang.Runnable
            public final void run() {
                this.f8831a.a(w0Var, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(w0 w0Var, Activity activity) {
        a(w0Var, activity, (Boolean) null);
    }

    private void b() {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f5906j));
        CollectionUtils.putStringIfValid("details", this.f5899c.toString(), mapHashMap);
        this.f5897a.x0().d(f2.f6527x, mapHashMap);
        this.f5900d = null;
        this.f5902f = null;
        this.f5906j = 0L;
        this.f5907k = 0L;
        this.f5908l = 0L;
        this.f5899c.a();
        this.f5897a.e().b(this.f5910n);
        v0.c cVar = this.f5903g;
        if (cVar != null) {
            cVar.a(this.f5909m);
            this.f5903g = null;
        }
        this.f5909m = new v0.b();
    }

    public void a(Activity activity, v0.c cVar) {
        a(w0.a.IS_AL_GDPR.b(), activity, cVar);
    }

    public void a(int i10, Activity activity, v0.c cVar) {
        if (this.f5900d != null) {
            this.f5897a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f5897a.Q().a("ConsentFlowStateMachine", "Unable to start states: " + this.f5900d);
            }
            this.f5897a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f5897a.Q().a("ConsentFlowStateMachine", "Consent flow already in progress for states: " + this.f5900d);
            }
            cVar.a(new v0.b(new t0(t0.f8751d, "Consent flow is already in progress.")));
            return;
        }
        List listA = b1.a(this.f5897a);
        this.f5900d = listA;
        this.f5901e = String.valueOf(listA);
        this.f5903g = cVar;
        w0 w0VarA = a(i10);
        this.f5897a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f5897a.Q().a("ConsentFlowStateMachine", "Starting consent flow with states: " + this.f5900d + "\nInitial state: " + w0VarA);
        }
        com.applovin.impl.sdk.l.a(activity).a(this.f5910n);
        this.f5897a.x0().a(f2.f6509o);
        this.f5906j = SystemClock.elapsedRealtime();
        a((w0) null, w0VarA, activity);
    }

    public boolean a() {
        return this.f5900d != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(w0 w0Var, Activity activity, Boolean bool) {
        a(w0Var, a(w0Var.a(bool)), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(w0 w0Var, w0 w0Var2, Activity activity) {
        this.f5902f = w0Var;
        c(w0Var2, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(w0 w0Var, final Activity activity) {
        boolean z10;
        SpannableString spannableString;
        if (w0Var == null) {
            a("Consent flow state is null");
            return;
        }
        this.f5897a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f5897a.Q().a("ConsentFlowStateMachine", "Transitioning to state: " + w0Var);
        }
        long jElapsedRealtime = this.f5902f != null ? SystemClock.elapsedRealtime() - this.f5907k : 0L;
        this.f5907k = SystemClock.elapsedRealtime();
        this.f5899c.a(w0Var, jElapsedRealtime);
        if (w0Var.d() == w0.b.ALERT) {
            if (com.applovin.impl.d.d(activity)) {
                a(w0Var);
                return;
            }
            this.f5897a.G().trackEvent("cf_start");
            x0 x0Var = (x0) w0Var;
            this.f5904h = x0Var;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            Uri uriH = this.f5897a.y().h();
            final boolean z11 = uriH != null;
            for (y0 y0Var : x0Var.f()) {
                b bVar = new b(z11, y0Var, w0Var, activity);
                if (y0Var.c() == y0.a.POSITIVE) {
                    builder.setPositiveButton(y0Var.d(), bVar);
                } else if (y0Var.c() == y0.a.NEGATIVE) {
                    builder.setNegativeButton(y0Var.d(), bVar);
                } else {
                    builder.setNeutralButton(y0Var.d(), bVar);
                }
            }
            String strH = x0Var.h();
            if (StringUtils.isValidString(strH)) {
                spannableString = new SpannableString(strH);
                String strA = com.applovin.impl.sdk.l.a(R.string.applovin_terms_of_service_text);
                String strA2 = com.applovin.impl.sdk.l.a(R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(strH, Arrays.asList(strA, strA2))) {
                    if (z11) {
                        StringUtils.addLinks(spannableString, Pattern.compile(strA), new c(uriH, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(strA2), new d(this.f5897a.y().f(), activity), true);
                }
            } else {
                spannableString = null;
            }
            final AlertDialog alertDialogCreate = builder.setTitle(spannableString).setMessage(x0Var.g()).create();
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.s8
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f8176a.a(alertDialogCreate, activity, z11, dialogInterface);
                }
            });
            this.f5905i = alertDialogCreate;
            alertDialogCreate.show();
            this.f5909m.d();
            return;
        }
        if (w0Var.d() == w0.b.POST_ALERT) {
            if (this.f5897a.y().k() && this.f5897a.y().m()) {
                if (com.applovin.impl.d.d(activity)) {
                    a(w0Var);
                    return;
                } else {
                    this.f5897a.x0().a(f2.f6515r);
                    this.f5897a.t().loadCmp(activity, new e(SystemClock.elapsedRealtime(), w0Var, activity));
                    return;
                }
            }
            a(w0Var, activity, Boolean.FALSE);
            return;
        }
        if (w0Var.d() == w0.b.EVENT) {
            z0 z0Var = (z0) w0Var;
            String strG = z0Var.g();
            Map<String, ?> mapF = z0Var.f();
            if (mapF == null) {
                mapF = new HashMap<>(1);
            }
            mapF.put("flow_type", "unified");
            this.f5897a.G().trackEvent(strG, mapF);
            b(z0Var, activity);
            return;
        }
        if (w0Var.d() == w0.b.CMP_LOAD) {
            if (com.applovin.impl.d.d(activity)) {
                a(w0Var);
                return;
            } else if (this.f5897a.y().m()) {
                this.f5897a.t().preloadCmp(activity);
                a(w0Var, activity, Boolean.FALSE);
                return;
            } else {
                this.f5897a.x0().a(f2.f6515r);
                this.f5897a.t().loadCmp(activity, new f(SystemClock.elapsedRealtime(), w0Var, activity));
                return;
            }
        }
        if (w0Var.d() == w0.b.CMP_SHOW) {
            if (com.applovin.impl.d.d(activity)) {
                a(w0Var);
                return;
            }
            if (!this.f5897a.y().m()) {
                this.f5897a.G().trackEvent("cf_start");
            }
            this.f5897a.x0().a(f2.f6521u);
            this.f5897a.t().showCmp(activity, new g(SystemClock.elapsedRealtime(), w0Var, activity));
            return;
        }
        if (w0Var.d() == w0.b.f8989g) {
            w0.a aVarA = w0Var.a();
            if (aVarA == w0.a.IS_AL_GDPR) {
                boolean zK = this.f5897a.y().k();
                this.f5899c.a(w0Var, zK, jElapsedRealtime);
                a(w0Var, activity, Boolean.valueOf(zK));
                return;
            } else if (aVarA == w0.a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT) {
                z10 = (this.f5897a.B0() ^ true) || ((Boolean) this.f5897a.a(b5.f6149t, Boolean.FALSE)).booleanValue();
                this.f5899c.a(w0Var, z10, jElapsedRealtime);
                a(w0Var, activity, Boolean.valueOf(z10));
                return;
            } else {
                if (aVarA != w0.a.HAS_TERMS_OF_SERVICE_URI) {
                    a("Invalid consent flow decision type: " + aVarA);
                    return;
                }
                z10 = this.f5897a.y().h() != null;
                this.f5899c.a(w0Var, z10, jElapsedRealtime);
                a(w0Var, activity, Boolean.valueOf(z10));
                return;
            }
        }
        if (w0Var.d() == w0.b.REINIT) {
            b();
            return;
        }
        a("Invalid consent flow destination state: " + w0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AlertDialog alertDialog, Activity activity, boolean z10, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.f5898b);
        textView.setMinHeight(AppLovinSdkUtils.dpToPx(activity, 48));
        this.f5908l = SystemClock.elapsedRealtime();
        this.f5897a.x0().d(f2.f6511p, CollectionUtils.hashMap("details", String.valueOf(z10)));
    }

    private void a(w0 w0Var) {
        this.f5899c.b();
        AppLovinSdkUtils.runOnUiThreadDelayed(new h(w0Var), TimeUnit.SECONDS.toMillis(1L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        m1.a(str, new Object[0]);
        this.f5897a.E().a(f2.X0, str, CollectionUtils.hashMap("details", "Last started states: " + this.f5901e + "\nLast successful state: " + this.f5902f));
        this.f5899c.b(str);
        v0.b bVar = this.f5909m;
        if (bVar != null) {
            bVar.a(new t0(t0.f8752e, str));
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public w0 a(int i10) {
        List<w0> list = this.f5900d;
        if (list == null) {
            return null;
        }
        for (w0 w0Var : list) {
            if (i10 == w0Var.c()) {
                return w0Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity a(Dialog dialog) {
        Context context = dialog.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinCmpError appLovinCmpError, long j10) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(j10));
        if (appLovinCmpError == null) {
            this.f5897a.x0().d(f2.f6517s, mapHashMap);
        } else {
            mapHashMap.putAll(a(appLovinCmpError));
            this.f5897a.x0().d(f2.f6519t, mapHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(AppLovinCmpError appLovinCmpError) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", appLovinCmpError.getMessage());
        CollectionUtils.putStringIfValid("mediated_network_error_message", appLovinCmpError.getCmpMessage(), mapHashMap);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinCmpError.getCode().getValue()), mapHashMap);
        CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(appLovinCmpError.getCmpCode()), mapHashMap);
        return mapHashMap;
    }
}
