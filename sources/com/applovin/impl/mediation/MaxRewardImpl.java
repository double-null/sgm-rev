package com.applovin.impl.mediation;

import com.applovin.mediation.MaxReward;

/* JADX INFO: loaded from: classes.dex */
public class MaxRewardImpl implements MaxReward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7177b;

    private MaxRewardImpl(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.f7176a = str;
        this.f7177b = i10;
    }

    public static MaxReward create(int i10, String str) {
        return new MaxRewardImpl(i10, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f7177b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f7176a;
    }

    public String toString() {
        return "MaxReward{amount=" + this.f7177b + ", label=" + this.f7176a + "}";
    }
}
