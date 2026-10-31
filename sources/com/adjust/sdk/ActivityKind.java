package com.adjust.sdk;

import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;

/* JADX INFO: loaded from: classes2.dex */
public enum ActivityKind {
    UNKNOWN,
    SESSION,
    EVENT,
    CLICK,
    ATTRIBUTION,
    REVENUE,
    REATTRIBUTION,
    INFO,
    GDPR,
    AD_REVENUE,
    DISABLE_THIRD_PARTY_SHARING,
    SUBSCRIPTION,
    THIRD_PARTY_SHARING,
    MEASUREMENT_CONSENT,
    PURCHASE_VERIFICATION;

    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5635a;

        static {
            int[] iArr = new int[ActivityKind.values().length];
            f5635a = iArr;
            try {
                iArr[ActivityKind.SESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5635a[ActivityKind.EVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5635a[ActivityKind.CLICK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5635a[ActivityKind.ATTRIBUTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5635a[ActivityKind.INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5635a[ActivityKind.GDPR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5635a[ActivityKind.AD_REVENUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5635a[ActivityKind.SUBSCRIPTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5635a[ActivityKind.THIRD_PARTY_SHARING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5635a[ActivityKind.MEASUREMENT_CONSENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5635a[ActivityKind.PURCHASE_VERIFICATION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (a.f5635a[ordinal()]) {
            case 1:
                return "session";
            case 2:
                return "event";
            case 3:
                return "click";
            case 4:
                return "attribution";
            case 5:
                return "info";
            case 6:
                return "gdpr";
            case 7:
                return "ad_revenue";
            case 8:
                return "subscription";
            case 9:
                return "third_party_sharing";
            case 10:
                return "measurement_consent";
            case 11:
                return "purchase_verification";
            default:
                return "unknown";
        }
    }

    public static ActivityKind fromString(String str) {
        if ("session".equals(str)) {
            return SESSION;
        }
        if (KBBdKxoAiHo.iUMBQTf.equals(str)) {
            return EVENT;
        }
        if ("click".equals(str)) {
            return CLICK;
        }
        if ("attribution".equals(str)) {
            return ATTRIBUTION;
        }
        if ("info".equals(str)) {
            return INFO;
        }
        if ("gdpr".equals(str)) {
            return GDPR;
        }
        if ("ad_revenue".equals(str)) {
            return AD_REVENUE;
        }
        if ("subscription".equals(str)) {
            return SUBSCRIPTION;
        }
        if ("third_party_sharing".equals(str)) {
            return THIRD_PARTY_SHARING;
        }
        if ("measurement_consent".equals(str)) {
            return MEASUREMENT_CONSENT;
        }
        return "purchase_verification".equals(str) ? PURCHASE_VERIFICATION : UNKNOWN;
    }
}
