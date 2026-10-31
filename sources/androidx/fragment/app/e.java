package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.k1;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: FragmentActivity.java */
/* JADX INFO: loaded from: classes.dex */
public class e extends ComponentActivity implements androidx.core.app.b.e {
    static final String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    final androidx.lifecycle.k mFragmentLifecycleRegistry;
    final i mFragments;
    boolean mResumed;
    boolean mStopped;

    /* JADX INFO: compiled from: FragmentActivity.java */
    class a implements androidx.savedstate.a.c {
        a() {
        }

        @Override // androidx.savedstate.a.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            e.this.markFragmentsCreated();
            e.this.mFragmentLifecycleRegistry.h(androidx.lifecycle.f.a.ON_STOP);
            Parcelable parcelableX = e.this.mFragments.x();
            if (parcelableX != null) {
                bundle.putParcelable(e.FRAGMENTS_TAG, parcelableX);
            }
            return bundle;
        }
    }

    /* JADX INFO: compiled from: FragmentActivity.java */
    class b implements e.b {
        b() {
        }

        @Override // e.b
        public void a(Context context) {
            e.this.mFragments.a(null);
            Bundle bundleB = e.this.getSavedStateRegistry().b(e.FRAGMENTS_TAG);
            if (bundleB != null) {
                e.this.mFragments.w(bundleB.getParcelable(e.FRAGMENTS_TAG));
            }
        }
    }

    /* JADX INFO: compiled from: FragmentActivity.java */
    class c extends k<e> implements g0, androidx.activity.c, androidx.activity.result.c, r {
        public c() {
            super(e.this);
        }

        @Override // androidx.fragment.app.r
        public void a(n nVar, Fragment fragment) {
            e.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.k, androidx.fragment.app.g
        public View c(int i10) {
            return e.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.k, androidx.fragment.app.g
        public boolean d() {
            Window window = e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.result.c
        public ActivityResultRegistry getActivityResultRegistry() {
            return e.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.j
        public androidx.lifecycle.f getLifecycle() {
            return e.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return e.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.lifecycle.g0
        public f0 getViewModelStore() {
            return e.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.k
        public LayoutInflater i() {
            return e.this.getLayoutInflater().cloneInContext(e.this);
        }

        @Override // androidx.fragment.app.k
        public boolean k(Fragment fragment) {
            return !e.this.isFinishing();
        }

        @Override // androidx.fragment.app.k
        public boolean l(String str) {
            return androidx.core.app.b.u(e.this, str);
        }

        @Override // androidx.fragment.app.k
        public void o() {
            e.this.supportInvalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.k
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public e h() {
            return e.this;
        }
    }

    public e() {
        this.mFragments = i.b(new c());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.k(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().h(FRAGMENTS_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private static boolean markState(n nVar, androidx.lifecycle.f.b bVar) {
        boolean zMarkState = false;
        for (Fragment fragment : nVar.r0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), bVar);
                }
                z zVar = fragment.mViewLifecycleOwner;
                if (zVar != null && zVar.getLifecycle().b().c(androidx.lifecycle.f.b.STARTED)) {
                    fragment.mViewLifecycleOwner.f(bVar);
                    zMarkState = true;
                }
                if (fragment.mLifecycleRegistry.b().c(androidx.lifecycle.f.b.STARTED)) {
                    fragment.mLifecycleRegistry.m(bVar);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.v(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.t().W(str, fileDescriptor, printWriter, strArr);
    }

    public n getSupportFragmentManager() {
        return this.mFragments.t();
    }

    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), androidx.lifecycle.f.b.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.u();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.u();
        this.mFragments.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.h(androidx.lifecycle.f.a.ON_CREATE);
        this.mFragments.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return i10 == 0 ? super.onCreatePanelMenu(i10, menu) | this.mFragments.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i10, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.h();
        this.mFragmentLifecycleRegistry.h(androidx.lifecycle.f.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.mFragments.k(menuItem);
        }
        if (i10 != 6) {
            return false;
        }
        return this.mFragments.e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        this.mFragments.j(z10);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.u();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        if (i10 == 0) {
            this.mFragments.l(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m();
        this.mFragmentLifecycleRegistry.h(androidx.lifecycle.f.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        this.mFragments.n(z10);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return i10 == 0 ? onPrepareOptionsPanel(view, menu) | this.mFragments.o(menu) : super.onPreparePanel(i10, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.u();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.u();
        this.mFragments.s();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.h(androidx.lifecycle.f.a.ON_RESUME);
        this.mFragments.p();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.u();
        this.mFragments.s();
        this.mFragmentLifecycleRegistry.h(androidx.lifecycle.f.a.ON_START);
        this.mFragments.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.u();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.r();
        this.mFragmentLifecycleRegistry.h(androidx.lifecycle.f.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(k1 k1Var) {
        androidx.core.app.b.s(this, k1Var);
    }

    public void setExitSharedElementCallback(k1 k1Var) {
        androidx.core.app.b.t(this, k1Var);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10) {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            androidx.core.app.b.w(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.b.n(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.b.p(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.b.x(this);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            androidx.core.app.b.v(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i10, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public e(int i10) {
        super(i10);
        this.mFragments = i.b(new c());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.k(this);
        this.mStopped = true;
        init();
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.core.app.b.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }
}
