package com.applovin.mediation.nativeAds.adPlacer;

import com.applovin.impl.sdk.p;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f9527c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9528d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9529e = UserVerificationMethods.USER_VERIFY_HANDPRINT;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f9530f = 4;

    public MaxAdPlacerSettings(String str) {
        this.f9525a = str;
    }

    public void addFixedPosition(int i10) {
        this.f9527c.add(Integer.valueOf(i10));
    }

    public String getAdUnitId() {
        return this.f9525a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f9527c;
    }

    public int getMaxAdCount() {
        return this.f9529e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f9530f;
    }

    public String getPlacement() {
        return this.f9526b;
    }

    public int getRepeatingInterval() {
        return this.f9528d;
    }

    public boolean hasValidPositioning() {
        return !this.f9527c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f9528d >= 2;
    }

    public void resetFixedPositions() {
        this.f9527c.clear();
    }

    public void setMaxAdCount(int i10) {
        this.f9529e = i10;
    }

    public void setMaxPreloadedAdCount(int i10) {
        this.f9530f = i10;
    }

    public void setPlacement(String str) {
        this.f9526b = str;
    }

    public void setRepeatingInterval(int i10) {
        if (i10 >= 2) {
            this.f9528d = i10;
            p.g("MaxAdPlacerSettings", "Repeating interval set to " + i10);
            return;
        }
        this.f9528d = 0;
        p.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i10 + ", which is less than minimum value of 2");
    }

    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f9525a + "', fixedPositions=" + this.f9527c + ", repeatingInterval=" + this.f9528d + ", maxAdCount=" + this.f9529e + ", maxPreloadedAdCount=" + this.f9530f + '}';
    }
}
