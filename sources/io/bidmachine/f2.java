package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import io.bidmachine.protobuf.Extras;
import io.bidmachine.protobuf.InitResponse;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: BidMachineSharedPreference.java */
/* JADX INFO: loaded from: classes4.dex */
class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r7.g f17574a = new r7.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SharedPreferences f17575b;

    static Boolean A(Context context) {
        return io.bidmachine.core.i.a(Integer.valueOf(wb.x.c(E(context), "is_google_play_instant", -1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ wc.g0 B(o7.g gVar, SharedPreferences.Editor editor) {
        wb.x.j(editor, "install_referrer_url", gVar.e());
        wb.x.j(editor, "install_version", gVar.f());
        wb.x.h(editor, "install_referrer_click_sec", gVar.c());
        wb.x.h(editor, "install_begin_sec", gVar.a());
        wb.x.h(editor, "install_referrer_click_server_sec", gVar.d());
        wb.x.h(editor, "install_begin_server_sec", gVar.b());
        wb.x.f(editor, "is_google_play_instant", io.bidmachine.core.i.c(gVar.i()));
        return wc.g0.f27756a;
    }

    static String C(Context context) {
        SharedPreferences sharedPreferencesE = E(context);
        String strE = wb.x.e(sharedPreferencesE, "bid_machine_ifv", null);
        if (!TextUtils.isEmpty(strE)) {
            return strE;
        }
        String string = UUID.randomUUID().toString();
        wb.x.k(sharedPreferencesE, "bid_machine_ifv", string);
        return string;
    }

    static long D(Context context) {
        SharedPreferences sharedPreferencesE = E(context);
        long jD = wb.x.d(sharedPreferencesE, "first_app_launch_ms", 0L);
        if (jD != 0) {
            return jD;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        wb.x.i(sharedPreferencesE, "first_app_launch_ms", Long.valueOf(jCurrentTimeMillis));
        return jCurrentTimeMillis;
    }

    static SharedPreferences E(Context context) {
        if (f17575b == null) {
            f17575b = context.getSharedPreferences("BidMachinePref", 0);
        }
        return f17575b;
    }

    private static Long F(SharedPreferences sharedPreferences, String str) {
        long jD = wb.x.d(sharedPreferences, str, -1L);
        if (jD != -1) {
            return Long.valueOf(jD);
        }
        return null;
    }

    static void G(Context context, r7.f fVar) {
        wb.x.k(E(context), "current_version_milestone", fVar != null ? f17574a.d(fVar).toString() : null);
    }

    static void H(Context context, List<r7.f> list) {
        if (list.isEmpty()) {
            wb.x.l(E(context), "history_version_milestone_list");
        } else {
            wb.x.k(E(context), "history_version_milestone_list", f17574a.c(list).toString());
        }
    }

    static void I(Context context, String str, String str2) {
        wb.x.k(E(context), "hw_info_" + str, str2);
    }

    static void J(Context context, final o7.g gVar) {
        wb.x.b(E(context), new id.l() { // from class: io.bidmachine.e2
            @Override // id.l
            public final Object invoke(Object obj) {
                return f2.B(gVar, (SharedPreferences.Editor) obj);
            }
        });
    }

    static void K(Context context, long j10) {
        wb.x.i(E(context), "sdk_install_time", Long.valueOf(j10));
    }

    static void L(Context context, String str) {
        wb.x.k(E(context), "ua", str);
    }

    static void M(Context context, String str) {
        wb.x.k(E(context), "ua_device_os", str);
    }

    static void N(Context context, long j10) {
        wb.x.i(E(context), "ua_exp", Long.valueOf(j10));
    }

    static void O(Context context, String str, long j10) {
        L(context, str);
        M(context, oc.d.h());
        N(context, j10);
    }

    static void P(Context context, long j10) {
        wb.x.i(E(context), "current_session_duration", Long.valueOf(j10));
    }

    static void Q(Context context, Extras extras) {
        try {
            wb.x.k(E(context), "init_extras", Base64.encodeToString(extras.toByteArray(), 0));
        } catch (Exception unused) {
        }
    }

    static void R(Context context, InitResponse initResponse, String str) {
        try {
            wb.x.k(E(context), "initData", Base64.encodeToString(initResponse.toByteArray(), 0));
            wb.x.k(E(context), "init_data_session_id", str);
        } catch (Exception unused) {
        }
    }

    static void S(Context context, long j10) {
        wb.x.i(E(context), "last_session_duration", Long.valueOf(j10));
    }

    static void T(Context context, int i10) {
        wb.x.g(E(context), "session_count", Integer.valueOf(i10));
    }

    static void b(Context context) {
        S(context, e(context));
    }

    static void c(Context context) {
        wb.x.a(E(context));
    }

    static void d(Context context) {
        wb.x.l(E(context), "init_extras");
    }

    static long e(Context context) {
        return wb.x.d(E(context), "current_session_duration", 0L);
    }

    static r7.f f(Context context) {
        String strE = wb.x.e(E(context), "current_version_milestone", null);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        try {
            return f17574a.b(new JSONObject(strE));
        } catch (Throwable unused) {
            return null;
        }
    }

    static List<r7.f> g(Context context) {
        String strE = wb.x.e(E(context), "history_version_milestone_list", null);
        if (TextUtils.isEmpty(strE)) {
            return Collections.emptyList();
        }
        try {
            return f17574a.a(new JSONArray(strE));
        } catch (Throwable unused) {
            return Collections.emptyList();
        }
    }

    static String h(Context context, String str) {
        return wb.x.e(E(context), "hw_info_" + str, null);
    }

    static Extras i(Context context) {
        SharedPreferences sharedPreferencesE = E(context);
        try {
            return Extras.parseFrom(Base64.decode(wb.x.e(sharedPreferencesE, "init_extras", null), 0));
        } catch (Exception unused) {
            wb.x.l(sharedPreferencesE, "init_extras");
            return null;
        }
    }

    static InitResponse j(Context context) {
        SharedPreferences sharedPreferencesE = E(context);
        try {
            return InitResponse.parseFrom(Base64.decode(sharedPreferencesE.getString("initData", null), 0));
        } catch (Exception unused) {
            wb.x.l(sharedPreferencesE, "initData");
            return null;
        }
    }

    static String k(Context context) {
        String strE = wb.x.e(E(context), "init_data_session_id", null);
        return strE != null ? strE : "";
    }

    static Long l(Context context) {
        return F(E(context), "install_begin_sec");
    }

    static Long m(Context context) {
        return F(E(context), "install_begin_server_sec");
    }

    static Long n(Context context) {
        return F(E(context), "install_referrer_click_sec");
    }

    static Long o(Context context) {
        return F(E(context), "install_referrer_click_server_sec");
    }

    static String p(Context context) {
        return wb.x.e(E(context), "install_referrer_url", null);
    }

    static String q(Context context) {
        return wb.x.e(E(context), "install_version", null);
    }

    static long r(Context context) {
        return wb.x.d(E(context), "last_session_duration", 0L);
    }

    static long s(Context context) {
        return wb.x.d(E(context), "sdk_install_time", 0L);
    }

    static int t(Context context) {
        return wb.x.c(E(context), "session_count", 0);
    }

    static String u(Context context) {
        return wb.x.e(E(context), "ua", null);
    }

    static String v(Context context) {
        return wb.x.e(E(context), "ua_device_os", null);
    }

    static long w(Context context) {
        return wb.x.d(E(context), "ua_exp", -1L);
    }

    static String x(Context context) {
        String strU = u(context);
        if (TextUtils.isEmpty(strU) || !oc.d.h().equals(v(context)) || w(context) <= System.currentTimeMillis()) {
            return null;
        }
        return strU;
    }

    static boolean y(Context context) {
        return E(context).contains("bid_machine_ifv");
    }

    static void z(Context context) {
        T(context, t(context) + 1);
    }
}
