package com.google.common.base;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: MoreObjects.java */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: compiled from: MoreObjects.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0140b f11450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C0140b f11451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f11452d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f11453e;

        /* JADX INFO: compiled from: MoreObjects.java */
        private static final class a extends C0140b {
            private a() {
            }
        }

        /* JADX INFO: renamed from: com.google.common.base.j$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MoreObjects.java */
        static class C0140b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f11454a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f11455b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            C0140b f11456c;

            C0140b() {
            }
        }

        private C0140b c() {
            C0140b c0140b = new C0140b();
            this.f11451c.f11456c = c0140b;
            this.f11451c = c0140b;
            return c0140b;
        }

        private b d(Object obj) {
            c().f11455b = obj;
            return this;
        }

        private b e(String str, Object obj) {
            C0140b c0140bC = c();
            c0140bC.f11455b = obj;
            c0140bC.f11454a = (String) p.l(str);
            return this;
        }

        private a f() {
            a aVar = new a();
            this.f11451c.f11456c = aVar;
            this.f11451c = aVar;
            return aVar;
        }

        private b g(String str, Object obj) {
            a aVarF = f();
            aVarF.f11455b = obj;
            aVarF.f11454a = (String) p.l(str);
            return this;
        }

        private static boolean i(Object obj) {
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length() == 0;
            }
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
            if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            }
            if (obj instanceof m) {
                return !((m) obj).e();
            }
            return obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b a(String str, int i10) {
            return g(str, String.valueOf(i10));
        }

        public b b(String str, Object obj) {
            return e(str, obj);
        }

        public b h(Object obj) {
            return d(obj);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0030  */
        /* JADX WARN: Code duplicated, block: B:14:0x0037  */
        /* JADX WARN: Code duplicated, block: B:16:0x0041  */
        /* JADX WARN: Code duplicated, block: B:19:0x005e  */
        public String toString() {
            String str;
            boolean z10 = this.f11452d;
            boolean z11 = this.f11453e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f11449a);
            sb2.append('{');
            String str2 = "";
            for (C0140b c0140b = this.f11450b.f11456c; c0140b != null; c0140b = c0140b.f11456c) {
                Object obj = c0140b.f11455b;
                if (c0140b instanceof a) {
                    sb2.append(str2);
                    str = c0140b.f11454a;
                    if (str != null) {
                        sb2.append(str);
                        sb2.append('=');
                    }
                    if (obj == null && obj.getClass().isArray()) {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    str2 = ", ";
                } else if (obj == null) {
                    if (!z10) {
                        sb2.append(str2);
                        str = c0140b.f11454a;
                        if (str != null) {
                            sb2.append(str);
                            sb2.append('=');
                        }
                        if (obj == null) {
                            sb2.append(obj);
                        } else {
                            sb2.append(obj);
                        }
                        str2 = ", ";
                    }
                } else if (!z11 || !i(obj)) {
                    sb2.append(str2);
                    str = c0140b.f11454a;
                    if (str != null) {
                        sb2.append(str);
                        sb2.append('=');
                    }
                    if (obj == null) {
                        sb2.append(obj);
                    } else {
                        sb2.append(obj);
                    }
                    str2 = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        private b(String str) {
            C0140b c0140b = new C0140b();
            this.f11450b = c0140b;
            this.f11451c = c0140b;
            this.f11452d = false;
            this.f11453e = false;
            this.f11449a = (String) p.l(str);
        }
    }

    public static <T> T a(T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
