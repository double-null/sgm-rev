package io.bidmachine.analytics.internal.h;

import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.g.h;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: loaded from: classes4.dex */
public interface c {
    void a(List list);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReaderConfig.Rule f16926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f16927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h f16928c;

        public a(ReaderConfig.Rule rule, String str, h hVar) {
            this.f16926a = rule;
            this.f16927b = str;
            this.f16928c = hVar;
        }

        public final String a() {
            return this.f16927b;
        }

        public final h b() {
            return this.f16928c;
        }

        public final ReaderConfig.Rule c() {
            return this.f16926a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t.a(this.f16926a, aVar.f16926a) && t.a(this.f16927b, aVar.f16927b) && t.a(this.f16928c, aVar.f16928c);
        }

        public int hashCode() {
            int iHashCode = this.f16926a.hashCode() * 31;
            String str = this.f16927b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            h hVar = this.f16928c;
            return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
        }

        public String toString() {
            return "Data(rule=" + this.f16926a + ", dataHash=" + this.f16927b + ", error=" + this.f16928c + ')';
        }

        public /* synthetic */ a(ReaderConfig.Rule rule, String str, h hVar, int i10, k kVar) {
            this(rule, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : hVar);
        }
    }
}
