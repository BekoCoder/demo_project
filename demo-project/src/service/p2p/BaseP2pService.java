package service.p2p;

import dto.BaseP2pResponse;
import model.Card;

public interface BaseP2pService {
    BaseP2pResponse p2p(final Card card1, final Card card2, final double amount);
}
