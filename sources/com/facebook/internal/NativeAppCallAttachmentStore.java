package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.FacebookContentProvider;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import rd.c0;

/* JADX INFO: compiled from: NativeAppCallAttachmentStore.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NativeAppCallAttachmentStore {
    public static final String ATTACHMENTS_DIR_NAME = "com.facebook.NativeAppCallAttachmentStore.files";
    public static final NativeAppCallAttachmentStore INSTANCE = new NativeAppCallAttachmentStore();
    private static final String TAG = NativeAppCallAttachmentStore.class.getName();
    private static File attachmentsDirectory;

    /* JADX INFO: compiled from: NativeAppCallAttachmentStore.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class Attachment {
        private final String attachmentName;
        private final String attachmentUrl;
        private final Bitmap bitmap;
        private final UUID callId;
        private boolean isContentUri;
        private final Uri originalUri;
        private boolean shouldCreateFile;

        public Attachment(UUID callId, Bitmap bitmap, Uri uri) {
            kotlin.jvm.internal.t.f(callId, "callId");
            this.callId = callId;
            this.bitmap = bitmap;
            this.originalUri = uri;
            if (uri != null) {
                String scheme = uri.getScheme();
                if (c0.B(AppLovinEventTypes.USER_VIEWED_CONTENT, scheme, true)) {
                    this.isContentUri = true;
                    String authority = uri.getAuthority();
                    this.shouldCreateFile = (authority == null || c0.O(authority, ShareConstants.WEB_DIALOG_PARAM_MEDIA, false, 2, null)) ? false : true;
                } else if (c0.B(ShareInternalUtility.STAGING_PARAM, uri.getScheme(), true)) {
                    this.shouldCreateFile = true;
                } else if (!Utility.isWebUri(uri)) {
                    throw new FacebookException("Unsupported scheme for media Uri : " + scheme);
                }
            } else {
                if (bitmap == null) {
                    throw new FacebookException("Cannot share media without a bitmap or Uri set");
                }
                this.shouldCreateFile = true;
            }
            String string = this.shouldCreateFile ? UUID.randomUUID().toString() : null;
            this.attachmentName = string;
            this.attachmentUrl = !this.shouldCreateFile ? String.valueOf(uri) : FacebookContentProvider.Companion.getAttachmentUrl(FacebookSdk.getApplicationId(), callId, string);
        }

        public final String getAttachmentName() {
            return this.attachmentName;
        }

        public final String getAttachmentUrl() {
            return this.attachmentUrl;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final UUID getCallId() {
            return this.callId;
        }

        public final Uri getOriginalUri() {
            return this.originalUri;
        }

        public final boolean getShouldCreateFile() {
            return this.shouldCreateFile;
        }

        public final boolean isContentUri() {
            return this.isContentUri;
        }

        public final void setContentUri(boolean z10) {
            this.isContentUri = z10;
        }

        public final void setShouldCreateFile(boolean z10) {
            this.shouldCreateFile = z10;
        }
    }

    private NativeAppCallAttachmentStore() {
    }

    public static final void addAttachments(Collection<Attachment> collection) throws FacebookException {
        File attachmentFile;
        if (collection == null || collection.isEmpty()) {
            return;
        }
        if (attachmentsDirectory == null) {
            cleanupAllAttachments();
        }
        ensureAttachmentsDirectoryExists();
        ArrayList<File> arrayList = new ArrayList();
        try {
            for (Attachment attachment : collection) {
                if (attachment.getShouldCreateFile() && (attachmentFile = getAttachmentFile(attachment.getCallId(), attachment.getAttachmentName(), true)) != null) {
                    arrayList.add(attachmentFile);
                    if (attachment.getBitmap() != null) {
                        INSTANCE.processAttachmentBitmap(attachment.getBitmap(), attachmentFile);
                    } else if (attachment.getOriginalUri() != null) {
                        INSTANCE.processAttachmentFile(attachment.getOriginalUri(), attachment.isContentUri(), attachmentFile);
                    }
                }
            }
        } catch (IOException e10) {
            Log.e(TAG, "Got unexpected exception:" + e10);
            for (File file : arrayList) {
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
            }
            throw new FacebookException(e10);
        }
    }

    public static final void cleanupAllAttachments() {
        File attachmentsDirectory2 = getAttachmentsDirectory();
        if (attachmentsDirectory2 != null) {
            fd.j.m(attachmentsDirectory2);
        }
    }

    public static final void cleanupAttachmentsForCall(UUID callId) {
        kotlin.jvm.internal.t.f(callId, "callId");
        File attachmentsDirectoryForCall = getAttachmentsDirectoryForCall(callId, false);
        if (attachmentsDirectoryForCall != null) {
            fd.j.m(attachmentsDirectoryForCall);
        }
    }

    public static final Attachment createAttachment(UUID callId, Bitmap attachmentBitmap) {
        kotlin.jvm.internal.t.f(callId, "callId");
        kotlin.jvm.internal.t.f(attachmentBitmap, "attachmentBitmap");
        return new Attachment(callId, attachmentBitmap, null);
    }

    public static final File ensureAttachmentsDirectoryExists() {
        File attachmentsDirectory2 = getAttachmentsDirectory();
        if (attachmentsDirectory2 != null) {
            attachmentsDirectory2.mkdirs();
        }
        return attachmentsDirectory2;
    }

    public static final File getAttachmentFile(UUID callId, String str, boolean z10) throws IOException {
        kotlin.jvm.internal.t.f(callId, "callId");
        File attachmentsDirectoryForCall = getAttachmentsDirectoryForCall(callId, z10);
        if (attachmentsDirectoryForCall == null) {
            return null;
        }
        try {
            return new File(attachmentsDirectoryForCall, URLEncoder.encode(str, Constants.ENCODING));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final synchronized File getAttachmentsDirectory() {
        if (attachmentsDirectory == null) {
            attachmentsDirectory = new File(FacebookSdk.getApplicationContext().getCacheDir(), ATTACHMENTS_DIR_NAME);
        }
        return attachmentsDirectory;
    }

    public static final File getAttachmentsDirectoryForCall(UUID callId, boolean z10) {
        kotlin.jvm.internal.t.f(callId, "callId");
        if (attachmentsDirectory == null) {
            return null;
        }
        File file = new File(attachmentsDirectory, callId.toString());
        if (z10 && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static final File openAttachment(UUID uuid, String str) throws FileNotFoundException {
        if (Utility.isNullOrEmpty(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return getAttachmentFile(uuid, str, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }

    private final void processAttachmentBitmap(Bitmap bitmap, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        } finally {
            Utility.closeQuietly(fileOutputStream);
        }
    }

    private final void processAttachmentFile(Uri uri, boolean z10, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            Utility.copyAndCloseInputStream(!z10 ? new FileInputStream(uri.getPath()) : FacebookSdk.getApplicationContext().getContentResolver().openInputStream(uri), fileOutputStream);
            Utility.closeQuietly(fileOutputStream);
        } catch (Throwable th) {
            Utility.closeQuietly(fileOutputStream);
            throw th;
        }
    }

    public static final Attachment createAttachment(UUID callId, Uri uri) {
        kotlin.jvm.internal.t.f(callId, "callId");
        kotlin.jvm.internal.t.f(uri, EFLCCdIRcb.kPswMLOH);
        return new Attachment(callId, null, uri);
    }
}
