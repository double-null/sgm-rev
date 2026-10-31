package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes.dex */
public class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f6899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FriendlyObstructionPurpose f6900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6901c;

    public j4(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f6899a = view;
        this.f6900b = friendlyObstructionPurpose;
        this.f6901c = str;
    }

    public String a() {
        return this.f6901c;
    }

    public FriendlyObstructionPurpose b() {
        return this.f6900b;
    }

    public View c() {
        return this.f6899a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j4 j4Var = (j4) obj;
        View view = this.f6899a;
        if (view == null ? j4Var.f6899a != null : !view.equals(j4Var.f6899a)) {
            return false;
        }
        if (this.f6900b != j4Var.f6900b) {
            return false;
        }
        String str = this.f6901c;
        String str2 = j4Var.f6901c;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int hashCode() {
        View view = this.f6899a;
        int iHashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f6900b;
        int iHashCode2 = (iHashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f6901c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
