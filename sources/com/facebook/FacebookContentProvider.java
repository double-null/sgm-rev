package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.facebook.internal.NativeAppCallAttachmentStore;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.UUID;
import kotlin.jvm.internal.l0;
import rd.f0;

/* JADX INFO: compiled from: FacebookContentProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FacebookContentProvider extends ContentProvider {
    private static final String ATTACHMENT_URL_BASE = "content://com.facebook.app.FacebookContentProvider";
    private static final String INVALID_FILE_NAME = "..";
    public static final Companion Companion = new Companion(null);
    private static final String TAG = FacebookContentProvider.class.getName();

    /* JADX INFO: compiled from: FacebookContentProvider.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final String getAttachmentUrl(String str, UUID callId, String str2) {
            kotlin.jvm.internal.t.f(callId, "callId");
            l0 l0Var = l0.f21527a;
            String str3 = String.format("%s%s/%s/%s", Arrays.copyOf(new Object[]{FacebookContentProvider.ATTACHMENT_URL_BASE, str, callId.toString(), str2}, 4));
            kotlin.jvm.internal.t.e(str3, "format(format, *args)");
            return str3;
        }
    }

    public static final String getAttachmentUrl(String str, UUID uuid, String str2) {
        return Companion.getAttachmentUrl(str, uuid, str2);
    }

    private final Pair<UUID, String> parseCallIdAndAttachmentName(Uri uri) {
        try {
            String path = uri.getPath();
            if (path == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            kotlin.jvm.internal.t.e(path, "checkNotNull(uri.path)");
            String strSubstring = path.substring(1);
            kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            String[] strArr = (String[]) f0.K0(strSubstring, new String[]{"/"}, false, 0, 6, null).toArray(new String[0]);
            String str = strArr[0];
            String str2 = strArr[1];
            if (INVALID_FILE_NAME.contentEquals(str) || INVALID_FILE_NAME.contentEquals(str2)) {
                throw new Exception();
            }
            return new Pair<>(UUID.fromString(str), str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        kotlin.jvm.internal.t.f(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        kotlin.jvm.internal.t.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        kotlin.jvm.internal.t.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException {
        kotlin.jvm.internal.t.f(uri, "uri");
        kotlin.jvm.internal.t.f(mode, "mode");
        Pair<UUID, String> callIdAndAttachmentName = parseCallIdAndAttachmentName(uri);
        if (callIdAndAttachmentName == null) {
            throw new FileNotFoundException();
        }
        try {
            File fileOpenAttachment = NativeAppCallAttachmentStore.openAttachment((UUID) callIdAndAttachmentName.first, (String) callIdAndAttachmentName.second);
            if (fileOpenAttachment != null) {
                return ParcelFileDescriptor.open(fileOpenAttachment, 268435456);
            }
            throw new FileNotFoundException();
        } catch (FileNotFoundException e10) {
            Log.e(TAG, "Got unexpected exception:" + e10);
            throw e10;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        kotlin.jvm.internal.t.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        kotlin.jvm.internal.t.f(uri, "uri");
        return 0;
    }
}
