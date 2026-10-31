package io.bidmachine;

import android.content.Context;
import com.explorestack.protobuf.Struct;
import io.bidmachine.protobuf.Extras;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class ExtraParamsManager {
    static final String KEY_MRAID_JS = "mraid_js";
    private static volatile ExtraParamsManager instance;
    private Struct privateExtras;
    private final AtomicBoolean isExtrasPrepared = new AtomicBoolean(false);
    private final AtomicBoolean needLoadFromStore = new AtomicBoolean(true);
    private final Object loadFromStoreLock = new Object();
    private final Object updateExtrasLock = new Object();
    private final pc.f publicDataRetriever = new pc.f();
    private final pc.f internalDataRetriever = new pc.f();

    private ExtraParamsManager() {
    }

    private void checkAndPrepareExtras(Context context, Extras extras) {
        synchronized (this.updateExtrasLock) {
            if (isExtrasPrepared()) {
                return;
            }
            setExtras(context, extras);
        }
    }

    public static ExtraParamsManager get() {
        ExtraParamsManager extraParamsManager = instance;
        if (extraParamsManager == null) {
            synchronized (ExtraParamsManager.class) {
                extraParamsManager = instance;
                if (extraParamsManager == null) {
                    extraParamsManager = new ExtraParamsManager();
                    instance = extraParamsManager;
                }
            }
        }
        return extraParamsManager;
    }

    public pc.f getInternalDataRetriever(Context context) {
        loadFromStore(context);
        return this.internalDataRetriever;
    }

    public Struct getPrivateStruct(Context context) {
        loadFromStore(context);
        return this.privateExtras;
    }

    public Object getPublic(Context context, String str) {
        loadFromStore(context);
        return this.publicDataRetriever.m(str);
    }

    boolean isExtrasPrepared() {
        return this.isExtrasPrepared.get();
    }

    void loadFromStore(Context context) {
        if (isExtrasPrepared()) {
            return;
        }
        synchronized (this.loadFromStoreLock) {
            if (this.needLoadFromStore.compareAndSet(true, false)) {
                checkAndPrepareExtras(context, f2.i(context));
            }
        }
    }

    void setExtras(Context context, Extras extras) {
        this.isExtrasPrepared.set(true);
        this.needLoadFromStore.set(false);
        synchronized (this.updateExtrasLock) {
            try {
                if (extras == null) {
                    this.publicDataRetriever.o();
                    this.internalDataRetriever.o();
                    this.privateExtras = null;
                    f2.d(context);
                    return;
                }
                this.publicDataRetriever.s(extras.getPublic());
                this.internalDataRetriever.s(extras.getInternal());
                this.privateExtras = extras.getPrivate();
                f2.Q(context, extras);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
