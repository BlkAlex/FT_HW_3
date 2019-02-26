import lombok.Getter;

public class InputParameters {

    @Getter
    final static String fileMaleNames = "/resources/MaleNames";
    @Getter
    final static String fileFemaleNames = "/resources/FemaleNames";
    @Getter
    final static String fileMaleSurnames = "/resources/MaleSurnames";
    @Getter
    final static String fileFemaleSurnames = "/resources/FemaleSurnames";
    @Getter
    final static String fileMalePatronymic = "/resources/MalePatronymic";
    @Getter
    final static String fileFemalePatronymic = "/resources/FemalePatronymic";
    @Getter
    final static String fileCountries = "/resources/Countries";
    @Getter
    final static String fileRegions = "/resources/Regions";
    @Getter
    final static String fileTowns = "/resources/Towns";
    @Getter
    final static String fileStreets = "/resources/Streets";

    @Getter
    final static int startRangeMailIndex = 100000;

    @Getter
    final static int endRangeMailIndex = 200000;
}
