package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.l;
import com.pairip.VMRunner;
import java.util.List;
import m1.g;
import m1.h;
import m1.k;
import m1.p;
import m1.t;

/* JADX INFO: loaded from: classes2.dex */
public class DiagnosticsWorker extends Worker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f3812a = l.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static String a(p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.f22078a, pVar.f22080c, num, pVar.f22079b.name(), str, str2);
    }

    private static String c(k kVar, t tVar, h hVar, List<p> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        for (p pVar : list) {
            g gVarA = hVar.a(pVar.f22078a);
            sb2.append(a(pVar, TextUtils.join(",", kVar.b(pVar.f22078a)), gVarA != null ? Integer.valueOf(gVarA.f22056b) : null, TextUtils.join(",", tVar.b(pVar.f22078a))));
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        return (ListenableWorker.a) VMRunner.invoke("PBshghwCF3pJ4oTo", new Object[]{this});
    }
}
