package com.mycelium.wapi.wallet;

import com.mycelium.wapi.wallet.coins.CoinType;

public class SendRequest<T extends GenericTransaction> {

    /**
     * The blockchain network that this request is going to transact
     */
    public CoinType type;

    public T tx;

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }


    // Tracks if this has been passed to wallet.completeTransaction already: just a safety check.
    private boolean completed;

    protected SendRequest(CoinType type) {
        this.type = type;
    }
}
