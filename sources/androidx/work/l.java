package androidx.work;

import android.util.Log;

/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static l f3814a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f3815b = 20;

    /* JADX INFO: compiled from: Logger.java */
    public static class a extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3816c;

        public a(int i10) {
            super(i10);
            this.f3816c = i10;
        }

        @Override // androidx.work.l
        public void a(String str, String str2, Throwable... thArr) {
            if (this.f3816c <= 3) {
                if (thArr == null || thArr.length < 1) {
                    Log.d(str, str2);
                } else {
                    Log.d(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.l
        public void b(String str, String str2, Throwable... thArr) {
            if (this.f3816c <= 6) {
                if (thArr == null || thArr.length < 1) {
                    Log.e(str, str2);
                } else {
                    Log.e(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.l
        public void d(String str, String str2, Throwable... thArr) {
            if (this.f3816c <= 4) {
                if (thArr == null || thArr.length < 1) {
                    Log.i(str, str2);
                } else {
                    Log.i(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.l
        public void g(String str, String str2, Throwable... thArr) {
            if (this.f3816c <= 2) {
                if (thArr == null || thArr.length < 1) {
                    Log.v(str, str2);
                } else {
                    Log.v(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.l
        public void h(String str, String str2, Throwable... thArr) {
            if (this.f3816c <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }
    }

    public l(int i10) {
    }

    public static synchronized l c() {
        if (f3814a == null) {
            f3814a = new a(3);
        }
        return f3814a;
    }

    public static synchronized void e(l lVar) {
        f3814a = lVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f3815b;
        if (length >= i10) {
            sb2.append(str.substring(0, i10));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
