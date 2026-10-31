package androidx.core.app;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: NotificationCompatJellybean.java */
/* JADX INFO: loaded from: classes.dex */
class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f1801a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f1802b = new Object();

    static Bundle a(k.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.k() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(d1 d1Var) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", d1Var.i());
        bundle.putCharSequence("label", d1Var.h());
        bundle.putCharSequenceArray("choices", d1Var.e());
        bundle.putBoolean("allowFreeFormInput", d1Var.c());
        bundle.putBundle("extras", d1Var.g());
        Set<String> setD = d1Var.d();
        if (setD != null && !setD.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setD.size());
            Iterator<String> it = setD.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] c(d1[] d1VarArr) {
        if (d1VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[d1VarArr.length];
        for (int i10 = 0; i10 < d1VarArr.length; i10++) {
            bundleArr[i10] = b(d1VarArr[i10]);
        }
        return bundleArr;
    }
}
