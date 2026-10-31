package m1;

import android.database.Cursor;
import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import com.facebook.internal.ServerProtocol;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.util.ArrayList;
import java.util.List;
import pb.vBC.NyXuoef;
import rd.PSo.cNMUz;

/* JADX INFO: compiled from: WorkSpecDao_Impl.java */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f22104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0.a<p> f22105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0.d f22106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t0.d f22107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t0.d f22108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t0.d f22109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t0.d f22110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final t0.d f22111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t0.d f22112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t0.d f22113j;

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    /* JADX INFO: loaded from: classes.dex */
    class a extends t0.a<p> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t0.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // t0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(x0.f fVar, p pVar) throws Throwable {
            String str = pVar.f22078a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.S(1, str);
            }
            fVar.X(2, v.j(pVar.f22079b));
            String str2 = pVar.f22080c;
            if (str2 == null) {
                fVar.f0(3);
            } else {
                fVar.S(3, str2);
            }
            String str3 = pVar.f22081d;
            if (str3 == null) {
                fVar.f0(4);
            } else {
                fVar.S(4, str3);
            }
            byte[] bArrK = androidx.work.e.k(pVar.f22082e);
            if (bArrK == null) {
                fVar.f0(5);
            } else {
                fVar.Z(5, bArrK);
            }
            byte[] bArrK2 = androidx.work.e.k(pVar.f22083f);
            if (bArrK2 == null) {
                fVar.f0(6);
            } else {
                fVar.Z(6, bArrK2);
            }
            fVar.X(7, pVar.f22084g);
            fVar.X(8, pVar.f22085h);
            fVar.X(9, pVar.f22086i);
            fVar.X(10, pVar.f22088k);
            fVar.X(11, v.a(pVar.f22089l));
            fVar.X(12, pVar.f22090m);
            fVar.X(13, pVar.f22091n);
            fVar.X(14, pVar.f22092o);
            fVar.X(15, pVar.f22093p);
            fVar.X(16, pVar.f22094q ? 1L : 0L);
            fVar.X(17, v.i(pVar.f22095r));
            androidx.work.c cVar = pVar.f22087j;
            if (cVar == null) {
                fVar.f0(18);
                fVar.f0(19);
                fVar.f0(20);
                fVar.f0(21);
                fVar.f0(22);
                fVar.f0(23);
                fVar.f0(24);
                fVar.f0(25);
                return;
            }
            fVar.X(18, v.h(cVar.b()));
            fVar.X(19, cVar.g() ? 1L : 0L);
            fVar.X(20, cVar.h() ? 1L : 0L);
            fVar.X(21, cVar.f() ? 1L : 0L);
            fVar.X(22, cVar.i() ? 1L : 0L);
            fVar.X(23, cVar.c());
            fVar.X(24, cVar.d());
            byte[] bArrC = v.c(cVar.a());
            if (bArrC == null) {
                fVar.f0(25);
            } else {
                fVar.Z(25, bArrC);
            }
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    /* JADX INFO: loaded from: classes.dex */
    class b extends t0.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t0.d
        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    /* JADX INFO: loaded from: classes.dex */
    class c extends t0.d {
        c(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t0.d
        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    /* JADX INFO: loaded from: classes.dex */
    class d extends t0.d {
        d(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t0.d
        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    /* JADX INFO: loaded from: classes.dex */
    class e extends t0.d {
        e(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t0.d
        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    /* JADX INFO: loaded from: classes.dex */
    class f extends t0.d {
        f(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t0.d
        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    /* JADX INFO: loaded from: classes.dex */
    class g extends t0.d {
        g(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t0.d
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    /* JADX INFO: loaded from: classes.dex */
    class h extends t0.d {
        h(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t0.d
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* JADX INFO: compiled from: WorkSpecDao_Impl.java */
    /* JADX INFO: loaded from: classes.dex */
    class i extends t0.d {
        i(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t0.d
        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(androidx.room.h hVar) {
        this.f22104a = hVar;
        this.f22105b = new a(hVar);
        this.f22106c = new b(hVar);
        this.f22107d = new c(hVar);
        this.f22108e = new d(hVar);
        this.f22109f = new e(hVar);
        this.f22110g = new f(hVar);
        this.f22111h = new g(hVar);
        this.f22112i = new h(hVar);
        this.f22113j = new i(hVar);
    }

    @Override // m1.q
    public void a(String str) {
        this.f22104a.b();
        x0.f fVarA = this.f22106c.a();
        if (str == null) {
            fVarA.f0(1);
        } else {
            fVarA.S(1, str);
        }
        this.f22104a.c();
        try {
            fVarA.l();
            this.f22104a.r();
        } finally {
            this.f22104a.g();
            this.f22106c.f(fVarA);
        }
    }

    @Override // m1.q
    public int b(androidx.work.u.a aVar, String... strArr) {
        this.f22104a.b();
        StringBuilder sbB = v0.e.b();
        sbB.append("UPDATE workspec SET state=");
        sbB.append("?");
        sbB.append(" WHERE id IN (");
        v0.e.a(sbB, strArr.length);
        sbB.append(")");
        x0.f fVarD = this.f22104a.d(sbB.toString());
        fVarD.X(1, v.j(aVar));
        int i10 = 2;
        for (String str : strArr) {
            if (str == null) {
                fVarD.f0(i10);
            } else {
                fVarD.S(i10, str);
            }
            i10++;
        }
        this.f22104a.c();
        try {
            int iL = fVarD.l();
            this.f22104a.r();
            return iL;
        } finally {
            this.f22104a.g();
        }
    }

    @Override // m1.q
    public List<String> e(String str) {
        t0.c cVarE = t0.c.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            cVarE.f0(1);
        } else {
            cVarE.S(1, str);
        }
        this.f22104a.b();
        Cursor cursorB = v0.c.b(this.f22104a, cVarE, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            cursorB.close();
            cVarE.release();
            return arrayList;
        } catch (Throwable th) {
            cursorB.close();
            cVarE.release();
            throw th;
        }
    }

    @Override // m1.q
    public androidx.work.u.a f(String str) {
        t0.c cVarE = t0.c.e("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            cVarE.f0(1);
        } else {
            cVarE.S(1, str);
        }
        this.f22104a.b();
        Cursor cursorB = v0.c.b(this.f22104a, cVarE, false, null);
        try {
            return cursorB.moveToFirst() ? v.g(cursorB.getInt(0)) : null;
        } finally {
            cursorB.close();
            cVarE.release();
        }
    }

    @Override // m1.q
    public List<String> h(String str) {
        t0.c cVarE = t0.c.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            cVarE.f0(1);
        } else {
            cVarE.S(1, str);
        }
        this.f22104a.b();
        Cursor cursorB = v0.c.b(this.f22104a, cVarE, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            cursorB.close();
            cVarE.release();
            return arrayList;
        } catch (Throwable th) {
            cursorB.close();
            cVarE.release();
            throw th;
        }
    }

    @Override // m1.q
    public List<androidx.work.e> i(String str) {
        t0.c cVarE = t0.c.e("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            cVarE.f0(1);
        } else {
            cVarE.S(1, str);
        }
        this.f22104a.b();
        Cursor cursorB = v0.c.b(this.f22104a, cVarE, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(androidx.work.e.g(cursorB.getBlob(0)));
            }
            cursorB.close();
            cVarE.release();
            return arrayList;
        } catch (Throwable th) {
            cursorB.close();
            cVarE.release();
            throw th;
        }
    }

    @Override // m1.q
    public List<p> j(int i10) throws Throwable {
        t0.c cVar;
        t0.c cVarE = t0.c.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        cVarE.X(1, i10);
        this.f22104a.b();
        Cursor cursorB = v0.c.b(this.f22104a, cVarE, false, null);
        try {
            int iB = v0.b.b(cursorB, "required_network_type");
            int iB2 = v0.b.b(cursorB, "requires_charging");
            int iB3 = v0.b.b(cursorB, "requires_device_idle");
            int iB4 = v0.b.b(cursorB, "requires_battery_not_low");
            int iB5 = v0.b.b(cursorB, "requires_storage_not_low");
            int iB6 = v0.b.b(cursorB, "trigger_content_update_delay");
            int iB7 = v0.b.b(cursorB, "trigger_max_content_delay");
            int iB8 = v0.b.b(cursorB, "content_uri_triggers");
            int iB9 = v0.b.b(cursorB, "id");
            int iB10 = v0.b.b(cursorB, ServerProtocol.DIALOG_PARAM_STATE);
            int iB11 = v0.b.b(cursorB, "worker_class_name");
            int iB12 = v0.b.b(cursorB, "input_merger_class_name");
            int iB13 = v0.b.b(cursorB, "input");
            int iB14 = v0.b.b(cursorB, "output");
            cVar = cVarE;
            try {
                int iB15 = v0.b.b(cursorB, "initial_delay");
                int iB16 = v0.b.b(cursorB, "interval_duration");
                int iB17 = v0.b.b(cursorB, "flex_duration");
                int iB18 = v0.b.b(cursorB, "run_attempt_count");
                int iB19 = v0.b.b(cursorB, "backoff_policy");
                int iB20 = v0.b.b(cursorB, "backoff_delay_duration");
                int iB21 = v0.b.b(cursorB, "period_start_time");
                int iB22 = v0.b.b(cursorB, "minimum_retention_duration");
                int iB23 = v0.b.b(cursorB, "schedule_requested_at");
                int iB24 = v0.b.b(cursorB, "run_in_foreground");
                int iB25 = v0.b.b(cursorB, "out_of_quota_policy");
                int i11 = iB14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iB9);
                    int i12 = iB9;
                    String string2 = cursorB.getString(iB11);
                    int i13 = iB11;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i14 = iB;
                    cVar2.k(v.e(cursorB.getInt(iB)));
                    cVar2.m(cursorB.getInt(iB2) != 0);
                    cVar2.n(cursorB.getInt(iB3) != 0);
                    cVar2.l(cursorB.getInt(iB4) != 0);
                    cVar2.o(cursorB.getInt(iB5) != 0);
                    int i15 = iB2;
                    int i16 = iB3;
                    cVar2.p(cursorB.getLong(iB6));
                    cVar2.q(cursorB.getLong(iB7));
                    cVar2.j(v.b(cursorB.getBlob(iB8)));
                    p pVar = new p(string, string2);
                    pVar.f22079b = v.g(cursorB.getInt(iB10));
                    pVar.f22081d = cursorB.getString(iB12);
                    pVar.f22082e = androidx.work.e.g(cursorB.getBlob(iB13));
                    int i17 = i11;
                    pVar.f22083f = androidx.work.e.g(cursorB.getBlob(i17));
                    i11 = i17;
                    int i18 = iB15;
                    pVar.f22084g = cursorB.getLong(i18);
                    int i19 = iB12;
                    int i20 = iB16;
                    pVar.f22085h = cursorB.getLong(i20);
                    int i21 = iB4;
                    int i22 = iB17;
                    pVar.f22086i = cursorB.getLong(i22);
                    int i23 = iB18;
                    pVar.f22088k = cursorB.getInt(i23);
                    int i24 = iB19;
                    pVar.f22089l = v.d(cursorB.getInt(i24));
                    iB17 = i22;
                    int i25 = iB20;
                    pVar.f22090m = cursorB.getLong(i25);
                    int i26 = iB21;
                    pVar.f22091n = cursorB.getLong(i26);
                    iB21 = i26;
                    int i27 = iB22;
                    pVar.f22092o = cursorB.getLong(i27);
                    int i28 = iB23;
                    pVar.f22093p = cursorB.getLong(i28);
                    int i29 = iB24;
                    pVar.f22094q = cursorB.getInt(i29) != 0;
                    int i30 = iB25;
                    pVar.f22095r = v.f(cursorB.getInt(i30));
                    pVar.f22087j = cVar2;
                    arrayList.add(pVar);
                    iB25 = i30;
                    iB2 = i15;
                    iB12 = i19;
                    iB15 = i18;
                    iB16 = i20;
                    iB18 = i23;
                    iB23 = i28;
                    iB9 = i12;
                    iB11 = i13;
                    iB = i14;
                    iB24 = i29;
                    iB22 = i27;
                    iB3 = i16;
                    iB20 = i25;
                    iB4 = i21;
                    iB19 = i24;
                }
                cursorB.close();
                cVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                cVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = cVarE;
        }
    }

    @Override // m1.q
    public int k() {
        this.f22104a.b();
        x0.f fVarA = this.f22112i.a();
        this.f22104a.c();
        try {
            int iL = fVarA.l();
            this.f22104a.r();
            return iL;
        } finally {
            this.f22104a.g();
            this.f22112i.f(fVarA);
        }
    }

    @Override // m1.q
    public int l(String str, long j10) {
        this.f22104a.b();
        x0.f fVarA = this.f22111h.a();
        fVarA.X(1, j10);
        if (str == null) {
            fVarA.f0(2);
        } else {
            fVarA.S(2, str);
        }
        this.f22104a.c();
        try {
            int iL = fVarA.l();
            this.f22104a.r();
            return iL;
        } finally {
            this.f22104a.g();
            this.f22111h.f(fVarA);
        }
    }

    @Override // m1.q
    public void m(p pVar) {
        this.f22104a.b();
        this.f22104a.c();
        try {
            this.f22105b.h(pVar);
            this.f22104a.r();
        } finally {
            this.f22104a.g();
        }
    }

    @Override // m1.q
    public List<p.b> n(String str) {
        t0.c cVarE = t0.c.e("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            cVarE.f0(1);
        } else {
            cVarE.S(1, str);
        }
        this.f22104a.b();
        Cursor cursorB = v0.c.b(this.f22104a, cVarE, false, null);
        try {
            int iB = v0.b.b(cursorB, "id");
            int iB2 = v0.b.b(cursorB, ServerProtocol.DIALOG_PARAM_STATE);
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                p.b bVar = new p.b();
                bVar.f22096a = cursorB.getString(iB);
                bVar.f22097b = v.g(cursorB.getInt(iB2));
                arrayList.add(bVar);
            }
            cursorB.close();
            cVarE.release();
            return arrayList;
        } catch (Throwable th) {
            cursorB.close();
            cVarE.release();
            throw th;
        }
    }

    @Override // m1.q
    public List<p> o(int i10) throws Throwable {
        t0.c cVar;
        t0.c cVarE = t0.c.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        cVarE.X(1, i10);
        this.f22104a.b();
        Cursor cursorB = v0.c.b(this.f22104a, cVarE, false, null);
        try {
            int iB = v0.b.b(cursorB, "required_network_type");
            int iB2 = v0.b.b(cursorB, "requires_charging");
            int iB3 = v0.b.b(cursorB, "requires_device_idle");
            int iB4 = v0.b.b(cursorB, "requires_battery_not_low");
            int iB5 = v0.b.b(cursorB, "requires_storage_not_low");
            int iB6 = v0.b.b(cursorB, "trigger_content_update_delay");
            int iB7 = v0.b.b(cursorB, "trigger_max_content_delay");
            int iB8 = v0.b.b(cursorB, "content_uri_triggers");
            int iB9 = v0.b.b(cursorB, "id");
            int iB10 = v0.b.b(cursorB, ServerProtocol.DIALOG_PARAM_STATE);
            int iB11 = v0.b.b(cursorB, "worker_class_name");
            int iB12 = v0.b.b(cursorB, "input_merger_class_name");
            int iB13 = v0.b.b(cursorB, "input");
            int iB14 = v0.b.b(cursorB, "output");
            cVar = cVarE;
            try {
                int iB15 = v0.b.b(cursorB, "initial_delay");
                int iB16 = v0.b.b(cursorB, "interval_duration");
                int iB17 = v0.b.b(cursorB, "flex_duration");
                int iB18 = v0.b.b(cursorB, "run_attempt_count");
                int iB19 = v0.b.b(cursorB, "backoff_policy");
                int iB20 = v0.b.b(cursorB, "backoff_delay_duration");
                int iB21 = v0.b.b(cursorB, "period_start_time");
                int iB22 = v0.b.b(cursorB, "minimum_retention_duration");
                int iB23 = v0.b.b(cursorB, "schedule_requested_at");
                int iB24 = v0.b.b(cursorB, "run_in_foreground");
                int iB25 = v0.b.b(cursorB, "out_of_quota_policy");
                int i11 = iB14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iB9);
                    int i12 = iB9;
                    String string2 = cursorB.getString(iB11);
                    int i13 = iB11;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i14 = iB;
                    cVar2.k(v.e(cursorB.getInt(iB)));
                    cVar2.m(cursorB.getInt(iB2) != 0);
                    cVar2.n(cursorB.getInt(iB3) != 0);
                    cVar2.l(cursorB.getInt(iB4) != 0);
                    cVar2.o(cursorB.getInt(iB5) != 0);
                    int i15 = iB2;
                    int i16 = iB3;
                    cVar2.p(cursorB.getLong(iB6));
                    cVar2.q(cursorB.getLong(iB7));
                    cVar2.j(v.b(cursorB.getBlob(iB8)));
                    p pVar = new p(string, string2);
                    pVar.f22079b = v.g(cursorB.getInt(iB10));
                    pVar.f22081d = cursorB.getString(iB12);
                    pVar.f22082e = androidx.work.e.g(cursorB.getBlob(iB13));
                    int i17 = i11;
                    pVar.f22083f = androidx.work.e.g(cursorB.getBlob(i17));
                    i11 = i17;
                    int i18 = iB15;
                    pVar.f22084g = cursorB.getLong(i18);
                    int i19 = iB12;
                    int i20 = iB16;
                    pVar.f22085h = cursorB.getLong(i20);
                    int i21 = iB4;
                    int i22 = iB17;
                    pVar.f22086i = cursorB.getLong(i22);
                    int i23 = iB18;
                    pVar.f22088k = cursorB.getInt(i23);
                    int i24 = iB19;
                    pVar.f22089l = v.d(cursorB.getInt(i24));
                    iB17 = i22;
                    int i25 = iB20;
                    pVar.f22090m = cursorB.getLong(i25);
                    int i26 = iB21;
                    pVar.f22091n = cursorB.getLong(i26);
                    iB21 = i26;
                    int i27 = iB22;
                    pVar.f22092o = cursorB.getLong(i27);
                    int i28 = iB23;
                    pVar.f22093p = cursorB.getLong(i28);
                    int i29 = iB24;
                    pVar.f22094q = cursorB.getInt(i29) != 0;
                    int i30 = iB25;
                    pVar.f22095r = v.f(cursorB.getInt(i30));
                    pVar.f22087j = cVar2;
                    arrayList.add(pVar);
                    iB25 = i30;
                    iB2 = i15;
                    iB12 = i19;
                    iB15 = i18;
                    iB16 = i20;
                    iB18 = i23;
                    iB23 = i28;
                    iB9 = i12;
                    iB11 = i13;
                    iB = i14;
                    iB24 = i29;
                    iB22 = i27;
                    iB3 = i16;
                    iB20 = i25;
                    iB4 = i21;
                    iB19 = i24;
                }
                cursorB.close();
                cVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                cVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = cVarE;
        }
    }

    @Override // m1.q
    public void p(String str, androidx.work.e eVar) throws Throwable {
        this.f22104a.b();
        x0.f fVarA = this.f22107d.a();
        byte[] bArrK = androidx.work.e.k(eVar);
        if (bArrK == null) {
            fVarA.f0(1);
        } else {
            fVarA.Z(1, bArrK);
        }
        if (str == null) {
            fVarA.f0(2);
        } else {
            fVarA.S(2, str);
        }
        this.f22104a.c();
        try {
            fVarA.l();
            this.f22104a.r();
        } finally {
            this.f22104a.g();
            this.f22107d.f(fVarA);
        }
    }

    @Override // m1.q
    public boolean r() {
        boolean z10 = false;
        t0.c cVarE = t0.c.e("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f22104a.b();
        Cursor cursorB = v0.c.b(this.f22104a, cVarE, false, null);
        try {
            if (cursorB.moveToFirst() && cursorB.getInt(0) != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            cursorB.close();
            cVarE.release();
        }
    }

    @Override // m1.q
    public int s(String str) {
        this.f22104a.b();
        x0.f fVarA = this.f22110g.a();
        if (str == null) {
            fVarA.f0(1);
        } else {
            fVarA.S(1, str);
        }
        this.f22104a.c();
        try {
            int iL = fVarA.l();
            this.f22104a.r();
            return iL;
        } finally {
            this.f22104a.g();
            this.f22110g.f(fVarA);
        }
    }

    @Override // m1.q
    public int t(String str) {
        this.f22104a.b();
        x0.f fVarA = this.f22109f.a();
        if (str == null) {
            fVarA.f0(1);
        } else {
            fVarA.S(1, str);
        }
        this.f22104a.c();
        try {
            int iL = fVarA.l();
            this.f22104a.r();
            return iL;
        } finally {
            this.f22104a.g();
            this.f22109f.f(fVarA);
        }
    }

    @Override // m1.q
    public void u(String str, long j10) {
        this.f22104a.b();
        x0.f fVarA = this.f22108e.a();
        fVarA.X(1, j10);
        if (str == null) {
            fVarA.f0(2);
        } else {
            fVarA.S(2, str);
        }
        this.f22104a.c();
        try {
            fVarA.l();
            this.f22104a.r();
        } finally {
            this.f22104a.g();
            this.f22108e.f(fVarA);
        }
    }

    @Override // m1.q
    public List<p> c(long j10) throws Throwable {
        t0.c cVar;
        t0.c cVarE = t0.c.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        cVarE.X(1, j10);
        this.f22104a.b();
        Cursor cursorB = v0.c.b(this.f22104a, cVarE, false, null);
        try {
            int iB = v0.b.b(cursorB, "required_network_type");
            int iB2 = v0.b.b(cursorB, "requires_charging");
            int iB3 = v0.b.b(cursorB, "requires_device_idle");
            int iB4 = v0.b.b(cursorB, "requires_battery_not_low");
            int iB5 = v0.b.b(cursorB, "requires_storage_not_low");
            int iB6 = v0.b.b(cursorB, "trigger_content_update_delay");
            int iB7 = v0.b.b(cursorB, "trigger_max_content_delay");
            int iB8 = v0.b.b(cursorB, "content_uri_triggers");
            int iB9 = v0.b.b(cursorB, NyXuoef.xLuV);
            int iB10 = v0.b.b(cursorB, ServerProtocol.DIALOG_PARAM_STATE);
            int iB11 = v0.b.b(cursorB, "worker_class_name");
            int iB12 = v0.b.b(cursorB, "input_merger_class_name");
            int iB13 = v0.b.b(cursorB, "input");
            int iB14 = v0.b.b(cursorB, "output");
            cVar = cVarE;
            try {
                int iB15 = v0.b.b(cursorB, "initial_delay");
                int iB16 = v0.b.b(cursorB, "interval_duration");
                int iB17 = v0.b.b(cursorB, "flex_duration");
                int iB18 = v0.b.b(cursorB, "run_attempt_count");
                int iB19 = v0.b.b(cursorB, "backoff_policy");
                int iB20 = v0.b.b(cursorB, "backoff_delay_duration");
                int iB21 = v0.b.b(cursorB, "period_start_time");
                int iB22 = v0.b.b(cursorB, "minimum_retention_duration");
                int iB23 = v0.b.b(cursorB, "schedule_requested_at");
                int iB24 = v0.b.b(cursorB, "run_in_foreground");
                int iB25 = v0.b.b(cursorB, "out_of_quota_policy");
                int i10 = iB14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iB9);
                    int i11 = iB9;
                    String string2 = cursorB.getString(iB11);
                    int i12 = iB11;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i13 = iB;
                    cVar2.k(v.e(cursorB.getInt(iB)));
                    cVar2.m(cursorB.getInt(iB2) != 0);
                    cVar2.n(cursorB.getInt(iB3) != 0);
                    cVar2.l(cursorB.getInt(iB4) != 0);
                    cVar2.o(cursorB.getInt(iB5) != 0);
                    int i14 = iB2;
                    int i15 = iB3;
                    cVar2.p(cursorB.getLong(iB6));
                    cVar2.q(cursorB.getLong(iB7));
                    cVar2.j(v.b(cursorB.getBlob(iB8)));
                    p pVar = new p(string, string2);
                    pVar.f22079b = v.g(cursorB.getInt(iB10));
                    pVar.f22081d = cursorB.getString(iB12);
                    pVar.f22082e = androidx.work.e.g(cursorB.getBlob(iB13));
                    int i16 = i10;
                    pVar.f22083f = androidx.work.e.g(cursorB.getBlob(i16));
                    int i17 = iB15;
                    i10 = i16;
                    pVar.f22084g = cursorB.getLong(i17);
                    int i18 = iB12;
                    int i19 = iB16;
                    pVar.f22085h = cursorB.getLong(i19);
                    int i20 = iB4;
                    int i21 = iB17;
                    pVar.f22086i = cursorB.getLong(i21);
                    int i22 = iB18;
                    pVar.f22088k = cursorB.getInt(i22);
                    int i23 = iB19;
                    pVar.f22089l = v.d(cursorB.getInt(i23));
                    iB17 = i21;
                    int i24 = iB20;
                    pVar.f22090m = cursorB.getLong(i24);
                    int i25 = iB21;
                    pVar.f22091n = cursorB.getLong(i25);
                    iB21 = i25;
                    int i26 = iB22;
                    pVar.f22092o = cursorB.getLong(i26);
                    int i27 = iB23;
                    pVar.f22093p = cursorB.getLong(i27);
                    int i28 = iB24;
                    pVar.f22094q = cursorB.getInt(i28) != 0;
                    int i29 = iB25;
                    pVar.f22095r = v.f(cursorB.getInt(i29));
                    pVar.f22087j = cVar2;
                    arrayList.add(pVar);
                    iB2 = i14;
                    iB25 = i29;
                    iB12 = i18;
                    iB15 = i17;
                    iB16 = i19;
                    iB18 = i22;
                    iB23 = i27;
                    iB9 = i11;
                    iB11 = i12;
                    iB = i13;
                    iB24 = i28;
                    iB22 = i26;
                    iB3 = i15;
                    iB20 = i24;
                    iB4 = i20;
                    iB19 = i23;
                }
                cursorB.close();
                cVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                cVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = cVarE;
        }
    }

    @Override // m1.q
    public List<p> d() throws Throwable {
        t0.c cVar;
        t0.c cVarE = t0.c.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f22104a.b();
        Cursor cursorB = v0.c.b(this.f22104a, cVarE, false, null);
        try {
            int iB = v0.b.b(cursorB, "required_network_type");
            int iB2 = v0.b.b(cursorB, "requires_charging");
            int iB3 = v0.b.b(cursorB, "requires_device_idle");
            int iB4 = v0.b.b(cursorB, "requires_battery_not_low");
            int iB5 = v0.b.b(cursorB, "requires_storage_not_low");
            int iB6 = v0.b.b(cursorB, WKirgUEJJ.cERepfsIdjnjQVQ);
            int iB7 = v0.b.b(cursorB, "trigger_max_content_delay");
            int iB8 = v0.b.b(cursorB, "content_uri_triggers");
            int iB9 = v0.b.b(cursorB, "id");
            int iB10 = v0.b.b(cursorB, ServerProtocol.DIALOG_PARAM_STATE);
            int iB11 = v0.b.b(cursorB, "worker_class_name");
            int iB12 = v0.b.b(cursorB, "input_merger_class_name");
            int iB13 = v0.b.b(cursorB, "input");
            int iB14 = v0.b.b(cursorB, "output");
            cVar = cVarE;
            try {
                int iB15 = v0.b.b(cursorB, "initial_delay");
                int iB16 = v0.b.b(cursorB, "interval_duration");
                int iB17 = v0.b.b(cursorB, "flex_duration");
                int iB18 = v0.b.b(cursorB, "run_attempt_count");
                int iB19 = v0.b.b(cursorB, "backoff_policy");
                int iB20 = v0.b.b(cursorB, "backoff_delay_duration");
                int iB21 = v0.b.b(cursorB, "period_start_time");
                int iB22 = v0.b.b(cursorB, "minimum_retention_duration");
                int iB23 = v0.b.b(cursorB, "schedule_requested_at");
                int iB24 = v0.b.b(cursorB, NyXuoef.NIjQMk);
                int iB25 = v0.b.b(cursorB, "out_of_quota_policy");
                int i10 = iB14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iB9);
                    int i11 = iB9;
                    String string2 = cursorB.getString(iB11);
                    int i12 = iB11;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i13 = iB;
                    cVar2.k(v.e(cursorB.getInt(iB)));
                    cVar2.m(cursorB.getInt(iB2) != 0);
                    cVar2.n(cursorB.getInt(iB3) != 0);
                    cVar2.l(cursorB.getInt(iB4) != 0);
                    cVar2.o(cursorB.getInt(iB5) != 0);
                    int i14 = iB2;
                    int i15 = iB3;
                    cVar2.p(cursorB.getLong(iB6));
                    cVar2.q(cursorB.getLong(iB7));
                    cVar2.j(v.b(cursorB.getBlob(iB8)));
                    p pVar = new p(string, string2);
                    pVar.f22079b = v.g(cursorB.getInt(iB10));
                    pVar.f22081d = cursorB.getString(iB12);
                    pVar.f22082e = androidx.work.e.g(cursorB.getBlob(iB13));
                    int i16 = i10;
                    pVar.f22083f = androidx.work.e.g(cursorB.getBlob(i16));
                    i10 = i16;
                    int i17 = iB15;
                    pVar.f22084g = cursorB.getLong(i17);
                    int i18 = iB13;
                    int i19 = iB16;
                    pVar.f22085h = cursorB.getLong(i19);
                    int i20 = iB4;
                    int i21 = iB17;
                    pVar.f22086i = cursorB.getLong(i21);
                    int i22 = iB18;
                    pVar.f22088k = cursorB.getInt(i22);
                    int i23 = iB19;
                    pVar.f22089l = v.d(cursorB.getInt(i23));
                    iB17 = i21;
                    int i24 = iB20;
                    pVar.f22090m = cursorB.getLong(i24);
                    int i25 = iB21;
                    pVar.f22091n = cursorB.getLong(i25);
                    iB21 = i25;
                    int i26 = iB22;
                    pVar.f22092o = cursorB.getLong(i26);
                    int i27 = iB23;
                    pVar.f22093p = cursorB.getLong(i27);
                    int i28 = iB24;
                    pVar.f22094q = cursorB.getInt(i28) != 0;
                    int i29 = iB25;
                    pVar.f22095r = v.f(cursorB.getInt(i29));
                    pVar.f22087j = cVar2;
                    arrayList.add(pVar);
                    iB25 = i29;
                    iB2 = i14;
                    iB13 = i18;
                    iB15 = i17;
                    iB16 = i19;
                    iB18 = i22;
                    iB23 = i27;
                    iB9 = i11;
                    iB11 = i12;
                    iB = i13;
                    iB24 = i28;
                    iB22 = i26;
                    iB3 = i15;
                    iB20 = i24;
                    iB4 = i20;
                    iB19 = i23;
                }
                cursorB.close();
                cVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                cVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = cVarE;
        }
    }

    @Override // m1.q
    public p g(String str) throws Throwable {
        t0.c cVar;
        p pVar;
        t0.c cVarE = t0.c.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            cVarE.f0(1);
        } else {
            cVarE.S(1, str);
        }
        this.f22104a.b();
        Cursor cursorB = v0.c.b(this.f22104a, cVarE, false, null);
        try {
            int iB = v0.b.b(cursorB, "required_network_type");
            int iB2 = v0.b.b(cursorB, "requires_charging");
            int iB3 = v0.b.b(cursorB, "requires_device_idle");
            int iB4 = v0.b.b(cursorB, "requires_battery_not_low");
            int iB5 = v0.b.b(cursorB, "requires_storage_not_low");
            int iB6 = v0.b.b(cursorB, "trigger_content_update_delay");
            int iB7 = v0.b.b(cursorB, "trigger_max_content_delay");
            int iB8 = v0.b.b(cursorB, "content_uri_triggers");
            int iB9 = v0.b.b(cursorB, "id");
            int iB10 = v0.b.b(cursorB, ServerProtocol.DIALOG_PARAM_STATE);
            int iB11 = v0.b.b(cursorB, "worker_class_name");
            int iB12 = v0.b.b(cursorB, yhXxbqGRMeI.WqCFselXYAS);
            int iB13 = v0.b.b(cursorB, "input");
            int iB14 = v0.b.b(cursorB, "output");
            cVar = cVarE;
            try {
                int iB15 = v0.b.b(cursorB, "initial_delay");
                int iB16 = v0.b.b(cursorB, "interval_duration");
                int iB17 = v0.b.b(cursorB, "flex_duration");
                int iB18 = v0.b.b(cursorB, "run_attempt_count");
                int iB19 = v0.b.b(cursorB, "backoff_policy");
                int iB20 = v0.b.b(cursorB, "backoff_delay_duration");
                int iB21 = v0.b.b(cursorB, "period_start_time");
                int iB22 = v0.b.b(cursorB, "minimum_retention_duration");
                int iB23 = v0.b.b(cursorB, "schedule_requested_at");
                int iB24 = v0.b.b(cursorB, "run_in_foreground");
                int iB25 = v0.b.b(cursorB, "out_of_quota_policy");
                if (cursorB.moveToFirst()) {
                    String string = cursorB.getString(iB9);
                    String string2 = cursorB.getString(iB11);
                    androidx.work.c cVar2 = new androidx.work.c();
                    cVar2.k(v.e(cursorB.getInt(iB)));
                    cVar2.m(cursorB.getInt(iB2) != 0);
                    cVar2.n(cursorB.getInt(iB3) != 0);
                    cVar2.l(cursorB.getInt(iB4) != 0);
                    cVar2.o(cursorB.getInt(iB5) != 0);
                    cVar2.p(cursorB.getLong(iB6));
                    cVar2.q(cursorB.getLong(iB7));
                    cVar2.j(v.b(cursorB.getBlob(iB8)));
                    p pVar2 = new p(string, string2);
                    pVar2.f22079b = v.g(cursorB.getInt(iB10));
                    pVar2.f22081d = cursorB.getString(iB12);
                    pVar2.f22082e = androidx.work.e.g(cursorB.getBlob(iB13));
                    pVar2.f22083f = androidx.work.e.g(cursorB.getBlob(iB14));
                    pVar2.f22084g = cursorB.getLong(iB15);
                    pVar2.f22085h = cursorB.getLong(iB16);
                    pVar2.f22086i = cursorB.getLong(iB17);
                    pVar2.f22088k = cursorB.getInt(iB18);
                    pVar2.f22089l = v.d(cursorB.getInt(iB19));
                    pVar2.f22090m = cursorB.getLong(iB20);
                    pVar2.f22091n = cursorB.getLong(iB21);
                    pVar2.f22092o = cursorB.getLong(iB22);
                    pVar2.f22093p = cursorB.getLong(iB23);
                    pVar2.f22094q = cursorB.getInt(iB24) != 0;
                    pVar2.f22095r = v.f(cursorB.getInt(iB25));
                    pVar2.f22087j = cVar2;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                cursorB.close();
                cVar.release();
                return pVar;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                cVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = cVarE;
        }
    }

    @Override // m1.q
    public List<p> q() throws Throwable {
        t0.c cVar;
        t0.c cVarE = t0.c.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f22104a.b();
        Cursor cursorB = v0.c.b(this.f22104a, cVarE, false, null);
        try {
            int iB = v0.b.b(cursorB, "required_network_type");
            int iB2 = v0.b.b(cursorB, "requires_charging");
            int iB3 = v0.b.b(cursorB, "requires_device_idle");
            int iB4 = v0.b.b(cursorB, "requires_battery_not_low");
            int iB5 = v0.b.b(cursorB, "requires_storage_not_low");
            int iB6 = v0.b.b(cursorB, "trigger_content_update_delay");
            int iB7 = v0.b.b(cursorB, "trigger_max_content_delay");
            int iB8 = v0.b.b(cursorB, "content_uri_triggers");
            int iB9 = v0.b.b(cursorB, "id");
            int iB10 = v0.b.b(cursorB, ServerProtocol.DIALOG_PARAM_STATE);
            int iB11 = v0.b.b(cursorB, "worker_class_name");
            int iB12 = v0.b.b(cursorB, "input_merger_class_name");
            int iB13 = v0.b.b(cursorB, "input");
            int iB14 = v0.b.b(cursorB, "output");
            cVar = cVarE;
            try {
                int iB15 = v0.b.b(cursorB, "initial_delay");
                int iB16 = v0.b.b(cursorB, "interval_duration");
                int iB17 = v0.b.b(cursorB, "flex_duration");
                int iB18 = v0.b.b(cursorB, cNMUz.yOkHV);
                int iB19 = v0.b.b(cursorB, "backoff_policy");
                int iB20 = v0.b.b(cursorB, "backoff_delay_duration");
                int iB21 = v0.b.b(cursorB, "period_start_time");
                int iB22 = v0.b.b(cursorB, "minimum_retention_duration");
                int iB23 = v0.b.b(cursorB, "schedule_requested_at");
                int iB24 = v0.b.b(cursorB, "run_in_foreground");
                int iB25 = v0.b.b(cursorB, "out_of_quota_policy");
                int i10 = iB14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iB9);
                    int i11 = iB9;
                    String string2 = cursorB.getString(iB11);
                    int i12 = iB11;
                    androidx.work.c cVar2 = new androidx.work.c();
                    int i13 = iB;
                    cVar2.k(v.e(cursorB.getInt(iB)));
                    cVar2.m(cursorB.getInt(iB2) != 0);
                    cVar2.n(cursorB.getInt(iB3) != 0);
                    cVar2.l(cursorB.getInt(iB4) != 0);
                    cVar2.o(cursorB.getInt(iB5) != 0);
                    int i14 = iB2;
                    int i15 = iB3;
                    cVar2.p(cursorB.getLong(iB6));
                    cVar2.q(cursorB.getLong(iB7));
                    cVar2.j(v.b(cursorB.getBlob(iB8)));
                    p pVar = new p(string, string2);
                    pVar.f22079b = v.g(cursorB.getInt(iB10));
                    pVar.f22081d = cursorB.getString(iB12);
                    pVar.f22082e = androidx.work.e.g(cursorB.getBlob(iB13));
                    int i16 = i10;
                    pVar.f22083f = androidx.work.e.g(cursorB.getBlob(i16));
                    i10 = i16;
                    int i17 = iB15;
                    pVar.f22084g = cursorB.getLong(i17);
                    int i18 = iB13;
                    int i19 = iB16;
                    pVar.f22085h = cursorB.getLong(i19);
                    int i20 = iB4;
                    int i21 = iB17;
                    pVar.f22086i = cursorB.getLong(i21);
                    int i22 = iB18;
                    pVar.f22088k = cursorB.getInt(i22);
                    int i23 = iB19;
                    pVar.f22089l = v.d(cursorB.getInt(i23));
                    iB17 = i21;
                    int i24 = iB20;
                    pVar.f22090m = cursorB.getLong(i24);
                    int i25 = iB21;
                    pVar.f22091n = cursorB.getLong(i25);
                    iB21 = i25;
                    int i26 = iB22;
                    pVar.f22092o = cursorB.getLong(i26);
                    int i27 = iB23;
                    pVar.f22093p = cursorB.getLong(i27);
                    int i28 = iB24;
                    pVar.f22094q = cursorB.getInt(i28) != 0;
                    int i29 = iB25;
                    pVar.f22095r = v.f(cursorB.getInt(i29));
                    pVar.f22087j = cVar2;
                    arrayList.add(pVar);
                    iB25 = i29;
                    iB2 = i14;
                    iB13 = i18;
                    iB15 = i17;
                    iB16 = i19;
                    iB18 = i22;
                    iB23 = i27;
                    iB9 = i11;
                    iB11 = i12;
                    iB = i13;
                    iB24 = i28;
                    iB22 = i26;
                    iB3 = i15;
                    iB20 = i24;
                    iB4 = i20;
                    iB19 = i23;
                }
                cursorB.close();
                cVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                cVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = cVarE;
        }
    }
}
