package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t3 extends z4 {
    public static final z4 A7;
    public static final z4 A8;
    public static final z4 B7;
    public static final z4 B8;
    public static final z4 C7;
    public static final z4 C8;
    public static final z4 D7;
    public static final z4 D8;
    public static final z4 E7;
    public static final z4 E8;
    public static final z4 F7;
    public static final z4 F8;
    public static final z4 G7;
    public static final z4 G8;
    public static final z4 H7;
    public static final z4 H8;
    public static final z4 I7;
    public static final z4 I8;
    public static final z4 J7;
    public static final z4 J8;
    public static final z4 K7;
    public static final z4 K8;
    public static final z4 L7;
    public static final z4 L8;
    public static final z4 M7;
    public static final z4 M8;
    public static final z4 N7;
    public static final z4 N8;
    public static final z4 O7;
    public static final z4 O8;
    public static final z4 P7;
    public static final z4 P8;
    public static final z4 Q7;
    public static final z4 Q8;
    public static final z4 R7;
    public static final z4 R8;
    public static final z4 S7;
    public static final z4 T7;
    public static final z4 U7;
    public static final z4 V7;
    public static final z4 W7;
    public static final z4 X7;
    public static final z4 Y7;
    public static final z4 Z7;

    /* JADX INFO: renamed from: a8, reason: collision with root package name */
    public static final z4 f8793a8;

    /* JADX INFO: renamed from: b8, reason: collision with root package name */
    public static final z4 f8794b8;

    /* JADX INFO: renamed from: c8, reason: collision with root package name */
    public static final z4 f8795c8;

    /* JADX INFO: renamed from: d8, reason: collision with root package name */
    public static final z4 f8796d8;

    /* JADX INFO: renamed from: e8, reason: collision with root package name */
    public static final z4 f8797e8;

    /* JADX INFO: renamed from: f8, reason: collision with root package name */
    public static final z4 f8798f8;

    /* JADX INFO: renamed from: g8, reason: collision with root package name */
    public static final z4 f8799g8;

    /* JADX INFO: renamed from: h8, reason: collision with root package name */
    public static final z4 f8800h8;

    /* JADX INFO: renamed from: i8, reason: collision with root package name */
    public static final z4 f8801i8;

    /* JADX INFO: renamed from: j8, reason: collision with root package name */
    public static final z4 f8802j8;

    /* JADX INFO: renamed from: k8, reason: collision with root package name */
    public static final z4 f8803k8;

    /* JADX INFO: renamed from: l8, reason: collision with root package name */
    public static final z4 f8804l8;

    /* JADX INFO: renamed from: m8, reason: collision with root package name */
    public static final z4 f8805m8;

    /* JADX INFO: renamed from: n8, reason: collision with root package name */
    public static final z4 f8806n8;

    /* JADX INFO: renamed from: o8, reason: collision with root package name */
    public static final z4 f8807o8;

    /* JADX INFO: renamed from: p8, reason: collision with root package name */
    public static final z4 f8808p8;

    /* JADX INFO: renamed from: q8, reason: collision with root package name */
    public static final z4 f8809q8;

    /* JADX INFO: renamed from: r8, reason: collision with root package name */
    public static final z4 f8810r8;

    /* JADX INFO: renamed from: s8, reason: collision with root package name */
    public static final z4 f8811s8;

    /* JADX INFO: renamed from: t8, reason: collision with root package name */
    public static final z4 f8812t8;

    /* JADX INFO: renamed from: u8, reason: collision with root package name */
    public static final z4 f8813u8;

    /* JADX INFO: renamed from: v8, reason: collision with root package name */
    public static final z4 f8814v8;

    /* JADX INFO: renamed from: w8, reason: collision with root package name */
    public static final z4 f8815w8;

    /* JADX INFO: renamed from: x7, reason: collision with root package name */
    public static final z4 f8816x7 = z4.a("afi", "");

    /* JADX INFO: renamed from: x8, reason: collision with root package name */
    public static final z4 f8817x8;

    /* JADX INFO: renamed from: y7, reason: collision with root package name */
    public static final z4 f8818y7;

    /* JADX INFO: renamed from: y8, reason: collision with root package name */
    public static final z4 f8819y8;

    /* JADX INFO: renamed from: z7, reason: collision with root package name */
    public static final z4 f8820z7;

    /* JADX INFO: renamed from: z8, reason: collision with root package name */
    public static final z4 f8821z8;

    static {
        Boolean bool = Boolean.FALSE;
        f8818y7 = z4.a("iafiwaa", bool);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f8820z7 = z4.a("afi_ms", Long.valueOf(timeUnit.toMillis(5L)));
        A7 = z4.a("mediation_endpoint", "https://ms.applovin.com/");
        B7 = z4.a("mediation_backup_endpoint", UyXgnuLGEkgnZE.sqwoGfNxTCbdl);
        C7 = z4.a("fetch_next_ad_retry_delay_ms", Long.valueOf(timeUnit.toMillis(2L)));
        D7 = z4.a("fetch_next_ad_timeout_ms", Long.valueOf(timeUnit.toMillis(30L)));
        E7 = z4.a("fetch_mediation_debugger_info_timeout_ms", Long.valueOf(timeUnit.toMillis(7L)));
        Boolean bool2 = Boolean.TRUE;
        F7 = z4.a("auto_init_mediation_debugger", bool2);
        G7 = z4.a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");
        H7 = z4.a("max_signal_provider_latency_ms", Long.valueOf(timeUnit.toMillis(30L)));
        I7 = z4.a("default_adapter_timeout_ms", Long.valueOf(timeUnit.toMillis(10L)));
        J7 = z4.a("ad_refresh_ms", Long.valueOf(timeUnit.toMillis(30L)));
        K7 = z4.a("ad_load_failure_refresh_ms", Long.valueOf(timeUnit.toMillis(30L)));
        L7 = z4.a("ad_load_failure_refresh_ignore_error_codes", "204");
        M7 = z4.a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);
        N7 = z4.a("refresh_ad_view_timer_responds_to_background", bool2);
        O7 = z4.a("refresh_ad_view_timer_responds_to_store_kit", bool2);
        P7 = z4.a("refresh_ad_view_timer_responds_to_window_visibility_changed", bool);
        Q7 = z4.a("avrsponse", bool);
        R7 = z4.a("allow_pause_auto_refresh_immediately", bool);
        S7 = z4.a("ad_view_race_condition_fix_enabled", bool);
        T7 = z4.a("always_destroy_ad_view_on_ui_thread", bool);
        U7 = z4.a("fullscreen_display_delay_ms", 0L);
        V7 = z4.a("susaode", bool);
        W7 = z4.a("ahdm", 500L);
        X7 = z4.a("ad_view_refresh_precache_request_viewability_undesired_flags", 246L);
        Y7 = z4.a("ad_view_refresh_precache_request_enabled", bool2);
        Z7 = z4.a("famttl_ms", 0L);
        f8793a8 = z4.a("signal_expiration_ms", -1L);
        f8794b8 = z4.a("signal_cache_level", Integer.valueOf(d5.b.AD_FORMAT.ordinal()));
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        f8795c8 = z4.a("ad_expiration_ms", Long.valueOf(timeUnit2.toMillis(4L)));
        f8796d8 = z4.a("native_ad_expiration_ms", Long.valueOf(timeUnit2.toMillis(4L)));
        f8797e8 = z4.a("rena", bool2);
        f8798f8 = z4.a("fullscreen_ad_displayed_timeout_ms", -1L);
        f8799g8 = z4.a("freast_ms", -1L);
        f8800h8 = z4.a("ad_hidden_timeout_ms", -1L);
        f8801i8 = z4.a("schedule_ad_hidden_on_ad_dismiss", bool);
        f8802j8 = z4.a("schedule_ad_hidden_on_single_task_app_relaunch", bool);
        f8803k8 = z4.a("ad_hidden_on_ad_dismiss_callback_delay_ms", Long.valueOf(timeUnit.toMillis(1L)));
        f8804l8 = z4.a("proe", bool);
        f8805m8 = z4.a("mute_state", 2);
        f8806n8 = z4.a("saf", "");
        f8807o8 = z4.a("saui", "");
        f8808p8 = z4.a("malm_v2_e", bool);
        f8809q8 = z4.a("slsaod", bool);
        f8810r8 = z4.a("saldm", 0L);
        f8811s8 = z4.a("mspc", 1);
        f8812t8 = z4.a("mra", -1);
        f8813u8 = z4.a("mra_af", "INTER,REWARDED,BANNER,LEADER,MREC");
        f8814v8 = z4.a("fadiafase", bool2);
        f8815w8 = z4.a("fadwvcv", bool2);
        f8817x8 = z4.a("bfarud", bool);
        f8819y8 = z4.a("inacc", Boolean.valueOf(q7.b(Arrays.asList("com.textmeinc.textme", "com.textmeinc.freetone", "com.textmeinc.textme3", "com.jaumo", "com.jaumo.casual", "com.pinkapp", "com.jaumo.mature", "com.jaumo.prime", "com.jaumo.gay", "com.jaumo.lesbian"))));
        f8821z8 = z4.a("adiets_sec", Long.valueOf(TimeUnit.MINUTES.toSeconds(1L)));
        A8 = z4.a("faomq", bool);
        B8 = z4.a("rahcnct_sec", -1);
        C8 = z4.a("paslbaf", JsonUtils.EMPTY_JSON);
        D8 = z4.a("msbl", "{\"ad\":[\"ttdasi_ms\"]}");
        E8 = z4.a("siarni", bool);
        F8 = z4.a("spims", bool);
        G8 = z4.a("avat", 20);
        H8 = z4.a("uabta", bool);
        I8 = z4.a("use_initialization_spec_during_init", bool);
        J8 = z4.a("report_cimp_after_ierr", bool);
        K8 = z4.a("fail_collection_for_empty_signal", bool);
        L8 = z4.a("fetch_mediated_ad_gzip", bool2);
        M8 = z4.a("max_postback_gzip", bool2);
        N8 = z4.a("md_endpoint", "https://md.applovin.com/");
        O8 = z4.a("md_backup_endpoint", "https://md.applvn.com/");
        P8 = z4.a("md_v2", bool);
        Q8 = z4.a("suaaode", bool);
        R8 = z4.a("fcms", 5);
    }
}
