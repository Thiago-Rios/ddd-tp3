package com.infnet.ddd_tp3.command;

import com.infnet.ddd_tp3.events.PedidoCriadoEvent;

public class CriarPedidoCommand extends BaseCommand<String> {
    private final String pedidoId;

    public CriarPedidoCommand(String pedidoId) {
        super(pedidoId);
        this.pedidoId = pedidoId;
    }

    @Override
    public void execute() {
        PedidoCriadoEvent event = new PedidoCriadoEvent(pedidoId);
        System.out.println("Persistindo o evento: " + event.eventId);
    }

    public String getPedidoId() {
        return pedidoId;
    }
}
