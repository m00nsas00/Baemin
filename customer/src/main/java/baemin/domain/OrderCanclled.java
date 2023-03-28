package baemin.domain;

import baemin.domain.*;
import baemin.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCanclled extends AbstractEvent {

    private Long id;

    public OrderCanclled(Order aggregate) {
        super(aggregate);
    }

    public OrderCanclled() {
        super();
    }
}
