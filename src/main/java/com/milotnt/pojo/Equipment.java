package com.milotnt.pojo;

/**
 * @author MiloTnT [milotntspace@gmail.com]
 * @date 2021/8/10
 */
public class Equipment {

    private Integer equipmentId;
    private String equipmentName;
    private String equipmentLocation;
    private String equipmentStatus;
    private String equipmentMessage;

    public Equipment() {
    }

    public Equipment(Integer equipmentId, String equipmentName, String equipmentLocation, String equipmentStatus, String equipmentMessage) {
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.equipmentLocation = equipmentLocation;
        this.equipmentStatus = equipmentStatus;
        this.equipmentMessage = equipmentMessage;
    }

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getEquipmentLocation() {
        return equipmentLocation;
    }

    public void setEquipmentLocation(String equipmentLocation) {
        this.equipmentLocation = equipmentLocation;
    }

    public String getEquipmentStatus() {
        return equipmentStatus;
    }

    public void setEquipmentStatus(String equipmentStatus) {
        this.equipmentStatus = equipmentStatus;
    }

    public String getEquipmentMessage() {
        return equipmentMessage;
    }

    public void setEquipmentMessage(String equipmentMessage) {
        this.equipmentMessage = equipmentMessage;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "equipmentId=" + equipmentId +
                ", equipmentName='" + equipmentName + '\'' +
                ", equipmentLocation='" + equipmentLocation + '\'' +
                ", equipmentStatus='" + equipmentStatus + '\'' +
                ", equipmentMessage='" + equipmentMessage + '\'' +
                '}';
    }
}
