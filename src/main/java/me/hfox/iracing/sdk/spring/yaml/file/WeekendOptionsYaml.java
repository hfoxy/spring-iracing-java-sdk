package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import me.hfox.iracing.sdk.spring.utils.ToStringBuilder;
import me.hfox.iracing.sdk.spring.yaml.file.percentage.Percentage;
import me.hfox.iracing.sdk.spring.yaml.file.speed.Speed;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeekendOptionsYaml {

    @JsonProperty("NumStarters")
    private Integer numStarters;

    @JsonProperty("StartingGrid")
    private String startingGrid;

    @JsonProperty("QualifyScoring")
    private String qualifyScoring;

    @JsonProperty("CourseCautions")
    private String courseCautions;

    @JsonProperty("StandingStart")
    private Integer standingStart;

    @JsonProperty("Restarts")
    private String restarts;

    @JsonProperty("WeatherType")
    private String weatherType;

    @JsonProperty("Skies")
    private String skies;

    @JsonProperty("WindDirection")
    private String windDirection;

    @JsonProperty("WindSpeed")
    private Speed windSpeed;

    @JsonProperty("WeatherTemp")
    private String weatherTemp;

    @JsonProperty("RelativeHumidity")
    private Percentage relativeHumidity;

    @JsonProperty("FogLevel")
    private Percentage fogLevel;

    @JsonProperty("Unofficial")
    private Integer unofficial;

    @JsonProperty("CommercialMode")
    private String commercialMode;

    @JsonProperty("NightMode")
    private String nightMode;

    @JsonProperty("IsFixedSetup")
    private Integer isFixedSetup;

    @JsonProperty("StrictLapsChecking")
    private String strictLapsChecking;

    @JsonProperty("HasOpenRegistration")
    private Integer hasOpenRegistration;

    @JsonProperty("HardcoreLevel")
    private Integer hardcoreLevel;

    public Integer getNumStarters() {
        return numStarters;
    }

    public void setNumStarters(Integer numStarters) {
        this.numStarters = numStarters;
    }

    public String getStartingGrid() {
        return startingGrid;
    }

    public void setStartingGrid(String startingGrid) {
        this.startingGrid = startingGrid;
    }

    public String getQualifyScoring() {
        return qualifyScoring;
    }

    public void setQualifyScoring(String qualifyScoring) {
        this.qualifyScoring = qualifyScoring;
    }

    public String getCourseCautions() {
        return courseCautions;
    }

    public void setCourseCautions(String courseCautions) {
        this.courseCautions = courseCautions;
    }

    public Integer getStandingStart() {
        return standingStart;
    }

    public void setStandingStart(Integer standingStart) {
        this.standingStart = standingStart;
    }

    public String getRestarts() {
        return restarts;
    }

    public void setRestarts(String restarts) {
        this.restarts = restarts;
    }

    public String getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType;
    }

    public String getSkies() {
        return skies;
    }

    public void setSkies(String skies) {
        this.skies = skies;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public Speed getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Speed windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWeatherTemp() {
        return weatherTemp;
    }

    public void setWeatherTemp(String weatherTemp) {
        this.weatherTemp = weatherTemp;
    }

    public Percentage getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(Percentage relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public Percentage getFogLevel() {
        return fogLevel;
    }

    public void setFogLevel(Percentage fogLevel) {
        this.fogLevel = fogLevel;
    }

    public Integer getUnofficial() {
        return unofficial;
    }

    public void setUnofficial(Integer unofficial) {
        this.unofficial = unofficial;
    }

    public String getCommercialMode() {
        return commercialMode;
    }

    public void setCommercialMode(String commercialMode) {
        this.commercialMode = commercialMode;
    }

    public String getNightMode() {
        return nightMode;
    }

    public void setNightMode(String nightMode) {
        this.nightMode = nightMode;
    }

    public Integer getIsFixedSetup() {
        return isFixedSetup;
    }

    public void setIsFixedSetup(Integer isFixedSetup) {
        this.isFixedSetup = isFixedSetup;
    }

    public String getStrictLapsChecking() {
        return strictLapsChecking;
    }

    public void setStrictLapsChecking(String strictLapsChecking) {
        this.strictLapsChecking = strictLapsChecking;
    }

    public Integer getHasOpenRegistration() {
        return hasOpenRegistration;
    }

    public void setHasOpenRegistration(Integer hasOpenRegistration) {
        this.hasOpenRegistration = hasOpenRegistration;
    }

    public Integer getHardcoreLevel() {
        return hardcoreLevel;
    }

    public void setHardcoreLevel(Integer hardcoreLevel) {
        this.hardcoreLevel = hardcoreLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        WeekendOptionsYaml that = (WeekendOptionsYaml) o;

        return new EqualsBuilder().append(numStarters, that.numStarters).append(startingGrid, that.startingGrid)
                .append(qualifyScoring, that.qualifyScoring).append(courseCautions, that.courseCautions)
                .append(standingStart, that.standingStart).append(restarts, that.restarts)
                .append(weatherType, that.weatherType).append(skies, that.skies)
                .append(windDirection, that.windDirection).append(windSpeed, that.windSpeed)
                .append(weatherTemp, that.weatherTemp).append(relativeHumidity, that.relativeHumidity)
                .append(fogLevel, that.fogLevel).append(unofficial, that.unofficial)
                .append(commercialMode, that.commercialMode).append(nightMode, that.nightMode)
                .append(isFixedSetup, that.isFixedSetup).append(strictLapsChecking, that.strictLapsChecking)
                .append(hasOpenRegistration, that.hasOpenRegistration).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(numStarters)
                .append(startingGrid).append(qualifyScoring).append(courseCautions).append(standingStart)
                .append(restarts).append(weatherType).append(skies).append(windDirection).append(windSpeed)
                .append(weatherTemp).append(relativeHumidity).append(fogLevel).append(unofficial)
                .append(commercialMode).append(nightMode).append(isFixedSetup).append(strictLapsChecking)
                .append(hasOpenRegistration).toHashCode();
    }

    @Override
    public String toString() {
        return ToStringBuilder.build(this).detailedArray(true).simpleName(true).reflective(true).toString();
    }

}
