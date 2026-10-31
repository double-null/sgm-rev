package io.bidmachine;

import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class SessionAdParams extends ga.g<SessionAdParams> {
    private Integer sessionDuration;

    void clear() {
        this.sessionDuration = null;
    }

    void fillUserExtension(Struct.Builder builder) {
        if (this.sessionDuration != null) {
            builder.putFields("sessionduration", Value.newBuilder().setNumberValue(this.sessionDuration.intValue()).build());
        }
    }

    Integer getSessionDuration() {
        return this.sessionDuration;
    }

    @Override // ga.g
    public void merge(SessionAdParams sessionAdParams) {
        this.sessionDuration = (Integer) io.bidmachine.core.h.T(this.sessionDuration, sessionAdParams.sessionDuration);
    }

    @Deprecated
    /* JADX INFO: renamed from: setClickRate, reason: merged with bridge method [inline-methods] */
    public SessionAdParams m333setClickRate(Float f10) {
        io.bidmachine.core.a.n("The method setClickRate is no longer supported and has no effect.");
        return this;
    }

    @Deprecated
    /* JADX INFO: renamed from: setCompletionRate, reason: merged with bridge method [inline-methods] */
    public SessionAdParams m334setCompletionRate(Float f10) {
        io.bidmachine.core.a.n("The method setCompletionRate is no longer supported and has no effect.");
        return this;
    }

    @Deprecated
    /* JADX INFO: renamed from: setImpressionCount, reason: merged with bridge method [inline-methods] */
    public SessionAdParams m335setImpressionCount(Integer num) {
        io.bidmachine.core.a.n("The method setImpressionCount is no longer supported and has no effect.");
        return this;
    }

    @Deprecated
    /* JADX INFO: renamed from: setIsUserClickedOnLastAd, reason: merged with bridge method [inline-methods] */
    public SessionAdParams m336setIsUserClickedOnLastAd(Boolean bool) {
        io.bidmachine.core.a.n(WKirgUEJJ.KCNH);
        return this;
    }

    /* JADX INFO: renamed from: setSessionDuration, reason: merged with bridge method [inline-methods] */
    public SessionAdParams m337setSessionDuration(Integer num) {
        if (num == null || num.intValue() >= 0) {
            this.sessionDuration = num;
        } else {
            io.bidmachine.core.a.f("session duration shouldn't be negative");
        }
        return this;
    }
}
