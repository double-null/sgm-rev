package com.iab.omid.library.applovin.adsession;

import android.view.View;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.internal.f;
import com.iab.omid.library.applovin.internal.i;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.b;
import com.iab.omid.library.applovin.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f12499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f12500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f12501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.a f12502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f12503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f12505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f12506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f12507i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f12508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f12509k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f12507i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f12508j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f12505g) {
            return;
        }
        this.f12501c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f12506h;
    }

    public AdSessionStatePublisher d() {
        return this.f12503e;
    }

    public View e() {
        return this.f12502d.get();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f12505g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f12501c.a();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f12505g) {
            return;
        }
        this.f12502d.clear();
        removeAllFriendlyObstructions();
        this.f12505g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f12503e = null;
        this.f12509k = null;
    }

    public boolean g() {
        return this.f12509k != null;
    }

    public boolean h() {
        return this.f12504f && !this.f12505g;
    }

    public boolean i() {
        return this.f12505g;
    }

    public boolean j() {
        return this.f12500b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f12500b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f12504f;
    }

    void m() {
        a();
        d().g();
        this.f12507i = true;
    }

    void n() {
        b();
        d().h();
        this.f12508j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f12505g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f12505g) {
            return;
        }
        this.f12501c.b();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f12505g) {
            return;
        }
        this.f12501c.c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f12509k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f12504f || this.f12503e == null) {
            return;
        }
        this.f12504f = true;
        c.c().c(this);
        this.f12503e.a(i.c().b());
        this.f12503e.a(com.iab.omid.library.applovin.internal.a.a().b());
        this.f12503e.b(com.iab.omid.library.applovin.attestation.c.a(com.iab.omid.library.applovin.internal.g.b().a()).a());
        this.f12503e.a(this, this.f12499a);
    }

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f12501c = new f();
        this.f12504f = false;
        this.f12505g = false;
        this.f12500b = adSessionConfiguration;
        this.f12499a = adSessionContext;
        this.f12506h = str;
        b(null);
        this.f12503e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f12503e.i();
        c.c().a(this);
        this.f12503e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f12502d.clear();
            }
        }
    }

    private void b(View view) {
        this.f12502d = new com.iab.omid.library.applovin.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.applovin.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.applovin.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f12509k.onPossibleObstructionsDetected(this.f12506h, arrayList);
        }
    }

    void a(JSONObject jSONObject) {
        b();
        d().b(jSONObject);
        this.f12508j = true;
    }
}
