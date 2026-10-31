package g7;

import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated(since = "3.6.0")
public class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f15499c = a.error;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f15501b = new CopyOnWriteArrayList();

    @Deprecated(since = "3.6.0")
    public enum a {
        debug(1),
        info(2),
        warning(3),
        error(4),
        none(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f15508a;

        a(int i10) {
            this.f15508a = i10;
        }

        public int c() {
            return this.f15508a;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15509a;

        static {
            int[] iArr = new int[a.values().length];
            f15509a = iArr;
            try {
                iArr[a.debug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15509a[a.error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15509a[a.warning.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15509a[a.info.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public v(String str) {
        this.f15500a = str;
    }

    private static String a(String str, String str2) {
        return String.format("[%s] %s", str, str2);
    }

    private static String b(String str, String str2, Object... objArr) {
        String strA = a(str, str2);
        if (objArr == null || objArr.length == 0) {
            return strA;
        }
        try {
            return String.format(strA, objArr);
        } catch (Throwable unused) {
            return strA;
        }
    }

    private void c(a aVar, String str) {
        int i10 = b.f15509a[aVar.ordinal()];
        if (i10 == 1) {
            Log.d(this.f15500a, str);
        } else if (i10 == 2) {
            Log.e(this.f15500a, str);
        } else {
            if (i10 != 3) {
                return;
            }
            Log.w(this.f15500a, str);
        }
    }

    private void d(a aVar, String str, String str2, Object... objArr) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zG = g(aVar);
        boolean zE = e();
        if (zG || zE) {
            String strB = b(str, str2, objArr);
            if (zG) {
                c(aVar, strB);
            }
            if (zE) {
                f(aVar, strB);
            }
        }
    }

    private boolean e() {
        return !this.f15501b.isEmpty();
    }

    private void f(a aVar, String str) {
        Iterator it = this.f15501b.iterator();
        while (it.hasNext()) {
            ((u) it.next()).a(aVar, this.f15500a, str);
        }
    }

    private boolean g(a aVar) {
        a aVar2 = f15499c;
        return aVar2 != null && aVar2.c() <= aVar.c();
    }

    public void h(String str, String str2, Object... objArr) {
        d(a.debug, str, str2, objArr);
    }

    public void i(String str, String str2, Object... objArr) {
        d(a.error, str, str2, objArr);
    }

    public void j(String str, Throwable th) {
        d(a.error, str, th.toString(), new Object[0]);
    }

    public void k(a aVar) {
        Log.d(this.f15500a, String.format("Changing logging level. From: %s, To: %s", f15499c, aVar));
        f15499c = aVar;
    }
}
