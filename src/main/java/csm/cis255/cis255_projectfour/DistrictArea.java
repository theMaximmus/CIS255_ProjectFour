package csm.cis255.cis255_projectfour;

import javafx.collections.FXCollections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/**
 * District Area class which represents a single District Area in the State of California.
 * The data had been extracted from the official website of publicly available data of the State of California.
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

    // Empty constructor for testing purposes only!
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

    /**
     * This method serves an exclusive purpose of loading data to display it
     * when the user hits "Load All" button.
     */
    public static void loadAllData() {
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

                // Read data in each single data entry by comma
                lineScanner.useDelimiter(",");

                // Write the data from the file into a single object instance
                int id = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", "")); // last past of the line removes invisible Unicode character
                int federalId = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                int districtCode = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                String countyName = lineScanner.next();
                String districtName = lineScanner.next();
                String districtType = lineScanner.next();
                String lowGrade = lineScanner.next();
                String highGrade = lineScanner.next();
                GradeLevel gradeLevel = GradeLevel.determineGradeLevel(lowGrade, highGrade);
                GeographicalLocale geographicalLocale = GeographicalLocale.determineLocale(lineScanner.next());
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
                        id, federalId, districtCode, countyName, districtName, districtType, gradeLevel,
                        geographicalLocale, enrollmentTotal, enrollmentCharter, enrollmentNonCharter, enrollmentAfricanAmerican,
                        enrollmentAfricanAmericanPercentage, enrollmentAmericanIndian, enrollmentAmericanIndianPercentage, enrollmentAsian,
                        enrollmentAsianPercentage, enrollmentFilipino, enrollmentFilipinoPercentage, enrollmentHispanic,
                        enrollmentHispanicPercentage, enrollmentPacificIslander, enrollmentPacificIslanderPercentage, enrollmentWhite, enrollmentWhitePercentage,
                        enrollmentMultiracial, enrollmentMultiracialPercentage, enrollmentEnglishLearners, enrollmentEnglishLearnersPercentage, enrollmentFoster,
                        enrollmentFosterPercentage, enrollmentHomeless, enrollmentHomelessPercentage, enrollmentMigrants, enrollmentMigrantsPercentage, enrollmentWithDisabilities,
                        enrollmentWithDisabilitiesPercentage, enrollmentSocioeconomicallyDisadvantaged, enrollmentSocioeconomicallyDisadvantagedPercentage
                );

                // Add the District Area to the list (districtAreaList)
                districtAreaList.add(districtArea);

                // Add the District's County Name to the ComboBox list by checking if it is already there
                if (!DistrictAreaController.getInstance().countyNameComboBox.getItems().contains(countyName)) {
                    DistrictAreaController.getInstance().addItemToCountyNameComboBox(countyName);
                    // Sort each time new entry is added
                    sortCountyNameComboBoxItems();
                }

//                 Add the District's Geographical Locale to the ComboBox list by checking if it is already there
                if (!DistrictAreaController.getInstance().geographicalLocaleComboBox.getItems().contains(geographicalLocale)) {
                    DistrictAreaController.getInstance().addItemToGeographicalLocaleComboBox(geographicalLocale);
                    // Sort each time new entry is added
                    sortGeographicalLocaleComboBoxItems();
                }

//                 Add the District Grade Level to the ComboBox list by checking if it is already there
                if (!DistrictAreaController.getInstance().gradeLevelComboBox.getItems().contains(gradeLevel)) {
                    DistrictAreaController.getInstance().addItemToGradeLevelComboBox(gradeLevel);
                    // Sort each time new entry is added
                    FXCollections.sort(DistrictAreaController.getInstance().gradeLevelComboBox.getItems());
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
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

                // Read data in each single data entry by comma
                lineScanner.useDelimiter(",");

                // Write the data from the file into a single object instance
                int id = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", "")); // last past of the line removes invisible Unicode character
                int federalId = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                int districtCode = Integer.parseInt(lineScanner.next().replaceAll("\\uFEFF", ""));
                String countyName = lineScanner.next();
                String districtName = lineScanner.next();
                String districtType = lineScanner.next();
                String lowGrade = lineScanner.next();
                String highGrade = lineScanner.next();
                GradeLevel gradeLevel = GradeLevel.determineGradeLevel(lowGrade, highGrade);
                GeographicalLocale geographicalLocale = GeographicalLocale.determineLocale(lineScanner.next());
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
                        id, federalId, districtCode, countyName, districtName, districtType, gradeLevel,
                        geographicalLocale, enrollmentTotal, enrollmentCharter, enrollmentNonCharter, enrollmentAfricanAmerican,
                        enrollmentAfricanAmericanPercentage, enrollmentAmericanIndian, enrollmentAmericanIndianPercentage, enrollmentAsian,
                        enrollmentAsianPercentage, enrollmentFilipino, enrollmentFilipinoPercentage, enrollmentHispanic,
                        enrollmentHispanicPercentage, enrollmentPacificIslander, enrollmentPacificIslanderPercentage, enrollmentWhite, enrollmentWhitePercentage,
                        enrollmentMultiracial, enrollmentMultiracialPercentage, enrollmentEnglishLearners, enrollmentEnglishLearnersPercentage, enrollmentFoster,
                        enrollmentFosterPercentage, enrollmentHomeless, enrollmentHomelessPercentage, enrollmentMigrants, enrollmentMigrantsPercentage, enrollmentWithDisabilities,
                        enrollmentWithDisabilitiesPercentage, enrollmentSocioeconomicallyDisadvantaged, enrollmentSocioeconomicallyDisadvantagedPercentage
                );

                // Add the District Area to the list (districtAreaList)
                districtAreaList.add(districtArea);

                // Add the District's County Name to the ComboBox list by checking if it is already there
                DistrictAreaApplication.uniqueCounties.add(countyName);

                // Add the District's Geographical Locale to the ComboBox list by checking if it is already there
                if (!DistrictAreaController.getInstance().geographicalLocaleComboBox.getItems().contains(geographicalLocale)) {
                    DistrictAreaController.getInstance().addItemToGeographicalLocaleComboBox(geographicalLocale);
                    // Sort each time new entry is added
                    sortGeographicalLocaleComboBoxItems();
                }

                // Add the District's Grade Level to the ComboBox list by checking if it is already there
                if (!DistrictAreaController.getInstance().gradeLevelComboBox.getItems().contains(gradeLevel)) {
                    DistrictAreaController.getInstance().addItemToGradeLevelComboBox(gradeLevel);
                    // Sort each time new entry is added
                    sortGradeLevelComboBoxItems();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // TODO Write getters and setters (validity checking + explain omitted ones)


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFederalID() {
        return federalID;
    }

    public void setFederalID(int federalID) {
        this.federalID = federalID;
    }

    public int getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(int districtCode) {
        this.districtCode = districtCode;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getDistrictType() {
        return districtType;
    }

    public void setDistrictType(String districtType) {
        this.districtType = districtType;
    }

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public GeographicalLocale getGeographicalLocale() {
        return geographicalLocale;
    }

    public void setGeographicalLocale(GeographicalLocale geographicalLocale) {
        this.geographicalLocale = geographicalLocale;
    }

    public int getEnrollmentTotal() {
        return enrollmentTotal;
    }

    public void setEnrollmentTotal(int enrollmentTotal) {
        this.enrollmentTotal = enrollmentTotal;
    }

    public int getEnrollmentCharter() {
        return enrollmentCharter;
    }

    public void setEnrollmentCharter(int enrollmentCharter) {
        this.enrollmentCharter = enrollmentCharter;
    }

    public int getEnrollmentNonCharter() {
        return enrollmentNonCharter;
    }

    public void setEnrollmentNonCharter(int enrollmentNonCharter) {
        this.enrollmentNonCharter = enrollmentNonCharter;
    }

    public int getEnrollmentAfricanAmerican() {
        return enrollmentAfricanAmerican;
    }

    public void setEnrollmentAfricanAmerican(int enrollmentAfricanAmerican) {
        this.enrollmentAfricanAmerican = enrollmentAfricanAmerican;
    }

    public double getEnrollmentAfricanAmericanPercentage() {
        return enrollmentAfricanAmericanPercentage;
    }

    public void setEnrollmentAfricanAmericanPercentage(double enrollmentAfricanAmericanPercentage) {
        this.enrollmentAfricanAmericanPercentage = enrollmentAfricanAmericanPercentage;
    }

    public int getEnrollmentAmericanIndian() {
        return enrollmentAmericanIndian;
    }

    public void setEnrollmentAmericanIndian(int enrollmentAmericanIndian) {
        this.enrollmentAmericanIndian = enrollmentAmericanIndian;
    }

    public double getEnrollmentAmericanIndianPercentage() {
        return enrollmentAmericanIndianPercentage;
    }

    public void setEnrollmentAmericanIndianPercentage(double enrollmentAmericanIndianPercentage) {
        this.enrollmentAmericanIndianPercentage = enrollmentAmericanIndianPercentage;
    }

    public int getEnrollmentAsian() {
        return enrollmentAsian;
    }

    public void setEnrollmentAsian(int enrollmentAsian) {
        this.enrollmentAsian = enrollmentAsian;
    }

    public double getEnrollmentAsianPercentage() {
        return enrollmentAsianPercentage;
    }

    public void setEnrollmentAsianPercentage(double enrollmentAsianPercentage) {
        this.enrollmentAsianPercentage = enrollmentAsianPercentage;
    }

    public int getEnrollmentFilipino() {
        return enrollmentFilipino;
    }

    public void setEnrollmentFilipino(int enrollmentFilipino) {
        this.enrollmentFilipino = enrollmentFilipino;
    }

    public double getEnrollmentFilipinoPercentage() {
        return enrollmentFilipinoPercentage;
    }

    public void setEnrollmentFilipinoPercentage(double enrollmentFilipinoPercentage) {
        this.enrollmentFilipinoPercentage = enrollmentFilipinoPercentage;
    }

    public int getEnrollmentHispanic() {
        return enrollmentHispanic;
    }

    public void setEnrollmentHispanic(int enrollmentHispanic) {
        this.enrollmentHispanic = enrollmentHispanic;
    }

    public double getEnrollmentHispanicPercentage() {
        return enrollmentHispanicPercentage;
    }

    public void setEnrollmentHispanicPercentage(double enrollmentHispanicPercentage) {
        this.enrollmentHispanicPercentage = enrollmentHispanicPercentage;
    }

    public int getEnrollmentPacificIslander() {
        return enrollmentPacificIslander;
    }

    public void setEnrollmentPacificIslander(int enrollmentPacificIslander) {
        this.enrollmentPacificIslander = enrollmentPacificIslander;
    }

    public double getEnrollmentPacificIslanderPercentage() {
        return enrollmentPacificIslanderPercentage;
    }

    public void setEnrollmentPacificIslanderPercentage(double enrollmentPacificIslanderPercentage) {
        this.enrollmentPacificIslanderPercentage = enrollmentPacificIslanderPercentage;
    }

    public int getEnrollmentWhite() {
        return enrollmentWhite;
    }

    public void setEnrollmentWhite(int enrollmentWhite) {
        this.enrollmentWhite = enrollmentWhite;
    }

    public double getEnrollmentWhitePercentage() {
        return enrollmentWhitePercentage;
    }

    public void setEnrollmentWhitePercentage(double enrollmentWhitePercentage) {
        this.enrollmentWhitePercentage = enrollmentWhitePercentage;
    }

    public int getEnrollmentMultiracial() {
        return enrollmentMultiracial;
    }

    public void setEnrollmentMultiracial(int enrollmentMultiracial) {
        this.enrollmentMultiracial = enrollmentMultiracial;
    }

    public double getEnrollmentMultiracialPercentage() {
        return enrollmentMultiracialPercentage;
    }

    public void setEnrollmentMultiracialPercentage(double enrollmentMultiracialPercentage) {
        this.enrollmentMultiracialPercentage = enrollmentMultiracialPercentage;
    }

    public int getEnrollmentEnglishLearners() {
        return enrollmentEnglishLearners;
    }

    public void setEnrollmentEnglishLearners(int enrollmentEnglishLearners) {
        this.enrollmentEnglishLearners = enrollmentEnglishLearners;
    }

    public double getEnrollmentEnglishLearnersPercentage() {
        return enrollmentEnglishLearnersPercentage;
    }

    public void setEnrollmentEnglishLearnersPercentage(double enrollmentEnglishLearnersPercentage) {
        this.enrollmentEnglishLearnersPercentage = enrollmentEnglishLearnersPercentage;
    }

    public int getEnrollmentFoster() {
        return enrollmentFoster;
    }

    public void setEnrollmentFoster(int enrollmentFoster) {
        this.enrollmentFoster = enrollmentFoster;
    }

    public double getEnrollmentFosterPercentage() {
        return enrollmentFosterPercentage;
    }

    public void setEnrollmentFosterPercentage(double enrollmentFosterPercentage) {
        this.enrollmentFosterPercentage = enrollmentFosterPercentage;
    }

    public int getEnrollmentHomeless() {
        return enrollmentHomeless;
    }

    public void setEnrollmentHomeless(int enrollmentHomeless) {
        this.enrollmentHomeless = enrollmentHomeless;
    }

    public double getEnrollmentHomelessPercentage() {
        return enrollmentHomelessPercentage;
    }

    public void setEnrollmentHomelessPercentage(double enrollmentHomelessPercentage) {
        this.enrollmentHomelessPercentage = enrollmentHomelessPercentage;
    }

    public int getEnrollmentMigrants() {
        return enrollmentMigrants;
    }

    public void setEnrollmentMigrants(int enrollmentMigrants) {
        this.enrollmentMigrants = enrollmentMigrants;
    }

    public double getEnrollmentMigrantsPercentage() {
        return enrollmentMigrantsPercentage;
    }

    public void setEnrollmentMigrantsPercentage(double enrollmentMigrantsPercentage) {
        this.enrollmentMigrantsPercentage = enrollmentMigrantsPercentage;
    }

    public int getEnrollmentWithDisabilities() {
        return enrollmentWithDisabilities;
    }

    public void setEnrollmentWithDisabilities(int enrollmentWithDisabilities) {
        this.enrollmentWithDisabilities = enrollmentWithDisabilities;
    }

    public double getEnrollmentWithDisabilitiesPercentage() {
        return enrollmentWithDisabilitiesPercentage;
    }

    public void setEnrollmentWithDisabilitiesPercentage(double enrollmentWithDisabilitiesPercentage) {
        this.enrollmentWithDisabilitiesPercentage = enrollmentWithDisabilitiesPercentage;
    }

    public int getEnrollmentSocioeconomicallyDisadvantaged() {
        return enrollmentSocioeconomicallyDisadvantaged;
    }

    public void setEnrollmentSocioeconomicallyDisadvantaged(int enrollmentSocioeconomicallyDisadvantaged) {
        this.enrollmentSocioeconomicallyDisadvantaged = enrollmentSocioeconomicallyDisadvantaged;
    }

    public double getEnrollmentSocioeconomicallyDisadvantagedPercentage() {
        return enrollmentSocioeconomicallyDisadvantagedPercentage;
    }

    public void setEnrollmentSocioeconomicallyDisadvantagedPercentage(double enrollmentSocioeconomicallyDisadvantagedPercentage) {
        this.enrollmentSocioeconomicallyDisadvantagedPercentage = enrollmentSocioeconomicallyDisadvantagedPercentage;
    }

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
                "White: " + enrollmentWhite + "\t\tWhite(%): " + enrollmentWhitePercentage + "\n" +
                "Multiracial: " + enrollmentMultiracial + "\t\tMultiracial (%): " + enrollmentMultiracialPercentage + "\n" +
                "English Learner: " + enrollmentEnglishLearners + "\t\tEnglish Learner(%): " + enrollmentEnglishLearnersPercentage + "\n" +
                "Foster: " + enrollmentFoster + "\t\tFoster (%): " + enrollmentFosterPercentage + "\n" +
                "Homeless: " + enrollmentHomeless + "\t\tHomeless (%): " + enrollmentHomelessPercentage + "\n" +
                "Migrant: " + enrollmentMigrants + "\t\tMigrant (%): " + enrollmentMigrantsPercentage + "\n" +
                "Socioeconomically Disadvantaged: " + enrollmentSocioeconomicallyDisadvantaged + "\t\tSocioeconomically Disadvantaged (%): " + enrollmentSocioeconomicallyDisadvantagedPercentage + "\n" +
                "Students with Disabilities: " + enrollmentWithDisabilities + "\t\tStudent with Disabilities (%): " + enrollmentWithDisabilitiesPercentage + "\n";
    }

    /**
     * Overwritten equals method that helps determine whether two instances
     * of DistrictArea objects are logically equal
     * @param o The compared instance of DistrictArea object
     * @return A boolean value whether two objects are equal
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof DistrictArea that)) return false;
        return id == that.id && federalID == that.federalID && districtCode == that.districtCode
                && enrollmentTotal == that.enrollmentTotal && enrollmentCharter == that.enrollmentCharter
                && enrollmentNonCharter == that.enrollmentNonCharter && enrollmentAfricanAmerican == that.enrollmentAfricanAmerican
                && Double.compare(enrollmentAfricanAmericanPercentage, that.enrollmentAfricanAmericanPercentage) == 0
                && enrollmentAmericanIndian == that.enrollmentAmericanIndian
                && Double.compare(enrollmentAmericanIndianPercentage, that.enrollmentAmericanIndianPercentage) == 0
                && enrollmentAsian == that.enrollmentAsian && Double.compare(enrollmentAsianPercentage, that.enrollmentAsianPercentage) == 0
                && enrollmentFilipino == that.enrollmentFilipino && Double.compare(enrollmentFilipinoPercentage, that.enrollmentFilipinoPercentage) == 0
                && enrollmentHispanic == that.enrollmentHispanic && Double.compare(enrollmentHispanicPercentage, that.enrollmentHispanicPercentage) == 0
                && enrollmentPacificIslander == that.enrollmentPacificIslander
                && Double.compare(enrollmentPacificIslanderPercentage, that.enrollmentPacificIslanderPercentage) == 0
                && enrollmentWhite == that.enrollmentWhite && Double.compare(enrollmentWhitePercentage, that.enrollmentWhitePercentage) == 0
                && enrollmentMultiracial == that.enrollmentMultiracial
                && Double.compare(enrollmentMultiracialPercentage, that.enrollmentMultiracialPercentage) == 0
                && enrollmentEnglishLearners == that.enrollmentEnglishLearners
                && Double.compare(enrollmentEnglishLearnersPercentage, that.enrollmentEnglishLearnersPercentage) == 0
                && enrollmentFoster == that.enrollmentFoster && Double.compare(enrollmentFosterPercentage, that.enrollmentFosterPercentage) == 0
                && enrollmentHomeless == that.enrollmentHomeless && Double.compare(enrollmentHomelessPercentage, that.enrollmentHomelessPercentage) == 0
                && enrollmentMigrants == that.enrollmentMigrants && Double.compare(enrollmentMigrantsPercentage, that.enrollmentMigrantsPercentage) == 0
                && enrollmentWithDisabilities == that.enrollmentWithDisabilities
                && Double.compare(enrollmentWithDisabilitiesPercentage, that.enrollmentWithDisabilitiesPercentage) == 0
                && enrollmentSocioeconomicallyDisadvantaged == that.enrollmentSocioeconomicallyDisadvantaged
                && Double.compare(enrollmentSocioeconomicallyDisadvantagedPercentage, that.enrollmentSocioeconomicallyDisadvantagedPercentage) == 0
                && Objects.equals(countyName, that.countyName) && Objects.equals(districtName, that.districtName)
                && Objects.equals(districtType, that.districtType) && gradeLevel == that.gradeLevel && geographicalLocale == that.geographicalLocale;
    }

    @Override
    public int compareTo(DistrictArea o) {
        return this.districtName.compareToIgnoreCase(o.districtName);
    }

    public static class DistrictNameComparator implements Comparator<DistrictArea> {
        @Override
        public int compare(DistrictArea a, DistrictArea b) {
            return a.districtName.compareToIgnoreCase(b.districtName);
        }
    }
    
    public static class CountyNameComparator implements Comparator<DistrictArea> {
        @Override
        public int compare(DistrictArea a, DistrictArea b) {
            int countyCompare = a.countyName.compareToIgnoreCase(b.countyName);
            return countyCompare != 0 ? countyCompare : 
                   a.districtName.compareToIgnoreCase(b.districtName);
        }
    }
    
    public static class EnrollmentComparator implements Comparator<DistrictArea> {
        @Override
        public int compare(DistrictArea a, DistrictArea b) {
            return Integer.compare(b.enrollmentTotal, a.enrollmentTotal); 
        }
    }

    /**
     * Helper method that sorts County Names displayed in the corresponding Combo Box.
     */
    private static void sortCountyNameComboBoxItems() {
        FXCollections.sort(
            DistrictAreaController.getInstance().countyNameComboBox.getItems(),
            String.CASE_INSENSITIVE_ORDER
        );
    }

    /**
     * Helper method that sorts Geographical Locales displayed in the corresponding Combo Box.
     */
    private static void sortGeographicalLocaleComboBoxItems() {
        // Delete nulls from the list (for an unknown reason I keep getting nulls in the list)
        DistrictAreaController.getInstance()
            .geographicalLocaleComboBox.getItems().removeIf(Objects::isNull);
        FXCollections.sort(
            DistrictAreaController.getInstance().geographicalLocaleComboBox.getItems()
        );
    }

    /**
     * Helper method that sorts Grade Levels displayed in the corresponding Combo Box.
     */
    private static void sortGradeLevelComboBoxItems() {
        FXCollections.sort(
            DistrictAreaController.getInstance().gradeLevelComboBox.getItems()
        );
    }

    /**
     * An ENUM that represents the Grade Level which the District Area covers. In simple words, each ENUM represents the
     * levels of grade which are offered at a particular District Area.
     * @author Maksym Stesev
     * @date 05/04/2025
     */
    public static enum GradeLevel implements Comparator<GradeLevel> {
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

        /**
         * This method helps determine the Grade Level of a data entry.
         * @param lowGrade String representation of the lower grade level in the data entry.
         * @param highGrade String representation of the higher grade level in the data entry.
         * @return The corresponding enum value of GradeLevel. Returns null if there is no match.
         */
        public static GradeLevel determineGradeLevel(String lowGrade, String highGrade) {
            for (GradeLevel grade : GradeLevel.values()) {
                if (grade.getGradeLow() == Integer.parseInt(lowGrade)
                        && grade.getGradeHigh() == Integer.parseInt(highGrade)) {
                    return grade;
                }
            }

            return null;
        }

        /**
         * Allows comparison of two GradeLevel instances which easies the process of sorting the available entries.
         * @param o1 the first object to be compared.
         * @param o2 the second object to be compared.
         * @return Digits before letters, Alphabetical order.
         */
        @Override
        public int compare(GradeLevel o1, GradeLevel o2) {
            // Looking at first symbol
            boolean isDigit1 = Character.isDigit(o1.toString().charAt(0));
            boolean isDigit2 = Character.isDigit(o2.toString().charAt(0));

            // Digits before letters
            if (isDigit1 && !isDigit2) {
                return -1;
            }

            // Digits after letters
            if (!isDigit1 && isDigit2) {
                return 1;
            }

            // Alphabetical order
            return o1.toString().compareToIgnoreCase(o2.toString());
        }
    }

    /**
     * An ENUM that represents the Geographical Locale of the District Area.
     * @author Maksym Stesev
     * @date 05/04/2025
     */
    public static enum GeographicalLocale implements Comparator<GeographicalLocale> {
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

        // We will need both getters to use them later on in the process of parsing data
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
         * @return The corresponding enum value of GeographicalLocale. Returns null if there is no match.
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

        /**
         * Allows comparison of two GeographicalLocale instances which easies the process of sorting the available entries.
         * @param o1 the first object to be compared.
         * @param o2 the second object to be compared.
         * @return Alphabetical order.
         */
        @Override
        public int compare(GeographicalLocale o1, GeographicalLocale o2) {
            int localeCompare = o1.getLocale().compareToIgnoreCase(o2.getLocale());
            if (localeCompare != 0) {
                return localeCompare;
            }

            return o1.getType().compareToIgnoreCase(o2.getType());
        }

    }
}