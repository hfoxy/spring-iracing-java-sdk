package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import me.hfox.iracing.sdk.spring.utils.ToStringBuilder;
import me.hfox.iracing.sdk.spring.yaml.file.time.Time;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionYaml {

    @JsonProperty("SessionNum")
    private Integer sessionNum;

    @JsonProperty("SessionLaps")
    private String sessionLaps;

    @JsonProperty("SessionTime")
    private Time sessionTime;

    @JsonProperty("SessionNumLapsToAvg")
    private Integer sessionNumLapsToAvg;

    @JsonProperty("SessionType")
    private String sessionType;

    @JsonProperty("SessionTrackRubberState")
    private String sessionTrackRubberState;

    @JsonProperty("SessionName")
    private String sessionName;

    @JsonProperty("SessionSubType")
    private String sessionSubType;

    @JsonProperty("ResultsPositions")
    private List<ResultsPositionsYaml> resultsPositions;

    @JsonProperty("ResultsFastestLap")
    private List<ResultsFastestLapYaml> resultsFastestLap;

    @JsonProperty("ResultsAverageLapTime")
    private Double resultsAverageLapTime;

    @JsonProperty("ResultsNumCautionFlags")
    private Integer resultsNumCautionFlags;

    @JsonProperty("ResultsNumCautionLaps")
    private Integer resultsNumCautionLaps;

    @JsonProperty("ResultsNumLeadChanges")
    private Integer resultsNumLeadChanges;

    @JsonProperty("ResultsLapsComplete")
    private Integer resultsLapsComplete;

    @JsonProperty("ResultsOfficial")
    private Integer resultsOfficial;

    public Integer getSessionNum() {
        return sessionNum;
    }

    public void setSessionNum(Integer sessionNum) {
        this.sessionNum = sessionNum;
    }

    public String getSessionLaps() {
        return sessionLaps;
    }

    public void setSessionLaps(String sessionLaps) {
        this.sessionLaps = sessionLaps;
    }

    public Time getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(Time sessionTime) {
        this.sessionTime = sessionTime;
    }

    public Integer getSessionNumLapsToAvg() {
        return sessionNumLapsToAvg;
    }

    public void setSessionNumLapsToAvg(Integer sessionNumLapsToAvg) {
        this.sessionNumLapsToAvg = sessionNumLapsToAvg;
    }

    public String getSessionType() {
        return sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public String getSessionTrackRubberState() {
        return sessionTrackRubberState;
    }

    public void setSessionTrackRubberState(String sessionTrackRubberState) {
        this.sessionTrackRubberState = sessionTrackRubberState;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public String getSessionSubType() {
        return sessionSubType;
    }

    public void setSessionSubType(String sessionSubType) {
        this.sessionSubType = sessionSubType;
    }

    public List<ResultsPositionsYaml> getResultsPositions() {
        return resultsPositions;
    }

    public void setResultsPositions(List<ResultsPositionsYaml> resultsPositions) {
        this.resultsPositions = resultsPositions;
    }

    public List<ResultsFastestLapYaml> getResultsFastestLap() {
        return resultsFastestLap;
    }

    public void setResultsFastestLap(List<ResultsFastestLapYaml> resultsFastestLap) {
        this.resultsFastestLap = resultsFastestLap;
    }

    public Double getResultsAverageLapTime() {
        return resultsAverageLapTime;
    }

    public void setResultsAverageLapTime(Double resultsAverageLapTime) {
        this.resultsAverageLapTime = resultsAverageLapTime;
    }

    public Integer getResultsNumCautionFlags() {
        return resultsNumCautionFlags;
    }

    public void setResultsNumCautionFlags(Integer resultsNumCautionFlags) {
        this.resultsNumCautionFlags = resultsNumCautionFlags;
    }

    public Integer getResultsNumCautionLaps() {
        return resultsNumCautionLaps;
    }

    public void setResultsNumCautionLaps(Integer resultsNumCautionLaps) {
        this.resultsNumCautionLaps = resultsNumCautionLaps;
    }

    public Integer getResultsNumLeadChanges() {
        return resultsNumLeadChanges;
    }

    public void setResultsNumLeadChanges(Integer resultsNumLeadChanges) {
        this.resultsNumLeadChanges = resultsNumLeadChanges;
    }

    public Integer getResultsLapsComplete() {
        return resultsLapsComplete;
    }

    public void setResultsLapsComplete(Integer resultsLapsComplete) {
        this.resultsLapsComplete = resultsLapsComplete;
    }

    public Integer getResultsOfficial() {
        return resultsOfficial;
    }

    public void setResultsOfficial(Integer resultsOfficial) {
        this.resultsOfficial = resultsOfficial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        SessionYaml that = (SessionYaml) o;

        return new EqualsBuilder().append(sessionNum, that.sessionNum).append(sessionLaps, that.sessionLaps)
                .append(sessionTime, that.sessionTime).append(sessionNumLapsToAvg, that.sessionNumLapsToAvg)
                .append(sessionType, that.sessionType).append(sessionTrackRubberState, that.sessionTrackRubberState)
                .append(resultsPositions, that.resultsPositions).append(resultsFastestLap, that.resultsFastestLap)
                .append(resultsAverageLapTime, that.resultsAverageLapTime)
                .append(resultsNumCautionFlags, that.resultsNumCautionFlags)
                .append(resultsNumCautionLaps, that.resultsNumCautionLaps)
                .append(resultsNumLeadChanges, that.resultsNumLeadChanges)
                .append(resultsLapsComplete, that.resultsLapsComplete)
                .append(resultsOfficial, that.resultsOfficial).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(sessionNum).append(sessionLaps)
                .append(sessionTime).append(sessionNumLapsToAvg).append(sessionType).append(sessionTrackRubberState)
                .append(resultsPositions).append(resultsFastestLap).append(resultsAverageLapTime)
                .append(resultsNumCautionFlags).append(resultsNumCautionLaps).append(resultsNumLeadChanges)
                .append(resultsLapsComplete).append(resultsOfficial).toHashCode();
    }

    @Override
    public String toString() {
        return ToStringBuilder.build(this).detailedArray(true).simpleName(true).reflective(true).toString();
    }

}
