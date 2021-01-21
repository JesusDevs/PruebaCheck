package com.example.PruebaCheck.second_activity;

public class Apartment {

    private String nameDepto;  // Nombre del edificio
    private String projectName;   // Nombre del Proyecto
    private String numberUnit;        // Numero de unidad o departamento
    private String address;       // Dirección
    private String urlImageBuilding;  // url de imagen del edificio

    public Apartment(String buildingName, String projectName, String unitId,
                     String address, String urlImageBuilding) {
        this.nameDepto = buildingName;
        this.projectName = projectName;
        this.numberUnit = unitId;
        this.address = address;
        this.urlImageBuilding = urlImageBuilding;
    }

    public String getBuildingName() {
        return nameDepto;
    }

    public void setBuildingName(String buildingName) {
        this.nameDepto = buildingName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getUnitId() {
        return numberUnit;
    }

    public void setUnitId(String unitId) {
        this.numberUnit = unitId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUrlImageBuilding() {
        return urlImageBuilding;
    }

    public void setUrlImageBuilding(String urlImageBuilding) {
        this.urlImageBuilding = urlImageBuilding;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "buildingName='" + nameDepto + '\'' +
                ", projectName='" + projectName + '\'' +
                ", unitId='" + numberUnit + '\'' +
                ", address='" + address + '\'' +
                ", urlImageBuilding='" + urlImageBuilding + '\'' +
                '}';
    }
}
