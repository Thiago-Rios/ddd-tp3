package com.infnet.ddd_tp3.events;

public class PedidoCriadoEvent extends BaseEvent<String> {

    public PedidoCriadoEvent(String pedidoId) {
        super(pedidoId);
    }

    public String getPedidoId() {
        return eventData;
    }
}
