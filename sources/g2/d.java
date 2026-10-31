package g2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: LogSourceMetrics.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f15299c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f15301b;

    /* JADX INFO: compiled from: LogSourceMetrics.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f15302a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<c> f15303b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f15302a, Collections.unmodifiableList(this.f15303b));
        }

        public a b(List<c> list) {
            this.f15303b = list;
            return this;
        }

        public a c(String str) {
            this.f15302a = str;
            return this;
        }
    }

    d(String str, List<c> list) {
        this.f15300a = str;
        this.f15301b = list;
    }

    public static a c() {
        return new a();
    }

    public List<c> a() {
        return this.f15301b;
    }

    public String b() {
        return this.f15300a;
    }
}
