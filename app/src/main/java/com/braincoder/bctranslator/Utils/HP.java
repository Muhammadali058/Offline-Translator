package com.braincoder.bctranslator.Utils;

import androidx.annotation.NonNull;

import com.google.mlkit.nl.translate.TranslateLanguage;

public class HP {

    public static String[] languages = new String[]{
        "AFRIKAANS",
        "ALBANIAN",
        "ARABIC",
        "BELARUSIAN",
        "BULGARIAN",
        "BENGALI",
        "CATALAN",
        "CHINESE",
        "CROATIAN",
        "CZECH",
        "DANISH",
        "ENGLISH",
        "DUTCH",
        "ESPERANTO",
        "ESTONIAN",
        "FINNISH",
        "FRENCH",
        "GALICIAN",
        "GEORGIAN",
        "GREEK",
        "GERMAN",
        "GUJARATI",
        "HAITIAN_CREOLE",
        "HEBREW",
        "HINDI",
        "HUNGARIAN",
        "ICELANDIC",
        "INDONESIAN",
        "IRISH",
        "ITALIAN",
        "JAPANESE",
        "KANNADA",
        "KOREAN",
        "LITHUANIAN",
        "LATVIAN",
        "MACEDONIAN",
        "MARATHI",
        "MALAY",
        "MALTESE",
        "NORWEGIAN",
        "PERSIAN",
        "POLISH",
        "PORTUGUESE",
        "ROMANIAN",
        "RUSSIAN",
        "SLOVAK",
        "SLOVENIAN",
        "SPANISH",
        "SWEDISH",
        "SWAHILI",
        "TAGALOG",
        "TAMIL",
        "TELUGU",
        "THAI",
        "TURKISH",
        "UKRAINIAN",
        "URDU",
        "VIETNAMESE",
        "WELSH",
    };

    public static String[] languageCodes = new String[]{
        "af",
        "sq",
        "ar",
        "be",
        "bg",
        "bn",
        "ca",
        "zh",
        "hr",
        "cs",
        "da",
        "en",
        "nl",
        "eo",
        "et",
        "fi",
        "fr",
        "gl",
        "ka",
        "el",
        "de",
        "gu",
        "ht",
        "he",
        "hi",
        "hu",
        "is",
        "id",
        "ga",
        "it",
        "ja",
        "kn",
        "ko",
        "lt",
        "lv",
        "mk",
        "mr",
        "ms",
        "mt",
        "no",
        "fa",
        "pl",
        "pt",
        "ro",
        "ru",
        "sk",
        "sl",
        "es",
        "sv",
        "sw",
        "tl",
        "ta",
        "te",
        "th",
        "tr",
        "uk",
        "ur",
        "vi",
        "cy",
    };

    public static String[] installedLanguages = new String[]{
            "English",
            "Urdu",
    };

    public static String getLanguageCode(String language){
        switch (language){
            case "English":
                return TranslateLanguage.ENGLISH;
            case "Urdu":
                return TranslateLanguage.URDU;
            default:
                return TranslateLanguage.ENGLISH;
        }
    }

}
