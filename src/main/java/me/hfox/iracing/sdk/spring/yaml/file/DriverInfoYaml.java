package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import me.hfox.iracing.sdk.spring.yaml.file.percentage.Percentage;
import me.hfox.iracing.sdk.spring.yaml.file.weight.Weight;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DriverInfoYaml {

    @JsonProperty("CarIdx")
    private Integer carIdx;

    @JsonProperty("UserName")
    private String userName;

    @JsonProperty("AbbrevName")
    private String abbrevName;

    @JsonProperty("Initials")
    private String initials;

    @JsonProperty("UserID")
    private Integer userID;

    @JsonProperty("TeamID")
    private Integer teamID;

    @JsonProperty("TeamName")
    private String teamName;

    @JsonProperty("CarNumber")
    private String carNumber;

    @JsonProperty("CarNumberRaw")
    private Integer carNumberRaw;

    @JsonProperty("CarPath")
    private String carPath;

    @JsonProperty("CarClassID")
    private Integer carClassID;

    @JsonProperty("CarID")
    private Integer carID;

    @JsonProperty("CarIsPaceCar")
    private Integer carIsPaceCar;

    @JsonProperty("CarIsAI")
    private Integer carIsAI;

    @JsonProperty("CarScreenName")
    private String carScreenName;

    @JsonProperty("CarScreenNameShort")
    private String carScreenNameShort;

    @JsonProperty("CarClassShortName")
    private String carClassShortName;

    @JsonProperty("CarClassRelSpeed")
    private Integer carClassRelSpeed;

    @JsonProperty("CarClassLicenseLevel")
    private Integer carClassLicenseLevel;

    @JsonProperty("CarClassMaxFuelPct")
    private Percentage carClassMaxFuelPct;

    @JsonProperty("CarClassWeightPenalty")
    private Weight carClassWeightPenalty;

    @JsonProperty("CarClassColor")
    private String carClassColor;

    @JsonProperty("IRating")
    private String iRating;

    @JsonProperty("LicLevel")
    private String licLevel;

    @JsonProperty("LicSubLevel")
    private String licSubLevel;

    @JsonProperty("LicString")
    private String licString;

    @JsonProperty("LicColor")
    private String licColor;

    @JsonProperty("IsSpectator")
    private String isSpectator;

    @JsonProperty("CarDesignStr")
    private String carDesignStr;

    @JsonProperty("HelmetDesignStr")
    private String helmetDesignStr;

    @JsonProperty("SuitDesignStr")
    private String suitDesignStr;

    @JsonProperty("CarNumberDesignStr")
    private String carNumberDesignStr;

    @JsonProperty("CarSponsor_1")
    private String carSponsor_1;

    @JsonProperty("CarSponsor_2")
    private String carSponsor_2;

    @JsonProperty("ClubName")
    private String clubName;

    @JsonProperty("DivisionName")
    private String divisionName;

    public Integer getCarIdx() {
        return carIdx;
    }

    public void setCarIdx(Integer carIdx) {
        this.carIdx = carIdx;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAbbrevName() {
        return abbrevName;
    }

    public void setAbbrevName(String abbrevName) {
        this.abbrevName = abbrevName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getTeamID() {
        return teamID;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Integer getCarNumberRaw() {
        return carNumberRaw;
    }

    public void setCarNumberRaw(Integer carNumberRaw) {
        this.carNumberRaw = carNumberRaw;
    }

    public String getCarPath() {
        return carPath;
    }

    public void setCarPath(String carPath) {
        this.carPath = carPath;
    }

    public Integer getCarClassID() {
        return carClassID;
    }

    public void setCarClassID(Integer carClassID) {
        this.carClassID = carClassID;
    }

    public Integer getCarID() {
        return carID;
    }

    public void setCarID(Integer carID) {
        this.carID = carID;
    }

    public Integer getCarIsPaceCar() {
        return carIsPaceCar;
    }

    public void setCarIsPaceCar(Integer carIsPaceCar) {
        this.carIsPaceCar = carIsPaceCar;
    }

    public Integer getCarIsAI() {
        return carIsAI;
    }

    public void setCarIsAI(Integer carIsAI) {
        this.carIsAI = carIsAI;
    }

    public String getCarScreenName() {
        return carScreenName;
    }

    public void setCarScreenName(String carScreenName) {
        this.carScreenName = carScreenName;
    }

    public String getCarScreenNameShort() {
        return carScreenNameShort;
    }

    public void setCarScreenNameShort(String carScreenNameShort) {
        this.carScreenNameShort = carScreenNameShort;
    }

    public String getCarClassShortName() {
        return carClassShortName;
    }

    public void setCarClassShortName(String carClassShortName) {
        this.carClassShortName = carClassShortName;
    }

    public Integer getCarClassRelSpeed() {
        return carClassRelSpeed;
    }

    public void setCarClassRelSpeed(Integer carClassRelSpeed) {
        this.carClassRelSpeed = carClassRelSpeed;
    }

    public Integer getCarClassLicenseLevel() {
        return carClassLicenseLevel;
    }

    public void setCarClassLicenseLevel(Integer carClassLicenseLevel) {
        this.carClassLicenseLevel = carClassLicenseLevel;
    }

    public Percentage getCarClassMaxFuelPct() {
        return carClassMaxFuelPct;
    }

    public void setCarClassMaxFuelPct(Percentage carClassMaxFuelPct) {
        this.carClassMaxFuelPct = carClassMaxFuelPct;
    }

    public Weight getCarClassWeightPenalty() {
        return carClassWeightPenalty;
    }

    public void setCarClassWeightPenalty(Weight carClassWeightPenalty) {
        this.carClassWeightPenalty = carClassWeightPenalty;
    }

    public String getCarClassColor() {
        return carClassColor;
    }

    public void setCarClassColor(String carClassColor) {
        this.carClassColor = carClassColor;
    }

    public String getIRating() {
        return iRating;
    }

    public void setIRating(String iRating) {
        this.iRating = iRating;
    }

    public String getLicLevel() {
        return licLevel;
    }

    public void setLicLevel(String licLevel) {
        this.licLevel = licLevel;
    }

    public String getLicSubLevel() {
        return licSubLevel;
    }

    public void setLicSubLevel(String licSubLevel) {
        this.licSubLevel = licSubLevel;
    }

    public String getLicString() {
        return licString;
    }

    public void setLicString(String licString) {
        this.licString = licString;
    }

    public String getLicColor() {
        return licColor;
    }

    public void setLicColor(String licColor) {
        this.licColor = licColor;
    }

    public String getIsSpectator() {
        return isSpectator;
    }

    public void setIsSpectator(String isSpectator) {
        this.isSpectator = isSpectator;
    }

    public String getCarDesignStr() {
        return carDesignStr;
    }

    public void setCarDesignStr(String carDesignStr) {
        this.carDesignStr = carDesignStr;
    }

    public String getHelmetDesignStr() {
        return helmetDesignStr;
    }

    public void setHelmetDesignStr(String helmetDesignStr) {
        this.helmetDesignStr = helmetDesignStr;
    }

    public String getSuitDesignStr() {
        return suitDesignStr;
    }

    public void setSuitDesignStr(String suitDesignStr) {
        this.suitDesignStr = suitDesignStr;
    }

    public String getCarNumberDesignStr() {
        return carNumberDesignStr;
    }

    public void setCarNumberDesignStr(String carNumberDesignStr) {
        this.carNumberDesignStr = carNumberDesignStr;
    }

    public String getCarSponsor_1() {
        return carSponsor_1;
    }

    public void setCarSponsor_1(String carSponsor_1) {
        this.carSponsor_1 = carSponsor_1;
    }

    public String getCarSponsor_2() {
        return carSponsor_2;
    }

    public void setCarSponsor_2(String carSponsor_2) {
        this.carSponsor_2 = carSponsor_2;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

}
