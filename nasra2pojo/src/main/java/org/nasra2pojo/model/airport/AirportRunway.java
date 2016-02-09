package org.nasra2pojo.model.airport;

import org.apache.commons.lang3.StringUtils;

import com.github.ffpojo.metadata.DefaultFieldDecorator;
import com.github.ffpojo.metadata.positional.annotation.PositionalField;
import com.github.ffpojo.metadata.positional.annotation.PositionalRecord;

@PositionalRecord
public class AirportRunway extends AirportBase {
	
	private String runwayIdentifier;
	private Integer	length;
	private Integer	width;
	private String baseEndIdentifier;
	private Integer baseEndAlignment;
	private String reciprocalEndIdentifier;
	private Integer reciprocalEndAlignment;
	private Double baseEndLatitudeSeconds;
	private Character baseEndLatitudeDeclination;
	private Double baseEndLongitudeSeconds;
	private Character baseEndLongitudeDeclination;
	private Double reciprocalEndLatitudeSeconds;
	private Character reciprocalEndLatitudeDeclination;
	private Double reciprocalEndLongitudeSeconds;
	private Character reciprocalEndLongitudeDeclination;
	private String surfaceTypeAndCondition;
	private String surfaceTreatment;
	private Boolean baseEndRightHandTrafficPattern;
	private Boolean reciprocalEndRightHandTrafficPattern; 
	private Integer runwayLightIntensity;
	private Integer baseEndVisualGlideIndicator;
	private Integer baseEndApproachLightSystem;
	private Boolean baseEndRunwayEndIdentifierLightsAvailable;
	private Boolean baseEndCenterlineLightsAvailable;
	private Boolean baseEndRunwayEndIdentifierTouchdownLightsAvailable;
	private Integer reciprocalEndVisualGlideIndicator;
	private Integer reciprocalEndApproachLightSystem;
	private Boolean reciprocalEndRunwayEndIdentifierLightsAvailable;
	private Boolean reciprocalEndCenterlineLightsAvailable;
	private Boolean reciprocalEndRunwayEndIdentifierTouchdownLightsAvailable;

	@PositionalField(initialPosition = 17, finalPosition = 23)
	public String getRunwayIdentifier() {
		return runwayIdentifier;
	}

	public void setRunwayIdentifier(String runwayIdentifier) {
		this.runwayIdentifier = runwayIdentifier;
	}

	@PositionalField(initialPosition = 24, finalPosition = 28, decorator=IntegerDecorator.class)
	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}
	
	@PositionalField(initialPosition = 29, finalPosition = 32, decorator=IntegerDecorator.class)
	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	@PositionalField(initialPosition = 66, finalPosition = 68)
	public String getBaseEndIdentifier() {
		return baseEndIdentifier;
	}

	public void setBaseEndIdentifier(String baseEndIdentifier) {
		this.baseEndIdentifier = baseEndIdentifier;
	}

	@PositionalField(initialPosition = 69, finalPosition = 71, decorator=IntegerDecorator.class)
	public Integer getBaseEndAlignment() {
		return baseEndAlignment;
	}

	public void setBaseEndAlignment(Integer baseEndAlignment) {
		this.baseEndAlignment = baseEndAlignment;
	}

	@PositionalField(initialPosition = 288, finalPosition = 290)
	public String getReciprocalEndIdentifier() {
		return reciprocalEndIdentifier;
	}

	public void setReciprocalEndIdentifier(String reciprocalEndIdentifier) {
		this.reciprocalEndIdentifier = reciprocalEndIdentifier;
	}

	@PositionalField(initialPosition = 291, finalPosition = 293, decorator=IntegerDecorator.class)
	public Integer getReciprocalEndAlignment() {
		return reciprocalEndAlignment;
	}

	public void setReciprocalEndAlignment(Integer reciprocalEndAlignment) {
		this.reciprocalEndAlignment = reciprocalEndAlignment;
	}

	@PositionalField(initialPosition = 104, finalPosition = 114, decorator=DoubleDecorator.class)
	public Double getBaseEndLatitudeSeconds() {
		return baseEndLatitudeSeconds;
	}

	public void setBaseEndLatitudeSeconds(Double baseEndLatitudeSeconds) {
		this.baseEndLatitudeSeconds = baseEndLatitudeSeconds;
	}

	@PositionalField(initialPosition = 115, finalPosition = 115, decorator=CharacterDecorator.class)
	public Character getBaseEndLatitudeDeclination() {
		return baseEndLatitudeDeclination;
	}

	public void setBaseEndLatitudeDeclination(Character baseEndLatitudeDeclination) {
		this.baseEndLatitudeDeclination = baseEndLatitudeDeclination;
	}

	@PositionalField(initialPosition = 131, finalPosition = 141, decorator=DoubleDecorator.class)
	public Double getBaseEndLongitudeSeconds() {
		return baseEndLongitudeSeconds;
	}

	public void setBaseEndLongitudeSeconds(Double baseEndLongitudeSeconds) {
		this.baseEndLongitudeSeconds = baseEndLongitudeSeconds;
	}

	@PositionalField(initialPosition = 142, finalPosition = 142, decorator=CharacterDecorator.class)
	public Character getBaseEndLongitudeDeclination() {
		return baseEndLongitudeDeclination;
	}

	public void setBaseEndLongitudeDeclination(Character baseEndLongitudeDeclination) {
		this.baseEndLongitudeDeclination = baseEndLongitudeDeclination;
	}

	@PositionalField(initialPosition = 326, finalPosition = 336, decorator=DoubleDecorator.class)
	public Double getReciprocalEndLatitudeSeconds() {
		return reciprocalEndLatitudeSeconds;
	}

	public void setReciprocalEndLatitudeSeconds(Double reciprocalEndLatitudeSeconds) {
		this.reciprocalEndLatitudeSeconds = reciprocalEndLatitudeSeconds;
	}

	@PositionalField(initialPosition = 337, finalPosition = 337, decorator=CharacterDecorator.class)
	public Character getReciprocalEndLatitudeDeclination() {
		return reciprocalEndLatitudeDeclination;
	}

	public void setReciprocalEndLatitudeDeclination(Character reciprocalEndLatitudeDeclination) {
		this.reciprocalEndLatitudeDeclination = reciprocalEndLatitudeDeclination;
	}

	@PositionalField(initialPosition = 353, finalPosition = 363, decorator=DoubleDecorator.class)
	public Double getReciprocalEndLongitudeSeconds() {
		return reciprocalEndLongitudeSeconds;
	}

	public void setReciprocalEndLongitudeSeconds(Double reciprocalEndLongitudeSeconds) {
		this.reciprocalEndLongitudeSeconds = reciprocalEndLongitudeSeconds;
	}

	@PositionalField(initialPosition = 364, finalPosition = 365, decorator=CharacterDecorator.class)
	public Character getReciprocalEndLongitudeDeclination() {
		return reciprocalEndLongitudeDeclination;
	}

	public void setReciprocalEndLongitudeDeclination(Character reciprocalEndLongitudeDeclination) {
		this.reciprocalEndLongitudeDeclination = reciprocalEndLongitudeDeclination;
	}
	
	public Double getBaseEndLatitude() {
		if(getBaseEndLatitudeSeconds() != null && getBaseEndLatitudeDeclination() != null) {
			return (getBaseEndLatitudeSeconds() / 3600.0) * (getBaseEndLatitudeDeclination().equals('N') ? 1 : -1);
		} else {
			return null;
		}
	}
	
	public Double getBaseEndLongitude() {
		if(getBaseEndLongitudeSeconds() != null && getBaseEndLongitudeDeclination() != null) {
			return (getBaseEndLongitudeSeconds() / 3600.0) * (getBaseEndLongitudeDeclination().equals('E') ? 1 : -1);
		} else {
			return null;
		}
	}
	
	public Double getReciprocalEndLatitude() {
		if(getReciprocalEndLatitudeSeconds() != null && getReciprocalEndLatitudeDeclination() != null) {
			return (getReciprocalEndLatitudeSeconds() / 3600.0) * (getReciprocalEndLatitudeDeclination().equals('N') ? 1 : -1);
		} else {
			return null;
		}
	}
	
	public Double getReciprocalEndLongitude() {
		if(getReciprocalEndLongitudeSeconds() != null && getReciprocalEndLongitudeDeclination() != null) {
			return (getReciprocalEndLongitudeSeconds() / 3600.0) * (getReciprocalEndLongitudeDeclination().equals('E') ? 1 : -1);
		} else {
			return null;
		}
	}
	
	@PositionalField(initialPosition = 33, finalPosition = 44)
	public String getSurfaceTypeAndCondition() {
		return surfaceTypeAndCondition;
	}

	public void setSurfaceTypeAndCondition(String surfaceTypeAndCondition) {
		this.surfaceTypeAndCondition = surfaceTypeAndCondition;
	}

	@PositionalField(initialPosition = 45, finalPosition = 49)
	public String getSurfaceTreatment() {
		return surfaceTreatment;
	}

	public void setSurfaceTreatment(String surfaceTreatment) {
		this.surfaceTreatment = surfaceTreatment;
	}

	@PositionalField(initialPosition = 82, finalPosition = 82, decorator=BooleanDecorator.class)
	public Boolean getBaseEndRightHandTrafficPattern() {
		return baseEndRightHandTrafficPattern;
	}

	public void setBaseEndRightHandTrafficPattern(Boolean baseEndRightHandTrafficPattern) {
		this.baseEndRightHandTrafficPattern = baseEndRightHandTrafficPattern;
	}

	@PositionalField(initialPosition = 304, finalPosition = 304, decorator=BooleanDecorator.class)
	public Boolean getReciprocalEndRightHandTrafficPattern() {
		return reciprocalEndRightHandTrafficPattern;
	}

	public void setReciprocalEndRightHandTrafficPattern(Boolean reciprocalEndRightHandTrafficPattern) {
		this.reciprocalEndRightHandTrafficPattern = reciprocalEndRightHandTrafficPattern;
	}

	@PositionalField(initialPosition = 61, finalPosition = 65, decorator=RunwayEdgeLightIntensityDecorator.class)
	public Integer getRunwayLightIntensity() {
		return runwayLightIntensity;
	}

	public void setRunwayLightIntensity(Integer runwayLightIntensity) {
		this.runwayLightIntensity = runwayLightIntensity;
	}

	@PositionalField(initialPosition = 229, finalPosition = 233, decorator=VisualGlideSlopIndicatorsDecorator.class)
	public Integer getBaseEndVisualGlideIndicator() {
		return baseEndVisualGlideIndicator;
	}

	public void setBaseEndVisualGlideIndicator(Integer baseEndVisualGlideIndicator) {
		this.baseEndVisualGlideIndicator = baseEndVisualGlideIndicator;
	}

	@PositionalField(initialPosition = 238, finalPosition = 245, decorator=ApproachLightSystemDecorator.class)
	public Integer getBaseEndApproachLightSystem() {
		return baseEndApproachLightSystem;
	}

	public void setBaseEndApproachLightSystem(Integer baseEndApproachLightSystem) {
		this.baseEndApproachLightSystem = baseEndApproachLightSystem;
	}

	@PositionalField(initialPosition = 246, finalPosition = 246, decorator=BooleanDecorator.class)
	public Boolean getBaseEndRunwayEndIdentifierLightsAvailable() {
		return baseEndRunwayEndIdentifierLightsAvailable;
	}

	public void setBaseEndRunwayEndIdentifierLightsAvailable(Boolean baseEndRunwayEndIdentifierLightsAvailable) {
		this.baseEndRunwayEndIdentifierLightsAvailable = baseEndRunwayEndIdentifierLightsAvailable;
	}

	@PositionalField(initialPosition = 247, finalPosition = 247, decorator=BooleanDecorator.class)
	public Boolean getBaseEndCenterlineLightsAvailable() {
		return baseEndCenterlineLightsAvailable;
	}

	public void setBaseEndCenterlineLightsAvailable(Boolean baseEndCenterlineLightsAvailable) {
		this.baseEndCenterlineLightsAvailable = baseEndCenterlineLightsAvailable;
	}

	@PositionalField(initialPosition = 248, finalPosition = 248, decorator=BooleanDecorator.class)
	public Boolean getBaseEndRunwayEndIdentifierTouchdownLightsAvailable() {
		return baseEndRunwayEndIdentifierTouchdownLightsAvailable;
	}

	public void setBaseEndRunwayEndIdentifierTouchdownLightsAvailable(
			Boolean baseEndRunwayEndIdentifierTouchdownLightsAvailable) {
		this.baseEndRunwayEndIdentifierTouchdownLightsAvailable = baseEndRunwayEndIdentifierTouchdownLightsAvailable;
	}

	@PositionalField(initialPosition = 451, finalPosition = 455, decorator=VisualGlideSlopIndicatorsDecorator.class)
	public Integer getReciprocalEndVisualGlideIndicator() {
		return reciprocalEndVisualGlideIndicator;
	}

	public void setReciprocalEndVisualGlideIndicator(Integer reciprocalEndVisualGlideIndicator) {
		this.reciprocalEndVisualGlideIndicator = reciprocalEndVisualGlideIndicator;
	}

	@PositionalField(initialPosition = 460, finalPosition = 467, decorator=ApproachLightSystemDecorator.class)
	public Integer getReciprocalEndApproachLightSystem() {
		return reciprocalEndApproachLightSystem;
	}

	public void setReciprocalEndApproachLightSystem(Integer reciprocalEndApproachLightSystem) {
		this.reciprocalEndApproachLightSystem = reciprocalEndApproachLightSystem;
	}

	@PositionalField(initialPosition = 468, finalPosition = 468, decorator=BooleanDecorator.class)
	public Boolean getReciprocalEndRunwayEndIdentifierLightsAvailable() {
		return reciprocalEndRunwayEndIdentifierLightsAvailable;
	}

	public void setReciprocalEndRunwayEndIdentifierLightsAvailable(
			Boolean reciprocalEndRunwayEndIdentifierLightsAvailable) {
		this.reciprocalEndRunwayEndIdentifierLightsAvailable = reciprocalEndRunwayEndIdentifierLightsAvailable;
	}

	@PositionalField(initialPosition = 469, finalPosition = 469, decorator=BooleanDecorator.class)
	public Boolean getReciprocalEndCenterlineLightsAvailable() {
		return reciprocalEndCenterlineLightsAvailable;
	}

	public void setReciprocalEndCenterlineLightsAvailable(Boolean reciprocalEndCenterlineLightsAvailable) {
		this.reciprocalEndCenterlineLightsAvailable = reciprocalEndCenterlineLightsAvailable;
	}

	@PositionalField(initialPosition = 470, finalPosition = 470, decorator=BooleanDecorator.class)
	public Boolean getReciprocalEndRunwayEndIdentifierTouchdownLightsAvailable() {
		return reciprocalEndRunwayEndIdentifierTouchdownLightsAvailable;
	}

	public void setReciprocalEndRunwayEndIdentifierTouchdownLightsAvailable(
			Boolean reciprocalEndRunwayEndIdentifierTouchdownLightsAvailable) {
		this.reciprocalEndRunwayEndIdentifierTouchdownLightsAvailable = reciprocalEndRunwayEndIdentifierTouchdownLightsAvailable;
	}

	public boolean isRunwayGeographyValid() {
		return getBaseEndLatitude() != null &&
				getBaseEndLongitude() != null &&
				getReciprocalEndLatitude() != null &&
				getReciprocalEndLongitude() != null;
	}
	
	public boolean isHardSurfaced() {
		return StringUtils.contains(getSurfaceTypeAndCondition(), "CONC") || StringUtils.contains(getSurfaceTypeAndCondition(), "ASPH");
	}
	
	@Override
	public String toString() {
		return "AirportRunway [runwayIdentifier=" + runwayIdentifier + ", length=" + length + ", width=" + width
				+ ", baseEndIdentifier="
				+ baseEndIdentifier + ", baseEndAlignment=" + baseEndAlignment + ", reciprocalEndIdentifier="
				+ reciprocalEndIdentifier + ", reciprocalEndAlignment=" + reciprocalEndAlignment
				+ ", baseEndLatitudeSeconds=" + baseEndLatitudeSeconds + ", baseEndLatitudeDeclination="
				+ baseEndLatitudeDeclination + ", baseEndLongitudeSeconds=" + baseEndLongitudeSeconds
				+ ", baseEndLongitudeDeclination=" + baseEndLongitudeDeclination + ", reciprocalEndLatitudeSeconds="
				+ reciprocalEndLatitudeSeconds + ", reciprocalEndLatitudeDeclination="
				+ reciprocalEndLatitudeDeclination + ", reciprocalEndLongitudeSeconds=" + reciprocalEndLongitudeSeconds
				+ ", reciprocalEndLongitudeDeclination=" + reciprocalEndLongitudeDeclination
				+ ", surfaceTypeAndCondition=" + surfaceTypeAndCondition + ", surfaceTreatment=" + surfaceTreatment
				+ ", baseEndRightHandTrafficPattern=" + baseEndRightHandTrafficPattern
				+ ", reciprocalEndRightHandTrafficPattern=" + reciprocalEndRightHandTrafficPattern
				+ ", runwayLightIntensity=" + runwayLightIntensity + ", baseEndVisualGlideIndicator="
				+ baseEndVisualGlideIndicator + ", baseEndApproachLightSystem=" + baseEndApproachLightSystem
				+ ", baseEndRunwayEndIdentifierLightsAvailable=" + baseEndRunwayEndIdentifierLightsAvailable
				+ ", baseEndCenterlineLightsAvailable=" + baseEndCenterlineLightsAvailable
				+ ", baseEndRunwayEndIdentifierTouchdownLightsAvailable="
				+ baseEndRunwayEndIdentifierTouchdownLightsAvailable + ", reciprocalEndVisualGlideIndicator="
				+ reciprocalEndVisualGlideIndicator + ", reciprocalEndApproachLightSystem="
				+ reciprocalEndApproachLightSystem + ", reciprocalEndRunwayEndIdentifierLightsAvailable="
				+ reciprocalEndRunwayEndIdentifierLightsAvailable + ", reciprocalEndCenterlineLightsAvailable="
				+ reciprocalEndCenterlineLightsAvailable + ", reciprocalEndRunwayEndIdentifierTouchdownLightsAvailable="
				+ reciprocalEndRunwayEndIdentifierTouchdownLightsAvailable + ", getBaseEndLatitude()="
				+ getBaseEndLatitude() + ", getBaseEndLongitude()=" + getBaseEndLongitude()
				+ ", getReciprocalEndLatitude()=" + getReciprocalEndLatitude() + ", getReciprocalEndLongitude()="
				+ getReciprocalEndLongitude() + ", isRunwayGeographyValid()=" + isRunwayGeographyValid()
				+ ", isHardSurfaced()=" + isHardSurfaced() + "]";
	}

	public static enum RUNWAY_EDGE_LIGHT_INENSITY {
		HIGH,
		MEDIUM,
		LOW,
		NON_STANDARD,
		NONE
	}
	
	public static class RunwayEdgeLightIntensityDecorator extends DefaultFieldDecorator {
        @Override
        public Object fromString(String str) {
        	switch(str) {
        	case "HIGH":
        		return Integer.valueOf(RUNWAY_EDGE_LIGHT_INENSITY.HIGH.ordinal());
        	case "MED":
        		return Integer.valueOf(RUNWAY_EDGE_LIGHT_INENSITY.MEDIUM.ordinal());
        	case "LOW":
        		return Integer.valueOf(RUNWAY_EDGE_LIGHT_INENSITY.LOW.ordinal());
        	case "NSTD":
        		return Integer.valueOf(RUNWAY_EDGE_LIGHT_INENSITY.NON_STANDARD.ordinal());
        	default:
        		return Integer.valueOf(RUNWAY_EDGE_LIGHT_INENSITY.NONE.ordinal());	
        	}
        }
    }
	
	public static enum VISUAL_GLIDE_SLOPE_INDICATORS {
		S2L,
		S2R,
		V2L,
		V2R,
		V4L,
		V4R,
		V6L,
		V6R,
		V12,
		V16,
		P2L,
		P2R,
		P4L,
		P4R,
		NSTD,
		PVT,
		VAS,
		NONE,
		N,
		TRIL,
		TRIR,
		PSIL,
		PSIR,
		PNIL,
		PNIR
	}
	
	public static class VisualGlideSlopIndicatorsDecorator extends DefaultFieldDecorator {
        @Override
        public Object fromString(String str) {
        	switch(str) {
        	case "S2L":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.S2L.ordinal());
        	case "S2R":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.S2R.ordinal());
        	case "V2L":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.V2L.ordinal());
        	case "V2R":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.V2R.ordinal());
        	case "V4L":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.V4L.ordinal());
        	case "V4R":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.V4R.ordinal());
        	case "V6L":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.V6L.ordinal());
        	case "V6R":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.V6R.ordinal());
        	case "V12":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.V12.ordinal());
        	case "V16":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.V16.ordinal());
        	case "P2L":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.P2L.ordinal());
        	case "P2R":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.P2R.ordinal());
        	case "P4L":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.P4L.ordinal());
        	case "P4R":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.P4R.ordinal());
        	case "NSTD":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.NSTD.ordinal());
        	case "PVT":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.PVT.ordinal());
        	case "VAS":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.VAS.ordinal());
        	case "N":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.N.ordinal());
        	case "TRIL":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.TRIL.ordinal());
        	case "TRIR":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.TRIR.ordinal());
        	case "PSIL":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.PSIL.ordinal());
        	case "PSIR":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.PSIR.ordinal());
        	case "PNIL":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.PNIL.ordinal());
        	case "PNIR":
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.PNIR.ordinal());
        	default:
        		return Integer.valueOf(VISUAL_GLIDE_SLOPE_INDICATORS.NONE.ordinal());	
        	}
        }
    }
	
	public static enum APPROACH_LIGHT_SYSTEM {
		ALSAF,
		ALSF1,
		ALSF2,
		MALS,
		MALSF,
		MALSR,
		SSALS,
		SSALF,
		SSALR,
		NEON,
		ODALS,
		RLLS,
		MIL_OVRN,
		NSTD,
		NONE
	}
	
	public static class ApproachLightSystemDecorator extends DefaultFieldDecorator {
        @Override
        public Object fromString(String str) {
        	switch(str) {
        	case "ALSAF":
        		return Integer.valueOf(APPROACH_LIGHT_SYSTEM.ALSAF.ordinal());
        	case "ALSF1":
        		return Integer.valueOf(APPROACH_LIGHT_SYSTEM.ALSF1.ordinal());
        	case "ALSF2":
        		return Integer.valueOf(APPROACH_LIGHT_SYSTEM.ALSF2.ordinal());
        	case "MALS":
        		return Integer.valueOf(APPROACH_LIGHT_SYSTEM.MALS.ordinal());
        	case "MALSF":
        		return Integer.valueOf(APPROACH_LIGHT_SYSTEM.MALSF.ordinal());
        	case "MALSR":
        		return Integer.valueOf(APPROACH_LIGHT_SYSTEM.MALSR.ordinal());
        	case "SSALS":
        		return Integer.valueOf(APPROACH_LIGHT_SYSTEM.SSALS.ordinal());
        	case "SSALF":
        		return Integer.valueOf(APPROACH_LIGHT_SYSTEM.SSALF.ordinal());
        	case "SSALR":
        		return Integer.valueOf(APPROACH_LIGHT_SYSTEM.SSALR.ordinal());
        	case "NEON":
        		return Integer.valueOf(APPROACH_LIGHT_SYSTEM.NEON.ordinal());
        	case "ODALS":
        		return Integer.valueOf(APPROACH_LIGHT_SYSTEM.ODALS.ordinal());
        	case "RLLS":
        		return Integer.valueOf(APPROACH_LIGHT_SYSTEM.RLLS.ordinal());
        	case "MIL OVRN":
        		return Integer.valueOf(APPROACH_LIGHT_SYSTEM.MIL_OVRN.ordinal());
        	case "NSTD":
        		return Integer.valueOf(APPROACH_LIGHT_SYSTEM.NSTD.ordinal());
        	default:
        		return Integer.valueOf(APPROACH_LIGHT_SYSTEM.NONE.ordinal());	
        	}
        }
    }
	
}
