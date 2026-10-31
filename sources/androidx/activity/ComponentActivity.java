package androidx.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.h;
import androidx.lifecycle.d0;
import androidx.lifecycle.e;
import androidx.lifecycle.f;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.s;
import androidx.lifecycle.z;
import java.util.concurrent.atomic.AtomicInteger;
import w0.d;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends h implements g0, e, d, androidx.activity.c, androidx.activity.result.c {
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final e.a mContextAwareHelper;
    private d0.b mDefaultFactory;
    private final k mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    final w0.c mSavedStateRegistryController;
    private f0 mViewModelStore;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    class b extends ActivityResultRegistry {

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f492a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f.a.C0220a f493b;

            a(int i10, f.a.C0220a c0220a) {
                this.f492a = i10;
                this.f493b = c0220a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f492a, this.f493b.a());
            }
        }

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$b$b, reason: collision with other inner class name */
        class RunnableC0011b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f495a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f496b;

            RunnableC0011b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f495a = i10;
                this.f496b = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f495a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f496b));
            }
        }

        b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void f(int i10, f.a<I, O> aVar, I i11, ActivityOptionsCompat activityOptionsCompat) {
            Bundle bundleC;
            ComponentActivity componentActivity = ComponentActivity.this;
            f.a.C0220a<O> synchronousResult = aVar.getSynchronousResult(componentActivity, i11);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new a(i10, synchronousResult));
                return;
            }
            Intent intentCreateIntent = aVar.createIntent(componentActivity, i11);
            if (intentCreateIntent.getExtras() != null && intentCreateIntent.getExtras().getClassLoader() == null) {
                intentCreateIntent.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundleC = bundleExtra;
            } else {
                bundleC = activityOptionsCompat != null ? activityOptionsCompat.c() : null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentCreateIntent.getAction())) {
                String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.r(componentActivity, stringArrayExtra, i10);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentCreateIntent.getAction())) {
                androidx.core.app.b.v(componentActivity, intentCreateIntent, i10, bundleC);
                return;
            }
            androidx.activity.result.d dVar = (androidx.activity.result.d) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                androidx.core.app.b.w(componentActivity, dVar.d(), i10, dVar.a(), dVar.b(), dVar.c(), 0, bundleC);
            } catch (IntentSender.SendIntentException e10) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0011b(i10, e10));
            }
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        f0 f499b;

        c() {
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new e.a();
        this.mLifecycleRegistry = new k(this);
        this.mSavedStateRegistryController = w0.c.a(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new androidx.lifecycle.h() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.h
            public void b(j jVar, f.a aVar) {
                if (aVar == f.a.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        getLifecycle().a(new androidx.lifecycle.h() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.h
            public void b(j jVar, f.a aVar) {
                if (aVar == f.a.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.b();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.getViewModelStore().a();
                }
            }
        });
        getLifecycle().a(new androidx.lifecycle.h() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.h
            public void b(j jVar, f.a aVar) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().c(this);
            }
        });
    }

    private void initViewTreeOwners() {
        h0.a(getWindow().getDecorView(), this);
        i0.a(getWindow().getDecorView(), this);
        w0.e.a(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public final void addOnContextAvailableListener(e.b bVar) {
        this.mContextAwareHelper.a(bVar);
    }

    void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.mViewModelStore = cVar.f499b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new f0();
            }
        }
    }

    @Override // androidx.activity.result.c
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public d0.b getDefaultViewModelProviderFactory() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new z(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null) {
            return cVar.f498a;
        }
        return null;
    }

    @Override // androidx.core.app.h, androidx.lifecycle.j
    public f getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // w0.d
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    @Override // androidx.lifecycle.g0
    public f0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    @Override // android.app.Activity
    @Deprecated
    protected void onActivityResult(int i10, int i11, Intent intent) {
        if (this.mActivityResultRegistry.b(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.d(bundle);
        this.mContextAwareHelper.c(this);
        super.onCreate(bundle);
        this.mActivityResultRegistry.g(bundle);
        s.e(this);
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.b(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        f0 f0Var = this.mViewModelStore;
        if (f0Var == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            f0Var = cVar.f499b;
        }
        if (f0Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.f498a = objOnRetainCustomNonConfigurationInstance;
        cVar2.f499b = f0Var;
        return cVar2;
    }

    @Override // androidx.core.app.h, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        f lifecycle = getLifecycle();
        if (lifecycle instanceof k) {
            ((k) lifecycle).m(f.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
        this.mActivityResultRegistry.h(bundle);
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.d();
    }

    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(f.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.b<O> bVar) {
        return activityResultRegistry.i("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, bVar);
    }

    public final void removeOnContextAvailableListener(e.b bVar) {
        this.mContextAwareHelper.e(bVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (a1.b.d()) {
                a1.b.a("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
        } finally {
            a1.b.b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initViewTreeOwners();
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(f.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, bVar);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i10) {
        this();
        this.mContentLayoutId = i10;
    }
}
