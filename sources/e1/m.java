package e1;

import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* JADX INFO: compiled from: ProfileStoreImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class m implements ProfileStore {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ProfileStore f13877b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ProfileStoreBoundaryInterface f13878a;

    private m(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f13878a = profileStoreBoundaryInterface;
    }

    public static ProfileStore getInstance() {
        if (f13877b == null) {
            f13877b = new m(t.c().getProfileStore());
        }
        return f13877b;
    }

    @Override // androidx.webkit.ProfileStore
    public boolean deleteProfile(String str) throws IllegalStateException {
        if (s.f13891c0.c()) {
            return this.f13878a.deleteProfile(str);
        }
        throw s.a();
    }

    @Override // androidx.webkit.ProfileStore
    public List<String> getAllProfileNames() {
        if (s.f13891c0.c()) {
            return this.f13878a.getAllProfileNames();
        }
        throw s.a();
    }

    @Override // androidx.webkit.ProfileStore
    public d1.b getOrCreateProfile(String str) {
        if (s.f13891c0.c()) {
            return new l((ProfileBoundaryInterface) cf.a.a(ProfileBoundaryInterface.class, this.f13878a.getOrCreateProfile(str)));
        }
        throw s.a();
    }

    @Override // androidx.webkit.ProfileStore
    public d1.b getProfile(String str) {
        if (!s.f13891c0.c()) {
            throw s.a();
        }
        InvocationHandler profile = this.f13878a.getProfile(str);
        if (profile != null) {
            return new l((ProfileBoundaryInterface) cf.a.a(ProfileBoundaryInterface.class, profile));
        }
        return null;
    }
}
