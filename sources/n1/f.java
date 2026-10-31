package n1;

import android.content.ComponentName;
import android.content.Context;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;

/* JADX INFO: compiled from: PackageManagerHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22679a = androidx.work.l.f("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z10) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            androidx.work.l lVarC = androidx.work.l.c();
            String str = f22679a;
            String str2 = UyXgnuLGEkgnZE.eRTiYWBrnTjyEuM;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z10 ? "enabled" : "disabled";
            lVarC.a(str, String.format(str2, objArr), new Throwable[0]);
        } catch (Exception e10) {
            androidx.work.l lVarC2 = androidx.work.l.c();
            String str3 = f22679a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z10 ? "enabled" : "disabled";
            lVarC2.a(str3, String.format("%s could not be %s", objArr2), e10);
        }
    }
}
