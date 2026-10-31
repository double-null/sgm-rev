package com.google.android.gms.common.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class Objects {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
    public static final class ToStringHelper {
        private final List zza;
        private final Object zzb;

        /* synthetic */ ToStringHelper(Object obj, byte[] bArr) {
            Preconditions.checkNotNull(obj);
            this.zzb = obj;
            this.zza = new ArrayList();
        }

        public ToStringHelper add(String str, Object obj) {
            Preconditions.checkNotNull(str);
            int length = str.length();
            String strValueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(length + 1 + strValueOf.length());
            sb2.append(str);
            sb2.append("=");
            sb2.append(strValueOf);
            this.zza.add(sb2.toString());
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.zzb.getClass().getSimpleName());
            sb2.append('{');
            List list = this.zza;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) list.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    public static boolean checkBundlesEquality(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!equal(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public static boolean equal(Object obj, Object obj2) {
        return java.util.Objects.equals(obj, obj2);
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj, null);
    }
}
