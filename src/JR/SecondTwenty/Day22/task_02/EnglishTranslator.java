package JR.SecondTwenty.Day22.task_02;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class EnglishTranslator extends Translator1 {
    @Override
    public String translateText() {
        String lang = getLanguage();
        return lang;
    }

    @Override
    public String getLanguage() {
        String lang = "English";
        return lang;
    }
}
