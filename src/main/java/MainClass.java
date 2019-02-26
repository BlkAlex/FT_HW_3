import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class MainClass {


    public static void main(String[] args) {
        FileLoader fileLoader = new FileLoader();
        int countHumans = Generator.getRandomNumeric(1,30);
        ArrayList<String> maleNames = fileLoader.getListByFileName(InputParameters.getFileMaleNames());
        ArrayList<String> femaleNames = fileLoader.getListByFileName(InputParameters.getFileFemaleNames());
        ArrayList<String> maleSurnames = fileLoader.getListByFileName(InputParameters.getFileMaleSurnames());
        ArrayList<String> femaleSurnames = fileLoader.getListByFileName(InputParameters.getFileFemaleSurnames());
        ArrayList<String> malePatronymics = fileLoader.getListByFileName(InputParameters.getFileMalePatronymic());
        ArrayList<String> femalePatronymics = fileLoader.getListByFileName(InputParameters.getFileFemalePatronymic());
        ArrayList<String> countries = fileLoader.getListByFileName(InputParameters.getFileCountries());
        ArrayList<String> towns = fileLoader.getListByFileName(InputParameters.getFileTowns());
        ArrayList<String> streets = fileLoader.getListByFileName(InputParameters.getFileStreets());
        ArrayList<String> regions = fileLoader.getListByFileName(InputParameters.getFileRegions());


        ArrayList<Human> humans = new ArrayList<Human>();
        for (int i = 0 ; i < countHumans ; i++){
            Human human = new Human();
            //TODO re-generate setters to builder template
            human.setSex(Generator.getRandomSex());
            human.setName(Generator.getRandomStringFromList((human.getSex()== SEX.MALE)?maleNames:femaleNames));
            human.setSurname(Generator.getRandomStringFromList((human.getSex() == SEX.MALE)?maleSurnames:femaleSurnames));
            human.setPatronymic(Generator.getRandomStringFromList((human.getSex() == SEX.MALE)?malePatronymics:femalePatronymics));
            human.setCountry(Generator.getRandomStringFromList(countries));
            human.setRegion(Generator.getRandomStringFromList(regions));
            human.setTown(Generator.getRandomStringFromList(towns));
            human.setStreet(Generator.getRandomStringFromList(streets));
            human.setBithdayDate(Generator.getRandomDate());
            human.setAge(Generator.getAgeByDate(human.getBithdayDate()));
            human.setInn(Generator.getRandomINN());
            human.setMailIndex(Generator.getRandomNumeric(InputParameters.getStartRangeMailIndex(),InputParameters.getEndRangeMailIndex()));
            human.setNumberHouse(Generator.getRandomNumberHouse());
            human.setNumberFlat(Generator.getRandomNumeric(1));
            humans.add(human);
        }

        ExcelCreator excelCreator = new ExcelCreator(humans);
        PdfCreator pdfCreator = new PdfCreator(humans);
    }
    MainClass(){


    }
}
