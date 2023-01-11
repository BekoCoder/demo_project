package model;

import java.util.UUID;

public class History extends BaseModel{

    private UUID senderCardId;
    private UUID receiverCardId;

    private double amount;

    public History() {
    }

    public History(UUID senderCardId, UUID receiverCardId, double amount) {
        this.senderCardId = senderCardId;
        this.receiverCardId = receiverCardId;
        this.amount = amount;
    }

    public UUID getSenderCardId() {
        return senderCardId;
    }

    public void setSenderCardId(UUID senderCardId) {
        this.senderCardId = senderCardId;
    }

    public UUID getReceiverCardId() {
        return receiverCardId;
    }

    public void setReceiverCardId(UUID receiverCardId) {
        this.receiverCardId = receiverCardId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
