package csm.cis255.cis255_projectfour;

/**
 *
 */
public class DistrictArea implements Comparable<DistrictArea> {

    // Data from https://data.ca.gov/dataset/california-school-district-areas-2023-24

    int id;
    private String federalID;
    private String districtCode;
    private String countyName;
    private String districtName;
    private String districtType;
    private GradeLevel gradeLevel;
    private GeographicalLocale geographicalLocale;
    private int enrollmentTotal;
    private int enrollmentCharter;
    private int enrollmentNonCharter;

    private int enrollmentAfricanAmerican;
    private double enrollmentAfricanAmericanPercentage;

    private int enrollmentAmericanIndian;
    private double enrollmentAmericanIndianPercentage;

    private int enrollmentAsian;
    private double enrollmentAsianPercentage;

    private int enrollmentFilipino;
    private double enrollmentFilipinoPercentage;

    private int enrollmentHispanic;
    private double enrollmentHispanicPercentage;

    private int enrollmentPacificIslander;
    private double enrollmentPacificIslanderPercentage;

    private int enrollmentWhite;
    private double enrollmentWhitePercentage;

    private int enrollmentMultiracial;
    private double enrollmentMultiracialPercentage;

    private int enrollmentEnglishLearners;
    private double enrollmentEnglishLearnersPercentage;

    private int enrollmentFoster;
    private double enrollmentFosterPercentage;

    private int enrollmentHomeless;
    private double enrollmentHomelessPercentage;

    private int enrollmentMigrants;
    private double enrollmentMigrantsPercentage;

    private int enrollmentWithDisabilities;
    private double enrollmentWithDisabilitiesPercentage;

    private int enrollmentSocioeconomicallyDisadvantaged;
    private double enrollmentSocioeconomicallyDisadvantagedPercentage;

    public DistrictArea(int id, String federalID, String districtCode, String countyName, String districtName, String districtType,
                        GradeLevel gradeLevel, GeographicalLocale geographicalLocale, int enrollmentTotal, int enrollmentCharter,
                        int enrollmentNonCharter, int enrollmentAfricanAmerican, double enrollmentAfricanAmericanPercentage,
                        int enrollmentAmericanIndian, double enrollmentAmericanIndianPercentage, int enrollmentAsian,
                        double enrollmentAsianPercentage, int enrollmentFilipino, double enrollmentFilipinoPercentage,
                        int enrollmentHispanic, double enrollmentHispanicPercentage, int enrollmentPacificIslander,
                        double enrollmentPacificIslanderPercentage, int enrollmentWhite, double enrollmentWhitePercentage,
                        int enrollmentMultiracial, double enrollmentMultiracialPercentage, int enrollmentEnglishLearners,
                        double enrollmentEnglishLearnersPercentage, int enrollmentFoster, double enrollmentFosterPercentage,
                        int enrollmentHomeless, double enrollmentHomelessPercentage, int enrollmentMigrants,
                        double enrollmentMigrantsPercentage, int enrollmentWithDisabilities, double enrollmentWithDisabilitiesPercentage,
                        int enrollmentSocioeconomicallyDisadvantaged, double enrollmentSocioeconomicallyDisadvantagedPercentage) {
        this.id = id;
        this.federalID = federalID;
        this.districtCode = districtCode;
        this.countyName = countyName;
        this.districtName = districtName;
        this.districtType = districtType;
        this.gradeLevel = gradeLevel;
        this.geographicalLocale = geographicalLocale;
        this.enrollmentTotal = enrollmentTotal;
        this.enrollmentCharter = enrollmentCharter;
        this.enrollmentNonCharter = enrollmentNonCharter;
        this.enrollmentAfricanAmerican = enrollmentAfricanAmerican;
        this.enrollmentAfricanAmericanPercentage = enrollmentAfricanAmericanPercentage;
        this.enrollmentAmericanIndian = enrollmentAmericanIndian;
        this.enrollmentAmericanIndianPercentage = enrollmentAmericanIndianPercentage;
        this.enrollmentAsian = enrollmentAsian;
        this.enrollmentAsianPercentage = enrollmentAsianPercentage;
        this.enrollmentFilipino = enrollmentFilipino;
        this.enrollmentFilipinoPercentage = enrollmentFilipinoPercentage;
        this.enrollmentHispanic = enrollmentHispanic;
        this.enrollmentHispanicPercentage = enrollmentHispanicPercentage;
        this.enrollmentPacificIslander = enrollmentPacificIslander;
        this.enrollmentPacificIslanderPercentage = enrollmentPacificIslanderPercentage;
        this.enrollmentWhite = enrollmentWhite;
        this.enrollmentWhitePercentage = enrollmentWhitePercentage;
        this.enrollmentMultiracial = enrollmentMultiracial;
        this.enrollmentMultiracialPercentage = enrollmentMultiracialPercentage;
        this.enrollmentEnglishLearners = enrollmentEnglishLearners;
        this.enrollmentEnglishLearnersPercentage = enrollmentEnglishLearnersPercentage;
        this.enrollmentFoster = enrollmentFoster;
        this.enrollmentFosterPercentage = enrollmentFosterPercentage;
        this.enrollmentHomeless = enrollmentHomeless;
        this.enrollmentHomelessPercentage = enrollmentHomelessPercentage;
        this.enrollmentMigrants = enrollmentMigrants;
        this.enrollmentMigrantsPercentage = enrollmentMigrantsPercentage;
        this.enrollmentWithDisabilities = enrollmentWithDisabilities;
        this.enrollmentWithDisabilitiesPercentage = enrollmentWithDisabilitiesPercentage;
        this.enrollmentSocioeconomicallyDisadvantaged = enrollmentSocioeconomicallyDisadvantaged;
        this.enrollmentSocioeconomicallyDisadvantagedPercentage = enrollmentSocioeconomicallyDisadvantagedPercentage;
    }

    // TODO Write getters and setters (validity checking + explain ommitted ones)

    @Override
    public int compareTo(DistrictArea o) {
        return 0;
    }

    /**
     * An ENUM that represents the Grade Level which the District Area covers. In simple words, each ENUM represents the
     * levels of grade which are offered at a particular District Area.
     * @author Maksym Stesev
     * @date 05/04/2025
     */
    public static enum GradeLevel {
        K_THRU_12(0, 12, "K-12"),
        K_THRU_6(0, 6, "K-6"),
        K_THRU_8(0, 8, "K-8"),
        K_THRU_5(0, 5, "K-5"),
        NINE_THRU_12(9, 12, "9-12"),
        EIGHT_THRU_12(8, 12, "8-12"),
        SEVEN_THRU_12(7, 12, "7-12"),
        SIX_THRU_12(6, 12, "6-12"),
        FIVE_THRU_12(5, 12, "5-12");


        private int gradeLow, gradeHigh;
        private String displayString;

        private GradeLevel(int gradeLow, int gradeHigh, String displayString) {
            this.gradeLow = gradeLow;
            this.gradeHigh = gradeHigh;
            this.displayString = displayString;
        }

        public int getGradeLow() {
            return gradeLow;
        }

        public int getGradeHigh() {
            return gradeHigh;
        }

        /**
         * Returns a String representation of the enum. Reduced to the displayString field for the simplicity.
         * @return a String that represents the Grade Level of the School District.
         */
        @Override
        public String toString() {
            return displayString;
        }
    }

    /**
     * An ENUM that represents the Geographical Locale of the District Area.
     * @author Maksym Stesev
     * @date 05/04/2025
     */
    public static enum GeographicalLocale {
        CITY_LARGE("City", "Large"),
        CITY_MIDSIZE("City", "Midsize"),
        CITY_SMALL("City", "Small"),
        SUBURBAN_LARGE("Suburban", "Large"),
        SUBURBAN_MIDSIZE("Suburban", "Midsize"),
        SUBURBAN_SMALL("Suburban", "Small"),
        TOWN_DISTANT("Town", "Distant"),
        TOWN_FRINGE("Town", "Fringe"),
        TOWN_REMOTE("Town", "Remote"),
        RURAL_DISTANT("Rural", "Distant"),
        RURAL_FRINGE("Rural", "Fringe"),
        RURAL_REMOTE("Rural", "Remote");

        private String locale;
        private String type;

        GeographicalLocale(String locale, String type) {
            this.locale = locale;
            this.type = type;
        }

        // TODO Change the return statement
        /**
         * Returns a String representation of the enum.
         * @return a String that represents the Geographical Locale of the School District.
         */
        @Override
        public String toString() {
            return "GeographicalLocale{" +
                    "locale='" + locale + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }
}