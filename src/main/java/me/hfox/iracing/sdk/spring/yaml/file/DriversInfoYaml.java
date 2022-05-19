package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import me.hfox.iracing.sdk.spring.utils.ToStringBuilder;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DriversInfoYaml {

    @JsonProperty("DriverCarIdx")
    private Integer driverCarIdx;

    @JsonProperty("DriverHeadPosX")
    private String driverHeadPosX;

    @JsonProperty("DriverHeadPosY")
    private String driverHeadPosY;

    @JsonProperty("DriverHeadPosZ")
    private String driverHeadPosZ;

    @JsonProperty("DriverCarIdleRPM")
    private String driverCarIdleRPM;

    @JsonProperty("DriverCarRedLine")
    private String driverCarRedLine;

    @JsonProperty("DriverCarFuelKgPerLtr")
    private float driverCarFuelKgPerLtr;

    @JsonProperty("DriverCarFuelMaxLtr")
    private String driverCarFuelMaxLtr;

    @JsonProperty("DriverCarMaxFuelPct")
    private String driverCarMaxFuelPct;

    @JsonProperty("DriverCarSLFirstRPM")
    private String driverCarSLFirstRPM;

    @JsonProperty("DriverCarSLShiftRPM")
    private String driverCarSLShiftRPM;

    @JsonProperty("DriverCarSLLastRPM")
    private String driverCarSLLastRPM;

    @JsonProperty("DriverCarSLBlinkRPM")
    private String driverCarSLBlinkRPM;

    @JsonProperty("DriverPitTrkPct")
    private String driverPitTrkPct;

    @JsonProperty("DriverCarEstLapTime")
    private String driverCarEstLapTime;

    @JsonProperty("DriverSetupName")
    private String driverSetupName;

    @JsonProperty("DriverSetupIsModified")
    private String driverSetupIsModified;

    @JsonProperty("DriverSetupLoadTypeName")
    private String driverSetupLoadTypeName;

    @JsonProperty("DriverSetupPassedTech")
    private String driverSetupPassedTech;

    @JsonProperty("Drivers")
    private List<DriverInfoYaml> drivers;

    public Integer getDriverCarIdx() {
        return driverCarIdx;
    }

    public void setDriverCarIdx(Integer driverCarIdx) {
        this.driverCarIdx = driverCarIdx;
    }

    public String getDriverHeadPosX() {
        return driverHeadPosX;
    }

    public void setDriverHeadPosX(String driverHeadPosX) {
        this.driverHeadPosX = driverHeadPosX;
    }

    public String getDriverHeadPosY() {
        return driverHeadPosY;
    }

    public void setDriverHeadPosY(String driverHeadPosY) {
        this.driverHeadPosY = driverHeadPosY;
    }

    public String getDriverHeadPosZ() {
        return driverHeadPosZ;
    }

    public void setDriverHeadPosZ(String driverHeadPosZ) {
        this.driverHeadPosZ = driverHeadPosZ;
    }

    public String getDriverCarIdleRPM() {
        return driverCarIdleRPM;
    }

    public void setDriverCarIdleRPM(String driverCarIdleRPM) {
        this.driverCarIdleRPM = driverCarIdleRPM;
    }

    public String getDriverCarRedLine() {
        return driverCarRedLine;
    }

    public void setDriverCarRedLine(String driverCarRedLine) {
        this.driverCarRedLine = driverCarRedLine;
    }

    public float getDriverCarFuelKgPerLtr() {
        return driverCarFuelKgPerLtr;
    }

    public void setDriverCarFuelKgPerLtr(float driverCarFuelKgPerLtr) {
        this.driverCarFuelKgPerLtr = driverCarFuelKgPerLtr;
    }

    public String getDriverCarFuelMaxLtr() {
        return driverCarFuelMaxLtr;
    }

    public void setDriverCarFuelMaxLtr(String driverCarFuelMaxLtr) {
        this.driverCarFuelMaxLtr = driverCarFuelMaxLtr;
    }

    public String getDriverCarMaxFuelPct() {
        return driverCarMaxFuelPct;
    }

    public void setDriverCarMaxFuelPct(String driverCarMaxFuelPct) {
        this.driverCarMaxFuelPct = driverCarMaxFuelPct;
    }

    public String getDriverCarSLFirstRPM() {
        return driverCarSLFirstRPM;
    }

    public void setDriverCarSLFirstRPM(String driverCarSLFirstRPM) {
        this.driverCarSLFirstRPM = driverCarSLFirstRPM;
    }

    public String getDriverCarSLShiftRPM() {
        return driverCarSLShiftRPM;
    }

    public void setDriverCarSLShiftRPM(String driverCarSLShiftRPM) {
        this.driverCarSLShiftRPM = driverCarSLShiftRPM;
    }

    public String getDriverCarSLLastRPM() {
        return driverCarSLLastRPM;
    }

    public void setDriverCarSLLastRPM(String driverCarSLLastRPM) {
        this.driverCarSLLastRPM = driverCarSLLastRPM;
    }

    public String getDriverCarSLBlinkRPM() {
        return driverCarSLBlinkRPM;
    }

    public void setDriverCarSLBlinkRPM(String driverCarSLBlinkRPM) {
        this.driverCarSLBlinkRPM = driverCarSLBlinkRPM;
    }

    public String getDriverPitTrkPct() {
        return driverPitTrkPct;
    }

    public void setDriverPitTrkPct(String driverPitTrkPct) {
        this.driverPitTrkPct = driverPitTrkPct;
    }

    public String getDriverCarEstLapTime() {
        return driverCarEstLapTime;
    }

    public void setDriverCarEstLapTime(String driverCarEstLapTime) {
        this.driverCarEstLapTime = driverCarEstLapTime;
    }

    public String getDriverSetupName() {
        return driverSetupName;
    }

    public void setDriverSetupName(String driverSetupName) {
        this.driverSetupName = driverSetupName;
    }

    public String getDriverSetupIsModified() {
        return driverSetupIsModified;
    }

    public void setDriverSetupIsModified(String driverSetupIsModified) {
        this.driverSetupIsModified = driverSetupIsModified;
    }

    public String getDriverSetupLoadTypeName() {
        return driverSetupLoadTypeName;
    }

    public void setDriverSetupLoadTypeName(String driverSetupLoadTypeName) {
        this.driverSetupLoadTypeName = driverSetupLoadTypeName;
    }

    public String getDriverSetupPassedTech() {
        return driverSetupPassedTech;
    }

    public void setDriverSetupPassedTech(String driverSetupPassedTech) {
        this.driverSetupPassedTech = driverSetupPassedTech;
    }

    public List<DriverInfoYaml> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<DriverInfoYaml> drivers) {
        this.drivers = drivers;
    }

    @Override
    public String toString() {
        return ToStringBuilder.build(this).detailedArray(true).simpleName(true).reflective(true).toString();
    }

}
