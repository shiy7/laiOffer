package laiproject.delivery.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

/*
{
 "orderNumber": "1234",
 "senderAddress":"5099 Picaqiu Road",
    "deliverAddress": "4321 Crescent Road",
 "senderName": "Tim",
    "receiverName": "chris",
    "receiverPhone":"57399092347"
 "senderPhone":"57399092347"
    "packageWeight": "2kg",
    "Money": "10",
 "CardNum":"1234",
 "EstimateTime" "10 Min",
    "shipmentStatus": "Not applicable",
 "OrderTimeStamp":"2020.8.8 20.00pm"
 "Size":"small",
 "Emergency":"not urgent",
 "UserID":"1"
 "DeliverMethod":"Drone"
}
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "orders")
public class Order implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int order_id;
    @Column(name = "orderNumber", unique=true)
    private String orderNumber;
    @Column(name = "deliverAddress")
    private String deliverAddress;
    @Column(name = "receiverName")
    private String receiverName;
    @Column(name = "packageWeight")
    private String packageWeight;
    @Column(name = "payment")
    private String payment;
    @Column(name = "shipmentStatus")
    private String shipmentStatus;
    @Column(name = "receiverPhone")
    private String receiverPhone;
    @Column(name = "senderPhone")
    private String senderPhone;
    @Column(name = "cardNo")
    private String cardNo;
    @Column(name = "estimateTime")
    private String estimateTime;
    @Column(name = "orderTimestamp")
    private String orderTimestamp;
    @Column(name = "packageSize")
    private String packageSize;
    @Column(name = "emergency")
    private String emergency;
    @Column(name = "DeliverMethod")
    private String DeliverMethod;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "robot_id")
    private Robot robot;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "drone_id")
    private Drone drone;

    public int getOrderId() {
        return order_id;
    }

    public void setOrderId(int order_id) {
        this.order_id = order_id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String order_number) {
        this.orderNumber = order_number;
    }

    public String getDeliverAddress() {
        return deliverAddress;
    }

    public void setDeliverAddress(String deliver_address) {
        this.deliverAddress = deliver_address;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiver_name) {
        this.receiverName = receiver_name;
    }

    public String getPackageWeight() {
        return packageWeight;
    }


    public void setPackageWeight(String package_weight) {
        this.packageWeight = package_weight;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(String shipment_status) {
        this.shipmentStatus = shipment_status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public Drone getDrone() {
        return drone;
    }

    public void setDrone(Drone drone) {
        this.drone = drone;
    }
}
