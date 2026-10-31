package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.l;
import com.applovin.impl.w4;
import com.applovin.impl.z4;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e extends com.applovin.impl.sdk.network.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f8643s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f8644t;

    public static class a extends com.applovin.impl.sdk.network.a.C0120a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private String f8645r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f8646s;

        public a(l lVar) {
            super(lVar);
            this.f8592h = ((Integer) lVar.a(z4.L2)).intValue();
            this.f8593i = ((Integer) lVar.a(z4.K2)).intValue();
            this.f8594j = ((Integer) lVar.a(z4.X2)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.a.C0120a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.f8587c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0120a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            this.f8594j = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0120a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.f8586b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0120a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.f8585a = str;
            return this;
        }

        public a h(boolean z10) {
            this.f8646s = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0120a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(boolean z10) {
            this.f8600p = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0120a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Map map) {
            this.f8588d = map;
            return this;
        }

        public a e(String str) {
            this.f8645r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0120a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i10) {
            this.f8593i = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0120a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(boolean z10) {
            this.f8598n = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0120a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Map map) {
            this.f8589e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0120a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i10) {
            this.f8592h = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0120a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.f8590f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0120a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            this.f8591g = obj;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0120a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(w4.a aVar) {
            this.f8601q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0120a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a() {
            return new e(this);
        }
    }

    protected e(a aVar) {
        super(aVar);
        this.f8643s = aVar.f8645r;
        this.f8644t = aVar.f8646s;
    }

    public static a b(l lVar) {
        return new a(lVar);
    }

    public String s() {
        return this.f8643s;
    }

    public boolean t() {
        return this.f8643s != null;
    }

    public boolean u() {
        return this.f8644t;
    }
}
