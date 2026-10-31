package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class q3 extends u2 implements AppLovinCommunicatorSubscriber, b0.a {
    private List A;
    private List B;
    private List C;
    private List D;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.l f7948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f7949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f7950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f7951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f7952i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f7953j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f7954k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f7955l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f7956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final StringBuilder f7957n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f7958o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f7959p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f7960q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f7961r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List f7962s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f7963t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List f7964u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List f7965v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List f7966w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List f7967x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List f7968y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List f7969z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7970a;

        static {
            int[] iArr = new int[b0.b.values().length];
            f7970a = iArr;
            try {
                iArr[b0.b.APP_DETAILS_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7970a[b0.b.INVALID_DEVELOPER_URI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7970a[b0.b.APPADSTXT_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7970a[b0.b.MISSING_APPLOVIN_ENTRIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7970a[b0.b.MISSING_NON_APPLOVIN_ENTRIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    private enum c {
        SUCCESS,
        WARNING,
        ERROR
    }

    public enum d {
        CMP,
        NETWORK_CONSENT_STATUSES,
        DO_NOT_SELL,
        COUNT
    }

    public enum e {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        EVENTS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public q3(Context context) {
        super(context);
        this.f7957n = new StringBuilder("");
        this.f7958o = new AtomicBoolean();
        this.f7960q = new ArrayList();
        this.f7961r = new ArrayList();
        this.f7962s = new ArrayList();
        this.f7963t = new ArrayList();
        this.f7964u = new ArrayList();
        this.f7965v = new ArrayList();
        this.f7966w = new ArrayList();
        this.f7967x = new ArrayList();
        this.f7968y = new ArrayList();
        this.f7969z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    private void A() {
        StringBuilder sb2 = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb2.append("\n========== APP INFO ==========");
        sb2.append("\nDev Build - " + q7.c(this.f7948e));
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\nTest Mode - ");
        sb3.append(this.f7948e.u0().c() ? "enabled" : "disabled");
        sb2.append(sb3.toString());
        sb2.append("\nTarget SDK - " + this.f7948e.B().G().get("target_sdk"));
        sb2.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f7948e.a(z4.R3);
        String strB = j.b();
        sb2.append("\nSDK Version - " + str);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("\nPlugin Version - ");
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb4.append(str2);
        sb2.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("\nAd Review Version - ");
        if (!StringUtils.isValidString(strB)) {
            strB = "Disabled";
        }
        sb5.append(strB);
        sb2.append(sb5.toString());
        if (this.f7948e.J0()) {
            String strA = q7.a(this.f7948e.p0());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("\nUnity Version - ");
            sb6.append(StringUtils.isValidString(strA) ? strA : "None");
            sb2.append(sb6.toString());
        }
        sb2.append("\n========== PRIVACY ==========");
        sb2.append(q0.a(this.f8861a));
        sb2.append(this.f7948e.y().e());
        sb2.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb2.append(this.f7948e.t0().i());
        sb2.append("\n========== NETWORK CONSENT STATUSES ==========");
        Iterator it = d().iterator();
        while (it.hasNext()) {
            sb2.append(((d7) it.next()).e());
        }
        sb2.append("\n========== NETWORKS ==========");
        Iterator it2 = this.f7961r.iterator();
        while (it2.hasNext()) {
            a(sb2, ((g3) it2.next()).j());
        }
        Iterator it3 = this.f7960q.iterator();
        while (it3.hasNext()) {
            a(sb2, ((g3) it3.next()).j());
        }
        sb2.append("\n========== AD UNITS ==========");
        Iterator it4 = this.f7950g.iterator();
        while (it4.hasNext()) {
            a(sb2, ((n) it4.next()).e());
        }
        sb2.append("\n========== END ==========");
        com.applovin.impl.sdk.p.g("MediationDebuggerListAdapter", sb2.toString());
        this.f7957n.append(sb2.toString());
    }

    private List g() {
        boolean zC = this.f7948e.u0().c();
        List listB = this.f7948e.u0().b();
        return zC ? a((String) null, a(listB, false)) : a(a(listB, true), (String) null);
    }

    private List j() {
        ArrayList arrayList = new ArrayList(7);
        PackageInfo packageInfoA = q7.a(this.f8861a, 0);
        String str = packageInfoA != null ? packageInfoA.versionName : null;
        arrayList.add(t2.a().d("Package Name").c(this.f8861a.getPackageName()).a());
        t2.b bVarD = t2.a().d("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(t2.a().d("OS").c(q7.d()).a());
        arrayList.add(t2.a().d("Account").c(StringUtils.isValidString(this.f7955l) ? this.f7955l : "None").a());
        arrayList.add(t2.a().d("Mediation Provider").c(StringUtils.isValidString(this.f7948e.X()) ? this.f7948e.X() : "None").a());
        arrayList.add(t2.a().d("OM SDK Version").c(this.f7948e.g0().c()).a());
        arrayList.add(a(com.applovin.impl.sdk.l.H0()));
        return arrayList;
    }

    private t2 l() {
        String strD = this.f7948e.t0().d();
        boolean zIsValidString = StringUtils.isValidString(strD);
        boolean zIsValidString2 = StringUtils.isValidString(this.f7948e.t0().j());
        t2.b bVarD = t2.a(t2.c.DETAIL).d("CMP (Consent Management Platform)");
        if (!zIsValidString) {
            strD = zIsValidString2 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "None";
        }
        t2.b bVarC = bVarD.c(strD);
        if (this.f7956m) {
            bVarC.a(true);
            if (zIsValidString2) {
                bVarC.a(this.f8861a);
            } else {
                bVarC.b("TC Data Not Found");
                bVarC.a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                boolean z10 = this.f7948e.w().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                bVarC.a(z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning);
                bVarC.b(this.f8861a.getColor(z10 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor));
            }
        }
        return bVarC.a();
    }

    private t2 m() {
        return t2.a().d("MAX Terms and Privacy Policy Flow").a(this.f8861a).a(true).a();
    }

    private List n() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(t2.a().d("View Axon Events").a(this.f8861a).a(true).a());
        return arrayList;
    }

    private t2 o() {
        boolean zHasSupportedCmp = this.f7948e.t().hasSupportedCmp();
        return t2.a().d("Google UMP SDK").a(zHasSupportedCmp ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(this.f8861a.getColor(zHasSupportedCmp ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor)).b("Google UMP SDK").a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow").a(!zHasSupportedCmp).a();
    }

    private List r() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(t2.a().d("SDK Version").c(AppLovinSdk.VERSION).a());
        String str = (String) this.f7948e.a(z4.R3);
        t2.b bVarD = t2.a().d("Plugin Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(e());
        if (this.f7948e.J0()) {
            String strA = q7.a(this.f7948e.p0());
            arrayList.add(b("Unity Version", StringUtils.isValidString(strA) ? strA : "None"));
        }
        if (this.f7948e.y().j()) {
            arrayList.add(m());
            arrayList.add(o());
        } else if (this.f7948e.y().l()) {
            arrayList.add(v());
        }
        return arrayList;
    }

    private t2 s() {
        return t2.a().d("Network Consent Statuses").a(this.f8861a).a(true).a();
    }

    private List t() {
        ArrayList arrayList = new ArrayList(d.COUNT.ordinal());
        arrayList.add(l());
        if (StringUtils.isValidString(this.f7948e.t0().j())) {
            arrayList.add(s());
        } else {
            arrayList.add(new t4(q0.b(), false, this.f8861a));
        }
        arrayList.add(new t4(q0.a(), true, this.f8861a));
        return arrayList;
    }

    private t2 v() {
        return t2.a().d("Terms Flow").a(R.drawable.applovin_ic_x_mark).b(this.f8861a.getColor(R.color.applovin_sdk_xmarkColor)).b("Terms Flow has been replaced").a(this.f7948e.y().g()).a(true).a();
    }

    public boolean a(t2 t2Var) {
        if (t2Var.k() == null) {
            return false;
        }
        return "MAX Terms and Privacy Policy Flow".equals(t2Var.k().toString());
    }

    public void b(boolean z10) {
        this.f7959p = z10;
    }

    @Override // com.applovin.impl.u2
    protected List c(int i10) {
        if (i10 == e.APP_INFO.ordinal()) {
            return this.f7966w;
        }
        if (i10 == e.MAX.ordinal()) {
            return this.f7967x;
        }
        if (i10 == e.PRIVACY.ordinal()) {
            return this.f7968y;
        }
        if (i10 == e.ADS.ordinal()) {
            return this.f7969z;
        }
        if (i10 == e.EVENTS.ordinal()) {
            return this.A;
        }
        if (i10 == e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.B;
        }
        return i10 == e.COMPLETED_NETWORKS.ordinal() ? this.C : this.D;
    }

    public List d() {
        ArrayList<d7> arrayList = new ArrayList();
        Iterator it = this.f7949f.iterator();
        while (it.hasNext()) {
            arrayList.add(((g3) it.next()).t());
        }
        String strK = this.f7948e.t0().k();
        if (strK != null) {
            String strC = this.f7948e.t0().c();
            for (d7 d7Var : arrayList) {
                if (d7Var.f() == d7.a.TCF_VENDOR && d7Var.d() != null) {
                    d7Var.a(Boolean.valueOf(f7.a(strK, d7Var.d().intValue() - 1)));
                } else if (d7Var.f() == d7.a.ATP_NETWORK && d7Var.d() != null) {
                    d7Var.a(f7.a(d7Var.d().intValue(), strC));
                }
            }
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((d7) it2.next()).a(null);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.u2
    protected t2 e(int i10) {
        if (i10 == e.APP_INFO.ordinal()) {
            return new x4("APP INFO");
        }
        if (i10 == e.MAX.ordinal()) {
            return new x4("MAX");
        }
        if (i10 == e.PRIVACY.ordinal()) {
            return new x4("PRIVACY");
        }
        if (i10 == e.ADS.ordinal()) {
            return new x4("ADS");
        }
        if (i10 == e.EVENTS.ordinal()) {
            return new x4("EVENTS");
        }
        if (i10 == e.INCOMPLETE_NETWORKS.ordinal()) {
            return new x4("INCOMPLETE SDK INTEGRATIONS");
        }
        return i10 == e.COMPLETED_NETWORKS.ordinal() ? new x4("COMPLETED SDK INTEGRATIONS") : new x4("MISSING SDK INTEGRATIONS");
    }

    public List f() {
        return this.f7950g;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String h() {
        return this.f7954k;
    }

    public String i() {
        return this.f7953j;
    }

    public List k() {
        return this.f7963t;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f7968y = t();
            c();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.B = a(this.f7960q);
            this.C = a(this.f7961r);
            c();
        } else if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f7969z = a(a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (String) null);
            c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f7969z = a((String) null, a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            c();
        }
    }

    public List p() {
        return this.f7951h;
    }

    public String q() {
        return this.f7957n.toString();
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f7958o.get() + "}";
    }

    public com.applovin.impl.sdk.l u() {
        return this.f7948e;
    }

    public List w() {
        return this.f7965v;
    }

    public List x() {
        return this.f7964u;
    }

    public boolean y() {
        return this.f7959p;
    }

    public boolean z() {
        return this.f7958o.get();
    }

    @Override // com.applovin.impl.u2
    protected int b() {
        return e.COUNT.ordinal();
    }

    private void b(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o oVarF = ((n) it.next()).f();
            Iterator it2 = oVarF.a().iterator();
            while (it2.hasNext()) {
                hashSet.add(((k8) it2.next()).b());
            }
            Iterator it3 = oVarF.e().iterator();
            while (it3.hasNext()) {
                hashSet2.add(((k8) it3.next()).b());
            }
        }
        this.f7963t = new ArrayList(hashSet);
        this.f7964u = new ArrayList(hashSet2);
        Collections.sort(this.f7963t);
        Collections.sort(this.f7964u);
    }

    public void a(List list, List list2, List list3, List list4, String str, String str2, String str3, boolean z10, com.applovin.impl.sdk.l lVar) {
        this.f7948e = lVar;
        this.f7949f = list;
        this.f7950g = list2;
        this.f7951h = list3;
        this.f7952i = list4;
        this.f7953j = str;
        this.f7954k = str2;
        this.f7955l = str3;
        this.f7956m = z10;
        if (list != null && this.f7958o.compareAndSet(false, true)) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("MediationDebuggerListAdapter", "Populating networks...");
            }
            c(list);
            b(list2);
            d(this.f7961r);
            this.f7966w.addAll(j());
            this.f7967x.addAll(r());
            this.f7968y.addAll(t());
            this.f7969z.addAll(g());
            this.A.addAll(n());
            this.B = a(this.f7960q);
            this.C = a(this.f7961r);
            this.D = a(this.f7962s);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            AppLovinCommunicator.getInstance(this.f8861a).subscribe(this, arrayList);
            A();
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.zd
            @Override // java.lang.Runnable
            public final void run() {
                this.f9436a.notifyDataSetChanged();
            }
        });
    }

    @Override // com.applovin.impl.u2
    protected int d(int i10) {
        if (i10 == e.APP_INFO.ordinal()) {
            return this.f7966w.size();
        }
        if (i10 == e.MAX.ordinal()) {
            return this.f7967x.size();
        }
        if (i10 == e.PRIVACY.ordinal()) {
            return this.f7968y.size();
        }
        if (i10 == e.ADS.ordinal()) {
            return this.f7969z.size();
        }
        if (i10 == e.EVENTS.ordinal()) {
            if (this.f7948e.G().isAxonEventTracked()) {
                return this.A.size();
            }
            return 0;
        }
        if (i10 == e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.B.size();
        }
        if (i10 == e.COMPLETED_NETWORKS.ordinal()) {
            return this.C.size();
        }
        return this.D.size();
    }

    private t2 b(String str, String str2) {
        t2.b bVarD = t2.a().d(str);
        if (StringUtils.isValidString(str2)) {
            bVarD.c(str2);
        } else {
            bVarD.a(R.drawable.applovin_ic_x_mark);
            bVarD.b(this.f8861a.getColor(R.color.applovin_sdk_xmarkColor));
        }
        return bVarD.a();
    }

    private void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g3 g3Var = (g3) it.next();
            if (!g3Var.G()) {
                if (g3Var.q() != g3.a.INCOMPLETE_INTEGRATION && g3Var.q() != g3.a.INVALID_INTEGRATION) {
                    if (g3Var.q() == g3.a.COMPLETE) {
                        this.f7961r.add(g3Var);
                    } else if (g3Var.q() == g3.a.MISSING) {
                        this.f7962s.add(g3Var);
                    }
                } else {
                    this.f7960q.add(g3Var);
                }
            }
        }
    }

    private t2 e() {
        String string;
        t2.b bVarD = t2.a().d("Ad Review Version");
        String strB = j.b();
        if (StringUtils.isValidString(strB)) {
            String strA = j.a();
            if (!StringUtils.isValidString(strA) || strA.equals(this.f7948e.k0())) {
                string = null;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MAX Ad Review integrated with wrong SDK key. Please check that your ");
                sb2.append(this.f7948e.J0() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated");
                sb2.append(" from the correct account.");
                string = sb2.toString();
            }
        } else {
            string = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.";
        }
        if (string != null) {
            bVarD.b("MAX Ad Review").a(string).a(R.drawable.applovin_ic_x_mark).b(this.f8861a.getColor(R.color.applovin_sdk_xmarkColor)).a(true);
        } else {
            bVarD.c(strB);
        }
        return bVarD.a();
    }

    private t2 b(String str) {
        t2.b bVarA = t2.a();
        if (this.f7948e.u0().c()) {
            bVarA.a(this.f8861a);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StringUtils.isValidString(str) ? "" : "Select ");
        sb2.append("Test Mode Network");
        t2.b bVarD = bVarA.d(sb2.toString());
        if (!this.f7948e.u0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g3 g3Var = (g3) it.next();
            if (g3Var.y() == g3.b.READY) {
                this.f7965v.add(g3Var);
            }
        }
    }

    @Override // com.applovin.impl.b0.a
    public void a(z zVar, String str) {
        String strA;
        c cVarA;
        c cVar;
        String str2;
        List<a0> listA = b0.a(zVar, this.f7952i);
        if (listA.isEmpty()) {
            str2 = "All required entries found at " + str + ".";
            cVar = c.SUCCESS;
        } else {
            a0 a0Var = null;
            for (a0 a0Var2 : listA) {
                this.f7948e.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7948e.Q().b("MediationDebuggerListAdapter", str + " is missing a required entry: " + a0Var2.d());
                }
                if (a0Var2.g()) {
                    a0Var = a0Var2;
                }
            }
            if (a0Var != null) {
                b0.b bVar = b0.b.MISSING_APPLOVIN_ENTRIES;
                strA = a(bVar, str, a0Var.d());
                cVarA = a(bVar);
            } else {
                b0.b bVar2 = b0.b.MISSING_NON_APPLOVIN_ENTRIES;
                strA = a(bVar2, str, null);
                cVarA = a(bVar2);
            }
            String str3 = strA;
            cVar = cVarA;
            str2 = str3;
        }
        this.f7967x.add(a(str2, cVar));
        c();
    }

    @Override // com.applovin.impl.b0.a
    public void a(b0.b bVar, String str) {
        if (bVar == b0.b.APP_DETAILS_NOT_FOUND) {
            this.f7948e.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7948e.Q().a("MediationDebuggerListAdapter", "Could not retrieve app details for this package name; app-ads.txt row will not show on the mediation debugger.");
                return;
            }
            return;
        }
        this.f7967x.add(a(a(bVar, str, null), a(bVar)));
        c();
    }

    private void a(StringBuilder sb2, String str) {
        String string = sb2.toString();
        if (string.length() + str.length() >= ((Integer) this.f7948e.a(z4.f9331r)).intValue()) {
            com.applovin.impl.sdk.p.g("MediationDebuggerListAdapter", string);
            this.f7957n.append(string);
            sb2.setLength(1);
        }
        sb2.append(str);
    }

    private List a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(t2.a().d("View Ad Units (" + this.f7950g.size() + ")").a(this.f8861a).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.f7951h.isEmpty()) {
            arrayList.add(t2.a().d("Selective Init Ad Units (" + this.f7951h.size() + ")").a(this.f8861a).a(true).a());
        }
        arrayList.add(t2.a().d("Test Mode Enabled").c(String.valueOf(this.f7948e.u0().c())).a());
        return arrayList;
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b4((g3) it.next(), this.f8861a));
        }
        return arrayList;
    }

    private t2 a(String str) {
        t2.b bVarA = t2.a();
        if (!this.f7948e.u0().c()) {
            bVarA.a(this.f8861a);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StringUtils.isValidString(str) ? "" : "Select ");
        sb2.append("Live Network");
        t2.b bVarD = bVarA.d(sb2.toString());
        if (this.f7948e.u0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    private t2 a(boolean z10) {
        return t2.a().d("Java 8").a(z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(this.f8861a.getColor(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor)).b("Upgrade to Java 8").a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://support.axon.ai/en/max/android/overview/integration").a(!z10).a();
    }

    private t2 a(String str, c cVar) {
        int i10;
        int color;
        if (cVar == c.SUCCESS) {
            i10 = R.drawable.applovin_ic_check_mark_bordered;
            color = this.f8861a.getColor(R.color.applovin_sdk_checkmarkColor);
        } else if (cVar == c.WARNING) {
            i10 = R.drawable.applovin_ic_warning;
            color = this.f8861a.getColor(R.color.applovin_sdk_warningColor);
        } else {
            i10 = R.drawable.applovin_ic_x_mark;
            color = this.f8861a.getColor(R.color.applovin_sdk_xmarkColor);
        }
        return t2.a().d("app-ads.txt").a(i10).b(color).b("app-ads.txt").a(str).a(true).a();
    }

    private String a(b0.b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i10 = a.f7970a[bVar.ordinal()];
        if (i10 == 1) {
            return "Could not retrieve app details from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i10 == 2) {
            return "Unable to find a valid developer URL from the Play Store listing.";
        }
        if (i10 == 3) {
            return "Unable to find app-ads.txt file or parse entries of the file at " + str + ".\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        }
        if (i10 != 4) {
            if (i10 != 5) {
                return "";
            }
            return "Text file at " + str + " is missing some of the suggested lines.\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        }
        return "Text file at " + str + " is missing the required AppLovin line:\n\n" + str2 + "\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
    }

    private c a(b0.b bVar) {
        int i10 = a.f7970a[bVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            return c.ERROR;
        }
        if (i10 != 5) {
            return c.ERROR;
        }
        return c.WARNING;
    }

    private String a(List list, boolean z10) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z10) {
            for (w2 w2Var : this.f7963t) {
                if (list.equals(w2Var.b())) {
                    return w2Var.a();
                }
            }
            for (w2 w2Var2 : this.f7964u) {
                if (list.equals(w2Var2.b())) {
                    return w2Var2.a();
                }
            }
        } else {
            for (g3 g3Var : this.f7965v) {
                if (list.equals(g3Var.u())) {
                    return g3Var.g();
                }
            }
        }
        return yd.a(",", list);
    }
}
