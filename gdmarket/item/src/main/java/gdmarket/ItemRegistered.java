package gdmarket;

public class ItemRegistered extends AbstractEvent {

    private Integer itemNo;
    private String itemName;
    private String itemStatus;
    private Integer itemPrice;
    private String rentalStatus;
    private Integer reservationNo;

    public Integer getItemNo() {
        return itemNo;
    }

    public void setItemNo(Integer itemNo) {
        this.itemNo = itemNo;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getItemStatus() {
        return itemStatus;
    }
    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }
    public Integer getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(Integer itemPrice) {
        this.itemPrice = itemPrice;
    }
    private String getRentalStatus () {
        return rentalStatus;
    }
    public void setRentalStatus (String rentalStatus){
        this.rentalStatus = rentalStatus;
    }
    private Integer getReservationNo() {
        return reservationNo;
    }
    public void setReservationNo (Integer reservationNo){
        this.reservationNo = reservationNo;
    }
}