package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import me.hfox.iracing.sdk.spring.utils.ToStringBuilder;
import me.hfox.iracing.sdk.spring.yaml.file.length.Length;
import me.hfox.iracing.sdk.spring.yaml.file.speed.Speed;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeekendInfoYaml {

    @JsonProperty("TrackName")
    private String trackName;

    @JsonProperty("TrackID")
    private Integer trackID;

    @JsonProperty("TrackLength")
    private Length trackLength;

    @JsonProperty("TrackDisplayName")
    private String trackDisplayName;

    @JsonProperty("TrackDisplayShortName")
    private String trackDisplayShortName;

    @JsonProperty("TrackConfigName")
    private String trackConfigName;

    @JsonProperty("TrackCity")
    private String trackCity;

    @JsonProperty("TrackCountry")
    private String trackCountry;

    @JsonProperty("TrackAltitude")
    private Length trackAltitude;

    @JsonProperty("TrackLatitude")
    private Length trackLatitude;

    @JsonProperty("TrackLongitude")
    private Length trackLongitude;

    @JsonProperty("TrackNorthOffset")
    private String trackNorthOffset;

    @JsonProperty("TrackNumTurns")
    private Integer trackNumTurns;

    @JsonProperty("TrackPitSpeedLimit")
    private Speed trackPitSpeedLimit;

    @JsonProperty("TrackType")
    private String trackType;

    @JsonProperty("TrackWeatherType")
    private String trackWeatherType;

    @JsonProperty("TrackSkies")
    private String trackSkies;

    @JsonProperty("TrackSurfaceTemp")
    private String trackSurfaceTemp;

    @JsonProperty("TrackAirTemp")
    private String trackAirTemp;

    @JsonProperty("TrackAirPressure")
    private String trackAirPressure;

    @JsonProperty("TrackWindVel")
    private Speed trackWindVel;

    @JsonProperty("TrackWindDir")
    private String trackWindDir;

    @JsonProperty("TrackRelativeHumidity")
    private String trackRelativeHumidity;

    @JsonProperty("TrackFogLevel")
    private String trackFogLevel;

    @JsonProperty("TrackCleanup")
    private String trackCleanup;

    @JsonProperty("TrackDynamicTrack")
    private String trackDynamicTrack;

    @JsonProperty("SeriesID")
    private Integer seriesID;

    @JsonProperty("SeasonID")
    private Integer seasonID;

    @JsonProperty("SessionID")
    private Integer sessionID;

    @JsonProperty("SubSessionID")
    private Integer subSessionID;

    @JsonProperty("LeagueID")
    private Integer leagueID;

    @JsonProperty("Official")
    private Integer official;

    @JsonProperty("RaceWeek")
    private Integer raceWeek;

    @JsonProperty("EventType")
    private String eventType;

    @JsonProperty("Category")
    private String category;

    @JsonProperty("SimMode")
    private String simMode;

    @JsonProperty("TeamRacing")
    private Integer teamRacing;

    @JsonProperty("MinDrivers")
    private Integer minDrivers;

    @JsonProperty("MaxDrivers")
    private Integer maxDrivers;

    @JsonProperty("DCRuleSet")
    private String driverChangeRuleSet;

    @JsonProperty("QualifierMustStartRace")
    private Integer qualifierMustStartRace;

    @JsonProperty("NumCarClasses")
    private Integer numCarClasses;

    @JsonProperty("NumCarTypes")
    private Integer numCarTypes;

    @JsonProperty("WeekendOptions")
    private WeekendOptionsYaml weekendOptions;

    @JsonProperty("TelemetryOptions")
    private TelemetryOptionsYaml telemetryOptions;


    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public Integer getTrackID() {
        return trackID;
    }

    public void setTrackID(Integer trackID) {
        this.trackID = trackID;
    }

    public Length getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(Length trackLength) {
        this.trackLength = trackLength;
    }

    public String getTrackDisplayName() {
        return trackDisplayName;
    }

    public void setTrackDisplayName(String trackDisplayName) {
        this.trackDisplayName = trackDisplayName;
    }

    public String getTrackDisplayShortName() {
        return trackDisplayShortName;
    }

    public void setTrackDisplayShortName(String trackDisplayShortName) {
        this.trackDisplayShortName = trackDisplayShortName;
    }

    public String getTrackConfigName() {
        return trackConfigName;
    }

    public void setTrackConfigName(String trackConfigName) {
        this.trackConfigName = trackConfigName;
    }

    public String getTrackCity() {
        return trackCity;
    }

    public void setTrackCity(String trackCity) {
        this.trackCity = trackCity;
    }

    public String getTrackCountry() {
        return trackCountry;
    }

    public void setTrackCountry(String trackCountry) {
        this.trackCountry = trackCountry;
    }

    public Length getTrackAltitude() {
        return trackAltitude;
    }

    public void setTrackAltitude(Length trackAltitude) {
        this.trackAltitude = trackAltitude;
    }

    public Length getTrackLatitude() {
        return trackLatitude;
    }

    public void setTrackLatitude(Length trackLatitude) {
        this.trackLatitude = trackLatitude;
    }

    public Length getTrackLongitude() {
        return trackLongitude;
    }

    public void setTrackLongitude(Length trackLongitude) {
        this.trackLongitude = trackLongitude;
    }

    public String getTrackNorthOffset() {
        return trackNorthOffset;
    }

    public void setTrackNorthOffset(String trackNorthOffset) {
        this.trackNorthOffset = trackNorthOffset;
    }

    public Integer getTrackNumTurns() {
        return trackNumTurns;
    }

    public void setTrackNumTurns(Integer trackNumTurns) {
        this.trackNumTurns = trackNumTurns;
    }

    public Speed getTrackPitSpeedLimit() {
        return trackPitSpeedLimit;
    }

    public void setTrackPitSpeedLimit(Speed trackPitSpeedLimit) {
        this.trackPitSpeedLimit = trackPitSpeedLimit;
    }

    public String getTrackType() {
        return trackType;
    }

    public void setTrackType(String trackType) {
        this.trackType = trackType;
    }

    public String getTrackWeatherType() {
        return trackWeatherType;
    }

    public void setTrackWeatherType(String trackWeatherType) {
        this.trackWeatherType = trackWeatherType;
    }

    public String getTrackSkies() {
        return trackSkies;
    }

    public void setTrackSkies(String trackSkies) {
        this.trackSkies = trackSkies;
    }

    public String getTrackSurfaceTemp() {
        return trackSurfaceTemp;
    }

    public void setTrackSurfaceTemp(String trackSurfaceTemp) {
        this.trackSurfaceTemp = trackSurfaceTemp;
    }

    public String getTrackAirTemp() {
        return trackAirTemp;
    }

    public void setTrackAirTemp(String trackAirTemp) {
        this.trackAirTemp = trackAirTemp;
    }

    public String getTrackAirPressure() {
        return trackAirPressure;
    }

    public void setTrackAirPressure(String trackAirPressure) {
        this.trackAirPressure = trackAirPressure;
    }

    public Speed getTrackWindVel() {
        return trackWindVel;
    }

    public void setTrackWindVel(Speed trackWindVel) {
        this.trackWindVel = trackWindVel;
    }

    public String getTrackWindDir() {
        return trackWindDir;
    }

    public void setTrackWindDir(String trackWindDir) {
        this.trackWindDir = trackWindDir;
    }

    public String getTrackRelativeHumidity() {
        return trackRelativeHumidity;
    }

    public void setTrackRelativeHumidity(String trackRelativeHumidity) {
        this.trackRelativeHumidity = trackRelativeHumidity;
    }

    public String getTrackFogLevel() {
        return trackFogLevel;
    }

    public void setTrackFogLevel(String trackFogLevel) {
        this.trackFogLevel = trackFogLevel;
    }

    public String getTrackCleanup() {
        return trackCleanup;
    }

    public void setTrackCleanup(String trackCleanup) {
        this.trackCleanup = trackCleanup;
    }

    public String getTrackDynamicTrack() {
        return trackDynamicTrack;
    }

    public void setTrackDynamicTrack(String trackDynamicTrack) {
        this.trackDynamicTrack = trackDynamicTrack;
    }

    public Integer getSeriesID() {
        return seriesID;
    }

    public void setSeriesID(Integer seriesID) {
        this.seriesID = seriesID;
    }

    public Integer getSeasonID() {
        return seasonID;
    }

    public void setSeasonID(Integer seasonID) {
        this.seasonID = seasonID;
    }

    public Integer getSessionID() {
        return sessionID;
    }

    public void setSessionID(Integer sessionID) {
        this.sessionID = sessionID;
    }

    public Integer getSubSessionID() {
        return subSessionID;
    }

    public void setSubSessionID(Integer subSessionID) {
        this.subSessionID = subSessionID;
    }

    public Integer getLeagueID() {
        return leagueID;
    }

    public void setLeagueID(Integer leagueID) {
        this.leagueID = leagueID;
    }

    public Integer getOfficial() {
        return official;
    }

    public void setOfficial(Integer official) {
        this.official = official;
    }

    public Integer getRaceWeek() {
        return raceWeek;
    }

    public void setRaceWeek(Integer raceWeek) {
        this.raceWeek = raceWeek;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSimMode() {
        return simMode;
    }

    public void setSimMode(String simMode) {
        this.simMode = simMode;
    }

    public Integer getTeamRacing() {
        return teamRacing;
    }

    public void setTeamRacing(Integer teamRacing) {
        this.teamRacing = teamRacing;
    }

    public Integer getMinDrivers() {
        return minDrivers;
    }

    public void setMinDrivers(Integer minDrivers) {
        this.minDrivers = minDrivers;
    }

    public Integer getMaxDrivers() {
        return maxDrivers;
    }

    public void setMaxDrivers(Integer maxDrivers) {
        this.maxDrivers = maxDrivers;
    }

    public String getDriverChangeRuleSet() {
        return driverChangeRuleSet;
    }

    public void setDriverChangeRuleSet(String dCRuleSet) {
        this.driverChangeRuleSet = dCRuleSet;
    }

    public Integer getQualifierMustStartRace() {
        return qualifierMustStartRace;
    }

    public void setQualifierMustStartRace(Integer qualifierMustStartRace) {
        this.qualifierMustStartRace = qualifierMustStartRace;
    }

    public Integer getNumCarClasses() {
        return numCarClasses;
    }

    public void setNumCarClasses(Integer numCarClasses) {
        this.numCarClasses = numCarClasses;
    }

    public Integer getNumCarTypes() {
        return numCarTypes;
    }

    public void setNumCarTypes(Integer numCarTypes) {
        this.numCarTypes = numCarTypes;
    }

    public WeekendOptionsYaml getWeekendOptions() {
        return weekendOptions;
    }

    public void setWeekendOptions(WeekendOptionsYaml weekendOptions) {
        this.weekendOptions = weekendOptions;
    }

    public TelemetryOptionsYaml getTelemetryOptions() {
        return telemetryOptions;
    }

    public void setTelemetryOptions(TelemetryOptionsYaml telemetryOptions) {
        this.telemetryOptions = telemetryOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        WeekendInfoYaml that = (WeekendInfoYaml) o;

        return new EqualsBuilder()
                .append(trackName, that.trackName).append(trackID, that.trackID)
                .append(trackLength, that.trackLength).append(trackDisplayName, that.trackDisplayName)
                .append(trackDisplayShortName, that.trackDisplayShortName).append(trackConfigName, that.trackConfigName)
                .append(trackCity, that.trackCity).append(trackCountry, that.trackCountry)
                .append(trackAltitude, that.trackAltitude).append(trackLatitude, that.trackLatitude)
                .append(trackLongitude, that.trackLongitude).append(trackNorthOffset, that.trackNorthOffset)
                .append(trackNumTurns, that.trackNumTurns).append(trackPitSpeedLimit, that.trackPitSpeedLimit)
                .append(trackType, that.trackType).append(trackWeatherType, that.trackWeatherType)
                .append(trackSkies, that.trackSkies).append(trackSurfaceTemp, that.trackSurfaceTemp)
                .append(trackAirTemp, that.trackAirTemp).append(trackAirPressure, that.trackAirPressure)
                .append(trackWindVel, that.trackWindVel).append(trackWindDir, that.trackWindDir)
                .append(trackRelativeHumidity, that.trackRelativeHumidity).append(trackFogLevel, that.trackFogLevel)
                .append(trackCleanup, that.trackCleanup).append(trackDynamicTrack, that.trackDynamicTrack)
                .append(seriesID, that.seriesID).append(seasonID, that.seasonID).append(sessionID, that.sessionID)
                .append(subSessionID, that.subSessionID).append(leagueID, that.leagueID).append(official, that.official)
                .append(raceWeek, that.raceWeek).append(eventType, that.eventType).append(category, that.category)
                .append(simMode, that.simMode).append(teamRacing, that.teamRacing).append(minDrivers, that.minDrivers)
                .append(maxDrivers, that.maxDrivers).append(driverChangeRuleSet, that.driverChangeRuleSet)
                .append(qualifierMustStartRace, that.qualifierMustStartRace).append(numCarClasses, that.numCarClasses)
                .append(numCarTypes, that.numCarTypes).append(weekendOptions, that.weekendOptions)
                .append(telemetryOptions, that.telemetryOptions).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(trackName).append(trackID).append(trackLength).append(trackDisplayName)
                .append(trackDisplayShortName).append(trackConfigName).append(trackCity).append(trackCountry)
                .append(trackAltitude).append(trackLatitude).append(trackLongitude).append(trackNorthOffset)
                .append(trackNumTurns).append(trackPitSpeedLimit).append(trackType).append(trackWeatherType)
                .append(trackSkies).append(trackSurfaceTemp).append(trackAirTemp).append(trackAirPressure)
                .append(trackWindVel).append(trackWindDir).append(trackRelativeHumidity).append(trackFogLevel)
                .append(trackCleanup).append(trackDynamicTrack).append(seriesID).append(seasonID)
                .append(sessionID).append(subSessionID).append(leagueID).append(official)
                .append(raceWeek).append(eventType).append(category).append(simMode)
                .append(teamRacing).append(minDrivers).append(maxDrivers).append(driverChangeRuleSet)
                .append(qualifierMustStartRace).append(numCarClasses).append(numCarTypes).append(weekendOptions)
                .append(telemetryOptions).toHashCode();
    }

    @Override
    public String toString() {
        return ToStringBuilder.build(this).detailedArray(true).simpleName(true).reflective(true).toString();
    }

}
