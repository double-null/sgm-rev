package i0;

import e0.k;
import e0.l;
import e0.l0;
import e0.q;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ud.o0;

/* JADX INFO: compiled from: PreferenceDataStoreFactory.jvmAndroid.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f15877a = new e();

    /* JADX INFO: compiled from: PreferenceDataStoreFactory.jvmAndroid.kt */
    static final class a extends u implements id.a<File> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ id.a<File> f15878d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(id.a<? extends File> aVar) {
            super(0);
            this.f15878d = aVar;
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File fileInvoke = this.f15878d.invoke();
            if (t.a(fd.j.n(fileInvoke), "preferences_pb")) {
                File absoluteFile = fileInvoke.getAbsoluteFile();
                t.e(absoluteFile, "file.absoluteFile");
                return absoluteFile;
            }
            throw new IllegalStateException(("File extension for file: " + fileInvoke + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    private e() {
    }

    public final k<f> a(l0<f> storage, f0.b<f> bVar, List<? extends e0.i<f>> migrations, o0 scope) {
        t.f(storage, "storage");
        t.f(migrations, "migrations");
        t.f(scope, "scope");
        return new d(l.f13625a.b(storage, bVar, migrations, scope));
    }

    public final k<f> b(f0.b<f> bVar, List<? extends e0.i<f>> migrations, o0 scope, id.a<? extends File> produceFile) {
        t.f(migrations, "migrations");
        t.f(scope, "scope");
        t.f(produceFile, "produceFile");
        return new d(a(new q(h.f15882a, null, new a(produceFile), 2, null), bVar, migrations, scope));
    }
}
