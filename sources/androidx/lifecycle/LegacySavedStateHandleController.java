package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: compiled from: LegacySavedStateHandleController.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LegacySavedStateHandleController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LegacySavedStateHandleController f2845a = new LegacySavedStateHandleController();

    /* JADX INFO: compiled from: LegacySavedStateHandleController.kt */
    public static final class a implements androidx.savedstate.a.InterfaceC0071a {
        @Override // androidx.savedstate.a.InterfaceC0071a
        public void a(w0.d owner) {
            kotlin.jvm.internal.t.f(owner, "owner");
            if (!(owner instanceof g0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            f0 viewModelStore = ((g0) owner).getViewModelStore();
            androidx.savedstate.a savedStateRegistry = owner.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                c0 c0VarB = viewModelStore.b(it.next());
                kotlin.jvm.internal.t.c(c0VarB);
                LegacySavedStateHandleController.a(c0VarB, savedStateRegistry, owner.getLifecycle());
            }
            if (!viewModelStore.c().isEmpty()) {
                savedStateRegistry.i(a.class);
            }
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static final void a(c0 viewModel, androidx.savedstate.a registry, f lifecycle) {
        kotlin.jvm.internal.t.f(viewModel, "viewModel");
        kotlin.jvm.internal.t.f(registry, "registry");
        kotlin.jvm.internal.t.f(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.j()) {
            return;
        }
        savedStateHandleController.h(registry, lifecycle);
        f2845a.c(registry, lifecycle);
    }

    public static final SavedStateHandleController b(androidx.savedstate.a registry, f lifecycle, String str, Bundle bundle) {
        kotlin.jvm.internal.t.f(registry, "registry");
        kotlin.jvm.internal.t.f(lifecycle, "lifecycle");
        kotlin.jvm.internal.t.c(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, v.f2934f.a(registry.b(str), bundle));
        savedStateHandleController.h(registry, lifecycle);
        f2845a.c(registry, lifecycle);
        return savedStateHandleController;
    }

    private final void c(final androidx.savedstate.a aVar, final f fVar) {
        f.b bVarB = fVar.b();
        if (bVarB == f.b.INITIALIZED || bVarB.c(f.b.STARTED)) {
            aVar.i(a.class);
        } else {
            fVar.a(new h() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.h
                public void b(j source, f.a event) {
                    kotlin.jvm.internal.t.f(source, "source");
                    kotlin.jvm.internal.t.f(event, "event");
                    if (event == f.a.ON_START) {
                        fVar.c(this);
                        aVar.i(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        }
    }
}
