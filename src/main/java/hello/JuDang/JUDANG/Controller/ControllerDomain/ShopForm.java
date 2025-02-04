package hello.JuDang.JUDANG.Controller.ControllerDomain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ShopForm {
    private String sellerId;
    private String shopName;
    private String category;
    private int totalSeat;
    private int currentSeat;
    private Long latitude;
    private Long longitude;
    private boolean open;
}
