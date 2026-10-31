package io.bidmachine;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class BidToken implements ExpirationHandler.Listener {
    private final AdRequest<?, ?, ?> adRequest;
    private final ExpirationHandler expirationHandler;
    private final ExpirationListener<BidToken> expirationListener;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f16450id = UUID.randomUUID().toString();

    private static class b implements ExpirationHandler.TaskScheduler {
        private b() {
        }

        @Override // io.bidmachine.ExpirationHandler.TaskScheduler
        public void cancelTask(sc.b bVar) {
            BidTokenTaskManager.cancel(bVar);
        }

        @Override // io.bidmachine.ExpirationHandler.TaskScheduler
        public void scheduleTask(sc.b bVar, long j10) {
            BidTokenTaskManager.schedule(bVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    BidToken(AdRequest<?, ?, ?> adRequest, int i10, ExpirationListener<BidToken> expirationListener) {
        this.adRequest = adRequest;
        this.expirationHandler = new ExpirationHandler(TimeUnit.SECONDS.toMillis(i10), this, new b());
        this.expirationListener = expirationListener;
    }

    void destroyAdRequest() {
        this.adRequest.clearNetworkAdUnits();
        this.adRequest.destroy();
    }

    public AdRequest<?, ?, ?> getAdRequest() {
        return this.adRequest;
    }

    public String getId() {
        return this.f16450id;
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        this.expirationListener.onExpired(this);
    }

    void startExpiration() {
        this.expirationHandler.start();
    }

    void stopExpiration() {
        this.expirationHandler.stop();
    }
}
