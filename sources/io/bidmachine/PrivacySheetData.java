package io.bidmachine;

import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;

/* JADX INFO: compiled from: PrivacySheetData.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class PrivacySheetData {
    private final LabelData labelData;
    private final pb.a1 privacySheetParams;

    public static /* synthetic */ PrivacySheetData copy$default(PrivacySheetData privacySheetData, LabelData labelData, pb.a1 a1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            labelData = privacySheetData.labelData;
        }
        if ((i10 & 2) != 0) {
            a1Var = privacySheetData.privacySheetParams;
        }
        return privacySheetData.copy(labelData, a1Var);
    }

    public final LabelData component1() {
        return this.labelData;
    }

    public final pb.a1 component2() {
        return this.privacySheetParams;
    }

    public final PrivacySheetData copy(LabelData labelData, pb.a1 privacySheetParams) {
        kotlin.jvm.internal.t.f(labelData, "labelData");
        kotlin.jvm.internal.t.f(privacySheetParams, "privacySheetParams");
        return new PrivacySheetData(labelData, privacySheetParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacySheetData)) {
            return false;
        }
        PrivacySheetData privacySheetData = (PrivacySheetData) obj;
        return kotlin.jvm.internal.t.a(this.labelData, privacySheetData.labelData) && kotlin.jvm.internal.t.a(this.privacySheetParams, privacySheetData.privacySheetParams);
    }

    public final LabelData getLabelData() {
        return this.labelData;
    }

    public final pb.a1 getPrivacySheetParams() {
        return this.privacySheetParams;
    }

    public int hashCode() {
        return (this.labelData.hashCode() * 31) + this.privacySheetParams.hashCode();
    }

    public String toString() {
        return "PrivacySheetData(labelData=" + this.labelData + ", privacySheetParams=" + this.privacySheetParams + ')';
    }

    public PrivacySheetData(LabelData labelData, pb.a1 privacySheetParams) {
        kotlin.jvm.internal.t.f(labelData, edUJlCZxhVnO.PYra);
        kotlin.jvm.internal.t.f(privacySheetParams, "privacySheetParams");
        this.labelData = labelData;
        this.privacySheetParams = privacySheetParams;
    }
}
