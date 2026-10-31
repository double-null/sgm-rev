package u;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: FontProvider.java */
/* JADX INFO: loaded from: classes.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<byte[]> f25832a = new Comparator() { // from class: u.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.g((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: compiled from: FontProvider.java */
    private interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* JADX INFO: compiled from: FontProvider.java */
    private static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentProviderClient f25833a;

        b(Context context, Uri uri) {
            this.f25833a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // u.d.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f25833a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e10) {
                Log.w("FontsProvider", "Unable to query the content provider", e10);
                return null;
            }
        }

        @Override // u.d.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f25833a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    private static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : androidx.core.content.res.a.c(resources, eVar.c());
    }

    static g.a e(Context context, e eVar, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoF = f(context.getPackageManager(), eVar, context.getResources());
        return providerInfoF == null ? g.a.a(1, null) : g.a.a(0, h(context, eVar, providerInfoF.authority, cancellationSignal));
    }

    static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) throws PackageManager.NameNotFoundException {
        String strE = eVar.e();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(eVar.f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + eVar.f());
        }
        List<byte[]> listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listB, f25832a);
        List<List<byte[]>> listD = d(eVar, resources);
        for (int i10 = 0; i10 < listD.size(); i10++) {
            ArrayList arrayList = new ArrayList(listD.get(i10));
            Collections.sort(arrayList, f25832a);
            if (c(listB, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    static g.b[] h(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority(str).appendPath(ShareInternalUtility.STAGING_PARAM).build();
        a aVarA = a.a(context, uriBuild);
        Cursor cursorB = null;
        try {
            boolean z10 = true;
            int i10 = 0;
            cursorB = aVarA.b(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar.g()}, null, cancellationSignal);
            if (cursorB != null && cursorB.getCount() > 0) {
                int columnIndex = cursorB.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursorB.getColumnIndex("_id");
                int columnIndex3 = cursorB.getColumnIndex("file_id");
                int columnIndex4 = cursorB.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorB.getColumnIndex("font_weight");
                int columnIndex6 = cursorB.getColumnIndex("font_italic");
                while (cursorB.moveToNext()) {
                    int i11 = columnIndex != -1 ? cursorB.getInt(columnIndex) : i10;
                    int i12 = columnIndex4 != -1 ? cursorB.getInt(columnIndex4) : i10;
                    Uri uriWithAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorB.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorB.getLong(columnIndex3));
                    int i13 = columnIndex5 != -1 ? cursorB.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursorB.getInt(columnIndex6) != z10) {
                        z10 = false;
                    }
                    arrayList2.add(g.b.a(uriWithAppendedId, i12, i13, z10, i11));
                    z10 = true;
                    i10 = 0;
                }
                arrayList = arrayList2;
            }
            return (g.b[]) arrayList.toArray(new g.b[0]);
        } finally {
            if (cursorB != null) {
                cursorB.close();
            }
            aVarA.close();
        }
    }
}
