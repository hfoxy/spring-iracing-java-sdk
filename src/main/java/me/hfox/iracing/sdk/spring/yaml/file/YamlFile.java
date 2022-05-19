package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YamlFile {

    @JsonProperty("WeekendInfo")
    private WeekendInfoYaml weekendInfo;
    @JsonProperty("SessionInfo")
    private SessionInfoYaml sessionInfo;
    @JsonProperty("QualifyResultsInfo")
    private QualifyResultsInfoYaml qualifyResultsInfo;
    @JsonProperty("CameraInfo")
    private CamerasInfoYaml cameraInfo;
    @JsonProperty("RadioInfo")
    private RadiosInfoYaml radioInfo;
    @JsonProperty("DriverInfo")
    private DriversInfoYaml driverInfo;
    @JsonProperty("SplitTimeInfo")
    private SplitTimeInfoYaml splitTimeInfo;

    public WeekendInfoYaml getWeekendInfo() {
        return weekendInfo;
    }

    public void setWeekendInfo(WeekendInfoYaml weekendInfo) {
        this.weekendInfo = weekendInfo;
    }

    public SessionInfoYaml getSessionInfo() {
        return sessionInfo;
    }

    public void setSessionInfo(SessionInfoYaml sessionInfo) {
        this.sessionInfo = sessionInfo;
    }

    public QualifyResultsInfoYaml getQualifyResultsInfo() {
        return qualifyResultsInfo;
    }

    public void setQualifyResultsInfo(QualifyResultsInfoYaml qualifyResultsInfo) {
        this.qualifyResultsInfo = qualifyResultsInfo;
    }

    public CamerasInfoYaml getCameraInfo() {
        return cameraInfo;
    }

    public void setCameraInfo(CamerasInfoYaml cameraInfo) {
        this.cameraInfo = cameraInfo;
    }

    public RadiosInfoYaml getRadioInfo() {
        return radioInfo;
    }

    public void setRadioInfo(RadiosInfoYaml radioInfo) {
        this.radioInfo = radioInfo;
    }

    public DriversInfoYaml getDriverInfo() {
        return driverInfo;
    }

    public void setDriverInfo(DriversInfoYaml driverInfo) {
        this.driverInfo = driverInfo;
    }

    public SplitTimeInfoYaml getSplitTimeInfo() {
        return splitTimeInfo;
    }

    public void setSplitTimeInfo(SplitTimeInfoYaml splitTimeInfo) {
        this.splitTimeInfo = splitTimeInfo;
    }

}
