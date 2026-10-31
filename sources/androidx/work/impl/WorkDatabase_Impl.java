package androidx.work.impl;

import androidx.room.i;
import com.android.billingclient.gp.VRfCTjjLv;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import m1.b;
import m1.e;
import m1.f;
import m1.h;
import m1.k;
import m1.l;
import m1.n;
import m1.o;
import m1.q;
import m1.r;
import m1.t;
import m1.u;
import x0.c;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile q f3672m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile b f3673n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile t f3674o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile h f3675p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile k f3676q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile n f3677r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile e f3678s;

    @Override // androidx.work.impl.WorkDatabase
    public n A() {
        n nVar;
        if (this.f3677r != null) {
            return this.f3677r;
        }
        synchronized (this) {
            if (this.f3677r == null) {
                this.f3677r = new o(this);
            }
            nVar = this.f3677r;
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q B() {
        q qVar;
        if (this.f3672m != null) {
            return this.f3672m;
        }
        synchronized (this) {
            if (this.f3672m == null) {
                this.f3672m = new r(this);
            }
            qVar = this.f3672m;
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public t C() {
        t tVar;
        if (this.f3674o != null) {
            return this.f3674o;
        }
        synchronized (this) {
            if (this.f3674o == null) {
                this.f3674o = new u(this);
            }
            tVar = this.f3674o;
        }
        return tVar;
    }

    @Override // androidx.room.h
    protected c f(androidx.room.a aVar) {
        return aVar.f3448a.a(c.b.a(aVar.f3449b).c(aVar.f3450c).b(new i(aVar, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).a());
    }

    @Override // androidx.work.impl.WorkDatabase
    public b t() {
        b bVar;
        if (this.f3673n != null) {
            return this.f3673n;
        }
        synchronized (this) {
            if (this.f3673n == null) {
                this.f3673n = new m1.c(this);
            }
            bVar = this.f3673n;
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public e x() {
        e eVar;
        if (this.f3678s != null) {
            return this.f3678s;
        }
        synchronized (this) {
            if (this.f3678s == null) {
                this.f3678s = new f(this);
            }
            eVar = this.f3678s;
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public h y() {
        h hVar;
        if (this.f3675p != null) {
            return this.f3675p;
        }
        synchronized (this) {
            if (this.f3675p == null) {
                this.f3675p = new m1.i(this);
            }
            hVar = this.f3675p;
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k z() {
        k kVar;
        if (this.f3676q != null) {
            return this.f3676q;
        }
        synchronized (this) {
            if (this.f3676q == null) {
                this.f3676q = new l(this);
            }
            kVar = this.f3676q;
        }
        return kVar;
    }

    @Override // androidx.room.h
    protected androidx.room.e e() {
        return new androidx.room.e(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", VRfCTjjLv.bxGaP, "Preference");
    }

    /* JADX INFO: loaded from: classes.dex */
    class a extends i.a {
        a(int i10) {
            super(i10);
        }

        @Override // androidx.room.i.a
        public void a(x0.b bVar) {
            bVar.j("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.j("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            bVar.j("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            bVar.j("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            bVar.j("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            bVar.j("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            bVar.j("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.j("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            bVar.j("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.j("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.j("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            bVar.j("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.j("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            bVar.j("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.j("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // androidx.room.i.a
        public void b(x0.b bVar) {
            bVar.j("DROP TABLE IF EXISTS `Dependency`");
            bVar.j("DROP TABLE IF EXISTS `WorkSpec`");
            bVar.j("DROP TABLE IF EXISTS `WorkTag`");
            bVar.j("DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.j("DROP TABLE IF EXISTS `WorkName`");
            bVar.j("DROP TABLE IF EXISTS `WorkProgress`");
            bVar.j("DROP TABLE IF EXISTS `Preference`");
            if (((androidx.room.h) WorkDatabase_Impl.this).f3519h != null) {
                int size = ((androidx.room.h) WorkDatabase_Impl.this).f3519h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((androidx.room.h.b) ((androidx.room.h) WorkDatabase_Impl.this).f3519h.get(i10)).b(bVar);
                }
            }
        }

        @Override // androidx.room.i.a
        protected void c(x0.b bVar) {
            if (((androidx.room.h) WorkDatabase_Impl.this).f3519h != null) {
                int size = ((androidx.room.h) WorkDatabase_Impl.this).f3519h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((androidx.room.h.b) ((androidx.room.h) WorkDatabase_Impl.this).f3519h.get(i10)).a(bVar);
                }
            }
        }

        @Override // androidx.room.i.a
        public void d(x0.b bVar) {
            ((androidx.room.h) WorkDatabase_Impl.this).f3512a = bVar;
            bVar.j("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m(bVar);
            if (((androidx.room.h) WorkDatabase_Impl.this).f3519h != null) {
                int size = ((androidx.room.h) WorkDatabase_Impl.this).f3519h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((androidx.room.h.b) ((androidx.room.h) WorkDatabase_Impl.this).f3519h.get(i10)).c(bVar);
                }
            }
        }

        @Override // androidx.room.i.a
        public void f(x0.b bVar) {
            v0.c.a(bVar);
        }

        @Override // androidx.room.i.a
        protected i.b g(x0.b bVar) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new v0.f.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new v0.f.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new v0.f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new v0.f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new v0.f.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new v0.f.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            v0.f fVar = new v0.f("Dependency", map, hashSet, hashSet2);
            v0.f fVarA = v0.f.a(bVar, "Dependency");
            if (!fVar.equals(fVarA)) {
                return new i.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fVar + "\n Found:\n" + fVarA);
            }
            HashMap map2 = new HashMap(25);
            map2.put("id", new v0.f.a("id", "TEXT", true, 1, null, 1));
            map2.put(ServerProtocol.DIALOG_PARAM_STATE, new v0.f.a(ServerProtocol.DIALOG_PARAM_STATE, "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new v0.f.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new v0.f.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            map2.put("input", new v0.f.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new v0.f.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new v0.f.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new v0.f.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new v0.f.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new v0.f.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new v0.f.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new v0.f.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("period_start_time", new v0.f.a("period_start_time", "INTEGER", true, 0, null, 1));
            map2.put("minimum_retention_duration", new v0.f.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new v0.f.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new v0.f.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new v0.f.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("required_network_type", new v0.f.a("required_network_type", "INTEGER", false, 0, null, 1));
            map2.put("requires_charging", new v0.f.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new v0.f.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new v0.f.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new v0.f.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new v0.f.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new v0.f.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new v0.f.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new v0.f.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new v0.f.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            v0.f fVar2 = new v0.f("WorkSpec", map2, hashSet3, hashSet4);
            v0.f fVarA2 = v0.f.a(bVar, "WorkSpec");
            if (!fVar2.equals(fVarA2)) {
                return new i.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fVar2 + "\n Found:\n" + fVarA2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new v0.f.a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new v0.f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new v0.f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new v0.f.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            v0.f fVar3 = new v0.f("WorkTag", map3, hashSet5, hashSet6);
            v0.f fVarA3 = v0.f.a(bVar, "WorkTag");
            if (!fVar3.equals(fVarA3)) {
                return new i.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fVar3 + "\n Found:\n" + fVarA3);
            }
            HashMap map4 = new HashMap(2);
            map4.put("work_spec_id", new v0.f.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("system_id", new v0.f.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new v0.f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            v0.f fVar4 = new v0.f("SystemIdInfo", map4, hashSet7, new HashSet(0));
            v0.f fVarA4 = v0.f.a(bVar, "SystemIdInfo");
            if (!fVar4.equals(fVarA4)) {
                return new i.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fVar4 + "\n Found:\n" + fVarA4);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new v0.f.a("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new v0.f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new v0.f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new v0.f.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            v0.f fVar5 = new v0.f("WorkName", map5, hashSet8, hashSet9);
            v0.f fVarA5 = v0.f.a(bVar, "WorkName");
            if (!fVar5.equals(fVarA5)) {
                return new i.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fVar5 + "\n Found:\n" + fVarA5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new v0.f.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put("progress", new v0.f.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new v0.f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            v0.f fVar6 = new v0.f("WorkProgress", map6, hashSet10, new HashSet(0));
            v0.f fVarA6 = v0.f.a(bVar, "WorkProgress");
            if (!fVar6.equals(fVarA6)) {
                return new i.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + fVar6 + "\n Found:\n" + fVarA6);
            }
            HashMap map7 = new HashMap(2);
            map7.put(SDKConstants.PARAM_KEY, new v0.f.a(SDKConstants.PARAM_KEY, "TEXT", true, 1, null, 1));
            map7.put("long_value", new v0.f.a("long_value", "INTEGER", false, 0, null, 1));
            v0.f fVar7 = new v0.f("Preference", map7, new HashSet(0), new HashSet(0));
            v0.f fVarA7 = v0.f.a(bVar, "Preference");
            if (fVar7.equals(fVarA7)) {
                return new i.b(true, null);
            }
            return new i.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + fVar7 + "\n Found:\n" + fVarA7);
        }

        @Override // androidx.room.i.a
        public void e(x0.b bVar) {
        }
    }
}
