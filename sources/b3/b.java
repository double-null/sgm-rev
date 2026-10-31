package b3;

import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import z2.f;

/* JADX INFO: compiled from: DisabledBreadcrumbSource.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements BreadcrumbSource {
    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void a(a aVar) {
        f.f().b("Could not register handler for breadcrumbs events.");
    }
}
