package csm.cis255.cis255_projectfour;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/**
 *
 */
public class DistrictArea implements Comparable<DistrictArea> {

    // Data from https://data.ca.gov/dataset/california-school-district-areas-2023-24

    int id;
    private int federalID;
    private int districtCode;
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

    public static List<DistrictArea> districtAreaList = new ArrayList<>();

    public DistrictArea(int id, int federalID, int districtCode, String countyName, String districtName, String districtType,
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

    // Testing purposes only!
    public DistrictArea() {
        this.id = 1;
        this.federalID = 12;
        this.districtCode = 12;
        this.countyName = "asd";
        this.districtName = "asd";
        this.districtType = "asd";
        this.gradeLevel = GradeLevel.K_THRU_12;
        this.geographicalLocale = GeographicalLocale.CITY_LARGE;
        this.enrollmentTotal = 1212;
        this.enrollmentCharter = 123;
        this.enrollmentNonCharter = 12312;
        this.enrollmentAfricanAmerican = 12;
        this.enrollmentAfricanAmericanPercentage = 1;
        this.enrollmentAmericanIndian = 12;
        this.enrollmentAmericanIndianPercentage = 1;
        this.enrollmentAsian = 12;
        this.enrollmentAsianPercentage = 1;
        this.enrollmentFilipino = 12;
        this.enrollmentFilipinoPercentage = 1;
        this.enrollmentHispanic = 12;
        this.enrollmentHispanicPercentage = 1;
        this.enrollmentPacificIslander = 12;
        this.enrollmentPacificIslanderPercentage = 1;
        this.enrollmentWhite = 12;
        this.enrollmentWhitePercentage = 1;
        this.enrollmentMultiracial = 12;
        this.enrollmentMultiracialPercentage = 1;
        this.enrollmentEnglishLearners = 12;
        this.enrollmentEnglishLearnersPercentage = 1;
        this.enrollmentFoster = 12;
        this.enrollmentFosterPercentage = 1;
        this.enrollmentHomeless = 12;
        this.enrollmentHomelessPercentage = 1;
        this.enrollmentMigrants = 12;
        this.enrollmentMigrantsPercentage = 1;
        this.enrollmentWithDisabilities = 12;
        this.enrollmentWithDisabilitiesPercentage = 1;
        this.enrollmentSocioeconomicallyDisadvantaged = 12;
        this.enrollmentSocioeconomicallyDisadvantagedPercentage = 1;
    }

    public static void fillListAndMap() {
        try (Scanner fileScanner = new Scanner(new FileReader(
                "1DistrictAreas.csv"
        ))) {
            // Print a message in console indicating a successful load of the data file
            System.out.println("Successfully loaded DistrictAreas.csv file");

            // Set up the mechanics of obtaining data from the file
            String line;
            while (fileScanner.hasNext()) { // Go until there is data in the source file
                line = fileScanner.nextLine(); // Obtain one line of data

                // Assuming we have perfectly formatted data
                Scanner lineScanner = new Scanner(line);

                lineScanner.useDelimiter(",");

                // Write the data from the file into a single object instance
                int id = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", "")); // last past of the line removes invisible Unicode character
                int federalId = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                int districtCode = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                String countyName = lineScanner.next();
                String districtName = lineScanner.next();
                String districtType = lineScanner.next();
                lineScanner.next();
                lineScanner.next();
                GradeLevel gradeLevel12 = GradeLevel.K_THRU_12;
                GeographicalLocale geographicalLocale1 = GeographicalLocale.determineLocale(lineScanner.next());
                int enrollmentTotal = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                int enrollmentCharter = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                int enrollmentNonCharter = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                int enrollmentAfricanAmerican = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                double enrollmentAfricanAmericanPercentage = Double.parseDouble(lineScanner.next().replaceAll("\\uFEFF", ""));
                int enrollmentAmericanIndian = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                double enrollmentAmericanIndianPercentage = Double.parseDouble(lineScanner.next().replaceAll("\\uFEFF", ""));
                int enrollmentAsian = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                double enrollmentAsianPercentage = Double.parseDouble(lineScanner.next().replaceAll("\\uFEFF", ""));
                int enrollmentFilipino = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                double enrollmentFilipinoPercentage = Double.parseDouble(lineScanner.next().replaceAll("\\uFEFF", ""));
                int enrollmentHispanic = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                double enrollmentHispanicPercentage = Double.parseDouble(lineScanner.next().replaceAll("\\uFEFF", ""));
                int enrollmentPacificIslander = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                double enrollmentPacificIslanderPercentage = Double.parseDouble(lineScanner.next().replaceAll("\\uFEFF", ""));
                int enrollmentWhite = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                double enrollmentWhitePercentage = Double.parseDouble(lineScanner.next().replaceAll("\\uFEFF", ""));
                int enrollmentMultiracial = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                double enrollmentMultiracialPercentage = Double.parseDouble(lineScanner.next().replaceAll("\\uFEFF", ""));
                int enrollmentEnglishLearners = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                double enrollmentEnglishLearnersPercentage = Double.parseDouble(lineScanner.next().replaceAll("\\uFEFF", ""));
                int enrollmentFoster = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                double enrollmentFosterPercentage = Double.parseDouble(lineScanner.next().replaceAll("\\uFEFF", ""));
                int enrollmentHomeless = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                double enrollmentHomelessPercentage = Double.parseDouble(lineScanner.next().replaceAll("\\uFEFF", ""));
                int enrollmentMigrants = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                double enrollmentMigrantsPercentage = Double.parseDouble(lineScanner.next().replaceAll("\\uFEFF", ""));
                int enrollmentWithDisabilities = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                double enrollmentWithDisabilitiesPercentage = Double.parseDouble(lineScanner.next().replaceAll("\\uFEFF", ""));
                int enrollmentSocioeconomicallyDisadvantaged = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                double enrollmentSocioeconomicallyDisadvantagedPercentage = Double.parseDouble(lineScanner.next().replaceAll("\\uFEFF", ""));

                // Create instance of the data entry
                DistrictArea districtArea = new DistrictArea(
                        id, federalId, districtCode, countyName, districtName, districtType, gradeLevel12,
                        geographicalLocale1, enrollmentTotal, enrollmentCharter, enrollmentNonCharter, enrollmentAfricanAmerican,
                        enrollmentAfricanAmericanPercentage, enrollmentAmericanIndian, enrollmentAmericanIndianPercentage, enrollmentAsian,
                        enrollmentAsianPercentage, enrollmentFilipino, enrollmentFilipinoPercentage, enrollmentHispanic,
                        enrollmentHispanicPercentage, enrollmentPacificIslander, enrollmentPacificIslanderPercentage, enrollmentWhite, enrollmentWhitePercentage,
                        enrollmentMultiracial, enrollmentMultiracialPercentage, enrollmentEnglishLearners, enrollmentEnglishLearnersPercentage, enrollmentFoster,
                        enrollmentFosterPercentage, enrollmentHomeless, enrollmentHomelessPercentage, enrollmentMigrants, enrollmentMigrantsPercentage, enrollmentWithDisabilities,
                        enrollmentWithDisabilitiesPercentage, enrollmentSocioeconomicallyDisadvantaged, enrollmentSocioeconomicallyDisadvantagedPercentage
                );
                System.out.println(districtArea);

                // Add the District Area to the list (districtAreaList)
                districtAreaList.add(districtArea);

                // TODO change it
                // Add the District Grade Level to the ComboBox list
                HelloController.getInstance().addItemToGradeLevelComboBox(gradeLevel12);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // TODO Write getters and setters (validity checking + explain omitted ones)


    @Override
    public String toString() {
        return "District Name: " + districtName + "\t\tDistrict Type: " + districtType + "\t\tCounty Name: " + countyName + "\n" +
                "Grade Level: " + gradeLevel + "\t\tGeographical Locale: " + geographicalLocale + "\n" +
                "District ID = " + id + "\t\tDistrict Federal ID = " + federalID + "\t\tDistrict Code = " + districtCode + "\n" +
                "Total Enrollment: " + enrollmentTotal + "\t\tCharter Enrollment: " + enrollmentCharter + "\t\tNon Charter Enrollment: " + enrollmentNonCharter + "\n" +
                "African American: " + enrollmentAfricanAmerican + "\t\tAfrican American (%): " + enrollmentAfricanAmericanPercentage + "\n" +
                "American Indian: " + enrollmentAmericanIndian + "\t\tAmerican Indian (%): " + enrollmentAmericanIndianPercentage + "\n" +
                "Asian: " + enrollmentAsian + "\t\tAsian (%): " + enrollmentAsianPercentage + "\n" +
                "Filipino: " + enrollmentFilipino + "\t\tFilipino (%): " + enrollmentFilipinoPercentage + "\n" +
                "Hispanic: " + enrollmentHispanic + "\t\tHispanic (%): " + enrollmentHispanicPercentage + "\n" +
                "Pacific Islander: " + enrollmentPacificIslander + "\t\tPacific Islander(%): " + enrollmentPacificIslanderPercentage + "\n" +
                "White: " + enrollmentWhite + "\t\tWhite(%): " + enrollmentWhite + "\n" +
                "Multiracial: " + enrollmentMultiracial + "\t\tMultiracial (%): " + enrollmentMultiracialPercentage + "\n" +
                "English Learner: " + enrollmentEnglishLearners + "\t\tEnglish Learner(%): " + enrollmentEnglishLearnersPercentage + "\n" +
                "Foster: " + enrollmentFoster + "\t\tFoster (%): " + enrollmentFosterPercentage + "\n" +
                "Homeless: " + enrollmentHomeless + "\t\tHomeless (%): " + enrollmentHomelessPercentage + "\n" +
                "Migrant: " + enrollmentMigrants + "\t\tMigrant (%): " + enrollmentMigrantsPercentage + "\n" +
                "Socioeconomically Disadvantaged: " + enrollmentSocioeconomicallyDisadvantaged + "\t\tSocioeconomically Disadvantaged (%): " + enrollmentSocioeconomicallyDisadvantagedPercentage + "\n" +
                "Students with Disabilities: " + enrollmentWithDisabilities + "\t\tStudent with Disabilities (%): " + enrollmentWithDisabilitiesPercentage + "\n";
    }

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
        K_THRU_8(0, 8, "K-8"),
        K_THRU_6(0, 6, "K-6"),
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

        // We will need both getters to
        public String getLocale() {
            return locale;
        }

        public String getType() {
            return type;
        }

        /**
         * Returns a String representation of the enum.
         * @return a String that represents the Geographical Locale of the School District.
         */
        @Override
        public String toString() {
            return locale + ", " + type;
        }

        /**
         * This method helps determine the Geographical Locale of a data entry.
         * @param geographicalLocale String representation of the geographical locale in the data entry.
         * @return The corresponding enum value of GeographicalLocale.
         */
        public static GeographicalLocale determineLocale(String geographicalLocale) {
            // Find where to separate the String into two (For example, in data file geographicalLocale = "SuburbanLarge")
            int index = 0;
            for (int i = 2; i < geographicalLocale.length() - 1; i++) {
                char character = geographicalLocale.charAt(i);
                if (Character.isUpperCase(character)) {
                    index = i;
                }
            }

            // Separate the Strings into two
            String stringLocale = geographicalLocale.substring(0, index);
            String stringType = geographicalLocale.substring(index);

            // Accurately determine the correct Geographical Locale
            for (GeographicalLocale locale : GeographicalLocale.values()) {
                if (locale.getLocale().equalsIgnoreCase(stringLocale) &&
                locale.getType().equalsIgnoreCase(stringType)) {
                    return locale;
                }
            }
            return null;
        }
    }
}