package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.AppEventUtility;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import wc.g0;

/* JADX INFO: compiled from: AppEventDiskStore.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventDiskStore {
    private static final String PERSISTED_EVENTS_FILENAME = "AppEventsLogger.persistedevents";
    public static final AppEventDiskStore INSTANCE = new AppEventDiskStore();
    private static final String TAG = AppEventDiskStore.class.getName();

    /* JADX INFO: compiled from: AppEventDiskStore.kt */
    private static final class MovedClassObjectInputStream extends ObjectInputStream {
        private static final String ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1";
        private static final String APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2";
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: compiled from: AppEventDiskStore.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }
        }

        public MovedClassObjectInputStream(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
            ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            if (kotlin.jvm.internal.t.a(resultClassDescriptor.getName(), ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME)) {
                resultClassDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            } else if (kotlin.jvm.internal.t.a(resultClassDescriptor.getName(), APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME)) {
                resultClassDescriptor = ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class);
            }
            kotlin.jvm.internal.t.e(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }

    private AppEventDiskStore() {
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0055: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:86), block:B:28:0x0055 */
    public static final synchronized PersistedEvents readAndClearStore() {
        PersistedEvents persistedEvents;
        String str;
        String str2;
        PersistedEvents persistedEvents2;
        Throwable th;
        AppEventUtility.assertIsNotMainThread();
        Context applicationContext = FacebookSdk.getApplicationContext();
        PersistedEvents persistedEvents3 = null;
        try {
            try {
                try {
                    FileInputStream fileInputStreamOpenFileInput = applicationContext.openFileInput(PERSISTED_EVENTS_FILENAME);
                    kotlin.jvm.internal.t.e(fileInputStreamOpenFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                    MovedClassObjectInputStream movedClassObjectInputStream = new MovedClassObjectInputStream(new BufferedInputStream(fileInputStreamOpenFileInput));
                    try {
                        Object object = movedClassObjectInputStream.readObject();
                        kotlin.jvm.internal.t.d(object, "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
                        persistedEvents2 = (PersistedEvents) object;
                        try {
                            g0 g0Var = g0.f27756a;
                            fd.b.a(movedClassObjectInputStream, null);
                            try {
                                applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                            } catch (Exception e10) {
                                e = e10;
                                str = TAG;
                                str2 = "Got unexpected exception when removing events file: ";
                                Log.w(str, str2, e);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                fd.b.a(movedClassObjectInputStream, th);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    try {
                        applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                    } catch (Exception e11) {
                        Log.w(TAG, "Got unexpected exception when removing events file: ", e11);
                    }
                    throw th5;
                }
            } catch (FileNotFoundException unused) {
                try {
                    applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                } catch (Exception e12) {
                    Log.w(TAG, "Got unexpected exception when removing events file: ", e12);
                }
                persistedEvents2 = persistedEvents3;
            } catch (IOException e13) {
                persistedEvents2 = null;
                e = e13;
                Log.w(TAG, "Got unexpected exception while reading events: ", e);
                try {
                    applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                } catch (Exception e14) {
                    e = e14;
                    str = TAG;
                    str2 = "Got unexpected exception when removing events file: ";
                    Log.w(str, str2, e);
                }
            } catch (ClassNotFoundException e15) {
                persistedEvents2 = null;
                e = e15;
                Log.w(TAG, "Got unexpected exception while reading events: ", e);
                try {
                    applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                } catch (Exception e16) {
                    e = e16;
                    str = TAG;
                    str2 = "Got unexpected exception when removing events file: ";
                    Log.w(str, str2, e);
                }
            }
        } catch (FileNotFoundException unused2) {
            persistedEvents3 = persistedEvents;
            applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
            persistedEvents2 = persistedEvents3;
        } catch (IOException e17) {
            e = e17;
            Log.w(TAG, "Got unexpected exception while reading events: ", e);
            applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
        } catch (ClassNotFoundException e18) {
            e = e18;
            Log.w(TAG, "Got unexpected exception while reading events: ", e);
            applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
        }
        if (persistedEvents2 == null) {
            persistedEvents2 = new PersistedEvents();
        }
        return persistedEvents2;
    }

    public static final void saveEventsToDisk$facebook_core_release(PersistedEvents persistedEvents) {
        Context applicationContext = FacebookSdk.getApplicationContext();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(applicationContext.openFileOutput(PERSISTED_EVENTS_FILENAME, 0)));
            try {
                objectOutputStream.writeObject(persistedEvents);
                g0 g0Var = g0.f27756a;
                fd.b.a(objectOutputStream, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fd.b.a(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e10) {
            Log.w(TAG, "Got unexpected exception while persisting events: ", e10);
            try {
                applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
            } catch (Exception unused) {
            }
        }
    }
}
